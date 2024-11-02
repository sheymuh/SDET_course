public class Main {
    public static void main(String[] args) {
        Courier courier = new Courier("Петя", false);
        Developer developer = new Developer("Ваня", "Middle", "SimbirSoft");

        courier.work();
        courier.work();
        courier.levelUp();
        courier.work();

        Developer.printDeveloperDescription();
        developer.work();
        developer.levelUp();
        developer.work();


        courier.inviteFriend();
        courier.inviteFriend();
        courier.inviteFriend();

    }
}
