package main;

import main.regra.RegraDeNegocio;

public class Main {
	public static void main(String[] args) {
		int consumo[][] = new int[10][12];
		consumo[0][0] = 50;
		consumo[1][0] = 100;
		consumo[5][0] = 30;
		consumo[9][0] = 10;
		consumo[0][1] = 60;
		consumo[3][1] = 70;	
		consumo[9][9] = 200;
		consumo[9][5] = 300;	
		
		RegraDeNegocio.somaConsumo(consumo);
		RegraDeNegocio.mediaConsumo();
		RegraDeNegocio.maiorConsumo(consumo);
		
		
	}



}
