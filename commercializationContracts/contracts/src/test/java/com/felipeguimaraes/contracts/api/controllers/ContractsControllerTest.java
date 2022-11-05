package com.felipeguimaraes.contracts.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.felipeguimaraes.contracts.api.entities.Contract;
import com.felipeguimaraes.contracts.api.repositories.ContractRepository;
import com.felipeguimaraes.contracts.api.services.ContractsService;

import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {ContractsController.class})
@ExtendWith(SpringExtension.class)
class ContractsControllerTest {

    @MockBean
    private ContractRepository contractRepository;

    @Autowired
    private ContractsController contractsController;

    @MockBean
    private ContractsService contractsService;

    @MockBean
    private ModelMapper modelMapper;

    @Test
    @Disabled("TODO: Complete this test")
    void testOnboarding() {

        (new ContractsController()).onboarding();
    }

    @Test
    void testOnboarding2() {

        ContractsController contractsController = new ContractsController();
        contractsController.cont = 1;
        assertThrows(RuntimeException.class, () -> contractsController.onboarding());
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testSave() {
        ContractsController contractsController = new ContractsController();

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
        contractsController.save(contract);
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testSave2() {

        ContractsController contractsController = new ContractsController();
        Contract contract = mock(Contract.class);
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
        contractsController.save(contract);
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testContractList() {
        (new ContractsController()).contractList(null);
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testContractList2() {
        (new ContractsController()).contractList(null);
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testContractList3() {
        (new ContractsController()).contractList(null);
    }

    @Test
    void testListaAll() throws Exception {
        when(contractsService.byYear((String) any())).thenReturn(new HashMap<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/contracts/ano/{anoEmissao}",
                "Ano Emissao");
        MockMvcBuilders.standaloneSetup(contractsController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{}"));
    }

    @Test
    void testRemoveContract() throws Exception {
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
        contract.setNomeProduto("SOJAg");
        contract.setVlCusteio(10.0d);
        Optional<Contract> ofResult = Optional.of(contract);
        doNothing().when(contractsService).deteteById((Long) any());
        when(contractsService.searchById((Long) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/contracts/{id}", 123L);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(contractsController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    @Test
    void testRemoveContract2() throws Exception {
        doNothing().when(contractsService).deteteById((Long) any());
        when(contractsService.searchById((Long) any())).thenReturn(Optional.empty());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/contracts/{id}", 123L);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(contractsController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    @Test
    void testSearchContractById() throws Exception {
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
        when(contractsService.searchById((Long) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/contracts/{id}", 123L);
        MockMvcBuilders.standaloneSetup(contractsController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":123,\"municipio\":\"Municipio\",\"nomeProduto\":\"SOJA\",\"mesEmissao\":\"Mes"
                                        + " Emissao\",\"anoEmissao\":\"Ano Emissao\",\"cdPrograma\":\"Cd Programa\",\"cdSubPrograma\":\"Cd Sub Programa\","
                                        + "\"cdFonteRecurso\":\"Cd Fonte Recurso\",\"cdTipoSeguro\":\"Cd Tipo Seguro\",\"cdEstado\":\"Cd Estado\",\"vlCusteio"
                                        + "\":10.0,\"cdProduto\":\"6720\",\"codCadMu\":\"Cod Cad Mu\",\"atividade\":\"Atividade\","
                                        + "\"cdModalidade\":\"Cd Modalidade\",\"codIbge\":\"Cod Ibge\",\"areaCusteio\":10.0}"));
    }

    @Test
    void testUpdateContract() throws Exception {
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
        Optional<Contract> ofResult = Optional.of(contract);

        Contract contract1 = new Contract();
        contract1.setAnoEmissao("Ano Emissao");
        contract1.setAreaCusteio(10.0d);
        contract1.setAtividade("Atividade");
        contract1.setCdEstado("Cd Estado");
        contract1.setCdFonteRecurso("Cd Fonte Recurso");
        contract1.setCdModalidade("Cd Modalidade");
        contract1.setCdProduto("alice.liddell@example.org");
        contract1.setCdPrograma("Cd Programa");
        contract1.setCdSubPrograma("Cd Sub Programa");
        contract1.setCdTipoSeguro("Cd Tipo Seguro");
        contract1.setCodCadMu("Cod Cad Mu");
        contract1.setCodIbge("Cod Ibge");
        contract1.setId(123L);
        contract1.setMesEmissao("Mes Emissao");
        contract1.setMunicipio("Municipio");
        contract1.setNomeProduto("alice.liddell@example.org");
        contract1.setVlCusteio(10.0d);
        when(contractsService.save((Contract) any())).thenReturn(contract1);
        when(contractsService.searchById((Long) any())).thenReturn(ofResult);
        doNothing().when(modelMapper).map((Object) any(), (Object) any());

        Contract contract2 = new Contract();
        contract2.setAnoEmissao("Ano Emissao");
        contract2.setAreaCusteio(10.0d);
        contract2.setAtividade("Atividade");
        contract2.setCdEstado("Cd Estado");
        contract2.setCdFonteRecurso("Cd Fonte Recurso");
        contract2.setCdModalidade("Cd Modalidade");
        contract2.setCdProduto("alice.liddell@example.org");
        contract2.setCdPrograma("Cd Programa");
        contract2.setCdSubPrograma("Cd Sub Programa");
        contract2.setCdTipoSeguro("Cd Tipo Seguro");
        contract2.setCodCadMu("Cod Cad Mu");
        contract2.setCodIbge("Cod Ibge");
        contract2.setId(123L);
        contract2.setMesEmissao("Mes Emissao");
        contract2.setMunicipio("Municipio");
        contract2.setNomeProduto("alice.liddell@example.org");
        contract2.setVlCusteio(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(contract2);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/contracts/{id}", 123L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(contractsController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    @Test
    void testUpdateContract2() throws Exception {
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
        when(contractsService.save((Contract) any())).thenReturn(contract);
        when(contractsService.searchById((Long) any())).thenReturn(Optional.empty());
        doNothing().when(modelMapper).map((Object) any(), (Object) any());

        Contract contract1 = new Contract();
        contract1.setAnoEmissao("Ano Emissao");
        contract1.setAreaCusteio(10.0d);
        contract1.setAtividade("Atividade");
        contract1.setCdEstado("Cd Estado");
        contract1.setCdFonteRecurso("Cd Fonte Recurso");
        contract1.setCdModalidade("Cd Modalidade");
        contract1.setCdProduto("alice.liddell@example.org");
        contract1.setCdPrograma("Cd Programa");
        contract1.setCdSubPrograma("Cd Sub Programa");
        contract1.setCdTipoSeguro("Cd Tipo Seguro");
        contract1.setCodCadMu("Cod Cad Mu");
        contract1.setCodIbge("Cod Ibge");
        contract1.setId(123L);
        contract1.setMesEmissao("Mes Emissao");
        contract1.setMunicipio("Municipio");
        contract1.setNomeProduto("alice.liddell@example.org");
        contract1.setVlCusteio(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(contract1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/contracts/{id}", 123L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(contractsController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent());
    }

}