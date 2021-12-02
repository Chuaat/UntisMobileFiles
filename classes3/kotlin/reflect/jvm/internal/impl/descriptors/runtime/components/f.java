// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;

public final class f implements o
{
    @org.jetbrains.annotations.e
    public static final a c;
    @org.jetbrains.annotations.e
    private final Class<?> a;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a b;
    
    static {
        c = new a(null);
    }
    
    private f(final Class<?> a, final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a b) {
        this.a = a;
        this.b = b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String b() {
        final String name = this.a.getName();
        k0.o((Object)name, "klass.name");
        return k0.C(s.j2(name, '.', '/', false, 4, null), (Object)".class");
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.a c() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b(this.a);
    }
    
    @Override
    public void d(@org.jetbrains.annotations.e final c c, @org.jetbrains.annotations.f final byte[] array) {
        k0.p((Object)c, "visitor");
        c.a.b(this.a, c);
    }
    
    @Override
    public void e(@org.jetbrains.annotations.e final d d, @org.jetbrains.annotations.f final byte[] array) {
        k0.p((Object)d, "visitor");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a.i(this.a, d);
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return o instanceof f && k0.g((Object)this.a, (Object)((f)o).a);
    }
    
    @org.jetbrains.annotations.e
    public final Class<?> f() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(f.class.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final f a(@org.jetbrains.annotations.e final Class<?> clazz) {
            k0.p((Object)clazz, "klass");
            final kotlin.reflect.jvm.internal.impl.load.kotlin.header.b b = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.b();
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a.b(clazz, b);
            final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a n = b.n();
            if (n == null) {
                return null;
            }
            return new f(clazz, n, null);
        }
    }
}
