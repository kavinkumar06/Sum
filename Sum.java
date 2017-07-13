# Sum
import java.io.*;
import java.util.*;
public class Sum
{
  public static void main(String args[])
  {
   int n=6;
   int sum=0;
   Scanner sc=new Scanner(System.in);
   for(int i=1;i<=n;i++)
   {
     sum=sum+i;
     System.out.println("Sum after adding"+i+"is:"+sum);
     }
     System.out.println("Sum of numbers:till"+n+"is:"+sum);
     }
    } 
