/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.edu.ingsoft.colegio.gotitas.config;
import java.sql.Connection; 
import java.sql.DriverManager; 
/*
Clase con patrón de diseño singleton. 

*/
public class DataBaseConnection {
    //atributos 
    private static Connection connection; 
    
    /*
    el constructor tiene que ser privado, esto para
    evitar que se creen instancias de esta clase
    */
    private DataBaseConnection(){}
    // metodo
    public static Connection getConnectionDataBase()throws Exception{
        if(connection == null || connection.isClosed()){
            connection = DriverManager.getConnection(Credentials.URL_DB, Credentials.USER_DB, Credentials.PASS_DB);
        }
        return connection; 
    }
}
