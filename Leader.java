import java.util.*;
import java.util.Scanner;
public class Leader{
    public static int[] LeaderArray(int[] arr){
        int n=arr.length;
        int[] neww=new int[n];
        int count=0;
        int max=arr[n-1];
        neww[count]=max;
        count++;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                neww[count]=arr[i];
                count++;
                }
        }
                for(int i=count-1;i>=0;i--){
                    System.out.print(neww[i]+" ");
                }
        return neww;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        LeaderArray(arr);
    }
}/*6  
16 17 4 3 5 2
17 5 2 
