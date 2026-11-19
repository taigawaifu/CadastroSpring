package dev.java10x.cadastroninja.Ninja.Controoler;

import dev.java10x.cadastroninja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_cadastroninja")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;
    private String email;
    private int idade;

    @ManyToOne                       // vários ninjas -> uma missão
    @JoinColumn(name = "missoes_id") // coluna da chave estrangeira na tb_cadastroninja
    private MissoesModel missoes;


}