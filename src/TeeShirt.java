public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    // Set methods
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setSize(String size) {
        this.size = size;
        setPrice(size);
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Get methods
    public int getOrderNumber() {
        return orderNumber;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(String size) {
        if ("XXL".equals(size) || "XXXL".equals(size)) {
            this.price = 22.99;
        } else {
            this.price = 19.99;
        }
    }
}