// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.m;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.o0;
import kotlin.jvm.internal.m0;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011" }, d2 = { "E", "Lkotlin/Function1;", "Lkotlin/j2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/w0;", "undeliveredElementException", "c", "(Ln6/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/w0;)Lkotlinx/coroutines/internal/w0;", "Lkotlin/coroutines/g;", "context", "b", "(Ln6/l;Ljava/lang/Object;Lkotlin/coroutines/g;)V", "", "a", "(Ln6/l;Ljava/lang/Object;Lkotlin/coroutines/g;)Ln6/l;", "OnUndeliveredElement", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class c0
{
    @e
    public static final <E> l<Throwable, j2> a(@e final l<? super E, j2> l, final E e, @e final g g) {
        return (l<Throwable, j2>)new l<Throwable, j2>() {
            public final void a(@e final Throwable t) {
                c0.b(l, e, g);
            }
        };
    }
    
    public static final <E> void b(@e final l<? super E, j2> l, final E e, @e final g g) {
        final w0 c = c(l, e, null);
        if (c != null) {
            o0.b(g, c);
        }
    }
    
    @f
    public static final <E> w0 c(@e final l<? super E, j2> l, final E obj, @f final w0 w0) {
        final Throwable t;
        Label_0031: {
            try {
                l.invoke((Object)obj);
            }
            finally {
                if (w0 == null || w0.getCause() == t) {
                    break Label_0031;
                }
                m.a((Throwable)w0, t);
            }
            return w0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Exception in undelivered element handler for ");
        sb.append(obj);
        return new w0(sb.toString(), t);
    }
}
