package fag.objeto;

public class Banco {

	private String titular;
	public Banco(String titular, double saldo) {
		setTitular(titular);
		setSaldo(saldo);
	
			}
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if (titular != null && !titular.isBlank());{
		this.titular = titular;
	}
		}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo >= 0) {
		this.saldo = saldo;
	}
		}
	
	public void depositar(double valor) {
		if(valor >=0) saldo +=valor;{
			
		}
		
		
	}
	public void sacar(double saque) {
		if(saque >=0) saldo -=saque;{
			
		}
		
}

}
