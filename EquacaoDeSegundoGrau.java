import java.util.*;
public class EquacaoDeSegundoGrau {
	public static void main(String[] args) {
		  	Scanner ent = new Scanner (System.in);
		  	double preco;
		  	int escolha;
		  	char situ;
		  	
		  	System.out.println("Digite o valor do produto:");
		  	preco = ent.nextDouble();
		  	System.out.println("Escolha\n 1-Limpeza\n 2-Alimentação\n 3-Vestuario ");
		  	escolha =ent.nextInt();
		  	System.out.println("Escolha\n R-Produtos que necessitam de refrigeração\n N-Produtos que não necessitam de refrigeraçao");
		  	situ = ent.next().charAt(0);
		  	
		  	if (escolha == 1 && situ == 'R'){
		  		System.out.printf("Preço R$ %.2f, limpeza, necessita de refrigeração",preco);
		  	}else if (escolha == 1 && situ == 'N') {
		  		System.out.printf("Preço R$ %.2f, limpeza, não necessita de refrigeração",preco);
		  	}else if (escolha == 2 && situ == 'R') {
		  		System.out.printf("Preço R$ %.2f, limpeza, necessita de refrigeração",preco);
		  	}else if (escolha == 2 && situ == 'N') {
		  		System.out.printf("Preço R$ %.2f, limpeza, não necessita de refrigeração",preco);
		  	}else if (escolha == 3 && situ == 'R') {
		  		System.out.printf("Preço R$ %.2f, limpeza, necessita de refrigeração",preco);
		  	}else if (escolha == 3 && situ == 'N') {
		  		System.out.printf("Preço R$ %.2f, limpeza, não necessita de refrigeração",preco);
		  	}else {
		  		System.out.println("ERRO!");
		  	}
		  	
		  	
		  
	}
}


