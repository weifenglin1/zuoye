package zuoye;

public class CoustomerTest {
    public static void main(String[] args) {
    	Coustomer coustomer=new Coustomer();
    	coustomer.setName("张先生/女士");
    	coustomer.service();
	
    
     VIPCoustomer vipcoustomer=new VIPCoustomer();
     vipcoustomer.setLevel(3);
     vipcoustomer.setName("张先生/女士");
     vipcoustomer.touSu();
    }
}
