// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.w0;
import java.util.ArrayList;
import kotlinx.coroutines.internal.c;
import kotlinx.coroutines.selects.g;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00138D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00138D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\"" }, d2 = { "Lkotlinx/coroutines/channels/c0;", "E", "Lkotlinx/coroutines/channels/a;", "element", "", "C", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "D", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/channels/k0;", "list", "Lkotlinx/coroutines/channels/v;", "closed", "Lkotlin/j2;", "e0", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/v;)V", "", "w", "()Z", "isBufferAlwaysFull", "x", "isBufferFull", "b0", "isBufferEmpty", "a0", "isBufferAlwaysEmpty", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class c0<E> extends a<E>
{
    public c0(@org.jetbrains.annotations.f final l<? super E, j2> l) {
        super(l);
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Object C(final E e) {
        i0<?> g;
        do {
            final Object c = super.C(e);
            final k0 e2 = kotlinx.coroutines.channels.b.e;
            if (c == e2) {
                return e2;
            }
            if (c == kotlinx.coroutines.channels.b.f) {
                g = this.G(e);
                if (g == null) {
                    return e2;
                }
                continue;
            }
            else {
                if (c instanceof v) {
                    return c;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid offerInternal result ");
                sb.append(c);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!(g instanceof v));
        return g;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Object D(final E e, @org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<?> f) {
        while (true) {
            Object obj;
            if (this.Z()) {
                obj = super.D(e, f);
            }
            else {
                obj = f.M(this.g(e));
                if (obj == null) {
                    obj = kotlinx.coroutines.channels.b.e;
                }
            }
            if (obj == kotlinx.coroutines.selects.g.d()) {
                return kotlinx.coroutines.selects.g.d();
            }
            final k0 e2 = kotlinx.coroutines.channels.b.e;
            if (obj == e2) {
                return e2;
            }
            if (obj == kotlinx.coroutines.channels.b.f) {
                continue;
            }
            if (obj == kotlinx.coroutines.internal.c.b) {
                continue;
            }
            if (obj instanceof v) {
                return obj;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid result ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
    
    @Override
    protected final boolean a0() {
        return true;
    }
    
    @Override
    protected final boolean b0() {
        return true;
    }
    
    @Override
    protected void e0(@org.jetbrains.annotations.e final Object o, @org.jetbrains.annotations.e final v<?> v) {
        final w0 w0 = null;
        w0 w2;
        if (o == null) {
            w2 = w0;
        }
        else if (!(o instanceof ArrayList)) {
            final kotlinx.coroutines.channels.k0 k0 = (kotlinx.coroutines.channels.k0)o;
            if (k0 instanceof kotlinx.coroutines.channels.c.a) {
                final n6.l<E, j2> h = (n6.l<E, j2>)super.H;
                w2 = w0;
                if (h != null) {
                    w2 = kotlinx.coroutines.internal.c0.c((n6.l<? super E, j2>)h, ((kotlinx.coroutines.channels.c.a)k0).J, null);
                }
            }
            else {
                k0.L0(v);
                w2 = w0;
            }
        }
        else {
            final ArrayList list = (ArrayList)o;
            int i = list.size() - 1;
            w2 = null;
            while (i >= 0) {
                final kotlinx.coroutines.channels.k0 k2 = list.get(i);
                if (k2 instanceof kotlinx.coroutines.channels.c.a) {
                    final n6.l<E, j2> h2 = (n6.l<E, j2>)super.H;
                    if (h2 != null) {
                        w2 = kotlinx.coroutines.internal.c0.c((n6.l<? super E, j2>)h2, ((kotlinx.coroutines.channels.c.a)k2).J, w2);
                    }
                    else {
                        w2 = null;
                    }
                }
                else {
                    k2.L0(v);
                }
                --i;
            }
        }
        if (w2 == null) {
            return;
        }
        throw w2;
    }
    
    @Override
    protected final boolean w() {
        return false;
    }
    
    @Override
    protected final boolean x() {
        return false;
    }
}
