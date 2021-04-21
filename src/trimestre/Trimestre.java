/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestre;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class Trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
	        
	int Valor;
	        
	System.out.println("Deme un valor del 1 al 12");
        Valor = entrada.nextInt();
	        
	        switch (Valor) {
	            case 1:
	                System.out.println("Estas en el primer trimestre");
	                break;
	            case 2:
	                System.out.println("Estas en el segundo trimestre");
	                break;
	            case 3:
	                System.out.println("Estas en el tercer trimestre");
	                break;
	            case 4:
	                System.out.println("Estas en el cuarto trimestre");
	                break;
	            case 5:
	                System.out.println("Estas en el quinto trimestre");
	                break;
	            case 6:
	                System.out.println("Estas en el sexto trimestre");
	                break;
	            case 7:
	                System.out.println("Estas en el septimo trimestre");
	                break;
	            case 8:
	                System.out.println("Estas en el octavo trimestre");
	                break;
	            case 9:
	                System.out.println("Estas en el noveno trimestre");
	                break;
	            case 10:
	                System.out.println("Estas en el decimo trimestre");
	                break;
	            case 11:
	                System.out.println("Estas en el décimo trimestre");
	                break;
	            case 12:
	                System.out.println("Estas en el duodécimo trimestre");
	                break;
	            default:
	                System.out.println("Deme un valor correcto");
                }
    }
    
}
