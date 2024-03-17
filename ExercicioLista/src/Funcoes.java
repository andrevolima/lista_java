import java.util.Locale;
import java.util.Scanner;

public class Funcoes {
	private static Lista listanomes = new Lista();
	
	public static void case1() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        if (listanomes.tamanho == 0) { 
            System.out.print("Digite um nome: ");
            String prim_nome = sc.nextLine();

            Nomes var = new Nomes();
            var.setNome(prim_nome);

            listanomes.inserirNome(var);

            System.out.println("Lista de nomes:");
            listanomes.imprimirNomes();
        } else {
            System.out.println("A lista já foi criada. Use a segunda opcao para adicionar mais nomes.");
        }

        System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();

        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }
		
		
		sc.close();
	}
	
	
	public static void case2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um nome para ser adicionado na lista: ");
		String prim_nome = sc.nextLine();

        Nomes var = new Nomes();
        var.setNome(prim_nome);

        listanomes.inserirNome(var);

        System.out.println("Lista de nomes:");
        listanomes.imprimirNomes();
		
		System.out.println("Deseja voltar ao menu? ");
		System.out.print("Digite 1 para sim e qualquer valor para nao: ");
		int num = sc.nextInt();
		
		if(num==1) {
			Menu.main(null);;		
		}else {
			System.out.println("Tchau!");
		}
		
		
		sc.close();
		
		
	}
	
	
	public static void case3() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------");
		
        System.out.println("Lista de nomes:");
        listanomes.imprimirNomes();
        
        System.out.println("-------");
		
		System.out.println("Deseja voltar ao menu? ");
		System.out.print("Digite 1 para sim e qualquer valor para nao: ");
		int num = sc.nextInt();
		
		if(num==1) {
			Menu.main(null);;		
		}else {
			System.out.println("Tchau!");
		}
		
		
		sc.close();
		
		
	}
	
	
	public static void case4() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A lista esta assim: ");
		listanomes.imprimirNomes();
		
		System.out.println("Digite o nome para deletar: ");
		String nome = sc.nextLine();
		
		 if (listanomes.removerNome(nome)) {
		        System.out.println("Nome removido da lista");
		    } else {
		        System.out.println("O nome nao foi encontrado(ERRO)");
		    }
		

		System.out.println("Deseja voltar ao menu? ");
		System.out.print("Digite 1 para sim e qualquer valor para nao: ");
		int num = sc.nextInt();
		
		if(num==1) {
			Menu.main(null);;		
		}else {
			System.out.println("Tchau!");
		}
		
		
		sc.close();
	}
	
	
	public static void case5() {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);

	    System.out.println("A lista está assim: ");
	    listanomes.imprimirNomes();


	    System.out.print("Digite a posição do nome que deseja buscar: ");
	    int posicaoBusca = sc.nextInt();

	    String nomeEncontrado = listanomes.buscarNomePorPosicao(posicaoBusca);

	    if (!nomeEncontrado.isEmpty()) {
	        System.out.println("O nome na posição " + posicaoBusca + " é: " + nomeEncontrado);
	    } else {
	        System.out.println("Posição inválida. Nenhum nome encontrado.");
	    }
	    
	    
	    System.out.println("Deseja voltar ao menu? ");
		System.out.print("Digite 1 para sim e qualquer valor para nao: ");
		int num = sc.nextInt();
		
		if(num==1) {
			Menu.main(null);;		
		}else {
			System.out.println("Tchau!");
		}
	    
	    sc.close();
	}

	
	
	
	
	
	
	public static void case6() {
	
			System.out.println("Tchau!");
		}
	
	
}
