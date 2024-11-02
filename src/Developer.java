public class Developer extends Worker implements ILevelUp {
    /** Junior, Middle, Senior, Lead */
    private String level;

    /** Название компании */
    private String companyName;

    static String PCType = "Laptop";

    public Developer(String name, String level, String companyName) {
        super(name);
        this.level = level;
        this.companyName = companyName;
    }

    @Override
    public void work() {
        switch (level) {
            case "Junior":
                money += 100000;
                System.out.printf("За месяц программист %s заработал 100000 рублей. " +
                        "На его счету уже %d рублей\n", name, money);
                break;
            case "Middle":
                money += 200000;
                System.out.printf("За месяц программист %s заработал 200000 рублей. " +
                        "На его счету уже %d рублей\n", name, money);
                break;
            case "Senior":
                money += 270000;
                System.out.printf("За месяц программист %s заработал 270000 рублей. " +
                        "На его счету уже %d рублей\n", name, money);
                break;
            case "Lead":
                money += 350000;
                System.out.printf("За месяц программист %s заработал 350000 рублей. " +
                        "На его счету уже %d рублей\n", name, money);
                break;
            default:
                System.out.println("Без опыта не берем!");
                break;
        }
    }

    @Override
    public void levelUp() {
        switch (level) {
            case "Junior":
                level = "Middle";
                System.out.printf("\nУра! %s теперь \"Middle\"\n\n", name);
                break;
            case "Middle":
                level = "Senior";
                System.out.printf("\nУра! %s теперь \"Senior\"\n\n", name);
                break;
            case "Senior":
                level = "Lead";
                System.out.printf("\nУра! %s теперь \"Lead\"!\n\n", name);
                break;
        }
    }

    public String getLevel() {
        return level;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    static void printDeveloperDescription() {
        System.out.println("\nПрограммист — это специалист по созданию и доработке " +
                "программных продуктов для компьютеров и других\nустройств, " +
                "архитектуры различных интернет-ресурсов, компонентов и методов анализа и моделирования.\n");
    }
}
