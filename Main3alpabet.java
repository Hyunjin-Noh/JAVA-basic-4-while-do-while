import java.util.Scanner;
public class Main3alpabet {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		do {
			String At = scanner.next();
			char chAt = At.charAt(0);
			if ((int)chAt<97||(int)chAt>122) {
				System.out.print("잘못 입력했습니다. 다시 입력하시오>>");
				continue;}
			for(int i=0;i<=chAt-'a';i++) {
				for(char j='a';j<=chAt-i;j++) System.out.print(j); 
		    System.out.println();}
		    break;//break문 안 쓰면 무한루프를 빠져나올 수 없어 while문 뒤 코드가 아무 의미 없어짐.
		} while(true);
		scanner.close();
	}
}
