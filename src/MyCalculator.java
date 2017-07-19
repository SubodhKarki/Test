
import java.util.Scanner;
class Solution
{
   void power(int n, int p){
	   int x=(int)Math.pow(n, p);
	   System.out.println(x);
    }
}

class myCalculator{


public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
         System.out.println("enter the number");
        int n1=in.nextInt();
        System.out.println("Enter another number");
        int no=in.nextInt();
        if(n1<0 && no<0)
        {
        	try {
				throw new MyException();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else
        {
        Solution s=new Solution();
        s.power(n1, no);
        }
        
        
        }

    }


class MyException extends Exception{
	MyException(){

	
		System.out.println("n and p must be non negative number");
	}
	}
