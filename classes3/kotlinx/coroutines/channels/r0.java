// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import m6.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.f2;
import m6.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0011\b\u0087@\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\r B\u0016\b\u0000\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u00f8\u0001\u0000¢\u0006\u0004\b \u0010\u0017J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00108F@\u0006¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\f\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001c\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\u00028\u00008F@\u0006¢\u0006\f\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001d\u0010\u0017\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!" }, d2 = { "Lkotlinx/coroutines/channels/r0;", "T", "", "", "m", "(Ljava/lang/Object;)Ljava/lang/String;", "", "k", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "holder", "", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getCloseCause$annotations", "()V", "closeCause", "j", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValueOrNull$annotations", "valueOrNull", "l", "(Ljava/lang/Object;)Z", "isClosed", "h", "getValue$annotations", "value", "b", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@e
@f2
public final class r0<T>
{
    @org.jetbrains.annotations.e
    public static final b b;
    private final Object a = a;
    
    static {
        b = new b(null);
    }
    
    @org.jetbrains.annotations.e
    public static Object b(@f final Object o) {
        return o;
    }
    
    public static boolean c(final Object o, final Object o2) {
        return o2 instanceof r0 && k0.g(o, ((r0)o2).n());
    }
    
    public static final boolean d(final Object o, final Object o2) {
        return k0.g(o, o2);
    }
    
    @f
    public static final Throwable f(final Object o) {
        if (o instanceof a) {
            return ((a)o).a;
        }
        throw new IllegalStateException("Channel was not closed".toString());
    }
    
    public static final T h(final Object o) {
        if (!(o instanceof a)) {
            return (T)o;
        }
        throw new IllegalStateException("Channel was closed".toString());
    }
    
    @f
    public static final T j(final Object o) {
        Object o2 = o;
        if (o instanceof a) {
            o2 = null;
        }
        return (T)o2;
    }
    
    public static int k(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public static final boolean l(final Object o) {
        return o instanceof a;
    }
    
    @org.jetbrains.annotations.e
    public static String m(final Object obj) {
        String s;
        if (obj instanceof a) {
            s = obj.toString();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Value(");
            sb.append(obj);
            sb.append(')');
            s = sb.toString();
        }
        return s;
    }
    
    @Override
    public boolean equals(final Object o) {
        return c(this.a, o);
    }
    
    @Override
    public int hashCode() {
        return k(this.a);
    }
    
    public final /* synthetic */ Object n() {
        return this.a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return m(this.a);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "kotlinx/coroutines/channels/r0$a", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a
    {
        @d
        @f
        public final Throwable a;
        
        public a(@f final Throwable a) {
            this.a = a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return o instanceof a && k0.g((Object)this.a, (Object)((a)o).a);
        }
        
        @Override
        public int hashCode() {
            final Throwable a = this.a;
            int hashCode;
            if (a != null) {
                hashCode = a.hashCode();
            }
            else {
                hashCode = 0;
            }
            return hashCode;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Closed(");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0080\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0080\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\r" }, d2 = { "kotlinx/coroutines/channels/r0$b", "", "E", "value", "Lkotlinx/coroutines/channels/r0;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class b
    {
        private b() {
        }
        
        @org.jetbrains.annotations.e
        public final <E> Object a(@f final Throwable t) {
            return r0.b(new a(t));
        }
        
        @org.jetbrains.annotations.e
        public final <E> Object b(final E e) {
            return r0.b(e);
        }
    }
}
