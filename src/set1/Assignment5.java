package set1;

public class Assignment5 {
	//display the sum of the two given number

public static void main(String [] args) {
	int a = 1;
    int b = 4;
    int c = 6;
    double discriminant = Math.pow(b, 2) - 4*a*c;
    double root1 = (-b + Math.sqrt(discriminant))/(2*a) ;
    double root2 = (-b - Math.sqrt(discriminant))/(2*a) ;

    if(discriminant == 0){
        System.out.println("The root is " + root1);
    }else if(discriminant > 0 ){
        System.out.println("the root will be unequal real roots." + root1 + " " + root2);
    }else{
        System.out.println("The equation has no real root");
    }

}
}
