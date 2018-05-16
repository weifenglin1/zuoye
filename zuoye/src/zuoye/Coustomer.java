package zuoye;

public class Coustomer {
	private String name;
	
	
   public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


public void service() {
	   System.out.println("服务信息:"+"\n"+name+"在服务中....");
   }
}
