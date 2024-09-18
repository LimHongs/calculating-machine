package calculatingmachine;

import java.util.Scanner;

public class lv1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 반복문을 사용하여 계속해서 계산할 수 있도록 설정
		while (true) {
			System.out.print("첫번째 숫자를 입력하세요: ");
			int num1 = sc.nextInt();

			System.out.print("두번째 숫자를 입력하세요: ");
			int num2 = sc.nextInt();

			System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
			char operator = sc.next().charAt(0);

			int result = 0; // 연산 결과를 저장할 변수

			// 사칙연산 처리
			switch (operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					if (num2 != 0) {
						result = num1 / num2;
					} else {
						System.out.println("0으로 나눌 수 없습니다.");
						continue; // 0으로 나누는 경우는 다음 루프를 실행
					}
					break;
				default:
				System.out.println("잘못된 연산자를 입력하였습니다.");
				continue; // 잘못된 연산자는 다시 입력받도록 함
			}

			System.out.println("결과: " + result);

			// 추가 계산 여부를 물어봄
			System.out.print("더 계산하시겠습니까? (yes 입력 시 계속, 그 외 종료): ");
			String answer = sc.next();

			if (!answer.equalsIgnoreCase("yes")) {
				System.out.println("프로그램을 종료합니다.");
				break; // "yes" 이외의 값을 입력하면 반복문 종료
			}
		}

		sc.close(); // 스캐너 닫기
	}
}