package test;

import java.util.Scanner;
import static test.Strtoint.inttov;
import static test.checkstr.check;
import static test.checkstr.checkstr;
import static test.math.sum;
import static test.math.div;
import static test.math.sub;
import static test.math.mult;

public class calc2 {
    
    public static void main(String[] args) throws Exception{
        
        int sign = 0;       
        int marka; 
        int markb;
        int rez;
        int a;
        int b;
        String rezstr;        
        String stra;
        String strb;
        String str;
        
        
        System.out.print("Введите математическую операцию: ");
        Scanner vvod = new Scanner(System.in);
        str = vvod.nextLine();
        vvod.close();
        
        String[] words = str.split("\\+|\\-|\\*|\\/");
        for(String word : words){
        System.out.println(word);
        }
        
        int indsum = str.indexOf('+');
        int inddiv = str.indexOf('/');
        int indsub = str.indexOf('-');
        int indmult = str.indexOf('*');
        
        if (indsum<0 && inddiv<0 && indsub<0 && indmult<0){
            System.err.println("Ошибка");
//                           throw new Exception("ошибка");
        }
        
        if (indsum > 0){
            sign = 1;
        }
        if (inddiv > 0){
            sign = 2;
        }
        if (indsub > 0){
            sign = 3;
        }
        if (indmult > 0){
            sign = 4;
        }
        
        switch(sign){
            case 1:
                
                stra = str.substring(0,indsum);
                strb = str.substring(indsum+1);
                marka = check(stra);
                markb = check(strb);
                
                if (marka != markb) {
                    System.err.println("Ошибка");
                    break;
                }
                
                a = checkstr(stra);
                b = checkstr(strb);
                rez = sum(a,b);
                
                if (marka != 2){
                    System.out.print("Результат: ");
                    System.out.println(rez);
                }
                else {
                    System.out.print("Результат: ");
                    System.out.println(rezstr = inttov(rez));
                }               
                break; 
            
            case 2:
                
                stra = str.substring(0,inddiv);
                strb = str.substring(inddiv+1);
                marka = check(stra);
                markb = check(strb);
                
                if (marka != markb) {
                    System.err.println("Ошибка");
                    break;
                }

                a = checkstr(stra);
                b = checkstr(strb);
                rez = div(a,b);
                
                if (marka != 2){
                    System.out.print("Результат: ");
                    System.out.println(rez);
                }
                else {
                    System.out.print("Результат: ");
                    System.out.println(rezstr = inttov(rez));
                }               
                break;    
            
            case 3:
                
                stra = str.substring(0,indsub);
                strb = str.substring(indsub+1);
                marka = check(stra);
                markb = check(strb);
                
                if (marka != markb) {
                    System.err.println("Ошибка");
                    break;
                }
                
                a = checkstr(stra);
                b = checkstr(strb);
                rez = sub(a,b);
                
                if (marka != 2){
                    System.out.print("Результат: ");
                    System.out.println(rez);
                }
                else {
                    System.out.print("Результат: ");
                    System.out.println(rezstr = inttov(rez));
                }               
                break; 
                
            case 4:
                
                stra = str.substring(0,indmult);
                strb = str.substring(indmult+1);                
                marka = check(stra);
                markb = check(strb);
                
                if (marka != markb) {
                    System.err.println("Ошибка");
                    break;
                }
                
                a = checkstr(stra);
                b = checkstr(strb);                
                rez = mult(a,b);
                
                if (marka != 2){
                    System.out.print("Результат: ");
                    System.out.println(rez);
                }
                else {
                    System.out.print("Результат: ");
                    System.out.println(rezstr = inttov(rez));
                }               
                break;    
        }    
    }
}
