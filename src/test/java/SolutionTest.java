import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void updateMatrixTest1() {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] actual = new Solution().updateMatrix(mat);
        boolean result = Arrays.deepEquals(expected, actual);
        Assert.assertTrue(result);
    }

    @Test
    public void updateMatrixTest2() {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };

        int[][] actual = new Solution().updateMatrix(mat);
        boolean result = Arrays.deepEquals(expected, actual);
        Assert.assertTrue(result);
    }

}
