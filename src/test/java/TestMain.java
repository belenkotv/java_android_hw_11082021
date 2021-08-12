import org.example.MainApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    public void test1Task1() {
        int[] input = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] output = {1, 7};
        int[] result = MainApp.task1(input);
        Assertions.assertArrayEquals(output, result);
    }

    @Test
    public void test2Task1() {
        int[] input = {1, 2, 4, 2, 3, 1, 7};
        int[] output = {2, 3, 1, 7};
        int[] result = MainApp.task1(input);
        Assertions.assertArrayEquals(output, result);
    }

    @Test
    public void test3Task1() {
        int[] input = {1, 4};
        int[] output = {};
        int[] result = MainApp.task1(input);
        Assertions.assertArrayEquals(output, result);
    }

    @Test
    public void test4Task1() {
        int[] input = {1, 2, 3, 1};
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.task1(input));
    }

    @Test
    public void test1Task2() {
        int[] input = {1, 1, 1, 4, 4, 1, 4, 4};
        Assertions.assertTrue(MainApp.task2(input));
    }

    @Test
    public void test2Task2() {
        int[] input = {1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(MainApp.task2(input));
    }

    @Test
    public void test3Task2() {
        int[] input = {4, 4, 4, 4};
        Assertions.assertFalse(MainApp.task2(input));
    }
    @Test
    public void test4Task2() {
        int[] input = {1, 4, 4, 1, 1, 4, 3 };
        Assertions.assertFalse(MainApp.task2(input));
    }
    @Test
    public void test5Task2() {
        int[] input = {14, 41, 11, 44};
        Assertions.assertFalse(MainApp.task2(input));
    }

}
