// 
// Decompiled by Procyon v0.5.36
// 

package a2;

public final class b
{
    private b() {
    }
    
    public static <TInput, TResult, TException extends Throwable> TResult a(int n, final TInput tInput, final a<TInput, TResult, TException> a, final c<TInput, TResult> c) throws TException, Throwable {
        int n2 = n;
        TInput a2 = tInput;
        if (n < 1) {
            return a.apply(tInput);
        }
        TResult apply;
        do {
            apply = a.apply(a2);
            a2 = c.a(a2, apply);
            if (a2 == null) {
                break;
            }
            n = n2 - 1;
        } while ((n2 = n) >= 1);
        return apply;
    }
}
