package controller;

import br.com.serialexperimentscarina.listaint.ListaInt;

public class TabelaReadequacaoController implements ITabelaReadequacaoController{
	
	ListaInt[] tabelaAntiga;
	ListaInt[] tabelaNova;

	public TabelaReadequacaoController() {
		tabelaAntiga = new ListaInt[10];
		tabelaNova = new ListaInt[5];
		
		for (int i = 0; i < 5; i++) {
			tabelaAntiga[i] = new ListaInt();
			tabelaNova[i] = new ListaInt();
		}
		
		for (int i = 5; i < 10; i++) {
			tabelaAntiga[i] = new ListaInt();
		}
		
	}
	
	public void adicionaAntiga(int num, int pos) throws Exception {
		ListaInt l = tabelaAntiga[pos];
		l.addLast(num);
	}
	
	public void geraNova() throws Exception {
		for (int i = 0; i < 10; i++) {
			ListaInt l = tabelaAntiga[i];
			int tamanho = l.size();
			
			for (int j = 0; j < tamanho; j++) {
				int hash = hashCode(i);
				ListaInt lN = tabelaNova[hash];
				lN.addLast(l.get(j));
			}
		}
	}
	
	public void listaAntiga() throws Exception {
		lista(tabelaAntiga, 10);
	}
	

	public void listaNova() throws Exception {
		lista(tabelaNova, 5);
	}
	
	private void lista(ListaInt[] tabela, int posicoes) throws Exception {
		for (int i = 0; i < posicoes; i++) {
			ListaInt l = tabela[i];
			int tamanho = l.size();
			
			System.out.println("\nPosição " + i + " :");
			for (int j = 0; j < tamanho; j++) {
				System.out.print(l.get(j) + " ");
			}
		}
	}
	
	// Função hash baseada na posição na antiga tabela de espalhamento
	private int hashCode(int pos) {
		return (pos / 2);
	}

}
