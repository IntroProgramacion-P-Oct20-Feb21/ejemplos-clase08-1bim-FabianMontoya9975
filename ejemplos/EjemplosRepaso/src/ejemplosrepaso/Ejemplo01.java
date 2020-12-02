/*
 *  Las entradas son: ciudad Loja, pais Ecuador
    La salida del programa debe ser así:
    
    Loja, ciudad
    del país:
        Ecuador.
 */
package ejemplosrepaso;

import java.util.Scanner;


public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String pais;
        System.out.println("Ingresar nombre de la ciudad: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar nombre del pais: ");
        pais = entrada.nextLine();
        System.out.printf("%s,%s%s%s",
                ciudad,
                " ciudad\ndel país:\n\t",
                pais, "\n");
    }
    
}
