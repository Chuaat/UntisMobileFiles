// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send;

import java.util.HashSet;
import java.util.Set;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.a;
import n6.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.j2;
import kotlin.collections.v;
import com.untis.mobile.messages.data.model.Group;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import androidx.lifecycle.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0000\")\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014" }, d2 = { "Lkotlin/j2;", "clearSelectedRecipientsList", "updateSelectedRecipientNumber", "Lcom/untis/mobile/messages/data/model/Group;", "group", "adjustSelectedGroups", "adjustSelectedRecipients", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/data/model/Recipient;", "Lkotlin/collections/ArrayList;", "selectedRecipientsList", "Ljava/util/ArrayList;", "getSelectedRecipientsList", "()Ljava/util/ArrayList;", "Landroidx/lifecycle/k0;", "", "numberOfSelectedRecipientsLiveData", "Landroidx/lifecycle/k0;", "getNumberOfSelectedRecipientsLiveData", "()Landroidx/lifecycle/k0;", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class SelectedRecipientsCommonKt
{
    @e
    private static final k0<Integer> numberOfSelectedRecipientsLiveData;
    @e
    private static final ArrayList<Recipient> selectedRecipientsList;
    
    static {
        selectedRecipientsList = new ArrayList<Recipient>();
        numberOfSelectedRecipientsLiveData = new k0();
    }
    
    public static final void adjustSelectedGroups(@e final Group group) {
        kotlin.jvm.internal.k0.p(group, "group");
        final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.selectedRecipientsList;
        final ArrayList<Recipient> list = new ArrayList<Recipient>();
        for (final Recipient next : selectedRecipientsList) {
            if (next.getType() == RecipientsTypes.RECIPIENT) {
                list.add(next);
            }
        }
        final ArrayList<Recipient> recipients = group.getRecipients();
        if (recipients != null) {
            for (final Recipient recipient : recipients) {
                final ArrayList list2 = new ArrayList<j2>(v.Y((Iterable<?>)list, 10));
                for (final Recipient o : list) {
                    if (kotlin.jvm.internal.k0.g(recipient.getPersonId(), o.getPersonId())) {
                        getSelectedRecipientsList().remove(o);
                    }
                    list2.add(j2.a);
                }
            }
        }
    }
    
    public static final void adjustSelectedRecipients() {
        final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.selectedRecipientsList;
        final ArrayList<Recipient> list = new ArrayList<Recipient>();
        final Iterator<Object> iterator = selectedRecipientsList.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final Recipient next = iterator.next();
            if (next.getType() != RecipientsTypes.GROUP) {
                b = false;
            }
            if (!b) {
                continue;
            }
            list.add(next);
        }
        for (final Recipient o : list) {
            final Set<Recipient> groupSelectedRecipients = o.getGroupSelectedRecipients();
            Object value = null;
            Object value2;
            if (groupSelectedRecipients == null) {
                value2 = null;
            }
            else {
                value2 = groupSelectedRecipients.size();
            }
            final Set<Recipient> groupRecipients = o.getGroupRecipients();
            if (groupRecipients != null) {
                value = groupRecipients.size();
            }
            if (!kotlin.jvm.internal.k0.g(value2, value)) {
                getSelectedRecipientsList().remove(o);
                final Set<Recipient> groupSelectedRecipients2 = o.getGroupSelectedRecipients();
                if (groupSelectedRecipients2 == null) {
                    continue;
                }
                for (final Recipient e : groupSelectedRecipients2) {
                    final ArrayList<Recipient> selectedRecipientsList2 = getSelectedRecipientsList();
                    boolean b2 = false;
                    Label_0285: {
                        if (!(selectedRecipientsList2 instanceof Collection) || !selectedRecipientsList2.isEmpty()) {
                            final Iterator<Object> iterator4 = selectedRecipientsList2.iterator();
                            while (iterator4.hasNext()) {
                                if (kotlin.jvm.internal.k0.g(iterator4.next().getPersonId(), e.getId())) {
                                    b2 = true;
                                    break Label_0285;
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (!b2) {
                        e.setType(RecipientsTypes.RECIPIENT);
                        e.setSubtitle(e.getClassName());
                        e.setPersonId(e.getId());
                        getSelectedRecipientsList().add(e);
                    }
                }
            }
        }
        updateSelectedRecipientNumber();
        v.p0(SelectedRecipientsCommonKt.selectedRecipientsList, a.d(new l[] { (l)SelectedRecipientsCommonKt$adjustSelectedRecipients.SelectedRecipientsCommonKt$adjustSelectedRecipients$3.INSTANCE, (l)SelectedRecipientsCommonKt$adjustSelectedRecipients.SelectedRecipientsCommonKt$adjustSelectedRecipients$4.INSTANCE }));
    }
    
    public static final void clearSelectedRecipientsList() {
        SelectedRecipientsCommonKt.selectedRecipientsList.clear();
        updateSelectedRecipientNumber();
    }
    
    @e
    public static final k0<Integer> getNumberOfSelectedRecipientsLiveData() {
        return SelectedRecipientsCommonKt.numberOfSelectedRecipientsLiveData;
    }
    
    @e
    public static final ArrayList<Recipient> getSelectedRecipientsList() {
        return SelectedRecipientsCommonKt.selectedRecipientsList;
    }
    
    public static final void updateSelectedRecipientNumber() {
        final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.selectedRecipientsList;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Recipient recipient : selectedRecipientsList) {
            Object o;
            if (recipient.getType() == RecipientsTypes.GROUP) {
                final Set<Recipient> groupRecipients = recipient.getGroupRecipients();
                List<? extends T> i5;
                if (groupRecipients == null) {
                    i5 = null;
                }
                else {
                    i5 = v.I5((Iterable<? extends T>)groupRecipients);
                }
                o = i5;
                if (i5 == null) {
                    o = v.E();
                }
            }
            else {
                o = v.k(recipient);
            }
            v.q0((Collection<? super Object>)list, (Iterable<?>)o);
        }
        final k0<Integer> numberOfSelectedRecipientsLiveData = SelectedRecipientsCommonKt.numberOfSelectedRecipientsLiveData;
        final HashSet<Integer> set = new HashSet<Integer>();
        final ArrayList<Recipient> list2 = new ArrayList<Recipient>();
        for (final Recipient next : list) {
            if (set.add(next.getPersonId())) {
                list2.add(next);
            }
        }
        numberOfSelectedRecipientsLiveData.n((Object)list2.size());
    }
}
