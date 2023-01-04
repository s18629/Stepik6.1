import java.util.*;

public interface NotesStorage {
    void add(Note note);
    List<Note> getAllNotesOf(String name);
    void clear();
}
