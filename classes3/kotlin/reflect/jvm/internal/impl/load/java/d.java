// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public final class d
{
    private static final boolean b(final e e) {
        return b.b().contains(a.i((m)e)) || ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e).getAnnotations().B4(b.f());
    }
}
