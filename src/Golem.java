public class Golem extends Creature {

    public Golem(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println(getName() + " slams the ground and hardens its stone!");
    }
}