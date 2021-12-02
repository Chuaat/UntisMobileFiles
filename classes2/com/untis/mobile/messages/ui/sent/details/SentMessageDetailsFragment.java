// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.details;

import android.widget.FrameLayout;
import android.os.Bundle;
import android.content.DialogInterface;
import com.untis.mobile.messages.util.UiUtilsKt;
import java.util.List;
import android.widget.ScrollView;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.Collection;
import android.widget.TextView$BufferType;
import com.untis.mobile.messages.data.model.extension.MessageExtensionsKt;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.messages.ui.inbox.details.adapter.MessageAttachmentAdapter;
import kotlin.collections.v;
import androidx.cardview.widget.CardView;
import android.content.ActivityNotFoundException;
import androidx.core.content.FileProvider;
import android.content.Intent;
import android.content.Context;
import com.untis.mobile.messages.util.AlertDialogTypes;
import kotlin.text.s;
import android.widget.ImageButton;
import com.untis.mobile.messages.base.Result;
import android.widget.LinearLayout;
import com.untis.mobile.messages.ui.inbox.details.viewmodel.DownloadAttachmentState;
import android.annotation.SuppressLint;
import androidx.lifecycle.l0;
import n6.p;
import kotlin.j2;
import n6.l;
import com.untis.mobile.messages.ui.common.MessageTypes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.core.content.d;
import com.untis.mobile.messages.util.ExtensionsKt;
import android.widget.ImageView;
import android.widget.TextView;
import com.untis.mobile.c;
import android.widget.ProgressBar;
import com.untis.mobile.messages.ui.sent.viewmodel.SentMessagesViewModel;
import java.io.OutputStream;
import android.net.Uri;
import com.untis.mobile.messages.data.model.MessageAttachment;
import java.io.FileOutputStream;
import androidx.core.net.g;
import com.untis.mobile.ui.fragments.common.UmFragment;
import com.untis.mobile.messages.util.MessageDetailsFragmentExtKt;
import android.view.Window;
import kotlin.jvm.internal.k0;
import android.app.AlertDialog$Builder;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.messages.ui.sent.details.viewmodel.SentMessageDetailsViewModel;
import com.untis.mobile.messages.data.model.RequestConfirmationStatus;
import kotlin.d0;
import androidx.lifecycle.y;
import n6.a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import com.untis.mobile.messages.ui.common.MessageReplyHistoryAdapter;
import kotlin.b0;
import org.jetbrains.annotations.f;
import com.untis.mobile.messages.ui.sent.details.adapter.SentMessageRecipientsListAdapter;
import android.view.View$OnClickListener;
import com.untis.mobile.messages.data.model.Message;
import android.view.View;
import android.app.AlertDialog;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\\\u0010]J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J*\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001a\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0003J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J \u0010#\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0005H\u0002J$\u0010+\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010,\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J/\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020 2\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000e\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\fJ\u0016\u00106\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u00107\u001a\u00020\u0005H\u0016R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020 8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010-\u001a\u00020 8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010?R\u0018\u0010M\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001d\u0010T\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010Y\u001a\u00020U8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010B\u001a\u0004\bW\u0010XR\u0016\u0010Z\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010:R\u0016\u0010[\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010N¨\u0006^" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/details/SentMessageDetailsFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Lcom/untis/mobile/messages/base/Result;", "Lcom/untis/mobile/messages/data/model/Message;", "result", "Lkotlin/j2;", "observeMessageDetailsViewState", "showLoading", "hideLoading", "initViews", "message", "setMessageView", "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "attachment", "Landroid/view/View;", "blobAttachmentBtn", "", "isReply", "initBlobAttachment", "Landroid/net/Uri;", "attachmentFile", "", "mediaType", "openBlobAttachment", "downloadBlobAttachment", "downloadFile", "observeDownloadAttachmentProgress", "observeMessageDeletionLiveData", "messageId", "Lcom/untis/mobile/messages/util/AlertDialogTypes;", "type", "showDeleteOrRevokeAlertDialog", "", "numberOfConfirms", "totalConfirmations", "navigateToReadConfirmationsView", "buildReplyDownloadFileDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onActivityCreated", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "messageAttachment", "onAttachmentClick", "onBlobAttachmentClick", "onDestroy", "Landroid/app/AlertDialog;", "deleteMessageAlert", "Landroid/app/AlertDialog;", "Lcom/untis/mobile/messages/ui/sent/details/adapter/SentMessageRecipientsListAdapter;", "recipientsListAdapter", "Lcom/untis/mobile/messages/ui/sent/details/adapter/SentMessageRecipientsListAdapter;", "replyRequestCode", "I", "Lcom/untis/mobile/messages/ui/sent/viewmodel/SentMessagesViewModel;", "sentMessagesViewModel$delegate", "Lkotlin/b0;", "getSentMessagesViewModel", "()Lcom/untis/mobile/messages/ui/sent/viewmodel/SentMessagesViewModel;", "sentMessagesViewModel", "Lcom/untis/mobile/messages/data/model/Message;", "Landroid/view/View$OnClickListener;", "onBlobAttachmentClickListener", "Landroid/view/View$OnClickListener;", "Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter;", "sentMessageReplyHistoryAdapter", "Lcom/untis/mobile/messages/ui/common/MessageReplyHistoryAdapter;", "replyDownloadFileDialogView", "Landroid/view/View;", "Lcom/untis/mobile/messages/ui/sent/details/SentMessageDetailsFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/sent/details/SentMessageDetailsFragmentArgs;", "args", "Lcom/untis/mobile/messages/ui/sent/details/viewmodel/SentMessageDetailsViewModel;", "sentMessageDetailsViewModel$delegate", "getSentMessageDetailsViewModel", "()Lcom/untis/mobile/messages/ui/sent/details/viewmodel/SentMessageDetailsViewModel;", "sentMessageDetailsViewModel", "replyDownloadFileDialog", "mainView", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class SentMessageDetailsFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    private AlertDialog deleteMessageAlert;
    private View mainView;
    private Message message;
    private View$OnClickListener onBlobAttachmentClickListener;
    @e
    private final SentMessageRecipientsListAdapter recipientsListAdapter;
    private AlertDialog replyDownloadFileDialog;
    @f
    private View replyDownloadFileDialogView;
    private final int replyRequestCode;
    private final int requestCode;
    @e
    private final b0 sentMessageDetailsViewModel$delegate;
    private MessageReplyHistoryAdapter sentMessageReplyHistoryAdapter;
    @e
    private final b0 sentMessagesViewModel$delegate;
    
    public SentMessageDetailsFragment() {
        this.args$delegate = new m(k1.d(SentMessageDetailsFragmentArgs.class), (a)new SentMessageDetailsFragment$special$$inlined$navArgs.SentMessageDetailsFragment$special$$inlined$navArgs$1((Fragment)this));
        this.sentMessageDetailsViewModel$delegate = d0.c((a<?>)new SentMessageDetailsFragment$special$$inlined$viewModel$default.SentMessageDetailsFragment$special$$inlined$viewModel$default$1((y)this, (l7.a)null, (a)null));
        this.sentMessagesViewModel$delegate = d0.c((a<?>)new SentMessageDetailsFragment$special$$inlined$sharedViewModel$default.SentMessageDetailsFragment$special$$inlined$sharedViewModel$default$2((Fragment)this, (l7.a)null, (a)new SentMessageDetailsFragment$special$$inlined$sharedViewModel$default.SentMessageDetailsFragment$special$$inlined$sharedViewModel$default$1((Fragment)this), (a)null));
        this.requestCode = 1002;
        this.replyRequestCode = 1003;
        this.recipientsListAdapter = new SentMessageRecipientsListAdapter();
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
        this.getSentMessageDetailsViewModel().downloadMessageBlobAttachment(openOutputStream, message.getId());
        this.buildReplyDownloadFileDialog();
        this.observeDownloadAttachmentProgress(downloadFile, message, b);
    }
    
    static /* synthetic */ void downloadBlobAttachment$default(final SentMessageDetailsFragment sentMessageDetailsFragment, final Message message, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        sentMessageDetailsFragment.downloadBlobAttachment(message, b);
    }
    
    private final SentMessageDetailsFragmentArgs getArgs() {
        return ((b0<SentMessageDetailsFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final SentMessageDetailsViewModel getSentMessageDetailsViewModel() {
        return this.sentMessageDetailsViewModel$delegate.getValue();
    }
    
    private final SentMessagesViewModel getSentMessagesViewModel() {
        return this.sentMessagesViewModel$delegate.getValue();
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
            final ImageView imageView = (ImageView)mainView2.findViewById(c.i.zL);
            k0.o(imageView, "mainView.sent_message_attachment_file_type_icon");
            ExtensionsKt.setAttachmentTypeIcon(imageView, messageAttachment.getName());
            final StringBuilder sb = new StringBuilder();
            sb.append(message.getId());
            sb.append('-');
            sb.append(messageAttachment.getName());
            final String string = sb.toString();
            final Uri checkFileExists = MessageDetailsFragmentExtKt.checkFileExists(this, string);
            Object onBlobAttachmentClickListener;
            if (checkFileExists != null) {
                onBlobAttachmentClickListener = new com.untis.mobile.messages.ui.sent.details.c(this, checkFileExists, string);
            }
            else {
                onBlobAttachmentClickListener = new com.untis.mobile.messages.ui.sent.details.f(this, message, b);
            }
            view.setOnClickListener(this.onBlobAttachmentClickListener = (View$OnClickListener)onBlobAttachmentClickListener);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    static /* synthetic */ void initBlobAttachment$default(final SentMessageDetailsFragment sentMessageDetailsFragment, final MessageAttachment messageAttachment, final Message message, final View view, boolean b, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        sentMessageDetailsFragment.initBlobAttachment(messageAttachment, message, view, b);
    }
    
    private static final void initBlobAttachment$lambda-10(final SentMessageDetailsFragment sentMessageDetailsFragment, final Message message, final boolean b, final View view) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.p(message, "$message");
        if (d.a(sentMessageDetailsFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            sentMessageDetailsFragment.downloadBlobAttachment(message, b);
        }
        else {
            int n;
            if (b) {
                n = sentMessageDetailsFragment.replyRequestCode;
            }
            else {
                n = sentMessageDetailsFragment.requestCode;
            }
            sentMessageDetailsFragment.requestPermissions(new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, n);
        }
    }
    
    private static final void initBlobAttachment$lambda-9(final SentMessageDetailsFragment sentMessageDetailsFragment, final Uri uri, String fileMediaType, final View view) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.p(fileMediaType, "$attachmentFileName");
        fileMediaType = MessageDetailsFragmentExtKt.getFileMediaType(fileMediaType);
        k0.m(fileMediaType);
        sentMessageDetailsFragment.openBlobAttachment(uri, fileMediaType);
    }
    
    private final void initViews() {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((RecyclerView)mainView.findViewById(c.i.GL)).setAdapter((RecyclerView$h)this.recipientsListAdapter);
        final View mainView2 = this.mainView;
        if (mainView2 != null) {
            ((ImageView)mainView2.findViewById(c.i.Is)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.details.a(this));
            this.sentMessageReplyHistoryAdapter = new MessageReplyHistoryAdapter(MessageTypes.SENT, String.valueOf(this.getSentMessageDetailsViewModel().currentUserId()), (l<? super MessageAttachment, j2>)new SentMessageDetailsFragment$initViews.SentMessageDetailsFragment$initViews$2(this), (p<? super Message, ? super View, j2>)new SentMessageDetailsFragment$initViews.SentMessageDetailsFragment$initViews$3(this));
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private static final void initViews$lambda-3(final SentMessageDetailsFragment sentMessageDetailsFragment, final View view) {
        k0.p(sentMessageDetailsFragment, "this$0");
        sentMessageDetailsFragment.onBackPressed();
    }
    
    private final void navigateToReadConfirmationsView(final int n, final int n2, final String s) {
        androidx.navigation.fragment.c.a((Fragment)this).D(SentMessageDetailsFragmentDirections.Companion.actionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment(n, n2, s));
    }
    
    @SuppressLint({ "SetTextI18n" })
    private final void observeDownloadAttachmentProgress(final Uri uri, final Message message, final boolean b) {
        this.getSentMessageDetailsViewModel().getDownloadAttachmentStateLiveData().j(this.getViewLifecycleOwner(), (l0)new j(b, this, uri, message));
    }
    
    private static final void observeDownloadAttachmentProgress$lambda-13(final boolean b, final SentMessageDetailsFragment sentMessageDetailsFragment, final Uri uri, final Message message, final DownloadAttachmentState downloadAttachmentState) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.p(uri, "$downloadFile");
        k0.p(message, "$message");
        Label_0374: {
            TextView textView2;
            StringBuilder sb;
            if (b) {
                final View replyDownloadFileDialogView = sentMessageDetailsFragment.replyDownloadFileDialogView;
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
                final AlertDialog replyDownloadFileDialog = sentMessageDetailsFragment.replyDownloadFileDialog;
                if (replyDownloadFileDialog == null) {
                    k0.S("replyDownloadFileDialog");
                    throw null;
                }
                if (!replyDownloadFileDialog.isShowing()) {
                    final AlertDialog replyDownloadFileDialog2 = sentMessageDetailsFragment.replyDownloadFileDialog;
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
                final View mainView = sentMessageDetailsFragment.mainView;
                if (mainView == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((LinearLayout)mainView.findViewById(c.i.LF)).setVisibility(0);
                final View mainView2 = sentMessageDetailsFragment.mainView;
                if (mainView2 == null) {
                    k0.S("mainView");
                    throw null;
                }
                final int nf2 = c.i.NF;
                ((ProgressBar)mainView2.findViewById(nf2)).setMax((int)downloadAttachmentState.getContentLength());
                final View mainView3 = sentMessageDetailsFragment.mainView;
                if (mainView3 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((ProgressBar)mainView3.findViewById(nf2)).setProgress((int)downloadAttachmentState.getBytesRead());
                final View mainView4 = sentMessageDetailsFragment.mainView;
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
                final AlertDialog replyDownloadFileDialog3 = sentMessageDetailsFragment.replyDownloadFileDialog;
                if (replyDownloadFileDialog3 == null) {
                    k0.S("replyDownloadFileDialog");
                    throw null;
                }
                if (replyDownloadFileDialog3.isShowing()) {
                    final AlertDialog replyDownloadFileDialog4 = sentMessageDetailsFragment.replyDownloadFileDialog;
                    if (replyDownloadFileDialog4 == null) {
                        k0.S("replyDownloadFileDialog");
                        throw null;
                    }
                    replyDownloadFileDialog4.dismiss();
                }
            }
            else {
                final View mainView5 = sentMessageDetailsFragment.mainView;
                if (mainView5 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((LinearLayout)mainView5.findViewById(c.i.LF)).setVisibility(8);
                final View mainView6 = sentMessageDetailsFragment.mainView;
                if (mainView6 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((LinearLayout)mainView6.findViewById(c.i.BL)).setOnClickListener((View$OnClickListener)new b(sentMessageDetailsFragment, uri, message));
            }
            final MessageAttachment messageBlobAttachment2 = message.getMessageBlobAttachment();
            k0.m(messageBlobAttachment2);
            final String fileMediaType = MessageDetailsFragmentExtKt.getFileMediaType(messageBlobAttachment2.getName());
            k0.m(fileMediaType);
            sentMessageDetailsFragment.openBlobAttachment(uri, fileMediaType);
        }
    }
    
    private static final void observeDownloadAttachmentProgress$lambda-13$lambda-12(final SentMessageDetailsFragment sentMessageDetailsFragment, final Uri uri, final Message message, final View view) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.p(uri, "$downloadFile");
        k0.p(message, "$message");
        final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
        k0.m(messageBlobAttachment);
        final String fileMediaType = MessageDetailsFragmentExtKt.getFileMediaType(messageBlobAttachment.getName());
        k0.m(fileMediaType);
        sentMessageDetailsFragment.openBlobAttachment(uri, fileMediaType);
    }
    
    private final void observeMessageDeletionLiveData() {
        this.getSentMessageDetailsViewModel().getDeleteOrRevokeMessageLiveData().j(this.getViewLifecycleOwner(), (l0)new h(this));
    }
    
    private static final void observeMessageDeletionLiveData$lambda-14(final SentMessageDetailsFragment sentMessageDetailsFragment, final Result result) {
        k0.p(sentMessageDetailsFragment, "this$0");
        final int n = WhenMappings.$EnumSwitchMapping$0[result.getStatus().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    final View mainView = sentMessageDetailsFragment.mainView;
                    if (mainView == null) {
                        k0.S("mainView");
                        throw null;
                    }
                    ((ImageButton)mainView.findViewById(c.i.EL)).setClickable(false);
                    final View mainView2 = sentMessageDetailsFragment.mainView;
                    if (mainView2 == null) {
                        k0.S("mainView");
                        throw null;
                    }
                    ((ImageButton)mainView2.findViewById(c.i.IL)).setClickable(false);
                    final View mainView3 = sentMessageDetailsFragment.mainView;
                    if (mainView3 == null) {
                        k0.S("mainView");
                        throw null;
                    }
                    ((ProgressBar)mainView3.findViewById(c.i.lE)).setVisibility(0);
                }
            }
            else {
                final View mainView4 = sentMessageDetailsFragment.mainView;
                if (mainView4 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((ImageButton)mainView4.findViewById(c.i.EL)).setClickable(true);
                final View mainView5 = sentMessageDetailsFragment.mainView;
                if (mainView5 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((ImageButton)mainView5.findViewById(c.i.IL)).setClickable(true);
                final Context requireContext = sentMessageDetailsFragment.requireContext();
                k0.o(requireContext, "requireContext()");
                final String string = sentMessageDetailsFragment.getString(2131886693);
                k0.o(string, "getString(R.string.shared_error_default_text)");
                com.untis.mobile.utils.extension.h.k(requireContext, s.k2(string, "{0}", "", false, 4, (Object)null));
            }
        }
        else {
            sentMessageDetailsFragment.getSentMessagesViewModel().getDeletedMessageFromDetailsPosition().n((Object)sentMessageDetailsFragment.getArgs().getMessagePosition());
            final View mainView6 = sentMessageDetailsFragment.mainView;
            if (mainView6 == null) {
                k0.S("mainView");
                throw null;
            }
            ((ProgressBar)mainView6.findViewById(c.i.lE)).setVisibility(8);
            if (result.getData() == AlertDialogTypes.REVOKE) {
                final Context requireContext2 = sentMessageDetailsFragment.requireContext();
                k0.o(requireContext2, "requireContext()");
                com.untis.mobile.utils.extension.h.o(requireContext2, 2131886403);
            }
            sentMessageDetailsFragment.onBackPressed();
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
                timber.log.b.e(String.valueOf(result.getMessage()), new Object[0]);
                this.hideLoading();
                final Context requireContext = this.requireContext();
                k0.o(requireContext, "requireContext()");
                final String string = this.getString(2131886693);
                k0.o(string, "getString(R.string.shared_error_default_text)");
                com.untis.mobile.utils.extension.h.k(requireContext, s.k2(string, "{0}", "", false, 4, (Object)null));
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
    
    private static final void onActivityCreated$lambda-0(final SentMessageDetailsFragment sentMessageDetailsFragment, final Result result) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.o(result, "it");
        sentMessageDetailsFragment.observeMessageDetailsViewState(result);
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
            com.untis.mobile.utils.extension.h.k(requireContext, "Unsupported File!");
        }
    }
    
    private final void setMessageView(final Message message) {
        this.message = message;
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((FrameLayout)mainView.findViewById(c.i.FL)).setVisibility(com.untis.mobile.utils.extension.h.U(message.getAllowMessageDeletion(), 0, 1, null));
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        final int al = c.i.AL;
        final RecyclerView recyclerView = (RecyclerView)mainView2.findViewById(al);
        final List<MessageAttachment> attachments = message.getAttachments();
        ((ViewGroup)recyclerView).setVisibility(com.untis.mobile.utils.extension.h.U((attachments == null || attachments.isEmpty()) ^ true, 0, 1, null));
        final View mainView3 = this.mainView;
        if (mainView3 == null) {
            k0.S("mainView");
            throw null;
        }
        final RecyclerView recyclerView2 = (RecyclerView)mainView3.findViewById(al);
        List<MessageAttachment> list;
        if ((list = message.getAttachments()) == null) {
            list = v.E();
        }
        recyclerView2.setAdapter((RecyclerView$h)new MessageAttachmentAdapter(list, (l<? super MessageAttachment, j2>)new SentMessageDetailsFragment$setMessageView.SentMessageDetailsFragment$setMessageView$1(this)));
        final View mainView4 = this.mainView;
        if (mainView4 == null) {
            k0.S("mainView");
            throw null;
        }
        final int jl = c.i.JL;
        ((TextView)mainView4.findViewById(jl)).setText((CharSequence)MessageExtensionsKt.getDetailsFormattedSentDate(message, d.f(this.requireContext(), 2131099984)), TextView$BufferType.SPANNABLE);
        final View mainView5 = this.mainView;
        if (mainView5 == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView5.findViewById(c.i.KL)).setText((CharSequence)message.getSubject());
        final View mainView6 = this.mainView;
        if (mainView6 == null) {
            k0.S("mainView");
            throw null;
        }
        final int bl = c.i.BL;
        ((LinearLayout)mainView6.findViewById(bl)).setVisibility(com.untis.mobile.utils.extension.h.U(message.getMessageBlobAttachment() != null, 0, 1, null));
        final View mainView7 = this.mainView;
        if (mainView7 == null) {
            k0.S("mainView");
            throw null;
        }
        final TextView textView = (TextView)mainView7.findViewById(c.i.DL);
        final String content = message.getContent();
        String text;
        if (content == null || s.U1((CharSequence)content)) {
            text = this.getString(2131886426);
        }
        else {
            text = message.getContent();
        }
        textView.setText((CharSequence)text);
        final MessageAttachment messageBlobAttachment = message.getMessageBlobAttachment();
        if (messageBlobAttachment != null) {
            final View mainView8 = this.mainView;
            if (mainView8 == null) {
                k0.S("mainView");
                throw null;
            }
            final LinearLayout linearLayout = (LinearLayout)mainView8.findViewById(bl);
            k0.o(linearLayout, "mainView.sent_message_details_blob_attachment_btn");
            initBlobAttachment$default(this, messageBlobAttachment, message, (View)linearLayout, false, 8, null);
        }
        final List<Recipient> l5 = v.L5((Collection<? extends Recipient>)message.getRecipientGroups());
        l5.addAll(message.getRecipientPersons());
        this.recipientsListAdapter.submitList(l5);
        final View mainView9 = this.mainView;
        if (mainView9 == null) {
            k0.S("mainView");
            throw null;
        }
        final int ol = c.i.OL;
        ((LinearLayout)mainView9.findViewById(ol)).setVisibility(com.untis.mobile.utils.extension.h.U(message.getRequestConfirmationStatus() != null, 0, 1, null));
        final RequestConfirmationStatus requestConfirmationStatus = message.getRequestConfirmationStatus();
        if (requestConfirmationStatus != null) {
            final View mainView10 = this.mainView;
            if (mainView10 == null) {
                k0.S("mainView");
                throw null;
            }
            ((TextView)mainView10.findViewById(c.i.ML)).setText((CharSequence)String.valueOf(requestConfirmationStatus.getConfirmedRequestCount()));
            final View mainView11 = this.mainView;
            if (mainView11 == null) {
                k0.S("mainView");
                throw null;
            }
            ((TextView)mainView11.findViewById(c.i.NL)).setText((CharSequence)String.valueOf(requestConfirmationStatus.getTotalRequestCount()));
            final View mainView12 = this.mainView;
            if (mainView12 == null) {
                k0.S("mainView");
                throw null;
            }
            ((LinearLayout)mainView12.findViewById(ol)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.details.g(this, requestConfirmationStatus, message));
        }
        final View mainView13 = this.mainView;
        if (mainView13 == null) {
            k0.S("mainView");
            throw null;
        }
        final int el = c.i.EL;
        ((ImageButton)mainView13.findViewById(el)).setVisibility(com.untis.mobile.utils.extension.h.U(message.getAllowMessageDeletion(), 0, 1, null));
        final View mainView14 = this.mainView;
        if (mainView14 == null) {
            k0.S("mainView");
            throw null;
        }
        ((ImageButton)mainView14.findViewById(el)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.details.d(this, message));
        final View mainView15 = this.mainView;
        if (mainView15 == null) {
            k0.S("mainView");
            throw null;
        }
        ((ImageButton)mainView15.findViewById(c.i.IL)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.details.e(this, message));
        final View mainView16 = this.mainView;
        if (mainView16 == null) {
            k0.S("mainView");
            throw null;
        }
        final int hl = c.i.HL;
        ((ViewGroup)mainView16.findViewById(hl)).setVisibility(com.untis.mobile.utils.extension.h.U(message.getReplyHistory().isEmpty() ^ true, 0, 1, null));
        final View mainView17 = this.mainView;
        if (mainView17 == null) {
            k0.S("mainView");
            throw null;
        }
        ((ScrollView)mainView17.findViewById(c.i.CL)).setVisibility(com.untis.mobile.utils.extension.h.U(message.getReplyHistory().isEmpty(), 0, 1, null));
        final View mainView18 = this.mainView;
        if (mainView18 == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView18.findViewById(jl)).setVisibility(com.untis.mobile.utils.extension.h.U(message.getReplyHistory().isEmpty(), 0, 1, null));
        if (message.getReplyHistory().isEmpty() ^ true) {
            final List<Message> l6 = v.L5((Collection<? extends Message>)message.getReplyHistory());
            message.setRecipients(message.getRecipientPersons());
            l6.add(0, message);
            final MessageReplyHistoryAdapter sentMessageReplyHistoryAdapter = this.sentMessageReplyHistoryAdapter;
            if (sentMessageReplyHistoryAdapter == null) {
                k0.S("sentMessageReplyHistoryAdapter");
                throw null;
            }
            sentMessageReplyHistoryAdapter.submitList(l6);
        }
        final View mainView19 = this.mainView;
        if (mainView19 == null) {
            k0.S("mainView");
            throw null;
        }
        final RecyclerView recyclerView3 = (RecyclerView)mainView19.findViewById(hl);
        final MessageReplyHistoryAdapter sentMessageReplyHistoryAdapter2 = this.sentMessageReplyHistoryAdapter;
        if (sentMessageReplyHistoryAdapter2 != null) {
            recyclerView3.setAdapter((RecyclerView$h)sentMessageReplyHistoryAdapter2);
            return;
        }
        k0.S("sentMessageReplyHistoryAdapter");
        throw null;
    }
    
    private static final void setMessageView$lambda-6$lambda-5(final SentMessageDetailsFragment sentMessageDetailsFragment, final RequestConfirmationStatus requestConfirmationStatus, final Message message, final View view) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.p(requestConfirmationStatus, "$it");
        k0.p(message, "$message");
        sentMessageDetailsFragment.navigateToReadConfirmationsView(requestConfirmationStatus.getConfirmedRequestCount(), requestConfirmationStatus.getTotalRequestCount(), message.getId());
    }
    
    private static final void setMessageView$lambda-7(final SentMessageDetailsFragment sentMessageDetailsFragment, final Message message, final View view) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.p(message, "$message");
        sentMessageDetailsFragment.showDeleteOrRevokeAlertDialog(message.getId(), AlertDialogTypes.DELETE);
        sentMessageDetailsFragment.observeMessageDeletionLiveData();
    }
    
    private static final void setMessageView$lambda-8(final SentMessageDetailsFragment sentMessageDetailsFragment, final Message message, final View view) {
        k0.p(sentMessageDetailsFragment, "this$0");
        k0.p(message, "$message");
        sentMessageDetailsFragment.showDeleteOrRevokeAlertDialog(message.getId(), AlertDialogTypes.REVOKE);
        sentMessageDetailsFragment.observeMessageDeletionLiveData();
    }
    
    private final void showDeleteOrRevokeAlertDialog(final String s, final AlertDialogTypes alertDialogTypes) {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "this.requireContext()");
        final AlertDialog create = UiUtilsKt.getDeleteOrRevokeMessageAlertDialog(requireContext, (l<? super DialogInterface, j2>)new SentMessageDetailsFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder.SentMessageDetailsFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder$1(alertDialogTypes, this, s), (l<? super DialogInterface, j2>)SentMessageDetailsFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder.SentMessageDetailsFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder$2.INSTANCE, alertDialogTypes).create();
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
        ((ScrollView)mainView2.findViewById(c.i.CL)).setVisibility(8);
        final View mainView3 = this.mainView;
        if (mainView3 != null) {
            ((ViewGroup)mainView3.findViewById(c.i.HL)).setVisibility(8);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onActivityCreated(@f final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle == null) {
            this.getSentMessageDetailsViewModel().getSentMessageDetails(this.getArgs().getMessageId());
        }
        this.getSentMessageDetailsViewModel().getSentMessageDetailsLiveData().j(this.getViewLifecycleOwner(), (l0)new i(this));
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
        final View inflate = layoutInflater.inflate(2131493304, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.messages_fragment_sent_message_details, container, false)");
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
