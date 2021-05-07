package test;

public class checkstr {
    
        public static int checkstr(String strcheck) throws Exception{
        int x = 0;
        switch(strcheck){
            case "I":
                x = 1;
                break;
            case "II":
                x = 2;
                break;
            case "III":
                x = 3;
                break;    
            case "IV":
                x = 4;
                break;
            case "V":
                x = 5;
                break;
            case "VI":
                x = 6;
                break;    
            case "VII":
                x = 7;
                break;    
            case "VIII":
                x = 8;
                break;    
            case "IX":
                x = 9;
                break;      
            case "X":
                x = 10;
                break;
            default:
                try {
                       x = Integer.valueOf(strcheck); 
                       if (x<1 || x>10){
                           throw new Exception("Одно из чисел не удовлетворяет условиям");
                       }
                }
                catch (NumberFormatException e) {  
                    throw new Exception("Одно из чисел не удовлетворяет условиям");
                }

                    break;
                
            }
            return x;
        }
        
        public static int check(String check){
        int x;
        int check1;
        try {
                x = Integer.valueOf(check);
                check1 = 1;
                     }
        catch (NumberFormatException e) {  
                    check1 = 2;
                }
        
        return check1;
    }
}
        