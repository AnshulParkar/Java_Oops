import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pr1b {
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Enter the maths marks");
        int math=Integer.parseInt(br.readLine());
        System.out.println("Enter Physics matks");
        int phy=Integer.parseInt(br.readLine());
        System.out.println("Enter Chemistry matks");
        int chem=Integer.parseInt(br.readLine());
        int tot = phy+chem+math;
        if(math>=60 && phy>=50 && chem>=40 && tot>=200)
        {
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        br.close();
    }
}
