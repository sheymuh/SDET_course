import java.util.ArrayList;

public class Database<T> {
    public ArrayList<T> database;

    public Database() {
        database = new ArrayList<>();
    }

    public void add(T obj) {
        database.add(obj);
        System.out.println("В базу данных добавлен объект " + obj.toString());
    }

    public T remove(int index) {
        database.remove(index);
        System.out.println("Из базы данных удален объект " + database.get(index));
        return database.get(index);
    }

    public void printDatabase() {
        String str = "";
        for (int i = 0; i < database.size(); i++) {
            str += i + 1 + ". " + database.get(i).toString() + "\n";
        }
        System.out.println(str);
    }

}
