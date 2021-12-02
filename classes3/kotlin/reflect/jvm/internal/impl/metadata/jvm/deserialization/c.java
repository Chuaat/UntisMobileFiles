// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import m6.d;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.a;

public final class c extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a
{
    @e
    public static final a g;
    @d
    @e
    public static final c h;
    @d
    @e
    public static final c i;
    
    static {
        g = new a(null);
        h = new c(new int[] { 1, 0, 3 });
        i = new c(new int[0]);
    }
    
    public c(@e final int... array) {
        k0.p((Object)array, "numbers");
        final int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        super(array2);
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
