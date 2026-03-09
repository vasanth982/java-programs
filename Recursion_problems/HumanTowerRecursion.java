class HumanTowerRecursion {

    public static void main(String[] args) {
        int row = 4;
        int col = 2;

        System.out.println("Weight supported at position: " + human_rec(row, col));
    }

    static double human_rec(int r, int c) {

        if (r == 0 && c == 0) {   // top person
            return 0;
        }

        double left = 0;
        double right = 0;

        if (c > 0) {
            left = (human_rec(r - 1, c - 1) + 70) / 2;
        }

        if (c < r) {
            right = (human_rec(r - 1, c) + 70) / 2;
        }

        return left + right;
    }
}