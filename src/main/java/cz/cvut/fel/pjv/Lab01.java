package cz.cvut.fel.pjv;

//import sun.security.util.SignatureUtil;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Lab01 {
   private double num1, num2, result;
   public void start() {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String des_mist,str,str1,str2,ret,ret1,ret2;
        System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
        int operation = in.nextInt();
        switch (operation){
            case 1:
                System.out.println("Zadej scitanec: ");
                num1 = in.nextDouble();
                System.out.println("Zadej scitanec: ");
                num2 = in.nextDouble();
                result = num1 + num2;
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = in.next();
                if (!ispos(des_mist))
                    break;
                str = "%."+des_mist+"f";
                ret = String.format(str,result);
                ret1 =  String.format(str,num1);
                ret2 =  String.format(str,num2);
                System.out.println(ret1 + " + " + ret2 + " = " + ret);
                break;
            case 2:
                System.out.println("Zadej mensenec: ");
                num1 = in.nextDouble();
                System.out.println("Zadej mensitel: ");
                num2 = in.nextDouble();
                result = num1 - num2;
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = in.next();
                if (!ispos(des_mist))
                    break;
                str = "%."+des_mist+"f";
                ret = String.format(str,result);
                ret1 =  String.format(str,num1);
                ret2 =  String.format(str,num2);
                System.out.println(ret1 + " - " + ret2 + " = " + ret);
                break;
            case 3:
                System.out.println("Zadej cinitel: ");
                num1 = in.nextDouble();
                System.out.println("Zadej cinitel: ");
                num2 = in.nextDouble();
                result = num1 * num2;
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = in.next();
                if (!ispos(des_mist))
                    break;
                str = "%."+des_mist+"f";
                ret = String.format(str,result);
                ret1 =  String.format(str,num1);
                ret2 =  String.format(str,num2);
                System.out.println(ret1 + " * " + ret2 + " = " + ret);
                break;
            case 4:
                System.out.println("Zadej delenec: ");
                num1 = in.nextDouble();
                System.out.println("Zadej delitel: ");
                num2 = in.nextDouble();
                if (num2 == 0){
                    System.out.println("Pokus o deleni nulou!");
                    break;
                }
                result = num1 / num2;
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = in.next();
                if (!ispos(des_mist))
                    break;
                str = "%."+des_mist+"f";
                ret = String.format(str,result);
                ret1 =  String.format(str,num1);
                ret2 =  String.format(str,num2);
                System.out.println(ret1 + " / " + ret2 + " = " + ret);
                break;
            default:
                System.out.println("Chybna volba!");

        }
   }

   private boolean ispos(String arg){
       if (Integer.parseInt(arg) < 0){
           System.out.println("Chyba - musi byt zadane kladne cislo!");
           return false;
       }
       return true;
   }

}