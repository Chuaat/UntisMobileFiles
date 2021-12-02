// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import java.util.NoSuchElementException;
import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.BufferedReader;
import kotlin.Metadata;
import kotlin.sequences.m;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lkotlin/io/u;", "Lkotlin/sequences/m;", "", "", "iterator", "Ljava/io/BufferedReader;", "a", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class u implements m<String>
{
    private final BufferedReader a;
    
    public u(@e final BufferedReader a) {
        k0.p(a, "reader");
        this.a = a;
    }
    
    public static final /* synthetic */ BufferedReader c(final u u) {
        return u.a;
    }
    
    @e
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private String G;
            private boolean H;
            final /* synthetic */ u I;
            
            @e
            public String a() {
                if (this.hasNext()) {
                    final String g = this.G;
                    this.G = null;
                    k0.m(g);
                    return g;
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                final String g = this.G;
                boolean b = true;
                if (g == null && !this.H && (this.G = u.c(this.I).readLine()) == null) {
                    this.H = true;
                }
                if (this.G == null) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
