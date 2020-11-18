package Tasks;

public class LoginPagePom extends Utilityclass{
	public static void main(String[] args) 
	{
		loadDriver();
		launchUrl("https://www.facebook.com");
		LoginPage l=new LoginPage();
		insert(l.getTxtUser(),"forevernatarajan");
		insert(l.getTxtPass(),"THATSMYSECRET1988");
		click(l.getBtn());
		
	}

}
