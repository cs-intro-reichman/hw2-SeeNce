// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int temp=1;
		int counter = n;
		boolean concise = true;
		for(int i=1; i<counter+1; i++)
		{
			temp = 1;
			n=i;

			if(mode.equals("v")){	
				System.out.print(n + " ");
			do {
				if(n%2==0)
					n=n/2;
						else n=(n*3)+1;
				temp++;
				System.out.print(n + " ");
			} while(n!=1);
				System.out.print("(" + temp + ")");
			System.out.println();
			}else{
				do {
					if(n%2==0)
						n=n/2;
							else n=(n*3)+1;
					temp++;
				} while(n!=1);
					if(n!=1)
						concise=false;
						
		}
		
	}
	if(mode.equals("c"))
	{
		if(concise)
			System.out.println("Every one of the first " +counter + " hailstone sequences reached 1.");
				else System.out.println("error");
	}
	if (mode.equals("v")) {
		System.out.println("Every one of the first " + counter + " hailstone sequences reached 1.");
	}


	}
}
