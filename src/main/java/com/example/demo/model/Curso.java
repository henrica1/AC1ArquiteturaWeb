package com.example.demo.model;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Curso {
    
    @Id
    private Long id;
    private String descricao;
    private Integer cargaHoraria;
    private String objetivos;
    private String ementa;
    
    @ManyToMany
    private Set<Professor> professores = new HashSet<>();
    
    @OneToMany(mappedBy = "curso")
    private Set<Agenda> agendas = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "especializacao", 
    joinColumns = {@JoinColumn (name="profossorNome")}, 
    inverseJoinColumns = {@JoinColumn (name = "cursoId")}) 
    List <Curso> cursos;
    
    // getters e setters
}