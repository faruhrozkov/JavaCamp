package interfeces;

public class DatabeseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Databese loglandi :" + message);
		
	}

}
