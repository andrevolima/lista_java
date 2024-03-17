
public class Lista {
	Nomes[] nomes = new Nomes[100];
    int tamanho = 0;

    public boolean inserirNome(Nomes var) {
        if (tamanho < nomes.length) {
            nomes[tamanho] = var;
            tamanho++;
            return true;
        } else {
            return false; 
        }
    }

    public void imprimirNomes() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(nomes[i].getNome());
        }
    }
    
    public void deslocarParaEsquerda (int pos) { 
		for (int i = pos; i < (tamanho - 1); i++)
			 nomes[i] = nomes [i+1];
	}
		
    public boolean removerNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (nomes[i].getNome().equals(nome)) { //Usei o equals pq usando o '==' eu nao conseguia deletar e depois de pesquisar vi que o equals resolvia esse problema, pois ele virifica se o ceonteudo das Strings sao iguais
                deslocarParaEsquerda(i);
                tamanho--;
                return true;
            }
		}
		return false;
	}

    
    public String buscarNomePorPosicao(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return nomes[posicao].getNome();
        } else {
            return "Essa posicao nao e valida"; 
        }
    }

}


