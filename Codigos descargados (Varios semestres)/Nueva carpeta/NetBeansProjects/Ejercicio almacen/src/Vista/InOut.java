

package Vista;

import javax.swing.JOptionPane;

public class InOut {
    
    // metodo que captura datos enteros desde teclado
    public int solicitarInfo(String m){
       return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    // metodo que imprime en pantalla
    public void mostrar(String re){
        JOptionPane.showMessageDialog(null, re);
    }
    
    
}
