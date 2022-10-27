/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VETORES/ARRAY EM JAVA
        int n[]= {3,2,8,7,5,4};
        System.out.println("O total de casas de N é "+ n.length);
        //Usando o .length conseguimos saber o cumprimento da array.
        //Para criar uma estrutura de repetição 
        //que permite ler qualquer vetor de qualquer tamanho usa-se
        //for(int c=0; c<=n.length-1; c++){
        for(int c=0; c<=5; c++){
            System.out.print(n[c]+ " ");
        //(n) =  Me retorna os valores do indice pra eu saber o tamanho do array
        //(n[c]) = Me retorn o conteúdo do array.
        //(n[c]+" ") = Serve para dar um espaço entre os caracteres.
        }
    }
    
}
/* OUTRA FORMA DE CRIAR UM VETOR (ARRAY)
int n[] = new int [4];
n[0] = 3;
n[1] = 2;
n[2] = 8;
n[3] = 7;
*/
