import java.util.Scanner;
public class MonthlyExpenseManager {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        char dollarSign = '$';

        System.out.print("Please enter monthly income: $");
    double income = input.nextDouble();
    System.out.println("Your monthly income is $" + income);

    System.out.print("Enter your monthly rent: $");
    double rent = input.nextDouble();

    System.out.print("Enter your monthly groceries: $");
    double groceries = input.nextDouble();

    System.out.print("Enter your monthly transportation: $");
    double trans = input.nextDouble();

    System.out.print("Enter your monthly phone bill: $");
    double phoneBill = input.nextDouble();

    byte numberOfExpenses = 4;
    short weeksPerMonth = 4;
    int monthsPerYear = 12;

    double totalExpenses = rent + groceries + trans+ phoneBill;
    double moneyLeft = income - totalExpenses;
    boolean withinBudget = moneyLeft >= 0;
            float weeklyGroceries = (float) groceries / weeksPerMonth;
    float monthlyGroceries = (float) groceries / monthsPerYear;
    long annualIncomeWholeDollars = (long) (income * monthsPerYear);


    System.out.println("\nMonthly Expense Summary for " + name + ":");
        System.out.println("\tMonthly income: " + dollarSign + income);
        System.out.println("\tTotal expenses: " + dollarSign + totalExpenses);
        System.out.println("\tMoney left: " + dollarSign + moneyLeft);
        System.out.println("\tNumber of expenses: " + numberOfExpenses);
        System.out.println("\tWithin budget: " + withinBudget);
        System.out.println("\tEstimated weekly groceries: " + dollarSign + weeklyGroceries);
        System.out.println("\tAnnual income (whole dollars): "
                + dollarSign + annualIncomeWholeDollars);




    }
}
