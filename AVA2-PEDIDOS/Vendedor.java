public class Vendedor {

    private String nomeVendedor;
    private int matriculaVendedor;

    public Vendedor (String nomeVendedor, int matriculaVendedor) {
        this.nomeVendedor = nomeVendedor;
        this.matriculaVendedor = matriculaVendedor;
    }

    public int getMatriculaVendedor() {
        return matriculaVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }   
}
