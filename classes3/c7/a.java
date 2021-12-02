// 
// Decompiled by Procyon v0.5.36
// 

package c7;

import org.jetbrains.annotations.f;
import n6.p;
import kotlinx.coroutines.f2;
import n6.l;
import kotlinx.coroutines.internal.k;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.e;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a#\u0010\u0016\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017" }, d2 = { "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/j2;", "c", "(Ln6/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lkotlin/t0;", "name", "cause", "onCancellation", "d", "(Ln6/p;Ljava/lang/Object;Lkotlin/coroutines/d;Ln6/l;)V", "fatalCompletion", "b", "Lkotlin/Function0;", "block", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class a
{
    private static final void a(final d<?> d, final n6.a<j2> a) {
        try {
            a.invoke();
        }
        finally {
            final b1$a h = b1.H;
            final Throwable t;
            d.resumeWith(b1.b(c1.a(t)));
        }
    }
    
    public static final void b(@e final d<? super j2> d, @e final d<?> d2) {
        try {
            final d d3 = b.d((d)d);
            final b1$a h = b1.H;
            k.g(d3, b1.b((Object)j2.a), null, 2, null);
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            d2.resumeWith(b1.b(c1.a(t)));
        }
    }
    
    @f2
    public static final <T> void c(@e final l<? super d<? super T>, ?> l, @e final d<? super T> d) {
        try {
            final d d2 = b.d(b.b((l)l, (d)d));
            final b1$a h = b1.H;
            k.g(d2, b1.b((Object)j2.a), null, 2, null);
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            d.resumeWith(b1.b(c1.a(t)));
        }
    }
    
    public static final <R, T> void d(@e final p<? super R, ? super d<? super T>, ?> p4, final R r, @e final d<? super T> d, @f final l<? super Throwable, j2> l) {
        try {
            final d d2 = b.d(b.c((p)p4, (Object)r, (d)d));
            final b1$a h = b1.H;
            k.f((kotlin.coroutines.d<? super Object>)d2, b1.b((Object)j2.a), l);
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            d.resumeWith(b1.b(c1.a(t)));
        }
    }
}
