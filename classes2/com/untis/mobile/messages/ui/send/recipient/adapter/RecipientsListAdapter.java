// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.recipient.adapter;

import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import android.widget.TextView;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import java.util.Set;
import kotlin.collections.v;
import com.untis.mobile.messages.ui.send.RecipientsTypes;
import kotlin.jvm.internal.q1;
import java.util.Objects;
import com.untis.mobile.messages.data.model.Recipient;
import com.untis.mobile.messages.ui.send.SelectedRecipientsCommonKt;
import java.util.Collection;
import java.util.List;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.k0;
import androidx.recyclerview.widget.RecyclerView$g0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Group;
import java.util.ArrayList;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0018j\b\u0012\u0004\u0012\u00020\u000e`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/adapter/RecipientsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/messages/ui/send/recipient/adapter/RecipientsListAdapter$RecipientViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/j2;", "onBindViewHolder", "getItemCount", "", "Lcom/untis/mobile/messages/data/model/Group;", "newList", "submitList", "", "hideSubjectIfEmpty", "Z", "getHideSubjectIfEmpty", "()Z", "setHideSubjectIfEmpty", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "groups", "Ljava/util/ArrayList;", "<init>", "()V", "RecipientViewHolder", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RecipientsListAdapter extends RecyclerView$h<RecipientViewHolder>
{
    @e
    private final ArrayList<Group> groups;
    private boolean hideSubjectIfEmpty;
    
    public RecipientsListAdapter() {
        this.groups = new ArrayList<Group>();
    }
    
    public final boolean getHideSubjectIfEmpty() {
        return this.hideSubjectIfEmpty;
    }
    
    public int getItemCount() {
        return this.groups.size();
    }
    
    public void onBindViewHolder(@e final RecipientViewHolder recipientViewHolder, final int index) {
        k0.p(recipientViewHolder, "holder");
        final Group value = this.groups.get(index);
        k0.o(value, "groups[position]");
        recipientViewHolder.bind(value);
    }
    
    @e
    public RecipientViewHolder onCreateViewHolder(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493218, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_message_recipient, parent, false)");
        return new RecipientViewHolder(inflate);
    }
    
    public final void setHideSubjectIfEmpty(final boolean hideSubjectIfEmpty) {
        this.hideSubjectIfEmpty = hideSubjectIfEmpty;
    }
    
    public final void submitList(@e final List<Group> c) {
        k0.p(c, "newList");
        this.groups.clear();
        this.groups.addAll(c);
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/adapter/RecipientsListAdapter$RecipientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/messages/data/model/Group;", "group", "Lkotlin/j2;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Lcom/untis/mobile/messages/ui/send/recipient/adapter/RecipientsListAdapter;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public final class RecipientViewHolder extends RecyclerView$g0
    {
        public RecipientViewHolder(final View view) {
            k0.p(RecipientsListAdapter.this, "this$0");
            k0.p(view, "itemView");
            super(view);
        }
        
        private static final void bind$lambda-3$lambda-1(final Group group, final RecipientsListAdapter recipientsListAdapter, final View view) {
            k0.p(group, "$group");
            k0.p(recipientsListAdapter, "this$0");
            final boolean selected = group.getSelected();
            Set<Object> m5 = null;
            final Recipient recipient = null;
            boolean selected2;
            if (selected) {
                final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                final Iterator<Object> iterator = SelectedRecipientsCommonKt.getSelectedRecipientsList().iterator();
                Recipient next;
                do {
                    next = recipient;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                } while (!k0.g(next.getGroupId(), group.getId()));
                Objects.requireNonNull(selectedRecipientsList, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                q1.a(selectedRecipientsList).remove(next);
                selected2 = false;
            }
            else {
                SelectedRecipientsCommonKt.adjustSelectedGroups(group);
                final ArrayList<Recipient> selectedRecipientsList2 = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                final String title = group.getTitle();
                final String details = group.getDetails();
                final String id = group.getId();
                final RecipientsTypes group2 = RecipientsTypes.GROUP;
                final ArrayList<Recipient> recipients = group.getRecipients();
                Set<Object> m6;
                if (recipients == null) {
                    m6 = null;
                }
                else {
                    m6 = v.M5((Iterable<?>)recipients);
                }
                final ArrayList<Recipient> recipients2 = group.getRecipients();
                if (recipients2 != null) {
                    m5 = v.M5((Iterable<?>)recipients2);
                }
                selectedRecipientsList2.add(new Recipient(title, null, null, null, null, null, null, false, group2, id, details, m6, m5, 254, null));
                selected2 = true;
            }
            group.setSelected(selected2);
            SelectedRecipientsCommonKt.adjustSelectedRecipients();
            recipientsListAdapter.notifyDataSetChanged();
        }
        
        public final void bind(@e final Group group) {
            k0.p(group, "group");
            final View itemView = super.itemView;
            final RecipientsListAdapter this$0 = RecipientsListAdapter.this;
            ((TextView)itemView.findViewById(c.i.bG)).setText((CharSequence)group.getTitle());
            final TextView textView = (TextView)itemView.findViewById(c.i.XF);
            final ArrayList<Integer> personIds = group.getPersonIds();
            String value;
            if (personIds == null || personIds.isEmpty()) {
                value = "0";
            }
            else {
                final ArrayList<Integer> personIds2 = group.getPersonIds();
                Object value2;
                if (personIds2 == null) {
                    value2 = null;
                }
                else {
                    value2 = personIds2.size();
                }
                value = String.valueOf(value2);
            }
            textView.setText((CharSequence)value);
            final int ag = c.i.aG;
            ((TextView)itemView.findViewById(ag)).setText((CharSequence)group.getDetails());
            final TextView textView2 = (TextView)itemView.findViewById(ag);
            boolean b = false;
            Label_0220: {
                if (this$0.getHideSubjectIfEmpty()) {
                    final String details = group.getDetails();
                    if (details == null || details.length() == 0) {
                        b = false;
                        break Label_0220;
                    }
                }
                b = true;
            }
            textView2.setVisibility(h.f(b));
            itemView.setOnClickListener((View$OnClickListener)new a(group, this$0));
            if (group.getSelected()) {
                final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                boolean b2 = false;
                Label_0324: {
                    if (!(selectedRecipientsList instanceof Collection) || !selectedRecipientsList.isEmpty()) {
                        final Iterator<Object> iterator = selectedRecipientsList.iterator();
                        while (iterator.hasNext()) {
                            if (k0.g(iterator.next().getGroupId(), group.getId())) {
                                b2 = true;
                                break Label_0324;
                            }
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    ((ImageView)itemView.findViewById(c.i.YF)).setImageResource(2131231031);
                    group.setSelected(true);
                    return;
                }
            }
            ((ImageView)itemView.findViewById(c.i.YF)).setImageResource(2131231032);
            group.setSelected(false);
        }
    }
}
