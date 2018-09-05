package api.lang.system;

public class SystemProperty {

	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaVer = System.getProperty("java.Version");
		String javaHome  = System.getProperty("java.home");
		
		
		System.out.println("system name :> " + osName);
		System.out.println("user name :>" + userName);
		System.out.println("user home directory :>" + userHome);
		System.out.println("JAVA Version :>" + javaVer);
		System.out.println("Path to JRE" + javaHome);
		
	
	}

}
