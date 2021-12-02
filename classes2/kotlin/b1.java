// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import m6.d;
import m6.g;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import m6.e;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087@\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002 \u001eB\u0016\b\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0005J\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u00d6\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001d\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!" }, d2 = { "Lkotlin/b1;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", "", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "j", "(Ljava/lang/Object;)Z", "isSuccess", "G", "Ljava/lang/Object;", "getValue$annotations", "()V", "value", "i", "isFailure", "b", "H", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e
@e1(version = "1.3")
public final class b1<T> implements Serializable
{
    @org.jetbrains.annotations.e
    public static final a H;
    @f
    private final Object G = g;
    
    static {
        H = new a(null);
    }
    
    @y0
    @org.jetbrains.annotations.e
    public static Object b(@f final Object o) {
        return o;
    }
    
    public static boolean c(final Object o, final Object o2) {
        return o2 instanceof b1 && k0.g(o, ((b1)o2).l());
    }
    
    public static final boolean d(final Object o, final Object o2) {
        return k0.g(o, o2);
    }
    
    @f
    public static final Throwable e(final Object o) {
        Throwable g;
        if (o instanceof b) {
            g = ((b)o).G;
        }
        else {
            g = null;
        }
        return g;
    }
    
    @kotlin.internal.f
    private static final T f(final Object o) {
        Object o2 = o;
        if (i(o)) {
            o2 = null;
        }
        return (T)o2;
    }
    
    public static int h(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public static final boolean i(final Object o) {
        return o instanceof b;
    }
    
    public static final boolean j(final Object o) {
        return o instanceof b ^ true;
    }
    
    @org.jetbrains.annotations.e
    public static String k(final Object obj) {
        String s;
        if (obj instanceof b) {
            s = obj.toString();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Success(");
            sb.append(obj);
            sb.append(')');
            s = sb.toString();
        }
        return s;
    }
    
    @Override
    public boolean equals(final Object o) {
        return c(this.G, o);
    }
    
    @Override
    public int hashCode() {
        return h(this.G);
    }
    
    public final /* synthetic */ Object l() {
        return this.G;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return k(this.G);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "kotlin/b1$a", "", "T", "value", "Lkotlin/b1;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @kotlin.internal.f
        @g(name = "failure")
        private final <T> Object a(final Throwable t) {
            return b1.b(c1.a(t));
        }
        
        @kotlin.internal.f
        @g(name = "success")
        private final <T> Object b(final T t) {
            return b1.b(t);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "kotlin/b1$b", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "G", "Ljava/lang/Throwable;", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class b implements Serializable
    {
        @d
        @org.jetbrains.annotations.e
        public final Throwable G;
        
        public b(@org.jetbrains.annotations.e final Throwable g) {
            k0.p(g, "exception");
            this.G = g;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return o instanceof b && k0.g(this.G, ((b)o).G);
        }
        
        @Override
        public int hashCode() {
            return this.G.hashCode();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failure(");
            sb.append(this.G);
            sb.append(')');
            return sb.toString();
        }
    }
}
