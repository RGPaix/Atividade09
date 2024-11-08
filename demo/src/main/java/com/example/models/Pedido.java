package com.example.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")  // Usando a anotação @JoinColumn para garantir que o relacionamento será feito com a coluna id_cliente
    private Cliente cliente; // A entidade cliente ao invés de um Long (idCliente)

    @ManyToMany
    private List<Produto> produtos;

}