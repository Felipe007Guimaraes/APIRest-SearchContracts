package com.felipeguimaraes.contracts.api.dtos;

import com.felipeguimaraes.contracts.api.entities.Contract;

public class ResponseConverterDto {
    public static Contract convertToInvest(APIResponseDto response){
        return new Contract ().builder()
                .municipio(response.getMunicipio())
                .nomeProduto(response.getNomeProduto())
                .mesEmissao(response.getMesEmissao())
                .anoEmissao(response.getAnoEmissao())
                .cdPrograma(response.getCdPrograma())
                .cdSubPrograma(response.getCdSubPrograma())
                .cdFonteRecurso(response.getCdFonteRecurso())
                .cdTipoSeguro(response.getCdTipoSeguro())
                .cdEstado(response.getCdEstado())
                .vlCusteio(response.getVlCusteio())
                .cdProduto(response.getCdProduto())
                .codCadMu(response.getCodCadMu())
                .atividade(response.getAtividade())
                .cdModalidade(response.getCdModalidade())
                .codIbge(response.getCodIbge())
                .areaCusteio(response.getAreaCusteio())
                .build();
    }
}
