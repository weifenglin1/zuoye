package zuoye;

import java.util.Scanner;

public class AngularDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三角形的行数:");
		int line = scanner.nextInt();

		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= line; j++) {
				if (i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("------------------");
		for (int n = 1; n <= line; n++) {
			for (int t = 1; t <= line -n; t++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= 2 * n - 1; a++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
