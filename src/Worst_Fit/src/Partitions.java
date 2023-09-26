public class Partitions {
    String name;
    int size;
    String occupation;
    boolean status;

    public Partitions(String name, int size) {
        this.name = name;
        this.size = size;
        this.occupation = "External fragment";
        this.status = false;
    }

}
