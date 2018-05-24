package A05;

import java.util.Arrays;

public class Conjunto {
	private int n[] = new int[100];
	
	public Conjunto() {
		for(int i=0; i<this.n.length; i++) {
			this.n[i]=0;
		}
	}
	
	public boolean contains(int a) {
		for(int i=0; i<this.n.length; i++) {
			if(this.n[i]==a) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(int a) {
		if (this.contains(a)) return;
		for(int i=0; i<this.n.length; i++) {
			if(this.n[i]==0) {
				this.n[i]=a;
				break;
			}
		}
	}
	
	public void remove (int a) {
		if(!this.contains(a)) return;
		for(int i=0; i<this.n.length; i++) {
			if(this.n[i]==a) {
				this.n[i]=0;
				break;
			}
		}
	}
	
	public void empty() {
		for(int i=0; i<this.n.length; i++) {
			this.n[i]=0;
		}
	}
	
	public int size() {
		int c=0;
		for(int i=0; i<this.n.length; i++) {
			if(this.n[i]!=0) c++;
		}
		return c;
	}
	
	public Conjunto unir(Conjunto add) {
		Conjunto f = new Conjunto();
		for(int i=0; i<this.n.length; i++) {
			f.insert(this.n[i]);
		}
		for(int i=0; i<add.n.length; i++) {
			if(!f.contains(add.n[i])) {
				f.insert(add.n[i]);
			}
		}
		return f;
	}
	
	public Conjunto subtrair (Conjunto dif) {
		Conjunto f = new Conjunto();
		for (int i : this.n) {
			if(!dif.contains(i)) {
				f.insert(i);
			}
		}
//		for (int i : dif.n) {
//			if(!this.contains(i)) {
//				f.insert(i);
//			}
//		}
		return f;
	}
	
	public Conjunto interset (Conjunto inter) {
		Conjunto f = new Conjunto();
		for (int i : this.n) {
			if(inter.contains(i)) {
				f.insert(i);
			}
		}
		return f;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i : n) {
			if (i!=0) {
				s += i + " ";
			}
		}
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(n);
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
		Conjunto other = (Conjunto) obj;
		if (!Arrays.equals(n, other.n))
			return false;
		return true;
	}
}
