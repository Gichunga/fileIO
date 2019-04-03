/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsdetails;

/**
 *
 * @author Harryx
 */
import java.util.Scanner;
import java.io.*;

public class StudentsDetails {


   
    				          
    	public static void main (String [] args) throws FileNotFoundException {
    		
    		String fname, lname,studentId,dob,  address;
    	//System.out.println("studenttId\t  first name   last name   dob   address");
    	Scanner inFile = new Scanner(new FileReader ("C:\\Users\\Harryx\\Documents\\NetBeansProjects\\StudentsDetails\\src\\studentsdetails\\try.txt"));
    		while(inFile.hasNext())
    		{
    			studentId = inFile.nextLine();
    			System.out.println(studentId);
    			fname = inFile.nextLine();
    			lname = inFile.nextLine();
    			dob= inFile.nextLine();
    			address = inFile.nextLine();
    		
    		//Confused here;
    		//System.out.printf("%s %s %s %s %s\n", studentId,fname,lname,dob,address);
    			
    		inFile.close();
    	}
    }
    }