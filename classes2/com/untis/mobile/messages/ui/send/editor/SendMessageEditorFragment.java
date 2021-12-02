// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.editor;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.app.Dialog;
import android.widget.ImageView;
import android.widget.EditText;
import com.untis.mobile.messages.util.SendMessageActions;
import android.os.Bundle;
import android.view.Window;
import androidx.cardview.widget.CardView;
import androidx.appcompat.app.d$a;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import com.untis.mobile.messages.data.model.request.SendMessageBody;
import kotlin.collections.v;
import com.untis.mobile.messages.data.model.request.MessageReplyRequestBody;
import com.untis.mobile.messages.util.SendMessageTypes;
import androidx.navigation.NavController;
import android.content.Context;
import com.untis.mobile.messages.data.model.response.SendMessageResponse;
import kotlin.text.s;
import android.widget.FrameLayout;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.l0;
import androidx.core.view.x0$m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.x0;
import androidx.core.view.a0;
import androidx.core.view.j0;
import com.untis.mobile.ui.fragments.common.UmFragment;
import kotlin.n1;
import kotlin.s0;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.messages.data.model.Sender;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import java.util.Set;
import com.untis.mobile.messages.ui.send.RecipientsTypes;
import com.untis.mobile.messages.data.model.Recipient;
import com.untis.mobile.messages.ui.send.SelectedRecipientsCommonKt;
import timber.log.b;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.messages.ui.send.editor.viewmodel.SendMessageViewModel;
import android.widget.TextView;
import android.widget.ImageButton;
import kotlin.j2;
import n6.l;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.k0;
import android.annotation.SuppressLint;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.View;
import kotlin.d0;
import androidx.lifecycle.y;
import n6.a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import kotlin.b0;
import com.untis.mobile.messages.ui.send.editor.adapter.SelectedRecipientsListAdapter;
import org.jetbrains.annotations.f;
import com.untis.mobile.messages.data.model.Message;
import androidx.appcompat.app.d;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u00101\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00064" }, d2 = { "Lcom/untis/mobile/messages/ui/send/editor/SendMessageEditorFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "handleSendMessageAction", "parentView", "mainView", "observeKeyboardVisibility", "initViews", "adaptIfReply", "observeSendMessageResponse", "sendMessage", "checkCCStudentsAndReadConfirmationFlags", "showDiscardBottomDialog", "checkAvailabilityToSendMessage", "checkRequestReadConfirmationPermission", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onDestroy", "Landroidx/appcompat/app/d;", "discardDialog", "Landroidx/appcompat/app/d;", "Lcom/untis/mobile/messages/data/model/Message;", "messageToReply", "Lcom/untis/mobile/messages/data/model/Message;", "Lcom/untis/mobile/messages/ui/send/editor/adapter/SelectedRecipientsListAdapter;", "selectedRecipientsListAdapter", "Lcom/untis/mobile/messages/ui/send/editor/adapter/SelectedRecipientsListAdapter;", "", "isReply", "Z", "Lcom/untis/mobile/messages/ui/send/editor/viewmodel/SendMessageViewModel;", "sendMessageViewModel$delegate", "Lkotlin/b0;", "getSendMessageViewModel", "()Lcom/untis/mobile/messages/ui/send/editor/viewmodel/SendMessageViewModel;", "sendMessageViewModel", "Lcom/untis/mobile/messages/ui/send/editor/SendMessageEditorFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/send/editor/SendMessageEditorFragmentArgs;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageEditorFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    private d discardDialog;
    private boolean isReply;
    @f
    private Message messageToReply;
    private SelectedRecipientsListAdapter selectedRecipientsListAdapter;
    @e
    private final b0 sendMessageViewModel$delegate;
    
    public SendMessageEditorFragment() {
        this.args$delegate = new m(k1.d(SendMessageEditorFragmentArgs.class), (a)new SendMessageEditorFragment$special$$inlined$navArgs.SendMessageEditorFragment$special$$inlined$navArgs$1((Fragment)this));
        this.sendMessageViewModel$delegate = d0.c((a<?>)new SendMessageEditorFragment$special$$inlined$viewModel$default.SendMessageEditorFragment$special$$inlined$viewModel$default$1((y)this, (l7.a)null, (a)null));
    }
    
    @SuppressLint({ "SetTextI18n" })
    private final void adaptIfReply(final View view) {
        if (this.isReply) {
            final AppCompatEditText appCompatEditText = (AppCompatEditText)view.findViewById(c.i.yG);
            final Message messageToReply = this.messageToReply;
            CharSequence subject;
            if (messageToReply == null) {
                subject = null;
            }
            else {
                subject = messageToReply.getSubject();
            }
            ((EditText)appCompatEditText).setText(subject);
            ((FloatingActionButton)view.findViewById(c.i.wG)).setVisibility(4);
        }
    }
    
    private final void checkAvailabilityToSendMessage(final View view) {
        final AppCompatEditText appCompatEditText = (AppCompatEditText)view.findViewById(c.i.yG);
        k0.o(appCompatEditText, "view.message_send_editor_subject_edit_text");
        h.A(appCompatEditText, (l<? super String, j2>)new SendMessageEditorFragment$checkAvailabilityToSendMessage.SendMessageEditorFragment$checkAvailabilityToSendMessage$1(view, this));
        final AppCompatEditText appCompatEditText2 = (AppCompatEditText)view.findViewById(c.i.vG);
        k0.o(appCompatEditText2, "view.message_send_editor_body_edit_text");
        h.A(appCompatEditText2, (l<? super String, j2>)new SendMessageEditorFragment$checkAvailabilityToSendMessage.SendMessageEditorFragment$checkAvailabilityToSendMessage$2(view, this));
    }
    
    private final void checkCCStudentsAndReadConfirmationFlags(final View view) {
        if (this.getSendMessageViewModel().getCopyToStudents()) {
            ((ImageButton)view.findViewById(c.i.sG)).setColorFilter(androidx.core.content.d.f(this.requireContext(), 2131100003));
            final SendMessageViewModel sendMessageViewModel = this.getSendMessageViewModel();
            String subtitleText;
            if (this.getSendMessageViewModel().getRequestReadConfirmation()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.getString(2131886422));
                sb.append(" | ");
                sb.append(this.getString(2131886415));
                subtitleText = sb.toString();
            }
            else {
                subtitleText = this.getString(2131886415);
                k0.o(subtitleText, "{\n                getString(R.string.message_send_copy_to_students)\n            }");
            }
            sendMessageViewModel.setSubtitleText(subtitleText);
        }
        if (this.getSendMessageViewModel().getRequestReadConfirmation()) {
            ((ImageButton)view.findViewById(c.i.zG)).setColorFilter(androidx.core.content.d.f(this.requireContext(), 2131100003));
            final SendMessageViewModel sendMessageViewModel2 = this.getSendMessageViewModel();
            String subtitleText2;
            if (this.getSendMessageViewModel().getCopyToStudents()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.getString(2131886422));
                sb2.append(" | ");
                sb2.append(this.getString(2131886415));
                subtitleText2 = sb2.toString();
            }
            else {
                subtitleText2 = this.getString(2131886422);
                k0.o(subtitleText2, "{\n                getString(R.string.message_send_request_read_confirmation)\n            }");
            }
            sendMessageViewModel2.setSubtitleText(subtitleText2);
        }
        final int xg = c.i.xG;
        ((TextView)view.findViewById(xg)).setVisibility(h.U(this.getSendMessageViewModel().getCopyToStudents() || this.getSendMessageViewModel().getRequestReadConfirmation(), 0, 1, null));
        ((TextView)view.findViewById(xg)).setText((CharSequence)this.getSendMessageViewModel().getSubtitleText());
    }
    
    private final void checkRequestReadConfirmationPermission(final View view) {
        ((ImageButton)view.findViewById(c.i.zG)).setVisibility(h.U(this.getArgs().getAllowRequestReadConfirmation(), 0, 1, null));
    }
    
    private final SendMessageEditorFragmentArgs getArgs() {
        return ((b0<SendMessageEditorFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final SendMessageViewModel getSendMessageViewModel() {
        return this.sendMessageViewModel$delegate.getValue();
    }
    
    private final void handleSendMessageAction(final View view) {
        this.selectedRecipientsListAdapter = new SelectedRecipientsListAdapter(this.getArgs().getSendMessageAction());
        final int n = WhenMappings.$EnumSwitchMapping$0[this.getArgs().getSendMessageAction().ordinal()];
        if (n != 1) {
            if (n == 2) {
                this.messageToReply = this.getArgs().getMessageToReply();
                this.isReply = true;
                ((TextView)view.findViewById(c.i.xL)).setText((CharSequence)this.getString(2131886421));
                final Message messageToReply = this.messageToReply;
                String className = null;
                Object sender;
                if (messageToReply == null) {
                    sender = null;
                }
                else {
                    sender = messageToReply.getSender();
                }
                b.e(String.valueOf(sender), new Object[0]);
                final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                final Message messageToReply2 = this.messageToReply;
                String displayName = null;
                Label_0162: {
                    if (messageToReply2 != null) {
                        final Sender sender2 = messageToReply2.getSender();
                        if (sender2 != null) {
                            displayName = sender2.getDisplayName();
                            if (displayName != null) {
                                break Label_0162;
                            }
                        }
                    }
                    displayName = "";
                }
                final Message messageToReply3 = this.messageToReply;
                Integer value = null;
                Label_0208: {
                    if (messageToReply3 != null) {
                        final Sender sender3 = messageToReply3.getSender();
                        if (sender3 != null) {
                            final String userId = sender3.getUserId();
                            if (userId != null) {
                                value = Integer.parseInt(userId);
                                break Label_0208;
                            }
                        }
                    }
                    value = null;
                }
                final Message messageToReply4 = this.messageToReply;
                String className2 = null;
                Label_0247: {
                    if (messageToReply4 != null) {
                        final Sender sender4 = messageToReply4.getSender();
                        if (sender4 != null) {
                            className2 = sender4.getClassName();
                            break Label_0247;
                        }
                    }
                    className2 = null;
                }
                final Message messageToReply5 = this.messageToReply;
                if (messageToReply5 != null) {
                    final Sender sender5 = messageToReply5.getSender();
                    if (sender5 != null) {
                        className = sender5.getClassName();
                    }
                }
                selectedRecipientsList.add(new Recipient(displayName, null, null, null, className2, value, null, false, null, null, className, null, null, 7118, null));
            }
        }
        else {
            final int n2 = WhenMappings.$EnumSwitchMapping$1[this.getArgs().getSendMessageTo().ordinal()];
            if (n2 != 1) {
                if (n2 == 2) {
                    ((TextView)view.findViewById(c.i.xL)).setText((CharSequence)this.getString(2131886405));
                    ((ImageButton)view.findViewById(c.i.sG)).setVisibility(0);
                }
            }
            else {
                ((TextView)view.findViewById(c.i.xL)).setText((CharSequence)this.getString(2131886406));
            }
        }
    }
    
    @SuppressLint({ "SetTextI18n" })
    private final void initViews(final View view) {
        this.checkRequestReadConfirmationPermission(view);
        this.observeSendMessageResponse(view);
        this.checkCCStudentsAndReadConfirmationFlags(view);
        this.checkAvailabilityToSendMessage(view);
        this.adaptIfReply(view);
        ((ImageView)view.findViewById(c.i.Gs)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.editor.a(view, this));
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(c.i.LG);
        final SelectedRecipientsListAdapter selectedRecipientsListAdapter = this.selectedRecipientsListAdapter;
        if (selectedRecipientsListAdapter == null) {
            k0.S("selectedRecipientsListAdapter");
            throw null;
        }
        recyclerView.setAdapter((RecyclerView$h)selectedRecipientsListAdapter);
        final SelectedRecipientsListAdapter selectedRecipientsListAdapter2 = this.selectedRecipientsListAdapter;
        if (selectedRecipientsListAdapter2 != null) {
            selectedRecipientsListAdapter2.submitList(SelectedRecipientsCommonKt.getSelectedRecipientsList());
            ((ImageButton)view.findViewById(c.i.wG)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.editor.c(this));
            ((ImageButton)view.findViewById(c.i.sG)).setOnClickListener((View$OnClickListener)new g(this, view));
            ((ImageButton)view.findViewById(c.i.zG)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.editor.e(this, view));
            ((ImageView)view.findViewById(c.i.MG)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.editor.f(this, view));
            return;
        }
        k0.S("selectedRecipientsListAdapter");
        throw null;
    }
    
    private static final void initViews$lambda-1(final View view, final SendMessageEditorFragment sendMessageEditorFragment, final View view2) {
        k0.p(view, "$view");
        k0.p(sendMessageEditorFragment, "this$0");
        if (SelectedRecipientsCommonKt.getSelectedRecipientsList().size() <= 0) {
            final int length = String.valueOf(((AppCompatEditText)view.findViewById(c.i.yG)).getText()).length();
            final int n = 1;
            if (length <= 0) {
                int n2;
                if (String.valueOf(((AppCompatEditText)view.findViewById(c.i.vG)).getText()).length() > 0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    sendMessageEditorFragment.onBackPressed();
                    return;
                }
            }
        }
        sendMessageEditorFragment.showDiscardBottomDialog();
    }
    
    private static final void initViews$lambda-2(final SendMessageEditorFragment sendMessageEditorFragment, final View view) {
        k0.p(sendMessageEditorFragment, "this$0");
        androidx.navigation.fragment.c.a((Fragment)sendMessageEditorFragment).t(2131296380, androidx.core.os.b.a(new s0[] { n1.a("sendMessageTo", sendMessageEditorFragment.getArgs().getSendMessageTo()), n1.a("allowRequestReadConfirmation", sendMessageEditorFragment.getArgs().getAllowRequestReadConfirmation()), n1.a("fromSendEditorFragment", Boolean.TRUE), n1.a("recipientSearchMaxResult", sendMessageEditorFragment.getArgs().getRecipientSearchMaxResult()) }));
    }
    
    private static final void initViews$lambda-3(final SendMessageEditorFragment sendMessageEditorFragment, final View view, final View view2) {
        k0.p(sendMessageEditorFragment, "this$0");
        k0.p(view, "$view");
        Label_0201: {
            SendMessageViewModel sendMessageViewModel = null;
            String subtitleText = null;
            Label_0088: {
                String s;
                if (sendMessageEditorFragment.getSendMessageViewModel().getCopyToStudents()) {
                    sendMessageEditorFragment.getSendMessageViewModel().setCopyToStudents(false);
                    ((ImageButton)view.findViewById(c.i.sG)).setColorFilter(androidx.core.content.d.f(sendMessageEditorFragment.requireContext(), 2131099992));
                    if (!sendMessageEditorFragment.getSendMessageViewModel().getRequestReadConfirmation()) {
                        break Label_0201;
                    }
                    sendMessageViewModel = sendMessageEditorFragment.getSendMessageViewModel();
                    subtitleText = sendMessageEditorFragment.getString(2131886422);
                    s = "getString(R.string.message_send_request_read_confirmation)";
                }
                else {
                    sendMessageEditorFragment.getSendMessageViewModel().setCopyToStudents(true);
                    ((ImageButton)view.findViewById(c.i.sG)).setColorFilter(androidx.core.content.d.f(sendMessageEditorFragment.requireContext(), 2131100003));
                    sendMessageViewModel = sendMessageEditorFragment.getSendMessageViewModel();
                    if (sendMessageEditorFragment.getSendMessageViewModel().getRequestReadConfirmation()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(sendMessageEditorFragment.getString(2131886422));
                        sb.append(" | ");
                        sb.append(sendMessageEditorFragment.getString(2131886415));
                        subtitleText = sb.toString();
                        break Label_0088;
                    }
                    subtitleText = sendMessageEditorFragment.getString(2131886415);
                    s = "{\n                        getString(R.string.message_send_copy_to_students)\n                    }";
                }
                k0.o(subtitleText, s);
            }
            sendMessageViewModel.setSubtitleText(subtitleText);
        }
        final int xg = c.i.xG;
        ((TextView)view.findViewById(xg)).setText((CharSequence)sendMessageEditorFragment.getSendMessageViewModel().getSubtitleText());
        ((TextView)view.findViewById(xg)).setVisibility(h.U(sendMessageEditorFragment.getSendMessageViewModel().getCopyToStudents() || sendMessageEditorFragment.getSendMessageViewModel().getRequestReadConfirmation(), 0, 1, null));
    }
    
    private static final void initViews$lambda-4(final SendMessageEditorFragment sendMessageEditorFragment, final View view, final View view2) {
        k0.p(sendMessageEditorFragment, "this$0");
        k0.p(view, "$view");
        Label_0201: {
            SendMessageViewModel sendMessageViewModel = null;
            String subtitleText = null;
            Label_0088: {
                String s;
                if (sendMessageEditorFragment.getSendMessageViewModel().getRequestReadConfirmation()) {
                    sendMessageEditorFragment.getSendMessageViewModel().setRequestReadConfirmation(false);
                    ((ImageButton)view.findViewById(c.i.zG)).setColorFilter(androidx.core.content.d.f(sendMessageEditorFragment.requireContext(), 2131099992));
                    if (!sendMessageEditorFragment.getSendMessageViewModel().getCopyToStudents()) {
                        break Label_0201;
                    }
                    sendMessageViewModel = sendMessageEditorFragment.getSendMessageViewModel();
                    subtitleText = sendMessageEditorFragment.getString(2131886415);
                    s = "getString(R.string.message_send_copy_to_students)";
                }
                else {
                    sendMessageEditorFragment.getSendMessageViewModel().setRequestReadConfirmation(true);
                    ((ImageButton)view.findViewById(c.i.zG)).setColorFilter(androidx.core.content.d.f(sendMessageEditorFragment.requireContext(), 2131100003));
                    sendMessageViewModel = sendMessageEditorFragment.getSendMessageViewModel();
                    if (sendMessageEditorFragment.getSendMessageViewModel().getCopyToStudents()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(sendMessageEditorFragment.getString(2131886422));
                        sb.append(" | ");
                        sb.append(sendMessageEditorFragment.getString(2131886415));
                        subtitleText = sb.toString();
                        break Label_0088;
                    }
                    subtitleText = sendMessageEditorFragment.getString(2131886422);
                    s = "{\n                    getString(R.string.message_send_request_read_confirmation)\n                }";
                }
                k0.o(subtitleText, s);
            }
            sendMessageViewModel.setSubtitleText(subtitleText);
        }
        final int xg = c.i.xG;
        ((TextView)view.findViewById(xg)).setText((CharSequence)sendMessageEditorFragment.getSendMessageViewModel().getSubtitleText());
        ((TextView)view.findViewById(xg)).setVisibility(h.U(sendMessageEditorFragment.getSendMessageViewModel().getCopyToStudents() || sendMessageEditorFragment.getSendMessageViewModel().getRequestReadConfirmation(), 0, 1, null));
    }
    
    private static final void initViews$lambda-5(final SendMessageEditorFragment sendMessageEditorFragment, final View view, final View view2) {
        k0.p(sendMessageEditorFragment, "this$0");
        k0.p(view, "$view");
        UmFragment.hideKeyboard$default(sendMessageEditorFragment, null, 1, null);
        sendMessageEditorFragment.sendMessage(view);
    }
    
    private final void observeKeyboardVisibility(final View view, final View view2) {
        j0.Y1(view, (a0)new com.untis.mobile.messages.ui.send.editor.h(view2));
    }
    
    private static final x0 observeKeyboardVisibility$lambda-0(final View view, final View view2, final x0 x0) {
        k0.p(view, "$mainView");
        ((ViewGroup)view.findViewById(c.i.uG)).setVisibility(h.U(x0.C(x0$m.d()) && (((ImageButton)view.findViewById(c.i.sG)).getVisibility() == 0 || ((ImageButton)view.findViewById(c.i.zG)).getVisibility() == 0), 0, 1, null));
        return x0;
    }
    
    private final void observeSendMessageResponse(final View view) {
        this.getSendMessageViewModel().getSendMessageResponseLiveData().j(this.getViewLifecycleOwner(), (l0)new i(view, this));
    }
    
    private static final void observeSendMessageResponse$lambda-7(final View view, final SendMessageEditorFragment sendMessageEditorFragment, final Result result) {
        k0.p(view, "$view");
        k0.p(sendMessageEditorFragment, "this$0");
        final int n = WhenMappings.$EnumSwitchMapping$2[result.getStatus().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return;
                }
                ((FrameLayout)view.findViewById(c.i.JG)).setVisibility(0);
                return;
            }
            else {
                final Context requireContext = sendMessageEditorFragment.requireContext();
                k0.o(requireContext, "requireContext()");
                final String string = sendMessageEditorFragment.getString(2131886693);
                k0.o(string, "getString(R.string.shared_error_default_text)");
                String message;
                if ((message = result.getMessage()) == null) {
                    message = "";
                }
                h.k(requireContext, s.k2(string, "{0}", message, false, 4, (Object)null));
            }
        }
        else {
            final SendMessageResponse sendMessageResponse = result.getData();
            if (sendMessageResponse != null) {
                int n2 = 2131296381;
                if (sendMessageEditorFragment.isReply) {
                    n2 = 2131296377;
                }
                final NavController a = androidx.navigation.fragment.c.a((Fragment)sendMessageEditorFragment);
                final s0<String, SendMessageTypes> a2 = n1.a("sendMessageTo", sendMessageEditorFragment.getArgs().getSendMessageTo());
                final s0<String, Boolean> a3 = n1.a("copyToStudents", sendMessageEditorFragment.getSendMessageViewModel().getCopyToStudents());
                final s0<String, Boolean> a4 = n1.a("readConfirmation", sendMessageEditorFragment.getSendMessageViewModel().getRequestReadConfirmation());
                String displayName;
                if (sendMessageResponse.getNumberOfRecipients() == 1) {
                    displayName = SelectedRecipientsCommonKt.getSelectedRecipientsList().get(0).getDisplayName();
                }
                else {
                    displayName = null;
                }
                a.t(n2, androidx.core.os.b.a(new s0[] { a2, a3, a4, n1.a("singleRecipientName", displayName), n1.a("numberOfRecipients", sendMessageResponse.getNumberOfRecipients()) }));
                sendMessageEditorFragment.getSendMessageViewModel().setCopyToStudents(false);
                sendMessageEditorFragment.getSendMessageViewModel().setRequestReadConfirmation(false);
            }
        }
        ((FrameLayout)view.findViewById(c.i.JG)).setVisibility(8);
    }
    
    private final void sendMessage(final View view) {
        if (SelectedRecipientsCommonKt.getSelectedRecipientsList().isEmpty() ^ true) {
            if (this.isReply) {
                final Message messageToReply = this.messageToReply;
                if (messageToReply != null) {
                    this.getSendMessageViewModel().replyMessage(messageToReply.getId(), new MessageReplyRequestBody(String.valueOf(((AppCompatEditText)view.findViewById(c.i.vG)).getText()), String.valueOf(((AppCompatEditText)view.findViewById(c.i.yG)).getText())));
                }
            }
            else {
                final SendMessageViewModel sendMessageViewModel = this.getSendMessageViewModel();
                final String name = this.getArgs().getSendMessageTo().name();
                final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                final ArrayList<Recipient> list = new ArrayList<Recipient>();
                final Iterator<Object> iterator = selectedRecipientsList.iterator();
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    boolean b = false;
                    if (!hasNext) {
                        break;
                    }
                    final Recipient next = iterator.next();
                    if (next.getType() == RecipientsTypes.GROUP) {
                        b = true;
                    }
                    if (!b) {
                        continue;
                    }
                    list.add(next);
                }
                final ArrayList list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
                final Iterator<Object> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    final String groupId = iterator2.next().getGroupId();
                    k0.m(groupId);
                    list2.add(groupId);
                }
                final ArrayList<Recipient> selectedRecipientsList2 = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                final ArrayList<Recipient> list3 = new ArrayList<Recipient>();
                for (final Object next2 : selectedRecipientsList2) {
                    if (((Recipient)next2).getType() == RecipientsTypes.RECIPIENT) {
                        list3.add((T)next2);
                    }
                }
                final ArrayList list4 = new ArrayList<Integer>(v.Y((Iterable<?>)list3, 10));
                final Iterator<Object> iterator4 = list3.iterator();
                while (iterator4.hasNext()) {
                    final Integer personId = iterator4.next().getPersonId();
                    k0.m(personId);
                    list4.add(Integer.valueOf((int)personId));
                }
                sendMessageViewModel.sendMessage(new SendMessageBody(name, (List<String>)list2, String.valueOf(((AppCompatEditText)view.findViewById(c.i.yG)).getText()), String.valueOf(((AppCompatEditText)view.findViewById(c.i.vG)).getText()), (List<Integer>)list4, this.getSendMessageViewModel().getCopyToStudents(), this.getSendMessageViewModel().getRequestReadConfirmation()));
            }
        }
    }
    
    private final void showDiscardBottomDialog() {
        UmFragment.hideKeyboard$default(this, null, 1, null);
        final View inflate = LayoutInflater.from(this.requireContext()).inflate(2131493305, (ViewGroup)null);
        final d$a d$a = new d$a(this.requireContext());
        d$a.M(inflate);
        final d a = d$a.a();
        k0.o(a, "builder.create()");
        this.discardDialog = a;
        if (a == null) {
            k0.S("discardDialog");
            throw null;
        }
        a.r(inflate);
        final d discardDialog = this.discardDialog;
        if (discardDialog == null) {
            k0.S("discardDialog");
            throw null;
        }
        final Window window = ((Dialog)discardDialog).getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        final d discardDialog2 = this.discardDialog;
        if (discardDialog2 == null) {
            k0.S("discardDialog");
            throw null;
        }
        final Window window2 = ((Dialog)discardDialog2).getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        ((FrameLayout)inflate.findViewById(c.i.PG)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.editor.b(this));
        ((FrameLayout)inflate.findViewById(c.i.OG)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.editor.d(this));
        final d discardDialog3 = this.discardDialog;
        if (discardDialog3 != null) {
            ((Dialog)discardDialog3).show();
            return;
        }
        k0.S("discardDialog");
        throw null;
    }
    
    private static final void showDiscardBottomDialog$lambda-13(final SendMessageEditorFragment sendMessageEditorFragment, final View view) {
        k0.p(sendMessageEditorFragment, "this$0");
        SelectedRecipientsCommonKt.clearSelectedRecipientsList();
        final boolean isReply = sendMessageEditorFragment.isReply;
        final NavController a = androidx.navigation.fragment.c.a((Fragment)sendMessageEditorFragment);
        if (isReply) {
            a.I();
        }
        else {
            a.J(2131298459, false);
        }
    }
    
    private static final void showDiscardBottomDialog$lambda-14(final SendMessageEditorFragment sendMessageEditorFragment, final View view) {
        k0.p(sendMessageEditorFragment, "this$0");
        final d discardDialog = sendMessageEditorFragment.discardDialog;
        if (discardDialog != null) {
            ((androidx.appcompat.app.i)discardDialog).dismiss();
            return;
        }
        k0.S("discardDialog");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493301, viewGroup, false);
        final View decorView = ((Activity)this.requireActivity()).getWindow().getDecorView();
        k0.o(decorView, "this.requireActivity().window.decorView");
        k0.o(inflate, "view");
        this.observeKeyboardVisibility(decorView, inflate);
        this.handleSendMessageAction(inflate);
        this.initViews(inflate);
        ((EditText)inflate.findViewById(c.i.yG)).requestFocus();
        return inflate;
    }
    
    public void onDestroy() {
        super.onDestroy();
        j0.Y1(((Activity)this.requireActivity()).getWindow().getDecorView(), (a0)null);
        final d discardDialog = this.discardDialog;
        if (discardDialog != null) {
            if (discardDialog == null) {
                k0.S("discardDialog");
                throw null;
            }
            if (((Dialog)discardDialog).isShowing()) {
                final d discardDialog2 = this.discardDialog;
                if (discardDialog2 == null) {
                    k0.S("discardDialog");
                    throw null;
                }
                ((androidx.appcompat.app.i)discardDialog2).dismiss();
            }
        }
    }
    
    public void onViewCreated(@e final View view, @f final Bundle bundle) {
        k0.p(view, "view");
        super.onViewCreated(view, bundle);
        this.showKeyboard(view.findFocus());
        ((ComponentActivity)this.requireActivity()).getOnBackPressedDispatcher().b(this.getViewLifecycleOwner(), (androidx.activity.c)new SendMessageEditorFragment$onViewCreated$callback.SendMessageEditorFragment$onViewCreated$callback$1(view, this));
    }
}
