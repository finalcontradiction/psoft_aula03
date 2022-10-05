package service;
import repositories.LoteRepository;

import java.util.Optional;

import model.Lote;

public class LoteService {
	
	private LoteRepository rep;
	
	public LoteService() {
		this.rep = new LoteRepository();
	}
	
	public Optional<Lote> search(){
		return Optional.ofNullable(null);
	}

}
