package cci;

public final class SubarrayWithMaxSum {
    public static Result execute(int[] a) {
        final int n = a.length;

        int beg = 0;
        int end = 0;

        int cur = a[beg];
        int prev = cur;
        int sum = cur;

        boolean flag = false;

        for (int i = 1; i < n; ++i) {
            if (a[i] > prev + a[i]) {
                flag = true;
                cur = a[i];
            } else {
                cur = prev + a[i];
            }

            prev = cur;

            if (cur > sum) {
                sum = cur;
                end = i;
                if (flag) {
                    beg = i;
                    flag = false;
                }
            }
        }

        return new Result(beg, end, sum);
    }

    public static class Result {
        public final int beg;
        public final int end;
        public final int sum;

        public Result(int beg, int end, int sum) {
            this.beg = beg;
            this.end = end;
            this.sum = sum;
        }
    }
}