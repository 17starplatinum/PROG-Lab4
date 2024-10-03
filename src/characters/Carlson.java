package characters;
import exceptions.ArtistException;
import utilities.*;

public class Carlson extends AbstractHero implements ToddlerInterface {
    public static String name;
    public Carlson() {
        name = "Карлсон";
        joinToStory();
    }
    public Carlson(String name) {
        Carlson.name = name;
        joinToStory();
    }
    @Override
    public void joinToStory() {
        System.out.println("Карлсон '" + name + "' присоединился к рассказу.");
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
            Age = "старенькие";
        } else {
            Age = "новенькие";
        }
        Sheet sheet = new Sheet("простыни");
        return "вынул" + Age + " " + sheet.shName + ".";
    }
    public void give(Toddler toddler){
        System.out.println("и дал их " + toddler.toString());
    }
    public void scrunch(){
        System.out.println("Карлсон '" + name + "' скорчил недовольную мину.");
    }
    public String stand(boolean grumpy){
        String menacing;
        if(grumpy){
            menacing = "угрюмо";
        } else {
            menacing = "весело";
        }
        return "Карлсон '" + name + "' " + menacing + " стоял с простынями в руках.";
    }
    public String sew(boolean hasTime) {
        String will;
        if(hasTime){
            will = "нынче";
        } else {
            will = "некогда";
        }
        return "Карлсону " + will + " шить одежду";
    }
    public String know(boolean doesKnow) throws ArtistException {
        if (!doesKnow) {
            throw new ArtistException("Чё блин");
        } else {
            return "В отличие от него, Карлсон '" + name + "' отлично знал, что это за штука, так как желание артиста творить зависит от его вдохновения.";
        }
    }
    public String paint(boolean hasTime) {
        String intent;
        if(!hasTime) {
            intent = "не намерен";
        } else {
            intent = "намерен";
        }
        return ", потому что он " + intent + " срочно нарисовать картину.";
    }
    public void crammed(boolean inCorner){
        String claustrophilia;
        if(inCorner){
            claustrophilia = "забившись в угол, ";
        } else {
            claustrophilia = "в середине комнаты, ";
        }
        System.out.println("Карлсон '" + name + "', " + claustrophilia + "рисовал свою картину.");
    }
    public void explain() {
        System.out.println("Карлсон объяснил, что...");
    }
    @Override
    public void leaveFromStory() {
        System.out.println("Карлсон " + name + " ливнул с рассказа.");
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Карлсон '" + name + "'";
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Carlson){
            return name.equals(((Carlson) obj).getName());
        }
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
