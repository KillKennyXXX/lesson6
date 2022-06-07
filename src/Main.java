public class Main {

    public static void main(String[] args) {
	Dog Barbos = new Dog("Барбос", "Пес");
    Cat Barsik = new Cat("Барсик", "Кот");
        Barbos.run(700);
        Barbos.swim(50);
        Barsik.swim(50);
        Barsik.run(800);
        System.out.printf("Всего котов %d, собак  %d , животных %d  %n",Cat.getCount(),    Dog.getCount(),     Animals.getCount());
    }
}
