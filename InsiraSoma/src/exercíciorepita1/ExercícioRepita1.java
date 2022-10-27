/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercíciorepita1;

import javax.swing.JOptionPane;
/**
 *
 * @author ideapad 330 81fe002b
 */
public class ExercícioRepita1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
        s += n;
        }while (n!=0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>"+
                "<br>Somatório vale" + s + "</html>");
        
    }
    
}

//DESAFIO = Retornar "Total de valores, Total de pares, 
//Total de ímpares, Acima de 100 e a Media dos valores digitados.