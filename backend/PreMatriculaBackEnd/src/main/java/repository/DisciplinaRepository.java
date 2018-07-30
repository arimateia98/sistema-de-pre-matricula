package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Disciplina;
@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

}
