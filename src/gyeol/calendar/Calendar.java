package gyeol.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int MAX_DAYS[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int maxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	static void printSample() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 일수를 출력하는 프로그램

		Scanner s = new Scanner(System.in);

		int month = s.nextInt();

		try {
			System.out.printf("%d월은 %d일입니다.\n", month, maxDaysOfMonth(month));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("1월부터 12월까지밖에 없습니다.");
		}
		printSample();
		s.close();
	}

}
