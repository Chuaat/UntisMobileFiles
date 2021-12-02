// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.search;

import androidx.lifecycle.LiveData;
import android.widget.ImageView;
import kotlin.j2;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.List;
import kotlin.text.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ProgressBar;
import com.untis.mobile.messages.base.Result;
import java.util.Arrays;
import kotlin.jvm.internal.p1;
import com.untis.mobile.utils.extension.h;
import android.widget.TextView;
import com.untis.mobile.messages.data.model.Message;
import com.untis.mobile.messages.util.SendMessageActions;
import android.view.MotionEvent;
import android.annotation.SuppressLint;
import androidx.lifecycle.l0;
import com.untis.mobile.messages.ui.send.SelectedRecipientsCommonKt;
import android.view.View$OnTouchListener;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.SearchView$OnQueryTextListener;
import android.widget.SearchView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.d;
import android.widget.ImageButton;
import androidx.lifecycle.k0;
import com.untis.mobile.messages.util.SendMessageTypes;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import com.untis.mobile.messages.ui.send.search.viewmodel.SearchRecipientViewModel;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import kotlin.d0;
import l7.a;
import androidx.lifecycle.y;
import com.untis.mobile.messages.ui.send.search.adapter.SearchRecipientsListAdapter;
import kotlin.b0;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlinx.coroutines.z1;
import kotlinx.coroutines.a2;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "Lcom/untis/mobile/messages/ui/send/search/SearchRecipientFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "handleScreenTitle", "initViews", "observeSearchRecipientViewState", "onRecipientClick", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/messages/ui/send/search/SearchRecipientFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/send/search/SearchRecipientFragmentArgs;", "args", "Lcom/untis/mobile/messages/ui/send/search/adapter/SearchRecipientsListAdapter;", "searchRecipientsListAdapter", "Lcom/untis/mobile/messages/ui/send/search/adapter/SearchRecipientsListAdapter;", "Lcom/untis/mobile/messages/ui/send/search/viewmodel/SearchRecipientViewModel;", "searchRecipientViewModel$delegate", "Lkotlin/b0;", "getSearchRecipientViewModel", "()Lcom/untis/mobile/messages/ui/send/search/viewmodel/SearchRecipientViewModel;", "searchRecipientViewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@a2
@z1
public final class SearchRecipientFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    @e
    private final b0 searchRecipientViewModel$delegate;
    private SearchRecipientsListAdapter searchRecipientsListAdapter;
    
    public SearchRecipientFragment() {
        this.searchRecipientViewModel$delegate = d0.c((n6.a<?>)new SearchRecipientFragment$special$$inlined$viewModel$default.SearchRecipientFragment$special$$inlined$viewModel$default$1((y)this, (a)null, (n6.a)null));
        this.args$delegate = new m(k1.d(SearchRecipientFragmentArgs.class), (n6.a)new SearchRecipientFragment$special$$inlined$navArgs.SearchRecipientFragment$special$$inlined$navArgs$1((Fragment)this));
    }
    
    private final SearchRecipientFragmentArgs getArgs() {
        return ((b0<SearchRecipientFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final SearchRecipientViewModel getSearchRecipientViewModel() {
        return this.searchRecipientViewModel$delegate.getValue();
    }
    
    private final void handleScreenTitle(final View view) {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.getArgs().getRecipientsType().ordinal()];
        k0<SendMessageTypes> k0;
        SendMessageTypes sendMessageTypes;
        if (n != 1) {
            if (n != 2) {
                return;
            }
            ((TextView)view.findViewById(c.i.kG)).setText((CharSequence)this.getString(2131886405));
            k0 = this.getSearchRecipientViewModel().getSendMessageType();
            sendMessageTypes = SendMessageTypes.PARENTS;
        }
        else {
            ((TextView)view.findViewById(c.i.kG)).setText((CharSequence)this.getString(2131886406));
            k0 = this.getSearchRecipientViewModel().getSendMessageType();
            sendMessageTypes = SendMessageTypes.STUDENTS;
        }
        k0.n((Object)sendMessageTypes);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    private final void initViews(final View view) {
        final int eg = c.i.eG;
        ((ImageButton)view.findViewById(eg)).setColorFilter(d.f(this.requireContext(), 2131100003));
        ((ImageView)view.findViewById(c.i.Xq)).setOnClickListener((View$OnClickListener)new b(this));
        ((SearchView)view.findViewById(c.i.lG)).setOnQueryTextListener((SearchView$OnQueryTextListener)new SearchRecipientFragment$initViews.SearchRecipientFragment$initViews$2(this));
        final int ig = c.i.iG;
        ((RecyclerView)view.findViewById(ig)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(this.requireContext()));
        final SearchRecipientsListAdapter searchRecipientsListAdapter = this.searchRecipientsListAdapter;
        if (searchRecipientsListAdapter == null) {
            kotlin.jvm.internal.k0.S("searchRecipientsListAdapter");
            throw null;
        }
        searchRecipientsListAdapter.setRecipientSearchMaxResult(this.getArgs().getRecipientSearchMaxResult());
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(ig);
        final SearchRecipientsListAdapter searchRecipientsListAdapter2 = this.searchRecipientsListAdapter;
        if (searchRecipientsListAdapter2 != null) {
            recyclerView.setAdapter((RecyclerView$h)searchRecipientsListAdapter2);
            ((ViewGroup)view.findViewById(ig)).setOnTouchListener((View$OnTouchListener)new com.untis.mobile.messages.ui.send.search.c(view));
            ((ImageButton)view.findViewById(eg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.search.a(this));
            ((LiveData)SelectedRecipientsCommonKt.getNumberOfSelectedRecipientsLiveData()).j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.messages.ui.send.search.e(view, this));
            return;
        }
        kotlin.jvm.internal.k0.S("searchRecipientsListAdapter");
        throw null;
    }
    
    private static final void initViews$lambda-0(final SearchRecipientFragment searchRecipientFragment, final View view) {
        kotlin.jvm.internal.k0.p(searchRecipientFragment, "this$0");
        searchRecipientFragment.onBackPressed();
    }
    
    private static final boolean initViews$lambda-1(final View view, final View view2, final MotionEvent motionEvent) {
        kotlin.jvm.internal.k0.p(view, "$view");
        ((SearchView)view.findViewById(c.i.lG)).clearFocus();
        return false;
    }
    
    private static final void initViews$lambda-2(final SearchRecipientFragment searchRecipientFragment, final View view) {
        kotlin.jvm.internal.k0.p(searchRecipientFragment, "this$0");
        if (searchRecipientFragment.getArgs().getFromSendEditorFragment()) {
            androidx.navigation.fragment.c.a((Fragment)searchRecipientFragment).J(2131298773, false);
        }
        else {
            androidx.navigation.fragment.c.a((Fragment)searchRecipientFragment).D(SearchRecipientFragmentDirections.Companion.actionSearchRecipientFragmentToSendMessageEditorFragment$default(SearchRecipientFragmentDirections.Companion, searchRecipientFragment.getArgs().getRecipientsType(), searchRecipientFragment.getArgs().getAllowRequestReadConfirmation(), searchRecipientFragment.getArgs().getRecipientSearchMaxResult(), null, null, 24, null));
        }
    }
    
    private static final void initViews$lambda-3(final View view, final SearchRecipientFragment searchRecipientFragment, final Integer n) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(searchRecipientFragment, "this$0");
        final int jg = c.i.jG;
        final TextView textView = (TextView)view.findViewById(jg);
        kotlin.jvm.internal.k0.o(n, "it");
        textView.setVisibility(h.U(n > 0, 0, 1, null));
        final int intValue = n;
        final TextView textView2 = (TextView)view.findViewById(jg);
        String text;
        if (intValue == 1) {
            final p1 a = p1.a;
            final String string = searchRecipientFragment.getString(2131886424);
            kotlin.jvm.internal.k0.o(string, "getString(R.string.message_single_selected_recipient)");
            text = String.format(string, Arrays.copyOf(new Object[] { 1 }, 1));
        }
        else {
            final p1 a2 = p1.a;
            final String string2 = searchRecipientFragment.getString(2131886390);
            kotlin.jvm.internal.k0.o(string2, "getString(R.string.message_number_of_selected_recipient)");
            text = String.format(string2, Arrays.copyOf(new Object[] { n }, 1));
        }
        kotlin.jvm.internal.k0.o(text, "java.lang.String.format(format, *args)");
        textView2.setText((CharSequence)text);
    }
    
    private final void observeSearchRecipientViewState(final View view) {
        this.getSearchRecipientViewModel().getRecipientsLiveData().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.messages.ui.send.search.d(view, this));
    }
    
    private static final void observeSearchRecipientViewState$lambda-6(final View view, final SearchRecipientFragment searchRecipientFragment, final Result result) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(searchRecipientFragment, "this$0");
        final int n = WhenMappings.$EnumSwitchMapping$1[result.getStatus().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    ((ProgressBar)view.findViewById(c.i.lL)).setVisibility(0);
                    ((ViewGroup)view.findViewById(c.i.iG)).setVisibility(8);
                    ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(8);
                }
            }
            else {
                ((ProgressBar)view.findViewById(c.i.lL)).setVisibility(8);
                ((ViewGroup)view.findViewById(c.i.iG)).setVisibility(8);
                Context context;
                String k2;
                if (kotlin.jvm.internal.k0.g(result.getMessage(), "internet")) {
                    final Context requireContext = searchRecipientFragment.requireContext();
                    kotlin.jvm.internal.k0.o(requireContext, "this.requireContext()");
                    final String string = searchRecipientFragment.getString(2131886819);
                    kotlin.jvm.internal.k0.o(string, "getString(R.string.substitutionPlanning_noConnection_text)");
                    context = requireContext;
                    k2 = string;
                }
                else {
                    final Context requireContext2 = searchRecipientFragment.requireContext();
                    kotlin.jvm.internal.k0.o(requireContext2, "this.requireContext()");
                    final String string2 = searchRecipientFragment.getString(2131886693);
                    kotlin.jvm.internal.k0.o(string2, "getString(R.string.shared_error_default_text)");
                    k2 = s.k2(string2, "{0}", "", false, 4, (Object)null);
                    context = requireContext2;
                }
                h.k(context, k2);
            }
        }
        else {
            ((ProgressBar)view.findViewById(c.i.lL)).setVisibility(8);
            final List<Recipient> list = result.getData();
            if (list != null) {
                if (list.isEmpty() ^ true) {
                    final SearchRecipientsListAdapter searchRecipientsListAdapter = searchRecipientFragment.searchRecipientsListAdapter;
                    if (searchRecipientsListAdapter == null) {
                        kotlin.jvm.internal.k0.S("searchRecipientsListAdapter");
                        throw null;
                    }
                    searchRecipientsListAdapter.submitList(list);
                }
                else {
                    ((FloatingActionButton)view.findViewById(c.i.SD)).setImageDrawable(d.i(searchRecipientFragment.requireContext(), 2131231148));
                    ((TextView)view.findViewById(c.i.VD)).setText(2131886743);
                    ((TextView)view.findViewById(c.i.UD)).setText(2131886742);
                }
                ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(h.U(list.isEmpty(), 0, 1, null));
                ((ViewGroup)view.findViewById(c.i.iG)).setVisibility(h.U(list.isEmpty() ^ true, 0, 1, null));
            }
        }
    }
    
    private final void onRecipientClick(final View view) {
        ((SearchView)view.findViewById(c.i.lG)).clearFocus();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493294, viewGroup, false);
        this.searchRecipientsListAdapter = new SearchRecipientsListAdapter((n6.a<j2>)new SearchRecipientFragment$onCreateView.SearchRecipientFragment$onCreateView$1(this, inflate));
        kotlin.jvm.internal.k0.o(inflate, "view");
        this.handleScreenTitle(inflate);
        this.initViews(inflate);
        this.observeSearchRecipientViewState(inflate);
        return inflate;
    }
}
