package dev.java10x.cadastroninja.Missoes;

import dev.java10x.cadastroninja.Ninja.Controoler.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") // "missoes" é o nome do campo no NinjaModel
    // evita loop infinito ao virar JSON
    private List<NinjaModel> ninjas;
}
