import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnlyOneObjectTest{

    OnlyOneObject firstKing;
    OnlyOneObject secondKing;

    @After
    public void deleteTestObject(){
        OnlyOneObject.resetObject(firstKing);
        if (secondKing != null){
            OnlyOneObject.resetObject(secondKing);
        }
    }
    @Test
    public void createOneKingObject() {
        firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        Assert.assertTrue(firstKing != null);
    }


    @Test
    public void createTwoKingObject() {
        firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        secondKing = OnlyOneObject.createKingObject("Name_2", "LastName_2");
        Assert.assertTrue(secondKing == null && firstKing !=null);
    }


    @Test
    public void checkForGetKingName() {
        firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        Assert.assertEquals(" King's Name : ", "Name", firstKing.getName());
    }

    @Test
    public void checkForGetKingLastname() {
        firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        Assert.assertEquals(" King's LastName : ", "LastName", firstKing.getLastName());
    }

    @Test
    public void checkSetKingName()
    {
        firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        firstKing.setName("Name2");
        Assert.assertEquals(" King's LastName : ", "Name2", firstKing.getName());
    }

    @Test
    public void checkSetKingLastName()
    {
        firstKing = OnlyOneObject.createKingObject("Name", "LastName");
        firstKing.setLastName("LastName2");
        Assert.assertEquals(" King's LastName : ", "LastName2", firstKing.getLastName());
    }

}