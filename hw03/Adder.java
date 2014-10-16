/*******************************************************
Daniel Wilson
CS180 
Homework 03, Adder Program
Program will scan for input and add two integers
*******************************************************/
import java.util.Scanner;

public class Adder{
 public static void main(String[] args){
  // adder program 
  Scanner s = new Scanner(System.in);
  // tell users how to input data
  System.out.println("Please enter two integers formatted as such: \"a b\"");
  // scann for input integers
  int num1 = s.nextInt();
  int num2 = s.nextInt();
  // do addition
  int total = num1 + num2;
  // return total
  System.out.println("Total: " + total);
 }
}