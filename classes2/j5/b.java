// 
// Decompiled by Procyon v0.5.36
// 

package j5;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000b0\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u0019" }, d2 = { "Lj5/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "container", "", "type", "k", "getItemCount", "viewHolder", "position", "Lkotlin/j2;", "i", "Landroid/content/Context;", "context", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profiles", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "profile", "onProfileClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final List<Profile> a;
    @e
    private final l<Profile, j2> b;
    private final LayoutInflater c;
    
    public b(@e final Context context, @e final List<Profile> a, @e final l<? super Profile, j2> b) {
        k0.p(context, "context");
        k0.p(a, "profiles");
        k0.p(b, "onProfileClick");
        this.a = a;
        this.b = (l<Profile, j2>)b;
        this.c = LayoutInflater.from(context.getApplicationContext());
    }
    
    private static final void j(final b b, final Profile profile, final View view) {
        k0.p(b, "this$0");
        k0.p(profile, "$profile");
        b.b.invoke(profile);
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void i(@e final o0 o0, final int n) {
        k0.p(o0, "viewHolder");
        final Profile profile = this.a.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Du)).setText((CharSequence)profile.getDisplayableTitle());
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Cu)).setText((CharSequence)profile.getDisplayableDescription());
        o0.itemView.setOnClickListener((View$OnClickListener)new a(this, profile));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "container");
        final View inflate = this.c.inflate(2131493166, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_authenticate_profile, container, false)");
        return new o0(inflate);
    }
}
