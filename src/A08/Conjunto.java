package A08;

import java.util.ArrayList;

public class Conjunto<E> {
	private ArrayList<E> c;

	public Conjunto() {
		super();
		this.c = new ArrayList<E>();
	}
	
	public boolean exists(E f) {
		return c.contains(f);
	}

	public boolean insert(E f) {
		c.add(f);
		return true;
	}

	public boolean remove(E f) {
		c.remove(f);
		return true;
	}
	
	public int size() {
		return this.c.size();
	}
	
	public void empty() {
		this.c.clear();
	}

	@SuppressWarnings("unchecked")
	public E[] getElements() {
		E[] t = (E[])(new Object[this.size()]);
		for (int i=0; i<this.size(); i++) {
			t[i] = c.get(i);
		}
		return t;
	}
	
	public Conjunto<E> intersects(Conjunto<E> b) {
		Conjunto<E> tmp = new Conjunto<>();
		for(E i : this.c) {
			if (b.exists(i)) {
				tmp.insert(i);
			}
		}
		return tmp;
	}

	@Override
	public String toString() {
		return "Conjunto [c=" + c + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
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
		@SuppressWarnings("unchecked")
		Conjunto<E> other = (Conjunto<E>) obj;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}
}
