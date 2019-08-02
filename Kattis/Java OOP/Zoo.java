public class Zoo{
    public static void main(String[] args){

        Bird bird1 = new Bird(12, "F", 22);

        Chicken chicken1 = new Chicken(3, "F", 15);
        chicken1.eat();

        Animal sparrow1 = new Sparrow(1, "M", 4);
        sparrow1.move();

        Animal fish1 = new Fish(2, "F", 3);
        fish1.move();

        moveAnimals(fish1);
        moveAnimals(sparrow1);
    }

    public static void moveAnimals(Animal animal){
        animal.move();
    }
}