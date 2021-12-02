// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import m6.d;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.a;

public final class f extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a
{
    @e
    public static final a h;
    @d
    @e
    public static final f i;
    @d
    @e
    public static final f j;
    private final boolean g;
    
    static {
        h = new a(null);
        i = new f(new int[] { 1, 4, 2 });
        j = new f(new int[0]);
    }
    
    public f(@e final int... array) {
        k0.p((Object)array, "numbers");
        this(array, false);
    }
    
    public f(@e final int[] array, final boolean g) {
        k0.p((Object)array, "versionArray");
        final int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        super(array2);
        this.g = g;
    }
    
    public boolean h() {
        final int a = this.a();
        final boolean b = false;
        if (a == 1) {
            final boolean b2 = b;
            if (this.b() == 0) {
                return b2;
            }
        }
        boolean f;
        if (this.g) {
            f = this.f(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.i);
        }
        else {
            final int a2 = this.a();
            final f i = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.i;
            f = (a2 == i.a() && this.b() <= i.b() + 1);
        }
        boolean b2 = b;
        if (f) {
            b2 = true;
        }
        return b2;
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
