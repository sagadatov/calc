package newcalc;

public class variable {
    
    String str_value;
    int int_value;
    int asym;
    String type;
    
    variable(String x, int a) throws Exception{
        str_value = x;

        switch(str_value){
            case "I":
                int_value = 1;
                type = "roman";
                break;
            case "II":
                int_value = 2;
                type = "roman";
                break;
            case "III":
                int_value = 3;
                type = "roman";
                break;    
            case "IV":
                int_value = 4;
                type = "roman";
                break;
            case "V":
                int_value = 5;
                type = "roman";
                break;
            case "VI":
                int_value = 6;
                type = "roman";
                break;    
            case "VII":
                int_value = 7;
                type = "roman";
                break;    
            case "VIII":
                int_value = 8;
                type = "roman";
                break;    
            case "IX":
                int_value = 9;
                type = "roman";
                break;      
            case "X":
                int_value = 10;
                type = "roman";
                break;
            default:
                try {
                       int_value = Integer.valueOf(str_value); 
                       type = "arab";
                       if (int_value<1 || int_value>10){
                           throw new Exception("Одно из чисел не удовлетворяет условиям");
                       }
                }
                catch (NumberFormatException e) {  
                    throw new Exception("Одно из чисел не удовлетворяет условиям");
                }
                break;
        }
        
//        System.out.println(str_value);
//        System.out.println(int_value);
//        System.out.println(type);
    }
  
}
