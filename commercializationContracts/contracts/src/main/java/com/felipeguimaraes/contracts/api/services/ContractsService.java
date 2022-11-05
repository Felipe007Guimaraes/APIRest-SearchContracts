package com.felipeguimaraes.contracts.api.services;

import com.felipeguimaraes.contracts.api.dtos.APIResponseDto;
import com.felipeguimaraes.contracts.api.dtos.APIResponseListDto;
import com.felipeguimaraes.contracts.api.dtos.FilterSumDto;
import com.felipeguimaraes.contracts.api.entities.Contract;
import com.felipeguimaraes.contracts.api.repositories.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.*;
import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ContractsService {

    private final ContractRepository contractRepository;

    public List<APIResponseDto> seekContracts() {
        return new RestTemplate().getForEntity(
                "https://olinda.bcb.gov.br/olinda/servico/SICOR/versao/v2/odata/CusteioMunicipioProduto?%24format=json&$top=1000",
                APIResponseListDto.class).getBody().getValue();
    }

    public Contract save(Contract contract) {
        return contractRepository.save(contract);
    }

    public Optional<Contract> searchById(Long id) {
        return contractRepository.findById(id);
    }

    public void deteteById(Long id) {
        contractRepository.deleteById(id);
    }

    public Page<Contract> listAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    public Map<String, Map<String, Double>> byYear(String anoEmissao) {
        List<Contract> list = contractRepository.findAll();
        List<FilterSumDto> sumList = new ArrayList<>();
        Map<String, List<String>> municipios = new HashMap<>();

        for (Contract contract : list) {
            var sum = new FilterSumDto();
            sum.setAnoEmissao(contract.getAnoEmissao());
            sum.setMunicipio(contract.getMunicipio());
            sum.setNomeProduto(contract.getNomeProduto());
            sum.setCodCadMu(contract.getCodCadMu());
            sum.setCodProduto(contract.getCdProduto());
            sum.setVlCusteio(contract.getVlCusteio());
            String product = sum.getCodProduto();
            String date = sum.getAnoEmissao();
            if ((anoEmissao.equals(date)) && (product.equals("6720") || product.equals("1840") || product.equals("5080") || product.equals("7100") || product.equals("3560"))) {
                sumList.add(sum);
                if (!municipios.containsKey(sum.getMunicipio())) {
                    municipios.put(sum.getMunicipio(), new ArrayList<>());
                }
                municipios.get(sum.getMunicipio()).add(sum.getCodProduto());
            }}
        Map<Object, Map<Object, List<FilterSumDto>>> group = sumList.stream().collect(
                Collectors.groupingBy(FilterSumDto::getMunicipio,
                        Collectors.groupingBy(FilterSumDto::getCodProduto)));

        Map<String, Map<String, Double>> sumContracts = new HashMap<>();

        municipios.keySet().forEach(municipio -> {
            municipios.get(municipio).forEach(ano -> {
                Map<Object, List<FilterSumDto>> objectMap = group.get(municipio);
                if (Objects.nonNull(objectMap) && !objectMap.isEmpty()){
                    Double soma = objectMap.get(ano).stream().map(FilterSumDto::getVlCusteio)
                            .mapToDouble(Double::doubleValue).sum();

                    if (!sumContracts.containsKey(municipio)) {
                        sumContracts.put(municipio, new HashMap<>());
                    }
                    sumContracts.get(municipio).put(ano, soma);
                }
            });
        });
        return sumContracts;
    }
}

