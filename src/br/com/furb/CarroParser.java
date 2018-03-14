package br.com.furb;

import java.util.regex.Matcher;

public class CarroParser {

	public static void main(String[] args) {
		//main criado so pra testar essa bosta
	}

	public static Carro processar(String entrada) {
		Carro c = new Carro();
		for (String line : entrada.split("\n|\r\n")) {
			for (String word : line.split("\\s")) {
				if (word.trim().isEmpty()) {
					continue;
				}
				// AQUI COMEÇA A PUTARIA
				Matcher matcherNumber = CompilerPatterns.VERIFY_NUMBER.getPattern().matcher(word);
				if (matcherNumber.find()) { // verifica se é um número
					validateNumber(word, 1);
					continue;
				}

				Matcher matcherSymbol = CompilerPatterns.VERIFY_VALID_SYMBOL.getPattern().matcher(word);
				if (matcherSymbol.find()) { // verifica se é um simbolo válido
					validateSymbol(word, 1);
					continue;
				}
			}
		}
		return c;
	}

	private static void validateNumber(String word, int lineNumber) {
		// valida o Motor
		Matcher matcherNumber = CompilerPatterns.CHECK_ENGINE.getPattern().matcher(word);
		if (matcherNumber.matches()) {
			return;
		}

		// valida o Ano
		matcherNumber = CompilerPatterns.CHECK_YEAR.getPattern().matcher(word);
		if (matcherNumber.matches()) {
			return;
		}

		// valida o KM
		matcherNumber = CompilerPatterns.CHECK_KM.getPattern().matcher(word);
		if (matcherNumber.matches()) {
			return;
		}

		// Se chegar aqui, deve dar throw na exception que o Matheus lixo vai commitar
		throw new IllegalArgumentException();
	}

	private static void validateSymbol(String word, int lineNumber) {
		// Valida o combustível
		Matcher matcherNumber = CompilerPatterns.VERIFY_COMB.getPattern().matcher(word);
		if (matcherNumber.matches()) {
			return;
		}

		// Valida o Valor
		matcherNumber = CompilerPatterns.CHECK_MONEY.getPattern().matcher(word);
		if (matcherNumber.matches()) {
			return;
		}

		// Se chegar aqui, deve dar throw na exception que o Matheus lixo vai commitar
		throw new IllegalArgumentException();
	}

}
