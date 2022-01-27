package cl.mobdev.challenge.gateway.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Locale;


class ApiCharacterTest {

    @Test
    void getName() {
        ApiCharacter apiCharacter = new ApiCharacter();
        apiCharacter.setName("Rick Sánchez");
        String expected = "Rick Sánchez";
        String real = apiCharacter.getName();
        assertEquals(expected, real);

        apiCharacter.setName("Morty");
        String expected1 = "Morty";
        String real1 = apiCharacter.getName();
        assertEquals(expected1, real1);

        apiCharacter.setName("EMMANUEL");
        String expected2 = "emmanuel";
        String real2 = apiCharacter.getName().toLowerCase(Locale.ROOT);
        assertEquals(expected2, real2);
    }


}