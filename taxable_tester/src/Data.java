//  Weston Hale
//  A00267225
//  Feb 28th, 2024
//  Taxable Tester Program

public class Data {

    /**
     * Totals up the tax of all elements
     * @param elements an array of Taxable objects
     * @return the total tax of all elements. Not the total price
     */
    public static double totalTax(Taxable[] elements) {
        double total = 0;
        double percent = 0.09;

        for (Taxable obj : elements) {
            total = total + obj.getTaxable();
        }
        return total * percent;
    }
}
