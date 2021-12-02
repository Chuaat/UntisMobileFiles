// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation;

import android.widget.ImageView;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.messages.data.model.ReadConfirmationState;
import android.content.Context;
import java.util.List;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import android.widget.ProgressBar;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.l0;
import kotlin.jvm.internal.k0;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View;
import com.untis.mobile.messages.ui.sent.readconfirmation.viewmodel.ReadConfirmationViewModel;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import kotlin.j2;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import n6.l;
import kotlin.d0;
import l7.a;
import androidx.lifecycle.y;
import kotlin.b0;
import com.untis.mobile.messages.ui.sent.readconfirmation.adapter.ReadConfirmationRecipientsListAdapter;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "initViews", "observeReadConfirmationRecipientsState", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "readConfirmationStatus", "onRecipientClick", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/viewmodel/ReadConfirmationViewModel;", "readConfirmationViewModel$delegate", "Lkotlin/b0;", "getReadConfirmationViewModel", "()Lcom/untis/mobile/messages/ui/sent/readconfirmation/viewmodel/ReadConfirmationViewModel;", "readConfirmationViewModel", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/adapter/ReadConfirmationRecipientsListAdapter;", "readConfirmationRecipientsListAdapter", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/adapter/ReadConfirmationRecipientsListAdapter;", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentArgs;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class ReadConfirmationRecipientsFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    @e
    private final ReadConfirmationRecipientsListAdapter readConfirmationRecipientsListAdapter;
    @e
    private final b0 readConfirmationViewModel$delegate;
    
    public ReadConfirmationRecipientsFragment() {
        this.readConfirmationViewModel$delegate = d0.c((n6.a<?>)new ReadConfirmationRecipientsFragment$special$$inlined$viewModel$default.ReadConfirmationRecipientsFragment$special$$inlined$viewModel$default$1((y)this, (a)null, (n6.a)null));
        this.readConfirmationRecipientsListAdapter = new ReadConfirmationRecipientsListAdapter((l<? super ReadConfirmationStatus, j2>)new ReadConfirmationRecipientsFragment$readConfirmationRecipientsListAdapter.ReadConfirmationRecipientsFragment$readConfirmationRecipientsListAdapter$1(this));
        this.args$delegate = new m(k1.d(ReadConfirmationRecipientsFragmentArgs.class), (n6.a)new ReadConfirmationRecipientsFragment$special$$inlined$navArgs.ReadConfirmationRecipientsFragment$special$$inlined$navArgs$1((Fragment)this));
    }
    
    private final ReadConfirmationRecipientsFragmentArgs getArgs() {
        return ((b0<ReadConfirmationRecipientsFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final ReadConfirmationViewModel getReadConfirmationViewModel() {
        return this.readConfirmationViewModel$delegate.getValue();
    }
    
    private final void initViews(final View view) {
        this.getReadConfirmationViewModel().getMessageId().n((Object)this.getArgs().getMessageId());
        ((ImageView)view.findViewById(c.i.gr)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.readconfirmation.a(this));
        ((TextView)view.findViewById(c.i.EG)).setText((CharSequence)String.valueOf(this.getArgs().getNumberOfConfirms()));
        ((TextView)view.findViewById(c.i.FG)).setText((CharSequence)String.valueOf(this.getArgs().getTotalConfirmations()));
        final int zj = c.i.ZJ;
        ((RecyclerView)view.findViewById(zj)).setAdapter((RecyclerView$h)this.readConfirmationRecipientsListAdapter);
        ((RecyclerView)view.findViewById(zj)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(this.requireContext()));
    }
    
    private static final void initViews$lambda-0(final ReadConfirmationRecipientsFragment readConfirmationRecipientsFragment, final View view) {
        k0.p(readConfirmationRecipientsFragment, "this$0");
        readConfirmationRecipientsFragment.onBackPressed();
    }
    
    private final void observeReadConfirmationRecipientsState(final View view) {
        this.getReadConfirmationViewModel().getReadConfirmationStatusLiveData().j(this.getViewLifecycleOwner(), (l0)new b(view, this));
    }
    
    private static final void observeReadConfirmationRecipientsState$lambda-3(final View view, final ReadConfirmationRecipientsFragment readConfirmationRecipientsFragment, final Result result) {
        k0.p(view, "$view");
        k0.p(readConfirmationRecipientsFragment, "this$0");
        final int n = WhenMappings.$EnumSwitchMapping$0[result.getStatus().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    ((ProgressBar)view.findViewById(c.i.ir)).setVisibility(0);
                }
            }
            else {
                ((ProgressBar)view.findViewById(c.i.ir)).setVisibility(8);
                timber.log.b.e(String.valueOf(result.getMessage()), new Object[0]);
                final Context requireContext = readConfirmationRecipientsFragment.requireContext();
                k0.o(requireContext, "this.requireContext()");
                final String string = readConfirmationRecipientsFragment.getString(2131886693);
                k0.o(string, "getString(R.string.shared_error_default_text)");
                h.k(requireContext, s.k2(string, "{0}", "", false, 4, (Object)null));
            }
        }
        else {
            ((ProgressBar)view.findViewById(c.i.ir)).setVisibility(8);
            final List<ReadConfirmationStatus> list = result.getData();
            if (list != null) {
                readConfirmationRecipientsFragment.readConfirmationRecipientsListAdapter.submitList(list);
            }
        }
    }
    
    private final void onRecipientClick(final ReadConfirmationStatus readConfirmationStatus) {
        final List<ReadConfirmationState> readConfirmationStates = readConfirmationStatus.getReadConfirmationStates();
        if (readConfirmationStates != null) {
            if (readConfirmationStates.size() > 1) {
                androidx.navigation.fragment.c.a((Fragment)this).D(ReadConfirmationRecipientsFragmentDirections.Companion.actionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment(readConfirmationStatus));
            }
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493300, viewGroup, false);
        k0.o(inflate, "view");
        this.initViews(inflate);
        this.observeReadConfirmationRecipientsState(inflate);
        return inflate;
    }
}
