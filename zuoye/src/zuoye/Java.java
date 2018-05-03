package zuoye;

import java.util.Scanner;

public class Java {
	/**
	 * 判断输入的年份是否是闰年从控制台上随便输入一个年份，判断该年是否是闰年并输
	 * 出相应的信息。判断闰年的条件是：能被400整除或能被4整除但不能被100整除的数即为闰年。
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			Scanner nf = new Scanner(System.in);
			System.out.println("请输入一个年份");
			int year = nf.nextInt();
			if (year < 1) {
				System.out.println("年份输入有误");
			} else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year + "=" + "是闰年");
			} else {
				System.out.println(year + "=" + "不是闰年");
			}
		}
	}
}