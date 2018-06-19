public class Main {


    public static void main(String[] args){

        System.out.println("\nSistema de Vendas");

        Produto produto1 = new Produto("Caneca", 29.99);
        Produto produto2 = new Produto("Quadro", 39.99);
        Produto produto3 = new Produto ("Funko POP", 49.99);
        Produto produto4 = new Produto("Livro", 59.99);
        Produto produto5 = new Produto("Camiseta", 69.99);


        Pedido pedido = new Pedido();
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);
        pedido.adicionarProduto(produto4);
        pedido.adicionarProduto(produto5);

        System.out.println("\nTotal do pedido: " + pedido.calcularTotalPedido());

    }


}
