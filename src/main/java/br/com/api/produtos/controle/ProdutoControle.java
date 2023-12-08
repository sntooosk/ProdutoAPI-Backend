package br.com.api.produtos.controle;

import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RepostaModelo;
import br.com.api.produtos.servico.ProdutoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class ProdutoControle {

  @Autowired
  ProdutoServico ps;

  @DeleteMapping("/remover/{codigo}")
  public ResponseEntity<RepostaModelo> remover(@PathVariable long codigo) {
    return ps.remover(codigo);
  }

  @PostMapping("/cadastrar")
  public ResponseEntity<?> cadastar(@RequestBody ProdutoModelo pm) {
    return ps.cadastrarAlterar(pm, "cadastrar");
  }

  @PutMapping("/alterar")
  public ResponseEntity<?> alterar(@RequestBody ProdutoModelo pm) {
    return ps.cadastrarAlterar(pm, "alterar");
  }

  @GetMapping("/listar")
  public Iterable<ProdutoModelo> listar() {
    return ps.listar();
  }

  @GetMapping("/")
  public String rota() {
    return "API de podutos funcionando!";
  }

}
