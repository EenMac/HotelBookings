import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void Guest(){
        guest = new Guest("Jeff");
    }

    @Test
    public void guestHasName() {
        assertEquals("Jeff", guest.getName());
    }
}
