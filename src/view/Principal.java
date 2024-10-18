package view;

import model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto pd = new Produto();

		pd.setNome("Arroz");
		pd.setPreco(5.25);
		pd.setQtd(5);
		
		pd.setNome("Calça");
		pd.setPreco(45.50);
		pd.setQtd(7);

		double resultado = pd.estoqueTotal(pd.getPreco(), pd.getQtd());
				
				
		System.out.println("Valor total: " + resultado + "\nProduto: " + pd.getNome() + "\nValor(Unidade): "
				+ pd.getPreco() + "\nQuantidade: " + pd.getQtd());
	}
}
