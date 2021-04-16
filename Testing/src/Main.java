public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hello World");

		try {
			int test = 1;
			App obj = new App();
			obj.PrintText("Test");
			obj.PrintText("Test2");

			if (args.length > 0) {
				for (String string : args) {
					obj.PrintText(string);

				}
			}
		} catch (Exception ex) {

		}
	}
}
