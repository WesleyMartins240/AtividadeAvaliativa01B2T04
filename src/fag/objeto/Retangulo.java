package fag.objeto;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("A largura deve ser maior que 0.");
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

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }
}
