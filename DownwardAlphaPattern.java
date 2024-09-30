public class DownwardAlphaPattern 
{
    public static void main(String[] args) 
    {
        int a=64;
        int b=70;
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(a+j)+" ");
                System.out.print((char)(b+j)+" ");
            }
            System.out.println();
        }
    }
}
