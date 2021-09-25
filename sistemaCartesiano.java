import java.util.*;
public class sistemaCartesiano {
	public static void main(String[] args) {
			Scanner ent = new Scanner (System.in);
			
			double x,y;
			
			System.out.println("Descubra em qual quadrante estão sua coordenadas(x,y)");
			System.out.println("Digite a 1ª coordenada (x): ");
			x = ent.nextDouble();
			System.out.println("Digite a 2ª coordenada (y): ");
			y = ent.nextDouble();
			
			if (x > 0 && y > 0) {
				System.out.println("Está no 1º Quadrante");
			}else if (x < 0 && y > 0){
				System.out.println("Está no 2º Quadrante");
			  }	else if (x<0 && y<0){
					System.out.println("Está no 3º Quadrante");
			  }		else if (x>0 && y<0){
						System.out.println("Está no 4º Quadrante");
			  }			else if (x == 0 && y == 0){
							System.out.println("Não está em nenhum quadrante");
			  }				else if (x==0 && y != 0) {
								System.out.println("está no eixo x");
			  }					else if (x!=0 && y == 0) {
				  					System.out.println("está no eixo y");
			  }
	}
}
