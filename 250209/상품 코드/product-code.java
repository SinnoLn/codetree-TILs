import java.util.*;

class Product{
    String name;
    String code;

    public Product(){
        this.name = "codetree";
        this.code = "50";
    }
    public Product(String name, String code){
        this.name = name;
        this.code = code;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("product " + product.code +" is " + product.name);

        product.name = sc.next();
        product.code = sc.next();
        System.out.println("product " + product.code +" is " + product.name);
        sc.close();
    }
}