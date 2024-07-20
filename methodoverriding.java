
class Clac
{
    public int add(int n1,int n2)
    {
        return n1 + n2;    
    }
}

class AdvClac extends Clac
{
    public int add(int n1,int n2)
    {
        return n1 + n2 + 1; 
    }
}
public class methodoverriding 
{
    public static void main(String args[])
    {
        AdvClac obj = new AdvClac();
        int r1 = obj.add(6,4);
        System.out.println(r1);
    }
}
