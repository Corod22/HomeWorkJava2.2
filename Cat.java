public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }
    
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.setFood(plate.getFood() - appetite);
            isHungry = false;
            System.out.println(name + " поел!");
        } else {
            System.out.println(name + " не может поесть, в тарелке недостаточно еды!");
        }
    }
    
    public boolean isHungry() {
        return isHungry;
    }
}