
public class App {

	public static void main(String[] args) {

		Logger wordWithAsterik = new AsteriskLogger();
		wordWithAsterik.Log("Hello");
		System.out.println();

		Logger errorMessagewithAsterik = new AsteriskLogger();
		errorMessagewithAsterik.Error("Hello");
		System.out.println();

		Logger wordWithSpaces = new SpacedLogger();
		wordWithSpaces.Log("Hello");
		System.out.println();

		Logger errorMessageWithSpaces = new SpacedLogger();
		System.out.println();
		errorMessageWithSpaces.Error("Hello");

	}

}
