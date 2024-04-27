public class UpdatedSwitchStatement 
{
    public static void main(String[] args) 
    {
         String day = "Monday";
      /*  
        switch(day)
        {
            case "Saturday","Sunday" -> System.out.println("5am");
            case "Monday" -> System.out.println("6am");
            default -> System.out.println("8am");
            */
         String result ="";

         /*    switch(day)
            {
                case "Saturday","Sunday" -> result = "5am";
                case "Monday" -> result = "6am";
                default -> result = "8am"; 
            };

        System.out.println(result);
        */
        result = switch(day)
        {
            case "Saturday","Sunday" ->"5am";
            case "Monday" -> "6am";
            default ->  "8am"; 
        };
        System.out.println(result);
    }
}
