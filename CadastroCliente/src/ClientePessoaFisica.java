public class ClientePessoaFisica extends Cliente{

    private final String cpf;

    public ClientePessoaFisica(String cpfEntrada, String nomeCliente,
                               String emailCliente, String telefoneCliente) throws IllegalArgumentException{
        super(nomeCliente, emailCliente, telefoneCliente);
        CPF cpf = new CPF();
        if (cpf.validaDocumento(cpfEntrada)) this.cpf = cpfEntrada;
        else throw new IllegalArgumentException();
    }

    @Override
    public String retornaDadosCliente() {
        String dadosPessoais =
                "UUID: " + this.uuidCliente + "\n" +
                "CPF: " + this.cpf + "\n" +
                "Nome: " + this.nomeCliente + "\n" +
                "E-mail: " + this.emailCliente + "\n" +
                "Telefone: " + this.telefoneCliente + "\n";

        return dadosPessoais;
    }
}
