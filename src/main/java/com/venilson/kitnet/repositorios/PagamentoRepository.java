package com.venilson.kitnet.repositorios;

import com.venilson.kitnet.entidades.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
