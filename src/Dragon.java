public class Dragon extends Creature {

    public Dragon(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println(getName() + " breathes fire and lets out a loud roar!");
    }
}