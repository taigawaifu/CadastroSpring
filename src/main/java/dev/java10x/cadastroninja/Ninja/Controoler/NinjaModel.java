package dev.java10x.cadastroninja.Ninja.Controoler;

import dev.java10x.cadastroninja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

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

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade, MissoesModel missoes) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }

    // getters e setters de nome, email, idade e missoes
}