

package prueba1;

import java.util.Scanner;


public class Prueba1 {

  
    public static void main(String[] args) {
   
        Scanner x=new Scanner(System.in);
        //int opciones =0;

        
        
        System.out.println(">>>ELIJA UNA OPCION<<<");
        System.out.println("1. CALCULAR EL AREA DEL CIRCULO");
        System.out.println("2. CALCULAR EL FACTORIAL");
        System.out.println("3. SALIR ");
        
        
        Usar a=new Usar();
        Usar b=new Usar();
        
        
        int opciones = x.nextInt();
        do{
            
               switch (opciones){
                   case 1:
                       System.out.println(">>>CALCULO DEL AREA<<<");
                       System.out.println("INGRESE EL RADIO DEL CIRCULO");
                       double area = x.nextDouble();
                       a.setArea(area);
                       a.circulo(area);
                       System.out.println("EL AREA ES: "+a.getArea());
                       break;
                   case 2:
                       System.out.println("INGRESE UN NUMERO");
                       double factorial=x.nextDouble();
                       b.setFactorial(factorial);
                       b.factorial(factorial);
                       System.out.println("EL FACTORIAL ES:"+b.getFactorial());
                       break;
                   case 3:
                       System.out.println("HA SALIDO DEL MENU");
                       System.exit(0);
                       break;
               }
        }while(opciones!=3);
        
    }
    
    
    
}
