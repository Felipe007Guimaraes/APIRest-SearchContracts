package com.felipeguimaraes.contracts.api.services;

import com.felipeguimaraes.contracts.api.entities.Contract;
import com.felipeguimaraes.contracts.api.repositories.ContractRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {ContractsService.class})
@ExtendWith(SpringExtension.class)
class ContractsServiceTest {

    @MockBean
    private ContractRepository contractRepository;

    @Autowired
    private ContractsService contractsService;

    @Test
    @Disabled("TODO: Complete this test")
    void testSeekContracts() {
        contractsService.seekContracts();
    }

    @Test
    void testSave() {
        Contract contract = new Contract();
        contract.setAnoEmissao("Ano Emissao");
        contract.setAreaCusteio(10.0d);
        contract.setAtividade("Atividade");
        contract.setCdEstado("Cd Estado");
        contract.setCdFonteRecurso("Cd Fonte Recurso");
        contract.setCdModalidade("Cd Modalidade");
        contract.setCdProduto("6720");
        contract.setCdPrograma("Cd Programa");
        contract.setCdSubPrograma("Cd Sub Programa");
        contract.setCdTipoSeguro("Cd Tipo Seguro");
        contract.setCodCadMu("Cod Cad Mu");
        contract.setCodIbge("Cod Ibge");
        contract.setId(123L);
        contract.setMesEmissao("Mes Emissao");
        contract.setMunicipio("Municipio");
        contract.setNomeProduto("SOJA");
        contract.setVlCusteio(10.0d);
        when(contractRepository.save((Contract) any())).thenReturn(contract);

        Contract contract1 = new Contract();
        contract1.setAnoEmissao("Ano Emissao");
        contract1.setAreaCusteio(10.0d);
        contract1.setAtividade("Atividade");
        contract1.setCdEstado("Cd Estado");
        contract1.setCdFonteRecurso("Cd Fonte Recurso");
        contract1.setCdModalidade("Cd Modalidade");
        contract1.setCdProduto("6720");
        contract1.setCdPrograma("Cd Programa");
        contract1.setCdSubPrograma("Cd Sub Programa");
        contract1.setCdTipoSeguro("Cd Tipo Seguro");
        contract1.setCodCadMu("Cod Cad Mu");
        contract1.setCodIbge("Cod Ibge");
        contract1.setId(123L);
        contract1.setMesEmissao("Mes Emissao");
        contract1.setMunicipio("Municipio");
        contract1.setNomeProduto("SOJA");
        contract1.setVlCusteio(10.0d);
        assertSame(contract, contractsService.save(contract1));
        verify(contractRepository).save((Contract) any());
    }

    @Test
    void testSearchById() {
        Contract contract = new Contract();
        contract.setAnoEmissao("Ano Emissao");
        contract.setAreaCusteio(10.0d);
        contract.setAtividade("Atividade");
        contract.setCdEstado("Cd Estado");
        contract.setCdFonteRecurso("Cd Fonte Recurso");
        contract.setCdModalidade("Cd Modalidade");
        contract.setCdProduto("6720");
        contract.setCdPrograma("Cd Programa");
        contract.setCdSubPrograma("Cd Sub Programa");
        contract.setCdTipoSeguro("Cd Tipo Seguro");
        contract.setCodCadMu("Cod Cad Mu");
        contract.setCodIbge("Cod Ibge");
        contract.setId(123L);
        contract.setMesEmissao("Mes Emissao");
        contract.setMunicipio("Municipio");
        contract.setNomeProduto("SOJA");
        contract.setVlCusteio(10.0d);
        Optional<Contract> ofResult = Optional.of(contract);
        when(contractRepository.findById((Long) any())).thenReturn(ofResult);
        Optional<Contract> actualSearchByIdResult = contractsService.searchById(123L);
        assertSame(ofResult, actualSearchByIdResult);
        assertTrue(actualSearchByIdResult.isPresent());
        verify(contractRepository).findById((Long) any());
    }

    @Test
    void testDeteteById() {
        doNothing().when(contractRepository).deleteById((Long) any());
        contractsService.deteteById(123L);
        verify(contractRepository).deleteById((Long) any());
    }

    @Test
    void testListAll() {
        PageImpl<Contract> pageImpl = new PageImpl<>(new ArrayList<>());
        when(contractRepository.findAll((Pageable) any())).thenReturn(pageImpl);
        Page<Contract> actualListAllResult = contractsService.listAll(null);
        assertSame(pageImpl, actualListAllResult);
        assertTrue(actualListAllResult.toList().isEmpty());
        verify(contractRepository).findAll((Pageable) any());
    }

