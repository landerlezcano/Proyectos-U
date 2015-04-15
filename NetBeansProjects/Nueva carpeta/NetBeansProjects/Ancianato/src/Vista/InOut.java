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
         num = Integer.parseInt(var1);
         if(validar(num)){
             return num;
         } else {
             do{
                 var1 =JOptionPane.showInputDialog(m);
                 if (var1 == null){
                var1 = "-1";}
             }while(validar(Integer.parseInt(var1)) == false);
             num = Integer.parseInt(var1);
             return num;
         }
         
    }
    public int mostrarMenu(){
            String res="Ancianato \n";

            res=res+"1. Ingresar entrada (Abuelito)\n";
            res=res+"2. Cantidad de viajeros por destino\n";
            res=res+"3. Informe de costos\n";
            res=res+"4. Salir del programa\n";
            return solicitarNum(res+"Digite la opción: ");
    }
}
