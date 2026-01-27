class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> s = new ArrayList<>();
        int n = 0, m = 0;

        while (n < a.length && m < b.length) {

            if (a[n] < b[m]) {
                addIfNotDuplicate(s, a[n]);
                n++;
            }
            else if (a[n] > b[m]) {
                addIfNotDuplicate(s, b[m]);
                m++;
            }
            else {
                addIfNotDuplicate(s, a[n]);
                n++;
                m++;
            }
        }

        while (n < a.length) {
            addIfNotDuplicate(s, a[n]);
            n++;
        }

        while (m < b.length) {
            addIfNotDuplicate(s, b[m]);
            m++;
        }

        return s;
    }

    private static void addIfNotDuplicate(ArrayList<Integer> s, int val) {
        if (s.isEmpty() || s.get(s.size() - 1) != val) {
            s.add(val);
        }
    }
}
