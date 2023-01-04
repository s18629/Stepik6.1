import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NotesServiceImplTest {
    NotesStorageMock mockStorage = new NotesStorageMock();
    Note firstNote = new Note("John", 2.0f);
    Note secondNote = new Note("Tra", 3.5f);
    Note thirdNote = new Note("Volta", 4.5f);


    @Test
    public void classInstanceTest(){
        assertEquals(mockStorage.getClass(), NotesStorageMock.class);
    }

    @Test
    public void addTest(){
        mockStorage.add(firstNote);
        boolean existInList = mockStorage.list.contains(firstNote);
        assertTrue(existInList);
    }

    @Test
    public void clearTest(){
        mockStorage.add(firstNote);
        mockStorage.add(secondNote);
        mockStorage.add(thirdNote);
        mockStorage.clear();
        boolean listIsEmpty = mockStorage.list.isEmpty();
        assertTrue(listIsEmpty);
    }
}


