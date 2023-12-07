package org.jspApp;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
	  System.out.println("Enter your student six subjects marks (out of 100):");
	  System.out.println();
	  System.out.println("Enter English marks:");
	  int English=sc.nextInt();
	  System.out.println("Enter Hindi marks:");
	  int Hindi=sc.nextInt();
	  System.out.println("Enter Telugu marks:");
	  
	  int Telugu=sc.nextInt();
	  System.out.println("Enter Science marks:");
	  int Science=sc.nextInt();
	  System.out.println("Enter Social marks:");
	  
	  int Social=sc.nextInt();
	  System.out.println("Enter Chemistry marks:");
	  int Chemistry=sc.nextInt();
	  
	  int Total=English+Hindi+Telugu+Science+Social+Chemistry;
	  
	  double per=Total/5;
	  
	  if(per>=90 && per<=95) {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"A+");
	  }
	  else if(per>=85 && per <= 90) {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"A");
	  }
	  else if(per>=70 && per <= 80) {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"B+");
	  }
	  else if(per>=60 && per<=70) {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"B");
	  }
	  else if(per>=50 && per<=60) {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"C");
	  }
	  else if(per>=40 && per<=50) {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"D");
	  }
	  else if(per>=35 && per<=40) {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"E");
	  }
	  else {
		  System.out.println("Total Marks:"+Total);
		  System.out.println("Average percentage:"+per);
		  System.out.println("Grade:"+"F");	
		  System.out.println("Fail");
		  }
	}

}
