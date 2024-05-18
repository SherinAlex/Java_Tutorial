class student
{
    int rollno;
    String name;
    int marks;
}
public class Enhancedforloop 
{
    public static void main(String[] args) 
    {
        student s1 = new student();
        s1.rollno = 101;
        s1.name = "Ritik";
        s1.marks =66;

        student s2 = new student();
        s2.rollno = 102;
        s2.name = "Arjeet";
        s2.marks =76;

        student s3 = new student();
        s3.rollno = 103;
        s3.name = "Atharv";
        s3.marks =86;

      //  System.out.println(s2.name + " : " + s2.marks);

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

     /*  for(int i=0;i<students.length;i++)
      {
        System.out.println(students[i].name + " : " + students[i].marks);
      }
      */
      for(student stud : students)
      {
        System.out.println(stud.name + " : " + stud.marks);
      }


    }
}
