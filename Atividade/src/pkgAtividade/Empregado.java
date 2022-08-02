package pkgAtividade;

public class Empregado {
	private String nome;
    private int horasTrabalhadasNoMes;
    private double salarioPorHora;

    public Empregado() {

    }

    // declarando parametros
    public Empregado(String nome, int horasTrabalhadasNoMes, double salarioPorHora) {
        this.nome = nome;
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
        this.salarioPorHora = salarioPorHora;
    }

    //

    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int gethorasTrabalhadasNoMes() {
        return this.horasTrabalhadasNoMes;
    }

    public void sethorasTrabalhadasNoMes(int horasTrabalhadasNoMes) {
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
    }

    public double getalarioPorHora() {
        return this.salarioPorHora;
    }

    public void setsalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    // metodo
    public double calculaSalarioMensal()
{
    	return salarioPorHora * horasTrabalhadasNoMes;
    }


}


