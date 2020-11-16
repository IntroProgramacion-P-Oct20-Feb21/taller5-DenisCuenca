/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costoKilovatio;
        double kilovatiosMes;
        double kilovatiosHora;
        double totalPagar;
        double edad;
        double descuento;
        double porcentanje = 90;
        
        System.out.println("Ingresar el valor de costo de kilovatio por hora");
        costoKilovatio = entrada.nextDouble();
        
        System.out.println("Ingresar el número de kilovatios consumidos por mes");
        kilovatiosMes = entrada.nextDouble();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextDouble();
        
        kilovatiosHora = kilovatiosMes*720;
        totalPagar = kilovatiosHora * costoKilovatio;
        
        if (edad > 65){
        descuento = (totalPagar * porcentanje )/100;
        totalPagar = totalPagar-descuento; 
     
        }
        System.out.printf("El valor a pagar es: %.2f\n ", totalPagar);
                
        
        
        
        
    }
    
}
