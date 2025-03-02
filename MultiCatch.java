class MultiCatch
{
	public static void main (String args[]){
		try{
			int a=args.length;
			System.out.println(a);
			int b=147/a;
			int c[]={1};
			c[2]=14;
			}catch(ArithmeticException e){
			System.out.println("Divide by 0:"+e);
			}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index is"+e);
		}
		System.out.println("After try/catch block");
	}
}