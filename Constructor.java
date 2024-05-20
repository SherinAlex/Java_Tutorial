class Human
{
    private int age ;
    private String name;

    public Human()
    {
        System.out.println("Fking work");
        age =23;
        name ="Default";
    }

    public Human(int age,String name)
    {
        this.age =age;
        this.name =name;
    }
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

public class Constructor 
{
    public static void main(String[] args) 
    {
      Human obj = new Human();
      Human obj1 = new Human(18,"Defauult");
      

      obj.setage(26);
      obj.setname("SherinA");
      System.out.println(obj.getage() + " : " + obj.getname());
      System.out.println(obj1.getage() + " : " + obj1.getname());

    }
}
