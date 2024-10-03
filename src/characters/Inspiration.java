package characters;

import utilities.*;
public class Inspiration extends AbstractHero{
    private String name;
    public Inspiration() {
        name = "Вдохновение";
        joinToStory();
    }
    public Inspiration(String name) {
        this.name = name;
        joinToStory();
    }
    @Override
    public void joinToStory() {
        System.out.println("Вдохновение '" + name + "' присоединилось к рассказу.");
    }

    @Override
    public void leaveFromStory() {
        System.out.println("Вдохновение "+ name + "ливнул с рассказа.");
    }

    public String captivate() {
        String artist = "";
        String wantedAction = "";
        ArtistTypes ArtistType = ArtistTypes.PAINTER;
        switch (ArtistType) {
            case PAINTER:
                artist = "художников";
                wantedAction = "рисовать, рисовать и рисовать";
                break;
            case SCULPTOR:
                artist = "скульпторов";
                wantedAction = "скульптить, скульптить и скульптить";
                break;
            case CARVER:
                artist = "резчиков";
                wantedAction = "резать, резать и резать";
                break;
            case MUSICIAN:
                artist = "музыкантов";
                wantedAction = "исполнять, исполнять и исполнять";
                break;
            case CINEMATOGRAPHER:
                artist = "кинематографов";
                wantedAction = "снимать, снимать и снимать";
                break;
        }
        return "вдохновение '" + name + "' охватывает всех " + artist + ", и тогда им хочется " + wantedAction + ".";
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
        return "Вдохновение '" + name + "'";
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Inspiration){
            return name.equals(((Inspiration) obj).getName());
        }
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
