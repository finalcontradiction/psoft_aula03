package repositories;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import model.Produto;

public class ProdutoRepository {
	private Map<String, Produto> produtos;
	
	public ProdutoRepository() {
		this.produtos = new HashMap<String, Produto>();
	}
	
	public void add(Produto produto) {
		this.produtos.put(produto.getNome(), produto);
	}
	
	public Optional<Produto> search(String nome){
		return Optional.ofNullable(this.produtos.get(nome));
	}
}
