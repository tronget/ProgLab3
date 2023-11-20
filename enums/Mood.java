package enums;

public enum Mood {
    DEFAULT("обычное"),
    HAPPY("счастливый"),
    SAD("грустный"),
    ANGRY("злой"),
    FUNNY("веселый"),
    ASHAMED("пристыженный");
    private final String mood;

    Mood(String mood) {
        this.mood = mood;
    }

    public String getInfoAboutMood() {
        return mood;
    }
}
