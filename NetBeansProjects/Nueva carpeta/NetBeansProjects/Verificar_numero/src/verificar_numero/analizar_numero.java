/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificar_numero;

public class analizar_numero {

    boolean primo;
    int cont = 0;

    public boolean analiza_numero_leido(int n) {
        for (int i = 1;( i < n + 1) || (primo == false); i++) {
            if(cont>2) primo = true;
            if (n % i == 0) {
                cont++;
            }
            System.out.println("cont= " + cont);

        }
        if (cont == 2 ) {
            primo = true;
        } else {
            primo = false;
        }
        return primo;
    }

}
