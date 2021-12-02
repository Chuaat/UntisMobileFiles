// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.comparisons;

import kotlin.jvm.internal.k0;
import kotlin.Metadata;
import java.util.Comparator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0005\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u000b" }, d2 = { "Lkotlin/comparisons/e;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "a", "b", "", "reversed", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class e implements Comparator<Comparable<? super Object>>
{
    @org.jetbrains.annotations.e
    public static final e G;
    
    static {
        G = new e();
    }
    
    private e() {
    }
    
    public int a(@org.jetbrains.annotations.e final Comparable<Object> comparable, @org.jetbrains.annotations.e final Comparable<Object> comparable2) {
        k0.p(comparable, "a");
        k0.p(comparable2, "b");
        return comparable.compareTo(comparable2);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final Comparator<Comparable<Object>> reversed() {
        return (Comparator<Comparable<Object>>)f.G;
    }
}
