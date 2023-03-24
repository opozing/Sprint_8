package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;


@RunWith(Parameterized.class)
public class OneSpaceTest {
    private final String name;
    private final boolean expected;

    public OneSpaceTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Ustinov Sergey", true},
                {"UstinovSergey", false},
                {"Ustinov Sergey ", false}
        };
    }

    @Test
    public void isOnlyOneSpaceReturnsValidBool() {
        Account account = new Account(name);
        boolean actual = account.isOnlyOneSpace();
        Assert.assertEquals(expected, actual);
    }
}
