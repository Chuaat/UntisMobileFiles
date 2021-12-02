// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.details;

import android.widget.ImageButton;
import android.widget.FrameLayout;
import android.os.Bundle;
import com.untis.mobile.messages.util.AlertDialogTypes;
import com.untis.mobile.messages.util.UiUtilsKt;
import com.untis.mobile.messages.util.SendMessageActions;
import com.untis.mobile.messages.util.SendMessageTypes;
import java.util.List;
import com.untis.mobile.messages.data.model.Sender;
import java.util.Collection;
import android.widget.ScrollView;
import android.widget.TextView$BufferType;
import com.untis.mobile.messages.data.model.extension.MessageExtensionsKt;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView$h;
import com.untis.mobile.messages.ui.inbox.details.adapter.MessageAttachmentAdapter;
import kotlin.collections.v;
import androidx.recyclerview.widget.RecyclerView;
import android.content.ActivityNotFoundException;
import androidx.core.content.FileProvider;
import android.content.Intent;
import android.widget.LinearLayout;
import com.untis.mobile.messages.ui.inbox.details.viewmodel.DownloadAttachmentState;
import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.text.s;
import com.untis.mobile.messages.ui.inbox.details.viewmodel.ConfirmReadMessageState;
import n6.p;
import kotlin.j2;
import n6.l;
import com.untis.mobile.messages.ui.common.MessageTypes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.l0;
import androidx.core.content.d;
import com.untis.mobile.messages.util.ExtensionsKt;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.untis.mobile.messages.ui.inbox.viewmodel.InboxViewModel;
import java.io.OutputStream;
import com.untis.mobile.messages.data.model.MessageAttachment;
import java.io.FileOutputStream;
import androidx.core.net.g;
import com.untis.mobile.ui.fragments.common.UmFragment;
import com.untis.mobile.messages.util.MessageDetailsFragmentExtKt;
import java.util.Arrays;
import com.untis.mobile.messages.data.model.extension.MessageRequestConfirmationExtensionsKt;
import kotlin.jvm.internal.p1;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.cardview.widget.CardView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import android.widget.Button;
import com.untis.mobile.messages.data.model.MessageRequestConfirmation;
import android.view.Window;
import kotlin.jvm.internal.k0;
import android.app.AlertDialog$Builder;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.messages.ui.inbox.details.viewmodel.MessageDetailsViewModel;
import com.untis.mobile.messages.base.Result;
import android.net.Uri;
import kotlin.d0;
import androidx.lifecycle.y;
import n6.a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.f;
import android.view.View$OnClickListener;
import com.untis.mobile.messages.ui.common.MessageReplyHistoryAdapter;
import com.untis.mobile.messages.data.model.Message;
import android.view.View;
import kotlin.b0;
import android.app.AlertDialog;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0003J*\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001a\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u0002H\u0002J$\u0010)\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0015J\u0016\u0010,\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J/\u00103\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\u000e\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\b\u00105\u001a\u00020\u0002H\u0016R\u0016\u00106\u001a\u00020-8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010C\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u00107R\u001d\u0010O\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010FR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010IR\u001d\u0010V\u001a\u00020R8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010U¨\u0006Y" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/MessageDetailsFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Lkotlin/j2;", "initViews", "Lcom/untis/mobile/messages/data/model/Message;", "message", "setMessageView", "Lcom/untis/mobile/messages/base/Result;", "result", "observeMessageDetailsViewState", "showLoading", "hideLoading", "observeConfirmReadMessageResponse", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "messageRequestConfirmation", "checkSendReadConfirmationAvailability", "Landroid/net/Uri;", "downloadFile", "", "isReply", "observeDownloadAttachmentProgress", "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "attachment", "Landroid/view/View;", "blobAttachmentBtn", "initBlobAttachment", "attachmentFile", "", "mediaType", "openBlobAttachment", "downloadBlobAttachment", "observeMessageDeletionLiveData", "messageId", "showDeleteAlertDialog", "buildReplyDownloadFileDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "messageAttachment", "onAttachmentClick", "onBlobAttachmentClick", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onDestroy", "replyRequestCode", "I", "Landroid/view/View$OnClickListener;", "onBlobAttachmentClickListener", "Landroid/view/View$OnClickListener;", "Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter;", "messageReplyHistoryAdapter", "Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter;", "Lcom/untis/mobile/messages/ui/inbox/viewmodel/InboxViewModel;", "inboxViewModel$delegate", "Lkotlin/b0;", "getInboxViewModel", "()Lcom/untis/mobile/messages/ui/inbox/viewmodel/InboxViewModel;", "inboxViewModel", "Landroid/app/AlertDialog;", "replyDownloadFileDialog", "Landroid/app/AlertDialog;", "Lcom/untis/mobile/messages/data/model/Message;", "mainView", "Landroid/view/View;", "Lcom/untis/mobile/messages/ui/inbox/details/MessageDetailsFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/inbox/details/MessageDetailsFragmentArgs;", "args", "deleteMessageAlert", "replyDownloadFileDialogView", "Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/MessageDetailsViewModel;", "messageDetailsViewModel$delegate", "getMessageDetailsViewModel", "()Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/MessageDetailsViewModel;", "messageDetailsViewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class MessageDetailsFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    private AlertDialog deleteMessageAlert;
    @e
    private final b0 inboxViewModel$delegate;
    private View mainView;
    private Message message;
    @e
    private final b0 messageDetailsViewModel$delegate;
    private MessageReplyHistoryAdapter messageReplyHistoryAdapter;
    private View$OnClickListener onBlobAttachmentClickListener;
    private AlertDialog replyDownloadFileDialog;
    @f
    private View replyDownloadFileDialogView;
    private final int replyRequestCode;
    private final int requestCode;
    
    public MessageDetailsFragment() {
        this.args$delegate = new m(k1.d(MessageDetailsFragmentArgs.class), (a)new MessageDetailsFragment$special$$inlined$navArgs.MessageDetailsFragment$special$$inlined$navArgs$1((Fragment)this));
        this.messageDetailsViewModel$delegate = d0.c((a<?>)new MessageDetailsFragment$special$$inlined$viewModel$default.MessageDetailsFragment$special$$inlined$viewModel$default$1((y)this, (l7.a)null, (a)null));
        this.inboxViewModel$delegate = d0.c((a<?>)new MessageDetailsFragment$special$$inlined$sharedViewModel$default.MessageDetailsFragment$special$$inlined$sharedViewModel$default$2((Fragment)this, (l7.a)null, (a)new MessageDetailsFragment$special$$inlined$sharedViewModel$default.MessageDetailsFragment$special$$inlined$sharedViewModel$default$1((Fragment)this), (a)null));
        this.requestCode = 1002;
        this.replyRequestCode = 1003;
    }
    
    private final void buildReplyDownloadFileDialog() {
        this.replyDownloadFileDialogView = LayoutInflater.from(this.requireContext()).inflate(2131493276, (ViewGroup)null);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.requireContext());
        alertDialog$Builder.setCancelable(false);
        final AlertDialog create = alertDialog$Builder.create();
        k0.o(create, "builder.create()");
        this.replyDownloadFileDialog = create;
        if (create == null) {
            k0.S("replyDownloadFileDialog");
            throw null;
        }
        create.setView(this.replyDownloadFileDialogView);
        final AlertDialog replyDownloadFileDialog = this.replyDownloadFileDialog;
        if (replyDownloadFileDialog == null) {
            k0.S("replyDownloadFileDialog");
            throw null;
        }
        final Window window = replyDownloadFileDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        final AlertDialog replyDownloadFileDialog2 = this.replyDownloadFileDialog;
        if (replyDownloadFileDialog2 != null) {
            final Window window2 = replyDownloadFileDialog2.getWindow();
            if (window2 != null) {
                window2.setGravity(17);
            }
            return;
        }
        k0.S("replyDownloadFileDialog");
        throw null;
    }
    
    private final void checkSendReadConfirmationAvailability(final MessageRequestConfirmation messageRequestConfirmation) {
        if (messageRequestConfirmation != null) {
            final View mainView = this.mainView;
            if (mainView == null) {
                k0.S("mainView");
                throw null;
            }
            ((Button)mainView.findViewById(c.i.HF)).setVisibility(h.U(messageRequestConfirmation.getAllowSendRequestConfirmation(), 0, 1, null));
            final View mainView2 = this.mainView;
            if (mainView2 == null) {
                k0.S("mainView");
                throw null;
            }
            ((FrameLayout)mainView2.findViewById(c.i.EF)).setVisibility(h.U(messageRequestConfirmation.getAllowMessageDeletion() || messageRequestConfirmation.isReplyAllowed(), 0, 1, null));
            final View mainView3 = this.mainView;
            if (mainView3 == null) {
                k0.S("mainView");
                throw null;
            }
            ((ImageButton)mainView3.findViewById(c.i.FF)).setVisibility(h.U(messageRequestConfirmation.isReplyAllowed(), 0, 1, null));
            final View mainView4 = this.mainView;
            if (mainView4 == null) {
                k0.S("mainView");
                throw null;
            }
            ((ImageButton)mainView4.findViewById(c.i.DF)).setVisibility(h.U(messageRequestConfirmation.getAllowMessageDeletion(), 0, 1, null));
            if (!messageRequestConfirmation.getAllowSendRequestConfirmation() && messageRequestConfirmation.getConfirmationDate() == null) {
                final View mainView5 = this.mainView;
                if (mainView5 == null) {
                    k0.S("mainView");
                    throw null;
                }
                final int sf = c.i.SF;
                ((TextView)mainView5.findViewById(sf)).setVisibility(0);
                final View mainView6 = this.mainView;
                if (mainView6 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((TextView)mainView6.findViewById(sf)).setText((CharSequence)this.getString(2131886393));
            }
            else if (!messageRequestConfirmation.getAllowSendRequestConfirmation() && messageRequestConfirmation.getConfirmationDate() != null) {
                final View mainView7 = this.mainView;
                if (mainView7 == null) {
                    k0.S("mainView");
                    throw null;
                }
                final int sf2 = c.i.SF;
                ((TextView)mainView7.findViewById(sf2)).setVisibility(0);
                TextView textView;
                String text;
                if (k0.g(String.valueOf(this.getMessageDetailsViewModel().currentUserId()), messageRequestConfirmation.getConfirmerUserId())) {
                    final View mainView8 = this.mainView;
                    if (mainView8 == null) {
                        k0.S("mainView");
                        throw null;
                    }
                    textView = (TextView)mainView8.findViewById(sf2);
                    final p1 a = p1.a;
                    final String string = this.getString(2131886392);
                    k0.o(string, "getString(R.string.message_read_confirmation_by_me)");
                    text = String.format(string, Arrays.copyOf(new Object[] { MessageRequestConfirmationExtensionsKt.getFormattedConfirmDate(messageRequestConfirmation) }, 1));
                }
                else {
                    final View mainView9 = this.mainView;
                    if (mainView9 == null) {
                        k0.S("mainView");
                        throw null;
                    }
                    final TextView textView2 = (TextView)mainView9.findViewById(sf2);
                    final p1 a2 = p1.a;
                    final String string2 = this.getString(2131886394);
                    k0.o(string2, "getString(R.string.message_read_confirmation_by_someone)");
                    String confirmerUserDisplayName;
                    if ((confirmerUserDisplayName = messageRequestConfirmation.getConfirmerUserDisplayName()) == null) {
                        confirmerUserDisplayName = "?";
                    }
                    text = String.format(string2, Arrays.copyOf(new Object[] { confirmerUserDisplayName, MessageRequestConfirmationExtensionsKt.getFormattedConfirmDate(messageRequestConfirmation) }, 2));
                    textView = textView2;
                }
                k0.o(text, "java.lang.String.format(format, *args)");
                textView.setText((CharSequence)text);
            }
        }
    }
    
    private final void downloadBlobAttachment(final Message message, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        sb.append(message.getId());
        sb.append('-');
        final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
        k0.m(messageBlobAttachment);
        sb.append(messageBlobAttachment.getName());
        final Uri downloadFile = MessageDetailsFragmentExtKt.createDownloadFile(this, sb.toString());
        if (downloadFile == null) {
            return;
        }
        OutputStream openOutputStream;
        if (k0.g(downloadFile.getScheme(), "content")) {
            openOutputStream = this.requireContext().getContentResolver().openOutputStream(downloadFile);
        }
        else {
            openOutputStream = new FileOutputStream(g.a(downloadFile));
        }
        if (openOutputStream == null) {
            return;
        }
        this.getMessageDetailsViewModel().downloadMessageBlobAttachment(openOutputStream, message.getId());
        this.buildReplyDownloadFileDialog();
        this.observeDownloadAttachmentProgress(downloadFile, message, b);
    }
    
    static /* synthetic */ void downloadBlobAttachment$default(final MessageDetailsFragment messageDetailsFragment, final Message message, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        messageDetailsFragment.downloadBlobAttachment(message, b);
    }
    
    private final MessageDetailsFragmentArgs getArgs() {
        return ((b0<MessageDetailsFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final InboxViewModel getInboxViewModel() {
        return this.inboxViewModel$delegate.getValue();
    }
    
    private final MessageDetailsViewModel getMessageDetailsViewModel() {
        return this.messageDetailsViewModel$delegate.getValue();
    }
    
    private final void hideLoading() {
        final View mainView = this.mainView;
        if (mainView != null) {
            ((ProgressBar)mainView.findViewById(c.i.lE)).setVisibility(8);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final void initBlobAttachment(final MessageAttachment messageAttachment, final Message message, final View view, final boolean b) {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView.findViewById(c.i.vF)).setText((CharSequence)messageAttachment.getName());
        final View mainView2 = this.mainView;
        if (mainView2 != null) {
            final ImageView imageView = (ImageView)mainView2.findViewById(c.i.uF);
            k0.o(imageView, "mainView.message_attachment_file_type_icon");
            ExtensionsKt.setAttachmentTypeIcon(imageView, messageAttachment.getName());
            final StringBuilder sb = new StringBuilder();
            sb.append(message.getId());
            sb.append('-');
            sb.append(messageAttachment.getName());
            final String string = sb.toString();
            final Uri checkFileExists = MessageDetailsFragmentExtKt.checkFileExists(this, string);
            Object onBlobAttachmentClickListener;
            if (checkFileExists != null) {
                onBlobAttachmentClickListener = new com.untis.mobile.messages.ui.inbox.details.e(this, checkFileExists, string);
            }
            else {
                onBlobAttachmentClickListener = new com.untis.mobile.messages.ui.inbox.details.h(this, message, b);
            }
            view.setOnClickListener(this.onBlobAttachmentClickListener = (View$OnClickListener)onBlobAttachmentClickListener);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    static /* synthetic */ void initBlobAttachment$default(final MessageDetailsFragment messageDetailsFragment, final MessageAttachment messageAttachment, final Message message, final View view, boolean b, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        messageDetailsFragment.initBlobAttachment(messageAttachment, message, view, b);
    }
    
    private static final void initBlobAttachment$lambda-13(final MessageDetailsFragment messageDetailsFragment, final Uri uri, String fileMediaType, final View view) {
        k0.p(messageDetailsFragment, "this$0");
        k0.p(fileMediaType, "$attachmentFileName");
        fileMediaType = MessageDetailsFragmentExtKt.getFileMediaType(fileMediaType);
        k0.m(fileMediaType);
        messageDetailsFragment.openBlobAttachment(uri, fileMediaType);
    }
    
    private static final void initBlobAttachment$lambda-14(final MessageDetailsFragment messageDetailsFragment, final Message message, final boolean b, final View view) {
        k0.p(messageDetailsFragment, "this$0");
        k0.p(message, "$message");
        if (d.a(messageDetailsFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            messageDetailsFragment.downloadBlobAttachment(message, b);
        }
        else {
            int n;
            if (b) {
                n = messageDetailsFragment.replyRequestCode;
            }
            else {
                n = messageDetailsFragment.requestCode;
            }
            messageDetailsFragment.requestPermissions(new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, n);
        }
    }
    
    private final void initViews() {
        this.getMessageDetailsViewModel().getMessageIdLiveData().n((Object)this.getArgs().getMessageId());
        this.getMessageDetailsViewModel().getMessageDetailsLiveData().j(this.getViewLifecycleOwner(), (l0)new k(this));
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((ImageView)mainView.findViewById(c.i.Vq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.inbox.details.a(this));
        final View mainView2 = this.mainView;
        if (mainView2 != null) {
            ((Button)mainView2.findViewById(c.i.HF)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.inbox.details.c(this));
            this.messageReplyHistoryAdapter = new MessageReplyHistoryAdapter(MessageTypes.INBOX, String.valueOf(this.getMessageDetailsViewModel().currentUserId()), (l<? super MessageAttachment, j2>)new MessageDetailsFragment$initViews.MessageDetailsFragment$initViews$4(this), (p<? super Message, ? super View, j2>)new MessageDetailsFragment$initViews.MessageDetailsFragment$initViews$5(this));
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private static final void initViews$lambda-0(final MessageDetailsFragment messageDetailsFragment, final Result result) {
        k0.p(messageDetailsFragment, "this$0");
        k0.o(result, "it");
        messageDetailsFragment.observeMessageDetailsViewState(result);
    }
    
    private static final void initViews$lambda-1(final MessageDetailsFragment messageDetailsFragment, final View view) {
        k0.p(messageDetailsFragment, "this$0");
        messageDetailsFragment.onBackPressed();
    }
    
    private static final void initViews$lambda-2(final MessageDetailsFragment messageDetailsFragment, final View view) {
        k0.p(messageDetailsFragment, "this$0");
        final MessageDetailsViewModel messageDetailsViewModel = messageDetailsFragment.getMessageDetailsViewModel();
        final Message message = messageDetailsFragment.message;
        if (message != null) {
            messageDetailsViewModel.confirmReadMessage(message.getId());
            return;
        }
        k0.S("message");
        throw null;
    }
    
    private final void observeConfirmReadMessageResponse(final Message message) {
        this.getMessageDetailsViewModel().getConfirmReadMessageStateLiveData().j(this.getViewLifecycleOwner(), (l0)new i(message, this));
    }
    
    private static final void observeConfirmReadMessageResponse$lambda-8(final Message message, final MessageDetailsFragment messageDetailsFragment, final ConfirmReadMessageState confirmReadMessageState) {
        k0.p(message, "$message");
        k0.p(messageDetailsFragment, "this$0");
        if (confirmReadMessageState.isConfirmReadMessageSuccess()) {
            final MessageRequestConfirmation readConfirmationMessage = confirmReadMessageState.getReadConfirmationMessage();
            message.setAllowMessageDeletion(readConfirmationMessage != null && readConfirmationMessage.getAllowMessageDeletion());
            messageDetailsFragment.getInboxViewModel().getLastReadConfirmedMessage().n((Object)message);
            messageDetailsFragment.checkSendReadConfirmationAvailability(confirmReadMessageState.getReadConfirmationMessage());
        }
        else {
            final Context requireContext = messageDetailsFragment.requireContext();
            k0.o(requireContext, "requireContext()");
            final String string = messageDetailsFragment.getString(2131886693);
            k0.o(string, "getString(R.string.shared_error_default_text)");
            h.k(requireContext, s.k2(string, "{0}", "", false, 4, (Object)null));
        }
    }
    
    @SuppressLint({ "SetTextI18n" })
    private final void observeDownloadAttachmentProgress(final Uri uri, final Message message, final boolean b) {
        this.getMessageDetailsViewModel().getDownloadAttachmentStateLiveData().j(this.getViewLifecycleOwner(), (l0)new b(b, this, uri, message));
    }
    
    private static final void observeDownloadAttachmentProgress$lambda-12(final boolean b, final MessageDetailsFragment messageDetailsFragment, final Uri uri, final Message message, final DownloadAttachmentState downloadAttachmentState) {
        k0.p(messageDetailsFragment, "this$0");
        k0.p(uri, "$downloadFile");
        k0.p(message, "$message");
        Label_0374: {
            TextView textView2;
            StringBuilder sb;
            if (b) {
                final View replyDownloadFileDialogView = messageDetailsFragment.replyDownloadFileDialogView;
                if (replyDownloadFileDialogView == null) {
                    break Label_0374;
                }
                final int nf = c.i.NF;
                ((ProgressBar)replyDownloadFileDialogView.findViewById(nf)).setMax((int)downloadAttachmentState.getContentLength());
                ((ProgressBar)replyDownloadFileDialogView.findViewById(nf)).setProgress((int)downloadAttachmentState.getBytesRead());
                final TextView textView = (TextView)replyDownloadFileDialogView.findViewById(c.i.MF);
                final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
                CharSequence name;
                if (messageBlobAttachment == null) {
                    name = null;
                }
                else {
                    name = messageBlobAttachment.getName();
                }
                textView.setText(name);
                final AlertDialog replyDownloadFileDialog = messageDetailsFragment.replyDownloadFileDialog;
                if (replyDownloadFileDialog == null) {
                    k0.S("replyDownloadFileDialog");
                    throw null;
                }
                if (!replyDownloadFileDialog.isShowing()) {
                    final AlertDialog replyDownloadFileDialog2 = messageDetailsFragment.replyDownloadFileDialog;
                    if (replyDownloadFileDialog2 == null) {
                        k0.S("replyDownloadFileDialog");
                        throw null;
                    }
                    replyDownloadFileDialog2.show();
                }
                textView2 = (TextView)replyDownloadFileDialogView.findViewById(c.i.OF);
                sb = new StringBuilder();
            }
            else {
                final View mainView = messageDetailsFragment.mainView;
                if (mainView == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((LinearLayout)mainView.findViewById(c.i.LF)).setVisibility(0);
                final View mainView2 = messageDetailsFragment.mainView;
                if (mainView2 == null) {
                    k0.S("mainView");
                    throw null;
                }
                final int nf2 = c.i.NF;
                ((ProgressBar)mainView2.findViewById(nf2)).setMax((int)downloadAttachmentState.getContentLength());
                final View mainView3 = messageDetailsFragment.mainView;
                if (mainView3 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((ProgressBar)mainView3.findViewById(nf2)).setProgress((int)downloadAttachmentState.getBytesRead());
                final View mainView4 = messageDetailsFragment.mainView;
                if (mainView4 == null) {
                    k0.S("mainView");
                    throw null;
                }
                textView2 = (TextView)mainView4.findViewById(c.i.OF);
                sb = new StringBuilder();
            }
            sb.append(ExtensionsKt.toFileSizeUnit(downloadAttachmentState.getBytesRead()));
            sb.append(" / ");
            sb.append(ExtensionsKt.toFileSizeUnit(downloadAttachmentState.getContentLength()));
            textView2.setText((CharSequence)sb.toString());
        }
        if (downloadAttachmentState.isDone()) {
            if (b) {
                final AlertDialog replyDownloadFileDialog3 = messageDetailsFragment.replyDownloadFileDialog;
                if (replyDownloadFileDialog3 == null) {
                    k0.S("replyDownloadFileDialog");
                    throw null;
                }
                if (replyDownloadFileDialog3.isShowing()) {
                    final AlertDialog replyDownloadFileDialog4 = messageDetailsFragment.replyDownloadFileDialog;
                    if (replyDownloadFileDialog4 == null) {
                        k0.S("replyDownloadFileDialog");
                        throw null;
                    }
                    replyDownloadFileDialog4.dismiss();
                }
            }
            else {
                final View mainView5 = messageDetailsFragment.mainView;
                if (mainView5 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((LinearLayout)mainView5.findViewById(c.i.LF)).setVisibility(8);
                final View mainView6 = messageDetailsFragment.mainView;
                if (mainView6 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((LinearLayout)mainView6.findViewById(c.i.AF)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.inbox.details.d(messageDetailsFragment, uri, message));
            }
            final MessageAttachment messageBlobAttachment2 = message.getMessageBlobAttachment();
            k0.m(messageBlobAttachment2);
            final String fileMediaType = MessageDetailsFragmentExtKt.getFileMediaType(messageBlobAttachment2.getName());
            k0.m(fileMediaType);
            messageDetailsFragment.openBlobAttachment(uri, fileMediaType);
        }
    }
    
    private static final void observeDownloadAttachmentProgress$lambda-12$lambda-11(final MessageDetailsFragment messageDetailsFragment, final Uri uri, final Message message, final View view) {
        k0.p(messageDetailsFragment, "this$0");
        k0.p(uri, "$downloadFile");
        k0.p(message, "$message");
        final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
        k0.m(messageBlobAttachment);
        final String fileMediaType = MessageDetailsFragmentExtKt.getFileMediaType(messageBlobAttachment.getName());
        k0.m(fileMediaType);
        messageDetailsFragment.openBlobAttachment(uri, fileMediaType);
    }
    
    private final void observeMessageDeletionLiveData() {
        this.getMessageDetailsViewModel().getDeleteMessageLiveData().j(this.getViewLifecycleOwner(), (l0)new j(this));
    }
    
    private static final void observeMessageDeletionLiveData$lambda-15(final MessageDetailsFragment messageDetailsFragment, final Result result) {
        k0.p(messageDetailsFragment, "this$0");
        final int n = WhenMappings.$EnumSwitchMapping$0[result.getStatus().ordinal()];
        if (n != 1) {
            if (n == 2) {
                final Context requireContext = messageDetailsFragment.requireContext();
                k0.o(requireContext, "requireContext()");
                final String string = messageDetailsFragment.getString(2131886693);
                k0.o(string, "getString(R.string.shared_error_default_text)");
                h.k(requireContext, s.k2(string, "{0}", "", false, 4, (Object)null));
            }
        }
        else {
            messageDetailsFragment.getInboxViewModel().getDeletedMessagePosition().n((Object)messageDetailsFragment.getArgs().getMessagePosition());
            messageDetailsFragment.onBackPressed();
        }
    }
    
    private final void observeMessageDetailsViewState(final Result<Message> result) {
        final int n = WhenMappings.$EnumSwitchMapping$0[result.getStatus().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    this.showLoading();
                }
            }
            else {
                this.hideLoading();
                final Context requireContext = this.requireContext();
                k0.o(requireContext, "requireContext()");
                final String string = this.getString(2131886693);
                k0.o(string, "getString(R.string.shared_error_default_text)");
                h.k(requireContext, s.k2(string, "{0}", "", false, 4, (Object)null));
            }
        }
        else {
            final Message messageView = result.getData();
            if (messageView != null) {
                this.setMessageView(messageView);
            }
            this.hideLoading();
        }
    }
    
    private final void openBlobAttachment(Uri e, final String s) {
        try {
            final Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addFlags(1);
            if (!k0.g(e.getScheme(), "content")) {
                e = FileProvider.e(this.requireContext(), "com.grupet.web.app", g.a(e));
            }
            intent.setDataAndType(e, s);
            this.startActivity(Intent.createChooser(intent, (CharSequence)"Open File"));
        }
        catch (Exception ex) {
            timber.log.b.f((Throwable)ex);
        }
        catch (ActivityNotFoundException ex2) {
            final Context requireContext = this.requireContext();
            k0.o(requireContext, "requireContext()");
            h.k(requireContext, "Unsupported File!");
        }
    }
    
    private final void setMessageView(final Message message) {
        this.message = message;
        this.checkSendReadConfirmationAvailability(message.getMessageRequestConfirmation());
        this.observeConfirmReadMessageResponse(message);
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        final TextView textView = (TextView)mainView.findViewById(c.i.IF);
        final Sender sender = message.getSender();
        CharSequence displayName;
        if (sender == null) {
            displayName = null;
        }
        else {
            displayName = sender.getDisplayName();
        }
        textView.setText(displayName);
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView2.findViewById(c.i.KF)).setText((CharSequence)message.getSubject());
        final View mainView3 = this.mainView;
        if (mainView3 == null) {
            k0.S("mainView");
            throw null;
        }
        final int zf = c.i.zF;
        final RecyclerView recyclerView = (RecyclerView)mainView3.findViewById(zf);
        final List<MessageAttachment> attachments = message.getAttachments();
        ((ViewGroup)recyclerView).setVisibility(h.U(attachments != null && !attachments.isEmpty() && !message.isReportMessage(), 0, 1, null));
        final View mainView4 = this.mainView;
        if (mainView4 == null) {
            k0.S("mainView");
            throw null;
        }
        final RecyclerView recyclerView2 = (RecyclerView)mainView4.findViewById(zf);
        List<MessageAttachment> list;
        if ((list = message.getAttachments()) == null) {
            list = v.E();
        }
        recyclerView2.setAdapter((RecyclerView$h)new MessageAttachmentAdapter(list, (l<? super MessageAttachment, j2>)new MessageDetailsFragment$setMessageView.MessageDetailsFragment$setMessageView$1(this)));
        final View mainView5 = this.mainView;
        if (mainView5 == null) {
            k0.S("mainView");
            throw null;
        }
        final int jf = c.i.JF;
        ((TextView)mainView5.findViewById(jf)).setText((CharSequence)MessageExtensionsKt.getDetailsFormattedSentDate(message, d.f(this.requireContext(), 2131099984)), TextView$BufferType.SPANNABLE);
        final View mainView6 = this.mainView;
        if (mainView6 == null) {
            k0.S("mainView");
            throw null;
        }
        final int af = c.i.AF;
        ((LinearLayout)mainView6.findViewById(af)).setVisibility(h.U(message.getMessageBlobAttachment() != null, 0, 1, null));
        final View mainView7 = this.mainView;
        if (mainView7 == null) {
            k0.S("mainView");
            throw null;
        }
        final TextView textView2 = (TextView)mainView7.findViewById(c.i.CF);
        String text = null;
        Label_0414: {
            int n;
            if (message.isReportMessage()) {
                n = 2131886389;
            }
            else {
                final String content = message.getContent();
                if (content != null && !s.U1((CharSequence)content)) {
                    text = message.getContent();
                    break Label_0414;
                }
                n = 2131886426;
            }
            text = this.getString(n);
        }
        textView2.setText((CharSequence)text);
        if (!message.isReportMessage()) {
            final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
            if (messageBlobAttachment != null) {
                final View mainView8 = this.mainView;
                if (mainView8 == null) {
                    k0.S("mainView");
                    throw null;
                }
                final LinearLayout linearLayout = (LinearLayout)mainView8.findViewById(af);
                k0.o(linearLayout, "mainView.message_details_blob_attachment_btn");
                initBlobAttachment$default(this, messageBlobAttachment, message, (View)linearLayout, false, 8, null);
            }
        }
        final View mainView9 = this.mainView;
        if (mainView9 == null) {
            k0.S("mainView");
            throw null;
        }
        ((FrameLayout)mainView9.findViewById(c.i.EF)).setVisibility(h.U(message.getAllowMessageDeletion() || message.isReplyAllowed(), 0, 1, null));
        final View mainView10 = this.mainView;
        if (mainView10 == null) {
            k0.S("mainView");
            throw null;
        }
        final int ff = c.i.FF;
        ((ImageButton)mainView10.findViewById(ff)).setVisibility(h.U(message.isReplyAllowed(), 0, 1, null));
        final View mainView11 = this.mainView;
        if (mainView11 == null) {
            k0.S("mainView");
            throw null;
        }
        final int df = c.i.DF;
        ((ImageButton)mainView11.findViewById(df)).setVisibility(h.U(message.getAllowMessageDeletion(), 0, 1, null));
        final View mainView12 = this.mainView;
        if (mainView12 == null) {
            k0.S("mainView");
            throw null;
        }
        ((ImageButton)mainView12.findViewById(df)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.inbox.details.g(this, message));
        final View mainView13 = this.mainView;
        if (mainView13 == null) {
            k0.S("mainView");
            throw null;
        }
        ((ImageButton)mainView13.findViewById(ff)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.inbox.details.f(this, message));
        final View mainView14 = this.mainView;
        if (mainView14 == null) {
            k0.S("mainView");
            throw null;
        }
        final int gf = c.i.GF;
        ((ViewGroup)mainView14.findViewById(gf)).setVisibility(h.U(message.getReplyHistory().isEmpty() ^ true, 0, 1, null));
        final View mainView15 = this.mainView;
        if (mainView15 == null) {
            k0.S("mainView");
            throw null;
        }
        ((ScrollView)mainView15.findViewById(c.i.BF)).setVisibility(h.U(message.getReplyHistory().isEmpty(), 0, 1, null));
        final View mainView16 = this.mainView;
        if (mainView16 == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView16.findViewById(jf)).setVisibility(h.U(message.getReplyHistory().isEmpty(), 0, 1, null));
        if (message.getReplyHistory().isEmpty() ^ true) {
            final List<Message> l5 = v.L5((Collection<? extends Message>)message.getReplyHistory());
            l5.add(0, message);
            final MessageReplyHistoryAdapter messageReplyHistoryAdapter = this.messageReplyHistoryAdapter;
            if (messageReplyHistoryAdapter == null) {
                k0.S("messageReplyHistoryAdapter");
                throw null;
            }
            messageReplyHistoryAdapter.submitList(l5);
        }
        final View mainView17 = this.mainView;
        if (mainView17 == null) {
            k0.S("mainView");
            throw null;
        }
        final RecyclerView recyclerView3 = (RecyclerView)mainView17.findViewById(gf);
        final MessageReplyHistoryAdapter messageReplyHistoryAdapter2 = this.messageReplyHistoryAdapter;
        if (messageReplyHistoryAdapter2 != null) {
            recyclerView3.setAdapter((RecyclerView$h)messageReplyHistoryAdapter2);
            return;
        }
        k0.S("messageReplyHistoryAdapter");
        throw null;
    }
    
    private static final void setMessageView$lambda-4(final MessageDetailsFragment messageDetailsFragment, final Message message, final View view) {
        k0.p(messageDetailsFragment, "this$0");
        k0.p(message, "$message");
        messageDetailsFragment.showDeleteAlertDialog(message.getId());
        messageDetailsFragment.observeMessageDeletionLiveData();
    }
    
    private static final void setMessageView$lambda-5(final MessageDetailsFragment messageDetailsFragment, final Message message, final View view) {
        k0.p(messageDetailsFragment, "this$0");
        k0.p(message, "$message");
        androidx.navigation.fragment.c.a((Fragment)messageDetailsFragment).D(MessageDetailsFragmentDirections.Companion.actionMessageDetailsFragmentToReplyMessageEditorFragment(SendMessageTypes.REPLY, false, 0, message, SendMessageActions.REPLY_MESSAGE));
    }
    
    private final void showDeleteAlertDialog(final String s) {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "this.requireContext()");
        final AlertDialog create = UiUtilsKt.getDeleteOrRevokeMessageAlertDialog$default(requireContext, (l)new MessageDetailsFragment$showDeleteAlertDialog$deleteMessageAlertBuilder.MessageDetailsFragment$showDeleteAlertDialog$deleteMessageAlertBuilder$1(this, s), (l)MessageDetailsFragment$showDeleteAlertDialog$deleteMessageAlertBuilder.MessageDetailsFragment$showDeleteAlertDialog$deleteMessageAlertBuilder$2.INSTANCE, null, 8, null).create();
        k0.o(create, "deleteMessageAlertBuilder.create()");
        this.deleteMessageAlert = create;
        if (create != null) {
            create.show();
            return;
        }
        k0.S("deleteMessageAlert");
        throw null;
    }
    
    private final void showLoading() {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((ProgressBar)mainView.findViewById(c.i.lE)).setVisibility(0);
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        ((ScrollView)mainView2.findViewById(c.i.BF)).setVisibility(8);
        final View mainView3 = this.mainView;
        if (mainView3 != null) {
            ((ViewGroup)mainView3.findViewById(c.i.GF)).setVisibility(8);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public final void onAttachmentClick(@e final MessageAttachment messageAttachment) {
        k0.p(messageAttachment, "messageAttachment");
        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(messageAttachment.getDownloadUrl())));
    }
    
    public final void onBlobAttachmentClick(@e final Message message, @e final View view) {
        k0.p(message, "message");
        k0.p(view, "blobAttachmentBtn");
        final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
        if (messageBlobAttachment != null) {
            this.initBlobAttachment(messageBlobAttachment, this.message = message, view, true);
            view.performClick();
        }
    }
    
    @e
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493298, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.messages_fragment_message_details, container, false)");
        this.mainView = inflate;
        this.initViews();
        final View mainView = this.mainView;
        if (mainView != null) {
            return mainView;
        }
        k0.S("mainView");
        throw null;
    }
    
    public void onDestroy() {
        super.onDestroy();
        final AlertDialog replyDownloadFileDialog = this.replyDownloadFileDialog;
        if (replyDownloadFileDialog != null) {
            if (replyDownloadFileDialog == null) {
                k0.S("replyDownloadFileDialog");
                throw null;
            }
            if (replyDownloadFileDialog.isShowing()) {
                final AlertDialog replyDownloadFileDialog2 = this.replyDownloadFileDialog;
                if (replyDownloadFileDialog2 == null) {
                    k0.S("replyDownloadFileDialog");
                    throw null;
                }
                replyDownloadFileDialog2.dismiss();
            }
        }
    }
    
    public void onRequestPermissionsResult(final int n, @e final String[] array, @e final int[] array2) {
        k0.p(array, "permissions");
        k0.p(array2, "grantResults");
        super.onRequestPermissionsResult(n, array, array2);
        if ((array2.length == 0 ^ true) && array2[0] == 0) {
            if (n == this.replyRequestCode) {
                final Message message = this.message;
                if (message == null) {
                    k0.S("message");
                    throw null;
                }
                this.downloadBlobAttachment(message, true);
            }
            else {
                final Message message2 = this.message;
                if (message2 == null) {
                    k0.S("message");
                    throw null;
                }
                downloadBlobAttachment$default(this, message2, false, 2, null);
            }
        }
    }
}
