public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public Produto(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco < 0) {
            throw new IllegalArgumentException("Preço Inválido");
        }
        this.preco = novoPreco;
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade Inválida");
        }
        this.quantidade = novaQuantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        if (novoNome == null || novoNome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = novoNome;
    }
}



