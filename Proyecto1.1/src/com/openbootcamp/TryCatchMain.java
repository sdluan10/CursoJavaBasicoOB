package com.openbootcamp;

public class TryCatchMain {
    public static void main(String[] args) {

         try {
             int resultado = 5/0;
         } catch (ArithmeticException e) {
             e.printStackTrace();
         } finally {
             System.out.println("cierre de recursos");
         }

        System.out.println("fin");
    }
}
