public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Iphone 18", 6000.00, 10);
        try {
            produto1.setPreco(-50.00);
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }


        Produto produto2 = new Produto("Mouse Gamer", 150.00, 20);


        Produto produto3 = new Produto("Teclado Gamer", 250.00, 8);


        Produto produto4 = new Produto("Mouse", 100, 5);
        produto4.setPreco(250.00);


        Produto produto5 = new Produto("Monitor Gamer", 200.00, 5);

        try {
            Produto produto6 = new Produto("", 500.00, 3);
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

        System.out.println("===============");
        produto1.exibirInformacoes();
        System.out.println("===============");
        produto2.exibirInformacoes();
        System.out.println("===============");
        produto3.exibirInformacoes();
        System.out.println("===============");
        produto4.exibirInformacoes();
        System.out.println("===============");
        produto5.exibirInformacoes();
        System.out.println("===============");


        double valorEstoque1 = produto1.calcularValorEstoque();
        double valorEstoque2 = produto2.calcularValorEstoque();
        double valorEstoque3 = produto3.calcularValorEstoque();
        double valorEstoque4 = produto4.calcularValorEstoque();
        double valorEstoque5 = produto5.calcularValorEstoque();


        System.out.println("O total de estoque do Iphone 18 é: " + valorEstoque1);
        System.out.println("O total de estoque do Mouse Gamer é: " + valorEstoque2);
        System.out.println("O total de estoque do Teclado Gamer é: " + valorEstoque3);
        System.out.println("O total de estoque do Mouse é: " + valorEstoque4);
        System.out.println("O total de estoque do Monitor Gamer é: " + valorEstoque5);

        double valorTotalEstoque = valorEstoque1 + valorEstoque2 + valorEstoque3
                + valorEstoque4 + valorEstoque5;
        System.out.println("Valor total do estoque é: " + valorTotalEstoque);
    }

}
