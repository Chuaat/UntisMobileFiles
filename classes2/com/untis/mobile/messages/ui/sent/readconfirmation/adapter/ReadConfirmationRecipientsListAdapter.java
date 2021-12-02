// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation.adapter;

import android.content.Context;
import java.util.Iterator;
import android.widget.ImageView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.messages.data.model.extension.ReadConfirmationStateExtKt;
import androidx.core.content.d;
import android.widget.TextView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.messages.data.model.ReadConfirmationState;
import android.view.View$OnClickListener;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.j2;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import n6.l;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB*\u0012!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/adapter/ReadConfirmationRecipientsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/adapter/ReadConfirmationRecipientsListAdapter$ReadConfirmationRecipientViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "getItemCount", "", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "newList", "submitList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "recipientsList", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "readConfirmationStatus", "onRecipientClick", "<init>", "(Ln6/l;)V", "ReadConfirmationRecipientViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ReadConfirmationRecipientsListAdapter extends RecyclerView$h<ReadConfirmationRecipientViewHolder>
{
    @e
    private final l<ReadConfirmationStatus, j2> onRecipientClick;
    @e
    private final ArrayList<ReadConfirmationStatus> recipientsList;
    
    public ReadConfirmationRecipientsListAdapter(@e final l<? super ReadConfirmationStatus, j2> onRecipientClick) {
        k0.p(onRecipientClick, "onRecipientClick");
        this.onRecipientClick = (l<ReadConfirmationStatus, j2>)onRecipientClick;
        this.recipientsList = new ArrayList<ReadConfirmationStatus>();
    }
    
    public static final /* synthetic */ l access$getOnRecipientClick$p(final ReadConfirmationRecipientsListAdapter readConfirmationRecipientsListAdapter) {
        return readConfirmationRecipientsListAdapter.onRecipientClick;
    }
    
    public int getItemCount() {
        return this.recipientsList.size();
    }
    
    public void onBindViewHolder(@e final ReadConfirmationRecipientViewHolder readConfirmationRecipientViewHolder, final int index) {
        k0.p(readConfirmationRecipientViewHolder, "holder");
        final ReadConfirmationStatus value = this.recipientsList.get(index);
        k0.o(value, "recipientsList[position]");
        readConfirmationRecipientViewHolder.bind(value);
    }
    
    @e
    public ReadConfirmationRecipientViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493242, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_read_confirmation_recipient, parent, false)");
        return new ReadConfirmationRecipientViewHolder(inflate);
    }
    
    public final void submitList(@e final List<ReadConfirmationStatus> c) {
        k0.p(c, "newList");
        this.recipientsList.clear();
        this.recipientsList.addAll(c);
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/adapter/ReadConfirmationRecipientsListAdapter$ReadConfirmationRecipientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "readConfirmationStatus", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/sent/readconfirmation/adapter/ReadConfirmationRecipientsListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class ReadConfirmationRecipientViewHolder extends RecyclerView$g0
    {
        public ReadConfirmationRecipientViewHolder(final View view) {
            k0.p(ReadConfirmationRecipientsListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-3$lambda-0(final ReadConfirmationRecipientsListAdapter readConfirmationRecipientsListAdapter, final ReadConfirmationStatus readConfirmationStatus, final View view) {
            k0.p(readConfirmationRecipientsListAdapter, "this$0");
            k0.p(readConfirmationStatus, "$readConfirmationStatus");
            ReadConfirmationRecipientsListAdapter.access$getOnRecipientClick$p(readConfirmationRecipientsListAdapter).invoke(readConfirmationStatus);
        }
        
        public final void bind(@e final ReadConfirmationStatus readConfirmationStatus) {
            k0.p(readConfirmationStatus, "readConfirmationStatus");
            final View itemView = super.itemView;
            itemView.setOnClickListener((View$OnClickListener)new a(ReadConfirmationRecipientsListAdapter.this, readConfirmationStatus));
            final List<ReadConfirmationState> readConfirmationStates = readConfirmationStatus.getReadConfirmationStates();
            if (readConfirmationStates != null) {
                if (readConfirmationStates.size() == 1 && k0.g(readConfirmationStatus.getRecipientId(), readConfirmationStates.get(0).getUserId())) {
                    ((ImageView)itemView.findViewById(c.i.yB)).setVisibility(8);
                    final int tb = c.i.tB;
                    ((TextView)itemView.findViewById(tb)).setVisibility(0);
                    ((TextView)itemView.findViewById(tb)).setText((CharSequence)ReadConfirmationStateExtKt.getConfirmationFormattedDate(readConfirmationStates.get(0), d.f(itemView.getContext(), 2131099984)));
                }
                else if (readConfirmationStates.size() > 1) {
                    ((ImageView)itemView.findViewById(c.i.yB)).setVisibility(0);
                    ((TextView)itemView.findViewById(c.i.tB)).setVisibility(8);
                }
            }
            ((TextView)itemView.findViewById(c.i.xB)).setText((CharSequence)readConfirmationStatus.getRecipientDisplayName());
            final int ub = c.i.uB;
            final TextView textView = (TextView)itemView.findViewById(ub);
            final String recipientClassName = readConfirmationStatus.getRecipientClassName();
            final boolean b = recipientClassName == null || recipientClassName.length() == 0;
            final ReadConfirmationState readConfirmationState = null;
            final ReadConfirmationState readConfirmationState2 = null;
            textView.setVisibility(h.U(b ^ true, 0, 1, null));
            ((TextView)itemView.findViewById(ub)).setText((CharSequence)readConfirmationStatus.getRecipientClassName());
            final List<ReadConfirmationState> readConfirmationStates2 = readConfirmationStatus.getReadConfirmationStates();
            ReadConfirmationState readConfirmationState3;
            if (readConfirmationStates2 == null) {
                readConfirmationState3 = readConfirmationState;
            }
            else {
                final Iterator<Object> iterator = readConfirmationStates2.iterator();
                ReadConfirmationState next;
                do {
                    next = readConfirmationState2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                } while (next.getDate() == null);
                readConfirmationState3 = next;
            }
            final TextView textView2 = (TextView)itemView.findViewById(c.i.xB);
            final Context context = itemView.getContext();
            if (readConfirmationState3 != null) {
                textView2.setTextColor(d.f(context, 2131099989));
                ((ImageView)itemView.findViewById(c.i.vB)).setVisibility(0);
            }
            else {
                textView2.setTextColor(d.f(context, 2131099995));
                ((ImageView)itemView.findViewById(c.i.vB)).setVisibility(4);
            }
        }
    }
}
