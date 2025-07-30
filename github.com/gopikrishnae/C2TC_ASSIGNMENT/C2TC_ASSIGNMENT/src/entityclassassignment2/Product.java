
package entityclassassignment2;

public class Product {
	public int productId;
    public String productName;
    public double price;

    public Product(int ProductId, String productName, double price) {
        int i = extracted();
        this.productName = productName;
        this.price = price;
    }

	private int extracted() {
		return this.productId = productId;
	}

    public void display() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: ₹" + price);
    }
}