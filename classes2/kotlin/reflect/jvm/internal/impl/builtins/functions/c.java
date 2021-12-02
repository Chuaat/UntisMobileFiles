// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.functions;

import m6.k;
import org.jetbrains.annotations.f;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;

public enum c
{
    @e
    public static final a I;
    
    J(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function"), 
    K(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE, "SuspendFunction"), 
    L(kotlin_REFLECT_FQ_NAME, "KFunction"), 
    M(kotlin_REFLECT_FQ_NAME, "KSuspendFunction");
    
    @e
    private final b G;
    @e
    private final String H;
    
    static {
        final b kotlin_REFLECT_FQ_NAME = StandardNames.KOTLIN_REFLECT_FQ_NAME;
        I = new a(null);
    }
    
    private c(final b g, final String h) {
        this.G = g;
        this.H = h;
    }
    
    @e
    public final String b() {
        return this.H;
    }
    
    @e
    public final b d() {
        return this.G;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e f(final int i) {
        final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i(k0.C(this.H, i));
        k0.o(j, "identifier(\"$classNamePrefix$arity\")");
        return j;
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final Integer d(final String s) {
            if (s.length() == 0) {
                return null;
            }
            final int length = s.length();
            int i = 0;
            int j = 0;
            while (i < length) {
                int char1 = s.charAt(i);
                final int n = i + 1;
                char1 -= 48;
                if (char1 < 0 || char1 > 9) {
                    return null;
                }
                j = j * 10 + char1;
                i = n;
            }
            return j;
        }
        
        @f
        public final c a(@e final b b, @e final String s) {
            k0.p(b, "packageFqName");
            k0.p(s, "className");
            final c[] values = c.values();
            final int length = values.length;
            int n = 0;
            c c;
            while (true) {
                c = null;
                if (n >= length) {
                    break;
                }
                c = values[n];
                if (k0.g(c.d(), b) && s.u2(s, c.b(), false, 2, (Object)null)) {
                    break;
                }
                ++n;
            }
            return c;
        }
        
        @k
        @f
        public final c b(@e final String s, @e final b b) {
            k0.p(s, "className");
            k0.p(b, "packageFqName");
            final c.a.a c = this.c(s, b);
            c c2;
            if (c == null) {
                c2 = null;
            }
            else {
                c2 = c.c();
            }
            return c2;
        }
        
        @f
        public final c.a.a c(@e String substring, @e final b b) {
            k0.p(substring, "className");
            k0.p(b, "packageFqName");
            final c a = this.a(b, substring);
            if (a == null) {
                return null;
            }
            substring = substring.substring(a.b().length());
            k0.o(substring, "(this as java.lang.String).substring(startIndex)");
            final Integer d = this.d(substring);
            if (d == null) {
                return null;
            }
            return new c.a.a(a, d);
        }
        
        public static final class a
        {
            @e
            private final c a;
            private final int b;
            
            public a(@e final c a, final int b) {
                k0.p(a, "kind");
                this.a = a;
                this.b = b;
            }
            
            @e
            public final c a() {
                return this.a;
            }
            
            public final int b() {
                return this.b;
            }
            
            @e
            public final c c() {
                return this.a;
            }
            
            @Override
            public boolean equals(@f final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof a)) {
                    return false;
                }
                final a a = (a)o;
                return this.a == a.a && this.b == a.b;
            }
            
            @Override
            public int hashCode() {
                return this.a.hashCode() * 31 + this.b;
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("KindWithArity(kind=");
                sb.append(this.a);
                sb.append(", arity=");
                sb.append(this.b);
                sb.append(')');
                return sb.toString();
            }
        }
    }
}
