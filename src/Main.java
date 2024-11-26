public class Main {
    public static void main(String[] args) {
        Database<Cashier> cashiersDatabaseDatabase = new Database<Cashier>();
        Database<Client> clientsDatabase = new Database<Client>();

        cashiersDatabaseDatabase.add(new Cashier(1, "Андрей", 432));
        cashiersDatabaseDatabase.add(new Cashier(2, "Катя", 735));
        cashiersDatabaseDatabase.add(new Cashier(3, "Александр", 29));

        clientsDatabase.add(new Client(1, "Полина", 432));
        clientsDatabase.add(new Client(2, "Ваня", 321));
        clientsDatabase.add(new Client(3, "Дима", 29));

        Cashier cashier = cashiersDatabaseDatabase.database.getFirst();
        Client client = clientsDatabase.database.get(1);
        cashier.compare(client);

        cashiersDatabaseDatabase.printDatabase();
        clientsDatabase.printDatabase();


        IIntToBool isDividedBy13 = x -> x % 13 == 0;
        System.out.println(isDividedBy13.convert(3));
        System.out.println(isDividedBy13.convert(13));

        IFractionalNumbers discriminantCalculation = (a, b, c) -> Math.pow(b, 2) - 4 * a * c;
        System.out.println(discriminantCalculation.calculate(2.5, -4.3, -7.25));
    }
}
