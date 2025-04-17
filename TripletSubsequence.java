import java.util.*;
import java.util.Scanner;
public class TripletSubsequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int firstSmallest=arr[0];
        int second=arr[0];//later updated
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]<firstSmallest){
              firstSmallest=arr[i];  
            }
            else if(count==0||arr[i]<=second){
                second=arr[i];
                count=1;
            }
            else //third triplet Clas found
            {
                System.out.println(1);
                return;
            }
            }
          System.out.println(0);  
        }
    }
    /*5
2 2 4 3 2
1
becaue triplet sequence will be 2 3 4*/
