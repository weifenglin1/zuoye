package zuoye;

public class VIPCoustomer extends Coustomer{
	private int level;
	
	 public int getLevel() {
		return level;
	}

   public  void setLevel(int level) {
		this.level = level;
	}

  

   public void touSu() {
   	super.getName();
		System.out.print("投诉信息："+"\n"+"VIP"+level+"级别"+getName()+"投诉中....");
	}
}
