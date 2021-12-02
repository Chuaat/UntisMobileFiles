// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import java.util.Iterator;
import n6.l;
import kotlin.collections.v;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.model.m;
import kotlin.reflect.jvm.internal.impl.types.model.k;

public abstract class k0 extends j1 implements k, m
{
    public k0() {
        super(null);
    }
    
    @e
    public abstract k0 U0(final boolean p0);
    
    @e
    public abstract k0 V0(@e final g p0);
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator = ((Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)((a)this).getAnnotations()).iterator();
        while (iterator.hasNext()) {
            s.j0(sb, "[", c.u(c.j, iterator.next(), null, 2, null), "] ");
        }
        sb.append(this.N0());
        if (this.M0().isEmpty() ^ true) {
            v.X2((Iterable)this.M0(), (Appendable)sb, (CharSequence)", ", (CharSequence)"<", (CharSequence)">", 0, (CharSequence)null, (l)null, 112, (Object)null);
        }
        if (this.O0()) {
            sb.append("?");
        }
        final String string = sb.toString();
        kotlin.jvm.internal.k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
