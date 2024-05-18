public class StrBuffer 
{
    public static void main(String[] args) 
    {
        StringBuffer str= new StringBuffer("Sherin");
        //		System.out.println(sb.length());
        //		System.out.println(sb.capacity());
                str.append(" Alex");
                System.out.println(str);
                
        //		String str=sb.toString();
                
        //		sb.deleteCharAt(2);
        //		sb.insert(0,"Java");
        //		sb.insert(6,"java");
        //		sb.setLength(30);
                str.ensureCapacity(100);
                
                System.out.println(str); 
    }
}
