package com.example.models.repositories;

import com.example.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByCliente_Id(Long idCliente);
    @Query("SELECT p FROM Pedido p JOIN p.produtos pr WHERE pr.id = :idProdutos")
    List<Pedido> findByIdProdutos(@Param("idProdutos") Long idProdutos);
}
