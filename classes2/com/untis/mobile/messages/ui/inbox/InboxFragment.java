// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox;

import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j;
import androidx.lifecycle.l0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import org.koin.core.c$a;
import android.content.DialogInterface;
import com.untis.mobile.messages.util.UiUtilsKt;
import com.untis.mobile.messages.util.AlertDialogTypes;
import com.untis.mobile.messages.util.SendMessageActions;
import com.untis.mobile.messages.util.SendMessageTypes;
import com.untis.mobile.messages.ui.main.MessagesMainFragmentDirections;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.content.Context;
import kotlin.text.s;
import timber.log.b;
import android.widget.ProgressBar;
import kotlin.h0;
import java.util.Map;
import com.untis.mobile.messages.base.Result;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.untis.mobile.ui.core.d;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.messages.ui.inbox.viewmodel.InboxViewModel;
import java.util.List;
import com.untis.mobile.messages.data.model.Message;
import n6.l;
import kotlin.j2;
import n6.p;
import kotlin.d0;
import l7.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.untis.mobile.messages.ui.inbox.adapter.IncomingMessagesListAdapter;
import android.app.AlertDialog;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.inbox.adapter.OnMessageClickListener;
import org.koin.core.c;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J*\u0010\r\u001a\u00020\u00042 \u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\b0\u0007H\u0002J(\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eH\u0002J(\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J$\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010%\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J \u0010'\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\u0004H\u0016R\u0016\u0010)\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00103\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010;\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010-¨\u0006?" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/InboxFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lorg/koin/core/c;", "Lcom/untis/mobile/messages/ui/inbox/adapter/OnMessageClickListener;", "Lkotlin/j2;", "initMessagesRecycleView", "initLayoutEmptyView", "Lcom/untis/mobile/messages/base/Result;", "", "", "", "Lcom/untis/mobile/messages/data/model/Message;", "result", "observeInboxViewState", "", "messages", "incomingMessages", "handleReadConfirmationSectionVisibility", "handleMyMessagesSectionVisibility", "readConfirmationMessages", "checkMessagesAvailability", "messageId", "", "position", "onDeleteMessageClick", "message", "onReplyMessageClick", "deletedMessageIndex", "showDeleteAlertDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "type", "onMessageClick", "onDestroy", "mainView", "Landroid/view/View;", "Lcom/untis/mobile/messages/ui/inbox/adapter/IncomingMessagesListAdapter;", "readConfirmationMessagesListAdapter", "Lcom/untis/mobile/messages/ui/inbox/adapter/IncomingMessagesListAdapter;", "Lcom/untis/mobile/messages/ui/inbox/viewmodel/InboxViewModel;", "inboxViewModel$delegate", "Lkotlin/b0;", "getInboxViewModel", "()Lcom/untis/mobile/messages/ui/inbox/viewmodel/InboxViewModel;", "inboxViewModel", "Landroid/app/AlertDialog;", "deleteMessageAlert", "Landroid/app/AlertDialog;", "Lcom/untis/mobile/ui/core/d;", "coreActivityViewModel$delegate", "getCoreActivityViewModel", "()Lcom/untis/mobile/ui/core/d;", "coreActivityViewModel", "incomingMessagesListAdapter", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class InboxFragment extends UmFragment implements c, OnMessageClickListener
{
    @e
    private final b0 coreActivityViewModel$delegate;
    private AlertDialog deleteMessageAlert;
    @e
    private final b0 inboxViewModel$delegate;
    @e
    private final IncomingMessagesListAdapter incomingMessagesListAdapter;
    private View mainView;
    @e
    private final IncomingMessagesListAdapter readConfirmationMessagesListAdapter;
    
    public InboxFragment() {
        this.coreActivityViewModel$delegate = d0.c((n6.a<?>)new InboxFragment$special$$inlined$sharedViewModel$default.InboxFragment$special$$inlined$sharedViewModel$default$2((Fragment)this, (a)null, (n6.a)new InboxFragment$special$$inlined$sharedViewModel$default.InboxFragment$special$$inlined$sharedViewModel$default$1((Fragment)this), (n6.a)null));
        this.inboxViewModel$delegate = d0.c((n6.a<?>)new InboxFragment$special$$inlined$sharedViewModel$default.InboxFragment$special$$inlined$sharedViewModel$default$4((Fragment)this, (a)null, (n6.a)new InboxFragment$special$$inlined$sharedViewModel$default.InboxFragment$special$$inlined$sharedViewModel$default$3((Fragment)this), (n6.a)null));
        this.incomingMessagesListAdapter = new IncomingMessagesListAdapter(this, "incoming_messages", (p<? super String, ? super Integer, j2>)new InboxFragment$incomingMessagesListAdapter.InboxFragment$incomingMessagesListAdapter$1(this), (l<? super Message, j2>)new InboxFragment$incomingMessagesListAdapter.InboxFragment$incomingMessagesListAdapter$2(this));
        this.readConfirmationMessagesListAdapter = new IncomingMessagesListAdapter(this, "read_confirmation_messages", (p<? super String, ? super Integer, j2>)new InboxFragment$readConfirmationMessagesListAdapter.InboxFragment$readConfirmationMessagesListAdapter$1(this), (l<? super Message, j2>)new InboxFragment$readConfirmationMessagesListAdapter.InboxFragment$readConfirmationMessagesListAdapter$2(this));
    }
    
    private final void checkMessagesAvailability(final List<Message> list, final List<Message> list2) {
        final View mainView = this.mainView;
        if (mainView != null) {
            mainView.findViewById(com.untis.mobile.c.i.KG).setVisibility(h.U((list2 == null || list2.isEmpty()) && (list == null || list.isEmpty()), 0, 1, null));
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final d getCoreActivityViewModel() {
        return this.coreActivityViewModel$delegate.getValue();
    }
    
    private final InboxViewModel getInboxViewModel() {
        return this.inboxViewModel$delegate.getValue();
    }
    
    private final void handleMyMessagesSectionVisibility(final List<Message> list) {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((FrameLayout)mainView.findViewById(com.untis.mobile.c.i.PF)).setVisibility(h.U((list == null || list.isEmpty()) ^ true, 0, 1, null));
        final View mainView2 = this.mainView;
        if (mainView2 != null) {
            ((TextView)mainView2.findViewById(com.untis.mobile.c.i.RF)).setVisibility(h.U((list == null || list.isEmpty()) ^ true, 0, 1, null));
            if (list != null) {
                this.incomingMessagesListAdapter.submitList(list);
            }
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final void handleReadConfirmationSectionVisibility(final List<Message> list, final List<Message> list2) {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        final CardView cardView = (CardView)mainView.findViewById(com.untis.mobile.c.i.TF);
        final int n = 0;
        ((FrameLayout)cardView).setVisibility(h.U((list == null || list.isEmpty()) ^ true, 0, 1, null));
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView2.findViewById(com.untis.mobile.c.i.UF)).setVisibility(h.U((list == null || list.isEmpty()) ^ true, 0, 1, null));
        final View mainView3 = this.mainView;
        if (mainView3 != null) {
            ((TextView)mainView3.findViewById(com.untis.mobile.c.i.RF)).setVisibility(h.U(list != null && !list.isEmpty() && list2 != null && !list2.isEmpty(), 0, 1, null));
            int n2 = 0;
            Label_0242: {
                if (list != null) {
                    n2 = n;
                    if (!list.isEmpty()) {
                        break Label_0242;
                    }
                }
                n2 = 1;
            }
            if (n2 == 0) {
                this.readConfirmationMessagesListAdapter.submitList(list);
            }
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final void initLayoutEmptyView() {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView.findViewById(com.untis.mobile.c.i.UD)).setText((CharSequence)this.getString(2131886750));
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView2.findViewById(com.untis.mobile.c.i.VD)).setText((CharSequence)this.getString(2131886428));
        final View mainView3 = this.mainView;
        if (mainView3 != null) {
            ((FloatingActionButton)mainView3.findViewById(com.untis.mobile.c.i.SD)).setImageResource(2131231127);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final void initMessagesRecycleView() {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        final int bu = com.untis.mobile.c.i.bu;
        ((RecyclerView)mainView.findViewById(bu)).setAdapter((RecyclerView$h)this.incomingMessagesListAdapter);
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        ((RecyclerView)mainView2.findViewById(bu)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(this.requireContext()));
        final View mainView3 = this.mainView;
        if (mainView3 == null) {
            k0.S("mainView");
            throw null;
        }
        final int xj = com.untis.mobile.c.i.XJ;
        ((RecyclerView)mainView3.findViewById(xj)).setAdapter((RecyclerView$h)this.readConfirmationMessagesListAdapter);
        final View mainView4 = this.mainView;
        if (mainView4 != null) {
            ((RecyclerView)mainView4.findViewById(xj)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(this.requireContext()));
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final void observeInboxViewState(final Result<? extends Map<String, ? extends List<Message>>> result) {
        final int n = WhenMappings.$EnumSwitchMapping$0[result.getStatus().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                final View mainView = this.mainView;
                if (mainView == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((ProgressBar)mainView.findViewById(com.untis.mobile.c.i.lE)).setVisibility(0);
            }
            else {
                final View mainView2 = this.mainView;
                if (mainView2 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((ProgressBar)mainView2.findViewById(com.untis.mobile.c.i.lE)).setVisibility(8);
                b.e(String.valueOf(result.getMessage()), new Object[0]);
                final Context requireContext = this.requireContext();
                k0.o(requireContext, "this.requireContext()");
                final String string = this.getString(2131886693);
                k0.o(string, "getString(R.string.shared_error_default_text)");
                h.k(requireContext, s.k2(string, "{0}", "", false, 4, (Object)null));
            }
        }
        else {
            final View mainView3 = this.mainView;
            if (mainView3 == null) {
                k0.S("mainView");
                throw null;
            }
            ((ProgressBar)mainView3.findViewById(com.untis.mobile.c.i.lE)).setVisibility(8);
            final Map map = (Map)result.getData();
            if (map != null) {
                this.handleMyMessagesSectionVisibility(map.get("incoming_messages"));
                this.handleReadConfirmationSectionVisibility(map.get("read_confirmation_messages"), map.get("incoming_messages"));
                this.checkMessagesAvailability(map.get("read_confirmation_messages"), map.get("incoming_messages"));
            }
        }
    }
    
    private static final void onActivityCreated$lambda-0(final InboxFragment inboxFragment, final Result result) {
        k0.p(inboxFragment, "this$0");
        final View mainView = inboxFragment.mainView;
        if (mainView != null) {
            ((SwipeRefreshLayout)mainView.findViewById(com.untis.mobile.c.i.dK)).setRefreshing(false);
            k0.o(result, "it");
            inboxFragment.observeInboxViewState(result);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private static final void onActivityCreated$lambda-1(final InboxFragment inboxFragment) {
        k0.p(inboxFragment, "this$0");
        inboxFragment.getInboxViewModel().getAllIncomingMessages();
    }
    
    private final void onDeleteMessageClick(final String s, final int n) {
        this.showDeleteAlertDialog(s, n);
    }
    
    private final void onReplyMessageClick(final Message message) {
        androidx.navigation.fragment.c.a((Fragment)this).D(MessagesMainFragmentDirections.Companion.actionMessagesMainFragmentToReplyMessageEditorFragment(SendMessageTypes.REPLY, false, 0, message, SendMessageActions.REPLY_MESSAGE));
    }
    
    private final void showDeleteAlertDialog(final String s, final int n) {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "this.requireContext()");
        final AlertDialog create = UiUtilsKt.getDeleteOrRevokeMessageAlertDialog(requireContext, (l<? super DialogInterface, j2>)new InboxFragment$showDeleteAlertDialog$deleteMessageAlertBuilder.InboxFragment$showDeleteAlertDialog$deleteMessageAlertBuilder$1(this, s, n), (l<? super DialogInterface, j2>)InboxFragment$showDeleteAlertDialog$deleteMessageAlertBuilder.InboxFragment$showDeleteAlertDialog$deleteMessageAlertBuilder$2.INSTANCE, AlertDialogTypes.DELETE).create();
        k0.o(create, "deleteMessageAlertBuilder.create()");
        this.deleteMessageAlert = create;
        if (create != null) {
            create.show();
            return;
        }
        k0.S("deleteMessageAlert");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    public void onActivityCreated(@f final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.getInboxViewModel().getAllIncomingMessagesLiveData().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.messages.ui.inbox.a(this));
        final View mainView = this.mainView;
        if (mainView != null) {
            ((SwipeRefreshLayout)mainView.findViewById(com.untis.mobile.c.i.dK)).setOnRefreshListener((SwipeRefreshLayout$j)new com.untis.mobile.messages.ui.inbox.b(this));
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    @e
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493296, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.messages_fragment_inbox, container, false)");
        this.mainView = inflate;
        this.initMessagesRecycleView();
        this.initLayoutEmptyView();
        final View mainView = this.mainView;
        if (mainView != null) {
            return mainView;
        }
        k0.S("mainView");
        throw null;
    }
    
    public void onDestroy() {
        super.onDestroy();
        final AlertDialog deleteMessageAlert = this.deleteMessageAlert;
        if (deleteMessageAlert != null) {
            if (deleteMessageAlert == null) {
                k0.S("deleteMessageAlert");
                throw null;
            }
            if (deleteMessageAlert.isShowing()) {
                final AlertDialog deleteMessageAlert2 = this.deleteMessageAlert;
                if (deleteMessageAlert2 == null) {
                    k0.S("deleteMessageAlert");
                    throw null;
                }
                deleteMessageAlert2.dismiss();
            }
        }
    }
    
    public void onMessageClick(@e final Message message, final int n, @e final String s) {
        k0.p(message, "message");
        k0.p(s, "type");
        if (!message.isRead()) {
            this.getCoreActivityViewModel().v();
        }
        androidx.navigation.fragment.c.a((Fragment)this).D(MessagesMainFragmentDirections.Companion.actionMessagesMainFragmentToMessageDetailsFragment(message.getId(), n));
        if (k0.g(s, "incoming_messages")) {
            this.incomingMessagesListAdapter.updateReadFlag(n);
        }
        if (k0.g(s, "read_confirmation_messages")) {
            this.readConfirmationMessagesListAdapter.updateReadFlag(n);
        }
    }
}
