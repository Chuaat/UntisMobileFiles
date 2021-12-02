// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.duty;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/duty/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/ui/activities/classbook/duty/a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "getItemCount", "holder", "position", "Lkotlin/j2;", "h", "", "b", "Ljava/lang/String;", "profileId", "", "Lcom/untis/mobile/persistence/models/classbook/duty/ClassRole;", "a", "Ljava/util/List;", "classRoles", "", "c", "J", "periodId", "<init>", "(Ljava/util/List;Ljava/lang/String;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e extends RecyclerView$h<a>
{
    @org.jetbrains.annotations.e
    private final List<ClassRole> a;
    @org.jetbrains.annotations.e
    private final String b;
    private final long c;
    
    public e(@org.jetbrains.annotations.e final List<ClassRole> a, @org.jetbrains.annotations.e final String b, final long c) {
        k0.p(a, "classRoles");
        k0.p(b, "profileId");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void h(@org.jetbrains.annotations.e final a a, final int n) {
        k0.p(a, "holder");
        a.b(this.a.get(n));
    }
    
    @org.jetbrains.annotations.e
    public a i(@org.jetbrains.annotations.e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493168, viewGroup, false);
        k0.o(inflate, "classRoleItem");
        return new a(inflate, this.c, this.b);
    }
}
