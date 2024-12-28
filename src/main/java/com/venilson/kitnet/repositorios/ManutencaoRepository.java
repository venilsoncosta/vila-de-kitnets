package com.venilson.kitnet.repositorios;

import com.venilson.kitnet.entidades.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Long> {
}
