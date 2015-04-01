
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
public class EjemploLecturaArchivo {
    public static void main(String args[]) throws java.io.IOException {    //Declaración de variables y flujos de datos
            FileInputStream lectura = null;                      //flujo de archivo
            DataInputStream dos = null;                         //flujo de datos! (que debe apuntar hacia el fileinputstream)
            File nuevo = null;                                  //objeto file (donde se manejara el directorio, incluye
                                                                //métodos para manejo de archivos como borrar, crear, listar directorio, ver permisos)
            InOut ob1 = new InOut();                 
            String name;
            ob1.mostrar("Almacenamiento de contactos.\n");
            do{
             name= ob1.solicitarStr("A continuación ingrese"
                    + " un nombre para leer contacto:");
            }while(ValidacionDatos.validarStr(name)==false);
            try{
                nuevo = new File(name+".dat");                  //su constructor recibe como parámetro la ubicación/nombre del archivo
                if(nuevo.exists()){                             //este método comprueba que exista el archivo
                    lectura = new FileInputStream(nuevo);
                }else{
                    
                    do{
                    
                        name= ob1.solicitarStr("A continuación ingrese"
                        + " otro nombre un nombre para leer contacto :");
                        nuevo = new File(name+".dat");
                    }while(nuevo.exists()==false);
                    lectura = new FileInputStream(nuevo);       //crea el fileinputstream (primer flujo de datos) con parametro el objeto File creado 
                }
            }catch(IOException e){
                e.getLocalizedMessage();
                e.printStackTrace();
            }finally{
                dos = new DataInputStream(lectura);             //creación del segundo flujo de datos o filtro con parámetro el FileInputStream
            }
            try{

                ob1.mostrar("ID del contacto: "+dos.readInt()+
                        "\nnombre del contacto: "+dos.readUTF()                 //métodos para lectura o escritura de datos
                        +"\nnúmero guardado: "+dos.readLong()+"\n"              //alternar read con write según se necesite
                        + "categoria: "+dos.readUTF());
            }catch(IOException e){
                e.getLocalizedMessage();
                e.printStackTrace();
            }
            lectura.close();
            System.out.println(nuevo.getAbsoluteFile());                        //métodos de la clase File, nos dan información de en que
            System.out.println(nuevo.getAbsolutePath());                        //directorio o donde se crea el archivo
                                                                                //este depende de donde se compile el .jar final
    }
}
