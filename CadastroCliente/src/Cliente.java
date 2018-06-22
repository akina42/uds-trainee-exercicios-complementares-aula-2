import java.util.UUID;

public abstract class Cliente {

    protected final UUID uuidCliente;
    protected String nomeCliente;
    protected String emailCliente;
    protected String telefoneCliente;

    public Cliente(String nomeCliente, String emailCliente, String telefoneCliente){
        this.uuidCliente = UUID.randomUUID();
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public UUID getUuidCliente() {
        return uuidCliente;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    protected abstract String retornaDadosCliente();
}
