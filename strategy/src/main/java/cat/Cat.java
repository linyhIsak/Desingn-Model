package cat;

public class Cat {
    int height;
    int age;
    int weight;
    public Cat(int height, int weight, int age){
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
