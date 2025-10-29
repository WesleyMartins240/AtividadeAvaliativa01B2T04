package fag;

import java.util.Scanner;

import fag.objeto.Banco;
import fag.objeto.BicicletaAlugada;
import fag.objeto.ContaLuz;
import fag.objeto.Filme;
import fag.objeto.Funcionario;
import fag.objeto.Musica;
import fag.objeto.Pessoa;
import fag.objeto.ProdutoEstoque;
import fag.objeto.Retangulo;
import fag.objeto.Temperatura;


public class Principal {

	public static void main(String[] args) {
		
		atividadeUm();
		atividadeDois();
		atividadeTres();
		atividadeQuatro();
		atividadeCinco();
		atividadeSeis();
		atividadeSete();
		atividadeOito();
		atividadeNove();
		atividadeDez();
		
		
	}

	public static void atividadeUm() {
		Banco conta1 = new Banco("Wesley", 0);
		Scanner tradutor = new Scanner(System.in);
		System.out.println("Quanto precisa depositar?");
		conta1.depositar(tradutor.nextDouble());
		System.out.println("Quanto precisa sacar?");
		conta1.sacar(tradutor.nextDouble());
		
		
		System.out.println("Titular da conta: " + conta1.getTitular());
		System.out.println("Saldo da conta: " + conta1.getSaldo());
		
		
	}
	public static void atividadeDois() {
		
		Filme filme1 = new Filme("Pequeno principe", 3);
		Scanner tradutor = new Scanner(System.in);
		Filme filme2 = new Filme("Biblia", 4);	
		
		System.out.println("Nome do filme: " + filme1.getTitulo());
		System.out.println("Avaliação: " + filme1.getAvaliacao());
		System.out.println("Nome do filme: " + filme2.getTitulo());
		System.out.println("Avaliação: " + filme2.getAvaliacao());
	}
	public static void atividadeTres() {
		
		Funcionario funcionario1 = new Funcionario("Wesley", 1000);
		Scanner tradutor = new Scanner(System.in);
		Funcionario funcionario2 = new Funcionario("Paulo", 2000);	
		System.out.println("Qual o percentual que deseja aplicar?");
		funcionario1.setSalario(tradutor.nextDouble());
		
		System.out.println("Nome Funcionário: " + funcionario1.getNome());
		System.out.println("Salário: " + funcionario1.getSalario());
		System.out.println("Nome Funcionário: " + funcionario2.getNome());
		System.out.println("Salário: " + funcionario2.getSalario());
	}
	public static void atividadeQuatro() {
		Scanner tradutor = new Scanner(System.in);
		System.out.println("=== ATIVIDADE 4: RETÂNGULO ===");
		
		System.out.print("Informe a largura: ");
		double largura = tradutor.nextDouble();
		System.out.print("Informe a altura: ");
		double altura = tradutor.nextDouble();
		
		Retangulo ret = new Retangulo(largura, altura);
		
		System.out.println("Área: " + ret.area());
		System.out.println("Perímetro: " + ret.perimetro());
	}
	
	public static void atividadeCinco() {
		System.out.println("=== ATIVIDADE 5: MÚSICA ===");
		
		Musica m1 = new Musica("Yesterday", 125);
		Musica m2 = new Musica("Imagine", 200);
		
		System.out.println(m1.getTitulo() + " - " + m1.formatarDuracao());
		System.out.println(m2.getTitulo() + " - " + m2.formatarDuracao());
	}
	
	public static void atividadeSeis() {
		System.out.println("=== ATIVIDADE 6: PESSOA (IMC) ===");
		
		Pessoa p1 = new Pessoa("Wesley", 80, 1.75);
		System.out.println("IMC de " + p1.getNome() + ": " + String.format("%.2f", p1.calcularIMC()));
		System.out.println("Classificação: " + p1.classificacaoIMC());
	}
	
	public static void atividadeSete() {
		System.out.println("=== ATIVIDADE 7: CONTA DE LUZ ===");
		
		ContaLuz conta = new ContaLuz(250, 0.75);
		System.out.println("Valor total a pagar: R$ " + String.format("%.2f", conta.calcularValorTotal()));
	}
	
	public static void atividadeOito() {
		System.out.println("=== ATIVIDADE 8: ALUGUEL DE BICICLETA ===");
		
		BicicletaAlugada bike = new BicicletaAlugada(3, 12.5);
		System.out.println("Valor do aluguel: R$ " + String.format("%.2f", bike.calcularValor()));
	}
	
	public static void atividadeNove() {
		System.out.println("=== ATIVIDADE 9: PRODUTO EM ESTOQUE ===");
		
		ProdutoEstoque prod = new ProdutoEstoque("Notebook", 10);
		prod.adicionarEstoque(5);
		prod.removerEstoque(3);
		System.out.println("Quantidade final de " + prod.getNome() + ": " + prod.getQuantidade());
	}
	
	public static void atividadeDez() {
		System.out.println("=== ATIVIDADE 10: TEMPERATURA ===");
		
		Temperatura temp = new Temperatura(25);
		System.out.println("Celsius: " + temp.getCelsius());
		System.out.println("Fahrenheit: " + temp.paraFahrenheit());
		System.out.println("Kelvin: " + temp.paraKelvin());
	}


}
