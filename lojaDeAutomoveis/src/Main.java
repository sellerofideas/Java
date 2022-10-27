import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
            
public class Main {

    public static void main(String[] args) {
        String servidor = "jdbc:sqlserver//:localhost:1433;databaseNeme:loja_de_automoveis";
        String usuario = "administrator";
        String senha = "admin";
        
        Connection conexao;
        Statement instrucaoSQL;
        ResultSet resultados;     
        
        try {
            conexao = DriverManager.getConnection(servidor, usuario, senha);
                    
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultados = instrucaoSQL.executeQuery("SELECT * FORM Carros");
    
        }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }
     }
}
