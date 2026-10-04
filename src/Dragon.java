public class Dragon extends Creature {

    public Dragon(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println(getName() + " breathes fire and lets out a loud roar!");
    }

    // This does not work because verifyContainment() is final.
    /*
    @Override
    public void verifyContainment() {
        System.out.println("Dragon containment verified.");
    }
    */
}