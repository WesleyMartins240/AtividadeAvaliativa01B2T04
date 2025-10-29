package fag.objeto;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            throw new IllegalArgumentException("A temperatura não pode ser menor que -273.15°C (zero absoluto).");
        }
    }

    public double paraFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double paraKelvin() {
        return celsius + 273.15;
    }
}
