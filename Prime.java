import java.io.*;
public class Prime {
    public static boolean p(int a)
    {
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        System.out.print(p(3));
    }
}
