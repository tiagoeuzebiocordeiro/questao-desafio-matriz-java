import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		double[][] mat = new double[N][N];
		// ENTRADA DE DADOS DA MATRIZ E OBTENÇÃO DOS VALORES POSITIVOS PARA EFETUAR A SOMA (ITEM A - FEITO)
		double somaPositivos = 0.0;
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				mat[i][j] = sc.nextDouble();
				if (mat[i][j] > 0) {
					somaPositivos += mat[i][j];
				}
			}
		}
		int linhaEscolhida = sc.nextInt();
		int colunaEscolhida = sc.nextInt();
		System.out.println("SOMA DOS POSITIVOS: " + somaPositivos);
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = linhaEscolhida; i <= linhaEscolhida; i++) {
			for (int j = 0; j<N;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < N; i++) {
			for (int j = colunaEscolhida; j <= colunaEscolhida; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
		}
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i<N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2.0);
				}
			}
		}
		
		System.out.println("MATRIZ ALTERADA: ");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}