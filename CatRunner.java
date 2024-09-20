public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Glorpertson", 8, 13.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Jlorpertson", 11, 14.8);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
