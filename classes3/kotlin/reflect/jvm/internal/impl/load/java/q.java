// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.structure.u;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import org.jetbrains.annotations.e;

public interface q
{
    @f
    g a(@e final a p0);
    
    @f
    u b(@e final b p0);
    
    @f
    Set<String> c(@e final b p0);
    
    public static final class a
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.name.a a;
        @f
        private final byte[] b;
        @f
        private final g c;
        
        public a(@e final kotlin.reflect.jvm.internal.impl.name.a a, @f final byte[] b, @f final g c) {
            k0.p((Object)a, "classId");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a a() {
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
            return k0.g((Object)this.a, (Object)a.a) && k0.g((Object)this.b, (Object)a.b) && k0.g((Object)this.c, (Object)a.c);
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final byte[] b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = Arrays.hashCode(b);
            }
            final g c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Request(classId=");
            sb.append(this.a);
            sb.append(", previouslyFoundClassFileContent=");
            sb.append(Arrays.toString(this.b));
            sb.append(", outerClass=");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }
}
