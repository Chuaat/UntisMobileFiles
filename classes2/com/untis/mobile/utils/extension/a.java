// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004" }, d2 = { "Landroidx/recyclerview/widget/RecyclerView$h;", "", "position", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    public static final int a(@e final RecyclerView$h<?> recyclerView$h, final int n) {
        k0.p(recyclerView$h, "<this>");
        return h.U(n < recyclerView$h.getItemCount() - 1, 0, 1, null);
    }
}
