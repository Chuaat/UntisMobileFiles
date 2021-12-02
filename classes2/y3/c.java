// 
// Decompiled by Procyon v0.5.36
// 

package y3;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nR\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "Ly3/c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Ly3/a;", "errors", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends Exception
{
    @e
    private final List<a> G;
    
    public c(@e final List<a> g) {
        k0.p(g, "errors");
        this.G = g;
    }
    
    @e
    public final List<a> a() {
        return this.G;
    }
}
