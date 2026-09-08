import java.util.Scanner;
public class SalesBarChart
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int stores;
        
        int j = 0;
        System.out.print("Enter the number of stores: ");
        stores=keyboard.nextInt();
        int[] sales = new int[stores];
        while (j < stores) 
        {
            System.out.print("Enter today's sale for store " + (j + 1) + ": ");
            sales[j] = keyboard.nextInt();
            j++;
        }
        
        System.out.println("\nSALES BAR CHART:");
        System.out.println("Each * = $100");
        
        for (int i = 0; i < stores; i++) 
        {
            System.out.print("Store " + (i + 1) + ": ");
            int asterisks = sales[i]/100;
            for (int k = 0; k < asterisks; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}