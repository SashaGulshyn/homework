package src.tests.home_work_1;

import src.home_work_1.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PhoneNumberTest {

    @Test
    public void numberPassed (){
        String actual = PhoneNumber.createPhoneNumber();
        Assertions.assertEquals("(123) 456-7890", actual);
    }

    @Test
    public void numberWithNegativeCharacter (){
        String actual = PhoneNumber.createPhoneNumber();
        Assertions.assertEquals("Foo1", actual);
    }
}
