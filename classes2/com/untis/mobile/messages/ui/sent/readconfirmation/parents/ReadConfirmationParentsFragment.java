// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation.parents;

import android.widget.ImageView;
import kotlin.b0;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.k0;
import java.util.Iterator;
import java.util.List;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.messages.data.model.ReadConfirmationState;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View;
import n6.a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import com.untis.mobile.messages.ui.sent.readconfirmation.parents.adapter.ReadConfirmationParentsListAdapter;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/ReadConfirmationParentsFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "initViews", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/ReadConfirmationParentsFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/ReadConfirmationParentsFragmentArgs;", "args", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/adapter/ReadConfirmationParentsListAdapter;", "readConfirmationParentsListAdapter", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/adapter/ReadConfirmationParentsListAdapter;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ReadConfirmationParentsFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    @e
    private final ReadConfirmationParentsListAdapter readConfirmationParentsListAdapter;
    
    public ReadConfirmationParentsFragment() {
        this.readConfirmationParentsListAdapter = new ReadConfirmationParentsListAdapter();
        this.args$delegate = new m(k1.d(ReadConfirmationParentsFragmentArgs.class), (a)new ReadConfirmationParentsFragment$special$$inlined$navArgs.ReadConfirmationParentsFragment$special$$inlined$navArgs$1((Fragment)this));
    }
    
    private final ReadConfirmationParentsFragmentArgs getArgs() {
        return ((b0<ReadConfirmationParentsFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final void initViews(final View view) {
        ((ImageView)view.findViewById(c.i.dr)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.sent.readconfirmation.parents.a(this));
        ((TextView)view.findViewById(c.i.er)).setText((CharSequence)this.getArgs().getReadConfirmationStatus().getRecipientDisplayName());
        final int yj = c.i.YJ;
        ((RecyclerView)view.findViewById(yj)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(this.requireContext()));
        ((RecyclerView)view.findViewById(yj)).setAdapter((RecyclerView$h)this.readConfirmationParentsListAdapter);
        final List<ReadConfirmationState> readConfirmationStates = this.getArgs().getReadConfirmationStatus().getReadConfirmationStates();
        if (readConfirmationStates != null) {
            this.readConfirmationParentsListAdapter.submitList(readConfirmationStates);
        }
        final TextView textView = (TextView)view.findViewById(c.i.VF);
        final List<ReadConfirmationState> readConfirmationStates2 = this.getArgs().getReadConfirmationStatus().getReadConfirmationStates();
        ReadConfirmationState readConfirmationState = null;
        Label_0199: {
            if (readConfirmationStates2 != null) {
                while (true) {
                    for (final ReadConfirmationState next : readConfirmationStates2) {
                        if (next.getDate() != null) {
                            readConfirmationState = next;
                            break Label_0199;
                        }
                    }
                    ReadConfirmationState next = null;
                    continue;
                }
            }
            readConfirmationState = null;
        }
        textView.setVisibility(h.U(readConfirmationState != null, 0, 1, null));
    }
    
    private static final void initViews$lambda-0(final ReadConfirmationParentsFragment readConfirmationParentsFragment, final View view) {
        k0.p(readConfirmationParentsFragment, "this$0");
        readConfirmationParentsFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493299, viewGroup, false);
        k0.o(inflate, "view");
        this.initViews(inflate);
        return inflate;
    }
}
