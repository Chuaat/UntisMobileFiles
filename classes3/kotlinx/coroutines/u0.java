// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import n6.p;
import c7.a;
import kotlin.coroutines.f;
import c7.b;
import kotlin.h0;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u00020\u00118F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lkotlinx/coroutines/u0;", "", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "completion", "Lkotlin/j2;", "b", "(Ln6/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "Lkotlin/s;", "receiver", "d", "(Ln6/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "", "f", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public enum u0
{
    G, 
    H, 
    @z1
    I, 
    J;
    
    @f2
    public final <T> void b(@e final l<? super d<? super T>, ?> l, @e final d<? super T> d) {
        final int n = t0.a[this.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new h0();
                    }
                }
                else {
                    b.a((n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l, (kotlin.coroutines.d<? super Object>)d);
                }
            }
            else {
                f.h((l)l, (d)d);
            }
        }
        else {
            a.c((n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l, (kotlin.coroutines.d<? super Object>)d);
        }
    }
    
    @f2
    public final <R, T> void d(@e final p<? super R, ? super d<? super T>, ?> p3, final R r, @e final d<? super T> d) {
        final int n = t0.b[this.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new h0();
                    }
                }
                else {
                    b.b((n6.p<? super R, ? super kotlin.coroutines.d<? super Object>, ?>)p3, r, (kotlin.coroutines.d<? super Object>)d);
                }
            }
            else {
                f.i((p)p3, (Object)r, (d)d);
            }
        }
        else {
            a.e(p3, r, d, null, 4, null);
        }
    }
    
    public final boolean f() {
        return this == u0.H;
    }
}
