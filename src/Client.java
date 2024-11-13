public class Client {
    public int ID;

    public String name;

    public int orderID;

    public Client(int id, String name, int orderID) {
        ID = id;
        this.name = name;
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "Clients " + ID;
    }
}
