package com.darianbeluzzo.demoacmeap.repository;

import java.util.List;
import java.util.Optional;

import com.darianbeluzzo.demoacmeap.domain.Fatura;
import com.darianbeluzzo.demoacmeap.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

	public Optional<Fatura> findByCodigo(String codigo);
	public List<Fatura> findByInstalacao(Instalacao instalacao);
	
}
