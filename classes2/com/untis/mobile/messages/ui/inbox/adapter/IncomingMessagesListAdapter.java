// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.adapter;

import android.content.Context;
import com.untis.mobile.messages.data.model.Sender;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.messages.data.model.extension.MessageExtensionsKt;
import com.untis.mobile.messages.util.ExtensionsKt;
import android.widget.TextView;
import android.widget.ImageView;
import com.untis.mobile.utils.extension.h;
import android.widget.ImageButton;
import android.view.View$OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.messages.util.recyclerviewswipeutil.SwipeRevealLayout;
import com.untis.mobile.c;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.untis.mobile.utils.extension.a;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.jvm.internal.k0;
import n6.l;
import kotlin.j2;
import n6.p;
import com.untis.mobile.messages.data.model.Message;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.util.recyclerviewswipeutil.ViewBinderHelper;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001*Br\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00126\u0010$\u001a2\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0 \u0012!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000b0%¢\u0006\u0004\b(\u0010)J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0012j\b\u0012\u0004\u0012\u00020\u000e`\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0012j\b\u0012\u0004\u0012\u00020\u000e`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006+" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/adapter/IncomingMessagesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/inbox/adapter/IncomingMessagesListAdapter$IncomingMessageViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "", "Lcom/untis/mobile/messages/data/model/Message;", "newList", "submitList", "updateReadFlag", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMessagesList", "Lcom/untis/mobile/messages/util/recyclerviewswipeutil/ViewBinderHelper;", "binderHelper", "Lcom/untis/mobile/messages/util/recyclerviewswipeutil/ViewBinderHelper;", "messagesList", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/ui/inbox/adapter/OnMessageClickListener;", "onMessageClickListener", "Lcom/untis/mobile/messages/ui/inbox/adapter/OnMessageClickListener;", "", "type", "Ljava/lang/String;", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "messageId", "onDeleteMessageClick", "Lkotlin/Function1;", "message", "onReplyMessageClick", "<init>", "(Lcom/untis/mobile/messages/ui/inbox/adapter/OnMessageClickListener;Ljava/lang/String;Ln6/p;Ln6/l;)V", "IncomingMessageViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class IncomingMessagesListAdapter extends RecyclerView$h<IncomingMessageViewHolder>
{
    @e
    private final ViewBinderHelper binderHelper;
    @e
    private final ArrayList<Message> messagesList;
    @e
    private final p<String, Integer, j2> onDeleteMessageClick;
    @e
    private final OnMessageClickListener onMessageClickListener;
    @e
    private final l<Message, j2> onReplyMessageClick;
    @e
    private final String type;
    
    public IncomingMessagesListAdapter(@e final OnMessageClickListener onMessageClickListener, @e final String type, @e final p<? super String, ? super Integer, j2> onDeleteMessageClick, @e final l<? super Message, j2> onReplyMessageClick) {
        k0.p(onMessageClickListener, "onMessageClickListener");
        k0.p(type, "type");
        k0.p(onDeleteMessageClick, "onDeleteMessageClick");
        k0.p(onReplyMessageClick, "onReplyMessageClick");
        this.onMessageClickListener = onMessageClickListener;
        this.type = type;
        this.onDeleteMessageClick = (p<String, Integer, j2>)onDeleteMessageClick;
        this.onReplyMessageClick = (l<Message, j2>)onReplyMessageClick;
        this.messagesList = new ArrayList<Message>();
        (this.binderHelper = new ViewBinderHelper()).setOpenOnlyOne(true);
    }
    
    public static final /* synthetic */ ViewBinderHelper access$getBinderHelper$p(final IncomingMessagesListAdapter incomingMessagesListAdapter) {
        return incomingMessagesListAdapter.binderHelper;
    }
    
    public static final /* synthetic */ p access$getOnDeleteMessageClick$p(final IncomingMessagesListAdapter incomingMessagesListAdapter) {
        return incomingMessagesListAdapter.onDeleteMessageClick;
    }
    
    public static final /* synthetic */ OnMessageClickListener access$getOnMessageClickListener$p(final IncomingMessagesListAdapter incomingMessagesListAdapter) {
        return incomingMessagesListAdapter.onMessageClickListener;
    }
    
    public static final /* synthetic */ l access$getOnReplyMessageClick$p(final IncomingMessagesListAdapter incomingMessagesListAdapter) {
        return incomingMessagesListAdapter.onReplyMessageClick;
    }
    
    public static final /* synthetic */ String access$getType$p(final IncomingMessagesListAdapter incomingMessagesListAdapter) {
        return incomingMessagesListAdapter.type;
    }
    
    public int getItemCount() {
        return this.messagesList.size();
    }
    
    @e
    public final ArrayList<Message> getMessagesList() {
        return this.messagesList;
    }
    
    public void onBindViewHolder(@e final IncomingMessageViewHolder incomingMessageViewHolder, final int index) {
        k0.p(incomingMessageViewHolder, "holder");
        final Message value = this.messagesList.get(index);
        k0.o(value, "messagesList[position]");
        incomingMessageViewHolder.bind(value, index, a.a(this, index));
    }
    
    @e
    public IncomingMessageViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493220, viewGroup, false);
        k0.o(inflate, "from(parent.context)\n                .inflate(R.layout.item_messages_incoming, parent, false)");
        return new IncomingMessageViewHolder(inflate);
    }
    
    public final void submitList(@e final List<Message> c) {
        k0.p(c, "newList");
        this.messagesList.clear();
        this.messagesList.addAll(c);
        this.notifyDataSetChanged();
    }
    
    public final void updateReadFlag(final int index) {
        this.messagesList.get(index).setRead(true);
        this.notifyItemChanged(index);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/adapter/IncomingMessagesListAdapter$IncomingMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/Message;", "message", "", "position", "dividerVisibility", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/inbox/adapter/IncomingMessagesListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class IncomingMessageViewHolder extends RecyclerView$g0
    {
        public IncomingMessageViewHolder(final View view) {
            k0.p(IncomingMessagesListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-3$lambda-0(final IncomingMessagesListAdapter incomingMessagesListAdapter, final Message message, final int n, final View view) {
            k0.p(incomingMessagesListAdapter, "this$0");
            k0.p(message, "$message");
            IncomingMessagesListAdapter.access$getOnMessageClickListener$p(incomingMessagesListAdapter).onMessageClick(message, n, IncomingMessagesListAdapter.access$getType$p(incomingMessagesListAdapter));
        }
        
        private static final void bind$lambda-3$lambda-1(final IncomingMessagesListAdapter incomingMessagesListAdapter, final Message message, final int i, final View view) {
            k0.p(incomingMessagesListAdapter, "this$0");
            k0.p(message, "$message");
            IncomingMessagesListAdapter.access$getOnDeleteMessageClick$p(incomingMessagesListAdapter).invoke(message.getId(), i);
        }
        
        private static final void bind$lambda-3$lambda-2(final IncomingMessagesListAdapter incomingMessagesListAdapter, final Message message, final View view) {
            k0.p(incomingMessagesListAdapter, "this$0");
            k0.p(message, "$message");
            IncomingMessagesListAdapter.access$getOnReplyMessageClick$p(incomingMessagesListAdapter).invoke(message);
        }
        
        public final void bind(@e final Message message, int gk, final int visibility) {
            k0.p(message, "message");
            final View itemView = super.itemView;
            final IncomingMessagesListAdapter this$0 = IncomingMessagesListAdapter.this;
            final int qf = c.i.QF;
            ((SwipeRevealLayout)itemView.findViewById(qf)).setLockDrag(k0.g(IncomingMessagesListAdapter.access$getType$p(this$0), "read_confirmation_messages") && (!message.getAllowMessageDeletion() || !message.isReplyAllowed()));
            ((ViewGroup)itemView.findViewById(c.i.wF)).setOnClickListener((View$OnClickListener)new b(this$0, message, gk));
            IncomingMessagesListAdapter.access$getBinderHelper$p(this$0).bind((SwipeRevealLayout)itemView.findViewById(qf), message.getId());
            final int sk = c.i.Sk;
            ((ImageButton)itemView.findViewById(sk)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.inbox.adapter.c(this$0, message, gk));
            final ImageButton imageButton = (ImageButton)itemView.findViewById(sk);
            final boolean allowMessageDeletion = message.getAllowMessageDeletion();
            final String s = null;
            imageButton.setVisibility(h.U(allowMessageDeletion, 0, 1, null));
            gk = c.i.gK;
            ((ImageButton)itemView.findViewById(gk)).setVisibility(h.U(message.isReplyAllowed(), 0, 1, null));
            ((ImageButton)itemView.findViewById(gk)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.inbox.adapter.a(this$0, message));
            TextView textView;
            if (message.isRead()) {
                ((ImageView)itemView.findViewById(c.i.kz)).setVisibility(4);
                textView = (TextView)itemView.findViewById(c.i.Iz);
                k0.o(textView, "item_message_subject");
                gk = 2131951977;
            }
            else {
                ((ImageView)itemView.findViewById(c.i.kz)).setVisibility(0);
                textView = (TextView)itemView.findViewById(c.i.Iz);
                k0.o(textView, "item_message_subject");
                gk = 2131951978;
            }
            ExtensionsKt.setTextStyle(textView, gk);
            ((ImageView)itemView.findViewById(c.i.jz)).setVisibility(h.U(message.getHasAttachments(), 0, 1, null));
            final TextView textView2 = (TextView)itemView.findViewById(c.i.Gz);
            final Sender sender = message.getSender();
            CharSequence displayName;
            if (sender == null) {
                displayName = null;
            }
            else {
                displayName = sender.getDisplayName();
            }
            textView2.setText(displayName);
            final TextView textView3 = (TextView)itemView.findViewById(c.i.Iz);
            String text;
            if (message.isReply()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(itemView.getContext().getString(2131886401));
                sb.append(' ');
                sb.append((Object)message.getSubject());
                text = sb.toString();
            }
            else {
                text = message.getSubject();
            }
            textView3.setText((CharSequence)text);
            ((TextView)itemView.findViewById(c.i.Hz)).setText((CharSequence)MessageExtensionsKt.getFormattedSentDate(message));
            ((TextView)itemView.findViewById(c.i.iz)).setText((CharSequence)message.getContentPreview());
            final com.untis.mobile.services.image.b a = com.untis.mobile.services.image.b.a;
            final Context context = itemView.getContext();
            k0.o(context, "this.context");
            final AppCompatImageView appCompatImageView = (AppCompatImageView)itemView.findViewById(c.i.Fz);
            k0.o(appCompatImageView, "item_message_sender_image_view");
            final Sender sender2 = message.getSender();
            String imageUrl;
            if (sender2 == null) {
                imageUrl = null;
            }
            else {
                imageUrl = sender2.getImageUrl();
            }
            final Sender sender3 = message.getSender();
            String j;
            if (sender3 == null) {
                j = s;
            }
            else {
                final String displayName2 = sender3.getDisplayName();
                if (displayName2 == null) {
                    j = s;
                }
                else {
                    j = h.J(displayName2);
                }
            }
            a.a(context, appCompatImageView, imageUrl, j);
            itemView.findViewById(c.i.Jz).setVisibility(visibility);
        }
    }
}
