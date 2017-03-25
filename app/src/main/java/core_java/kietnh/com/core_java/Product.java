package core_java.kietnh.com.core_java;

/**
 * Created by kietnh on 3/25/17.
 */

public class Product {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    private String productName;

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }
}
