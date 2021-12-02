// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import com.google.android.material.tabs.TabLayout$i;
import n6.l;
import kotlin.Metadata;
import com.google.android.material.tabs.TabLayout$f;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B*\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/m0;", "Lcom/google/android/material/tabs/TabLayout$f;", "Lcom/google/android/material/tabs/TabLayout$i;", "tab", "Lkotlin/j2;", "g", "p", "i", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onTab", "<init>", "(Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class m0 implements TabLayout$f
{
    @e
    private final l<TabLayout$i, j2> G;
    
    public m0(@e final l<? super TabLayout$i, j2> g) {
        k0.p(g, "onTab");
        this.G = (l<TabLayout$i, j2>)g;
    }
    
    public void g(@f final TabLayout$i tabLayout$i) {
    }
    
    public void i(@f final TabLayout$i tabLayout$i) {
        if (tabLayout$i == null) {
            return;
        }
        this.G.invoke(tabLayout$i);
    }
    
    public void p(@f final TabLayout$i tabLayout$i) {
    }
}
