// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.collections.v;
import org.jetbrains.annotations.f;
import kotlin.reflect.w;
import kotlin.reflect.s;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;
import kotlin.reflect.t;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B)\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010 \u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001c\u0010\u0014\u001a\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028V@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\u00020\r8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010(\u001a\u00020\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006-" }, d2 = { "Lkotlin/jvm/internal/s1;", "Lkotlin/reflect/t;", "", "Lkotlin/reflect/s;", "upperBounds", "Lkotlin/j2;", "b", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/w;", "J", "Lkotlin/reflect/w;", "v", "()Lkotlin/reflect/w;", "variance", "getUpperBounds", "()Ljava/util/List;", "getUpperBounds$annotations", "()V", "H", "Ljava/lang/Object;", "container", "I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "G", "Ljava/util/List;", "bounds", "K", "Z", "r", "()Z", "isReified", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/w;Z)V", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.4")
public final class s1 implements t
{
    @e
    public static final a L;
    private volatile List<? extends s> G;
    private final Object H;
    @e
    private final String I;
    @e
    private final w J;
    private final boolean K;
    
    static {
        L = new a(null);
    }
    
    public s1(@f final Object h, @e final String i, @e final w j, final boolean k) {
        k0.p(i, "name");
        k0.p(j, "variance");
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public final void b(@e final List<? extends s> g) {
        k0.p(g, "upperBounds");
        if (this.G == null) {
            this.G = g;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Upper bounds of type parameter '");
        sb.append(this);
        sb.append("' have already been initialized.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof s1) {
            final Object h = this.H;
            final s1 s1 = (s1)o;
            if (k0.g(h, s1.H) && k0.g(this.getName(), s1.getName())) {
                return true;
            }
        }
        return false;
    }
    
    @e
    @Override
    public String getName() {
        return this.I;
    }
    
    @e
    @Override
    public List<s> getUpperBounds() {
        List<? extends s> g = this.G;
        if (g == null) {
            g = v.k(k1.l(Object.class));
            this.G = g;
        }
        return (List<s>)g;
    }
    
    @Override
    public int hashCode() {
        final Object h = this.H;
        int hashCode;
        if (h != null) {
            hashCode = h.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.getName().hashCode();
    }
    
    @Override
    public boolean r() {
        return this.K;
    }
    
    @e
    @Override
    public String toString() {
        return s1.L.a(this);
    }
    
    @e
    @Override
    public w v() {
        return this.J;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "kotlin/jvm/internal/s1$a", "", "Lkotlin/reflect/t;", "typeParameter", "", "a", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final String a(@e final t t) {
            k0.p(t, "typeParameter");
            final StringBuilder sb = new StringBuilder();
            final int n = r1.a[t.v().ordinal()];
            Label_0061: {
                String str;
                if (n != 2) {
                    if (n != 3) {
                        break Label_0061;
                    }
                    str = "out ";
                }
                else {
                    str = "in ";
                }
                sb.append(str);
            }
            sb.append(t.getName());
            final String string = sb.toString();
            k0.o(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }
}
