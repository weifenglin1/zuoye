package zuoye;

import java.util.Scanner;

public class Java4 {
	public static void main(String[] args) {
		System.out.println("请输入一个数字");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		System.out.println();
		int layer = num;
		for (int i = 1; i < num; i++) {
			layer = layer * (num - i);
		}
		System.out.println(num + "的接乘为：" + layer);

	}

}
