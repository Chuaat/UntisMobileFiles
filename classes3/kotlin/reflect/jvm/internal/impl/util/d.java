// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import n6.l;
import java.util.Collection;
import kotlin.text.o;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.e;

public final class d
{
    @f
    private final e a;
    @f
    private final o b;
    @f
    private final Collection<e> c;
    @org.jetbrains.annotations.e
    private final l<y, String> d;
    @org.jetbrains.annotations.e
    private final b[] e;
    
    public d(@org.jetbrains.annotations.e final Collection<e> collection, @org.jetbrains.annotations.e final b[] array, @org.jetbrains.annotations.e final l<? super y, String> l) {
        k0.p((Object)collection, "nameList");
        k0.p((Object)array, "checks");
        k0.p((Object)l, "additionalChecks");
        final b[] array2 = new b[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        this(null, null, collection, l, array2);
    }
    
    private d(final e a, final o b, final Collection<e> c, final l<? super y, String> d, final b... e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (l<y, String>)d;
        this.e = e;
    }
    
    public d(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final b[] array, @org.jetbrains.annotations.e final l<? super y, String> l) {
        k0.p((Object)e, "name");
        k0.p((Object)array, "checks");
        k0.p((Object)l, "additionalChecks");
        final b[] array2 = new b[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        this(e, null, null, l, array2);
    }
    
    public d(@org.jetbrains.annotations.e final o o, @org.jetbrains.annotations.e final b[] array, @org.jetbrains.annotations.e final l<? super y, String> l) {
        k0.p((Object)o, "regex");
        k0.p((Object)array, "checks");
        k0.p((Object)l, "additionalChecks");
        final b[] array2 = new b[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        this(null, o, null, l, array2);
    }
    
    @org.jetbrains.annotations.e
    public final c a(@org.jetbrains.annotations.e final y y) {
        k0.p((Object)y, "functionDescriptor");
        final b[] e = this.e;
        final int length = e.length;
        int i = 0;
        while (i < length) {
            final b b = e[i];
            ++i;
            final String a = b.a(y);
            if (a != null) {
                return new c.b(a);
            }
        }
        final String s = (String)this.d.invoke((Object)y);
        if (s != null) {
            return new c.b(s);
        }
        return kotlin.reflect.jvm.internal.impl.util.c.c.b;
    }
    
    public final boolean b(@org.jetbrains.annotations.e final y y) {
        k0.p((Object)y, "functionDescriptor");
        if (this.a != null && !k0.g((Object)((f0)y).getName(), (Object)this.a)) {
            return false;
        }
        if (this.b != null) {
            final String d = ((f0)y).getName().d();
            k0.o((Object)d, "functionDescriptor.name.asString()");
            if (!this.b.i(d)) {
                return false;
            }
        }
        final Collection<e> c = this.c;
        return c == null || c.contains(((f0)y).getName());
    }
}
