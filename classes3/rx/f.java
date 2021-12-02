// 
// Decompiled by Procyon v0.5.36
// 

package rx;

public final class f<T>
{
    private static final f<Void> d;
    private final a a;
    private final Throwable b;
    private final T c;
    
    static {
        d = new f<Void>(a.I, null, null);
    }
    
    private f(final a a, final T c, final Throwable b) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static <T> f<T> b() {
        return (f<T>)f.d;
    }
    
    @Deprecated
    public static <T> f<T> c(final Class<T> clazz) {
        return (f<T>)f.d;
    }
    
    public static <T> f<T> d(final Throwable t) {
        return new f<T>(a.H, null, t);
    }
    
    public static <T> f<T> e(final T t) {
        return new f<T>(a.G, t, null);
    }
    
    public void a(final h<? super T> h) {
        final a a = this.a;
        if (a == f.a.G) {
            h.m(this.h());
        }
        else if (a == f.a.I) {
            h.c();
        }
        else {
            h.b(this.g());
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o.getClass() != f.class) {
            return false;
        }
        final f f = (f)o;
        boolean b2 = b;
        if (f.f() == this.f()) {
            final T c = this.c;
            final T c2 = f.c;
            if (c != c2) {
                b2 = b;
                if (c == null) {
                    return b2;
                }
                b2 = b;
                if (!c.equals(c2)) {
                    return b2;
                }
            }
            final Throwable b3 = this.b;
            final Throwable b4 = f.b;
            if (b3 != b4) {
                b2 = b;
                if (b3 == null) {
                    return b2;
                }
                b2 = b;
                if (!b3.equals(b4)) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public a f() {
        return this.a;
    }
    
    public Throwable g() {
        return this.b;
    }
    
    public T h() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        final int n = hashCode = this.f().hashCode();
        if (this.j()) {
            hashCode = n * 31 + this.h().hashCode();
        }
        int n2 = hashCode;
        if (this.i()) {
            n2 = hashCode * 31 + this.g().hashCode();
        }
        return n2;
    }
    
    public boolean i() {
        return this.l() && this.b != null;
    }
    
    public boolean j() {
        return this.m() && this.c != null;
    }
    
    public boolean k() {
        return this.f() == f.a.I;
    }
    
    public boolean l() {
        return this.f() == f.a.H;
    }
    
    public boolean m() {
        return this.f() == f.a.G;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(this.f());
        if (this.j()) {
            sb.append(' ');
            sb.append(this.h());
        }
        if (this.i()) {
            sb.append(' ');
            sb.append(this.g().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }
    
    public enum a
    {
        G, 
        H, 
        I;
    }
}
