package org.example.exceptionhandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

           try {
//               System.out.println(i+ " statement executed");
               if(i==5){
                   throw new Exception();
               }
               System.out.println(i+ "Success...");
               System.exit(0);
           }catch (Exception e){
               e.printStackTrace();

           }
           finally {
               System.out.println(
                       "done"
               );
           }
        }
    }
}
