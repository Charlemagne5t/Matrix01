import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[i][j] = pathLengthToNearestOne(mat, i, j);
            }
        }

        return result;
    }

    private int pathLengthToNearestOne(int[][] mat, int i, int j) {
        if (mat[i][j] == 0) {
            return 0;
        }
        int[] start = {i, j};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        int level = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] currentCell = queue.poll();
                for (int[] direction : directions) {
                    int nextI = currentCell[0] + direction[0];
                    int nextJ = currentCell[1] + direction[1];
                    if (nextI >= 0 && nextI < mat.length && nextJ >= 0 && nextJ < mat[0].length && !visited[nextI][nextJ]) {
                        visited[nextI][nextJ] = true;
                        if (mat[nextI][nextJ] == 0) {
                            return level;
                        }
                        queue.add(new int[]{nextI, nextJ});
                    }
                }
            }

        }
        return 0;
    }
}
