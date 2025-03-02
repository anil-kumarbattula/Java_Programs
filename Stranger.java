import java.util.*;
class Stranger
{
public static  void main(String args[])
{
int i,j,r=0,n=0,count=0,x=0;
for(i=1;i<=100;i++)
{
	int z=i;
	while(z!=0)
	{
		r=z%10;
		//System.out.println(+r);
		z=z/10;
		if(r!=0 || r!=1)
		{
			x=0;
			for(j=2;j<=r;j++)
			{
				if(r%j==0)
				{
					x+=1;
				}
			}
		}
	}
	if(x==1)
	{
		count=count+1;
	}
}
System.out.println("No of stranger numbers are:" +count);
}
}