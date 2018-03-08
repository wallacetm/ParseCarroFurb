package br.com.furb;

public enum RegexEnum {
	
	SPLIT("\\s+|(\\n\\r)+"),
	/**
	 * 01, R$01,00
	 */
	CHECK_ZERO_BEFORE("(^|R\\$)0[1-9]"),
	/**
	 * Checa se é um motor
	 */
	CHECK_MOTOR("[0-9]\\.[0-9]$"),
	/**
	 * 
	 */
	
	;
	
	private String regex;
		
	private RegexEnum(String regex){
		this.regex = regex;
	}
	
	public String getRegex(){
		return regex;
	}
}
