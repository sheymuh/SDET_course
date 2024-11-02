public abstract class Worker {
    protected String name;
    protected int money;

    public Worker(String name){
        this.name = name;
        money = 0;
    }

    abstract public void work();
}
