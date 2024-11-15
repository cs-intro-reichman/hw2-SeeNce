// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheering = args[0];
        int n = Integer.parseInt(args[1]);
        String an = "AEFHILMNORSX";
        boolean is = false;
        for (int i=0; i<12; i++){
                if(an.charAt(i) == cheering.charAt(0))
                {
                        is = true;
                        break;
                }
        }

        
        for (int i=0; i<n; i++)
        {
                if (is)
                {
                        System.out.println("");
                }
                
        }

        
        }
}
