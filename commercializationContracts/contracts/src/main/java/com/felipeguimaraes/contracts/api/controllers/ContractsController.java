package com.felipeguimaraes.contracts.api.controllers;

import com.felipeguimaraes.contracts.api.dtos.APIResponseDto;
import com.felipeguimaraes.contracts.api.dtos.ResponseConverterDto;
import com.felipeguimaraes.contracts.api.entities.Contract;
import com.felipeguimaraes.contracts.api.repositories.ContractRepository;
import com.felipeguimaraes.contracts.api.services.ContractsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contracts")
@Api(value = "COMMERCIALIZATION CONTRACTS")
@CrossOrigin(origins = "*")
public class ContractsController {

    @Autowired
    ContractsService contractsService;

    @Autowired
    ContractRepository contractRepository;

    @Autowired
    private ModelMapper modelMapper;

    public int cont = 0;
    @GetMapping("/init")
    public ResponseEntity<List<APIResponseDto>> onboarding() {
        if( cont > 0){
            throw new RuntimeException("already started");
        }
        else{
            List<APIResponseDto> result = contractsService.seekContracts();
            for (APIResponseDto response : result) {
                Contract contract = ResponseConverterDto.convertToInvest(response);

                contractRepository.save(contract);
                cont +=1;
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contract save(@RequestBody Contract contract){
        return contractsService.save(contract);
    }

    @GetMapping
    @ApiOperation(value = "Return list of contracts")
    @ResponseStatus(HttpStatus.OK)
    public Page<Contract> contractList(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return contractsService.listAll(pageable);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Return contract by id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Contract> searchContractById(@PathVariable("id") Long id){
        return contractsService.searchById(id);
    }

    @GetMapping("/ano/{anoEmissao}")
    @ApiOperation(value = "Returns sum of contracts per year")
    public Map<String,Map<String,Double>> listaAll(@PathVariable("anoEmissao") String anoEmissao) {
        return contractsService.byYear(anoEmissao);

    }


    @PutMapping("/{id}")
    @ApiOperation(value = "Update contract by id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateContract(@PathVariable("id") Long id,@RequestBody Contract contract){
        contractsService.searchById(id)
                .map(ContractBase ->{
                    modelMapper.map(contract,ContractBase);
                    contractsService.save(ContractBase);
                    return Void.TYPE;
                });

    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete contract by id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeContract(@PathVariable("id") Long id){
        contractsService.searchById(id)
                .map(Contract ->{
                    contractsService.deteteById(Contract.getId());
                    return Void.TYPE;
                });
    }


}




