package A08;

public class Ementa {
	private String nome;
	private String local;
	private Conjunto<Prato> listaPratos;
	
	
	public Ementa(String nome, String local) {
		super();
		this.nome = nome;
		this.local = local;
		this.listaPratos = new Conjunto<>();
	}


	public Ementa(String nome, String local, Conjunto<Prato> listaPratos) {
		super();
		this.nome = nome;
		this.local = local;
		this.listaPratos = listaPratos;
	}
	
	public void addPrato(Prato p, DiaSemana d) {
		this.listaPratos.insert(p);
	}
	
	public void removePrato(Prato p) {
		this.listaPratos.remove(p);
	}
	
	public void imprimirEmenta() {
		String tmp = "Ementa:\n";
		for(Prato i : listaPratos.getElements()) {
			tmp+=i+"\n";
		}
		System.out.println(tmp);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public Conjunto<Prato> getListaPrato() {
		return listaPratos;
	}


	public void setListaPrato(Conjunto<Prato> listaPrato) {
		this.listaPratos = listaPrato;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaPratos == null) ? 0 : listaPratos.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ementa other = (Ementa) obj;
		if (listaPratos == null) {
			if (other.listaPratos != null)
				return false;
		} else if (!listaPratos.equals(other.listaPratos))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Ementa [nome=" + nome + ", local=" + local + ", listaPrato=" + listaPratos + "]";
	}
}
