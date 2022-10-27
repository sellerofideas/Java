/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z= 12;
        boolean r;
       // r =  (x<y && y<z)?true:false;
       //r =  (x<y && y==z)?true:false;
       //r =  (x<y || y<z)?true:false;
       //r =  (x<y ^y==z)?true:false; //nesse caso retorna true pq uma expressão exclusivamente é true.
       r =  (x<y ^y<z)?true:false; //como aqui as 2 expressões são true, retorna false
        System.out.println(r);
    }
    
}

/*OPERADORES LÓGICOS
*&& = e, true && true = true
*|| = ou, false || true = true
*^ = xou (ou exclusivo), true ^ true = false (No caso do ou exclusivo uma das expressões precisa ser verdadeira, não 2 e não 2 falsas.
*! = não, !false = true
*/