    @Test
    void testByYear() {
        when(contractRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(contractsService.byYear("Ano Emissao").isEmpty());
        verify(contractRepository).findAll();
    }

    @Test
    void testByYear2() {
        Contract contract = new Contract();
        contract.setAnoEmissao("Ano Emissao");
        contract.setAreaCusteio(10.0d);
        contract.setAtividade("Atividade");
        contract.setCdEstado("Cd Estado");
        contract.setCdFonteRecurso("Cd Fonte Recurso");
        contract.setCdModalidade("Cd Modalidade");
        contract.setCdProduto("alice.liddell@example.org");
        contract.setCdPrograma("Cd Programa");
        contract.setCdSubPrograma("Cd Sub Programa");
        contract.setCdTipoSeguro("Cd Tipo Seguro");
        contract.setCodCadMu("Cod Cad Mu");
        contract.setCodIbge("Cod Ibge");
        contract.setId(123L);
        contract.setMesEmissao("Mes Emissao");
        contract.setMunicipio("Municipio");
        contract.setNomeProduto("alice.liddell@example.org");
        contract.setVlCusteio(10.0d);

        ArrayList<Contract> contractList = new ArrayList<>();
        contractList.add(contract);
        when(contractRepository.findAll()).thenReturn(contractList);
        assertTrue(contractsService.byYear("Ano Emissao").isEmpty());
        verify(contractRepository).findAll();
    }

    @Test
    void testByYear3() {
        Contract contract = mock(Contract.class);
        when(contract.getVlCusteio()).thenReturn(10.0d);
        when(contract.getAnoEmissao()).thenReturn("foo");
        when(contract.getCdProduto()).thenReturn("alice.liddell@example.org");
        when(contract.getCodCadMu()).thenReturn("Cod Cad Mu");
        when(contract.getMunicipio()).thenReturn("Municipio");
        when(contract.getNomeProduto()).thenReturn("alice.liddell@example.org");
        doNothing().when(contract).setAnoEmissao((String) any());
        doNothing().when(contract).setAreaCusteio(anyDouble());
        doNothing().when(contract).setAtividade((String) any());
        doNothing().when(contract).setCdEstado((String) any());
        doNothing().when(contract).setCdFonteRecurso((String) any());
        doNothing().when(contract).setCdModalidade((String) any());
        doNothing().when(contract).setCdProduto((String) any());
        doNothing().when(contract).setCdPrograma((String) any());
        doNothing().when(contract).setCdSubPrograma((String) any());
        doNothing().when(contract).setCdTipoSeguro((String) any());
        doNothing().when(contract).setCodCadMu((String) any());
        doNothing().when(contract).setCodIbge((String) any());
        doNothing().when(contract).setId((Long) any());
        doNothing().when(contract).setMesEmissao((String) any());
        doNothing().when(contract).setMunicipio((String) any());
        doNothing().when(contract).setNomeProduto((String) any());
        doNothing().when(contract).setVlCusteio(anyDouble());
        contract.setAnoEmissao("Ano Emissao");
        contract.setAreaCusteio(10.0d);
        contract.setAtividade("Atividade");
        contract.setCdEstado("Cd Estado");
        contract.setCdFonteRecurso("Cd Fonte Recurso");
        contract.setCdModalidade("Cd Modalidade");
        contract.setCdProduto("alice.liddell@example.org");
        contract.setCdPrograma("Cd Programa");
        contract.setCdSubPrograma("Cd Sub Programa");
        contract.setCdTipoSeguro("Cd Tipo Seguro");
        contract.setCodCadMu("Cod Cad Mu");
        contract.setCodIbge("Cod Ibge");
        contract.setId(123L);
        contract.setMesEmissao("Mes Emissao");
        contract.setMunicipio("Municipio");
        contract.setNomeProduto("alice.liddell@example.org");
        contract.setVlCusteio(10.0d);

        ArrayList<Contract> contractList = new ArrayList<>();
        contractList.add(contract);
        when(contractRepository.findAll()).thenReturn(contractList);
        assertTrue(contractsService.byYear("Ano Emissao").isEmpty());
        verify(contractRepository).findAll();
        verify(contract).getVlCusteio();
        verify(contract).getAnoEmissao();
        verify(contract).getCdProduto();
        verify(contract).getCodCadMu();
        verify(contract).getMunicipio();
        verify(contract).getNomeProduto();
        verify(contract).setAnoEmissao((String) any());
        verify(contract).setAreaCusteio(anyDouble());
        verify(contract).setAtividade((String) any());
        verify(contract).setCdEstado((String) any());
        verify(contract).setCdFonteRecurso((String) any());
        verify(contract).setCdModalidade((String) any());
        verify(contract).setCdProduto((String) any());
        verify(contract).setCdPrograma((String) any());
        verify(contract).setCdSubPrograma((String) any());
        verify(contract).setCdTipoSeguro((String) any());
        verify(contract).setCodCadMu((String) any());
        verify(contract).setCodIbge((String) any());
        verify(contract).setId((Long) any());
        verify(contract).setMesEmissao((String) any());
        verify(contract).setMunicipio((String) any());
        verify(contract).setNomeProduto((String) any());
        verify(contract).setVlCusteio(anyDouble());
    }

}