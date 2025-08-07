
public class problem1 {

	public static void main(String[] args) {
		        double a = 10;
		        double b = 5;
		        String op = "divide"; 

		        if (op.equals("add"))
		            System.out.println(a + b);
		        else if (op.equals("subtract"))
		            System.out.println(a - b);
		        else if (op.equals("multiply"))
		            System.out.println(a * b);
		        else if (op.equals("divide"))
		            System.out.println(b != 0 ? a / b : "Cannot divide by zero");
		        else
		            System.out.println("Invalid operation");
		    }

	}

