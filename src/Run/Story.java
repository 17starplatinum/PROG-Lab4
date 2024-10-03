package Run;

import characters.*;
import exceptions.*;

public class Story {
    public static void main(String[] args){
        Toddler Malysh = new Toddler();
        System.out.println(Malysh.jump("стул") + Malysh.sprint("шкаф") + Malysh.openDoor("шкафа"));
        System.out.println(Malysh.pullOut(false));
        Carlson Carlsen = new Carlson();
        Carlsen.scrunch();
        System.out.println(Malysh.give());
        System.out.println(Carlsen.stand(false));
        Carlsen.give(Malysh);
        System.out.println(Malysh.sew(true));
        Toddler.Knowledge knowledge = Malysh.new Knowledge("знание");
        System.out.println(knowledge.isTaught(true) + " " + knowledge.magicSew(false));
        System.out.println(knowledge.figOut() + " " + Toddler.askForHelp(true, true));
        System.out.println(Carlsen.sew(false) + Carlsen.paint(true));
        try {
            System.out.println(Malysh.know(false));
        } catch (ToddlerException te){
            System.out.println("Вы чё упоротый? Как Малыш слышал, тем более знает про это слово?");
        }
        try {
            System.out.println(Carlsen.know(true));
        } catch (ArtistException ae){
            System.out.println("Артист не знает про вдохновения? Не смешите.");
        }
        Inspiration inspiration = new Inspiration();
        Carlsen.explain();
        System.out.println(inspiration.captivate());
        Toddler.ParallelActions parallelActions = new Toddler.ParallelActions("действия");
        System.out.print(parallelActions.sit(true));
        parallelActions.continueSew(true);
        Carlsen.crammed(true);
    }
}
