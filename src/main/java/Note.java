public class Note {

    private float note;
    private String name;

    public Note(Integer note) {
        this.note = note;
    }

    public Note(String name, float note) {

    }

    public Note(float note, String name) {
        this.note = note;
        this.name = name;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
