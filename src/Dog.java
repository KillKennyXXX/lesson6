public class Dog extends Animals {
    private int runLimit = 500 ;
    private int swimLimit = 10;
    private static int count=0;
    public Dog(String name,  String type) {
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
        int curSwim = (int) (Math.random() * swimLimit);
        if (dist > curSwim) {
            System.out.printf("%s %s проплыл %d метров из %d  %n", getType(), getName(), curSwim, dist);
        }
        else{
            System.out.printf("%s %s проплыл %d  метров %n", getType(), getName(), dist);
        }
    }

    public static int getCount() {
        return count;
    }
}
