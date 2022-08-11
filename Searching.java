import java.util.*;
public class Searching{
    public static void main(String[] args) {
        int[] A = {5,9,4,52,33,10,55,48,33,78};

        System.out.print("Please enter the number that you to Search in array: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<A.length;i++){
            if(A[i]==x){
                System.out.print("The number is found at index : "+i);
                System.exit(0);
            }
        }
        System.out.println("Not found.");
        
    }
}