public class Cat extends Animals {
    private int runLimit = 200 ;
    private static int count=0;

    public Cat(String name,  String type) {
        super(name,  type);
        count++;
    }

    @Override
    public void run(int dist) {
        int curRun = (int) (Math.random() * runLimit);
        if (dist > curRun) {
            System.out.printf("%s %s пробежал %d метров из %d  %n", getType(), getName(), curRun, dist);
        }
        else{
            System.out.printf("%s %s пробежал %d метров %n", getType(), getName(), dist);
        }
    }

    @Override
    public void swim(int dist) {
        System.out.printf("%s  %s убежал от водоема.%n",getType(), getName());
    }

    public static int getCount() {
        return count;
    }
}

