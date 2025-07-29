class Hello{
public static void main(String args[]){
	int z = Operation.Add(Integer.parseInt(args[0]),
		Integer.parseInt(args[1]));
	System.out.println("Sum of passed argument is : ");
	System.out.println(z);
	}

class Operation{
	static int Add(int a, int b){
	return a+b;
		}
	}
}

