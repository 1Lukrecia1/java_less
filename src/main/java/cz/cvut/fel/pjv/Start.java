/*
 * File name: Start.java
 * Date:      2014/09/04 12:34
 * Author:    @author
 */

package cz.cvut.fel.pjv;

import java.util.Locale;
import java.util.Scanner;

public class Start {

   public static void main(String[] args) {
      homework();
   }

   private static void homework(){
      Scanner in = new Scanner(System.in);
      in.useLocale(Locale.US);
      Lab01 lab = new Lab01();
      lab.start();
   }

}
