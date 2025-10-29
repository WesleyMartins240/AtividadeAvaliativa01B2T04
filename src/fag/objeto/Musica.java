package fag.objeto;

public class Musica {
    private String titulo;
    private int duracaoSegundos;

    public Musica(String titulo, int duracaoSegundos) {
        setTitulo(titulo);
        setDuracaoSegundos(duracaoSegundos);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        if (duracaoSegundos > 0) {
            this.duracaoSegundos = duracaoSegundos;
        } else {
            throw new IllegalArgumentException("A duração deve ser maior que zero.");
        }
    }

    public String formatarDuracao() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }
}
