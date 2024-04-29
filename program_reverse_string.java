public class program_reverse_string  
{
    public static void main(String[] args)
    {
        String str = "myfirstprogram" ;
        String rstr = "";
        char ch ;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            rstr = ch + rstr ;
        }
            System.out.println("Orginal String:"+str );
            System.out.println("The reversed string: "+rstr);
    }
    
}
