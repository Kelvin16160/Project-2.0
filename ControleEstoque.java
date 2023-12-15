import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ControleEstoque {

	// Método para controlar a saída do estoque
	public void realizarSaidaEstoque(Estoque estoque, int quantidadeSaida) {
		int quantidadeAtual = estoque.getQuantidade();

		if (quantidadeAtual >= quantidadeSaida) {
			// Reduz a quantidade em estoque
			estoque.setQuantidade(quantidadeAtual - quantidadeSaida);
			System.out.println("Saída de " + quantidadeSaida + " unidades do produto " + estoque.getProduto()
					+ " realizada com sucesso.");
		} else {
			System.out.println("Não há quantidade suficiente em estoque para realizar a saída.");
		}
	}

	public void nomeproduct(Estoque estoque, String produto) {
		estoque.setProduto(produto);

	}

	// Método para controlar a entrada do estoque
	public void realizarEntradaEstoque(Estoque estoque, int quantidadeEntrada) {
		int quantidadeAtual = estoque.getQuantidade();

		// Aumenta a quantidade em estoque
		estoque.setQuantidade(quantidadeAtual + quantidadeEntrada);
		System.out.println("Entrada de " + quantidadeEntrada + " unidades do produto " + estoque.getProduto()
				+ " realizada com sucesso.");
	}

	// Método principal para testar
	public static void main(String[] args) {
		// Criando um objeto de Estoque
		Estoque meuEstoque = new Estoque();

		// Criando um objeto ControleEstoque
		ControleEstoque controle = new ControleEstoque();

		controle.nomeproduct(meuEstoque, JOptionPane.showInputDialog(controle));
		// Realizando uma saída de estoque de 20 unidades
		controle.realizarSaidaEstoque(meuEstoque, 20);

		// Verificando a quantidade atual após a saída do estoque
		System.out.println("Quantidade atual em estoque: " + meuEstoque.getQuantidade());

		// Realizando uma entrada de estoque de 30 unidades
		controle.realizarEntradaEstoque(meuEstoque, 30);

		// Verificando a quantidade atual após a entrada no estoque
		System.out.println("Quantidade atual em estoque: " + meuEstoque.getQuantidade() + "\nNo Produto : "
				+ meuEstoque.getProduto());
	}
}
