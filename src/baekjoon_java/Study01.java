package baekjoon_java;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {

		// 문제 1000. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("A값 : ");
		int A = sc.nextInt();
		System.out.print("B값 : ");
		int B = sc.nextInt();

		if (0 < A && A < 10 && 0 < B && B < 10) {
			System.out.println("합계 : " + (A + B));
		} else {
			System.out.println("잘못된 입력값입니다.");
		}

		sc.close();

	}

}
