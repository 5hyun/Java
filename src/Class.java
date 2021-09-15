import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	         
	         System.out.print("원의 중심과 반지름 입력>>");
	         int x = scanner.nextInt();//중심 좌표
	         int y = scanner.nextInt();
	         int r = scanner.nextInt();//반지름
	         System.out.print("점 입력>>");
	         int x2 = scanner.nextInt();//한 점의 좌표
	         int y2 = scanner.nextInt();
	         
	         double distance = Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));//점 사이 거리
	         
	         if(distance<r) {
	            System.out.print("점 ("+x2+","+y2+")는 원 안에 있다.");
	         }
	         else {
	            System.out.print("점 ("+x2+","+y2+")는 원 안에 없다.");
	         }
	         
	         scanner.close();
	   }
}
