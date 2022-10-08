package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {

    @Test
    public void testPersistenceWith999(){
        assertEquals(4,Persist.persistence(999));
    }

    @Test
    public void testPersistenceWith39(){
        assertEquals(3,Persist.persistence(39));
    }

    @Test
    public void testPersistenceWith9(){
        assertEquals(0,Persist.persistence(9));
    }
}