
public class SpacedLogger implements Logger {

	public void Log(String Log) {

		StringBuilder word = new StringBuilder();
		for (int i = 0; i < Log.length(); i++) {
			word.append(Log.charAt(i)).append(" ");
		}

		System.out.println(word);
	}

	public void Error(String Error) {

		StringBuilder word2 = new StringBuilder();
		for (int i = 0; i < Error.length(); i++) {
			word2.append(Error.charAt(i)).append(" ");
		}
		System.out.println("ERROR: " + word2);

	}

}