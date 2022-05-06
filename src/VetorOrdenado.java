//Escrever um programa em Java que preencha um vetor de 10 posi��es com 
//valores aleat�rios. Em seguida, colocar os valores do vetor em ordem crescente. 
//Imprima no v�deo os elementos do vetor antes e depois da ordena��o.

import java.util.Random;

public class VetorOrdenado {

	public static void main(String[] args) {

		int[] x = new int[10];
		
		preencher(x);
		imprimir (x);

	}

	public static void preencher(int[] x) {
		Random gerador = new Random();
		// la�o de repeti��o para gerar e armazenar os numeros
		for (int i = 0; i < x.length; i++) { // contador de posi��o; i < tamanho do vetor; somar 1 na variavel
			x[i] = gerador.nextInt(10); // m�todo

		}
	}

	// metodo para pegar os valores do vetor e imprimir
	public static void imprimir(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + " ");

		}

	}
}
	