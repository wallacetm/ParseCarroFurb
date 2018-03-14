package br.com.furb;

import java.util.regex.Matcher;

public class CarroParser {
	
	public static Carro processar(String entrada) {
		Carro c = new Carro();
		for(String line : entrada.split("\n|\r\n")){
			for(String word : line.split("\\s")){
				if(word.trim().isEmpty()){
					continue;
				}
				//AQUI COMEÇA A PUTARIA
				Matcher matcherNumber = CompilerPatterns.VERIFY_NUMBER.getPattern().matcher(word);
				if(matcherNumber.find()){ //verifica se é um número
					validateNumber(word, 1);
					continue;
				}
				
				Matcher matcherSymbol = CompilerPatterns.VERIFY_VALID_SYMBOL.getPattern().matcher(word);
				if(matcherSymbol.find()){ //verifica se é um simbolo válido
					validateSymbol(word, 1);
					continue;
				}
			}
		}
		return c;
	}
	
	private static void validateNumber(String word, int lineNumber){
		//valida o Motor
		
		//valida o Ano
		
		//valida o KM
	}
	
	private static void validateSymbol(String word, int lineNumber){
		// Valida o combustível
		
		//Valida o Valor
	}
	
}
