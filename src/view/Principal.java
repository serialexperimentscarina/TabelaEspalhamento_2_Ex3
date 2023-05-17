package view;

import controller.TabelaReadequacaoController;

public class Principal {

	public static void main(String[] args) {
		TabelaReadequacaoController tabReCont = new TabelaReadequacaoController();
		int[][] valores = {
				{12, 647, 158, 136, 467},
				{156, 600, 551}, 
				{263, 414, 882, 945, 914, 953, 629},
				{884, 795, 194, 513},
				{591, 847, 66, 337, 979},
				{768, 53},
				{114, 803, 90, 339, 550},
				{574, 977, 216, 99, 617, 88},
				{142, 148, 227, 939, 585, 338, 206},
				{569, 708, 844}};
		
		try {
			for (int i = 0; i < 10; i++) {
				for (int valor : valores[i]) {
					tabReCont.adicionaAntiga(valor, i);
				}
			}
			System.out.println("Primeira tabela (10 posições) : ");
			tabReCont.listaAntiga();
			
			System.out.println("\n\n ============== ");
			
			tabReCont.geraNova();
			System.out.println("Segunda tabela (5 posições) : ");
			tabReCont.listaNova();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	


}
