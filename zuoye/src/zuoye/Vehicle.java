package zuoye;
/*
 * 请定义一个交通工具(Vehicle)的类，其中有:
属性：速度(speed)，体积(size)等等
方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等.
最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，
 并且通过打印出来。另外，调用加速，减速的方法对速度进行改变*/
public class Vehicle {
	private String name;
	private int speed;
	private int size;
   
   
  public Vehicle() {
	System.out.println("Vehicle 被实例化了");
}
  
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public void move() {
	   System.out.println(name+" 移动");
	   }
	public void speed() {
		System.out.println(name+" 设置速度");
	   }
	public void speedUp(int speedUp) {
		
		System.out.println(name+" 加速"+speedUp);
	}
	public void seedDown(int seedDown){
		System.out.println(name+" 减速"+seedDown);
	}

   public void display() {
	   System.out.println("车名："+name+" "+"体积："+size+" "+"速度："+speed+" ");
   }
}
