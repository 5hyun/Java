import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	         
	         System.out.print("���� �߽ɰ� ������ �Է�>>");
	         int x = scanner.nextInt();//�߽� ��ǥ
	         int y = scanner.nextInt();
	         int r = scanner.nextInt();//������
	         System.out.print("�� �Է�>>");
	         int x2 = scanner.nextInt();//�� ���� ��ǥ
	         int y2 = scanner.nextInt();
	         
	         double distance = Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));//�� ���� �Ÿ�
	         
	         if(distance<r) {
	            System.out.print("�� ("+x2+","+y2+")�� �� �ȿ� �ִ�.");
	         }
	         else {
	            System.out.print("�� ("+x2+","+y2+")�� �� �ȿ� ����.");
	         }
	         
	         scanner.close();
	   }
}
