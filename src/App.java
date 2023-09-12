import Strategy.AgressiveBehavior;
import Strategy.DefensiveBehavior;
import Strategy.NormalBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot roboto = new Robot();
        roboto.setName("Mr Bender");
        roboto.setBehavior(new DefensiveBehavior());
        System.out.println(roboto.getName());
        roboto.move();

        Robot wally = new Robot();
        wally.setName("Mr Wally");
        wally.setBehavior(new AgressiveBehavior());
        System.out.println(wally.getName());
        wally.move();

        Robot sonny = new Robot();
        sonny.setName("Mr Sonny");
        sonny.setBehavior(new NormalBehavior());
        System.out.println(sonny.getName());
        sonny.move();
        
    }
       
    
}
