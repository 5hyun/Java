import java.util.Scanner;

public class Ch2_practice {
	public static void main(String[] args) {
	      System.out.println("�������� �Է��ϼ���");
	      
	      Scanner scanner = new Scanner(System.in);
	      int int_decimal = scanner.nextInt();
	      System.out.println("�Է� ���� "+int_decimal+",���� ����"+Integer.toBinaryString(int_decimal)+" �Դϴ�.���������� ������ bit ��ġ(1~4)�� �Է��ϼ���.");
	      int num = scanner.nextInt();
	      System.out.println("�Է� ��ġ�� "+num+"�� ����");
	      System.out.println(num+"��° ���� "+((int_decimal>>>num - 1)&(byte)1)+"�Դϴ�.");
	      
	      scanner.close();
	   }
}
