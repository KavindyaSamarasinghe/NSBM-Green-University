package com.mycompany.p7q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P7Q3 
{

    public static void main(String[] args) 
    {
        try
        {
            File file = new File("pqrs.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                String line= sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found");
        }
    }
}

//output:-  Error: File not found