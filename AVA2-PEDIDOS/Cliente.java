public class Cliente {
    private String nomeCliente;
    private int cpfCliente;
    private int telefoneCliente;
    private Endereco enderecoCliente;

    //Construtor
    public Cliente (String nomeCliente, int cpfCliente, int telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public int getTelefoneCliente() {
        return telefoneCliente;
    }
}