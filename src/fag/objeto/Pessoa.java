package fag.objeto;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        setNome(nome);
        setPeso(peso);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("O peso deve ser maior que 0.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("A altura deve ser maior que 0.");
        }
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Normal";
        else if (imc < 30) return "Sobrepeso";
        else if (imc < 35) return "Obesidade Grau I";
        else if (imc < 40) return "Obesidade Grau II";
        else return "Obesidade Grau III";
    }
}
