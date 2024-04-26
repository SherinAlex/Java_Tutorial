public class Ternary 
{
    public static void main(String[] args) 
    {
    //		int n=4;
    //		int result=0;
    //		if(n%2==0)
    //			result=10;
    //		
    //		else
    //			result =20;
    //		System.out.println(result);
            
      /*       int n=5;
            int result=0;
            result = n%2==0 ? 10 : 20;
            System.out.println(result);
            */
            int x = 6;
            int y = 65;
            int z = 110;
            int result = 0;
            result = x>y && x<z ? x : (y > z ? y : z) ;
            System.out.println(result);


        }
}
