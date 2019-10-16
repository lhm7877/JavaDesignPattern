package pattern.strategy.notuse;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Atom atom = new Atom("Atom");

        System.out.println("내 이름은 " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("내 이름은 " + atom.getName());
        atom.move();
        atom.attack();
    }
}
