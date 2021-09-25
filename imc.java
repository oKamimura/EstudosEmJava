import java.util.*;
public class imc {
	public static void main(String[] args) {
			Scanner ent = new Scanner (System.in);
			double peso, altura, imc;
			
			System.out.println("Cálculo de seu indice de massa corporea (IMC)...");
			System.out.println("Digite seu peso: ");
			peso = ent.nextDouble();
			
			System.out.println("Digite seu altura: ");
			altura = ent.nextDouble();
			
			imc = peso / Math.pow(altura, 2);
			
			if (imc < 20) {
				System.out.printf("Seu imc é: %.2f e seu estado é abaixo do peso",imc);
			}else if (imc < 25) {
				System.out.printf("Seu imc é: %.2f e seu estado é peso normal",imc);
			}else if (imc < 30) {
				System.out.printf("Seu imc é: %.2f e seu estado é sobrePeso",imc);				
			}else if (imc < 40) {
				System.out.printf("Seu imc é: %.2f e seu estado é Obeso",imc);
			}else {
				System.out.printf("Seu imc é: %.2f e seu estado é Morbido",imc);
			}
	}

}
		