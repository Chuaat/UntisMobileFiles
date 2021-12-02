// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.details.adapter;

import android.view.View$OnClickListener;
import android.widget.Button;
import com.untis.mobile.messages.util.ExtensionsKt;
import androidx.appcompat.widget.AppCompatButton;
import com.untis.mobile.c;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.MessageAttachment;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B8\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/adapter/MessageAttachmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/inbox/details/adapter/MessageAttachmentAdapter$MessageAttachmentViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "getItemCount", "", "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "attachments", "Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "attachment", "onAttachmentClick", "<init>", "(Ljava/util/List;Ln6/l;)V", "MessageAttachmentViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageAttachmentAdapter extends RecyclerView$h<MessageAttachmentViewHolder>
{
    @e
    private final List<MessageAttachment> attachments;
    @e
    private final l<MessageAttachment, j2> onAttachmentClick;
    
    public MessageAttachmentAdapter(@e final List<MessageAttachment> attachments, @e final l<? super MessageAttachment, j2> onAttachmentClick) {
        k0.p(attachments, "attachments");
        k0.p(onAttachmentClick, "onAttachmentClick");
        this.attachments = attachments;
        this.onAttachmentClick = (l<MessageAttachment, j2>)onAttachmentClick;
    }
    
    public static final /* synthetic */ l access$getOnAttachmentClick$p(final MessageAttachmentAdapter messageAttachmentAdapter) {
        return messageAttachmentAdapter.onAttachmentClick;
    }
    
    public int getItemCount() {
        return this.attachments.size();
    }
    
    public void onBindViewHolder(@e final MessageAttachmentViewHolder messageAttachmentViewHolder, final int n) {
        k0.p(messageAttachmentViewHolder, "holder");
        messageAttachmentViewHolder.bind(this.attachments.get(n), n);
    }
    
    @e
    public MessageAttachmentViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493292, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.message_details_attachment_btn_view, parent, false)");
        return new MessageAttachmentViewHolder(inflate);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/adapter/MessageAttachmentAdapter$MessageAttachmentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "attachment", "", "position", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/inbox/details/adapter/MessageAttachmentAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class MessageAttachmentViewHolder extends RecyclerView$g0
    {
        public MessageAttachmentViewHolder(final View view) {
            k0.p(MessageAttachmentAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-0(final MessageAttachmentAdapter messageAttachmentAdapter, final MessageAttachment messageAttachment, final View view) {
            k0.p(messageAttachmentAdapter, "this$0");
            k0.p(messageAttachment, "$attachment");
            MessageAttachmentAdapter.access$getOnAttachmentClick$p(messageAttachmentAdapter).invoke(messageAttachment);
        }
        
        public final void bind(@e final MessageAttachment messageAttachment, final int n) {
            k0.p(messageAttachment, "attachment");
            final View itemView = super.itemView;
            final int xf = c.i.xF;
            ((Button)itemView.findViewById(xf)).setText((CharSequence)messageAttachment.getName());
            final AppCompatButton appCompatButton = (AppCompatButton)super.itemView.findViewById(xf);
            k0.o(appCompatButton, "itemView.message_details_attachment_btn");
            ExtensionsKt.setAttachmentTypeIcon((Button)appCompatButton, messageAttachment.getName());
            ((Button)super.itemView.findViewById(xf)).setOnClickListener((View$OnClickListener)new a(MessageAttachmentAdapter.this, messageAttachment));
            super.itemView.findViewById(c.i.yF).setVisibility(com.untis.mobile.utils.extension.a.a(MessageAttachmentAdapter.this, n));
        }
    }
}
