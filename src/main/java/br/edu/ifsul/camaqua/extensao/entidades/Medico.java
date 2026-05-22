package br.edu.ifsul.camaqua.extensao.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private boolean atendeConvenio;
    @ManyToOne
    @JoinColumn(name = "id_especialidade")
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(Long id, String nome, String email, String crm, boolean atendeConvenio, Especialidade especialidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.atendeConvenio = atendeConvenio;
        this.especialidade = especialidade;
    }
}
