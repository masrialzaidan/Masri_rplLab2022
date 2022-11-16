
package operatorr;

import java.util.Scanner;
public class day31 {

 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int a,b,n,total;
  total=0;
  Scanner keyboard=new Scanner(System.in);
  System.out.print("Masukkan n=");
  n=keyboard.nextInt();
  for(a=1;a<=n;a++){
   System.out.print("Bilangan ke"+a+"=");
   b=keyboard.nextInt();
   total=total+b;
  }
  System.out.println("Total bilangan inputan="+total);
  keyboard.close();
 }

}
