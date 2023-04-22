package main.regra;

public enum Meses {
	
	JANEIRO(0, "Janeiro"),
	FEVEREIRO(1, "Fevereiro"),
	MARÇO(2, "Março"),
	ABRIL(3, "Abril"),
	MAIO(4, "Maio"),
	JUNHO(5, "Junho"),
	JULHO(6, "Julho"),
	AGOSTO(7, "Agosto"),
	SETEMBRO(8, "Setembro"),
	OUTUBRO(9, "Outubro"),
	NOVEMBRO(10, "Novembro"),
	DEZEMRBO(11, "Dezembro");
	
	private Integer cod;
	private String mes;
	
	
	private Meses(Integer cod, String mes){
		this.cod = cod;
		this.mes = mes;
		
	}

	public Integer getCod() {
		return cod;
	}

	public String getMes() {
		return mes;
	}
	
	public static Meses toEnum(Integer cod) {
		try {
		if(cod == null) {
			return null;
		}
		for(Meses x : Meses.values()) {
			if(cod == x.getCod()) {
				return x;
			}
		}
		}catch(Exception e) {
			throw new IllegalArgumentException("Codígo inválido: " + cod);			
		}
		return null;
		
		
	}
	

}
