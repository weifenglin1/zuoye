package zuoye;

/*
 * 定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。在建立类的实例时，把以上三个信息都作为构造函数的参数输入，
 其中用户ID和用户密码时必须的，缺省的email地址是用户ID加上字符串"@gameschool.com"*/
public class InternetUserName {
	private int ID;
	private String userpassword;
	private String email;

	public String ccdemo(int id, String userpassword, String email) {
		this.ID = id;
		this.userpassword=userpassword;
		this.email=email;
		return "ID:" + ID + " " + "用户密码" + userpassword + " " + "邮箱" + email + "";

	}

	public String ccdemo(int id, String userpassword) {
		this.ID = id;
		this.userpassword=userpassword;
		return "ID:" + ID + " " + "用户密码" + userpassword + " " + "邮箱" + email + "lin@132.com";

	}

}
