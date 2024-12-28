package com.venilson.kitnet.repositorios;

import com.venilson.kitnet.entidades.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
