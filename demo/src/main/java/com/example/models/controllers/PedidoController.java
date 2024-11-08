package com.example.models.controllers;

import com.example.models.Pedido;
import com.example.models.Produto;
import com.example.models.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listar() {
        return pedidoService.listarPedidos();
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return pedidoService.salvarPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id) {
        return (Pedido) pedidoService.buscarPedidoPorId(id);
    }

    @GetMapping("/clientes/{idCliente}")
    public List<Pedido> buscarPorCliente(@PathVariable Long idCliente){
        return pedidoService.buscarPedidoPorIdCliente(idCliente);
    }

    @GetMapping("/produtos/{idProduto}")
    public List<Pedido> buscarPorProduto(@PathVariable Long idProdutos) {
        return pedidoService.buscarPedidoPorIdProdutos(idProdutos);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pedidoService.deletarPedido(id);
    }
}
