import java.util.*;
class Perfect
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        long n1=s1.nextLong();
        int sum=0,i=1;
        while(i<=n1/2)
        {
            if(n1%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum==n1)
        {
            System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
        
    }
}