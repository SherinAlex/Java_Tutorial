class Human
{
    private int age ;
    private String name;

    public void setage(int a)
    {
        age =a;
    }
    public void setname(String S)
    {
        name = S;
    }
    public int getage()
    {
        return age;
    }

    public String getname()
    {
        return name;
    }

}

public class EncapsuleEx 
{
    public static void main(String[] args) 
    {
      Human obj = new Human();
      obj.setage(26);
      obj.setname("SherinA");
      System.out.println(obj.getage() + " : " + obj.getname());

    }
}
