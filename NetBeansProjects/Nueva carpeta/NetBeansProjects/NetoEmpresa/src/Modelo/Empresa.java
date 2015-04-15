/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Vista.InOut;
import javax.swing.JOptionPane;
/**
 *
 * @author Yair Lopez Poveda
 */
public class Empresa {
    private int numEmpleados,cantEmplDisc;              // 2do arg: Cantidad empleados discapacitados
    private float totalPagoNeto,totalBonos;
    
    InOut ob1 = new InOut();
    
    public Empresa() {
        numEmpleados = 0;
        cantEmplDisc = 0;
        totalPagoNeto = 0;
        totalBonos = 0;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public int getCantEmplDisc() {
        return cantEmplDisc;
    }

    public void setCantEmplDisc(int cantEmplDisc) {
        this.cantEmplDisc = cantEmplDisc;
    }

    public float getTotalPagoNeto() {
        return totalPagoNeto;
    }

    public void setTotalPagoNeto(float totalPagoNeto) {
        this.totalPagoNeto = totalPagoNeto;
    }

    public float getTotalBonos() {
        return totalBonos;
    }

    public void setTotalBonos(float totalBonos) {
        this.totalBonos = totalBonos;
    }
    
    public void mostrarInfo(){
        String info;
        info="Información general\nNumero de empleados: "+getNumEmpleados()+"\nTotal Pago Neto: $"
                +getTotalPagoNeto()+"\nCantidad empleados discapacitados: "+getCantEmplDisc()
                +"\nTotal dinero en bonos: $"+getTotalBonos();
        ob1.mostrar(info);
    }
    
    public void ejecutarMenu(){
        int opc;
        String res="Empresa - Ingreso de datos \n";
        res=res+"1. Ingresar entrada (Empleado)\n";
        res=res+"2. Informe general hasta el momento\n";
        res=res+"3. Salir del programa y mostrar informe final de costos\n";
        do{
            opc=ob1.solicitarNum(res);
        }while(opc<1);
        switch(opc){
            case 1:
                leerEntrada();
                ejecutarMenu();
                break;
            case 2:
                mostrarInfo();
                ejecutarMenu();
                break;
            case 3:
                mostrarInfoFinal();
                break;
            default:
                ob1.mostrar("¡Opcion invalida!\n\nIngrese una opción entre 1 y 3");
                ejecutarMenu();
                break;
        }        
    }
    public void mostrarInfoFinal(){
        int var;
                var=ob1.mostrarConfirm("¿Desea ver el informe y salir del programa?");
                if (var == JOptionPane.NO_OPTION) {
                    ejecutarMenu();
                  } else if (var == JOptionPane.YES_OPTION) {
                        if(getCantEmplDisc()>10){
                            ob1.mostrar("La empresa accede al descuento "
                                    + "de impuesto por cantidad de empleados "
                                    + "discapacitados\n\nCantidad:"+getCantEmplDisc());
                            
                        }else{
                            ob1.mostrar("La empresa no accede al descuento "
                                    + "de impuesto por cantidad de empleados "
                                    + "discapacitados\n\nCantidad:"+getCantEmplDisc());
                        }
                        mostrarInfo();
                  }
    }
    public Boolean validarNombre(String str){
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
            ob1.mostrar("¡Error! Ingrese un nombre válido");
            return false;
        }
    }
    public Boolean validarNum(int num){
        if (num >=0) {
            return true;
        }else {
            return false;
        }
    }
    public void leerEntrada() {
        Boolean incapacidad;
        String nombre;
        int cedula, salario;
        float bonos,salarioNeto;
        do{
            nombre=ob1.solicitarStr("Ingrese el nombre del empleado:").trim().toLowerCase();
        }while(validarNombre(nombre)==false);
        do{
            cedula=ob1.solicitarNum("Ingrese la cedula del empleado:");
        }while(validarNum(cedula)==false);
        do{
            salario=ob1.solicitarNum("Ingrese el salario del empleado:");
        }while(validarNum(salario)==false);
        salarioNeto=calcularSalarioNeto(salario);
        bonos=evaluarBonoIdentidad(nombre, cedula)+evaluarBonoNombre(nombre);
        incapacidad=esDiscapacitado();
        confirmarEntrada(salarioNeto, bonos, incapacidad);
    }
    public void confirmarEntrada(float salarioNeto, float bonos, Boolean incapacidad){
        int var;
                var=ob1.mostrarConfirm("Datos del empleado\nSalario neto: $"+salarioNeto
                        +"\nBonos: $"+bonos+"\nIncapacidad: "+incapacidad+"\n"
                        + "¿Desea agregar la información?");
                if(var == JOptionPane.YES_OPTION) {
                    if(incapacidad){
                    setCantEmplDisc(getCantEmplDisc()+1);}
                    setTotalBonos(getTotalBonos()+bonos);
                    setTotalPagoNeto(getTotalPagoNeto()+(salarioNeto+bonos));
                    setNumEmpleados(getNumEmpleados()+1);
                }
    }
    public Boolean esDiscapacitado(){
        int var;
        var=ob1.mostrarConfirm("¿Es el empleado discapacitado?");
        if (var == JOptionPane.NO_OPTION) {
            return false;
        }else if(var == JOptionPane.YES_OPTION) {
            return true;
        }else{
              return false;
        }
    }
    public float calcularSalarioNeto(int salario){
        float acum;
        acum= salario-(salario*(float)(0.07));
        if((acum/616000)>=4){
            acum=acum-(acum*(float)(0.01));
        }
        return acum;
    }
    public int ultimoDigito(int num){
        String tmp = Integer.toString(num);
        return Character.getNumericValue(tmp.charAt(tmp.length()-1));
    }
    public String primerNombre(String str){
        String[] partes;
        String aux;
        StringBuffer temp = new StringBuffer(str);
        for (int i=0;i<temp.length();i++){
            while (temp.charAt(i)==' ' && temp.charAt(i+1)== ' '){
                temp.deleteCharAt(i+1);
            } 
        }
        aux=temp.toString();
        partes = aux.trim().split(" ");
        System.out.println();
        return partes[0].toLowerCase();
    }
    public int evaluarBonoNombre(String nombre){
        if(primerNombre(nombre).equals("ruperto")||primerNombre(nombre).equals("rupertina")){
            return 200000;}
        else{
            return 0;
        }        
    }
    public int evaluarBonoIdentidad(String name, int cedula){
        if((name.charAt(0)>96 && name.charAt(0)<110)&&(ultimoDigito(cedula)==0
                || (ultimoDigito(cedula)>=5 && ultimoDigito(cedula)<=9 ))){
            return 500000;
        }else if((name.charAt(0)>109 && name.charAt(0)<123)&&(ultimoDigito(cedula)>=1 
                && ultimoDigito(cedula)<=4 )){
            return 100000;
        }else{
            return 0;
        }
    }
}
