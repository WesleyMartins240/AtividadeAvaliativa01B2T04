package fag.objeto;

public class ContaLuz {
    private double consumoKwh;
    private double valorKwh;

    public ContaLuz(double consumoKwh, double valorKwh) {
        setConsumoKwh(consumoKwh);
        setValorKwh(valorKwh);
    }

    public double getConsumoKwh() {
        return consumoKwh;
    }

    public void setConsumoKwh(double consumoKwh) {
        if (consumoKwh > 0) {
            this.consumoKwh = consumoKwh;
        } else {
            throw new IllegalArgumentException("O consumo deve ser maior que 0.");
        }
    }

    public double getValorKwh() {
        return valorKwh;
    }

    public void setValorKwh(double valorKwh) {
        if (valorKwh > 0) {
            this.valorKwh = valorKwh;
        } else {
            throw new IllegalArgumentException("O valor por kWh deve ser maior que 0.");
        }
    }

    public double calcularValorTotal() {
        return consumoKwh * valorKwh;
    }
}
