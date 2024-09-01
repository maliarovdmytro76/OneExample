package doubleRemover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class DoubleRemoverTest {
    private DoubleRemover doubleRemover = new DoubleRemover();

    DoubleRemoverTest() {
    }

    @Test
    public void removeDuplicatesWhenOriginalStringHasDuplicates() {
        String original = "kaabeebkdc";
        String expected = "dc";
        String result = this.doubleRemover.removeDuplicates(original);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void removeDuplicatesWhenOriginalStringHasNoDuplicates() {
        String original = "kbdc";
        String expected = "kbdc";
        String result = this.doubleRemover.removeDuplicates(original);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(
            strings = {"aabb"}
    )
    public void removeDuplicatesWhenOriginalStringIsEmptyNullOnlyDuplicates(String param) {
        Assertions.assertEquals("", this.doubleRemover.removeDuplicates(param));
    }
}
