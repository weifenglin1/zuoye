package zuoye;

import java.util.Scanner;

public class Java1 {
	/**
	 * 在学校的时候，老师会根据学生的成绩和素质分为5个等级，分别是优秀、良好、良、及格和 不及格。等级划分的准则如下：请根据用户输入的数据判断：
	 * 1）、综合分数如果大于90并且小于100则是优秀。在屏幕上打印:一个优秀的分数,你好棒啊. 2）、综合分数如果大于80并且小于90则是良好。
	 * 在屏幕上打印:一个评为良好的分数,加油啊. 3）、综合分数如果大于70并且小于80则是良。 在屏幕上打印:一个评为良的分数，再加把劲。
	 * 4）、综合分数如果大于60并且小于70则是及格。 在屏幕上打印:一个刚刚及格的分数，还需努力。
	 * 5）、综合分数如果小于60则是不及格。在屏幕上打印:这真是一个杯具。
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Scanner cj = new Scanner(System.in);
			System.out.println("请输入成绩");
			int n = cj.nextInt();
			if (n >= 90) {
				System.out.println("一个优秀分数,你好棒啊.");
			} else if (n >= 80) {
				System.out.println("一个评为良好的分数,加油啊.");
			} else if (n >= 70) {
				System.out.println("一个评为良的分数，再加把劲.");
			} else if (n >= 60) {
				System.out.println("一个刚刚及格的分数，还需努力.");
			} else {
				System.out.println("这真是一个杯具.");
			}
		}
	}
}