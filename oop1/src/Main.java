public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product();
        product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitInStock = 3;
        product1.imageUrl = "bilmemne.jpg";

        System.out.println(product1.name);
    }
}
