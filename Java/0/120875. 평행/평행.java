class Solution {

    public int solution(int[][] dots) {

        boolean hasParallel = parallel(dots[0], dots[1], dots[2], dots[3])

                || parallel(dots[0], dots[2], dots[1], dots[3])

                || parallel(dots[0], dots[3], dots[1], dots[2]);


        return hasParallel ? 1 : 0;
    }

    private boolean parallel(int[] a, int[] b, int[] c, int[] d) {

        int dx1 = a[0] - b[0];
        int dy1 = a[1] - b[1];
        int dx2 = c[0] - d[0];
        int dy2 = c[1] - d[1];

        return dy1 * dx2 == dy2 * dx1;
    }
}