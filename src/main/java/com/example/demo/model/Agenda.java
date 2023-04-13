package com.example.demo.model;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Agenda {
    
    @Id
    private Long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private String cidade;
    private String estado;
    private String cep;
    

    
    @ManyToOne
    private Curso curso;
    
    @ManyToOne
    private Professor professor;
    
    // getters e setters
}
