import java.util.Scanner;
public class Main3alpabet {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		do {
			String At = scanner.next();
			char chAt = At.charAt(0);
			if ((int)chAt<97||(int)chAt>122) {
				System.out.print("�߸� �Է��߽��ϴ�. �ٽ� �Է��Ͻÿ�>>");
				continue;}
			for(int i=0;i<=chAt-'a';i++) {
				for(char j='a';j<=chAt-i;j++) System.out.print(j); 
		    System.out.println();}
		    break;//break�� �� ���� ���ѷ����� �������� �� ���� while�� �� �ڵ尡 �ƹ� �ǹ� ������.
		} while(true);
		scanner.close();
	}
}
