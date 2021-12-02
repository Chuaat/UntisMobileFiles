// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.common;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;
import androidx.appcompat.widget.SearchView$l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B*\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/ui/activities/common/a;", "Landroidx/appcompat/widget/SearchView$l;", "", "queryText", "", "onQueryTextSubmit", "onQueryTextChange", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlin/j2;", "onSearchQueryChange", "<init>", "(Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements SearchView$l
{
    @e
    private final l<String, j2> a;
    
    public a(@e final l<? super String, j2> a) {
        k0.p(a, "onSearchQueryChange");
        this.a = (l<String, j2>)a;
    }
    
    public boolean onQueryTextChange(@f final String s) {
        final l<String, j2> a = this.a;
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        a.invoke(s2);
        return true;
    }
    
    public boolean onQueryTextSubmit(@f final String s) {
        final l<String, j2> a = this.a;
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        a.invoke(s2);
        return true;
    }
}
