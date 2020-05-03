import java.util.*;

import akhil.Marks.marks;
public class Main {
        public static void main(String[] args)
        {
     Scanner sc=new Scanner(System.in);
     int count=0;
     int total=0;
     marks arr[]=marks.values();
     List<Students> list=new ArrayList<>();
     List<Integer> markList=new ArrayList<>();
     Students s=new Students();
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
       int count1=0;
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
         count1=1;
         break;
       }
       }while(count1!=1);
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
       
       
        s=new Students(Integer.parseInt(rollNo),name);
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
      int count4=0;
      int flag=0;
       boolean t=false;
       String r=null;
       int count2=0;
       while(!t){
         do {
       System.out.println("Enter Student Roll Number : ");
       r=sc.nextLine();
       if(!(r.matches("[0-9]")))
       {
         System.out.println("Enter number only");
       }
       else {
         count2=1;
         
       }
    }while(count2!=1);
       int rollnum=Integer.parseInt(r);
       if(list.size()==0)
       {
         System.out.println("The roll number is not registered yet");
         break;
       }
       else {
         for(Students x:list)
         {
           if(rollnum==x.getRollNo())
           flag=1;
         }
      
         if(flag!=1)
         {
           System.out.println("The RollNo does not Exists. Please Enter a valid RollNo");
           break;
         }
         else
         {            
                 for(marks i:arr)
                 {
                   do {
                   System.out.println("Enter marks scored in "+i+" : ");
                  
                   String marks=sc.nextLine();
                   if(!(marks.matches("[0-9]")))
                   {
                     System.out.println("Please enter Number only");
                               
                   }
                   else {
                     count4=1;
                   total=total+Integer.parseInt(marks);
                   markList.add(Integer.parseInt(marks));
                   }
                   }while(count4!=1);
                  
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
       int flag3=0;
       int flag1=0;
       int rollnum;
       boolean tt=false;
       while(!tt)
       {
       System.out.println("Enter Student RollNo : ");
       rollnum=sc.nextInt();
       for(Students y:list)
       {
         if(rollnum==y.getRollNo())
           flag1++;
        
       }
         if(flag1==0)
             {
           System.out.println("RollNo does not exists. Please enter a valid rollno");
           break;
             }
         else {
           for(Students i:list)
           {
             if(rollnum==i.getRollNo())
             {
               flag3++;
               if(flag3==flag1)
               {
             
             System.out.println("Student Roll Number : "+i.getRollNo()+"\nStudent Name : "+i.getName());
               }
           }
         }
       }
         if(markList.size()==0)
         {
           System.out.println("Marks are not entered yet.Please enter the marks");
           break;
         }
         else {
           System.out.println("Student Marks\n---------------");
           Iterator itr=markList.iterator();
           for(marks i:arr)
           {
             System.out.println(i+" : "+itr.next());
            
           }
           System.out.println("------------------------------");
            tt=true;
             System.out.println("Total Marks : "+total+"\nPercentage : "+(total*100)/600+"\n----------------------");
             System.out.println("Press any key to continue");
             sc.nextLine();
         }
        continue;    
            
       }
       break;
     }
     }
     }while(count!=1);
     }
        }
}
