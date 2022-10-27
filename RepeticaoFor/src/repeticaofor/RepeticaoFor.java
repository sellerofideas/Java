/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     //REPETIÇÃO COM VARIAVEL DE CONTROLE USANDO FOR
        for (int cc= 1; cc <=101; cc+=10) {
            System.out.println("Cambalhota " + cc); 
//Adc o cc+=2 ele pula de 2 em 2
//cc-=2 ele tira de 2 em 2
        }
    }
    
}

/* O FOR é um WHILE Simplificado
* int cc =0;
* While (cc<=4){
*   System.out.println("Cambalhota");
*   cc++;
*}
*/

//LAÇOS ANINHADOS
/*
 *for (int i =1; i <=3; i++) {
 *   for (int j= 0; j<=2; j++){
 *    System.out.println(j + i);
 *    } 
 *   }
 *    } 
 *   }
*/