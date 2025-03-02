import java.io.IOException.*;
import java.io.RandomAccessFile;
import java.io.Scanner;
class Transfer
{
	public static void main(String args[]){
	string a;
	try{
		FileWriter o1=new FileWriter("File1.txt");
		System.out.println("Enter the content");
		a= readLine();
		o1.write(a);
		o1.close();
		}
	catch(IOException e){}
	}
}
		