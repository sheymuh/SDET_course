import java.util.Random;

public class Courier extends Worker implements ILevelUp, IInviteFriend {
    private boolean haveBike; // Наличие велосипеда
    private int orderCount; // Количество доставленных заказов
    static String uniformColour = "Pink"; // Цвет формы

    public Courier(String name, boolean haveBike) {
        super(name);
        this.haveBike = haveBike;
        orderCount = 0;
    }

    @Override
    public void work() {
        Random random = new Random();
        int orders = random.nextInt(15, 30);
        if (haveBike) {
            for (int i = 0; i < orders; i++) {
                money += 40;
            }
        }
        else {
            for (int i = 0; i < orders; i++) {
                money += 30;
            }
        }
        money += 1500;
        orderCount += orders;

        System.out.printf("%s доставил %d заказов. На его счету %d рублей\n", name, orders, money);
    }

    @Override
    public void levelUp() {
        if (!haveBike) {
            haveBike = true;
            System.out.printf("\nУра! %s теперь ездит на велике!\n\n", name);
        }
    }

    @Override
    public void inviteFriend() { // Если новый курьер доставит больше 150 заказов за неделю - бонус 3000р
        Courier newCourier = new Courier("Новый курьер", false);
        for (int i = 0; i < 5; i++) {
            newCourier.work();
        }
        if (newCourier.orderCount >= 100) {
            money += 3000;
            System.out.println("\nВаш друг доставил больше 100 заказов за неделю! Вам бонус 3000 рублей\n");
        }
        else System.out.println("\nВаш друг доставил меньше 100 заказов за неделю( Бонуса не будет\n");
    }

    public boolean isHaveBike() {
        return haveBike;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public static String getUniformColour() {
        return uniformColour;
    }
}