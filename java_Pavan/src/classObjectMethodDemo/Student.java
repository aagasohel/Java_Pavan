package classObjectMethodDemo;

public class Student {

	int sid;
	String sname;
	char grad;

	void printStudentData()
	{
		System.out.println(sid+"  "+sname+"    "+grad);
	}
	
	void setStuData(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grad=g;
	}
	
	Student()
	{
		
	}
	
	Student(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grad=g;
	}
}
