// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Member;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

final class a
{
    @e
    public static final a a;
    @f
    private static a b;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    @e
    public final a a(@e final Member member) {
        k0.p((Object)member, "member");
        final Class<? extends Member> class1 = member.getClass();
        try {
            return new a(class1.getMethod("getParameters", (Class<?>[])new Class[0]), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.g(class1).loadClass("java.lang.reflect.Parameter").getMethod("getName", (Class<?>[])new Class[0]));
        }
        catch (NoSuchMethodException ex) {
            return new a(null, null);
        }
    }
    
    @f
    public final List<String> b(@e final Member obj) {
        k0.p((Object)obj, "member");
        a b;
        if ((b = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.b) == null) {
            b = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.b = this.a(obj));
        }
        final Method b2 = b.b();
        if (b2 == null) {
            return null;
        }
        final Method a = b.a();
        if (a == null) {
            return null;
        }
        final Object invoke = b2.invoke(obj, new Object[0]);
        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        final Object[] array = (Object[])invoke;
        final ArrayList list = new ArrayList<String>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            final Object invoke2 = a.invoke(array[i], new Object[0]);
            Objects.requireNonNull(invoke2, "null cannot be cast to non-null type kotlin.String");
            list.add((String)invoke2);
        }
        return (List<String>)list;
    }
    
    public static final class a
    {
        @f
        private final Method a;
        @f
        private final Method b;
        
        public a(@f final Method a, @f final Method b) {
            this.a = a;
            this.b = b;
        }
        
        @f
        public final Method a() {
            return this.b;
        }
        
        @f
        public final Method b() {
            return this.a;
        }
    }
}
