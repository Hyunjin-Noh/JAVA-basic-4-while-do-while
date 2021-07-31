/*p.169 실습문제15
예시 입력 1 
곱하고자 하는 두 수 입력>>2.5 4
곱하고자 하는 두 수 입력>>4 3.5
곱하고자 하는 두 수 입력>>4 3
예시 출력 1
실수는 입력하면 안됩니다.
실수는 입력하면 안됩니다.
4x3=12
힌트
InputMismatchException예외를 처리 할try-catch코드를작성하고,
catch블록에서Scanner에 이미 입력된 키를 모두 제거하기위해Scanner의nextLine()을 호출하라.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main6multiplyexcept {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
           System.out.print("곱하고자 하는 두 수 입력>>");
           try{
             int n = scanner.nextInt();
             int m = scanner.nextInt();
             System.out.print(n+"x"+m+"="+n*m);
             break;
           }catch(InputMismatchException e){
              System.out.println("실수는 입력하면 안됩니다.");
              scanner.nextLine();
           }
        }
        scanner.close();
    }
}
