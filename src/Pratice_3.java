import java.util.Scanner;
import java.util.InputMismatchException;

public class Pratice_3 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int dividend; // ������
      int divisor; // ������
      
      while(true) {
       
        System.out.print("�������� �Է��Ͻÿ�:");
        dividend = scanner.nextInt(); // ������ �Է�
       
         while(true) {
            try{
               System.out.print("�������� �Է��Ͻÿ�:");
               divisor = scanner.nextInt(); // ������ �Է�   
               System.out.println(dividend+"�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
               break;
            }
      
            catch(ArithmeticException e){ 
               System.out.println("0���� ���� �� �����ϴ�! �ٽ��Է��ϼ���"); 
               }
            catch(InputMismatchException e) {
               System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
               scanner.next();
               }
         }
      }
   }
}