package Interface;

public interface Sandeep1 {

	public void add();
	
	public void sub();
	
	public void mul();
	
	default void prin() {
		System.out.println("hello");
	}
}
