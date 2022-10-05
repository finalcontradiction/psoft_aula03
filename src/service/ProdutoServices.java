package service;
import repositories.ProdutoRepository;
import java.util.List;
import model.*;

public class ProdutoServices {
	
	private ProdutoRepository rep;
	
	public ProdutoServices() {
		this.rep = new ProdutoRepository();
	}
	
	public void addProd(String nome, String fab, double preco) {
		this.rep.add(new Produto(nome, fab, preco));
	}
	
	public List<Produto> listarProd() {
		throw new UnsupportedOperationException();
	}
}
