package com.felipeguimaraes.contracts.api.dtos;

import com.felipeguimaraes.contracts.api.entities.Contract;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ResponseConverterDtoTest {

    @Test
    void testConvertToInvest() {
        Contract actualConvertToInvestResult = ResponseConverterDto
                .convertToInvest(new APIResponseDto("Municipio", "SOJA", "Mes Emissao", "Ano Emissao",
                        "Cd Programa", "Cd Sub Programa", "Cd Fonte Recurso", "Cd Tipo Seguro", "Cd Estado", 1,
                        "6720", "Cod Cad Mu", "Atividade", "Cd Modalidade", "Cod Ibge", 1));
        assertEquals("Ano Emissao", actualConvertToInvestResult.getAnoEmissao());
        assertEquals(1.0d, actualConvertToInvestResult.getVlCusteio());
        assertEquals("SOJA", actualConvertToInvestResult.getNomeProduto());
        assertEquals("Municipio", actualConvertToInvestResult.getMunicipio());
        assertEquals("Mes Emissao", actualConvertToInvestResult.getMesEmissao());
        assertNull(actualConvertToInvestResult.getId());
        assertEquals("Cod Ibge", actualConvertToInvestResult.getCodIbge());
        assertEquals("Cod Cad Mu", actualConvertToInvestResult.getCodCadMu());
        assertEquals("Cd Tipo Seguro", actualConvertToInvestResult.getCdTipoSeguro());
        assertEquals("Cd Sub Programa", actualConvertToInvestResult.getCdSubPrograma());
        assertEquals("Cd Programa", actualConvertToInvestResult.getCdPrograma());
        assertEquals("6720", actualConvertToInvestResult.getCdProduto());
        assertEquals("Cd Modalidade", actualConvertToInvestResult.getCdModalidade());
        assertEquals("Cd Fonte Recurso", actualConvertToInvestResult.getCdFonteRecurso());
        assertEquals("Cd Estado", actualConvertToInvestResult.getCdEstado());
        assertEquals("Atividade", actualConvertToInvestResult.getAtividade());
        assertEquals(1.0d, actualConvertToInvestResult.getAreaCusteio());
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testConvertToInvest2() {
        ResponseConverterDto.convertToInvest(null);
    }

}