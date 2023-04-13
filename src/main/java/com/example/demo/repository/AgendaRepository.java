package com.example.demo.repository;
import java.time.LocalDate;
import java.util.List;
import com.example.demo.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Curso;
import com.example.demo.model.Agenda;


@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    
    List<Agenda> findByProfessorAndDataInicioBetween(Professor professor, LocalDate inicio, LocalDate fim);
    
    List<Agenda> findByCursoAndDataInicioBetween(Curso curso, LocalDate inicio, LocalDate fim);
    
}
