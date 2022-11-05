package com.felipeguimaraes.contracts.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class APIResponseDto {

    @JsonProperty("Municipio")
    public String municipio;
    public String nomeProduto;
    @JsonProperty("MesEmissao")
    public String mesEmissao;
    @JsonProperty("AnoEmissao")
    public String anoEmissao;
    public String cdPrograma;
    public String cdSubPrograma;
    public String cdFonteRecurso;
    public String cdTipoSeguro;
    public String cdEstado;
    @JsonProperty("VlCusteio")
    public int vlCusteio;
    public String cdProduto;
    public String codCadMu;
    @JsonProperty("Atividade")
    public String atividade;
    public String cdModalidade;
    public String codIbge;
    @JsonProperty("AreaCusteio")
    public int areaCusteio;
}
