
package banco;
public class contaBanco {
    public static void main(String[] args) {
       Banco c1 = new Banco();
       c1.setNumConta(0001);
       c1.setDono("Mariane pintucci");
       c1.abrirConta("Conta corrente");
       c1.depositar(300);
       c1.sacar(150);
      
            
       c1.estadoAtual();
       
       
    }
    
}
