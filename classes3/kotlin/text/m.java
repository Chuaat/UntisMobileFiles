// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017" }, d2 = { "Lkotlin/text/m;", "", "next", "", "", "b", "()Ljava/util/List;", "groupValues", "Lkotlin/text/k;", "c", "()Lkotlin/text/k;", "groups", "getValue", "()Ljava/lang/String;", "value", "Lkotlin/ranges/k;", "d", "()Lkotlin/ranges/k;", "range", "Lkotlin/text/m$b;", "a", "()Lkotlin/text/m$b;", "destructured", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public interface m
{
    @e
    b a();
    
    @e
    List<String> b();
    
    @e
    k c();
    
    @e
    kotlin.ranges.k d();
    
    @e
    String getValue();
    
    @f
    m next();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
        @e
        public static b a(@e final m m) {
            return new b(m);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0087\nJ\t\u0010\u0004\u001a\u00020\u0002H\u0087\nJ\t\u0010\u0005\u001a\u00020\u0002H\u0087\nJ\t\u0010\u0006\u001a\u00020\u0002H\u0087\nJ\t\u0010\u0007\u001a\u00020\u0002H\u0087\nJ\t\u0010\b\u001a\u00020\u0002H\u0087\nJ\t\u0010\t\u001a\u00020\u0002H\u0087\nJ\t\u0010\n\u001a\u00020\u0002H\u0087\nJ\t\u0010\u000b\u001a\u00020\u0002H\u0087\nJ\t\u0010\f\u001a\u00020\u0002H\u0087\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rR\u0019\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "kotlin/text/m$b", "", "", "a", "c", "d", "e", "f", "g", "h", "i", "j", "b", "", "l", "Lkotlin/text/m;", "Lkotlin/text/m;", "k", "()Lkotlin/text/m;", "match", "<init>", "(Lkotlin/text/m;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        @e
        private final m a;
        
        public b(@e final m a) {
            k0.p((Object)a, "match");
            this.a = a;
        }
        
        @kotlin.internal.f
        private final String a() {
            return this.k().b().get(1);
        }
        
        @kotlin.internal.f
        private final String b() {
            return this.k().b().get(10);
        }
        
        @kotlin.internal.f
        private final String c() {
            return this.k().b().get(2);
        }
        
        @kotlin.internal.f
        private final String d() {
            return this.k().b().get(3);
        }
        
        @kotlin.internal.f
        private final String e() {
            return this.k().b().get(4);
        }
        
        @kotlin.internal.f
        private final String f() {
            return this.k().b().get(5);
        }
        
        @kotlin.internal.f
        private final String g() {
            return this.k().b().get(6);
        }
        
        @kotlin.internal.f
        private final String h() {
            return this.k().b().get(7);
        }
        
        @kotlin.internal.f
        private final String i() {
            return this.k().b().get(8);
        }
        
        @kotlin.internal.f
        private final String j() {
            return this.k().b().get(9);
        }
        
        @e
        public final m k() {
            return this.a;
        }
        
        @e
        public final List<String> l() {
            return this.a.b().subList(1, this.a.b().size());
        }
    }
}
