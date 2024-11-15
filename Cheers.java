// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        // user inputs "cheering" string and number of cheers
        String cheering = args[0];
        int n = Integer.parseInt(args[1]);
        // "an" chars
        String letters = "AEFHILMNORSX";
        // the system will run a loop based on the number of characters in 'cheering'
        int temp=0;
        while(temp < cheering.length())
        {
                // system checks if one on the "an" letters are at the char's position
                boolean flag = false;
                for(int i=0; i<12; i++)
                {
                        if(cheering.charAt(temp) == letters.charAt(i)){
                                flag = true;
                                break;
                        }
                }
                // system prints "Give me an\a CHAR: CHAR!"
                if(flag == true)
                        System.out.println("Give me an " + cheering.charAt(temp) +": " + cheering.charAt(temp) +"!");
                        else System.out.println("Give me a  " + cheering.charAt(temp) +": " + cheering.charAt(temp) +"!");

                temp++;
        }
        // system prints the cheering word as many times as 'n'
        System.out.println("What does that spell?");
        for(int i=0; i<n; i++){
                System.out.println(cheering + "!!!");
        }


        
        }
}
