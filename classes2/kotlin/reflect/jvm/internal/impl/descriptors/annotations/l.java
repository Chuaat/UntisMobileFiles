// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;

public final class l implements g
{
    @e
    private final g G;
    private final boolean H;
    @e
    private final n6.l<kotlin.reflect.jvm.internal.impl.name.b, Boolean> I;
    
    public l(@e final g g, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.b, Boolean> l) {
        k0.p(g, "delegate");
        k0.p(l, "fqNameFilter");
        this(g, false, l);
    }
    
    public l(@e final g g, final boolean h, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.b, Boolean> i) {
        k0.p(g, "delegate");
        k0.p(i, "fqNameFilter");
        this.G = g;
        this.H = h;
        this.I = (n6.l<kotlin.reflect.jvm.internal.impl.name.b, Boolean>)i;
    }
    
    private final boolean b(final c c) {
        final kotlin.reflect.jvm.internal.impl.name.b f = c.f();
        return f != null && this.I.invoke(f);
    }
    
    @Override
    public boolean B4(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "fqName");
        return this.I.invoke(b) && this.G.B4(b);
    }
    
    @f
    @Override
    public c a0(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "fqName");
        c a0;
        if (this.I.invoke(b)) {
            a0 = this.G.a0(b);
        }
        else {
            a0 = null;
        }
        return a0;
    }
    
    @Override
    public boolean isEmpty() {
        final g g = this.G;
        final boolean b = g instanceof Collection;
        final boolean b2 = true;
        boolean b3 = false;
        Label_0067: {
            if (!b || !((Collection<c>)g).isEmpty()) {
                final Iterator<c> iterator = g.iterator();
                while (iterator.hasNext()) {
                    if (this.b(iterator.next())) {
                        b3 = true;
                        break Label_0067;
                    }
                }
            }
            b3 = false;
        }
        if (this.H) {
            b3 = (!b3 && b2);
        }
        return b3;
    }
    
    @e
    @Override
    public Iterator<c> iterator() {
        final g g = this.G;
        final ArrayList<c> list = new ArrayList<c>();
        for (final c next : g) {
            if (this.b(next)) {
                list.add(next);
            }
        }
        return (Iterator<c>)list.iterator();
    }
}
