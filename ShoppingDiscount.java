package shoppingdiscount;

public class ShoppingDiscount {
    public static void main(String[] args) {
        
        double bookCost = 150.00;
        double penCost = 10.00;
        double notebookCost = 25.00;
        
        
        double totalBook = bookCost * 2;
        System.out.println("totalBook: " + totalBook);
        double totalPen = penCost * 5;
        System.out.println("totalPen: " + totalPen);
        double totalNotebook = notebookCost * 3;
        System.out.println("totalNotebook: " + totalNotebook);
        
        double totalBill = totalBook + totalPen + totalNotebook;
        System.out.println("totalBill: " + totalBill);
        
        if (totalBill >= 350) {
            double Discount = totalBill * 0.15;
            System.out.println("The customer will recieve a discount of " + Discount);
            System.out.println("Total bill: " + (totalBill - Discount));
            
        }else {
            System.out.println("Total bill: " + totalBill);
        }
    }
    
}
