package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.up.jpa.Dominio.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {
}
