package escola;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(){
        this.salario++;
        System.out.println("Parabéns pelo aumento");
    }
}
