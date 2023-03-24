package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CheckNameTest {

    private Account account = new Account("Ustinov Sergey");
    private Account accountFail = new Account("UstinovSergey");

    @Test
    public void isCheckNameReturnsTrue() {
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue(actual);
    }

    @Test
    public void isCheckNameReturnsFalse() {
        boolean actual = accountFail.checkNameToEmboss();
        Assert.assertFalse(actual);
    }
}
