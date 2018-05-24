package A08;

public class A07E01 {

	public static void main(String[] args) { 
		Circulo c1 = new Circulo(2);        
		Circulo c2 = new Circulo(1, 3, 2);        
		
		Quadrado q1 = new Quadrado(2);        
		Quadrado q2 = new Quadrado(3, 4, 2);        
		
		Retangulo r1 = new Retangulo(2, 3);        
		Retangulo r2 = new Retangulo(3, 4, 2, 3);        
		
		Conjunto<Figura> col = new Conjunto<>();// MaxArea     
		
		System.out.println(col.insert(c2));        
		System.out.println(col.insert(r1));        
		System.out.println(col.insert(r1));        
		System.out.println(col.insert(r2));        
		System.out.println(col.insert(c1));        
		System.out.println(col.insert(q2));        
		System.out.println(col.insert(q1));     
		System.out.println(col.remove(r1));        
		System.out.println(col.insert(q1));             
		
		System.out.println("\nLista de Figuras:");        
		for (Figura f: col.getElements())           
			System.out.println(f);
		
		System.out.println("\nCirculos na Lista de Figuras:");        
		for (Figura f: col.getElements())           
			if (f instanceof Circulo)        
				System.out.println(f);
		   
	} 
} 