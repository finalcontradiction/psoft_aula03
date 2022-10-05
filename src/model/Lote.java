package model;
import java.util.Date;
import java.util.Objects;

public class Lote {
	
	private int qtd;
	private Date dataV;
	private Produto prod;
	
	public Lote(int qtd, Date dataV, Produto prod) {
		this.qtd = qtd;
		this.dataV = dataV;
		this.prod = prod;
	}
	
	@Override
	public String toString() {
		return "Data de validade: "+this.dataV.getDate()+"/"+this.dataV.getMonth()+"/"+this.dataV.getYear();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataV, prod, qtd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lote other = (Lote) obj;
		return Objects.equals(dataV, other.dataV) && Objects.equals(prod, other.prod) && qtd == other.qtd;
	}

}
