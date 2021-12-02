// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import n6.l;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import org.jetbrains.annotations.e;

public class t extends k0
{
    @e
    private final w0 H;
    @e
    private final h I;
    @e
    private final List<y0> J;
    private final boolean K;
    @e
    private final String L;
    
    @m6.h
    public t(@e final w0 w0, @e final h h) {
        kotlin.jvm.internal.k0.p((Object)w0, "constructor");
        kotlin.jvm.internal.k0.p((Object)h, "memberScope");
        this(w0, h, null, false, null, 28, null);
    }
    
    @m6.h
    public t(@e final w0 w0, @e final h h, @e final List<? extends y0> list, final boolean b) {
        kotlin.jvm.internal.k0.p((Object)w0, "constructor");
        kotlin.jvm.internal.k0.p((Object)h, "memberScope");
        kotlin.jvm.internal.k0.p((Object)list, "arguments");
        this(w0, h, list, b, null, 16, null);
    }
    
    @m6.h
    public t(@e final w0 h, @e final h i, @e final List<? extends y0> j, final boolean k, @e final String l) {
        kotlin.jvm.internal.k0.p((Object)h, "constructor");
        kotlin.jvm.internal.k0.p((Object)i, "memberScope");
        kotlin.jvm.internal.k0.p((Object)j, "arguments");
        kotlin.jvm.internal.k0.p((Object)l, "presentableName");
        this.H = h;
        this.I = i;
        this.J = (List<y0>)j;
        this.K = k;
        this.L = l;
    }
    
    @e
    @Override
    public List<y0> M0() {
        return this.J;
    }
    
    @e
    @Override
    public w0 N0() {
        return this.H;
    }
    
    @Override
    public boolean O0() {
        return this.K;
    }
    
    @e
    @Override
    public k0 U0(final boolean b) {
        return new t(this.N0(), this.x(), this.M0(), b, null, 16, null);
    }
    
    @e
    @Override
    public k0 V0(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return this;
    }
    
    @e
    public String W0() {
        return this.L;
    }
    
    @e
    public t X0(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.N0());
        String y2;
        if (this.M0().isEmpty()) {
            y2 = "";
        }
        else {
            y2 = v.Y2((Iterable)this.M0(), (CharSequence)", ", (CharSequence)"<", (CharSequence)">", -1, (CharSequence)"...", (l)null);
        }
        sb.append(y2);
        return sb.toString();
    }
    
    @e
    @Override
    public h x() {
        return this.I;
    }
}
