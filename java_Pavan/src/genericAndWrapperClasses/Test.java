package genericAndWrapperClasses;

//We use < > to specify Parameter type
 class Test<T> { 

	T obj; // T is a placeholder for any data type
	Test(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}	
}
