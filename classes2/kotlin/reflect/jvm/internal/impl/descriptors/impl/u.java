// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public final class u
{
    @org.jetbrains.annotations.e
    public static final h a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final b1 b1, @org.jetbrains.annotations.e final g g) {
        k0.p(e, "<this>");
        k0.p(b1, "typeSubstitution");
        k0.p(g, "kotlinTypeRefiner");
        return t.G.a(e, b1, g);
    }
    
    @org.jetbrains.annotations.e
    public static final h b(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g g) {
        k0.p(e, "<this>");
        k0.p(g, "kotlinTypeRefiner");
        return t.G.b(e, g);
    }
}
