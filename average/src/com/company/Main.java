package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double number1=0, number2, counter=0, average;
        String mark;
            System.out.println("Insert a mark: ");
              mark= scan.next();	// we read the mark as string to check the word "end"
                while(mark!="end")
                {  // if the mark isn't an end then we pass it to double to work with it
                    number2=Double.parseDouble(mark);
                    counter++;   //counter of numbers
                    number1+=number2;  // sum of all the notes
                    System.out.println("Insert a mark: ");
                    mark=scan.next();
                }
                    if(counter!=0)
                    {
                        average=number1/counter;  //calculate the average
                        System.out.println("The average is ."+average);
                    }
    }
}
