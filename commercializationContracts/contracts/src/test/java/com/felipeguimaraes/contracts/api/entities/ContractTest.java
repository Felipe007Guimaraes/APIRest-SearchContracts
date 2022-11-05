package com.felipeguimaraes.contracts.api.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContractTest {

    @Test
    void testConstructor() {
        Contract actualContract = new Contract();
        actualContract.setAnoEmissao("Ano Emissao");
        actualContract.setAreaCusteio(10.0d);
        actualContract.setAtividade("Atividade");
        actualContract.setCdEstado("Cd Estado");
        actualContract.setCdFonteRecurso("Cd Fonte Recurso");
        actualContract.setCdModalidade("Cd Modalidade");
        actualContract.setCdProduto("6720");
        actualContract.setCdPrograma("Cd Programa");
        actualContract.setCdSubPrograma("Cd Sub Programa");
        actualContract.setCdTipoSeguro("Cd Tipo Seguro");
        actualContract.setCodCadMu("Cod Cad Mu");
        actualContract.setCodIbge("Cod Ibge");
        actualContract.setId(123L);
        actualContract.setMesEmissao("Mes Emissao");
        actualContract.setMunicipio("Municipio");
        actualContract.setNomeProduto("SOJA");
        actualContract.setVlCusteio(10.0d);
        assertEquals("Ano Emissao", actualContract.getAnoEmissao());
        assertEquals(10.0d, actualContract.getAreaCusteio());
        assertEquals("Atividade", actualContract.getAtividade());
        assertEquals("Cd Estado", actualContract.getCdEstado());
        assertEquals("Cd Fonte Recurso", actualContract.getCdFonteRecurso());
        assertEquals("Cd Modalidade", actualContract.getCdModalidade());
        assertEquals("6720", actualContract.getCdProduto());
        assertEquals("Cd Programa", actualContract.getCdPrograma());
        assertEquals("Cd Sub Programa", actualContract.getCdSubPrograma());
        assertEquals("Cd Tipo Seguro", actualContract.getCdTipoSeguro());
        assertEquals("Cod Cad Mu", actualContract.getCodCadMu());
        assertEquals("Cod Ibge", actualContract.getCodIbge());
        assertEquals(123L, actualContract.getId().longValue());
        assertEquals("Mes Emissao", actualContract.getMesEmissao());
        assertEquals("Municipio", actualContract.getMunicipio());
        assertEquals("SOJA", actualContract.getNomeProduto());
        assertEquals(10.0d, actualContract.getVlCusteio());
    }

    @Test
    void testConstructor2() {
        Contract actualContract = new Contract(123L, "Municipio", "SOJA", "Mes Emissao", "Ano Emissao",
                "Cd Programa", "Cd Sub Programa", "Cd Fonte Recurso", "Cd Tipo Seguro", "Cd Estado", 10.0d,
                "6720", "Cod Cad Mu", "Atividade", "Cd Modalidade", "Cod Ibge", 10.0d);

        assertEquals("Ano Emissao", actualContract.getAnoEmissao());
        assertEquals(10.0d, actualContract.getVlCusteio());
        assertEquals("SOJA", actualContract.getNomeProduto());
        assertEquals("Municipio", actualContract.getMunicipio());
        assertEquals("Mes Emissao", actualContract.getMesEmissao());
        assertEquals(123L, actualContract.getId().longValue());
        assertEquals("Cod Ibge", actualContract.getCodIbge());
        assertEquals("Cod Cad Mu", actualContract.getCodCadMu());
        assertEquals("Cd Tipo Seguro", actualContract.getCdTipoSeguro());
        assertEquals("Cd Sub Programa", actualContract.getCdSubPrograma());
        assertEquals("Cd Programa", actualContract.getCdPrograma());
        assertEquals("6720", actualContract.getCdProduto());
        assertEquals("Cd Modalidade", actualContract.getCdModalidade());
        assertEquals("Cd Fonte Recurso", actualContract.getCdFonteRecurso());
        assertEquals("Cd Estado", actualContract.getCdEstado());
        assertEquals("Atividade", actualContract.getAtividade());
        assertEquals(10.0d, actualContract.getAreaCusteio());
    }

}