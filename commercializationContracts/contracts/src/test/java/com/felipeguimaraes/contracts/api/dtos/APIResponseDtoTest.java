package com.felipeguimaraes.contracts.api.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class APIResponseDtoTest {

    @Test
    void testConstructor() {
        APIResponseDto actualApiResponseDto = new APIResponseDto();
        actualApiResponseDto.setAnoEmissao("Ano Emissao");
        actualApiResponseDto.setAreaCusteio(1);
        actualApiResponseDto.setAtividade("Atividade");
        actualApiResponseDto.setCdEstado("Cd Estado");
        actualApiResponseDto.setCdFonteRecurso("Cd Fonte Recurso");
        actualApiResponseDto.setCdModalidade("Cd Modalidade");
        actualApiResponseDto.setCdProduto("alice.liddell@example.org");
        actualApiResponseDto.setCdPrograma("Cd Programa");
        actualApiResponseDto.setCdSubPrograma("Cd Sub Programa");
        actualApiResponseDto.setCdTipoSeguro("Cd Tipo Seguro");
        actualApiResponseDto.setCodCadMu("Cod Cad Mu");
        actualApiResponseDto.setCodIbge("Cod Ibge");
        actualApiResponseDto.setMesEmissao("Mes Emissao");
        actualApiResponseDto.setMunicipio("Municipio");
        actualApiResponseDto.setNomeProduto("alice.liddell@example.org");
        actualApiResponseDto.setVlCusteio(1);
        String actualToStringResult = actualApiResponseDto.toString();
        assertEquals("Ano Emissao", actualApiResponseDto.getAnoEmissao());
        assertEquals(1, actualApiResponseDto.getAreaCusteio());
        assertEquals("Atividade", actualApiResponseDto.getAtividade());
        assertEquals("Cd Estado", actualApiResponseDto.getCdEstado());
        assertEquals("Cd Fonte Recurso", actualApiResponseDto.getCdFonteRecurso());
        assertEquals("Cd Modalidade", actualApiResponseDto.getCdModalidade());
        assertEquals("alice.liddell@example.org", actualApiResponseDto.getCdProduto());
        assertEquals("Cd Programa", actualApiResponseDto.getCdPrograma());
        assertEquals("Cd Sub Programa", actualApiResponseDto.getCdSubPrograma());
        assertEquals("Cd Tipo Seguro", actualApiResponseDto.getCdTipoSeguro());
        assertEquals("Cod Cad Mu", actualApiResponseDto.getCodCadMu());
        assertEquals("Cod Ibge", actualApiResponseDto.getCodIbge());
        assertEquals("Mes Emissao", actualApiResponseDto.getMesEmissao());
        assertEquals("Municipio", actualApiResponseDto.getMunicipio());
        assertEquals("alice.liddell@example.org", actualApiResponseDto.getNomeProduto());
        assertEquals(1, actualApiResponseDto.getVlCusteio());
        assertEquals("APIResponseDto(municipio=Municipio, nomeProduto=alice.liddell@example.org, mesEmissao=Mes Emissao,"
                + " anoEmissao=Ano Emissao, cdPrograma=Cd Programa, cdSubPrograma=Cd Sub Programa, cdFonteRecurso=Cd Fonte"
                + " Recurso, cdTipoSeguro=Cd Tipo Seguro, cdEstado=Cd Estado, vlCusteio=1, cdProduto=alice.liddell@example.org,"
                + " codCadMu=Cod Cad Mu, atividade=Atividade, cdModalidade=Cd Modalidade, codIbge=Cod Ibge, areaCusteio"
                + "=1)", actualToStringResult);
    }


    @Test
    void testConstructor2() {
        APIResponseDto actualApiResponseDto = new APIResponseDto("Municipio", "alice.liddell@example.org", "Mes Emissao",
                "Ano Emissao", "Cd Programa", "Cd Sub Programa", "Cd Fonte Recurso", "Cd Tipo Seguro", "Cd Estado", 1,
                "alice.liddell@example.org", "Cod Cad Mu", "Atividade", "Cd Modalidade", "Cod Ibge", 1);
        actualApiResponseDto.setAnoEmissao("Ano Emissao");
        actualApiResponseDto.setAreaCusteio(1);
        actualApiResponseDto.setAtividade("Atividade");
        actualApiResponseDto.setCdEstado("Cd Estado");
        actualApiResponseDto.setCdFonteRecurso("Cd Fonte Recurso");
        actualApiResponseDto.setCdModalidade("Cd Modalidade");
        actualApiResponseDto.setCdProduto("alice.liddell@example.org");
        actualApiResponseDto.setCdPrograma("Cd Programa");
        actualApiResponseDto.setCdSubPrograma("Cd Sub Programa");
        actualApiResponseDto.setCdTipoSeguro("Cd Tipo Seguro");
        actualApiResponseDto.setCodCadMu("Cod Cad Mu");
        actualApiResponseDto.setCodIbge("Cod Ibge");
        actualApiResponseDto.setMesEmissao("Mes Emissao");
        actualApiResponseDto.setMunicipio("Municipio");
        actualApiResponseDto.setNomeProduto("alice.liddell@example.org");
        actualApiResponseDto.setVlCusteio(1);
        String actualToStringResult = actualApiResponseDto.toString();
        assertEquals("Ano Emissao", actualApiResponseDto.getAnoEmissao());
        assertEquals(1, actualApiResponseDto.getAreaCusteio());
        assertEquals("Atividade", actualApiResponseDto.getAtividade());
        assertEquals("Cd Estado", actualApiResponseDto.getCdEstado());
        assertEquals("Cd Fonte Recurso", actualApiResponseDto.getCdFonteRecurso());
        assertEquals("Cd Modalidade", actualApiResponseDto.getCdModalidade());
        assertEquals("alice.liddell@example.org", actualApiResponseDto.getCdProduto());
        assertEquals("Cd Programa", actualApiResponseDto.getCdPrograma());
        assertEquals("Cd Sub Programa", actualApiResponseDto.getCdSubPrograma());
        assertEquals("Cd Tipo Seguro", actualApiResponseDto.getCdTipoSeguro());
        assertEquals("Cod Cad Mu", actualApiResponseDto.getCodCadMu());
        assertEquals("Cod Ibge", actualApiResponseDto.getCodIbge());
        assertEquals("Mes Emissao", actualApiResponseDto.getMesEmissao());
        assertEquals("Municipio", actualApiResponseDto.getMunicipio());
        assertEquals("alice.liddell@example.org", actualApiResponseDto.getNomeProduto());
        assertEquals(1, actualApiResponseDto.getVlCusteio());
        assertEquals("APIResponseDto(municipio=Municipio, nomeProduto=alice.liddell@example.org, mesEmissao=Mes Emissao,"
                + " anoEmissao=Ano Emissao, cdPrograma=Cd Programa, cdSubPrograma=Cd Sub Programa, cdFonteRecurso=Cd Fonte"
                + " Recurso, cdTipoSeguro=Cd Tipo Seguro, cdEstado=Cd Estado, vlCusteio=1, cdProduto=alice.liddell@example.org,"
                + " codCadMu=Cod Cad Mu, atividade=Atividade, cdModalidade=Cd Modalidade, codIbge=Cod Ibge, areaCusteio"
                + "=1)", actualToStringResult);
    }

}