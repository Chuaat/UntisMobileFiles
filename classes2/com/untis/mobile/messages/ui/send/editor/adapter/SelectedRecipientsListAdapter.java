// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.editor.adapter;

import android.view.View$OnClickListener;
import android.widget.ImageButton;
import com.untis.mobile.c;
import android.widget.TextView;
import com.untis.mobile.messages.ui.send.SelectedRecipientsCommonKt;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.util.SendMessageActions;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.ArrayList;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/messages/ui/send/editor/adapter/SelectedRecipientsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/send/editor/adapter/SelectedRecipientsListAdapter$SelectedRecipientViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "getItemCount", "", "Lcom/untis/mobile/messages/data/model/Recipient;", "newList", "submitList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "recipients", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/util/SendMessageActions;", "sendMessageActions", "Lcom/untis/mobile/messages/util/SendMessageActions;", "getSendMessageActions", "()Lcom/untis/mobile/messages/util/SendMessageActions;", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageActions;)V", "SelectedRecipientViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SelectedRecipientsListAdapter extends RecyclerView$h<SelectedRecipientViewHolder>
{
    @e
    private final ArrayList<Recipient> recipients;
    @e
    private final SendMessageActions sendMessageActions;
    
    public SelectedRecipientsListAdapter(@e final SendMessageActions sendMessageActions) {
        k0.p(sendMessageActions, "sendMessageActions");
        this.sendMessageActions = sendMessageActions;
        this.recipients = new ArrayList<Recipient>();
    }
    
    public static final /* synthetic */ ArrayList access$getRecipients$p(final SelectedRecipientsListAdapter selectedRecipientsListAdapter) {
        return selectedRecipientsListAdapter.recipients;
    }
    
    public int getItemCount() {
        return this.recipients.size();
    }
    
    @e
    public final SendMessageActions getSendMessageActions() {
        return this.sendMessageActions;
    }
    
    public void onBindViewHolder(@e final SelectedRecipientViewHolder selectedRecipientViewHolder, final int index) {
        k0.p(selectedRecipientViewHolder, "holder");
        final Recipient value = this.recipients.get(index);
        k0.o(value, "recipients[position]");
        selectedRecipientViewHolder.bind(value, index);
    }
    
    @e
    public SelectedRecipientViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493222, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_messages_recipient_view, parent, false)");
        return new SelectedRecipientViewHolder(inflate);
    }
    
    public final void submitList(@e final List<Recipient> c) {
        k0.p(c, "newList");
        this.recipients.clear();
        this.recipients.addAll(c);
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/messages/ui/send/editor/adapter/SelectedRecipientsListAdapter$SelectedRecipientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/Recipient;", "recipient", "", "position", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/send/editor/adapter/SelectedRecipientsListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class SelectedRecipientViewHolder extends RecyclerView$g0
    {
        public SelectedRecipientViewHolder(final View view) {
            k0.p(SelectedRecipientsListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-1$lambda-0(final Recipient o, final SelectedRecipientsListAdapter selectedRecipientsListAdapter, final int index, final View view) {
            k0.p(o, "$recipient");
            k0.p(selectedRecipientsListAdapter, "this$0");
            SelectedRecipientsCommonKt.getSelectedRecipientsList().remove(SelectedRecipientsCommonKt.getSelectedRecipientsList().indexOf(o));
            SelectedRecipientsListAdapter.access$getRecipients$p(selectedRecipientsListAdapter).remove(index);
            selectedRecipientsListAdapter.notifyItemRemoved(index);
            selectedRecipientsListAdapter.notifyItemRangeChanged(index, SelectedRecipientsListAdapter.access$getRecipients$p(selectedRecipientsListAdapter).size());
            SelectedRecipientsCommonKt.adjustSelectedRecipients();
        }
        
        public final void bind(@e final Recipient recipient, final int n) {
            k0.p(recipient, "recipient");
            final View itemView = super.itemView;
            final SelectedRecipientsListAdapter this$0 = SelectedRecipientsListAdapter.this;
            final TextView textView = (TextView)itemView.findViewById(c.i.qG);
            final String subtitle = recipient.getSubtitle();
            String text;
            if (subtitle != null && subtitle.length() != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(recipient.getDisplayName());
                sb.append(" | ");
                sb.append((Object)recipient.getSubtitle());
                text = sb.toString();
            }
            else {
                text = recipient.getDisplayName();
            }
            textView.setText((CharSequence)text);
            final View viewById = itemView.findViewById(c.i.Cm);
            int visibility;
            if (n == this$0.getItemCount() - 1) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            viewById.setVisibility(visibility);
            if (this$0.getSendMessageActions() == SendMessageActions.SEND_MESSAGE) {
                final int rg = c.i.rG;
                ((ImageButton)itemView.findViewById(rg)).setVisibility(0);
                ((ImageButton)itemView.findViewById(rg)).setOnClickListener((View$OnClickListener)new a(recipient, this$0, n));
            }
        }
    }
}
