// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period.messenger;

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
import n6.p;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.messenger.MessengerChannelCandidate;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00126\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\"" }, d2 = { "Lcom/untis/mobile/ui/activities/period/messenger/n;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/ui/activities/period/messenger/l;", "", "getItemCount", "Landroid/view/ViewGroup;", "parent", "viewType", "k", "viewHolder", "position", "Lkotlin/j2;", "i", "", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelCandidate;", "a", "Ljava/util/List;", "linkables", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "", "Lkotlin/t0;", "name", "channelName", "channelId", "onConnectChannelClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/p;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class n extends RecyclerView$h<l>
{
    @e
    private final List<MessengerChannelCandidate> a;
    @e
    private final p<String, String, j2> b;
    private final LayoutInflater c;
    
    public n(@e final Context context, @e final List<MessengerChannelCandidate> a, @e final p<? super String, ? super String, j2> b) {
        k0.p(context, "context");
        k0.p(a, "linkables");
        k0.p(b, "onConnectChannelClick");
        this.a = a;
        this.b = (p<String, String, j2>)b;
        this.c = LayoutInflater.from(context.getApplicationContext());
    }
    
    private static final void j(final n n, final MessengerChannelCandidate messengerChannelCandidate, final View view) {
        k0.p(n, "this$0");
        k0.p(messengerChannelCandidate, "$channel");
        n.b.invoke(messengerChannelCandidate.getTitle(), messengerChannelCandidate.getChannelId());
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void i(@e final l l, final int n) {
        k0.p(l, "viewHolder");
        final MessengerChannelCandidate messengerChannelCandidate = this.a.get(n);
        ((TextView)l.itemView.findViewById(com.untis.mobile.c.i.hz)).setText((CharSequence)messengerChannelCandidate.getTitle());
        ((TextView)l.itemView.findViewById(com.untis.mobile.c.i.gz)).setText((CharSequence)messengerChannelCandidate.getSubtitle());
        l.itemView.setOnClickListener((View$OnClickListener)new m(this, messengerChannelCandidate));
    }
    
    @e
    public l k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131493216, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_linkable_messenger_channel, parent, false)");
        return new l(inflate);
    }
}
