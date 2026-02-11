package codefinity;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

//import static codefinity.Main.exceptionHandlingExercise;
import static org.junit.jupiter.api.Assertions.*;


public class ExceptionHandlingExerciseTest {

    //ToDo: Pay attention to the test names
    // and implement tests that correspond to those names.
    // Each test should perform the function indicated by the test name."

    @Test
    public void checkAge_ShouldThrowIllegalArgumentException_WhenAgeIsLessThan18() {
        ExceptionHandlingExercise exceptionHandlingExercise = new ExceptionHandlingExercise();

               IllegalArgumentException illegalArgumentException = Assert.assertThrows(IllegalArgumentException.class, () -> exceptionHandlingExercise.checkAge(17));
               Assert.assertTrue(illegalArgumentException.getMessage().equals("Access denied - You must be at least 18 years old."));


    }

    @Test
    public void checkAge_ShouldNotThrowException_WhenAgeIs18OrMore() {
        ExceptionHandlingExercise exceptionHandlingExercise = new ExceptionHandlingExercise();
        assertDoesNotThrow( () -> exceptionHandlingExercise.checkAge(18));
//        Assert.assertTrue(illegalArgumentException.getMessage().equals("Access denied - You must be at least 18 years old."));

    }

    @Test
    public void printLength_ShouldThrowNullPointerException_WhenStringIsNull() {
        ExceptionHandlingExercise exceptionHandlingExercise = new ExceptionHandlingExercise();

        NullPointerException nullPointerException = assertThrows(NullPointerException.class, () -> exceptionHandlingExercise.printLength(null));
        assertEquals("String value is null.", nullPointerException.getMessage());
    }

    @Test
    public void printLength_ShouldNotThrowException_WhenStringIsNotNull() {
        ExceptionHandlingExercise exceptionHandlingExercise = new ExceptionHandlingExercise();

        assertDoesNotThrow(()->exceptionHandlingExercise.printLength("hello"));;
    }
}
