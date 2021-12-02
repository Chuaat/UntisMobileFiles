// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.adapter;

import org.jetbrains.annotations.f;
import android.annotation.SuppressLint;
import java.util.Map;
import android.content.Context;
import androidx.core.content.d;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.messages.data.model.extension.MessageExtensionsKt;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.messages.util.ExtensionsKt;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ImageButton;
import com.untis.mobile.messages.util.recyclerviewswipeutil.SwipeRevealLayout;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.messages.data.model.RequestConfirmationStatus;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.untis.mobile.utils.extension.a;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.jvm.internal.k0;
import n6.p;
import kotlin.j2;
import com.untis.mobile.messages.util.AlertDialogTypes;
import n6.q;
import com.untis.mobile.messages.data.model.Message;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.util.recyclerviewswipeutil.ViewBinderHelper;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B\u00d9\u0001\u00126\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0018\u0012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000b0\u001d\u0012K\u0010%\u001aG\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0004\b&\u0010'J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006)" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/adapter/SentMessagesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/sent/adapter/SentMessagesListAdapter$SentMessageViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "", "Lcom/untis/mobile/messages/data/model/Message;", "newList", "submitList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "messagesList", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/util/recyclerviewswipeutil/ViewBinderHelper;", "binderHelper", "Lcom/untis/mobile/messages/util/recyclerviewswipeutil/ViewBinderHelper;", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "message", "onMessageClick", "Lkotlin/Function3;", "numberOfConfirmed", "totalConfirmations", "", "messageId", "onReadConfirmationClick", "Lcom/untis/mobile/messages/util/AlertDialogTypes;", "type", "onDeleteOrRevokeMessageClick", "<init>", "(Ln6/p;Ln6/q;Ln6/q;)V", "SentMessageViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SentMessagesListAdapter extends RecyclerView$h<SentMessageViewHolder>
{
    @e
    private final ViewBinderHelper binderHelper;
    @e
    private final ArrayList<Message> messagesList;
    @e
    private final q<String, Integer, AlertDialogTypes, j2> onDeleteOrRevokeMessageClick;
    @e
    private final p<Message, Integer, j2> onMessageClick;
    @e
    private final q<Integer, Integer, String, j2> onReadConfirmationClick;
    
    public SentMessagesListAdapter(@e final p<? super Message, ? super Integer, j2> onMessageClick, @e final q<? super Integer, ? super Integer, ? super String, j2> onReadConfirmationClick, @e final q<? super String, ? super Integer, ? super AlertDialogTypes, j2> onDeleteOrRevokeMessageClick) {
        k0.p(onMessageClick, "onMessageClick");
        k0.p(onReadConfirmationClick, "onReadConfirmationClick");
        k0.p(onDeleteOrRevokeMessageClick, "onDeleteOrRevokeMessageClick");
        this.onMessageClick = (p<Message, Integer, j2>)onMessageClick;
        this.onReadConfirmationClick = (q<Integer, Integer, String, j2>)onReadConfirmationClick;
        this.onDeleteOrRevokeMessageClick = (q<String, Integer, AlertDialogTypes, j2>)onDeleteOrRevokeMessageClick;
        this.messagesList = new ArrayList<Message>();
        (this.binderHelper = new ViewBinderHelper()).setOpenOnlyOne(true);
    }
    
    public static final /* synthetic */ ViewBinderHelper access$getBinderHelper$p(final SentMessagesListAdapter sentMessagesListAdapter) {
        return sentMessagesListAdapter.binderHelper;
    }
    
    public static final /* synthetic */ q access$getOnDeleteOrRevokeMessageClick$p(final SentMessagesListAdapter sentMessagesListAdapter) {
        return sentMessagesListAdapter.onDeleteOrRevokeMessageClick;
    }
    
    public static final /* synthetic */ p access$getOnMessageClick$p(final SentMessagesListAdapter sentMessagesListAdapter) {
        return sentMessagesListAdapter.onMessageClick;
    }
    
    public static final /* synthetic */ q access$getOnReadConfirmationClick$p(final SentMessagesListAdapter sentMessagesListAdapter) {
        return sentMessagesListAdapter.onReadConfirmationClick;
    }
    
    public int getItemCount() {
        return this.messagesList.size();
    }
    
    public void onBindViewHolder(@e final SentMessageViewHolder sentMessageViewHolder, final int index) {
        k0.p(sentMessageViewHolder, "holder");
        final Message value = this.messagesList.get(index);
        k0.o(value, "messagesList[position]");
        sentMessageViewHolder.bind(value, a.a(this, index), index);
    }
    
    @e
    public SentMessageViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493220, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_messages_incoming, parent, false)");
        return new SentMessageViewHolder(inflate);
    }
    
    public final void submitList(@e final List<Message> c) {
        k0.p(c, "newList");
        this.messagesList.clear();
        this.messagesList.addAll(c);
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/adapter/SentMessagesListAdapter$SentMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/Message;", "message", "", "dividerVisibility", "position", "Lkotlin/j2;", "bind", "(Lcom/untis/mobile/messages/data/model/Message;II)Lkotlin/j2;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/sent/adapter/SentMessagesListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class SentMessageViewHolder extends RecyclerView$g0
    {
        public SentMessageViewHolder(final View view) {
            k0.p(SentMessagesListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-5$lambda-0(final SentMessagesListAdapter sentMessagesListAdapter, final Message message, final int i, final View view) {
            k0.p(sentMessagesListAdapter, "this$0");
            k0.p(message, "$message");
            SentMessagesListAdapter.access$getOnMessageClick$p(sentMessagesListAdapter).invoke(message, i);
        }
        
        private static final void bind$lambda-5$lambda-1(final SentMessagesListAdapter sentMessagesListAdapter, final Message message, final int i, final View view) {
            k0.p(sentMessagesListAdapter, "this$0");
            k0.p(message, "$message");
            SentMessagesListAdapter.access$getOnDeleteOrRevokeMessageClick$p(sentMessagesListAdapter).invoke(message.getId(), i, AlertDialogTypes.REVOKE);
        }
        
        private static final void bind$lambda-5$lambda-2(final SentMessagesListAdapter sentMessagesListAdapter, final Message message, final int i, final View view) {
            k0.p(sentMessagesListAdapter, "this$0");
            k0.p(message, "$message");
            SentMessagesListAdapter.access$getOnDeleteOrRevokeMessageClick$p(sentMessagesListAdapter).invoke(message.getId(), i, AlertDialogTypes.DELETE);
        }
        
        private static final void bind$lambda-5$lambda-4$lambda-3(final SentMessagesListAdapter sentMessagesListAdapter, final RequestConfirmationStatus requestConfirmationStatus, final Message message, final View view) {
            k0.p(sentMessagesListAdapter, "this$0");
            k0.p(requestConfirmationStatus, "$it");
            k0.p(message, "$message");
            SentMessagesListAdapter.access$getOnReadConfirmationClick$p(sentMessagesListAdapter).invoke(requestConfirmationStatus.getConfirmedRequestCount(), requestConfirmationStatus.getTotalRequestCount(), message.getId());
        }
        
        @SuppressLint({ "SetTextI18n" })
        @f
        public final j2 bind(@e final Message message, int visibility, int n) {
            k0.p(message, "message");
            final View itemView = super.itemView;
            final SentMessagesListAdapter this$0 = SentMessagesListAdapter.this;
            ((ViewGroup)itemView.findViewById(c.i.wF)).setOnClickListener((View$OnClickListener)new b(this$0, message, n));
            final ViewBinderHelper access$getBinderHelper$p = SentMessagesListAdapter.access$getBinderHelper$p(this$0);
            final int qf = c.i.QF;
            access$getBinderHelper$p.bind((SwipeRevealLayout)itemView.findViewById(qf), message.getId());
            final int ik = c.i.iK;
            ((ImageButton)itemView.findViewById(ik)).setVisibility(0);
            ((ImageButton)itemView.findViewById(ik)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.adapter.c(this$0, message, n));
            ((ImageButton)itemView.findViewById(c.i.Sk)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.adapter.a(this$0, message, n));
            ((SwipeRevealLayout)itemView.findViewById(qf)).setLockDrag(message.getAllowMessageDeletion() ^ true);
            ((ImageView)itemView.findViewById(c.i.kz)).setVisibility(4);
            n = c.i.Iz;
            final TextView textView = (TextView)itemView.findViewById(n);
            k0.o(textView, "item_message_subject");
            ExtensionsKt.setTextStyle(textView, 2131951977);
            final ImageView imageView = (ImageView)itemView.findViewById(c.i.jz);
            final boolean hasAttachments = message.getHasAttachments();
            final j2 j2 = null;
            imageView.setVisibility(h.U(hasAttachments, 0, 1, null));
            final TextView textView2 = (TextView)itemView.findViewById(n);
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
            textView2.setText((CharSequence)text);
            ((TextView)itemView.findViewById(c.i.Hz)).setText((CharSequence)MessageExtensionsKt.getFormattedSentDate(message));
            ((TextView)itemView.findViewById(c.i.iz)).setText((CharSequence)message.getContentPreview());
            final Context context = itemView.getContext();
            k0.o(context, "context");
            final Map<String, String> sentToRecipientNameAndImage = MessageExtensionsKt.getSentToRecipientNameAndImage(message, context);
            ((TextView)itemView.findViewById(c.i.Gz)).setText((CharSequence)sentToRecipientNameAndImage.get("recipientText"));
            final com.untis.mobile.services.image.b a = com.untis.mobile.services.image.b.a;
            final Context context2 = itemView.getContext();
            k0.o(context2, "context");
            final AppCompatImageView appCompatImageView = (AppCompatImageView)itemView.findViewById(c.i.Fz);
            k0.o(appCompatImageView, "item_message_sender_image_view");
            a.a(context2, appCompatImageView, sentToRecipientNameAndImage.get("imageUrl"), sentToRecipientNameAndImage.get("name"));
            itemView.findViewById(c.i.Jz).setVisibility(visibility);
            final int qz = c.i.qz;
            ((LinearLayout)itemView.findViewById(qz)).setVisibility(h.U(message.getRequestConfirmationStatus() != null, 0, 1, null));
            final RequestConfirmationStatus requestConfirmationStatus = message.getRequestConfirmationStatus();
            j2 a2;
            if (requestConfirmationStatus == null) {
                a2 = j2;
            }
            else {
                n = c.i.lz;
                final TextView textView3 = (TextView)itemView.findViewById(n);
                Context context3;
                if (requestConfirmationStatus.getConfirmedRequestCount() > 0) {
                    context3 = itemView.getContext();
                    visibility = 2131099989;
                }
                else {
                    context3 = itemView.getContext();
                    visibility = 2131099990;
                }
                textView3.setTextColor(d.f(context3, visibility));
                ((TextView)itemView.findViewById(n)).setText((CharSequence)String.valueOf(requestConfirmationStatus.getConfirmedRequestCount()));
                ((TextView)itemView.findViewById(c.i.mz)).setText((CharSequence)String.valueOf(requestConfirmationStatus.getTotalRequestCount()));
                ((LinearLayout)itemView.findViewById(qz)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.adapter.d(this$0, requestConfirmationStatus, message));
                a2 = kotlin.j2.a;
            }
            return a2;
        }
    }
}
