class Human
{
    private int age ;
    private String name;

    public void setage(int age)
    {
        this.age =age;
    }
    public void setname(String name)
    {
        this.name = name;
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

public class EncapsulationThis 
{
    public static void main(String[] args) 
    {
      Human obj = new Human();
      obj.setage(26);
      obj.setname("SherinA");
      System.out.println(obj.getage() + " : " + obj.getname());

    }
}

