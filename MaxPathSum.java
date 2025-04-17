import java.util.*;
import java.util.Scanner;
public class MaxPathSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
            }
        int m=sc.nextInt();
        int[] B=new int[m];
        for(int i=0;i<m;i++){
            B[i]=sc.nextInt();
        }
        System.out.println( findSum(A,B));
    }
public static int findSum(int[] A,int[] B){
    int n=A.length;
    int m=B.length;
    int result=0;
    int i=0,j=0,sumA=0,sumB=0;
    while(i<n&&j<m){
        if(A[i]<B[j]){
            sumA+=A[i];
            i++;
        }
        else if(B[j]<A[i]){
            sumB+=B[j];
            j++;
        }
        else{
            result+=(sumA>sumB?sumA:sumB)+A[i];
            sumA=0;
            sumB=0;
            i++;
            j++;
        }
        
    }while(i < A.length) {
            sumA += A[i++];
        }

        while(j < B.length) {
            sumB += B[j++];
        }
        result+=(sumA>sumB?sumA:sumB);

    return result;
}
}/*5
2 3 7 10 12
4
1 5 7 8
o/p 35 
1+5+7+10+12 = 35*/