import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the player's name: ");
String name = input.next();
System.out.print("Enter the player's age: ");
byte age = input.nextByte();
System.out.print("Enter the player's height in metres: ");
float height = input.nextFloat();
System.out.print("Enter the player's weight in pounds: ");
float weight = input.nextFloat();
System.out.print("Enter the player's jersey number: ");
byte jersey = input.nextByte();

float POUND = 0.45359237f;
byte METRE = 100;
int centiHeight = (int) (METRE * height);
int kiloWeight = (int) (POUND * weight);

String eligibility;
if (age >= 18 && age <= 35){
    eligibility = "Eligible";
}
else {
    eligibility = "Ineligible";
    }

String category = "";
if (age < 20){
    category = "Rising star";
}
else if (age < 30) {
    category = "Prime Player";
}
else if (age > 30) {
    category = "Veteran";
}

String position;
switch (jersey){
    case 1: position = "Goalkeeper"; break;
    case 2:
    case 5:
        position = "Defender"; break;
    case 6:
    case 8:
        position = "Midfielder"; break;
    case 7:
    case 11:
        position = "Winger"; break;
    case 9: position = "Striker"; break;
    case 10: position = "Playmaker"; break;
    default: position = "Player position not known."; break;
}
String decision = "";
if (category.equals("Prime player")){
    if (weight < 80){
        decision = "Starting lineup";
    }
}
else{
    decision = "Bench";;
}

String finalDecision = (eligibility.equals("Eligible"))?"Play":"Rest";;

System.out.println("Player: (" + name + ")");
System.out.println("Age: (" + age + ") (" + category + ")" );
System.out.println("Height: (" + centiHeight + ")");
System.out.println("Weight: (" + kiloWeight + ")");
System.out.println("Jersey: (" + jersey + ")");
System.out.println("Player: (" + name + ")");
System.out.println("Position: (" + position + ")");
System.out.println("Eligibility: (" + eligibility + ")");
System.out.println("Lineup Decision: (" + decision + ")");
System.out.println("Final Decision: (" + finalDecision + ")");

    }}

