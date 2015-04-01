/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author Yair
 */
public class InOut {
    public String validarCadenaVacia(String str1){
        if(str1.trim().length()==0)
              {
                return "-1";
              }
        else{
            return str1;
        }        
    }
    public String solicitarStr(String m){
        String var="";
        try{
            do{
                var = JOptionPane.showInputDialog(m);
            }while ((var.trim().toString().length()==0));
        }catch(Exception e){
            var="";
        }finally{
            var=validarCadenaVacia(var);
        }
        return var;
    }
    public int mostrarConfirm(String str){
        return JOptionPane.showConfirmDialog(null, str, "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
    public void mostrar(String var){
        JOptionPane.showMessageDialog(null, var);
    }
    public int solicitarNum(String m){
        int num;
        String var1 =JOptionPane.showInputDialog(m);
        try{
        num=Integer.parseInt(var1);
        }catch(Exception e){
            num=(-1);
        }
        return num;
    }
}
