package sush;
import java.util.*;
public class Main {
       public static void main(String[] args)
       {
         Scanner sc=new Scanner(System.in);
         List<Student> list=new ArrayList<>();
         List<Marks> markList=new ArrayList<>();
         Student s=new Student();
         Marks m=new Marks();
         int count=0;
         do{
         System.out.println("Enter School name : ");
         String schoolName=sc.nextLine();
         if(!(schoolName.matches("[A-Za-z.' ]+")))
         {
           System.out.println("Enter the valid name");
         }
         else {
           System.out.println("Welcome to "+schoolName+" School Student information management");
           System.out.println("-----------------------------------------------------\n");
           count=1;
         }
         }while(count!=1);
         
         System.out.println("1. Add Student\n2. Add marks for student\n3. show student progress card\n");
         while(true)
         {
         do {
         System.out.println("Please provide valid input from menu options");
         String ch=sc.nextLine(); 
         if(!(ch.matches("^[123]")))
         {
           System.out.println("Please enter eithe 1/2/3 from above menu");
         }
         else {
           count=1;
         switch(Integer.parseInt(ch))
         {
         case 1:
           int c1=0;
           String rollNo=null;
           String name=null;
           boolean a=false;
           do {
           System.out.println("Enter Student Roll Number : ");
            rollNo=sc.nextLine();
           if(!(rollNo.matches("[0-9]")))
           {
             System.out.println("Please enter Number only");
           }
           else {
             c1=1;
             break;
           }
           }while(c1!=1);
           while(!a)
           {
           System.out.println("Enter Student Name : ");
           name=sc.nextLine();
           if(!(name.matches("[A-Za-z]+")))
           {
             System.out.println("Please enter valid name");
           }
           else {
             a=true;
             
           }
           }
           
           
            s=new Student(Integer.parseInt(rollNo),name);
           list.add(s);
           if(list.size()==0)
           {
             System.out.println("Please Enter the Student Details");
           }
           else {
             System.out.println("Student details added successfully\n");
             System.out.println("Press enter any key to continue");
             sc.nextLine();
             continue;
           }
          break;
      
         case 2:
          int flag=0;
           boolean t=false;
           String r=null;
           int c2=0;
           while(!t){
             do {
           System.out.println("Enter Student Roll Number : ");
           r=sc.nextLine();
           if(!(r.matches("[0-9]")))
           {
             System.out.println("Enter number only");
           }
           else {
             c2=1;
             
           }
        }while(c2!=1);
           int roll=Integer.parseInt(r);
           if(list.size()==0)
           {
             System.out.println("The roll number is not registered yet");
             break;
           }
           else {
             for(Student x:list)
             {
               if(roll==x.getRollNo())
               flag=1;
             }
          
             if(flag!=1)
             {
               System.out.println("The RollNo does not Exists. Please Enter a valid RollNo");
               break;
             }
             else
             {            try {
                   System.out.println("Enter Marks scored in Telugu : ");
                   m.setTelugu(sc.nextInt());sc.nextLine();
                   System.out.println("Enter Marks scored in Hindi : ");
                   m.setHindi(sc.nextInt()); sc.nextLine();
                   System.out.println("Enter Marks scored in English : ");
                   m.setEnglish(sc.nextInt());sc.hasNextLine();
                   System.out.println("Enter Marks scored in Maths : ");
                   m.setMaths(sc.nextInt());sc.nextLine();
                   System.out.println("Enter Marks scored in Science : ");
                   m.setScience(sc.nextInt());sc.nextLine();
                   System.out.println("Enter Marks scored in Social : ");
                   m.setSocial(sc.nextInt()); sc.nextLine();
                   markList.add(m);
                            }catch(Exception e)
                                       {
                                          System.out.println("Please enter Number only");
                                        }
            
             }
             }
           
         
               if(markList.size()==0)
               {
                 System.out.println("Student Marks are not added");
 
               }
               else {
                 System.out.println("Student details are added successfully\n");
                 t=true;
                 System.out.println("Press any key to continue:");
                 sc.nextLine();
                 continue;
                 
               }
               continue;
             }
           
           break;
         case 3:
           int flag1=0;
           boolean tt=false;
           while(!tt)
           {
           System.out.println("Enter Student RollNo : ");
           int rollnum=sc.nextInt();
           for(Student y:list)
           {
             if(rollnum==y.getRollNo())
               flag1=1;
           }
             if(flag1!=1)
                 {
               System.out.println("RollNo does not exists. Please enter a valid rollno");
               break;
                 }
             else {
               for(Student i:list)
               {
                 System.out.println("Student Roll Number : "+i.getRollNo()+"\nStudent Name : "+i.getName());
               
               }
               System.out.println("Student Marks\n---------------");
               for(Marks i:markList)
               {
                 System.out.println("Telugu : "+i.getTelugu()+"\nHindi : "+i.getHindi()+"\nEnglish : "+i.getEnglish()+"\nMaths : "+i.getMaths()+"\nScience : "+i.getScience()+"\nSocial : "+i.getSocial()+"\n---------------------------");
                
               }
                tt=true;
                 System.out.println("Total Marks : "+m.getTotalMarks()+"\nPercentage : "+(m.getTotalMarks()*100)/600+"\n----------------------");
                 System.out.println("Press any key to continue");
                 sc.nextLine();
             }
           }
           }
         }
         
         }while(count!=1);
         
         }
         
       }
       
}
