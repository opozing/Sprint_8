package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LengthTest {

    private final String name;
    private final boolean expected;

    public LengthTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Ustinov Sergeyyyyyy", true},
                {"Ustinov Sergeyyyyyyy", false},
                {"U S", true},
                {"U ", false},
        };
    }

    @Test
    public void isValidLengthReturnsValidBool() {
        Account validAccount = new Account(name);
        boolean actual = validAccount.isValidLength();
        Assert.assertEquals(expected, actual);
    }
}