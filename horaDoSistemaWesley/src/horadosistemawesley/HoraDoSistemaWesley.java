
package horadosistemawesley;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistemaWesley {

  
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("Hora do sistema é");
        System.out.println(relogio.toString());
         var loc = Locale.getDefault();
         
         Toolkit tk = Toolkit.getDefaultToolkit();
          Dimension d = tk.getScreenSize();
          System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);

        String idioma = loc.getDisplayLanguage();

        System.out.println("Seu sistema está em " + idioma); 
    }
    
}

//Recriar o codigo para aparecer uma tela swing