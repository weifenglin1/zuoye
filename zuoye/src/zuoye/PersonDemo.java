package zuoye;
/*
 * 构造方法：
编写Java程序，用于显示人的姓名和年龄。
定义一个人类（Person），该类中应该有两个私有属性，姓名（name）和年龄（age）。定义构造方法，用来初始化数据成员。再定义显示（display）方法，
将姓名和年龄打印出来。在main方法中创建人类的实例，然后将信息显示。
 */
public class PersonDemo {
    public static void main(String[] args) {
		Person ren =new Person();
		ren.setName("张三");
		ren.setAge(20);
		
		ren.display();
	}
}
