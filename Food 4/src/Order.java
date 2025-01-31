public class Order {
    private int orderId;
    private String foodName;
    private String status;

    public Order(int orderId, String foodName, String status) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Order ID: %d, Food: %s, Status: %s", orderId, foodName, status);
    }
}