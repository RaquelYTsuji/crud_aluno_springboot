package com.senai.crud_aluno_springboot.controller;

import com.senai.crud_aluno_springboot.model.Aluno;
import com.senai.crud_aluno_springboot.model.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @GetMapping
    public List<Aluno> getAllAlunos(){
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Aluno getAllAlunos(@PathVariable String id){
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable String id, @RequestBody Aluno alunoRequest){
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        aluno.setAluno(alunoRequest.getAluno());
        aluno.setEmail(alunoRequest.getEmail());
        aluno.setIdAcesso(alunoRequest.getIdAcesso());
        aluno.setCpf(alunoRequest.getCpf());
        aluno.setCurso(alunoRequest.getCurso());
        return alunoRepository.save(aluno);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable String id){
        alunoRepository.deleteById(id);
    }
}
