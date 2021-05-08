
package newcalc;


public class sw {
    
    public static int sw(String sign, int a, int b){
        
        int x=0;
        
        switch(sign){            
            case "+":
                return x = math.sum(a,b);
            case "-":
                return x = math.sub(a,b);
            case "*":
                return x = math.mult(a,b);    
            case "/":
                return x = math.div(a,b);    
            default:
                System.err.println("Ошибка");
                return x;
        }
 
    }
   
}
