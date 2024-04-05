package abstraction;

public interface Printable {
	void display();

	default void show() {
		System.out.println("Inside show: Drawable");
	}

}
