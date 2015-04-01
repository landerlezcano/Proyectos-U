/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.*;
import javax.swing.JOptionPane;
public class Main{
    private Connection conexion = null;
    public void estableceConexion()
    {
        if (conexion != null)
            return;
        String url = "jdbc:derby://localhost:1527/sample";
        try
        {
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           //Establecemos el Usuario y la contraseña
           //Usuario= postgres
           //Contraseña= 50cent
           conexion = DriverManager.getConnection(url,"app","app");
           if (conexion !=null){
               System.out.println("Conexión a base de datos ... Ok");
           }
        } catch (Exception e) {
            System.out.println("Problema al establecer la Conexión a la base de datos 1 ");
        }
    }
         public ResultSet dameNombre()
    {
        ResultSet rs = null;
        Statement s = null;
        try
        {
            s = conexion.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            rs = s.executeQuery("SELECT * FROM  CUSTOMER");
        }catch (Exception e)
        {
            System.out.println("Problema al consultar la base de datos 1 ");
        }
        return rs;
    }
public void cierraConexion()
    {
        try
        {
            conexion.close();
        }catch(Exception e)
        {
            System.out.println("Problema para cerrar la Conexión a la base de datos ");
        }
    }

    public static void main (String [] args) throws SQLException
    {
        Main x = new Main() ;
        ResultSet rs = null;
        String cadena="";
        x.estableceConexion();
        rs = x.dameNombre();
        ResultSetMetaData example = rs.getMetaData();
        try{
        while (rs.next())
        {
            //imprimimos todos los datos contenidos en la tabla
            for(int i = 1 ;i<=example.getColumnCount();i++){
                cadena += rs.getString (i) + " \t ";
            }
            cadena +="\n";

        }

        JOptionPane.showMessageDialog(null, cadena, "trabajadores",1);
        } catch(Exception e)
        {
            System.out.println("Problema al imprimir la base de datos ");
        }
        x.cierraConexion();
        GUI ob1 = new GUI();
    }

}