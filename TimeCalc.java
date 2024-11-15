public class TimeCalc {
    public static void main(String[] args) {
        // and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addative = Integer.parseInt(args[1]);
        // System calculates new time with the added minutes
        minutes = (hours*60)+minutes+addative;
        hours = ((minutes/60)%24);
        minutes = minutes - ((minutes/60)*60);
        // System prints the right time format
        if((minutes / 10) == 0 && (hours / 10) == 0)
			System.out.println("0" + hours + ":0" + minutes);
				else 
                     if((minutes / 10) == 0 && (hours / 10) != 0)
                         System.out.println("0" + hours + ":" + minutes);
                            else
                                System.out.println(hours + ":0" + minutes);

        



    }
}
