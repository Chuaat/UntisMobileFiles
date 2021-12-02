// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import kotlin.y0;
import kotlin.h0;
import kotlin.jvm.internal.k0;
import m6.k;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lkotlin/reflect/u;", "", "", "toString", "Lkotlin/reflect/w;", "a", "Lkotlin/reflect/s;", "b", "variance", "type", "d", "", "hashCode", "other", "", "equals", "Lkotlin/reflect/w;", "h", "()Lkotlin/reflect/w;", "Lkotlin/reflect/s;", "g", "()Lkotlin/reflect/s;", "<init>", "(Lkotlin/reflect/w;Lkotlin/reflect/s;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public final class u
{
    @d
    @e
    public static final u c;
    @e
    public static final a d;
    @f
    private final w a;
    @f
    private final s b;
    
    static {
        d = new a(null);
        c = new u(null, null);
    }
    
    public u(@f final w w, @f final s b) {
        this.a = w;
        this.b = b;
        final int n = 1;
        int n2;
        if (w == null == (b == null)) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            String string;
            if (w == null) {
                string = "Star projection must have no type specified.";
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("The projection variance ");
                sb.append(w);
                sb.append(" requires type to be specified.");
                string = sb.toString();
            }
            throw new IllegalArgumentException(string.toString());
        }
    }
    
    @k
    @e
    public static final u c(@e final s s) {
        return u.d.a(s);
    }
    
    @k
    @e
    public static final u f(@e final s s) {
        return u.d.b(s);
    }
    
    @k
    @e
    public static final u i(@e final s s) {
        return u.d.e(s);
    }
    
    @f
    public final w a() {
        return this.a;
    }
    
    @f
    public final s b() {
        return this.b;
    }
    
    @e
    public final u d(@f final w w, @f final s s) {
        return new u(w, s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof u) {
                final u u = (u)o;
                if (k0.g(this.a, u.a) && k0.g(this.b, u.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @f
    public final s g() {
        return this.b;
    }
    
    @f
    public final w h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final w a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final s b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final w a = this.a;
        String s;
        if (a == null) {
            s = "*";
        }
        else {
            final int n = v.a[a.ordinal()];
            if (n != 1) {
                StringBuilder sb;
                String str;
                if (n != 2) {
                    if (n != 3) {
                        throw new h0();
                    }
                    sb = new StringBuilder();
                    str = "out ";
                }
                else {
                    sb = new StringBuilder();
                    str = "in ";
                }
                sb.append(str);
                sb.append(this.b);
                s = sb.toString();
            }
            else {
                s = String.valueOf(this.b);
            }
        }
        return s;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0013\u0010\n\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\u00048\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010" }, d2 = { "kotlin/reflect/u$a", "", "Lkotlin/reflect/s;", "type", "Lkotlin/reflect/u;", "e", "a", "b", "c", "()Lkotlin/reflect/u;", "STAR", "star", "Lkotlin/reflect/u;", "getStar$annotations", "()V", "<init>", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final u a(@e final s s) {
            k0.p(s, "type");
            return new u(w.H, s);
        }
        
        @k
        @e
        public final u b(@e final s s) {
            k0.p(s, "type");
            return new u(w.I, s);
        }
        
        @e
        public final u c() {
            return u.c;
        }
        
        @k
        @e
        public final u e(@e final s s) {
            k0.p(s, "type");
            return new u(w.G, s);
        }
    }
}
