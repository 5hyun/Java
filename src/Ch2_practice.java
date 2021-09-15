import java.util.Scanner;

public class Ch2_practice {
	public static void main(String[] args) {
	      System.out.println("십진수를 입력하세요");
	      
	      Scanner scanner = new Scanner(System.in);
	      int int_decimal = scanner.nextInt();
	      System.out.println("입력 값은 "+int_decimal+",이진 값은"+Integer.toBinaryString(int_decimal)+" 입니다.오른쪽으로 부터의 bit 위치(1~4)를 입력하세요.");
	      int num = scanner.nextInt();
	      System.out.println("입력 위치는 "+num+"의 값은");
	      System.out.println(num+"번째 값은 "+((int_decimal>>>num - 1)&(byte)1)+"입니다.");
	      
	      scanner.close();
	   }
}
