// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.details.adapter;

import com.untis.mobile.c;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.k0;
import androidx.recyclerview.widget.RecyclerView$g0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.ArrayList;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/details/adapter/SentMessageRecipientsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/sent/details/adapter/SentMessageRecipientsListAdapter$SentMessageRecipientViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "getItemCount", "", "Lcom/untis/mobile/messages/data/model/Recipient;", "newList", "submitList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "recipientsList", "Ljava/util/ArrayList;", "<init>", "()V", "SentMessageRecipientViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SentMessageRecipientsListAdapter extends RecyclerView$h<SentMessageRecipientViewHolder>
{
    @e
    private final ArrayList<Recipient> recipientsList;
    
    public SentMessageRecipientsListAdapter() {
        this.recipientsList = new ArrayList<Recipient>();
    }
    
    public int getItemCount() {
        return this.recipientsList.size();
    }
    
    public void onBindViewHolder(@e final SentMessageRecipientViewHolder sentMessageRecipientViewHolder, final int index) {
        k0.p(sentMessageRecipientViewHolder, "holder");
        final Recipient value = this.recipientsList.get(index);
        k0.o(value, "recipientsList[position]");
        sentMessageRecipientViewHolder.bind(value, index);
    }
    
    @e
    public SentMessageRecipientViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493251, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_sent_message_details_recipients, parent, false)");
        return new SentMessageRecipientViewHolder(inflate);
    }
    
    public final void submitList(@e final List<Recipient> c) {
        k0.p(c, "newList");
        this.recipientsList.clear();
        this.recipientsList.addAll(c);
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/details/adapter/SentMessageRecipientsListAdapter$SentMessageRecipientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/Recipient;", "recipient", "", "position", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/sent/details/adapter/SentMessageRecipientsListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class SentMessageRecipientViewHolder extends RecyclerView$g0
    {
        public SentMessageRecipientViewHolder(final View view) {
            k0.p(SentMessageRecipientsListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        public final void bind(@e final Recipient recipient, int visibility) {
            k0.p(recipient, "recipient");
            final View itemView = super.itemView;
            final SentMessageRecipientsListAdapter this$0 = SentMessageRecipientsListAdapter.this;
            ((TextView)itemView.findViewById(c.i.qG)).setText((CharSequence)recipient.getDisplayName());
            final View viewById = itemView.findViewById(c.i.aK);
            if (visibility == this$0.getItemCount() - 1) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            viewById.setVisibility(visibility);
        }
    }
}
