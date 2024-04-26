public class AssignmentOperator 
{
 public static void main(String[] args) 
 {
 /**   int num1 = 10;
    int num2 = 20;
    int result1 = num1 + num2;
    int result2 = num1 - num2;
    int result3 = num1 * num2;
    int result4 = num1 / num2;
    int result5 = num1 % num2;

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    **/
    int num=7;
//		num=num+2;
//		num+=2;
//		num*=2;
		
		num++;    //post increment
		++num;    //pre increment
		num--;    //post decrement
		--num;	  //pre decrement
		System.out.println(num);
		
		int result=num++; //fetch the value and then increment
		System.out.println(result);		
	

 }   
}
