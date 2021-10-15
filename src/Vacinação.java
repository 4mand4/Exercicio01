import java.util.Scanner;

public class Vacinação {

	public static void main(String[] args) {

		int N, M;
		int[] p = new int[10];
		int[] s = new int[10];
		int[] total = new int[10];
		int mes = 0;
		int maior = 0;
		double soma = 0;
		double soma2 = 0;
		int teste = 0;

		Scanner in = new Scanner(System.in);
		System.out.printf("Informe o número de habitantes: ");
		N = in.nextInt();
		System.out.printf("Informe o número de meses: ");
		M = in.nextInt();

		if ((N >= 10000 && N <= 1000000000) && (M >= 1 && M <= 10)) {
			for (int i = 0; i < M; i++) {
				System.out.printf("Informe a quantidade de pessoas vacinadas com a 1ª dose no mês %d : ", i + 1);
				p[i] = in.nextInt();
				teste = p[i];
				if (teste >= 0 && teste <= N || soma < N) {
					soma = soma + p[i];
					if (soma > N) {
						break;
					}

				} else {
					break;
				}
			}

			if (teste > N || soma > N) {
				System.out.printf("Erro! Número de vacinados maior que o de habitantes. \n");
			} else {
				for (int j = 0; j < M; j++) {
					System.out.printf("Informe a quantidade de pessoas vacinadas com a 2ª dose no mês %d : ", j + 1);
					s[j] = in.nextInt();
					soma2 = soma2 + s[j];

					if (soma2 > N) {
						System.out.printf("Erro! Número de vacinados maior que o de habitantes. \n");
						break;
					} else {
						total[j] = p[j] + s[j];
						if (maior < total[j]) {
							maior = total[j];
							mes = j + 1;

						}

					}

				}
			}

		} else {
			System.out.printf("Erro \n");
		}
		double percentual1 = (soma / N) * 100;
		double percentual2 = (soma2 / N) * 100;
		System.out.printf("%.1f \n", percentual1);
		System.out.printf("%.1f \n", percentual2);
		System.out.println(mes);
		in.close();
	}

}
