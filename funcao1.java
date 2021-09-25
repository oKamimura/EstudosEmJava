		import java.util.Scanner;
			public class funcao1{
					public static void main(String[] args) {
						Scanner ent = new Scanner(System.in);
						double x,fx;
						System.out.println("Cálculo do valor de uma função f(x) = 8 / (2 - x)");
						System.out.println("Digite o valor de x (inteiro):");
						x = ent.nextDouble();
						if (x == 2) { System.out.println("ERRO! Não existe divisão por ZERO!!!!");}
						else {
						fx = 8 / (2 - x);
						System.out.printf("\n Se x = %.0f , então f(%.0f) = %.2f",x,x,fx);
		}
		
	}
}