package main.regra;

public class RegraDeNegocio {

	private static int somaConsumo[][] = new int[1][12];

	public static void somaConsumo(int[][] consumo) {
		for (int i = 0; i < consumo.length; i++) {
			for (int j = 0; j < consumo[i].length; j++) {
				switch (j) {
				case 0 -> somaConsumo[0][j] += consumo[i][j];
				case 1 -> somaConsumo[0][j] += consumo[i][j];
				case 2 -> somaConsumo[0][j] += consumo[i][j];
				case 3 -> somaConsumo[0][j] += consumo[i][j];
				case 4 -> somaConsumo[0][j] += consumo[i][j];
				case 5 -> somaConsumo[0][j] += consumo[i][j];
				case 6 -> somaConsumo[0][j] += consumo[i][j];
				case 7 -> somaConsumo[0][j] += consumo[i][j];
				case 8 -> somaConsumo[0][j] += consumo[i][j];
				case 9 -> somaConsumo[0][j] += consumo[i][j];
				case 10 -> somaConsumo[0][j] += consumo[i][j];
				case 11 -> somaConsumo[0][j] += consumo[i][j];

				default -> throw new IllegalArgumentException("Unexpected value: " + j);
				}
			}
		}

	}

	public static void mediaConsumo() {
		float media[][] = new float[1][12];
		for (int i = 0; i < somaConsumo.length; i++) {
			for (int j = 0; j < somaConsumo[i].length; j++) {
				media[i][j] = somaConsumo[i][j] / somaConsumo[i].length;
				switch (j) {
				case 0 -> System.out.println("Janeiro: " + media[i][j]);
				case 1 -> System.out.println("Fevereio: " + media[i][j]);
				case 2 -> System.out.println("Março: " + media[i][j]);
				case 3 -> System.out.println("Abril: " + media[i][j]);
				case 4 -> System.out.println("Maio: " + media[i][j]);
				case 5 -> System.out.println("Junho: " + media[i][j]);
				case 6 -> System.out.println("Julho: " + media[i][j]);
				case 7 -> System.out.println("Agosto: " + media[i][j]);
				case 8 -> System.out.println("Setembro: " + media[i][j]);
				case 9 -> System.out.println("Outubro: " + media[i][j]);
				case 10 -> System.out.println("Novembro: " + media[i][j]);
				case 11 -> System.out.println("Dezembro: " + media[i][j]);

				default -> throw new IllegalArgumentException("Unexpected value: " + j);
				}

			}
		}
	}

	public static void maiorConsumo(int[][] consumo) {
		int ano = Integer.MIN_VALUE;
		int valor = 0;
		Enum mes = null;

		for (int i = 0; i < consumo.length; i++) {
			for (Integer j = 0; j < consumo[i].length; j++) {
				if (consumo[i][j] > valor) {
					valor = consumo[i][j];
					ano = i;
					mes = Meses.toEnum(j);
				}

			}

		}
		switch (ano) {
		case 0 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2010 no mês de " + mes);
		case 1 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2011 no mês de " + mes);
		case 2 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2012 no mês de " + mes);
		case 3 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2013 no mês de " + mes);
		case 4 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2014 no mês de " + mes);
		case 5 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2015 no mês de " + mes);
		case 6 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2016 no mês de " + mes);
		case 7 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2017 no mês de " + mes);
		case 8 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2018 no mês de " + mes);
		case 9 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2019 no mês de " + mes);
		case 10 -> System.out.println("O maior consumo foi " + valor + ", no ano de 2020 no mês de " + mes);
		default -> throw new IllegalArgumentException("Unexpected value: " + ano);
		}
	}
}
