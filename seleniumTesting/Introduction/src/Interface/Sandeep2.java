package Interface;

public interface Sandeep2 {

	public void add();
	
	public void divide();
	
	default void prin() {
		System.out.println("hello");
	}
}
