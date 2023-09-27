import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Databasetest {

    Database db;

    @BeforeEach
    void setDb(){
        db = new Database();
    db.tilFøjSuperhelt("Peter", "spiderman", 1962, true, 10, "edderkoppespind");
    db.tilFøjSuperhelt("Tony", "ironman", 1963, false, 10, "rigedom");
    }


    @Test
    void addsuperhelt(){
        assertEquals(db.getSuperheltArrayList().size()  , 2);

        db.tilFøjSuperhelt("Tony", "ironman", 1963, false, 10, "rigedom");
        assertEquals(db.getSuperheltArrayList().size()  , 3);

    }

    @Test
    void tilføjesuperhelt(){
        assertEquals(db.getSuperheltArrayList().size()  , 2);

        db.tilFøjSuperhelt("Tony", "ironman", 1963, false, 10, "rigedom");
        db.tilFøjSuperhelt("Tony", "ironman", 1963, false, 10, "rigedom");
        assertEquals(db.getSuperheltArrayList().size()  , 4);


    }


}
