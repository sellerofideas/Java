/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author ideapad 330 81fe002b
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 =3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é "+ m);
*/
        
     /*   int numero = 10;
        int valor = 4 + numero--; 
        System.out.println(valor);
        System.out.println(numero);
         */
    /* int x = 4;
     x +=2; //x = x + 2
     System.out.println(x);
     */
   /* float v = 8.3f;
    //int ar = (int) Math.floor(v);
    //int ar = (int) Math.ceil(v);
    //int ar = (int) Math.round(v);
    int ar = (int) Math.abs(v);
    System.out.println(ar);*/
   
   double soma = Math.random();
   //Para gerar um número aleatrório entre 5 e 10 segue a formula
   int n = (int) (5 + soma * (10-5));
   System.out.println(n);
    }
    
}
     
/* OPERADORES UNÁRIOS
* ++ = Adiciona +1 a++ (a=a+1)
* -- = Subtrai - 1 a-- (a=a-1)
//Pós incremento (numero++) = Utilize o numero e cso seja executado outra vez soma mais 1
//Pré incremento (++numero) = Incremente + 1 e depois soma o numero
*
* OPERADORES DE ATRIBUIÇÃO
* += Somar e atribuir a += b(a=a+b)
* -= Subtrair e atribuir a -= b(a=a-b)
* *= Multiplicar e atribuir a *= b(a=a*b)
* /= Dividir e atribuir a /= b(a=a/b)
* %= Resto e atribuir a %= b(a=a%b)
*
* CLASSE MATH
*PI Constante PI math.PI(3.1414...)
*pow Expenenciação math.pow(5,2) 
*sqrt Raiz Quadrada math.sqrt(25)
*cbrt Raiz Cubica math.cbrt(27)
*
* ARREDONDAMENTOS
* abs Valor Absoluto Math.abs(-10) Resultado 10
* floor Arredondamento para baixo Math.floor(3.9) Resultado 3
* ceil Arredondamento para cima Math.ceil(4.2) Resultado 5
* round Arredondamento Aritimeticalmente Math.round(5.6) Resultado 6
*
* GERADOR ALEATÓRIO
* Math.random()
* Para criar um número aleatório entre 2 numeros use n + Math.random()(n-n);
*/