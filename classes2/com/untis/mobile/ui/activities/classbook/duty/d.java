// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.duty;

import android.widget.TextView;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.untis.mobile.c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0019\u0010\u0017\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/duty/d;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lkotlin/j2;", "c", "a", "Lcom/untis/mobile/ui/activities/classbook/duty/b;", "classRoleVM", "b", "Landroid/view/View;", "Landroid/view/View;", "f", "()Landroid/view/View;", "view", "", "J", "d", "()J", "periodId", "Lcom/untis/mobile/ui/activities/classbook/duty/b;", "", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "profileId", "<init>", "(Landroid/view/View;Ljava/lang/String;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends RecyclerView$g0
{
    @e
    private final View a;
    @e
    private final String b;
    private final long c;
    private b d;
    
    public d(@e final View a, @e final String b, final long c) {
        k0.p(a, "view");
        k0.p(b, "profileId");
        super(a);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final void a() {
        final RecyclerView recyclerView = (RecyclerView)this.a.findViewById(com.untis.mobile.c.i.Zx);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(((ViewGroup)recyclerView).getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager((RecyclerView$p)layoutManager);
        final b d = this.d;
        if (d != null) {
            recyclerView.setAdapter((RecyclerView$h)new com.untis.mobile.ui.activities.classbook.duty.e(d.a(), this.e(), this.d()));
            return;
        }
        k0.S("classRoleVM");
        throw null;
    }
    
    private final void c() {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.a.findViewById(com.untis.mobile.c.i.by);
        final b d = this.d;
        if (d != null) {
            ((TextView)appCompatTextView).setText((CharSequence)d.b().getDisplayableDescription());
            return;
        }
        k0.S("classRoleVM");
        throw null;
    }
    
    public final void b(@e final b d) {
        k0.p(d, "classRoleVM");
        this.d = d;
        this.c();
        this.a();
    }
    
    public final long d() {
        return this.c;
    }
    
    @e
    public final String e() {
        return this.b;
    }
    
    @e
    public final View f() {
        return this.a;
    }
}
