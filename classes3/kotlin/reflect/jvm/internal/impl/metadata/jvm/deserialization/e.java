// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;

public abstract class e
{
    private e() {
    }
    
    @org.jetbrains.annotations.e
    public abstract String a();
    
    @org.jetbrains.annotations.e
    public abstract String b();
    
    @org.jetbrains.annotations.e
    public abstract String c();
    
    @org.jetbrains.annotations.e
    @Override
    public final String toString() {
        return this.a();
    }
    
    public static final class a extends e
    {
        @org.jetbrains.annotations.e
        private final String a;
        @org.jetbrains.annotations.e
        private final String b;
        
        public a(@org.jetbrains.annotations.e final String a, @org.jetbrains.annotations.e final String b) {
            k0.p((Object)a, "name");
            k0.p((Object)b, "desc");
            super(null);
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.c());
            sb.append(':');
            sb.append(this.b());
            return sb.toString();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String c() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final String d() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final String e() {
            return this.b;
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
            return k0.g((Object)this.a, (Object)a.a) && k0.g((Object)this.b, (Object)a.b);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }
    }
    
    public static final class b extends e
    {
        @org.jetbrains.annotations.e
        private final String a;
        @org.jetbrains.annotations.e
        private final String b;
        
        public b(@org.jetbrains.annotations.e final String a, @org.jetbrains.annotations.e final String b) {
            k0.p((Object)a, "name");
            k0.p((Object)b, "desc");
            super(null);
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            return k0.C(this.c(), (Object)this.b());
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String c() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return k0.g((Object)this.a, (Object)b.a) && k0.g((Object)this.b, (Object)b.b);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }
    }
}
