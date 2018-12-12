public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		System.out.println(testNegativeCondition(true));
	}

	private static String testNegativeCondition(boolean bool) {
		System.out.println("bool is: " + bool);
		if (!bool) {
			return null;
		}
		return "Done!";
	}
}
