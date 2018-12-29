public class Stadium {
    private int capacity;
    private String name;

    public Stadium(String name,int capacity) {
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

}
