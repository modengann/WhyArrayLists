import java.util.*;
import javadraw.*;

public class App extends Window{
    ArrayList<Oval> ovals = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        while(true){
            for(Oval currentThingy : ovals){
                currentThingy.move(20, 0);
                if(currentThingy.x() > 700 ){
                    currentThingy.x(0);
                    currentThingy.color(Color.random());
                }
            }
            screen.update();
            screen.sleep(1/30.0);
        }
    }

    public void mouseDown(Location loc, int button){
        Oval temp = new Oval(screen, loc, 75, 75);
        temp.center(loc);
        ovals.add(temp);
    }

    public void keyDown(Key k){
        if(k == Key.SPACE){
            for(Oval thingy : ovals){
                thingy.color(Color.random());
            }
        }
    }
}
