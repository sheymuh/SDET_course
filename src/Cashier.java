public class Cashier implements ICompare<Client> {
    public int ID;

    public String name;

    public int newOrderID;

    public Cashier(int id, String name, int newOrderID) {
        ID = id;
        this.name = name;
        this.newOrderID = newOrderID;
    }

    @Override
    public boolean compare(Client client) {
        if (client.orderID == newOrderID) {
            System.out.println("Вот ваш заказ. Приятного аппетита!");
            return true;
        }
        System.out.println("Это не ваш заказ. Обманывать нехорошо!");
        return false;
    }

    @Override
    public String toString() {
        return "Cashier " + ID;
    }
}
