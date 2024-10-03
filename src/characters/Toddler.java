package characters;

import exceptions.ToddlerException;
import utilities.*;
public class Toddler extends AbstractHero implements ToddlerInterface {
    private static String name;
    public Toddler(){
        name = "Малыш";
        joinToStory();
    }
    public Toddler(String name){
        Toddler.name = name;
        joinToStory();
    }
    @Override
    public void joinToStory(){
        System.out.println("Малыш '" + name + "' присоединился к рассказу.");
    }
    @Override
    public void leaveFromStory() {
        System.out.println("Малыш" + name + "ливнул с рассказа.");
    }
    public String jump(String cName) {
        class Stool{
            private final String cName;
            public Stool(String cName) {
                this.cName = cName;
            }
        }
        Stool stool = new Stool(cName);
        return "Но он (" + name + ") подскочил со стула '" + stool.cName + "', ";
    }
    public String sprint(String wName){
        String Type = "";
        WardrobeType wardrobeType = WardrobeType.LINEN;
        switch (wardrobeType){
            case GENERAL:
                Type = " ";
                break;
            case LINEN:
                Type = "бельевому";
                break;
            case UNDERWEAR:
                Type = "нижнебельевому";
        }
        class Wardrobe{
            private final String wName;
            public Wardrobe(String wName){
                this.wName = wName;
            }
        }
        Wardrobe wardrobe = new Wardrobe("шкаф");
        return "подбежал к " + Type + " шкафу '" + wardrobe.wName + "', ";
    }
    public String openDoor(String dName){
        return "и распахнул дверцы '" + dName + "'.";
    }
    @Override
    public String pullOut(boolean isOld){
        class Sheet {
            private final String shName;
            public Sheet(String shName) {
                this.shName = shName;
            }
        }
        String Age;
        if(isOld){
            Age = "стареньких";
        } else {
            Age = "новеньких";
        }
        Sheet sheet = new Sheet("простыней");
        return "И вытащил одну из " + Age + " " + sheet.shName + ".";
    }
    public String give(){
        return "Малыш '" + name + "' вынул два стареньких простыней и дал их Карлсону '" + Carlson.name + "'.";
    }
    @Override
    public String know(boolean doesKnow) throws ToddlerException {
        if (doesKnow){
            throw new ToddlerException("*?");
        } else {
            return "Малыш '" + name + "' не знал, что это за штука такая -- вдохновение.";
        }
    }
    @Override
    public String sew(boolean hasTime){
        Runnable costume = () -> System.out.print("Около часа шил костюму для привидения ");
        costume.run();
        return "Малыш '" + name + "'.";
    }
    public class Knowledge implements ObjectInterface{
        public String name;
        public Knowledge(String name){
            this.name = name;
        }
        @Override
        public void joinToStory(){
            System.out.println("Знание " + name + " присоединился к рассказу.");
        }
        @Override
        public void leaveFromStory(){
            System.out.println("Знание " + name + " ливнул с рассказа.");
        }
        public String isTaught(boolean isTaught){
            if (isTaught){
                return "В школе на уроках трудам он научился шить разными стежками.";
            } else {
                return "В школе ему никто не научил шить разными стежками.";
            }
        }
        public String magicSew(boolean isTaught){
            if (isTaught){
                return "Плюс к этому, он (" + Toddler.name + ") маг -- умел сшить костюму из двух простыней.";
            } else {
                return "Но никто ему (" + Toddler.name + "у) не учил, как из двух стареньких простыней сшить костюму.";
            }
        }
        public String figOut(){
            return "Ему (" + Toddler.name + "у) пришлось придумать это самому.";
        }
    }
    public static String askForHelp(boolean helpless, boolean will){
        if(helpless && will){
            return "Он '" + name + "' попытался обратиться за помощью к Карлсону '" + Carlson.name + "'.";
        } else {
            return "Ему (" + name + ") не надо было обратиться к Карлсону" + Carlson.name + "за помощью.";
        }
    }
    public static class ParallelActions{
        public String name;
        public ParallelActions(String name){
            this.name = name;
        }
        public boolean isDenied = true;
        public String sit(boolean posture){
            class CraftingTable{
                public String tName;
                public CraftingTable(String tName){
                    this.tName = tName;
                }
            }
            CraftingTable craftingTable = new CraftingTable("верстак");
            if(isDenied || !posture){
                return "И Малышу '" + Toddler.name + "' ничего не оставалось, как сесть на верстак '" + craftingTable.tName + "'," + " согнув спину и поджав руки, ";
            } else {
                return "А Малышу '" + Toddler.name + "' делать стало много, прежде чем сесть на верстак '" + craftingTable.tName + "'," + " не согнув спину и поджав руки, ";
            }
        }
        public void continueSew(boolean isDenied){
            if(isDenied){
                System.out.println("продолжал шить.");
            } else {
                System.out.println("перестал шить.");
            }
        }
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Малышу '" + name + "'";
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Toddler){
            return name.equals(((Toddler) obj).getName());
        }
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
