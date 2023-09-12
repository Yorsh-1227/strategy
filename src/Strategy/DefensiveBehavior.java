package Strategy;

public class DefensiveBehavior implements RobotBehavior {

     @Override
    public int moveCommand() {
        return -1;
    }

    @Override
    public String toString() {
        return "Defensiive Behaviour:" + "if find another robot run from it";
    }


}
