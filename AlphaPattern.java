public class AlphaPattern 
{
    public static void main(String[] args) 
    {
        int a=64;
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(a+i)+ " ");
            }
            System.out.println();
        }
    }
}
