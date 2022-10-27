/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     
    static void soma (int a, int b) { //o metodo void indica que não haverá retorno da soma.
        int s = a + b;
        System.out.println("A soma é "+ s);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma(5, 2);
    }
    
*/
static int soma (int a, int b) { //Substituimos void por um método do tipo 
        int s = a + b;          //primitivo quando queremos que a função retorne.
        return s;
    }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        int sm = soma(5, 2);
        System.out.println("A soma vale"+ sm);
    }
    
}