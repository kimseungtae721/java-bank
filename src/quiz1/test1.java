package quiz1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {

		int cnt[] = new int[26]; // 자바에서 배열을 선언하면 자동으로 모든 요소의 값이 초기화 된다

		// 위에 것은 26개 모두가 0 으로 된다. 

		// [0][0][0][0][0]...... 이런식으로

		// 소문자를 위한 거

		Scanner sc = new Scanner(System.in);

		String str;

		System.out.print("문자열을 입력하시오==>  ");

		str = sc.nextLine();



		for (int i  = 0 ; i < str.length() ; i++){

			char ch = str.charAt(i); //

			cnt[ch - 'a']++;

		}



		System.out.println("=== 각 문자의 수 ===");



		for (int i = 0; i < 26 ; i++ ){

			System.out.println((char)(97+i) + " : " + cnt[i]);

		}

	}

}



