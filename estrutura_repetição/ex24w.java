package estrutura_repetição;

import java.util.Scanner;

public class ex24w {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, t, i;

		i = 1;
		num = 5;
		
		while (i <= 10) {
			t = 5 * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
			i++;
		}
		ler.close();
	}
}
