package com.senai.crud_aluno_springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "Alunos")
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @NotBlank(message = "aluno não pode ser vazio")
    private String aluno;
    @NotBlank(message = "email não pode ser vazio")
    @Email(message = "email tem que ser válido")
    private String email;
    @NotNull(message = "idAcesso não pode ser nulo")
    private Integer idAcesso;
    @Size(min = 11, max = 11, message = "Tamanho do cpf tem que ser 11")
    @NotNull(message = "cpf não pode ser nulo")
    private String cpf;
    private String curso;

}
