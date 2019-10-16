package pattern.strategy.notuse;

public class TaekwonV extends Robot {
    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("taekwon attack!");
    }

    @Override
    public void move() {
        System.out.println("taekwon move");
    }
}
