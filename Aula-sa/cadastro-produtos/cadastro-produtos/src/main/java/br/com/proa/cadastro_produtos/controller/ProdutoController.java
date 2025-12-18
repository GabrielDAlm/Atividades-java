package br.com.proa.cadastro_produtos.controller;

import br.com.proa.cadastro_produtos.model.Produto;
import br.com.proa.cadastro_produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto) {
        produto = repository.save(produto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(produto.getIdProduto())
                .toUri();

        return ResponseEntity.created(uri).body(produto);
    }




    @GetMapping
    public ResponseEntity<List<Produto>> pegaProdutos() {
        List<Produto> produtos = repository.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    public ResponseEntity<Void> deletaProduto(@RequestBody Produto produto) {
        repository.delete(produto);
        return ResponseEntity.noContent().build();
    }
}
