
public class AsteriskLogger implements Logger {

	String asterik = "*******************";

	public void Log(String Log) {
		System.out.println("***" + Log + "***");

	}

	public void Error(String Error) {

		System.out.println(asterik + '\n' + '\n' + "*** Error: " + Error + "***" + '\n' + '\n' + asterik);

	}

}
