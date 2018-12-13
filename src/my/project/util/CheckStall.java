package my.project.util;
import java.util.Scanner;
public class CheckStall {
	public static void main(String [] args)
    {
    Stall stallin = new Stall();  
    System.out.print("Enter number of stalls");
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    boolean [] stalls = new boolean [i];
    while(!stallin.giveFlag(stalls))    
    {
        stallin.findStalls(stalls);
        stallin.printStalls(stalls);
    }

    }
}
