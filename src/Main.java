import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity_of_item;
        System.out.print("Enter the quantity of items: ");
        quantity_of_item = input.nextInt();
        input.nextLine();
        int total_cost = 0;
        String name_of_item;
        int input_quantity, input_price;
        for (int i = 1; i <= quantity_of_item; i++) {
            System.out.print("Enter name of item " + i + ": ");
            name_of_item = input.nextLine();
            System.out.print("Enter quantity of item " + i + ": ");
            input_quantity = input.nextInt();
            System.out.print("Enter price of item " + i + ": ");
            input_price = input.nextInt();
            int item_total = input_quantity * input_price;
            System.out.println("Name \t Quantity \t Price \t Total");
            System.out.println(name_of_item + " \t " + input_quantity + " \t " + input_price + " \t " + item_total);
            total_cost = total_cost+item_total;
            input.nextLine();
        }
        System.out.print("Do you have membership? (y/n): ");
        String user_membership_choice = input.nextLine();
        System.out.println("Total Cost: Rs." + total_cost);
        if (user_membership_choice.equals("y")) {
            float total_after_discount = total_cost - (total_cost * 0.1f);
            System.out.println("Total cost after 10% discount: Rs." + total_after_discount);
        }
        
    }
}
