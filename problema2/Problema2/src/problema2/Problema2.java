/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    double cantidad;
    double precioUnitario;
    double costoTotal;
    double descuento;
    double porcentaje = 15;
    
    
        System.out.println("Ingrese la cantidad de su pedido:");
        cantidad = entrada.nextDouble();
        
        System.out.println("Ingrese el precio del valor unitario por articulo:");
        precioUnitario = entrada.nextDouble();
        
        costoTotal = precioUnitario * cantidad;
        
        if(cantidad > 50 ){
        descuento =  (costoTotal* porcentaje)/100;
        costoTotal = costoTotal - descuento;

        }
        
        System.out.printf("El costo total es: %.2f\n",costoTotal);
     
    }
    
}
