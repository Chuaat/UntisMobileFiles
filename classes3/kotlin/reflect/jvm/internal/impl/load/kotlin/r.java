// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.h0;
import m6.k;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public final class r
{
    @e
    public static final a b;
    @e
    private final String a;
    
    static {
        b = new a(null);
    }
    
    private r(final String a) {
        this.a = a;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof r && k0.g((Object)this.a, (Object)((r)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MemberSignature(signature=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final r a(@e final String str, @e final String str2) {
            k0.p((Object)str, "name");
            k0.p((Object)str2, "desc");
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(str2);
            return new r(sb.toString(), null);
        }
        
        @k
        @e
        public final r b(@e final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e e) {
            k0.p((Object)e, "signature");
            r r;
            if (e instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.b) {
                r = this.d(e.c(), e.b());
            }
            else {
                if (!(e instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.a)) {
                    throw new h0();
                }
                r = this.a(e.c(), e.b());
            }
            return r;
        }
        
        @k
        @e
        public final r c(@e final c c, @e final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c c2) {
            k0.p((Object)c, "nameResolver");
            k0.p((Object)c2, "signature");
            return this.d(c.getString(c2.z()), c.getString(c2.y()));
        }
        
        @k
        @e
        public final r d(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "desc");
            return new r(k0.C(s, (Object)s2), null);
        }
        
        @k
        @e
        public final r e(@e final r r, final int i) {
            k0.p((Object)r, "signature");
            final StringBuilder sb = new StringBuilder();
            sb.append(r.a());
            sb.append('@');
            sb.append(i);
            return new r(sb.toString(), null);
        }
    }
}
