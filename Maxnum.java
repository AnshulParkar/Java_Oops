import java.util.Scanner;

public class Maxnum {
    
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int large;
	
        if(num1 > num2 && num1 > num3) {
            large = num1;
        }
        else if(num2 > num3 && num2 > num1) {
            large = num2;
        }
        else {
            large = num3;
        }

        System.out.println("Largest Number is " + large);
    }

    public static void main(String[] args){
	System.out.println("Anshul Parkar\n C23-122\n");
        Maxnum o = new Maxnum();
        o.getData();
    }
}
