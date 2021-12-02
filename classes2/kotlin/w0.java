// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import n6.a;
import kotlin.internal.f;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a1\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\t\u0010\n\u001aB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a1\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u000f\u0010\n\u001aB\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0010\u0010\f\u001a\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014" }, d2 = { "", "value", "Lkotlin/j2;", "h", "Lkotlin/Function0;", "", "lazyMessage", "i", "T", "j", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;Ln6/a;)Ljava/lang/Object;", "c", "d", "e", "f", "message", "", "g", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/PreconditionsKt")
class w0 extends v0
{
    public w0() {
    }
    
    @f
    private static final void c(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @f
    private static final void d(final boolean b, final a<?> a) {
        if (b) {
            return;
        }
        throw new IllegalStateException(a.invoke().toString());
    }
    
    @f
    private static final <T> T e(final T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    @f
    private static final <T> T f(final T t, final a<?> a) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(a.invoke().toString());
    }
    
    @f
    private static final Void g(final Object o) {
        throw new IllegalStateException(o.toString());
    }
    
    @f
    private static final void h(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @f
    private static final void i(final boolean b, final a<?> a) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(a.invoke().toString());
    }
    
    @f
    private static final <T> T j(final T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @f
    private static final <T> T k(final T t, final a<?> a) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(a.invoke().toString());
    }
}
