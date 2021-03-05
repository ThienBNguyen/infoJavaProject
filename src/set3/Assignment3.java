package set3;

public class Assignment3 {
public static double[] findDetails(double[] salary) {
	double sum = 0;
	int lesserSalary = 0;
	int greaterSalary = 0;
	for(double value:salary) {
		sum = sum + value;
	}
	double average = sum/salary.length;
	for(int i = 0; i < salary.length; i++) {
		if(salary[i] >= average) {
			greaterSalary++;
		}else {
			lesserSalary++;
		}
	}
	double [] details = {average, greaterSalary, lesserSalary};
	
	return details;
}
public static void main(String [] args) {
	double[] salary = {
			23500.0, 25080.0, 28760.0, 22340.0, 19890.0 
	};
	double[] details = findDetails(salary);
	  System.out.println("Average salary: "+ details[0]);
      System.out.println("Number of salaries greater than the average salary: "+ details[1]);
      System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
}
}
