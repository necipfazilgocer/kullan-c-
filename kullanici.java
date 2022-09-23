package kullanici;
import java.util.Scanner;
public class kullanici {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String username,pass;
	System.out.println("Kullanıcı adını giriniz.");
	username=scanner.nextLine();
	System.out.println("Şifre giriniz.");
	pass=scanner.nextLine();
	if(  (username.equals("abc"))&&(pass.equals("1234"))  ) {
		
		System.out.println("Sisteme giriş yaptınız.");
		
	}
	else 
	{
		
		System.out.println("Kullanıcı adı veye şifre yanlış");
	}
	

	}

}
