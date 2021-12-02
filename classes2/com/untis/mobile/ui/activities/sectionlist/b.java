// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.sectionlist;

import kotlin.text.s;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B)\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\r\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013¨\u0006\"" }, d2 = { "Lcom/untis/mobile/ui/activities/sectionlist/b;", "Header", "Row", "", "Lkotlin/j2;", "j", "", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "header", "", "Ljava/util/List;", "b", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "filteredRows", "", "value", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "queryText", "e", "i", "rows", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b<Header, Row>
{
    private Header a;
    @e
    private List<? extends Row> b;
    @e
    private List<? extends Row> c;
    @e
    private String d;
    
    public b(final Header a, @e final List<? extends Row> list, @e final String d) {
        k0.p(list, "rows");
        k0.p(d, "queryText");
        this.a = a;
        this.b = list;
        this.c = list;
        this.d = d;
    }
    
    private final void j() {
        final List<? extends Row> b = this.b;
        final ArrayList<a> c = new ArrayList<a>();
        for (final a next : b) {
            final boolean b2 = next instanceof a;
            int n = 1;
            if (b2) {
                if (next.filter(this.d()) > -1) {
                    n = n;
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                c.add(next);
            }
        }
        this.c = (List<? extends Row>)c;
    }
    
    public final int a() {
        return this.c.size() + 1;
    }
    
    @e
    public final List<Row> b() {
        return (List<Row>)this.c;
    }
    
    public final Header c() {
        return this.a;
    }
    
    @e
    public final String d() {
        return this.d;
    }
    
    @e
    public final List<Row> e() {
        return (List<Row>)this.b;
    }
    
    public final void f(@e final List<? extends Row> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void g(final Header a) {
        this.a = a;
    }
    
    public final void h(@e final String d) {
        k0.p(d, "value");
        if (s.K1(this.d, d, true)) {
            return;
        }
        this.d = d;
        this.j();
    }
    
    public final void i(@e final List<? extends Row> b) {
        k0.p(b, "value");
        this.b = b;
        this.j();
    }
}
