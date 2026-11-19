package dev.java10x.cadastroninja.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel,Long> {
    void incluidarTable();

}
