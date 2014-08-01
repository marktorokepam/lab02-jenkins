package quickstart.quickstart;

import java.io.ObjectInputStream.GetField;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		App app =  new App();
		System.out.println(app.getClass().getPackage().getImplementationVersion());
		System.out.println("Hello World!");
	}
}
