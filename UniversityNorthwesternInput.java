import java.text.DecimalFormat;
import java.util.Scanner;

public class UniversityNorthwestern {

    private static DecimalFormat df2 = new DecimalFormat(".00");

    public static void main(String[] args) {

        cost fallTution = new cost();

        Scanner reader = new Scanner(System.in);

        System.out.println(" - Fall Semester Bill Calculator -");

        System.out.println("Enter credit hours: $");
        fallTution.creditHours = reader.nextInt();

        System.out.println("Enter credit price: $");
        fallTution.creditPrice = reader.nextDouble();

        System.out.println("Enter housing cost: $");
        fallTution.housingCost = reader.nextDouble();

        System.out.println("Enter meal plan amount: $");
        fallTution.mealPlanAmount = reader.nextDouble();

        reader.close();

        fallTution.amount1 = (float) (fallTution.creditHours * fallTution.creditPrice);
        fallTution.amount2 = (float) (fallTution.housingCost + fallTution.mealPlanAmount);
        fallTution.amount = fallTution.amount1 + fallTution.amount2;

        System.out.println("Your total bill for the Fall Semester is : $" + df2.format(fallTution.amount));
    }
}

class cost{
    int creditHours;
    double creditPrice;
    double housingCost;
    double mealPlanAmount;
    float amount1;
    float amount2;
    float amount;
}