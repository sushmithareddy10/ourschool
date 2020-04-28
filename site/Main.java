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
    	   if(!(schoolName.matches("[A-Za-z ]+")))
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
    	   System.out.println("Please provide valid input from menu options");
    	   int ch=sc.nextInt(); sc.nextLine();
    	   switch(ch)
    	   {
    	   case 1:
    		   System.out.println("Enter Student Roll Number : ");
    		   int rollNo=sc.nextInt();sc.nextLine();
    		   System.out.println("Enter Student Name : ");
    		   String name=sc.nextLine();
    		    s=new Student(rollNo,name);
    		   list.add(s);
    		   if(list.size()==0)
    		   {
    			   System.out.println("Please Enter the Student Details");
    		   }
    		   else {
    			   System.out.println("Student details added successfully\n");
    			   System.out.println("Press any key to continue");
    			   sc.hasNextLine();
    			   continue;
    		   }
    		  break;
    	
    	   case 2:
    		    
    		   int c=0;
    		   boolean t=false;
    		   while(!t){
    		   System.out.println("Enter Student Roll Number : ");
    		   
    		   int rollno=sc.nextInt();
    		   for(Student x:list)
    		   {
    			   if(!(rollno==(x.getRollNo())))
    			   {
    				   System.out.println("The RollNo does not Exists. Please Enter a alid RollNo");
    				   break;
    			   }
    			   else
    			   {
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
    				   if(markList.size()==0)
    				   {
    					   System.out.println("Student Marks are not added");
 
    				   }
    				   else {
    					   System.out.println("Student details are added successfully\n");
    					   t=true;
    					   System.out.println("Press any key to continue:");
    					   sc.hasNextLine();
    					   continue;
    					   
    				   }
    			   }
    		   }
    		   };
    		   break;
    	   case 3:
    		   int sum=0;
    		   boolean tt=false;
    		   while(!tt)
    		   {
    		   System.out.println("Enter Student RollNo : ");
    		   int rollnum=sc.nextInt();
    		   for(Student y:list)
    		   {
    			   if(!(rollnum==y.getRollNo()))
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
    				   
    					   System.out.println("Total Marks : "+m.getTotalMarks()+"\nPercentage : "+(m.getTotalMarks()*100)/600+"\n----------------------");
    					   System.out.println("Press any key to continue");
    					   sc.hasNextLine();
    					   continue;
    			   }
    		   }
    		   }
    		  
    	   }
    	   }
    	  
    	   
       }
}