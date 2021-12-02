// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.util.Iterator;
import kotlin.j2;
import n6.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k0;
import androidx.annotation.y;
import org.jetbrains.annotations.e;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@c0
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B!\u0012\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)\u0012\b\b\u0001\u00101\u001a\u00020\u0011¢\u0006\u0004\b2\u00103J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u001f\u0010\u0010\u001a\u00020\b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\u000f\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R$\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u0019\u00101\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100¨\u00064" }, d2 = { "Landroidx/navigation/b0;", "Landroidx/navigation/a0;", "D", "", "", "name", "Lkotlin/Function1;", "Landroidx/navigation/p;", "Lkotlin/j2;", "Lkotlin/s;", "argumentBuilder", "b", "uriPattern", "d", "Landroidx/navigation/x;", "navDeepLink", "e", "", "actionId", "Landroidx/navigation/k;", "actionBuilder", "a", "c", "()Landroidx/navigation/a0;", "", "Landroidx/navigation/j;", "Ljava/util/Map;", "actions", "Landroidx/navigation/o;", "arguments", "", "Ljava/lang/CharSequence;", "g", "()Ljava/lang/CharSequence;", "i", "(Ljava/lang/CharSequence;)V", "label", "", "Landroidx/navigation/u;", "Ljava/util/List;", "deepLinks", "Landroidx/navigation/u0;", "Landroidx/navigation/u0;", "h", "()Landroidx/navigation/u0;", "navigator", "f", "I", "()I", "id", "<init>", "(Landroidx/navigation/u0;I)V", "navigation-common-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public class b0<D extends a0>
{
    @f
    private CharSequence a;
    private Map<String, o> b;
    private List<u> c;
    private Map<Integer, j> d;
    @e
    private final u0<? extends D> e;
    private final int f;
    
    public b0(@e final u0<? extends D> e, @y final int f) {
        k0.q((Object)e, "navigator");
        this.e = e;
        this.f = f;
        this.b = new LinkedHashMap<String, o>();
        this.c = new ArrayList<u>();
        this.d = new LinkedHashMap<Integer, j>();
    }
    
    public final void a(final int i, @e final l<? super k, j2> l) {
        k0.q((Object)l, "actionBuilder");
        final Map<Integer, j> d = this.d;
        final k k = new k();
        l.invoke((Object)k);
        d.put(i, k.a());
    }
    
    public final void b(@e final String s, @e final l<? super p, j2> l) {
        k0.q((Object)s, "name");
        k0.q((Object)l, "argumentBuilder");
        final Map<String, o> b = this.b;
        final p p2 = new p();
        l.invoke((Object)p2);
        b.put(s, p2.a());
    }
    
    @e
    public D c() {
        final D a = (D)this.e.a();
        a.F(this.f);
        a.G(this.a);
        for (final Map.Entry<String, o> entry : this.b.entrySet()) {
            a.b(entry.getKey(), entry.getValue());
        }
        final Iterator<u> iterator2 = this.c.iterator();
        while (iterator2.hasNext()) {
            a.f(iterator2.next());
        }
        for (final Map.Entry<Integer, j> entry2 : this.d.entrySet()) {
            a.C(entry2.getKey().intValue(), entry2.getValue());
        }
        return a;
    }
    
    public final void d(@e final String s) {
        k0.q((Object)s, "uriPattern");
        this.c.add(new u(s));
    }
    
    public final void e(@e final l<? super x, j2> l) {
        k0.q((Object)l, "navDeepLink");
        final List<u> c = this.c;
        final x x = new x();
        l.invoke((Object)x);
        c.add(x.a());
    }
    
    public final int f() {
        return this.f;
    }
    
    @f
    public final CharSequence g() {
        return this.a;
    }
    
    @e
    protected final u0<? extends D> h() {
        return this.e;
    }
    
    public final void i(@f final CharSequence a) {
        this.a = a;
    }
}
