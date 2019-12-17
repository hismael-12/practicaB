

package prueba1;


public class Usar {
    
    private double area, factorial;

     public double circulo(double radio){
     double r;   
     r=3.1416* (Math.pow(radio,2));
     //System.out.println("EL AREA ES: "+r); 
     return r;
     
       
     }
     public double factorial(double factorial){
     this.factorial=factorial;
         double f=1;
         for (int i = 1; i <= factorial; i++) {
             f*=i;
         }
     
   
    return f;
     
     }
     

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getFactorial() {
         
         double f=1;
         for (int i = 1; i <= factorial; i++) {
             f*=i;
         }
     
   
    return f;
     
     }
        
    
        
        
    

    public void setFactorial(double factorial) {
        this.factorial = factorial;
    }
     
     
     
}

