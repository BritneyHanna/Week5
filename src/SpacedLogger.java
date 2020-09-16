
public class SpacedLogger implements Logger {

	public void Log(String Log) {
		for (int i = 0; i < Log.length(); i++) {
			System.out.print(Log.charAt(i) + " ");
		}
	}

	public void Error(String Error) {
		String word = " ";

		for (int i = 0; i < Error.length(); i++) {
			word += Error.charAt(i) + " ";
		}
		System.out.println("ERROR: " + word);

	}
}