package edu.desu.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemATest {
    @Test
    public void containETest01() {

        // Given
        String str = "Hello";

        // When
        Boolean expected = true;
        Boolean actual = ProblemA.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest02() {

        // Given
        String str = "Heelle";

        // When
        Boolean expected = true;
        Boolean actual = ProblemA.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest03() {

        // Given
        String str = "Heelele";

        // When
        Boolean expected = false;
        Boolean actual = ProblemA.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
