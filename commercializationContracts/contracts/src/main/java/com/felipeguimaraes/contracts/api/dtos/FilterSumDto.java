package com.felipeguimaraes.contracts.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.felipeguimaraes.contracts.api.entities.Contract;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class FilterSumDto implements Serializable {
        private static final long serialVersionUID = 1L;

        private Long id;
        @JsonProperty("Municipio")
        private String municipio;
        @JsonProperty("nomeProduto")
        private String nomeProduto;
        @JsonProperty("AnoEmissao")
        private String anoEmissao;
        @JsonProperty("VlCusteio")
        private double vlCusteio;
        @JsonProperty("codCadMu")
        private String codCadMu;
        @JsonProperty("codProduto")
        private String codProduto;

        public FilterSumDto(Contract contract){
                id = contract.getId();
                municipio = contract.getMunicipio();
                nomeProduto = contract.getNomeProduto();
                codCadMu = contract.getCodCadMu();
                codProduto = contract.getCdProduto();
                anoEmissao = contract.getAnoEmissao();
                vlCusteio = contract.getVlCusteio();
        }

}


