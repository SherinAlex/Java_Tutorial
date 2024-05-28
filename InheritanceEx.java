class Clac
{
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1,int n2)
    {
        return n1 - n2;
    }
}
public class InheritanceEx 
{
   public static void main(String[] args) 
   {
    ClacEx obj = new ClacEx();
    int r1 = obj.add(4,6);
    int r2 = obj.sub(4,6);
    int r3 = obj.mult(4,6);
    int r4 = obj.div(4,6);
    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

     } 
}
