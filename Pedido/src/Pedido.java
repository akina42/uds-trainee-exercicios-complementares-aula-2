import java.util.ArrayList;

public class Pedido {
    private Double valorPedido;
    private ArrayList<Produto> produtosPedido = new ArrayList<>();


    public void adicionarProduto(Produto produto){
       this.produtosPedido.add(produto);
    }

    public Double calcularTotalPedido(){
        this.valorPedido = 0.0;
        this.produtosPedido.stream().forEach(produto -> {
            this.valorPedido += produto.getValorProduto();

        });
        return this.valorPedido;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public ArrayList<Produto> getProdutosPedido() {
        return produtosPedido;
    }

    public void setProdutosPedido(ArrayList<Produto> produtosPedido) {
        this.produtosPedido = produtosPedido;
    }
}
