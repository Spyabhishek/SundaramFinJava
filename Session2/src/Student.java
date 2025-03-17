
public class Student {
int id;
String name;
static String college="RVCE"; 



	public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
void displayDetails()
{
	System.out.println(id+" "+name+" "+college);
}


	public static void main(String[] args) {
		Student s=new Student(10,"Ann");
		Student s1=new Student(11,"BAnn");
		Student s2=new Student(12,"KAnn");
	s.displayDetails();
	s1.displayDetails();
	s2.displayDetails();
		
	}

}