class Addition
{
    public int add(int n1, int n2)
    {
        //int a;
		//System.out.println("in add");
		//return 0;

		//int r=num1+num2;
		//return r;

		int r=n1+n2;
		return r;

    }
}public class ClassAndObject 
{
    public static void main(String[] args) 
    {
        int num1 = 6;
        int num2 = 8;

        Addition addit = new Addition();
        int result = addit.add(6 , 8);
        //calc.add();
		//int result=calc.add();
		//int result=num1+num2;
		System.out.println(result);
		



    }    
}
