package morseCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
public class ExtraSpaceTest {

   @Test
    public void testTranslateToMorseCodeWithExtraSpaces() {
        String input = "  hello   world  ";
        String expectedOutput = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";
        assertEquals(expectedOutput, Main.translateToMorseCodeLogic(input));
    }

  


	@Test
    public void testTranslateToEnglishWithExtraSpaces2() {
        String input = ".... . .-.. .-.. ---   .-- --- .-. .-.. -..";
        String expectedOutput = "hello world";
        assertEquals(expectedOutput, Main.translateToEnglishLogic(input));
    }
}