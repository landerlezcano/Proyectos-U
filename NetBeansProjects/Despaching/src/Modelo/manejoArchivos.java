/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Vista.InOut;
import Vista.ValidacionDatos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class manejoArchivos {
    File ob1;
    PrintWriter ob2;

    public manejoArchivos(Boolean aux) {
    }
    
    public manejoArchivos() {
        this.ob1 = new File("Registro.txt");
        try{
             ob2 = new PrintWriter(new BufferedWriter(new FileWriter(this.ob1, true)));
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
    
    public String verUbicacion(){
        return ob1.getAbsolutePath();
    }
    
    public void borrarArchivo() throws IOException{
        ob2.close();
        if(ob1.delete()){
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el archivo \n"+verUbicacion(), "Archivo borrado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            System.out.println("Esa joda no borra");
        }
    }
    
    public String mostrarArchivo() throws FileNotFoundException, IOException{
        String str = "";
        String aux = null;
        FileReader fr;
        try {
            fr = new FileReader(ob1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            fr = new FileReader(ob1);
        } 
        BufferedReader br = new BufferedReader(fr);
        while ((aux=br.readLine())!=null){
            str = str+aux+"\n";
        }
        return str;
    }
    
    public void añadirLinea(String str) throws IOException{
        ob2.write(str+"\n");
    }
    public void cerrarArchivo() throws IOException{
        ob2.close();
    }
    
    public static Boolean estaCreado(String str){
        File f = new File(str);
        if(f.exists() && !f.isDirectory()) {
            return true;
        }
        return false;
    }
    
}
