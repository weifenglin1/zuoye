package zuoye;

public class WuMingFenDemo {
  public static void main(String[] args) {
	  WuMingFen f1 = new WuMingFen("牛肉",3,true);
	  WuMingFen f2 = new WuMingFen("牛肉",2);
	  WuMingFen f3 = new WuMingFen("酸辣面,",2,true);
	  
	 f1.check();
	 f2.check();
	 f3.check();
}
}