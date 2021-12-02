// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.confirm;

import androidx.activity.ComponentActivity;
import android.widget.Button;
import android.widget.TextView;
import kotlin.b0;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.navigation.NavController;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatButton;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Arrays;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.p1;
import com.untis.mobile.messages.util.SendMessageTypes;
import android.view.View;
import n6.a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/messages/ui/send/confirm/SendMessageConfirmedFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "Lcom/untis/mobile/messages/ui/send/confirm/SendMessageConfirmedFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/send/confirm/SendMessageConfirmedFragmentArgs;", "args", "", "mainMessage", "Ljava/lang/String;", "readConfirmationMessage", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageConfirmedFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    private String mainMessage;
    private String readConfirmationMessage;
    
    public SendMessageConfirmedFragment() {
        this.args$delegate = new m(k1.d(SendMessageConfirmedFragmentArgs.class), (a)new SendMessageConfirmedFragment$special$$inlined$navArgs.SendMessageConfirmedFragment$special$$inlined$navArgs$1((Fragment)this));
    }
    
    private final SendMessageConfirmedFragmentArgs getArgs() {
        return ((b0<SendMessageConfirmedFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final void initView(final View view) {
        String readConfirmationMessage;
        String s;
        if (this.getArgs().getSendMessageTo() == SendMessageTypes.PARENTS) {
            final String singleRecipientName = this.getArgs().getSingleRecipientName();
            String mainMessage;
            if (singleRecipientName != null && singleRecipientName.length() != 0) {
                final p1 a = p1.a;
                final String string = this.getString(2131886410);
                k0.o(string, "getString(R.string.message_send_confirm_main_message_parents_single_student)");
                mainMessage = String.format(string, Arrays.copyOf(new Object[] { this.getArgs().getSingleRecipientName() }, 1));
            }
            else {
                final p1 a2 = p1.a;
                final String string2 = this.getString(2131886409);
                k0.o(string2, "getString(R.string.message_send_confirm_main_message_parents)");
                mainMessage = String.format(string2, Arrays.copyOf(new Object[] { this.getArgs().getNumberOfRecipients() }, 1));
            }
            k0.o(mainMessage, "java.lang.String.format(format, *args)");
            this.mainMessage = mainMessage;
            readConfirmationMessage = this.getString(2131886413);
            s = "getString(R.string.message_send_confirm_read_confirmation_message_parents)";
        }
        else {
            final String singleRecipientName2 = this.getArgs().getSingleRecipientName();
            String mainMessage2;
            if (singleRecipientName2 != null && singleRecipientName2.length() != 0) {
                final p1 a3 = p1.a;
                final String string3 = this.getString(2131886411);
                k0.o(string3, "getString(R.string.message_send_confirm_main_message_single_student)");
                mainMessage2 = String.format(string3, Arrays.copyOf(new Object[] { this.getArgs().getSingleRecipientName() }, 1));
            }
            else {
                final p1 a4 = p1.a;
                final String string4 = this.getString(2131886412);
                k0.o(string4, "getString(R.string.message_send_confirm_main_message_students)");
                mainMessage2 = String.format(string4, Arrays.copyOf(new Object[] { this.getArgs().getNumberOfRecipients() }, 1));
            }
            k0.o(mainMessage2, "java.lang.String.format(format, *args)");
            this.mainMessage = mainMessage2;
            readConfirmationMessage = this.getString(2131886414);
            s = "getString(R.string.message_send_confirm_read_confirmation_message_students)";
        }
        k0.o(readConfirmationMessage, s);
        this.readConfirmationMessage = readConfirmationMessage;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.CG);
        final String mainMessage3 = this.mainMessage;
        if (mainMessage3 != null) {
            ((TextView)appCompatTextView).setText((CharSequence)mainMessage3);
            if (this.getArgs().getCopyToStudents()) {
                final int ag = c.i.AG;
                ((TextView)view.findViewById(ag)).setVisibility(0);
                final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(ag);
                final p1 a5 = p1.a;
                final String string5 = this.getString(2131886408);
                k0.o(string5, "getString(R.string.message_send_confirm_copied_to_students_message)");
                final String format = String.format(string5, Arrays.copyOf(new Object[] { this.getArgs().getNumberOfRecipients() }, 1));
                k0.o(format, "java.lang.String.format(format, *args)");
                ((TextView)appCompatTextView2).setText((CharSequence)format);
            }
            if (this.getArgs().getReadConfirmation()) {
                final int dg = c.i.DG;
                ((TextView)view.findViewById(dg)).setVisibility(0);
                final AppCompatTextView appCompatTextView3 = (AppCompatTextView)view.findViewById(dg);
                final String readConfirmationMessage2 = this.readConfirmationMessage;
                if (readConfirmationMessage2 == null) {
                    k0.S("readConfirmationMessage");
                    throw null;
                }
                ((TextView)appCompatTextView3).setText((CharSequence)readConfirmationMessage2);
            }
            ((Button)view.findViewById(c.i.BG)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.confirm.a(this));
            return;
        }
        k0.S("mainMessage");
        throw null;
    }
    
    private static final void initView$lambda-0(final SendMessageConfirmedFragment sendMessageConfirmedFragment, final View view) {
        k0.p(sendMessageConfirmedFragment, "this$0");
        final SendMessageTypes sendMessageTo = sendMessageConfirmedFragment.getArgs().getSendMessageTo();
        final SendMessageTypes reply = SendMessageTypes.REPLY;
        final NavController a = androidx.navigation.fragment.c.a((Fragment)sendMessageConfirmedFragment);
        int n;
        if (sendMessageTo == reply) {
            n = 2131296376;
        }
        else {
            n = 2131296379;
        }
        a.s(n);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493302, viewGroup, false);
        k0.o(inflate, "view");
        this.initView(inflate);
        return inflate;
    }
    
    public void onViewCreated(@e final View view, @f final Bundle bundle) {
        k0.p(view, "view");
        super.onViewCreated(view, bundle);
        ((ComponentActivity)this.requireActivity()).getOnBackPressedDispatcher().b(this.getViewLifecycleOwner(), (androidx.activity.c)new SendMessageConfirmedFragment$onViewCreated$callback.SendMessageConfirmedFragment$onViewCreated$callback$1(this));
    }
}
