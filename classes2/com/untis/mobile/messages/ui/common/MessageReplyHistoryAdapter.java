// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.common;

import com.untis.mobile.messages.data.model.Sender;
import android.content.Context;
import android.widget.TextView$BufferType;
import com.untis.mobile.messages.data.model.extension.MessageExtensionsKt;
import com.untis.mobile.messages.util.ExtensionsKt;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.untis.mobile.messages.ui.inbox.details.adapter.MessageAttachmentAdapter;
import kotlin.collections.v;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import kotlin.text.s;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.messages.data.model.Recipient;
import androidx.core.content.d;
import com.untis.mobile.c;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import android.view.View;
import com.untis.mobile.messages.data.model.Message;
import n6.p;
import kotlin.j2;
import com.untis.mobile.messages.data.model.MessageAttachment;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(Br\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\n0\u001b\u00126\u0010%\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\b&\u0010'J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0010\u001a\u00020\u0005H\u0016R&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011j\b\u0012\u0004\u0012\u00020\r`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006)" }, d2 = { "Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter$MessageReplyHistoryViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "", "Lcom/untis/mobile/messages/data/model/Message;", "newList", "submitList", "getItemCount", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "replyHistory", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/ui/common/MessageTypes;", "messageType", "Lcom/untis/mobile/messages/ui/common/MessageTypes;", "", "currentUserId", "Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "Lkotlin/t0;", "name", "attachment", "onAttachmentClick", "Lkotlin/Function2;", "message", "Landroid/view/View;", "view", "onBlobAttachmentClick", "<init>", "(Lcom/untis/mobile/messages/ui/common/MessageTypes;Ljava/lang/String;Ln6/l;Ln6/p;)V", "MessageReplyHistoryViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageReplyHistoryAdapter extends RecyclerView$h<MessageReplyHistoryViewHolder>
{
    @e
    private final String currentUserId;
    @e
    private final MessageTypes messageType;
    @e
    private final l<MessageAttachment, j2> onAttachmentClick;
    @e
    private final p<Message, View, j2> onBlobAttachmentClick;
    @e
    private final ArrayList<Message> replyHistory;
    
    public MessageReplyHistoryAdapter(@e final MessageTypes messageType, @e final String currentUserId, @e final l<? super MessageAttachment, j2> onAttachmentClick, @e final p<? super Message, ? super View, j2> onBlobAttachmentClick) {
        k0.p(messageType, "messageType");
        k0.p(currentUserId, "currentUserId");
        k0.p(onAttachmentClick, "onAttachmentClick");
        k0.p(onBlobAttachmentClick, "onBlobAttachmentClick");
        this.messageType = messageType;
        this.currentUserId = currentUserId;
        this.onAttachmentClick = (l<MessageAttachment, j2>)onAttachmentClick;
        this.onBlobAttachmentClick = (p<Message, View, j2>)onBlobAttachmentClick;
        this.replyHistory = new ArrayList<Message>();
    }
    
    public static final /* synthetic */ String access$getCurrentUserId$p(final MessageReplyHistoryAdapter messageReplyHistoryAdapter) {
        return messageReplyHistoryAdapter.currentUserId;
    }
    
    public static final /* synthetic */ MessageTypes access$getMessageType$p(final MessageReplyHistoryAdapter messageReplyHistoryAdapter) {
        return messageReplyHistoryAdapter.messageType;
    }
    
    public static final /* synthetic */ p access$getOnBlobAttachmentClick$p(final MessageReplyHistoryAdapter messageReplyHistoryAdapter) {
        return messageReplyHistoryAdapter.onBlobAttachmentClick;
    }
    
    public int getItemCount() {
        return this.replyHistory.size();
    }
    
    public void onBindViewHolder(@e final MessageReplyHistoryViewHolder messageReplyHistoryViewHolder, final int index) {
        k0.p(messageReplyHistoryViewHolder, "holder");
        final Message value = this.replyHistory.get(index);
        k0.o(value, "replyHistory[position]");
        messageReplyHistoryViewHolder.bind(value, index);
    }
    
    @e
    public MessageReplyHistoryViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493219, viewGroup, false);
        k0.o(inflate, "from(parent.context)\n            .inflate(R.layout.item_message_reply_history, parent, false)");
        return new MessageReplyHistoryViewHolder(inflate);
    }
    
    public final void submitList(@e final List<Message> c) {
        k0.p(c, "newList");
        this.replyHistory.clear();
        this.replyHistory.addAll(c);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter$MessageReplyHistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/Message;", "message", "", "position", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class MessageReplyHistoryViewHolder extends RecyclerView$g0
    {
        public MessageReplyHistoryViewHolder(final View view) {
            k0.p(MessageReplyHistoryAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-2$lambda-0(final MessageReplyHistoryAdapter messageReplyHistoryAdapter, final Message message, final View view, final View view2) {
            k0.p(messageReplyHistoryAdapter, "this$0");
            k0.p(message, "$message");
            k0.p(view, "$this_with");
            MessageReplyHistoryAdapter.access$getOnBlobAttachmentClick$p(messageReplyHistoryAdapter).invoke(message, view);
        }
        
        public final void bind(@e final Message message, final int n) {
            k0.p(message, "message");
            final View itemView = super.itemView;
            final MessageReplyHistoryAdapter this$0 = MessageReplyHistoryAdapter.this;
            if (n == 0) {
                ((TextView)itemView.findViewById(c.i.Az)).setTextColor(d.f(itemView.getContext(), 2131100017));
                ((TextView)itemView.findViewById(c.i.uz)).setTextColor(d.f(itemView.getContext(), 2131100015));
            }
            final int n2 = WhenMappings.$EnumSwitchMapping$0[MessageReplyHistoryAdapter.access$getMessageType$p(this$0).ordinal()];
            Label_0355: {
                TextView textView = null;
                String text = null;
                Label_0348: {
                    Context context;
                    int n3;
                    if (n2 != 1) {
                        if (n2 != 2) {
                            break Label_0355;
                        }
                        ((TextView)itemView.findViewById(c.i.wz)).setText((CharSequence)itemView.getContext().getString(2131886407));
                        final List<Recipient> recipients = message.getRecipients();
                        if (recipients == null || recipients.isEmpty()) {
                            break Label_0355;
                        }
                        textView = (TextView)itemView.findViewById(c.i.yz);
                        if (!k0.g(message.getRecipients().get(0).getUserId(), MessageReplyHistoryAdapter.access$getCurrentUserId$p(this$0))) {
                            text = message.getRecipients().get(0).getDisplayName();
                            break Label_0348;
                        }
                        context = itemView.getContext();
                        n3 = 2131886399;
                    }
                    else {
                        ((TextView)itemView.findViewById(c.i.wz)).setText((CharSequence)itemView.getContext().getString(2131886427));
                        textView = (TextView)itemView.findViewById(c.i.yz);
                        final Sender sender = message.getSender();
                        Object userId;
                        if (sender == null) {
                            userId = null;
                        }
                        else {
                            userId = sender.getUserId();
                        }
                        if (k0.g(userId, MessageReplyHistoryAdapter.access$getCurrentUserId$p(this$0))) {
                            context = itemView.getContext();
                            n3 = 2131886402;
                        }
                        else {
                            final Sender sender2 = message.getSender();
                            if (sender2 == null) {
                                text = null;
                                break Label_0348;
                            }
                            text = sender2.getDisplayName();
                            break Label_0348;
                        }
                    }
                    text = context.getString(n3);
                }
                textView.setText((CharSequence)text);
            }
            final int az = c.i.Az;
            ((TextView)itemView.findViewById(az)).setText((CharSequence)message.getSubject());
            ((TextView)itemView.findViewById(az)).setVisibility(h.U(message.isRevoked() ^ true, 0, 1, null));
            final TextView textView2 = (TextView)itemView.findViewById(c.i.uz);
            String text2 = null;
            Label_0516: {
                Context context2;
                int n4;
                if (message.isRevoked()) {
                    context2 = itemView.getContext();
                    n4 = 2131886400;
                }
                else if (message.isReportMessage()) {
                    context2 = itemView.getContext();
                    n4 = 2131886389;
                }
                else {
                    final String content = message.getContent();
                    if (content != null && !s.U1((CharSequence)content)) {
                        text2 = message.getContent();
                        break Label_0516;
                    }
                    context2 = itemView.getContext();
                    n4 = 2131886426;
                }
                text2 = context2.getString(n4);
            }
            textView2.setText((CharSequence)text2);
            final int sz = c.i.sz;
            ((LinearLayout)itemView.findViewById(sz)).setVisibility(h.U(message.getMessageBlobAttachment() != null, 0, 1, null));
            final int rz = c.i.rz;
            final RecyclerView recyclerView = (RecyclerView)itemView.findViewById(rz);
            final List<MessageAttachment> attachments = message.getAttachments();
            ((ViewGroup)recyclerView).setVisibility(h.U((attachments == null || attachments.isEmpty()) ^ true, 0, 1, null));
            final RecyclerView recyclerView2 = (RecyclerView)itemView.findViewById(rz);
            List<MessageAttachment> list;
            if ((list = message.getAttachments()) == null) {
                list = v.E();
            }
            recyclerView2.setAdapter((RecyclerView$h)new MessageAttachmentAdapter(list, (l<? super MessageAttachment, j2>)new MessageReplyHistoryAdapter$MessageReplyHistoryViewHolder$bind$1.MessageReplyHistoryAdapter$MessageReplyHistoryViewHolder$bind$1$1(this$0)));
            ((LinearLayout)itemView.findViewById(sz)).setOnClickListener((View$OnClickListener)new a(this$0, message, itemView));
            final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
            if (messageBlobAttachment != null) {
                ((TextView)itemView.findViewById(c.i.vF)).setText((CharSequence)messageBlobAttachment.getName());
                final ImageView imageView = (ImageView)itemView.findViewById(c.i.uF);
                k0.o(imageView, "message_attachment_file_type_icon");
                ExtensionsKt.setAttachmentTypeIcon(imageView, messageBlobAttachment.getName());
            }
            itemView.findViewById(c.i.vz).setVisibility(com.untis.mobile.utils.extension.a.a(this$0, n));
            itemView.findViewById(c.i.xz).setVisibility(h.U(n == this$0.getItemCount() - 1, 0, 1, null));
            ((TextView)itemView.findViewById(c.i.zz)).setText((CharSequence)MessageExtensionsKt.getFormattedSentDateForHistory(message, d.f(itemView.getContext(), 2131099984)), TextView$BufferType.SPANNABLE);
        }
    }
}
