/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class Contador01 {

    public static void main(String[] args) {
        // TODO code application logic here
       /* int cc = 0;
        while (cc<4){
            System.out.println("Cambalhota " + (cc+1));
            cc++;*/
       
       
       //COMANDO CONTINUE = Usado para interromper o fluxo e ocultar o número.
      /* int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 5  || cc == 7 || cc == 9) {
                continue;
            }
            System.out.println("Cambalhota " + cc);
            */
      
      //COMANDO BREAK = Usado para interromper o programa e ir direto ao fim.
      int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 2  || cc == 3 || cc == 4) {
                continue;
            }
                if (cc == 9){
                    break;
                }
            }
            System.out.println("Cambalhota " + cc);
        }
    }
