
public class ContaBancaria {

	private String nome;
	private int numero;
	private double saldo;
	private	boolean estado;
	
	public ContaBancaria(String nom, int num, double sal, boolean est){
		this.nome = nom;
		this.numero = num;
		this.saldo = sal;
		this.estado = est;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
