// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.model.l;

public final class r0 extends e implements l
{
    public r0(@org.jetbrains.annotations.e final w0 w0, final boolean b, @org.jetbrains.annotations.e final w0 w2, @org.jetbrains.annotations.e final h h) {
        kotlin.jvm.internal.k0.p((Object)w0, "originalTypeVariable");
        kotlin.jvm.internal.k0.p((Object)w2, "constructor");
        kotlin.jvm.internal.k0.p((Object)h, "memberScope");
        super(w0, b, w2, h);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e X0(final boolean b) {
        return new r0(this.W0(), b, this.N0(), this.x());
    }
}
