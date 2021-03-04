package set2;

public class Assignment2 {
	public static void main(String [] args) {
		int heads, legs, chickens, rabbits;
		//1 chicken = 1 head 2 legs
		//1 rabbit = 1 head, 4 legs
		heads = 150;
		legs = 500;
		rabbits = (legs) -2 * heads; //
		rabbits = rabbits /2;
		chickens = heads-rabbits;
		int chickenLegs = chickens * 2;
		int rabbitLegs = rabbits * 4;
		int totalLegs = chickenLegs + rabbitLegs; 
		if(totalLegs != legs) {
			System.out.println("The number of chikens and rabbits cannot be found.");
		}else {
				System.out.println(rabbits);
				System.out.println(heads - rabbits);
		}		
		}
	}


