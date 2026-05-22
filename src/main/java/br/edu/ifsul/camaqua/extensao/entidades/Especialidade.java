package br.edu.ifsul.camaqua.extensao.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_especialidade")
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Especialidade() {
    }

    public Especialidade(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
