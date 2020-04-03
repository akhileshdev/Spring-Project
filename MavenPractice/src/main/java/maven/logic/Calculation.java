package maven.logic;

public class Calculation 
{
	 public static int findMax(int arr[])
     {    
  	   int max = arr[0];
         for(int i = 0;i < arr.length;i++)
         {
      	   if(arr[i] > max)
      		   max = arr[i];
         }
         
         return max;
     }
	 
	 public static int squareNum(int num)
	 {
		  return num*num;  //square of a number
	 }
	 
	 public static long reverseNum(long num)
	 {
		 long rev = 0;
		 int temp;
		 
		 while(num > 0)
		 {
			 temp = (int)num%10;
			 
			 rev  =  rev*10 + temp;
			 
			 num /= 10;
		 }
		
		System.out.println("Rev : "+rev); 
		return rev; 
	 }

}
