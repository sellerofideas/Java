/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner (System.in);
        System.out.println("Quantas pernas?");
        int pernas = tec.nextInt();
        String tipo;
        System.out.println("Isso é ");
        switch (pernas){
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bipede";
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrupede";
            break;
        case 8:
            tipo = "Aranha";
            break;
        default:
            tipo = "Et";
    }
        System.out.println(tipo);
    }
    
}
//Recriar o codigo para aparecer uma tela swing