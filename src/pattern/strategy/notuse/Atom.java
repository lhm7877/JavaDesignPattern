package pattern.strategy.notuse;

public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("atom attack!");
    }

    @Override
    public void move() {
        System.out.println("atom move");
    }
}
