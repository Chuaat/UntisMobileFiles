// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.notifications;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B>\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012'\u0010\u0017\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\r¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/ui/core/notifications/h;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/ui/core/notifications/j;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "holder", "position", "Lkotlin/j2;", "h", "getItemCount", "", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "a", "Ljava/util/List;", "messages", "Lkotlin/Function1;", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "Lkotlin/t0;", "name", "attachments", "onAttachments", "<init>", "(Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends RecyclerView$h<j>
{
    @e
    private final List<MessageOfDay> a;
    @e
    private final l<List<DriveAttachment>, j2> b;
    
    public h(@e final List<MessageOfDay> a, @e final l<? super List<DriveAttachment>, j2> b) {
        k0.p(a, "messages");
        k0.p(b, "onAttachments");
        this.a = a;
        this.b = (l<List<DriveAttachment>, j2>)b;
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void h(@e final j j, final int n) {
        k0.p(j, "holder");
        j.b(this.a.get(n), this.b);
    }
    
    @e
    public j i(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493217, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_message_of_day, parent, false)");
        return new j(inflate);
    }
}
