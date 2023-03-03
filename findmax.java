import java.util.Scanner;
public class findmax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=sc.nextInt(), number;
        while(sc.hasNextInt()){
            number=sc.nextInt();
            if(number>max)
                max=number;
        }
        System.out.println(max);
    }
}
