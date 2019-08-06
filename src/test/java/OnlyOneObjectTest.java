import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnlyOneObjectTest {

    @Test
    public void createOneKingObject() {
        OnlyOneObject firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        Assert.assertTrue(firstKing != null);
    }

    @Test
    public void createTwoKingObject() {
        OnlyOneObject firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        OnlyOneObject secondKing = OnlyOneObject.createKingObject("Name_2", "LastName_2");
        Assert.assertTrue(secondKing == null);
    }
    

}