/**
Return n-th element of Fibonacci's sequence
(https://en.wikipedia.org/wiki/Fibonacci_number). Example:
Task04.fib(4) == 3
*/

package groovylab

class Task04 {
    public static int fib(int n) {
        def int res_priv = 1, res_cur = 1, res_next;
        def res = [0, res_priv, res_cur];
        for (int i=0; i<n; i++) {
            res_next = res_priv + res_cur;
            res_priv = res_cur;
            res_cur = res_next;
            res.add(res_cur);
        }
        return res[n]
    }
}