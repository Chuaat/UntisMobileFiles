// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent;

import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j;
import androidx.lifecycle.l0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import android.content.DialogInterface;
import n6.l;
import com.untis.mobile.messages.util.UiUtilsKt;
import com.untis.mobile.messages.ui.main.MessagesMainFragmentDirections;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import timber.log.b;
import android.widget.ProgressBar;
import kotlin.h0;
import java.util.List;
import com.untis.mobile.messages.base.Result;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.ui.sent.viewmodel.SentMessagesViewModel;
import com.untis.mobile.messages.util.AlertDialogTypes;
import n6.q;
import kotlin.j2;
import com.untis.mobile.messages.data.model.Message;
import n6.p;
import kotlin.d0;
import l7.a;
import androidx.fragment.app.Fragment;
import kotlin.b0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.ui.sent.adapter.SentMessagesListAdapter;
import android.view.View;
import android.app.AlertDialog;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010 \u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010!\u001a\u00020\u0002H\u0016R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/SentMessagesFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lkotlin/j2;", "initLayoutEmptyView", "initSentMessagesRecycleView", "Lcom/untis/mobile/messages/base/Result;", "", "Lcom/untis/mobile/messages/data/model/Message;", "result", "observeSentMessagesViewState", "message", "", "position", "onMessageClick", "numberOfConfirmed", "totalConfirmations", "", "messageId", "onReadConfirmationCounterClick", "Lcom/untis/mobile/messages/util/AlertDialogTypes;", "type", "onDeleteOrRevokeMessageClick", "deletedMessageIndex", "showDeleteOrRevokeAlertDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "onResume", "Lcom/untis/mobile/messages/ui/sent/viewmodel/SentMessagesViewModel;", "sentMessagesViewModel$delegate", "Lkotlin/b0;", "getSentMessagesViewModel", "()Lcom/untis/mobile/messages/ui/sent/viewmodel/SentMessagesViewModel;", "sentMessagesViewModel", "Landroid/app/AlertDialog;", "deleteMessageAlert", "Landroid/app/AlertDialog;", "Lcom/untis/mobile/messages/ui/sent/adapter/SentMessagesListAdapter;", "sentMessagesListAdapter", "Lcom/untis/mobile/messages/ui/sent/adapter/SentMessagesListAdapter;", "mainView", "Landroid/view/View;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class SentMessagesFragment extends UmFragment
{
    private AlertDialog deleteMessageAlert;
    private View mainView;
    @e
    private final SentMessagesListAdapter sentMessagesListAdapter;
    @e
    private final b0 sentMessagesViewModel$delegate;
    
    public SentMessagesFragment() {
        this.sentMessagesViewModel$delegate = d0.c((n6.a<?>)new SentMessagesFragment$special$$inlined$sharedViewModel$default.SentMessagesFragment$special$$inlined$sharedViewModel$default$2((Fragment)this, (a)null, (n6.a)new SentMessagesFragment$special$$inlined$sharedViewModel$default.SentMessagesFragment$special$$inlined$sharedViewModel$default$1((Fragment)this), (n6.a)null));
        this.sentMessagesListAdapter = new SentMessagesListAdapter((p<? super Message, ? super Integer, j2>)new SentMessagesFragment$sentMessagesListAdapter.SentMessagesFragment$sentMessagesListAdapter$1(this), (q<? super Integer, ? super Integer, ? super String, j2>)new SentMessagesFragment$sentMessagesListAdapter.SentMessagesFragment$sentMessagesListAdapter$2(this), (q<? super String, ? super Integer, ? super AlertDialogTypes, j2>)new SentMessagesFragment$sentMessagesListAdapter.SentMessagesFragment$sentMessagesListAdapter$3(this));
    }
    
    private final SentMessagesViewModel getSentMessagesViewModel() {
        return this.sentMessagesViewModel$delegate.getValue();
    }
    
    private final void initLayoutEmptyView() {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView.findViewById(c.i.UD)).setText((CharSequence)this.getString(2131886750));
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        ((TextView)mainView2.findViewById(c.i.VD)).setText((CharSequence)this.getString(2131886428));
        final View mainView3 = this.mainView;
        if (mainView3 != null) {
            ((FloatingActionButton)mainView3.findViewById(c.i.SD)).setImageResource(2131231127);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final void initSentMessagesRecycleView() {
        final View mainView = this.mainView;
        if (mainView == null) {
            k0.S("mainView");
            throw null;
        }
        final int pl = c.i.PL;
        ((RecyclerView)mainView.findViewById(pl)).setAdapter((RecyclerView$h)this.sentMessagesListAdapter);
        final View mainView2 = this.mainView;
        if (mainView2 == null) {
            k0.S("mainView");
            throw null;
        }
        ((RecyclerView)mainView2.findViewById(pl)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(this.requireContext()));
        final View mainView3 = this.mainView;
        if (mainView3 != null) {
            ((RecyclerView)mainView3.findViewById(pl)).setHasFixedSize(false);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private final void observeSentMessagesViewState(final Result<? extends List<Message>> result) {
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
                ((ProgressBar)mainView.findViewById(c.i.lE)).setVisibility(0);
            }
            else {
                final View mainView2 = this.mainView;
                if (mainView2 == null) {
                    k0.S("mainView");
                    throw null;
                }
                ((ProgressBar)mainView2.findViewById(c.i.lE)).setVisibility(8);
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
            ((ProgressBar)mainView3.findViewById(c.i.lE)).setVisibility(8);
            final List list = (List)result.getData();
            if (list != null) {
                this.sentMessagesListAdapter.submitList(list);
                if (list.isEmpty() ^ true) {
                    final View mainView4 = this.mainView;
                    if (mainView4 == null) {
                        k0.S("mainView");
                        throw null;
                    }
                    mainView4.findViewById(c.i.KG).setVisibility(8);
                }
                else {
                    final View mainView5 = this.mainView;
                    if (mainView5 == null) {
                        k0.S("mainView");
                        throw null;
                    }
                    mainView5.findViewById(c.i.KG).setVisibility(0);
                }
            }
        }
    }
    
    private static final void onActivityCreated$lambda-0(final SentMessagesFragment sentMessagesFragment, final Result result) {
        k0.p(sentMessagesFragment, "this$0");
        final View mainView = sentMessagesFragment.mainView;
        if (mainView != null) {
            ((SwipeRefreshLayout)mainView.findViewById(c.i.dK)).setRefreshing(false);
            k0.o(result, "it");
            sentMessagesFragment.observeSentMessagesViewState(result);
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    private static final void onActivityCreated$lambda-1(final SentMessagesFragment sentMessagesFragment) {
        k0.p(sentMessagesFragment, "this$0");
        sentMessagesFragment.getSentMessagesViewModel().getSentMessages();
    }
    
    private final void onDeleteOrRevokeMessageClick(final String s, final int n, final AlertDialogTypes alertDialogTypes) {
        this.showDeleteOrRevokeAlertDialog(s, n, alertDialogTypes);
    }
    
    private final void onMessageClick(final Message message, final int n) {
        androidx.navigation.fragment.c.a((Fragment)this).D(MessagesMainFragmentDirections.Companion.actionMessagesMainFragmentToSentMessageDetailsFragment(message.getId(), n));
    }
    
    private final void onReadConfirmationCounterClick(final int n, final int n2, final String s) {
        androidx.navigation.fragment.c.a((Fragment)this).D(MessagesMainFragmentDirections.Companion.actionMessagesMainFragmentToReadConfirmationRecipientsFragment(n, n2, s));
    }
    
    private final void showDeleteOrRevokeAlertDialog(final String s, final int n, final AlertDialogTypes alertDialogTypes) {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "this.requireContext()");
        final AlertDialog create = UiUtilsKt.getDeleteOrRevokeMessageAlertDialog(requireContext, (l<? super DialogInterface, j2>)new SentMessagesFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder.SentMessagesFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder$1(this, n, alertDialogTypes, s), (l<? super DialogInterface, j2>)SentMessagesFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder.SentMessagesFragment$showDeleteOrRevokeAlertDialog$deleteMessageAlertBuilder$2.INSTANCE, alertDialogTypes).create();
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
    
    public void onActivityCreated(@f final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.getSentMessagesViewModel().getSentMessagesLiveData().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.messages.ui.sent.a(this));
        final View mainView = this.mainView;
        if (mainView != null) {
            ((SwipeRefreshLayout)mainView.findViewById(c.i.dK)).setOnRefreshListener((SwipeRefreshLayout$j)new com.untis.mobile.messages.ui.sent.b(this));
            return;
        }
        k0.S("mainView");
        throw null;
    }
    
    @e
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493303, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.messages_fragment_sent, container, false)");
        this.mainView = inflate;
        this.initSentMessagesRecycleView();
        this.initLayoutEmptyView();
        final View mainView = this.mainView;
        if (mainView != null) {
            return mainView;
        }
        k0.S("mainView");
        throw null;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.getSentMessagesViewModel().getSentMessages();
    }
}
