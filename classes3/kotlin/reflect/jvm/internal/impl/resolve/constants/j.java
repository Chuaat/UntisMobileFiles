// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.n1;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.e;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.s0;

public final class j extends g<s0<? extends a, ? extends e>>
{
    @org.jetbrains.annotations.e
    private final a b;
    @org.jetbrains.annotations.e
    private final e c;
    
    public j(@org.jetbrains.annotations.e final a b, @org.jetbrains.annotations.e final e c) {
        k0.p((Object)b, "enumClassId");
        k0.p((Object)c, "enumEntryName");
        super(n1.a((Object)b, (Object)c));
        this.b = b;
        this.c = c;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public c0 a(@org.jetbrains.annotations.e final e0 e0) {
        k0.p((Object)e0, "module");
        kotlin.reflect.jvm.internal.impl.descriptors.e a = x.a(e0, this.b);
        final kotlin.reflect.jvm.internal.impl.types.k0 k0 = null;
        kotlin.reflect.jvm.internal.impl.types.k0 a2;
        if (a == null) {
            a2 = k0;
        }
        else {
            if (!d.A((m)a)) {
                a = null;
            }
            if (a == null) {
                a2 = k0;
            }
            else {
                a2 = a.A();
            }
        }
        kotlin.reflect.jvm.internal.impl.types.k0 j = a2;
        if (a2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Containing class for error-class based enum entry ");
            sb.append(this.b);
            sb.append('.');
            sb.append(this.c);
            j = u.j(sb.toString());
            kotlin.jvm.internal.k0.o((Object)j, "createErrorType(\"Containing class for error-class based enum entry $enumClassId.$enumEntryName\")");
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    public final e c() {
        return this.c;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.j());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
