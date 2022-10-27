/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

 /*
 * @author ideapad 330 81fe002b
 */

import java.util.Scanner;


public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int nasc= t.nextInt();
        int i = 2022-nasc;
        System.out.print("Em 2022 sua idade era "+ i);
        if (i>18) {
            System.out.println(" e você é maior de idade");
        } else{
            System.out.println(" e você é menor de idade");
        }
          
        }
        
    }
    

