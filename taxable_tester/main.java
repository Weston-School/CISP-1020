//  Weston Hale
//  A00267225
//  Feb 28th, 2024
//  Taxable Tester Program

class EdibleProgram {
    public static void main(String[] args){

        Taxable[] objects = new Taxable[4];

        objects[0] = new Item("item_1", 5.0);
        objects[1] = new Item("item_2", 40.0);
        objects[2] = new Item("house_1", 260000.0);
        objects[3] = new Item("house_2", 400000.0);
        
        System.out.printf("Total Tax: $%.2f\n", Data.totalTax(objects));
    }

}