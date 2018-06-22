public class Main {

    //FIXME Melhorar tratamento de exceção. Não abusar de try/catch/finally.

    public static void main(String[] args) throws IllegalArgumentException{

        System.out.println("\n---------------CADASTRO DE CLIENTES---------------\n");

        String cpf = "22222222222";
        String nomePessoaFisica = "Marcelo Oliveira";
        String emailPessoaFisica = "marcelooliveira@gmail.com";
        String telefonePessoaFisica = "44999852541";
        ClientePessoaFisica pessoaFisica;

        try{
            pessoaFisica = new ClientePessoaFisica(cpf, nomePessoaFisica,
                    emailPessoaFisica, telefonePessoaFisica);
            System.out.println("\n\nCliente cadastrado: \n\n" + pessoaFisica.retornaDadosCliente());
        }
        catch(IllegalArgumentException e){
            System.out.println("\n\nCadastro não efetuado. CPF inválido.");
        }


        String cnpj = "84637738000154";
        String nomeFantasia = "Souza Distribuições";
        String emailEmpresa = "contato@souzadistribuicoes.com";
        String telefoneEmpresa = "4430239635";
        ClientePessoaJuridica pessoaJuridica;


        try{
            pessoaJuridica = new ClientePessoaJuridica(cnpj, nomeFantasia,
                    emailEmpresa, telefoneEmpresa);
            System.out.println("\n\nCliente cadastrado: \n\n" + pessoaJuridica.retornaDadosCliente());
        }
        catch(IllegalArgumentException e){
            System.out.println("\n\nCadastro não efetuado. CNPJ inválido.");
        }

    }
}
