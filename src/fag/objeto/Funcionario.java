package fag.objeto;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario() {
	}
	public Funcionario(String nome, double salario) {
	
	setNome(nome);
	setSalario(salario);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank());{
			this.nome = nome;
		}
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario>=0);{
		this.salario = salario;
	}
	}
		public void aumentarSalario(double percentual) {
			salario += ((percentual/100)*salario);
				
			}	

	}
