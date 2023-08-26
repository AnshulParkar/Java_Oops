import java.util.*;

class Factorial{
    public static void main(String arg[]){
        Scanner os = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = os.nextInt();
        int f=1;
        int i;
        for(i=1;i<=no;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial is "+f);
    }

}