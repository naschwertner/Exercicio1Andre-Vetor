//Escrever um programa em Java que preencha um vetor de 10 posições com 
//valores aleatórios. Em seguida, colocar os valores do vetor em ordem crescente. 
//Imprima no vídeo os elementos do vetor antes e depois da ordenação.

import java.util.Random;

public class VetorOrdenado {

	public static void main(String[] args) {

		int[] x = new int[10];
		
		preencher(x);
		imprimir (x);

	}

	public static void preencher(int[] x) {
		Random gerador = new Random();
		// laço de repetição para gerar e armazenar os numeros
		for (int i = 0; i < x.length; i++) { // contador de posição; i < tamanho do vetor; somar 1 na variavel
			x[i] = gerador.nextInt(10); // método

		}
	}

	// metodo para pegar os valores do vetor e imprimir
	public static void imprimir(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + " ");

		}

	}
}
	