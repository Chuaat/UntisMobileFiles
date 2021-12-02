// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public abstract class t implements e
{
    @org.jetbrains.annotations.e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    @org.jetbrains.annotations.e
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h L(@org.jetbrains.annotations.e final b1 p0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g p1);
    
    @org.jetbrains.annotations.e
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h M(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g p0);
    
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final b1 b1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
            k0.p(e, "<this>");
            k0.p(b1, "typeSubstitution");
            k0.p(g, "kotlinTypeRefiner");
            t t;
            if (e instanceof t) {
                t = (t)e;
            }
            else {
                t = null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h h;
            if (t == null) {
                h = e.e0(b1);
                k0.o(h, "this.getMemberScope(\n                typeSubstitution\n            )");
            }
            else {
                h = t.L(b1, g);
            }
            return h;
        }
        
        @org.jetbrains.annotations.e
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
            k0.p(e, "<this>");
            k0.p(g, "kotlinTypeRefiner");
            t t;
            if (e instanceof t) {
                t = (t)e;
            }
            else {
                t = null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h h;
            if (t == null) {
                h = e.E0();
                k0.o(h, "this.unsubstitutedMemberScope");
            }
            else {
                h = t.M(g);
            }
            return h;
        }
    }
}
