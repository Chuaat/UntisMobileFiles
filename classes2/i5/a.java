// 
// Decompiled by Procyon v0.5.36
// 

package i5;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.error.WebUntisError;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u0014" }, d2 = { "Li5/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Li5/b;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "getItemCount", "viewHolder", "position", "Lkotlin/j2;", "h", "Landroid/content/Context;", "context", "", "Lcom/untis/mobile/persistence/models/error/WebUntisError;", "errors", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$h<b>
{
    @e
    private final List<WebUntisError> a;
    private final LayoutInflater b;
    
    public a(@e final Context context, @e final List<WebUntisError> a) {
        k0.p(context, "context");
        k0.p(a, "errors");
        this.a = a;
        this.b = LayoutInflater.from(context.getApplicationContext());
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void h(@e final b b, int zd) {
        k0.p(b, "viewHolder");
        final WebUntisError webUntisError = this.a.get(zd);
        ((TextView)b.itemView.findViewById(c.i.AD)).setText((CharSequence)webUntisError.getTitle());
        final View itemView = b.itemView;
        zd = c.i.zD;
        ((TextView)itemView.findViewById(zd)).setText((CharSequence)webUntisError.getDescription());
        final AppCompatTextView appCompatTextView = (AppCompatTextView)b.itemView.findViewById(zd);
        k0.o(appCompatTextView, "viewHolder.itemView.item_webuntis_error_subtitle");
        h.X(appCompatTextView);
    }
    
    @e
    public b i(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.b.inflate(2131493266, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_webuntis_error, parent, false)");
        return new b(inflate);
    }
}
