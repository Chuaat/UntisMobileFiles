// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.search.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.services.image.b;
import java.util.Set;
import java.util.Iterator;
import kotlin.jvm.internal.q1;
import java.util.Objects;
import com.untis.mobile.messages.ui.send.SelectedRecipientsCommonKt;
import com.untis.mobile.messages.ui.send.RecipientsTypes;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.a;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0015\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0014j\b\u0012\u0004\u0012\u00020\u000e`\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006'" }, d2 = { "Lcom/untis/mobile/messages/ui/send/search/adapter/SearchRecipientsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "getItemCount", "", "Lcom/untis/mobile/messages/data/model/Recipient;", "newList", "submitList", "getItemViewType", "normalViewType", "I", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "recipients", "Ljava/util/ArrayList;", "warningViewType", "recipientSearchMaxResult", "getRecipientSearchMaxResult", "()I", "setRecipientSearchMaxResult", "(I)V", "Lkotlin/Function0;", "onRecipientClick", "Ln6/a;", "getOnRecipientClick", "()Ln6/a;", "<init>", "(Ln6/a;)V", "SearchRecipientWarningViewHolder", "SearchRecipientsViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SearchRecipientsListAdapter extends RecyclerView$h<RecyclerView$g0>
{
    private final int normalViewType;
    @e
    private final a<j2> onRecipientClick;
    private int recipientSearchMaxResult;
    @e
    private final ArrayList<Recipient> recipients;
    private final int warningViewType;
    
    public SearchRecipientsListAdapter(@e final a<j2> onRecipientClick) {
        k0.p(onRecipientClick, "onRecipientClick");
        this.onRecipientClick = onRecipientClick;
        this.recipients = new ArrayList<Recipient>();
        this.normalViewType = 1;
    }
    
    public static final /* synthetic */ ArrayList access$getRecipients$p(final SearchRecipientsListAdapter searchRecipientsListAdapter) {
        return searchRecipientsListAdapter.recipients;
    }
    
    public int getItemCount() {
        int size;
        if (this.recipients.size() == this.recipientSearchMaxResult) {
            size = this.recipients.size() + 1;
        }
        else {
            size = this.recipients.size();
        }
        return size;
    }
    
    public int getItemViewType(int n) {
        if (this.recipients.size() == this.recipientSearchMaxResult && n == this.recipients.size()) {
            n = this.warningViewType;
        }
        else {
            n = this.normalViewType;
        }
        return n;
    }
    
    @e
    public final a<j2> getOnRecipientClick() {
        return this.onRecipientClick;
    }
    
    public final int getRecipientSearchMaxResult() {
        return this.recipientSearchMaxResult;
    }
    
    public void onBindViewHolder(@e final RecyclerView$g0 recyclerView$g0, final int index) {
        k0.p(recyclerView$g0, "holder");
        if (recyclerView$g0 instanceof SearchRecipientsViewHolder) {
            final SearchRecipientsViewHolder searchRecipientsViewHolder = (SearchRecipientsViewHolder)recyclerView$g0;
            final Recipient value = this.recipients.get(index);
            k0.o(value, "recipients[position]");
            searchRecipientsViewHolder.bind(value);
        }
        else if (recyclerView$g0 instanceof SearchRecipientWarningViewHolder) {
            ((SearchRecipientWarningViewHolder)recyclerView$g0).bind();
        }
    }
    
    @e
    public RecyclerView$g0 onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        RecyclerView$g0 recyclerView$g0;
        if (n == this.normalViewType) {
            final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493223, viewGroup, false);
            k0.o(inflate, "from(parent.context).inflate(R.layout.item_messages_search_recipient_view, parent, false)");
            recyclerView$g0 = new SearchRecipientsViewHolder(inflate);
        }
        else {
            final View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(2131493221, viewGroup, false);
            k0.o(inflate2, "from(parent.context).inflate(R.layout.item_messages_recipient_more_search_warning_view, parent, false)");
            recyclerView$g0 = new SearchRecipientWarningViewHolder(inflate2);
        }
        return recyclerView$g0;
    }
    
    public final void setRecipientSearchMaxResult(final int recipientSearchMaxResult) {
        this.recipientSearchMaxResult = recipientSearchMaxResult;
    }
    
    public final void submitList(@e final List<Recipient> c) {
        k0.p(c, "newList");
        this.recipients.clear();
        this.recipients.addAll(c);
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/send/search/adapter/SearchRecipientsListAdapter$SearchRecipientWarningViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/send/search/adapter/SearchRecipientsListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class SearchRecipientWarningViewHolder extends RecyclerView$g0
    {
        public SearchRecipientWarningViewHolder(final View view) {
            k0.p(SearchRecipientsListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        public final void bind() {
            final View itemView = super.itemView;
            final SearchRecipientsListAdapter this$0 = SearchRecipientsListAdapter.this;
            ((TextView)itemView.findViewById(c.i.oG)).setVisibility(h.U(SearchRecipientsListAdapter.access$getRecipients$p(this$0).size() == this$0.getRecipientSearchMaxResult(), 0, 1, null));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/ui/send/search/adapter/SearchRecipientsListAdapter$SearchRecipientsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/Recipient;", "recipient", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/send/search/adapter/SearchRecipientsListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class SearchRecipientsViewHolder extends RecyclerView$g0
    {
        public SearchRecipientsViewHolder(final View view) {
            k0.p(SearchRecipientsListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-14$lambda-12(final SearchRecipientsListAdapter searchRecipientsListAdapter, final Recipient e, final View view) {
            k0.p(searchRecipientsListAdapter, "this$0");
            k0.p(e, "$recipient");
            searchRecipientsListAdapter.getOnRecipientClick().invoke();
            e.setSubtitle(e.getClassName());
            e.setType(RecipientsTypes.RECIPIENT);
            if (e.getSelected()) {
                final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                boolean b = false;
                Label_0109: {
                    if (!(selectedRecipientsList instanceof Collection) || !selectedRecipientsList.isEmpty()) {
                        final Iterator<Object> iterator = selectedRecipientsList.iterator();
                        while (iterator.hasNext()) {
                            if (k0.g(iterator.next().getPersonId(), e.getPersonId())) {
                                b = true;
                                break Label_0109;
                            }
                        }
                    }
                    b = false;
                }
                Label_0188: {
                    if (b) {
                        final ArrayList<Recipient> selectedRecipientsList2 = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                        while (true) {
                            for (final Recipient next : SelectedRecipientsCommonKt.getSelectedRecipientsList()) {
                                if (k0.g(next.getPersonId(), e.getPersonId())) {
                                    Objects.requireNonNull(selectedRecipientsList2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                                    q1.a(selectedRecipientsList2).remove(next);
                                    break Label_0188;
                                }
                            }
                            Recipient next = null;
                            continue;
                        }
                    }
                }
                final ArrayList<Recipient> selectedRecipientsList3 = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                final ArrayList<Recipient> list = new ArrayList<Recipient>();
                for (final Recipient next2 : selectedRecipientsList3) {
                    final Set<Recipient> groupSelectedRecipients = next2.getGroupSelectedRecipients();
                    boolean b2 = false;
                    Label_0306: {
                        if (groupSelectedRecipients != null) {
                            if (!groupSelectedRecipients.isEmpty()) {
                                final Iterator<Object> iterator4 = groupSelectedRecipients.iterator();
                                while (iterator4.hasNext()) {
                                    if (k0.g(iterator4.next().getId(), e.getPersonId())) {
                                        b2 = true;
                                        break Label_0306;
                                    }
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        list.add(next2);
                    }
                }
                if (list.isEmpty() ^ true) {
                Label_0426_Outer:
                    for (final Recipient recipient : SelectedRecipientsCommonKt.getSelectedRecipientsList()) {
                        final Set<Recipient> groupSelectedRecipients2 = recipient.getGroupSelectedRecipients();
                        if (groupSelectedRecipients2 == null) {
                            continue Label_0426_Outer;
                        }
                        while (true) {
                            for (final Recipient next3 : groupSelectedRecipients2) {
                                if (k0.g(next3.getId(), e.getPersonId())) {
                                    final Recipient recipient2 = next3;
                                    if (recipient2 == null) {
                                        continue Label_0426_Outer;
                                    }
                                    final Set<Recipient> groupSelectedRecipients3 = recipient.getGroupSelectedRecipients();
                                    if (groupSelectedRecipients3 == null) {
                                        continue Label_0426_Outer;
                                    }
                                    groupSelectedRecipients3.remove(recipient2);
                                    continue Label_0426_Outer;
                                }
                            }
                            Recipient next3 = null;
                            continue;
                        }
                    }
                }
                e.setSelected(false);
            }
            else {
                final ArrayList<Recipient> selectedRecipientsList4 = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                final ArrayList<Recipient> list2 = new ArrayList<Recipient>();
                for (final Recipient next4 : selectedRecipientsList4) {
                    final Set<Recipient> groupSelectedRecipients4 = next4.getGroupSelectedRecipients();
                    boolean b3 = false;
                    Label_0588: {
                        if (groupSelectedRecipients4 != null) {
                            if (!groupSelectedRecipients4.isEmpty()) {
                                final Iterator<Object> iterator8 = groupSelectedRecipients4.iterator();
                                while (iterator8.hasNext()) {
                                    if (k0.g(iterator8.next().getId(), e.getPersonId())) {
                                        b3 = true;
                                        break Label_0588;
                                    }
                                }
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        list2.add(next4);
                    }
                }
                if (list2.isEmpty() ^ true) {
                Label_0708_Outer:
                    for (final Recipient recipient3 : SelectedRecipientsCommonKt.getSelectedRecipientsList()) {
                        final Set<Recipient> groupRecipients = recipient3.getGroupRecipients();
                        if (groupRecipients == null) {
                            continue Label_0708_Outer;
                        }
                        while (true) {
                            for (final Recipient next5 : groupRecipients) {
                                if (k0.g(next5.getId(), e.getPersonId())) {
                                    final Recipient recipient4 = next5;
                                    if (recipient4 == null) {
                                        continue Label_0708_Outer;
                                    }
                                    final Set<Recipient> groupSelectedRecipients5 = recipient3.getGroupSelectedRecipients();
                                    if (groupSelectedRecipients5 == null) {
                                        continue Label_0708_Outer;
                                    }
                                    groupSelectedRecipients5.add(recipient4);
                                    continue Label_0708_Outer;
                                }
                            }
                            Recipient next5 = null;
                            continue;
                        }
                    }
                }
                else {
                    SelectedRecipientsCommonKt.getSelectedRecipientsList().add(e);
                }
                e.setSelected(true);
            }
            SelectedRecipientsCommonKt.adjustSelectedRecipients();
            searchRecipientsListAdapter.notifyDataSetChanged();
        }
        
        public final void bind(@e final Recipient recipient) {
            k0.p(recipient, "recipient");
            final View itemView = super.itemView;
            final SearchRecipientsListAdapter this$0 = SearchRecipientsListAdapter.this;
            final b a = b.a;
            final Context context = itemView.getContext();
            k0.o(context, "this.context");
            final AppCompatImageView appCompatImageView = (AppCompatImageView)itemView.findViewById(c.i.Cz);
            k0.o(appCompatImageView, "item_message_search_recipient_image");
            a.a(context, appCompatImageView, recipient.getImageUrl(), h.J(recipient.getDisplayName()));
            ((TextView)itemView.findViewById(c.i.Dz)).setText((CharSequence)recipient.getDisplayName());
            final int bz = c.i.Bz;
            final TextView textView = (TextView)itemView.findViewById(bz);
            final String className = recipient.getClassName();
            textView.setVisibility(h.U((className == null || className.length() == 0) ^ true, 0, 1, null));
            ((TextView)itemView.findViewById(bz)).setText((CharSequence)recipient.getClassName());
            itemView.setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.search.adapter.a(this$0, recipient));
            if (!recipient.getSelected()) {
                final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                boolean b = false;
                Label_0257: {
                    if (!(selectedRecipientsList instanceof Collection) || !selectedRecipientsList.isEmpty()) {
                        final Iterator<Object> iterator = selectedRecipientsList.iterator();
                        while (iterator.hasNext()) {
                            if (k0.g(iterator.next().getPersonId(), recipient.getPersonId())) {
                                b = true;
                                break Label_0257;
                            }
                        }
                    }
                    b = false;
                }
                if (!b) {
                    ((ImageView)itemView.findViewById(c.i.Ez)).setImageResource(2131231032);
                    recipient.setSelected(false);
                    return;
                }
            }
            ((ImageView)itemView.findViewById(c.i.Ez)).setImageResource(2131231031);
            recipient.setSelected(true);
        }
    }
}
