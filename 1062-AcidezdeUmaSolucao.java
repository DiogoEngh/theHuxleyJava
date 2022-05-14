import java.util.Scanner;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    double pH;
    pH = scan.nextDouble();
    if(pH<7){
      System.out.print("Acida");
    }else if(pH>7){
      System.out.print("Basica");
    }else{
      System.out.print("Neutra");
    }
  }
}
