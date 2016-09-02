
public class SolidLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook fb = new Facebook();
		Google gl = new Google();
		LinkedIn Ln = new LinkedIn();
		
		String userName;
		String Password;
		String userName;
		
		fb.getUserName(String userName);
		fb.getPassword(String Password);
		fb.sendForLogin(String userName);
		
		gl.getUserName(String userName);
		gl.getPassword(String Password);
		gl.sendForLogin(String userName);
		
		Ln.getUserName(String userName);
		Ln.getPassword(String Password);
		Ln.sendForLogin(String userName);
	}

}
