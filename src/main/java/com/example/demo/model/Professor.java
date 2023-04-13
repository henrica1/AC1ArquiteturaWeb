package com.example.demo.model;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Professor {
    
    @Id
    private Long id;
    
    private String nome;
    
    private String cpf;
    
    private String rg;
    
    private String endereco;
    
    private String celular;
    
    @ManyToMany(mappedBy = "professores")
    private Set<Curso> cursos = new HashSet<>();
    
    // getters e setters
}