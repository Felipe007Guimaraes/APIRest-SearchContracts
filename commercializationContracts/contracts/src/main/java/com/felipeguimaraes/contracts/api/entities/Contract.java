package com.felipeguimaraes.contracts.api.entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_COMMERCIALIZATION_CONTRACTS")
public class Contract implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String municipio;
    private String nomeProduto;
    private String mesEmissao;
    private String anoEmissao;
    private String cdPrograma;
    private String cdSubPrograma;
    private String cdFonteRecurso;
    private String cdTipoSeguro;
    private String cdEstado;
    private double vlCusteio;
    private String cdProduto;
    private String codCadMu;
    private String atividade;
    private String cdModalidade;
    private String codIbge;
    private double areaCusteio;

}
