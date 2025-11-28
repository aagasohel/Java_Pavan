package classObjectMethodDemo;

public class StudentMain {

	public static void main(String[] args) {
		//creating object with reference variable
				Student stu=new Student();
				
				stu.sid=1010;
				stu.sname="Krishna";
				stu.grad='A';
				
				stu.printStudentData();
				
		//creating object without reference reference variable
				//new Student();
				
				/*new Student().sid=102;
				new Student().sname="John";
				new Student().grad='B';
				new Student().printStudentData();
				*/
				
				//Student stu=new Student();
				
				//1) assign data using using object reference 
				stu.sid=101;
				stu.sname="John";
				stu.grad='A';
				
				
				//2) assing data by using user defined method
				//stu.setStuData(101,"John",'B');
				
				
				//3) using constructor
//				Student stu1=new Student(101,"John",'B');
//				stu1.printStudentData();

	}

}
