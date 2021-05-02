package Model.Enum;

public enum CreatureType {
    PLAYER("Player"), BAT("Bat"), GHOST("Ghost"), GHOUL("Ghoul");

    CreatureType(String displayName) {
        this.displayName = displayName;
    }

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

}
