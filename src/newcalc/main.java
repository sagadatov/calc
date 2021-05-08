package newcalc;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) throws Exception{
        
        String str;
        int index=0;
        String sign;
        int rez_int;
        String rez_str;
        int a;
        int b;
        
        System.out.print("Введите математическую операцию: ");
        Scanner vvod = new Scanner(System.in);
        str = vvod.nextLine();
        vvod.close();
        
        String[] words = str.split("\\+|\\-|\\*|\\/");
        
        variable a1 = new variable(words[0],words[0].length());
        variable b1 = new variable(words[1],words[1].length());
        
        sign = str.substring(words[0].length(),words[0].length()+1);
        
        if(a1.type != b1.type){
            throw new Exception("Ошибка");
        }

        a = a1.int_value;
        b = b1.int_value;
        
        rez_int = sw.sw(sign, a, b);
        
        System.out.print("Результат: ");
        
        if(a1.type == "roman" && b1.type == "roman"){
            rez_str = strtoint.inttov(rez_int);
            System.out.println(rez_str);
        }
        else {
            System.out.println(rez_int);
        }
        
    }
    
}
