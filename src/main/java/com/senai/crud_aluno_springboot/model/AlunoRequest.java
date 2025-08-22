package com.senai.crud_aluno_springboot.model;

public record AlunoRequest(
        String aluno,
        String email,
        Integer idAcesso,
        String cpf,
        String curso
) {}
