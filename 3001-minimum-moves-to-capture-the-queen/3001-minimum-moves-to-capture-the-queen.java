class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
         if (a == e) {

            // bishop blocks?
            if (!(c == a && between(b, d, f))) {
                return 1;
            }
        }

        // same column
        if (b == f) {

            // bishop blocks?
            if (!(d == b && between(a, c, e))) {
                return 1;
            }
        }

        // ---------------- BISHOP CHECK ----------------

        // queen on same diagonal as bishop
        if (Math.abs(c - e) == Math.abs(d - f)) {

            // rook blocks bishop?
            if (!(Math.abs(a - e) == Math.abs(b - f)
                    && betweenDiag(c, d, a, b, e, f))) {

                return 1;
            }
        }

        return 2;
    }

    // checks if y lies strictly between x and z
    private boolean between(int x, int y, int z) {
        return y > Math.min(x, z) && y < Math.max(x, z);
    }

    // checks if rook lies between bishop and queen on same diagonal
    private boolean betweenDiag(int c, int d,
                                int a, int b,
                                int e, int f) {

        // rook must lie on bishop-queen diagonal
        if (Math.abs(c - a) != Math.abs(d - b))
            return false;

        return between(c, a, e) && between(d, b, f);
    }
}