import java.util.*;
public class EquacaoDeSegundoGrau {
	public static void main(String[] args) {
		  	Scanner ent = new Scanner (System.in);
		  	double preco;
		  	int escolha;
		  	char situ;
		  	
		  	System.out.println("Digite o valor do produto:");
		  	preco = ent.nextDouble();
		  	System.out.println("Escolha\n 1-Limpeza\n 2-Alimenta��o\n 3-Vestuario ");
		  	escolha =ent.nextInt();
		  	System.out.println("Escolha\n R-Produtos que necessitam de refrigera��o\n N-Produtos que n�o necessitam de refrigera�ao");
		  	situ = ent.next().charAt(0);
		  	
		  	if (escolha == 1 && situ == 'R'){
		  		System.out.printf("Pre�o R$ %.2f, limpeza, necessita de refrigera��o",preco);
		  	}else if (escolha == 1 && situ == 'N') {
		  		System.out.printf("Pre�o R$ %.2f, limpeza, n�o necessita de refrigera��o",preco);
		  	}else if (escolha == 2 && situ == 'R') {
		  		System.out.printf("Pre�o R$ %.2f, limpeza, necessita de refrigera��o",preco);
		  	}else if (escolha == 2 && situ == 'N') {
		  		System.out.printf("Pre�o R$ %.2f, limpeza, n�o necessita de refrigera��o",preco);
		  	}else if (escolha == 3 && situ == 'R') {
		  		System.out.printf("Pre�o R$ %.2f, limpeza, necessita de refrigera��o",preco);
		  	}else if (escolha == 3 && situ == 'N') {
		  		System.out.printf("Pre�o R$ %.2f, limpeza, n�o necessita de refrigera��o",preco);
		  	}else {
		  		System.out.println("ERRO!");
		  	}
		  	
		  	
		  
	}
}


