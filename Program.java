public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 15);
        Cat cat2 = new Cat("Мурзик", 10);
        Plate plate = new Plate(20);
        
        Cat[] cats = {cat1, cat2};
        
        plate.info();
        
        for (Cat cat : cats) {
            if (cat.isHungry()) {
                cat.eat(plate);
            }
        }
        
        plate.info();
    }
}