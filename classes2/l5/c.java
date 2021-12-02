// 
// Decompiled by Procyon v0.5.36
// 

package l5;

import android.widget.TextView;
import android.view.View$OnClickListener;
import kotlin.text.s;
import java.util.Objects;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.j2;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\u000e" }, d2 = { "Ll5/c;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "school", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlin/j2;", "onSchool", "b", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends RecyclerView$g0
{
    public c(@e final View view) {
        k0.p(view, "view");
        super(view);
    }
    
    private static final void c(final l l, final SchoolSearchSchool schoolSearchSchool, final View view) {
        k0.p(l, "$onSchool");
        k0.p(schoolSearchSchool, "$school");
        l.invoke(schoolSearchSchool);
    }
    
    public final void b(@e final SchoolSearchSchool schoolSearchSchool, @e final l<? super SchoolSearchSchool, j2> l) {
        k0.p(schoolSearchSchool, "school");
        k0.p(l, "onSchool");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)super.itemView.findViewById(2131298274);
        final String displayName = schoolSearchSchool.getDisplayName();
        Objects.requireNonNull(displayName, "null cannot be cast to non-null type kotlin.CharSequence");
        ((TextView)appCompatTextView).setText((CharSequence)s.B5((CharSequence)displayName).toString());
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)super.itemView.findViewById(2131298273);
        final String address = schoolSearchSchool.getAddress();
        Objects.requireNonNull(address, "null cannot be cast to non-null type kotlin.CharSequence");
        ((TextView)appCompatTextView2).setText((CharSequence)s.B5((CharSequence)address).toString());
        super.itemView.setOnClickListener((View$OnClickListener)new b((l)l, schoolSearchSchool));
    }
}
