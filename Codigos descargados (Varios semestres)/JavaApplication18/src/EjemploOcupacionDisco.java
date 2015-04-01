/*      Ejemplo para lectura / escritura de archivos binarios de manera secuencial.
 *      orden de creación de objetos para manejar archivos 
 *      1. File             (proporciona métodos para manejo de directorios)
 *      2. FileInputStream (proporciona métodos de lectura o escritura a nivel de bytes)
 *      3. DataInputStream
 *          con este tercer objeto se tiene acceso (lectura / escritura) a métodos que Java tiene predefinidos para la 
 *           escritura sencilla de datos primitivos (char, chars , string en forma de UTF (*), float, long, etc), que
 *          sin la creación de dicho objeto no podríamos realizar
 *
 *      ----> OBLIGATORIO! El orden de métodos en la lectura debe ser necesariamente igual que el usado en 
             la escritura de datos debido que al manejarse de manera secuencial, los datos recuperados por el programa
              se llaman de esa misma manera y con el mismo tipo de dato
 *
 *      para lectura o escritura en la declaración de variable se puede alternar input o output donde:
 *              lectura de archivos = input
 *              escritura de archivos = output
 *
 *      Se recomienda siempre cerrar el File______Stream para evitar perdida de datos tanto en lectura como en escritura
 *      antes de terminar el programa o de comenzar a manejar otro archivo binario
*/   
/**
 *
 * @author Yair
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.*;

public class EjemploOcupacionDisco {

	public static void main(String args[]) throws java.io.IOException {
            FileOutputStream salida = null;
            DataOutputStream dos = null;
            File nuevo = null;
            InOut ob1 = new InOut();
            String name;
            
            ob1.mostrar("Almacenamiento de contactos.\n");
            do{
             name= ob1.solicitarStr("A continuación ingrese"
                    + " un nombre para el nuevo contacto a guardar:");
            }while(ValidacionDatos.validarStr(name)==false);
            try{
                nuevo = new File(name+".dat");
                if(nuevo.exists()){
                    salida = new FileOutputStream(nuevo,true);
                }else{
                    nuevo = new File(name+".dat");
                    salida = new FileOutputStream(nuevo);
                }
            }catch(IOException e){
                e.getLocalizedMessage();
                e.printStackTrace();
            }finally{
                dos = new DataOutputStream(salida);
            }
            try{
                dos.writeInt(ob1.solicitarNum("Ingrese ID del contacto:"));
                dos.writeUTF(ob1.solicitarStr("Ingrese nombre del contacto:"));
                dos.writeLong(ob1.solicitarLong("Ingrese el número a guardar:"));
                dos.writeUTF(ob1.solicitarStr("Ingrese categoria a pertenecer:"));
            }catch(IOException e){
                e.getLocalizedMessage();
                e.printStackTrace();
            }
            salida.close();
            System.out.println(nuevo.getAbsoluteFile());
            System.out.println(nuevo.getAbsolutePath());
            System.out.println(nuevo.getParent());
	}
}
