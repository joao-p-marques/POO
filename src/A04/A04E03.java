package A04;

import java.util.Scanner;

public class A04E03 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Utilizador alunos[] = new Utilizador[100];
		Livro catalogo[] = new Livro[100];
		//int nAlunos=0, nLivros=0;
		
		alunos[0] = new Utilizador("Joao", 89234, "LEI");
		catalogo[0] = new Livro("Livro1", "NORMAL");
		catalogo[1] = new Livro("Livro2", "CONDICIONAL");
		catalogo[2] = new Livro("Livro3", "NORMAL");
		catalogo[3] = new Livro("Livro4", "NORMAL");
		catalogo[4] = new Livro("Livro5", "NORMAL");
		
		int op;
		do {
			System.out.println("1 - inscrever aluno");
			System.out.println("2 - remover aluno");
			System.out.println("3 - imprimir lista de utilizadores");
			System.out.println("4 - registar um novo livro");
			System.out.println("5 - imprimir lista de livros");
			System.out.println("6 - emprestar");
			System.out.println("7 - devolver");
			System.out.println("8 - sair");
			
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				//System.out.println("[Adicionando aluno]");
				for(int i=0; i<alunos.length; i++) {
					if (alunos[i]==null) {
						alunos[i]=novoAluno();
						break;
					}
				}
				break;
			case 2:
				//System.out.println("[Removendo aluno]");
				System.out.print("Qual o aluno que deseja remover (insira nMec): ");
				int nMecToRem = sc.nextInt();
				for(int i=0; i<alunos.length; i++) {
					if(alunos[i].getNMec() == nMecToRem) {
						alunos[i] = null;
						break;
					}
				}
				break;
			case 3:
				System.out.println("[Imprimindo lista de alunos]");
				for(int i=0; i<alunos.length; i++) {
					if (alunos[i]==null) continue;
					System.out.println(alunos[i]);
				}
				break;
			case 4:
				//System.out.println("[Registando um novo livro]");
				for(int i=0; i<catalogo.length; i++) {
					if (catalogo[i]==null) {
						catalogo[i]=novoLivro();
						break;
					}
				}
				break;
			case 5:
				System.out.println("[Imprimindo lista de livros]");
				for(int i=0; i<catalogo.length; i++) {
					if (catalogo[i]==null) continue;
					System.out.println(catalogo[i]);
				}
				break;
			case 6:
				//System.out.println("[Emprestando livro]");
				System.out.print("Qual o livro que deseja emprestar(titulo)? ");
				String bookOut = sc.next();
				for(int i=0; i<catalogo.length; i++) {
					if(catalogo[i]!=null && catalogo[i].getTitulo().equals(bookOut)) {
						if(catalogo[i].getTipo_emprestimo().equals("CONDICIONAL")) {
							System.out.println("Este livro não pode ser emprestado.");
							break;
						}
						//catalogo[i].setDisponivel(false);
						System.out.print("Aluno que vai requisitar livro(nMec): ");
						int nMec = sc.nextInt();
						for(int j=0; j<alunos.length; j++) {
							if(alunos[j] != null && alunos[j].getNMec()==nMec) {
								alunos[j].requisitouLivro(catalogo[i]);
							}
						}
						break;
					}
				}
				break;
			case 7:
				//System.out.println("[Devolver livro]");
				System.out.print("Qual o livro que deseja devolver(titulo)? ");
				String bookIn = sc.next();
				for(int i=0; i<catalogo.length; i++) {
					if(catalogo[i]!= null && catalogo[i].getTitulo().equals(bookIn)) {
						//catalogo[i].setDisponivel(true);
						System.out.print("Aluno que vai devolver livro(nMec): ");
						int nMec = sc.nextInt();
						for(int j=0; j<alunos.length; j++) {
							if(alunos[j] != null && alunos[j].getNMec()==nMec) {
								alunos[j].devolveuLivro(catalogo[i]);
							}
						}
						break;
					}
				}
				break;
			}
		} while(op!=8);
	}
	
	public static Utilizador novoAluno() {
		//System.out.println("[Creating a new student]");
		//sc.next(); //Clear keyboard buffer
		System.out.print("Nome: ");
		String nome = sc.next();
		//System.out.println("[Nome=" + nome + "]");
		System.out.print("N. Mec.: ");		
		int nMec = sc.nextInt();
		System.out.print("Curso: ");
		String curso = sc.next();
		
		return new Utilizador(nome, nMec, curso);
	}
	
	public static Livro novoLivro() {
		//System.out.println("[Creating a new book]");
		//sc.next(); //Clear keyboard buffer
		System.out.print("Título: ");
		String titulo = sc.next();
		System.out.print("Tipo de empréstimo(NORMAL/CONDICIONAL): ");
		String tipo_emprestimo = sc.next();
		
		return new Livro(titulo, tipo_emprestimo);
	}

}
