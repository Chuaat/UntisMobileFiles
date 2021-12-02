// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation.parents.adapter;

import android.widget.ImageView;
import com.untis.mobile.messages.data.model.extension.ReadConfirmationStateExtKt;
import androidx.core.content.d;
import android.widget.TextView;
import com.untis.mobile.c;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.k0;
import androidx.recyclerview.widget.RecyclerView$g0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.ReadConfirmationState;
import java.util.ArrayList;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/adapter/ReadConfirmationParentsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/adapter/ReadConfirmationParentsListAdapter$ReadConfirmationRecipientViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "getItemCount", "", "Lcom/untis/mobile/messages/data/model/ReadConfirmationState;", "newList", "submitList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parentsList", "Ljava/util/ArrayList;", "<init>", "()V", "ReadConfirmationRecipientViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ReadConfirmationParentsListAdapter extends RecyclerView$h<ReadConfirmationRecipientViewHolder>
{
    @e
    private final ArrayList<ReadConfirmationState> parentsList;
    
    public ReadConfirmationParentsListAdapter() {
        this.parentsList = new ArrayList<ReadConfirmationState>();
    }
    
    public int getItemCount() {
        return this.parentsList.size();
    }
    
    public void onBindViewHolder(@e final ReadConfirmationRecipientViewHolder readConfirmationRecipientViewHolder, final int index) {
        k0.p(readConfirmationRecipientViewHolder, "holder");
        final ReadConfirmationState value = this.parentsList.get(index);
        k0.o(value, "parentsList[position]");
        readConfirmationRecipientViewHolder.bind(value);
    }
    
    @e
    public ReadConfirmationRecipientViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493242, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_read_confirmation_recipient, parent, false)");
        return new ReadConfirmationRecipientViewHolder(inflate);
    }
    
    public final void submitList(@e final List<ReadConfirmationState> c) {
        k0.p(c, "newList");
        this.parentsList.clear();
        this.parentsList.addAll(c);
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/adapter/ReadConfirmationParentsListAdapter$ReadConfirmationRecipientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/ReadConfirmationState;", "readConfirmationState", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/adapter/ReadConfirmationParentsListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class ReadConfirmationRecipientViewHolder extends RecyclerView$g0
    {
        public ReadConfirmationRecipientViewHolder(final View view) {
            k0.p(ReadConfirmationParentsListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        public final void bind(@e final ReadConfirmationState readConfirmationState) {
            k0.p(readConfirmationState, "readConfirmationState");
            final View itemView = super.itemView;
            final int xb = c.i.xB;
            ((TextView)itemView.findViewById(xb)).setText((CharSequence)readConfirmationState.getUserDisplayName());
            if (readConfirmationState.getDate() != null) {
                final int tb = c.i.tB;
                ((TextView)itemView.findViewById(tb)).setText((CharSequence)ReadConfirmationStateExtKt.getConfirmationFormattedDate(readConfirmationState, d.f(itemView.getContext(), 2131099984)));
                ((TextView)itemView.findViewById(xb)).setTextColor(d.f(itemView.getContext(), 2131099989));
                ((ImageView)itemView.findViewById(c.i.vB)).setVisibility(0);
                ((TextView)itemView.findViewById(tb)).setVisibility(0);
            }
            else {
                ((TextView)itemView.findViewById(xb)).setTextColor(d.f(itemView.getContext(), 2131099995));
                ((ImageView)itemView.findViewById(c.i.vB)).setVisibility(4);
                ((TextView)itemView.findViewById(c.i.tB)).setVisibility(8);
            }
        }
    }
}
