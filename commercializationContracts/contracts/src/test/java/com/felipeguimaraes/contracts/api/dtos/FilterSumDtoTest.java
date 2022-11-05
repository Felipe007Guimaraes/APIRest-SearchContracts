package com.felipeguimaraes.contracts.api.dtos;

import com.felipeguimaraes.contracts.api.entities.Contract;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterSumDtoTest {

    @Test
    void testConstructor() {
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
        FilterSumDto actualFilterSumDto = new FilterSumDto(contract);
        assertEquals("Ano Emissao", actualFilterSumDto.getAnoEmissao());
        assertEquals(10.0d, actualFilterSumDto.getVlCusteio());
        assertEquals("SOJA", actualFilterSumDto.getNomeProduto());
        assertEquals("Municipio", actualFilterSumDto.getMunicipio());
        assertEquals(123L, actualFilterSumDto.getId().longValue());
        assertEquals("6720", actualFilterSumDto.getCodProduto());
        assertEquals("Cod Cad Mu", actualFilterSumDto.getCodCadMu());
    }

}