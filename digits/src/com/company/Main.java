package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //counters of number of digits oneDigit is for one digit, twoDigits is for 2 digits, treeDigits is for 3 digits and moreThreeDigits is for more than 3 digits
        int oneDigit = 0, twoDigits = 0, treeDigits = 0, moreThreeDigits = 0;
             Scanner scan=new Scanner(System.in);
             System.out.println("Insert a number: ");
        // read the number as string to check the word "end"
            String number = scan.next();
                    while(number!="end")
                    {
                        int input = Integer.parseInt(number);
                        if(input != 0)
                        {
                            if(input/10 == 0)
                                oneDigit ++;  // it only has one digit
                            else
                            if (input/100 == 0)
                                twoDigits ++;  // the number has 2 digits
                            else
                            if (input/1000 == 0)
                                treeDigits ++;  // the number has 3 digits
                            else
                                moreThreeDigits++;  // the number has more than 3 digits
                        }
                        number = scan.next();
                    }

        System.out.println("one: "+oneDigit+ "two: "+twoDigits+ "three: "+treeDigits+ "more: "+moreThreeDigits);


    }
}
