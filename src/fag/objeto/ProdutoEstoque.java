package fag.objeto;

public class ProdutoEstoque {
    private String nome;
    private int quantidade;

    public ProdutoEstoque(String nome, int quantidade) {
        setNome(nome);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            this.quantidade -= qtd;
        } else {
            throw new IllegalArgumentException("Quantidade inválida para remoção.");
        }
    }
}
