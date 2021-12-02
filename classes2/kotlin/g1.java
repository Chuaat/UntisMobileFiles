// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import n6.a;
import n6.l;
import kotlin.internal.f;
import kotlin.jvm.internal.w;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a4\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0005*\u00028\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\b\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u001aM\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\b\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001aC\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0002\b\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0012\u0010\u000e\u001a>\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u000bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0013\u0010\u000e\u001aD\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0005*\u00028\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0014\u0010\u000e\u001a@\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u000bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0017\u0010\u000e\u001a@\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n*\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u000bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0018\u0010\u000e\u001a3\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u000bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d" }, d2 = { "", "a", "", "reason", "b", "R", "Lkotlin/Function0;", "block", "h", "(Ln6/a;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/s;", "g", "(Ljava/lang/Object;Ln6/l;)Ljava/lang/Object;", "receiver", "k", "Lkotlin/j2;", "d", "c", "e", "", "predicate", "i", "j", "", "times", "action", "f", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/StandardKt")
class g1
{
    public g1() {
    }
    
    @f
    private static final Void a() {
        throw new i0(null, 1, null);
    }
    
    @f
    private static final Void b(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append(str);
        throw new i0(sb.toString());
    }
    
    @e1(version = "1.1")
    @f
    private static final <T> T c(final T t, final l<? super T, j2> l) {
        l.invoke(t);
        return t;
    }
    
    @f
    private static final <T> T d(final T t, final l<? super T, j2> l) {
        l.invoke(t);
        return t;
    }
    
    @f
    private static final <T, R> R e(final T t, final l<? super T, ? extends R> l) {
        return (R)l.invoke(t);
    }
    
    @f
    private static final void f(final int n, final l<? super Integer, j2> l) {
        for (int i = 0; i < n; ++i) {
            l.invoke(i);
        }
    }
    
    @f
    private static final <T, R> R g(final T t, final l<? super T, ? extends R> l) {
        return (R)l.invoke(t);
    }
    
    @f
    private static final <R> R h(final a<? extends R> a) {
        return (R)a.invoke();
    }
    
    @e1(version = "1.1")
    @f
    private static final <T> T i(T t, final l<? super T, Boolean> l) {
        if (!l.invoke(t)) {
            t = null;
        }
        return t;
    }
    
    @e1(version = "1.1")
    @f
    private static final <T> T j(T t, final l<? super T, Boolean> l) {
        if (l.invoke(t)) {
            t = null;
        }
        return t;
    }
    
    @f
    private static final <T, R> R k(final T t, final l<? super T, ? extends R> l) {
        return (R)l.invoke(t);
    }
}
