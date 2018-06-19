public class Produto {
    private String nomeProduto;
    private Double valorProduto;

    public Produto(String nomeProduto, Double valorProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
}
