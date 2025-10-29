package fag.objeto;

public class BicicletaAlugada {
    private int horas;
    private double valorHora;

    public BicicletaAlugada(int horas, double valorHora) {
        setHoras(horas);
        setValorHora(valorHora);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 1) {
            this.horas = horas;
        } else {
            throw new IllegalArgumentException("As horas devem ser no mínimo 1.");
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            throw new IllegalArgumentException("O valor por hora deve ser maior que 0.");
        }
    }

    public double calcularValor() {
        return horas * valorHora;
    }
}
