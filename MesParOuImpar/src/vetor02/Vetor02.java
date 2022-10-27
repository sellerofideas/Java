/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes [] = {"Jan","Fev","Mar","Abr", "Mai",
            "Jun","Jul","Ago","Out","Nov","Des"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int c=0; c<mes.length; c++){
      //c<mes.length; é outra forma de ler o cumprimento total do array.
            System.out.println("O mês de "+mes[c] + " tem "+ tot[c]+ " dias ao todo.");
        }
    }
    
}
//DESAFIO = Imprimir na tela "O ano atual é bi 6° e colocar fevereiro com 29 dias.