/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package verificar_numero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class Principal implements ActionListener{
    Ventana1 v1;
    analizar_numero analizando;

    public Principal() {
    v1= new Ventana1();
    v1.setBounds(0, 0, 400, 300);
    v1.setVisible(true);
    v1.getBtnSalir().addActionListener(this);
    v1.getBtnAnalizar().addActionListener(this);
    analizando= new analizar_numero();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal prin = new Principal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(v1.getBtnSalir())){
            System.out.println("hubo clic en el boton salir");
            System.exit(0);
        }
        if(e.getSource().equals(v1.getBtnAnalizar())){
        int numero;
        numero=Integer.parseInt(v1.getTxtIngresa_numero().getText());
        analizando.analiza_numero_leido(numero);
            if(analizando.primo==true){
            JOptionPane.showMessageDialog(null,"el numero es primo");
             analizando.cont=0;
            }
            else {
            JOptionPane.showMessageDialog(null,"el numero no es primo");
             analizando.cont=0;
            }
        
        }
        
    }
    
}
