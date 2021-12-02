// 
// Decompiled by Procyon v0.5.36
// 

package l5;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B:\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¨\u0006\u0018" }, d2 = { "Ll5/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ll5/c;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "holder", "position", "Lkotlin/j2;", "h", "getItemCount", "", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "schools", "j", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "school", "onSchool", "<init>", "(Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$h<c>
{
    @e
    private List<SchoolSearchSchool> a;
    @e
    private final l<SchoolSearchSchool, j2> b;
    
    public a(@e final List<SchoolSearchSchool> a, @e final l<? super SchoolSearchSchool, j2> b) {
        k0.p(a, "schools");
        k0.p(b, "onSchool");
        this.a = a;
        this.b = (l<SchoolSearchSchool, j2>)b;
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void h(@e final c c, final int n) {
        k0.p(c, "holder");
        c.b(this.a.get(n), this.b);
    }
    
    @e
    public c i(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493249, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_school, parent, false)");
        return new c(inflate);
    }
    
    public final void j(@e final List<SchoolSearchSchool> a) {
        k0.p(a, "schools");
        this.a = a;
        this.notifyDataSetChanged();
    }
}
