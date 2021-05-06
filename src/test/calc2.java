package test;

import java.util.Scanner;

public class calc2 {
    
    public static void main(String[] args) throws Exception{
        
        Scanner vvod = new Scanner(System.in);
        String str = vvod.nextLine();
        vvod.close();
        
        int indsum = str.indexOf('+');
        int inddiv = str.indexOf('/');
        int indsub = str.indexOf('-');
        int indmult = str.indexOf('*');
        
        int sign = 0;       
        int marka = 0; 
        int markb = 0;
        int rez = 0;
        String rezstr;
        
        String stra;
        String strb;
        int a;
        int b;
        
        
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
                    System.out.println(rez);
                }
                else {
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
                    System.out.println(rez);
                }
                else {
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
                    System.out.println(rez);
                }
                else {
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
                    System.out.println(rez);
                }
                else {
                    System.out.println(rezstr = inttov(rez));
                }
                
                
                break;    
        }
                
    }
    
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
                           throw new Exception("неверное число");
                       }
                }
                catch (NumberFormatException e) {  
                    System.err.println("Неверный формат строки!");  
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
    
    public static String inttov(int a){
        String V = "";
        switch(a){
            case 1:
                V = "I";
                break;
            case 2:
                V = "II";
                break;
            case 3:
                V = "III";
                break;
            case 4:
                V = "IV";
                break;
            case 5:
                V = "V";
                break;
            case 6:
                V = "VI";
                break;
            case 7:
                V = "VII";
                break;
            case 8:
                V = "VIII";
                break;
            case 9:
                V = "IX";
                break;
            case 10:
                V = "X";
                break;
            case 11:
                V = "XI";
                break;
            case 12:
                V = "XII";
                break;
            case 13:
                V = "XIII";
                break;
            case 14:
                V = "XIV";
                break;
            case 15:
                V = "XV";
                break;
            case 16:
                V = "XVI";
                break;
            case 17:
                V = "XVII";
                break;
            case 18:
                V = "XVIII";
                break;
            case 19:
                V = "XIX";
                break;
            case 20:
                V = "XX";
                break;
            case 21:
                V = "XXI";
                break;
            case 22:
                V = "XXII";
                break;
            case 23:
                V = "XXIII";
                break;
            case 24:
                V = "XXIV";
                break;
            case 25:
                V = "XXV";
                break;
            case 26:
                V = "XXVI";
                break;
            case 27:
                V = "XXVII";
                break;
            case 28:
                V = "XXVIII";
                break;
            case 29:
                V = "XXIX";
                break;
            case 30:
                V = "XXX";
                break;
            case 31:
                V = "XXXI";
                break;
            case 32:
                V = "XXXII";
                break;
            case 33:
                V = "XXXIII";
                break;
            case 34:
                V = "XXXIV";
                break;
            case 35:
                V = "XXXV";
                break;
            case 36:
                V = "XXXVI";
                break;
            case 37:
                V = "XXXVII";
                break;
            case 38:
                V = "XXXVIII";
                break;
            case 39:
                V = "XXXIX";
                break;
            case 40:
                V = "XL";
                break;      
            case 41:
                V = "XLI";
                break;
            case 42:
                V = "XLII";
                break;
            case 43:
                V = "XLIII";
                break;
            case 44:
                V = "XLIV";
                break;
            case 45:
                V = "XLV";
                break;
            case 46:
                V = "XLVI";
                break;
            case 47:
                V = "XLVII";
                break;
            case 48:
                V = "XLVIII";
                break;
            case 49:
                V = "XLIX";
                break;
            case 50:
                V = "L";
                break;    
            case 51:
                V = "LI";
                break;
            case 52:
                V = "LII";
                break;
            case 53:
                V = "LIII";
                break;
            case 54:
                V = "LIV";
                break;
            case 55:
                V = "LV";
                break;
            case 56:
                V = "LVI";
                break;
            case 57:
                V = "LVII";
                break;
            case 58:
                V = "LVIII";
                break;
            case 59:
                V = "LIX";
                break;
            case 60:
                V = "LX";
                break;  
            case 61:
                V = "LXI";
                break;
            case 62:
                V = "LXII";
                break;
            case 63:
                V = "LXIII";
                break;
            case 64:
                V = "LXIV";
                break;
            case 65:
                V = "LXV";
                break;
            case 66:
                V = "LXVI";
                break;
            case 67:
                V = "LXVII";
                break;
            case 68:
                V = "LXVIII";
                break;
            case 69:
                V = "LXIX";
                break;
            case 70:
                V = "LXX";
                break;  
            case 71:
                V = "LXXI";
                break;
            case 72:
                V = "LXXII";
                break;
            case 73:
                V = "LXXIII";
                break;
            case 74:
                V = "LXXIV";
                break;
            case 75:
                V = "LXXV";
                break;
            case 76:
                V = "LXXVI";
                break;
            case 77:
                V = "LXXVII";
                break;
            case 78:
                V = "LXXVIII";
                break;
            case 79:
                V = "LXXIX";
                break;
            case 80:
                V = "LXXX";
                break; 
            case 81:
                V = "LXXXI";
                break;
            case 82:
                V = "LXXXII";
                break;
            case 83:
                V = "LXXXIII";
                break;
            case 84:
                V = "LXXXIV";
                break;
            case 85:
                V = "LXXXV";
                break;
            case 86:
                V = "LXXXVI";
                break;
            case 87:
                V = "LXXXVII";
                break;
            case 88:
                V = "LXXXVIII";
                break;
            case 89:
                V = "LXXXIX";
                break;
            case 90:
                V = "XC";
                break;  
            case 91:
                V = "XCI";
                break;
            case 92:
                V = "XCII";
                break;
            case 93:
                V = "XCIII";
                break;
            case 94:
                V = "XCIV";
                break;
            case 95:
                V = "XCV";
                break;
            case 96:
                V = "XCVI";
                break;
            case 97:
                V = "XCVII";
                break;
            case 98:
                V = "XCVIII";
                break;
            case 99:
                V = "XCIX";
                break;
            case 100:
                V = "C";
                break; 
                
        }
        return V;
    }
        
        
    
    
    public static int sum(int a, int b) {
        int sum = a+b;

        return sum;
}
    
    public static int div(int a, int b) {
        int div = a/b;

        return div;
}
    
    public static int sub(int a, int b) {
        int sub = a-b;

        return sub;
}
    
    public static int mult(int a, int b) {
        int mult = a*b;

        return mult;
}
    
}
