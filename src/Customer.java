public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String orderHistory;

    public Customer(int id, String name, String email, String phone, String address, String orderHistory) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.orderHistory = orderHistory;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getOrderHistory() { return orderHistory; }
}
