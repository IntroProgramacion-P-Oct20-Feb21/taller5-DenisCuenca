/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen;
        double costo;
        double costoTotal;
       double porcentajeAlemania = 20;
       double porcentajeJapon = 30;
       double porcentajeItalia = 15;
       double porcentajeUSA = 8;
       double impuesto;
       
        System.out.println("Ingrese la marca del automóvil:");
        marca = entrada.nextLine();
        System.out.println("Ingrese el país de origen del automóvil:");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();
        
        if (origen.equals("Alemania")){
            impuesto = (costo * porcentajeAlemania)/100;
            costoTotal = costo + impuesto;
            System.out.printf("El impuesto de su automóvil %s es: %s\n"
                    + "Y el precio total a pagar es: %.2f\n",
                    marca,
                    impuesto,
                    costoTotal);
            
        }else{
        if(origen.equals("Japon")){
            impuesto = (costo * porcentajeJapon)/100;
            costoTotal = costo + impuesto;
            System.out.printf("El impuesto de su automóvil %s es: %s\n"
                    + "Y el precio total a pagar es: %.2f\n",
                    marca,
                    impuesto,
                    costoTotal);
        }else{
        if (origen.equals("Italia")){
            impuesto = (costo * porcentajeItalia)/100;
            costoTotal = costo + impuesto;
            System.out.printf("El impuesto de su automóvil %s es: %s\n"
                    + "Y el precio total a pagar es: %.2f\n",
                    marca,
                    impuesto,
                    costoTotal);
        }else{
        if(origen.equals("USA")){
            impuesto = (costo * porcentajeUSA)/100;
            costoTotal = costo + impuesto;
            System.out.printf("El impuesto de su automóvil %s es: %s\n"
                    + "Y el precio total a pagar es: %.2f\n",
                    marca,
                    impuesto,
                    costoTotal);
        }else{
        System.out.printf("El impuesto de su automóvil %s es: No tiene níngun impuesto\n"
               + "Y el precio total a pagar es: %.2f\n",
               marca,
               costo);
        }
        }
        }
        }
       
        
    }
    
}
