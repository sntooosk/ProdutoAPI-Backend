package br.com.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RepostaModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {

  @Autowired
  private ProdutoRepositorio pr;

  @Autowired
  private RepostaModelo rm;

  public Iterable<ProdutoModelo> listar() {
    return pr.findAll();
  }

  public ResponseEntity<?> cadastrarAlterar(ProdutoModelo pm, String acao) {

    if (pm.getNome().equals("")) {
      rm.setMensagem("O Nome do produto e Obrigatorio");
      return new ResponseEntity<RepostaModelo>(rm, HttpStatus.BAD_REQUEST);
    } else if (pm.getMarca().equals("")) {
      rm.setMensagem("O Nome da marca e Obrigatorio");
      return new ResponseEntity<RepostaModelo>(rm, HttpStatus.BAD_REQUEST);
    } else {
      if (acao.equals("cadastrar")) {
        return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.CREATED);
      } else {
        return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.OK);
      }
    }

  }

  public ResponseEntity<RepostaModelo> remover(long codigo) {
    pr.deleteById(codigo);
    rm.setMensagem("Produto removido com sucesso!!");
    return new ResponseEntity<RepostaModelo>(rm, HttpStatus.OK);
  }
}
