package ExercicioPOO;

public class Main {

    public static void main(String[] args) {

        Invoice inv = new Invoice(1, "Mousepad", -10, 50.0f);
        System.out.println("valor Total = " + inv.getInvoiceAmount());
    }

}
