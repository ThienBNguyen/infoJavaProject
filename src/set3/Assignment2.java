package set3;
class Teacher{
	private String teacherName;
	private String subject;
	private double salary;
	public Teacher(String teacherName, String subject, double salary) {
		this.teacherName = teacherName;
		this.subject = subject;
		this.salary = salary;
	}
	public void teacherDescription() {
		System.out.println("Name : " + teacherName + ", Subbject : " + subject + ", salary : " + salary);

		
	}
		public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Assignment2 {
	public static void main( String [] args) {
		Teacher teacher1 = new Teacher("alex", "Java Fundamentals", 1200L);
		Teacher teacher2 = new Teacher("John", "RDBMD", 800L);
		Teacher teacher3 = new Teacher("Sam", "Networking", 900L);
		Teacher teacher4 = new Teacher("Maria", "Python", 900L);
		teacher1.teacherDescription();
		teacher2.teacherDescription();
		teacher3.teacherDescription();
		teacher4.teacherDescription();
		
		
	}
}
