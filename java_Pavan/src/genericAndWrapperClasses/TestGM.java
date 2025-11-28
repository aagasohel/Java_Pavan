package genericAndWrapperClasses;

public class TestGM {

	static<T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName()+"="+element);
	}
}
