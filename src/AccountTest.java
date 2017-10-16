import org.junit.Assert;

import static org.junit.Assert.*;

public class AccountTest {

    Account ac1 = new Account(3,400);
    int answer1 = 3;
    double answer2 = 400;

    @org.junit.Test
    public void getId() throws Exception {

        Assert.assertEquals(answer1, ac1.getId());
    }

    @org.junit.Test
    public void getBalance() throws Exception {

        Assert.assertEquals(answer2, ac1.getBalance(),0.0);

    }

}