/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;
import javax.swing.JOptionPane;

/**
 *
 * @author Yair
 */
public class AdmonSalones {
    Boolean salones[][];
    String ocupadoPor[][];
    String[][] ocupadoPara;
    int numPisos;
    int numSalones;
    int numSalonesOcupados[];
    
    InOut ob1 = new InOut();
    
    public static Boolean validarDato(int num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public static Boolean validarStr(String str){
        String str1= str.trim().toLowerCase().replace(" ", "");
        int cont=0;
        for(int acum=0;acum<str1.length();acum++){
            if(str1.charAt(acum)<97 || str1.charAt(acum)>122){
                cont++;
            }
        }
        if(cont==0){
            return true;
        }else{
            return false;
        }
    }
    
    public AdmonSalones(int numSalones) {
        numPisos = 10;
        salones = new Boolean[numPisos][numSalones];
        ocupadoPor = new String[numPisos][numSalones];
        ocupadoPara = new String[numPisos][numSalones];
        this.numSalones=numSalones;
        numSalonesOcupados = new int[4];
    }
    
    public void inicializarValores(){
        for(int i=0;i<numPisos;i++){
            for(int j=0;j<numSalones;j++){
                salones[i][j]=false;
            }
        }
        for(int j = 0;j<numSalonesOcupados.length;j++){
            numSalonesOcupados[j]=0;
        }
    }
    
    public String tipoSalon(int piso, int numSalon){
        String str = "";
        if(piso == 2 || piso ==4){
            str=str + "Sala de informática";
        }else if(piso == 5 || piso == 8){
            str=str + "Salón de clases con televisores";
        }else if(piso == 6 || piso == 7){
            str=str + "Auditorio";    
        }else{
            str=str + "salón de clases normal";
        }
        return str;
    }
    
    public int IDSalon(int piso, int numSalon){
        if(piso == 2 || piso ==4){
            return 0;
        }else if(piso == 5 || piso == 8){
            return 1;
        }else if(piso == 6 || piso == 7){
            return 2;    
        }else{
            return 3;
        }
    }
    
    public String infoSalon(int piso, int numSalon){
        String str = "";
        str=str + tipoSalon(piso, numSalon)+"\n";
        str = str + "El salón esta ";
        if(salones[piso][numSalon]){
            str = str + "ocupado";
        }else{
            str = str + "desocupado";
        }
        str=str+".\n";
        if(salones[piso][numSalon]){
            str=str + "Encargado: "+ocupadoPor[piso][numSalon]+".\n";
            str=str + "Actividad: "+ocupadoPara[piso][numSalon]+".\n";
        }
        return str;
    }
    
    public void desocuparSalon(int piso, int numSalon){
        salones[piso][numSalon]=false;
        ocupadoPor[piso][numSalon]="";
        ocupadoPara[piso][numSalon]="";
    }
    
    public void ocuparSalon(int piso, int numSalon){
        String nombre;
        int var;
        String paraque;
        
        nombre = ob1.solicitarStr("Ingrese nombre del encargado del salón:");
        while(validarStr(nombre)==false){
            nombre = ob1.solicitarStr("¡Error! Intente ingresar solo caracteres válidos\n"
                    + "Ingrese nombre del encargado del salón:");
        }
        paraque = tipoSalon(piso, numSalon);
        var=ob1.mostrarConfirm("Información:\nPiso: "+piso+" Salón: "+numSalon+"\nEncargado: "+nombre+".\nActividad "
                + "a realizar: "+paraque+".\n¿Desea ocupar el salón?");
        if (var == JOptionPane.YES_OPTION) {
            salones[piso][numSalon]=true;
            ocupadoPor[piso][numSalon]=nombre;
            ocupadoPara[piso][numSalon]=paraque;
            numSalonesOcupados[IDSalon(piso, numSalon)]+=1;
        } 
    }
    
    
    public String mostrarMapa(){
        String str = "";
        int piso=numPisos;
        for (int i=9;i>=0;i--){
            str=str+"Piso "+piso+": ";
            for(int j=0;j<numSalones;j++){
                str=str+"[";
                if(salones[i][j]){
                    str=str+"x";
                }else{
                    str=str+" ";
                }
                str=str+"]";
            }
            str=str+"\n";
            piso--;
        }
        return str;
    }
    
    public void ejecutarMenu(){
        int opc;
        opc=mostrarMenu();
        while (true){
            switch(opc){
                case 1:
                    int piso,salon;
                    do{
                        piso=ob1.solicitarNum("Ingrese número de piso:");
                    }while(validarDato(piso)==false);
                    do{
                        salon=ob1.solicitarNum("Ingrese número de salón:");
                    }while(validarDato(salon)==false);
                    ocuparSalon(piso-1,salon-1);
                    ejecutarMenu();
                    break;
                case 2:
                    int piso1,salon1;
                    do{
                        piso1=ob1.solicitarNum("Ingrese número de piso:");
                    }while(validarDato(piso1)==false);
                    do{
                        salon1=ob1.solicitarNum("Ingrese número de salón:");
                    }while(validarDato(salon1)==false);
                    desocuparSalon(piso1-1,salon1-1);
                    ejecutarMenu();
                    break;
                case 3:
                    int piso2,salon2;
                    String tmp;
                    do{
                        piso2=ob1.solicitarNum("Ingrese número de piso:");
                    }while(validarDato(piso2)==false);
                    do{
                        salon2=ob1.solicitarNum("Ingrese número de salón:");
                    }while(validarDato(salon2)==false);
                    tmp = infoSalon(piso2-1,salon2-1);
                    ob1.mostrar(tmp);
                    ejecutarMenu();
                    break;
                case 4:
                    String str="Mapa de disponibilidad - salones\n\n";
                    str=str+mostrarMapa();
                    ob1.mostrar(str);
                    ejecutarMenu();
                    break;
                case 5:
                    int var;
                    var=ob1.mostrarConfirm("¿Desea salir del programa?");
                    if (var == JOptionPane.NO_OPTION) {
                        ejecutarMenu();
                      } else if (var == JOptionPane.YES_OPTION) {
                         ob1.mostrar(mostrarCantidadOcupados());
                        break;
                      } 
                    break;
                default:
                    ob1.mostrar("Ingrese una opción válida entre 1 y 5.");
                    ejecutarMenu();
                    break;

            }
        break;
        }
    }
    
    public String mostrarCantidadOcupados(){
        String str="Cantidad total de salones ocupados en el día:\n\n";
        str = str + "Salas de informática: "+numSalonesOcupados[0];
        str = str + "\nSalones de clases con televisores: "+numSalonesOcupados[1];
        str = str + "\nAuditorios: "+numSalonesOcupados[2];
        str = str + "\nSalón de clases normal: "+numSalonesOcupados[3];
        return str;
    }
    
    public int mostrarMenu(){
            String res="Admon. de salones \n";

            res=res+"1. Ocupar salón\n";
            res=res+"2. Desocupar salón\n";
            res=res+"3. Mostrar información de un salón\n";
            res=res+"4. Mostrar mapa de disponibilidad - salones\n";
            res=res+"5. Salir del programa\n";
            return ob1.solicitarNum(res+"Digite la opción: ");
    }
    
}
