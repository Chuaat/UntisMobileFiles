// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.recipient;

import androidx.lifecycle.LiveData;
import android.widget.ImageView;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Arrays;
import kotlin.jvm.internal.p1;
import com.untis.mobile.utils.extension.h;
import java.util.Iterator;
import kotlin.collections.y0;
import com.untis.mobile.messages.util.RecipientSectionTypes;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.Collection;
import com.untis.mobile.messages.data.model.Group;
import kotlin.collections.v;
import kotlin.j2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.untis.mobile.messages.base.Result;
import kotlin.n1;
import kotlin.s0;
import com.untis.mobile.messages.ui.send.SelectedRecipientsCommonKt;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnClickListener;
import androidx.core.content.d;
import android.widget.ImageButton;
import androidx.lifecycle.k0;
import com.untis.mobile.messages.util.SendMessageTypes;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import com.untis.mobile.messages.ui.send.recipient.viewmodel.RecipientsViewModel;
import kotlin.d0;
import n6.a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k1;
import kotlin.b0;
import com.untis.mobile.messages.ui.send.recipient.adapter.RecipientsListAdapter;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "handleScreenTitle", "initViews", "showMyClassesSection", "showMySubSection", "showClassTeacher", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentArgs;", "args", "Lcom/untis/mobile/messages/ui/send/recipient/adapter/RecipientsListAdapter;", "classTeacherListAdapter", "Lcom/untis/mobile/messages/ui/send/recipient/adapter/RecipientsListAdapter;", "myClassesRecipientsListAdapter", "mySubRecipientsListAdapter", "Lcom/untis/mobile/messages/ui/send/recipient/viewmodel/RecipientsViewModel;", "recipientsViewModel$delegate", "Lkotlin/b0;", "getRecipientsViewModel", "()Lcom/untis/mobile/messages/ui/send/recipient/viewmodel/RecipientsViewModel;", "recipientsViewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class MessageRecipientsSelectFragment extends MessageFragment
{
    @e
    private final m args$delegate;
    @e
    private final RecipientsListAdapter classTeacherListAdapter;
    @e
    private final RecipientsListAdapter myClassesRecipientsListAdapter;
    @e
    private final RecipientsListAdapter mySubRecipientsListAdapter;
    @e
    private final b0 recipientsViewModel$delegate;
    
    public MessageRecipientsSelectFragment() {
        this.args$delegate = new m(k1.d(MessageRecipientsSelectFragmentArgs.class), (a)new MessageRecipientsSelectFragment$special$$inlined$navArgs.MessageRecipientsSelectFragment$special$$inlined$navArgs$1((Fragment)this));
        this.recipientsViewModel$delegate = d0.c((a<?>)new MessageRecipientsSelectFragment$special$$inlined$sharedViewModel$default.MessageRecipientsSelectFragment$special$$inlined$sharedViewModel$default$2((Fragment)this, (l7.a)null, (a)new MessageRecipientsSelectFragment$special$$inlined$sharedViewModel$default.MessageRecipientsSelectFragment$special$$inlined$sharedViewModel$default$1((Fragment)this), (a)null));
        this.myClassesRecipientsListAdapter = new RecipientsListAdapter();
        this.mySubRecipientsListAdapter = new RecipientsListAdapter();
        this.classTeacherListAdapter = new RecipientsListAdapter();
    }
    
    private final MessageRecipientsSelectFragmentArgs getArgs() {
        return ((b0<MessageRecipientsSelectFragmentArgs>)this.args$delegate).getValue();
    }
    
    private final RecipientsViewModel getRecipientsViewModel() {
        return this.recipientsViewModel$delegate.getValue();
    }
    
    private final void handleScreenTitle(final View view) {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.getArgs().getSendMessageTo().ordinal()];
        k0<SendMessageTypes> k0;
        SendMessageTypes sendMessageTypes;
        if (n != 1) {
            if (n != 2) {
                return;
            }
            ((TextView)view.findViewById(c.i.nG)).setText((CharSequence)this.getString(2131886405));
            k0 = this.getRecipientsViewModel().getSendMessageType();
            sendMessageTypes = SendMessageTypes.PARENTS;
        }
        else {
            ((TextView)view.findViewById(c.i.nG)).setText((CharSequence)this.getString(2131886406));
            k0 = this.getRecipientsViewModel().getSendMessageType();
            sendMessageTypes = SendMessageTypes.STUDENTS;
        }
        k0.n((Object)sendMessageTypes);
    }
    
    private final void initViews(final View view) {
        final int eg = c.i.eG;
        ((ImageButton)view.findViewById(eg)).setColorFilter(d.f(this.requireContext(), 2131100003));
        ((ImageButton)view.findViewById(eg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.recipient.a(this));
        ((RecyclerView)view.findViewById(c.i.gG)).setAdapter((RecyclerView$h)this.myClassesRecipientsListAdapter);
        ((RecyclerView)view.findViewById(c.i.hG)).setAdapter((RecyclerView$h)this.mySubRecipientsListAdapter);
        ((RecyclerView)view.findViewById(c.i.fG)).setAdapter((RecyclerView$h)this.classTeacherListAdapter);
        this.getRecipientsViewModel().getRecipientsLiveData().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.messages.ui.send.recipient.e(this, view));
        ((ImageView)view.findViewById(c.i.Zq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.send.recipient.c(this));
        ((TextView)view.findViewById(c.i.pG)).setOnClickListener((View$OnClickListener)new b(this));
        ((LiveData)SelectedRecipientsCommonKt.getNumberOfSelectedRecipientsLiveData()).j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.messages.ui.send.recipient.d(view, this));
    }
    
    private static final void initViews$lambda-0(final MessageRecipientsSelectFragment messageRecipientsSelectFragment, final View view) {
        kotlin.jvm.internal.k0.p(messageRecipientsSelectFragment, "this$0");
        if (messageRecipientsSelectFragment.getArgs().getFromSendEditorFragment()) {
            messageRecipientsSelectFragment.onBackPressed();
        }
        else {
            androidx.navigation.fragment.c.a((Fragment)messageRecipientsSelectFragment).t(2131296366, androidx.core.os.b.a(new s0[] { n1.a("sendMessageTo", messageRecipientsSelectFragment.getArgs().getSendMessageTo()), n1.a("allowRequestReadConfirmation", messageRecipientsSelectFragment.getArgs().getAllowRequestReadConfirmation()), n1.a("recipientSearchMaxResult", messageRecipientsSelectFragment.getArgs().getRecipientSearchMaxResult()) }));
        }
    }
    
    private static final void initViews$lambda-5(final MessageRecipientsSelectFragment messageRecipientsSelectFragment, final View view, final Result result) {
        kotlin.jvm.internal.k0.p(messageRecipientsSelectFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        final Map<K, List> map = result.getData();
        if (map != null) {
            final ArrayList list = new ArrayList<ArrayList<j2>>(map.size());
            final Iterator<Map.Entry<K, List>> iterator = map.entrySet().iterator();
            int n;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                n = 0;
                if (!hasNext) {
                    break;
                }
                final List<? extends T> list2 = iterator.next().getValue();
                ArrayList<j2> list3;
                if (list2 == null) {
                    list3 = null;
                }
                else {
                    list3 = new ArrayList<j2>(v.Y((Iterable<?>)list2, 10));
                    for (final Group group : list2) {
                        final ArrayList<Recipient> selectedRecipientsList = SelectedRecipientsCommonKt.getSelectedRecipientsList();
                        boolean selected = false;
                        Label_0225: {
                            if (!(selectedRecipientsList instanceof Collection) || !selectedRecipientsList.isEmpty()) {
                                final Iterator<Object> iterator3 = selectedRecipientsList.iterator();
                                while (iterator3.hasNext()) {
                                    if (kotlin.jvm.internal.k0.g(iterator3.next().getGroupId(), group.getId())) {
                                        selected = true;
                                        break Label_0225;
                                    }
                                }
                            }
                            selected = false;
                        }
                        group.setSelected(selected);
                        list3.add(j2.a);
                    }
                }
                list.add(list3);
            }
            final RecipientSectionTypes normal_LESSONS = RecipientSectionTypes.NORMAL_LESSONS;
            final List list4 = map.get(normal_LESSONS);
            if (list4 != null && !list4.isEmpty()) {
                messageRecipientsSelectFragment.showMyClassesSection(view);
                final RecipientsListAdapter myClassesRecipientsListAdapter = messageRecipientsSelectFragment.myClassesRecipientsListAdapter;
                final Object k = y0.K((Map<RecipientSectionTypes, ?>)map, normal_LESSONS);
                kotlin.jvm.internal.k0.m(k);
                myClassesRecipientsListAdapter.submitList((List<Group>)k);
            }
            final RecipientSectionTypes substitutions = RecipientSectionTypes.SUBSTITUTIONS;
            final List list5 = map.get(substitutions);
            if (list5 != null && !list5.isEmpty()) {
                messageRecipientsSelectFragment.showMySubSection(view);
                final RecipientsListAdapter mySubRecipientsListAdapter = messageRecipientsSelectFragment.mySubRecipientsListAdapter;
                final Object i = y0.K((Map<RecipientSectionTypes, ?>)map, substitutions);
                kotlin.jvm.internal.k0.m(i);
                mySubRecipientsListAdapter.submitList((List<Group>)i);
            }
            final RecipientSectionTypes classteacher = RecipientSectionTypes.CLASSTEACHER;
            final List list6 = map.get(classteacher);
            int n2 = 0;
            Label_0452: {
                if (list6 != null) {
                    n2 = n;
                    if (!list6.isEmpty()) {
                        break Label_0452;
                    }
                }
                n2 = 1;
            }
            if (n2 == 0) {
                messageRecipientsSelectFragment.showClassTeacher(view);
                messageRecipientsSelectFragment.classTeacherListAdapter.setHideSubjectIfEmpty(true);
                final RecipientsListAdapter classTeacherListAdapter = messageRecipientsSelectFragment.classTeacherListAdapter;
                final Object j = y0.K((Map<RecipientSectionTypes, ?>)map, classteacher);
                kotlin.jvm.internal.k0.m(j);
                classTeacherListAdapter.submitList((List<Group>)j);
            }
        }
    }
    
    private static final void initViews$lambda-6(final MessageRecipientsSelectFragment messageRecipientsSelectFragment, final View view) {
        kotlin.jvm.internal.k0.p(messageRecipientsSelectFragment, "this$0");
        messageRecipientsSelectFragment.onBackPressed();
    }
    
    private static final void initViews$lambda-7(final MessageRecipientsSelectFragment messageRecipientsSelectFragment, final View view) {
        kotlin.jvm.internal.k0.p(messageRecipientsSelectFragment, "this$0");
        androidx.navigation.fragment.c.a((Fragment)messageRecipientsSelectFragment).t(2131296365, androidx.core.os.b.a(new s0[] { n1.a("recipientsType", messageRecipientsSelectFragment.getArgs().getSendMessageTo()), n1.a("allowRequestReadConfirmation", messageRecipientsSelectFragment.getArgs().getAllowRequestReadConfirmation()), n1.a("fromSendEditorFragment", messageRecipientsSelectFragment.getArgs().getFromSendEditorFragment()), n1.a("recipientSearchMaxResult", messageRecipientsSelectFragment.getArgs().getRecipientSearchMaxResult()) }));
    }
    
    private static final void initViews$lambda-8(final View view, final MessageRecipientsSelectFragment messageRecipientsSelectFragment, final Integer n) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(messageRecipientsSelectFragment, "this$0");
        final int mg = c.i.mG;
        final TextView textView = (TextView)view.findViewById(mg);
        kotlin.jvm.internal.k0.o(n, "it");
        textView.setVisibility(h.U(n > 0, 0, 1, null));
        final int intValue = n;
        final TextView textView2 = (TextView)view.findViewById(mg);
        String text;
        if (intValue == 1) {
            final p1 a = p1.a;
            final String string = messageRecipientsSelectFragment.getString(2131886424);
            kotlin.jvm.internal.k0.o(string, "getString(R.string.message_single_selected_recipient)");
            text = String.format(string, Arrays.copyOf(new Object[] { 1 }, 1));
        }
        else {
            final p1 a2 = p1.a;
            final String string2 = messageRecipientsSelectFragment.getString(2131886390);
            kotlin.jvm.internal.k0.o(string2, "getString(R.string.message_number_of_selected_recipient)");
            text = String.format(string2, Arrays.copyOf(new Object[] { n }, 1));
        }
        kotlin.jvm.internal.k0.o(text, "java.lang.String.format(format, *args)");
        textView2.setText((CharSequence)text);
    }
    
    private final void showClassTeacher(final View view) {
        ((TextView)view.findViewById(c.i.WF)).setVisibility(0);
        ((ViewGroup)view.findViewById(c.i.fG)).setVisibility(0);
    }
    
    private final void showMyClassesSection(final View view) {
        ((TextView)view.findViewById(c.i.cG)).setVisibility(0);
        ((ViewGroup)view.findViewById(c.i.gG)).setVisibility(0);
    }
    
    private final void showMySubSection(final View view) {
        ((TextView)view.findViewById(c.i.dG)).setVisibility(0);
        ((ViewGroup)view.findViewById(c.i.hG)).setVisibility(0);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493293, viewGroup, false);
        kotlin.jvm.internal.k0.o(inflate, "view");
        this.handleScreenTitle(inflate);
        this.initViews(inflate);
        return inflate;
    }
}
