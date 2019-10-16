package pattern.strategy.notuse;

public abstract class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    // setter 는 없다.
    public String getName() {
        return name;
    }

    public abstract void attack();
    public abstract void move();
}
