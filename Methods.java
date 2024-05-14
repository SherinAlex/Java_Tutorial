class computer
{
    public void MusicPlayer()
    {
        System.out.println("Music Playing. .");
    }

    public String GetAPen(int cost)
    {
        if(cost >=10)
            return "Pen";
        return "Nothing";
    }
}


public class Methods 
{
    public static void main(String[] args) 
    {
        computer obj = new computer();
        obj.MusicPlayer();
        String str = obj.GetAPen(2);
        System.out.println(str);
         
    }
    
    
}
