// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0004J\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u001c" }, d2 = { "Lkotlin/jvm/internal/b1;", "", "T", "", "c", "(Ljava/lang/Object;)I", "spreadArgument", "Lkotlin/j2;", "a", "(Ljava/lang/Object;)V", "f", "values", "result", "g", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "I", "b", "()I", "e", "(I)V", "position", "", "[Ljava/lang/Object;", "getSpreads$annotations", "()V", "spreads", "size", "<init>", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public abstract class b1<T>
{
    private int a;
    private final T[] b;
    private final int c;
    
    public b1(final int c) {
        this.c = c;
        this.b = (T[])new Object[c];
    }
    
    public final void a(@e final T t) {
        k0.p(t, "spreadArgument");
        this.b[this.a++] = t;
    }
    
    protected final int b() {
        return this.a;
    }
    
    protected abstract int c(@e final T p0);
    
    protected final void e(final int a) {
        this.a = a;
    }
    
    protected final int f() {
        final int n = this.c - 1;
        int n2 = 0;
        int n3 = 0;
        if (n >= 0) {
            int n4 = 0;
            while (true) {
                final T t = this.b[n4];
                int c;
                if (t != null) {
                    c = this.c(t);
                }
                else {
                    c = 1;
                }
                n3 = (n2 = n3 + c);
                if (n4 == n) {
                    break;
                }
                ++n4;
            }
        }
        return n2;
    }
    
    @e
    protected final T g(@e final T t, @e final T t2) {
        k0.p(t, "values");
        k0.p(t2, "result");
        final int n = this.c - 1;
        int n2 = 0;
        int n7;
        if (n >= 0) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6;
            while (true) {
                final T t3 = this.b[n3];
                n6 = n4;
                n7 = n5;
                if (t3 != null) {
                    int n8 = n5;
                    if (n4 < n3) {
                        final int n9 = n3 - n4;
                        System.arraycopy(t, n4, t2, n5, n9);
                        n8 = n5 + n9;
                    }
                    final int c = this.c(t3);
                    System.arraycopy(t3, 0, t2, n8, c);
                    n7 = n8 + c;
                    n6 = n3 + 1;
                }
                if (n3 == n) {
                    break;
                }
                ++n3;
                n4 = n6;
                n5 = n7;
            }
            n2 = n6;
        }
        else {
            n7 = 0;
        }
        final int c2 = this.c;
        if (n2 < c2) {
            System.arraycopy(t, n2, t2, n7, c2 - n2);
        }
        return t2;
    }
}
