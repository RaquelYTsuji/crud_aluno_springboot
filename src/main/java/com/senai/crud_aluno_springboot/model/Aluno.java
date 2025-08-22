package com.senai.crud_aluno_springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Alunos")
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String aluno;
    private String email;
    private Integer idAcesso;
    private String cpf;
    private String curso;

}
