import java.util.Scanner;
/**
 * The UserInput class implements an application that prints user prompts,
 * stores keyboard input into string variables using the Scanner class,
 * then prints those variables along with contextual strings.
 * Created on 02SEP2017
 * @author SapperDaddy(2)
 * email: btw2717@email.vccs.edu
 * @version 1.0
 */

public class UserInput
{
    /**
     *Entry point of the application, the main method.
     * Honestly I don't really know what to put here.
     * I know that (String[] args) is declaring a string array named args,
     * but I don't know what that means despite hours of trying to figure out
     * reading stuff like http://www.oracle.com/technetwork/articles/java/index-137868.html
     * and both textbooks.  All I get for an answer is "a command line argument to place strings
     * into an array."  Which means nothing to me at this point.
     * I know public means that the method can be accessed from outside the source code,
     * and that void means there will be no return(though that also means nothing to me).
     *
     * @param args This is the parameter of the main method, classified as a variable.
     *             I don't really understand what that means.
     */
    public static void main(String[] args)
    {   //Open brace beginning the block of code for the method 'main'
        /**
         *Making a new object of the Scanner class,
         *stored in the variable 'keyboard'.  Calling the constructor of the Scanner class,
         * with the parameter System.in (I also don't actually understand what that means).
         * I think this is a constructor, right after new.....but I'm not sure.
         */
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your username:");  //Print the argument string
        String userName = keyboard.next();  //Declare the string variable named userName and set its value as
        //keyboard.next() which is the created object of the Scanner class and it calls the method next???

        System.out.println();   //print an empty line for aesthetic purposes
        System.out.println("Enter your password:");
        String passWord = keyboard.next();

        System.out.println();
        System.out.println("Hello " + userName + "! Welcome to CSC200!");   //Prints the concatenated line of
        System.out.println("Your password is: " + passWord);               //strings and variables
            }



    }

