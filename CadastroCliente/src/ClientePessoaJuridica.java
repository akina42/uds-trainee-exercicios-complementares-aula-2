public class ClientePessoaJuridica extends Cliente {

    private final String cnpj;

    public ClientePessoaJuridica(String cnpjEntrada, String nomeCliente,
                                 String emailCliente, String telefoneCliente) throws IllegalArgumentException{
        super(nomeCliente, emailCliente, telefoneCliente);
        CNPJ cnpj = new CNPJ();
        if (cnpj.validaDocumento(cnpjEntrada)) this.cnpj = cnpjEntrada;
        else throw new IllegalArgumentException();
    }

    @Override
    public String retornaDadosCliente() {
        String dadosPessoais =
                "UUID: " + this.uuidCliente + "\n" +
                "CNPJ: " + this.cnpj + "\n" +
                "Nome Fantasia: " + this.nomeCliente + "\n" +
                "E-mail: " + this.emailCliente + "\n" +
                "Telefone: " + this.telefoneCliente + "\n";

        return dadosPessoais;
    }
}
