package A07;

import java.util.ArrayList;

public class ColecaoFiguras {
	private double maxArea;
	private double currentArea;
	private ArrayList<Figura> figuras;
	
	public ColecaoFiguras(double maxArea) {
		super();
		this.maxArea = maxArea;
		this.figuras = new ArrayList<>();
		this.currentArea = 0;
	}
	
	public boolean exists(Figura f) {
		return figuras.contains(f);
	}
	
	public boolean addFigura(Figura f) {
		System.out.print("Area a adicionar: " + f.calcArea() + " | Area total: " + currentArea);
		if(figuras.contains(f) || (this.currentArea+f.calcArea())>this.maxArea) {
			System.out.println();
			return false;
		}
		figuras.add(f);
		this.currentArea += f.calcArea();
		System.out.println(" | Nova Area:" + currentArea);
		return true;
	}
	
	public boolean delFigura(Figura f) {
		figuras.remove(f);
		//this.currentArea -= f.calcArea();
		return true;
	}
	
	public double areaTotal() {
		return this.currentArea;
	}
	
	@Override
	public String toString() {
		String ret = "Lista de Figuras: \n ";
		for(Figura f : figuras) {
			ret += f;
		}
		
		return ret;
	}
	
	public Figura[] getFiguras(){
		Figura[] f = new Figura[this.figuras.size()];
		for(int i=0; i<f.length; i++) {
			f[i] = figuras.get(i);
		}
		return f;
	}
	
	public Ponto[] getCentros(){
		Ponto[] c = new Ponto[this.figuras.size()];
		for(int i=0; i<c.length; i++) {
			c[i] = figuras.get(i).getCentro();
		}
		return c;
	}
}
