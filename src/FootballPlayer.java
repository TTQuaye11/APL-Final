
import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the player's name: ");
String name = input.next();
System.out.print("Enter the player's age: ");
byte age = input.nextByte();
System.out.print("Enter the player's height in metres: ");
float height = input.nextFloat();
System.out.print("Enter the player's weight in kilograms: ");
float weight = input.nextFloat();
System.out.print("Enter the player's jersey number: ");
byte number = input.nextByte();

System.out.println("Player name - " + name);
System.out.println("Age - "+ age);
System.out.println("Height - " + height + "cm");
System.out.println("Weight - " + weight + "lbs");
System.out.println("Number - " + number);

System.out.println(" ");

float POUND = 0.45359237f;
byte METRE = 100;
int centiHeight = (int) (METRE * height);
int kiloWeight = (int) (POUND * weight);
System.out.println("Player name - " + name);
System.out.println("Age - "+ age);
System.out.println("Height - " + centiHeight + "cm");
System.out.println("Weight - " + kiloWeight + "kg");
System.out.println("Number - " + number);

System.out.println(" ");

System.out.println("Current age is " + age);
age++;
number--;
System.out.print("A season has passed, "+ name + "'s age has increased by one and his jersey number has reduced by one." );
System.out.println("New age: " + age);
System.out.println("New number: " + number);

System.out.println(" ");

if (age >= 18 && age <= 35){
    System.out.println("Eligible");
    }
else {
    System.out.println("Ineligible");
}

System.out.println(" ");

if (age < 18 || weight >= 90){
    System.out.println("Player has a problem (either too young or too heavy)");
}

System.out.println(" ");

if (age != 18 && age != 35){
    System.out.println("Not eligible");
}


}}
