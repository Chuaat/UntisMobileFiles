// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.firebase.model;

import kotlin.Metadata;
import java.util.ArrayList;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/firebase/model/b;", "Ljava/util/ArrayList;", "Lcom/untis/mobile/firebase/model/a;", "Lkotlin/collections/ArrayList;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends ArrayList<a>
{
    public /* bridge */ boolean b(final a o) {
        return super.contains(o);
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof a && this.b((a)o);
    }
    
    public /* bridge */ int f() {
        return super.size();
    }
    
    public /* bridge */ int i(final a o) {
        return super.indexOf(o);
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof a)) {
            return -1;
        }
        return this.i((a)o);
    }
    
    public /* bridge */ int l(final a o) {
        return super.lastIndexOf(o);
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof a)) {
            return -1;
        }
        return this.l((a)o);
    }
    
    public final /* bridge */ a m(final int n) {
        return this.q(n);
    }
    
    public /* bridge */ boolean n(final a o) {
        return super.remove(o);
    }
    
    public /* bridge */ a q(final int index) {
        return super.remove(index);
    }
    
    @Override
    public final /* bridge */ boolean remove(final Object o) {
        return o instanceof a && this.n((a)o);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.f();
    }
}
