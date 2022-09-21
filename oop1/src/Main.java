public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("iamge1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitInStock(2);
        product2.setImageUrl("iamge2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitInStock(4);
        product3.setImageUrl("iamge3.jpg");

        Product[] products = { product1, product2, product3 };

        System.out.println("<ul>");
        for (var product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");
    }
}
