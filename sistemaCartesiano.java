import java.util.*;
public class sistemaCartesiano {
	public static void main(String[] args) {
			Scanner ent = new Scanner (System.in);
			
			double x,y;
			
			System.out.println("Descubra em qual quadrante est�o sua coordenadas(x,y)");
			System.out.println("Digite a 1� coordenada (x): ");
			x = ent.nextDouble();
			System.out.println("Digite a 2� coordenada (y): ");
			y = ent.nextDouble();
			
			if (x > 0 && y > 0) {
				System.out.println("Est� no 1� Quadrante");
			}else if (x < 0 && y > 0){
				System.out.println("Est� no 2� Quadrante");
			  }	else if (x<0 && y<0){
					System.out.println("Est� no 3� Quadrante");
			  }		else if (x>0 && y<0){
						System.out.println("Est� no 4� Quadrante");
			  }			else if (x == 0 && y == 0){
							System.out.println("N�o est� em nenhum quadrante");
			  }				else if (x==0 && y != 0) {
								System.out.println("est� no eixo x");
			  }					else if (x!=0 && y == 0) {
				  					System.out.println("est� no eixo y");
			  }
	}
}
