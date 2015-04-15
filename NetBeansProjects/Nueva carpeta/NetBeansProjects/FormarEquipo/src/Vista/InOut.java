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
    public boolean validar(int num){
        if (num >=0) {
            return true;
        }else {
            return false;
        }
        
    }
    public String validarCadenaVacia(String str1){
        if(str1.trim().toString().length()==0)
              {
                return "-1";
              }
        else{
            return str1;
        }        
    }
    public String solicitarStr(String m){
         return JOptionPane.showInputDialog(m);
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
         if (var1 == null){
            var1 = "-1";
         }
         var1=validarCadenaVacia(var1);
         num = Integer.parseInt(var1);
         if(validar(num)){
             return num;
         } else {
             do{
                 var1 =JOptionPane.showInputDialog(m);
                 var1=validarCadenaVacia(var1);
                 if (var1 == null){
                var1 = "-1";}
             }while(validar(Integer.parseInt(var1)) == false);
             num = Integer.parseInt(var1);
             return num;
         }
         
    }
}
