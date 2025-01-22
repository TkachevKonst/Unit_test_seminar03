package seminars.third.hw;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {

    private MainHW mainHW;

    @BeforeEach
    void setup(){
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {1,9,101})
    void oddNumberTest(int n){
        assertFalse(mainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,28,514})
    void evenNumberTest(int n){
        assertTrue(mainHW.evenOddNumber(n));
    }


    @Test
    void numberInIntervalAllTest(){
        assertTrue(mainHW.numberInInterval(50));
        assertTrue(mainHW.numberInInterval(26));
        assertTrue(mainHW.numberInInterval(99));
        assertFalse(mainHW.numberInInterval(25));
        assertFalse(mainHW.numberInInterval(100));
        assertFalse(mainHW.numberInInterval(24));
        assertFalse(mainHW.numberInInterval(101));
    }

}
