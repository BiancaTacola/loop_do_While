// Importa a classe "Caixa" para o pacote "com.fiap.view"
package com.fiap.view;

// Declaração da classe "Caixa"
public class Caixa_Do_While {
	
	// Método principal (ponto de entrada) do programa
	public static void main(String[] args) {
		
		// Declara uma variável inteira "numero" e a inicializa com o valor 0
		int numero = 0;
		
		// Início de um loop "do-while" que executa pelo menos uma vez e depois verifica a condição
		do {
			// Incrementa o valor da variável "numero" em 1 a cada iteração
			numero = numero + 1;
			
			// Imprime o valor atual de "numero" na tela
			System.out.println(numero);
			
		} while (numero < 10); // Continua o loop enquanto "numero" for menor que 10

		// Fim do método principal
	}

	// Fim da classe "Caixa"
}
