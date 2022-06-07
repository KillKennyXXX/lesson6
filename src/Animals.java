public abstract class Animals {
 private String name ;
 private String type;
 private static int count=0;

    public Animals(String name, String type) {
        this.name = name;
        this.type = type;
        count++;
    }
    public abstract void run(int dist);
    public abstract void swim(int  dist);

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static int getCount() {
        return count;
    }
}

