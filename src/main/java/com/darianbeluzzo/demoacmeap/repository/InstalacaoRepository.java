package com.darianbeluzzo.demoacmeap.repository;

import java.util.List;
import java.util.Optional;

import com.darianbeluzzo.demoacmeap.domain.Cliente;
import com.darianbeluzzo.demoacmeap.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

	public Optional<Instalacao> findByCodigo(String codigo);
	public List<Instalacao> findByCliente(Cliente cliente);
	
	
}
