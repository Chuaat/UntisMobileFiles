// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;

public abstract class z extends k implements h0
{
    @e
    private final kotlin.reflect.jvm.internal.impl.name.b K;
    
    public z(@e final e0 e0, @e final kotlin.reflect.jvm.internal.impl.name.b k) {
        k0.p(e0, "module");
        k0.p(k, "fqName");
        super(e0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), k.h(), w0.a);
        this.K = k;
    }
    
    @Override
    public <R, D> R P(@e final o<R, D> o, final D n) {
        k0.p(o, "visitor");
        return o.f(this, n);
    }
    
    @e
    @Override
    public e0 c() {
        return (e0)super.c();
    }
    
    @e
    @Override
    public final kotlin.reflect.jvm.internal.impl.name.b f() {
        return this.K;
    }
    
    @e
    @Override
    public w0 k() {
        final w0 a = w0.a;
        k0.o(a, "NO_SOURCE");
        return a;
    }
    
    @e
    @Override
    public String toString() {
        return k0.C("package ", this.K);
    }
}
