import java.util.*;
public class CustoCarroConsumidor {
	public static void main(String[] args) {
			double n1,n2,media;
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Descubra sua m�dia...");
			System.out.println("Digite sua a 1� nota: ");
			n1 = scan.nextDouble();
			System.out.println("Digite sua a 2� nota: ");
			n2 = scan.nextDouble();
			
			media = (n1 + n2) / 2;
			
			if(media < 4){
				System.out.printf("Sua m�dia foi: %2.f, voce est� reprovado!",media);
			}else if(media < 7){
				System.out.printf("Sua m�dia foi: %2.f, voce est� de exame!",media);
			}else{
				System.out.printf("Sua m�dia foi: %2.f, voce est� aprovado!",media);
			}
			scan.close();
	}
}
