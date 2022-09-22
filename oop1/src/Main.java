public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitInStock(2);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitInStock(4);
        product3.setImageUrl("image3.jpg");

        Product[] products = { product1, product2, product3 };

        System.out.println("<ul>");
        for (var product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("05222222222");
        individualCustomer.setFirstName("engin");
        individualCustomer.setFirstName("demiroğ");

        CorparateCustomer corparateCustomer = new CorparateCustomer();
        corparateCustomer.setId(2);
        corparateCustomer.setCompanyName("Kodlama.io");
        corparateCustomer.setPhone("0533333333");
        corparateCustomer.setTaxNumber("111111");
        corparateCustomer.setCustomerNumber("54321");

        Customer[] customers = { individualCustomer, corparateCustomer };

        System.out.println("<ul>");
        for (var customer : customers) {
            System.out.println("<li>" + customer.getCustomerNumber() + "</li>");
        }
        System.out.println("</ul>");
    }
}
