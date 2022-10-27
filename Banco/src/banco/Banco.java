
package banco;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "Conta corrente") {
            this.setSaldo(150);
        } else if (t == "Polpança") {
            this.setSaldo(50);    
        } System.out.println("Conta aberta com sucesso! Seu saldo é "+ this.saldo);
    }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Você ainda tem saldo em conta e ela não poderá ser encerrada!");
        } else if(this.getSaldo()<0) {
            System.out.println("Seu saldo em conta está negativo. Você precisa quita-lo antes de encerrar sua conta.");
        } else {
            this.setStatus(false);
            System.out.println("A conta foi encerrada.");
        }
    }
    public void depositar(float v){
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Depositado realizado na conta de "+ this.getDono());
        }else{
            System.out.println("Você ainda não tem conta, deseja abrir uma?");
        }
        
    }
    public void sacar(float d){
        if (this.getStatus()){
            if (this.getSaldo() >= d){
                this.setSaldo(this.getSaldo() - d);
                System.out.println("O saque foi realizado!");
            } else{
                System.out.println("Saldo insufissiente para saque");
            }
        } else {
            System.out.println("Essa conta foi encerrada, deseja abrir nova conta?");
        }
    }
    public void pagarMensal(){
        int d = 0;
        if ("Conta Corrente".equals(this.getTipo())) {
            d = 12;
        } else if ("Polpança".equals(this.getTipo())) {
            d = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - d);
            System.out.println("A mensalidade foi debitada da conta de " + this.getDono());
        } else{
            System.out.println("ERRO CONTA INESISTENTE! Deseja abrir uma conta?");
        }
        
    }
    public void Banco (){ //Construtor do código já com parametros. Sempre que criar um novo dono esses parametros são automaticos.
        this.setSaldo (0);
        this.setStatus(false);
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }

    public void estadoAtual() {
        System.out.println("------------------------------------------------");
        System.out.println("Agência: "+ this.getNumConta());
        System.out.println("Conta: "+ this.getTipo());
        System.out.println("Nome: "+ this.getDono());
        System.out.println("O saldo é: "+ this.getSaldo());
        System.out.println("A conta está "+ this.getStatus());
    }
        
}
