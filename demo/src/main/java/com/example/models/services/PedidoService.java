package com.example.models.services;
import com.example.models.Pedido;
import com.example.models.Produto;
import com.example.models.repositories.ClienteRepository;
import com.example.models.repositories.PedidoRepository;
import com.example.models.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido salvarPedido(Pedido pedido) {
        if (!clienteRepository.existsById(pedido.getCliente().getId())) {
            throw new IllegalArgumentException("Cliente inválido. O ID do cliente não existe.");
        }
        if (pedido.getProdutos() == null || pedido.getProdutos().isEmpty()) {
            throw new IllegalArgumentException("O pedido deve conter pelo menos um produto.");
        }

        for (Produto produto : pedido.getProdutos()) {
            if (produto.getId() == null || !produtoRepository.existsById(produto.getId())) {
                throw new IllegalArgumentException("Produto inválido. O ID " + produto.getId() + " não existe.");
            }
        }
        return pedidoRepository.save(pedido);
    }
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
    public List<Pedido> buscarPedidoPorId(Long idProdutos) {
        return pedidoRepository.findByIdProdutos(idProdutos);
    }
    public List<Pedido> buscarPedidoPorIdCliente(Long idCliente) {
        return pedidoRepository.findByCliente_Id(idCliente);
    }
    public List<Pedido> buscarPedidoPorIdProdutos(Long idProdutos){
        return pedidoRepository.findByIdProdutos(idProdutos);
    }
    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}