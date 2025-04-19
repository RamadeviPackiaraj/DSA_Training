import java.util.*;
public class RemoveUnbalancedParanthesis{
    public static String isBalanced(String s1){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:s1.toCharArray()){
            if(ch=='('){
              sb.append(ch);
               count++;
            }
            else if(ch==')'){
                if(count>0){
                    sb.append(ch);
                    count--;
                }
            }
            else{
                sb.append(ch);
            }
        }
        StringBuilder res=new StringBuilder();
        count=0;
        for(int i=sb.length()-1;i>=0;i--){
            char c=sb.charAt(i);
        if(c==')'){
         count++;

            res.append(c);
        }
        else if(c=='('){
            if(count>0){
                count--;

                res.append(c);
            }
        }
        else{
            res.append(c);
        }
        
        }
        return res.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isBalanced(s));
        sc.close();
    }
}