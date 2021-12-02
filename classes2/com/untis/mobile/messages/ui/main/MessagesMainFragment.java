// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.main;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.HorizontalScrollView;
import androidx.appcompat.app.i;
import android.app.Dialog;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import org.koin.core.c$a;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.TextView;
import androidx.appcompat.app.d$a;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.messages.ui.send.SelectedRecipientsCommonKt;
import android.view.View$OnClickListener;
import androidx.viewpager.widget.ViewPager;
import com.untis.mobile.messages.util.SwipeLockableViewPager;
import com.google.android.material.tabs.TabLayout;
import com.untis.mobile.messages.util.SendMessageTypes;
import com.untis.mobile.utils.extension.h;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.fragment.app.Fragment;
import java.util.Collection;
import com.untis.mobile.messages.data.model.response.MessagePermissionsResponse;
import java.util.ArrayList;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.l0;
import android.view.View;
import com.untis.mobile.messages.ui.sent.SentMessagesFragment;
import com.untis.mobile.messages.ui.main.viewModel.MessagesMainViewModel;
import com.untis.mobile.messages.ui.inbox.InboxFragment;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.y;
import n6.a;
import kotlin.d0;
import androidx.appcompat.app.d;
import com.untis.mobile.messages.util.MessagesViewPagerAdapter;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import org.koin.core.c;
import com.untis.mobile.messages.ui.MessageFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0005H\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u001c¨\u00068" }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragment;", "Lcom/untis/mobile/messages/ui/MessageFragment;", "Lorg/koin/core/c;", "Landroid/view/View;", "view", "Lkotlin/j2;", "initViews", "initTabLayout", "handleMessagesPermissions", "showSendMessageBottomDialog", "navigateToSelectStudentsToSendMessage", "navigateToSelectParentsToSendMessage", "dismissSendMessageDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onCreate", "", "bottomNavigationBarVisibility", "onDestroy", "Landroidx/appcompat/app/d;", "sendMessageDialog", "Landroidx/appcompat/app/d;", "canSendMessageToParents", "Z", "allowRequestReadConfirmation", "Lcom/untis/mobile/messages/ui/sent/SentMessagesFragment;", "sentMessagesFragment$delegate", "Lkotlin/b0;", "getSentMessagesFragment", "()Lcom/untis/mobile/messages/ui/sent/SentMessagesFragment;", "sentMessagesFragment", "Lcom/untis/mobile/messages/ui/inbox/InboxFragment;", "inboxFragment$delegate", "getInboxFragment", "()Lcom/untis/mobile/messages/ui/inbox/InboxFragment;", "inboxFragment", "Lcom/untis/mobile/messages/ui/main/viewModel/MessagesMainViewModel;", "messagesMainViewModel$delegate", "getMessagesMainViewModel", "()Lcom/untis/mobile/messages/ui/main/viewModel/MessagesMainViewModel;", "messagesMainViewModel", "canSendMessageToStaff", "", "recipientSearchMaxResult", "I", "Lcom/untis/mobile/messages/util/MessagesViewPagerAdapter;", "messagesPagerAdapter", "Lcom/untis/mobile/messages/util/MessagesViewPagerAdapter;", "canSendMessageToStudents", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class MessagesMainFragment extends MessageFragment implements c
{
    private boolean allowRequestReadConfirmation;
    private boolean canSendMessageToParents;
    private boolean canSendMessageToStaff;
    private boolean canSendMessageToStudents;
    @e
    private final b0 inboxFragment$delegate;
    @e
    private final b0 messagesMainViewModel$delegate;
    private MessagesViewPagerAdapter messagesPagerAdapter;
    private int recipientSearchMaxResult;
    private d sendMessageDialog;
    @e
    private final b0 sentMessagesFragment$delegate;
    
    public MessagesMainFragment() {
        this.inboxFragment$delegate = d0.c((a<?>)MessagesMainFragment$inboxFragment.MessagesMainFragment$inboxFragment$2.INSTANCE);
        this.sentMessagesFragment$delegate = d0.c((a<?>)MessagesMainFragment$sentMessagesFragment.MessagesMainFragment$sentMessagesFragment$2.INSTANCE);
        this.messagesMainViewModel$delegate = d0.c((a<?>)new MessagesMainFragment$special$$inlined$viewModel$default.MessagesMainFragment$special$$inlined$viewModel$default$1((y)this, (l7.a)null, (a)null));
    }
    
    private final void dismissSendMessageDialog() {
        final d sendMessageDialog = this.sendMessageDialog;
        if (sendMessageDialog != null) {
            if (sendMessageDialog == null) {
                k0.S("sendMessageDialog");
                throw null;
            }
            if (((Dialog)sendMessageDialog).isShowing()) {
                final d sendMessageDialog2 = this.sendMessageDialog;
                if (sendMessageDialog2 == null) {
                    k0.S("sendMessageDialog");
                    throw null;
                }
                ((i)sendMessageDialog2).dismiss();
            }
        }
    }
    
    private final InboxFragment getInboxFragment() {
        return this.inboxFragment$delegate.getValue();
    }
    
    private final MessagesMainViewModel getMessagesMainViewModel() {
        return this.messagesMainViewModel$delegate.getValue();
    }
    
    private final SentMessagesFragment getSentMessagesFragment() {
        return this.sentMessagesFragment$delegate.getValue();
    }
    
    private final void handleMessagesPermissions(final View view) {
        this.getMessagesMainViewModel().getMessagesPermissionsLiveData().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.messages.ui.main.e(view, this));
    }
    
    private static final void handleMessagesPermissions$lambda-2(final View view, final MessagesMainFragment messagesMainFragment, final Result result) {
        k0.p(view, "$view");
        k0.p(messagesMainFragment, "this$0");
        final ArrayList list = new ArrayList();
        final MessagePermissionsResponse messagePermissionsResponse = result.getData();
        if (messagePermissionsResponse != null) {
            list.addAll(messagePermissionsResponse.getPermissions());
            if (messagePermissionsResponse.getShowSentTab()) {
                final MessagesViewPagerAdapter messagesPagerAdapter = messagesMainFragment.messagesPagerAdapter;
                if (messagesPagerAdapter == null) {
                    k0.S("messagesPagerAdapter");
                    throw null;
                }
                messagesPagerAdapter.removeFragment(1);
                final MessagesViewPagerAdapter messagesPagerAdapter2 = messagesMainFragment.messagesPagerAdapter;
                if (messagesPagerAdapter2 == null) {
                    k0.S("messagesPagerAdapter");
                    throw null;
                }
                final SentMessagesFragment sentMessagesFragment = messagesMainFragment.getSentMessagesFragment();
                final String string = messagesMainFragment.getString(2131886423);
                k0.o(string, "getString(R.string.message_sent)");
                messagesPagerAdapter2.addFragment(sentMessagesFragment, string);
            }
            messagesMainFragment.allowRequestReadConfirmation = messagePermissionsResponse.getAllowRequestReadConfirmation();
            messagesMainFragment.recipientSearchMaxResult = messagePermissionsResponse.getRecipientSearchMaxResult();
            ((FloatingActionButton)view.findViewById(com.untis.mobile.c.i.QG)).setVisibility(h.U(list.isEmpty() ^ true, 0, 1, null));
            messagesMainFragment.canSendMessageToParents = list.contains(SendMessageTypes.PARENTS);
            messagesMainFragment.canSendMessageToStudents = list.contains(SendMessageTypes.STUDENTS);
            messagesMainFragment.canSendMessageToStaff = list.contains(SendMessageTypes.STAFF);
        }
        final TabLayout tabLayout = (TabLayout)view.findViewById(com.untis.mobile.c.i.VG);
        final MessagesViewPagerAdapter messagesPagerAdapter3 = messagesMainFragment.messagesPagerAdapter;
        if (messagesPagerAdapter3 != null) {
            ((HorizontalScrollView)tabLayout).setVisibility(h.U(messagesPagerAdapter3.getCount() > 1, 0, 1, null));
            messagesMainFragment.initTabLayout(view);
            return;
        }
        k0.S("messagesPagerAdapter");
        throw null;
    }
    
    private final void initTabLayout(final View view) {
        final int xg = com.untis.mobile.c.i.XG;
        final SwipeLockableViewPager swipeLockableViewPager = (SwipeLockableViewPager)view.findViewById(xg);
        final MessagesViewPagerAdapter messagesPagerAdapter = this.messagesPagerAdapter;
        if (messagesPagerAdapter != null) {
            swipeLockableViewPager.setAdapter((androidx.viewpager.widget.a)messagesPagerAdapter);
            final int vg = com.untis.mobile.c.i.VG;
            ((TabLayout)view.findViewById(vg)).G();
            ((SwipeLockableViewPager)view.findViewById(xg)).setSwipePagingEnabled(false);
            ((TabLayout)view.findViewById(vg)).setupWithViewPager((ViewPager)view.findViewById(xg));
            return;
        }
        k0.S("messagesPagerAdapter");
        throw null;
    }
    
    private final void initViews(final View view) {
        ((ImageButton)view.findViewById(com.untis.mobile.c.i.QG)).setOnClickListener((View$OnClickListener)new b(this));
        SelectedRecipientsCommonKt.clearSelectedRecipientsList();
    }
    
    private static final void initViews$lambda-0(final MessagesMainFragment messagesMainFragment, final View view) {
        k0.p(messagesMainFragment, "this$0");
        messagesMainFragment.showSendMessageBottomDialog();
    }
    
    private final void navigateToSelectParentsToSendMessage() {
        this.dismissSendMessageDialog();
        androidx.navigation.fragment.c.a((Fragment)this).D(MessagesMainFragmentDirections.Companion.actionMessagesMainFragmentToMessageRecipientsSelectFragment(SendMessageTypes.PARENTS, this.allowRequestReadConfirmation, this.recipientSearchMaxResult));
    }
    
    private final void navigateToSelectStudentsToSendMessage() {
        this.dismissSendMessageDialog();
        androidx.navigation.fragment.c.a((Fragment)this).D(MessagesMainFragmentDirections.Companion.actionMessagesMainFragmentToMessageRecipientsSelectFragment(SendMessageTypes.STUDENTS, this.allowRequestReadConfirmation, this.recipientSearchMaxResult));
    }
    
    private final void showSendMessageBottomDialog() {
        final View inflate = LayoutInflater.from(this.requireContext()).inflate(2131493306, (ViewGroup)null);
        final d$a d$a = new d$a(this.requireContext());
        d$a.M(inflate);
        final d a = d$a.a();
        k0.o(a, "builder.create()");
        this.sendMessageDialog = a;
        if (a == null) {
            k0.S("sendMessageDialog");
            throw null;
        }
        a.r(inflate);
        final d sendMessageDialog = this.sendMessageDialog;
        if (sendMessageDialog == null) {
            k0.S("sendMessageDialog");
            throw null;
        }
        final Window window = ((Dialog)sendMessageDialog).getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        final d sendMessageDialog2 = this.sendMessageDialog;
        if (sendMessageDialog2 == null) {
            k0.S("sendMessageDialog");
            throw null;
        }
        final Window window2 = ((Dialog)sendMessageDialog2).getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        final int ug = com.untis.mobile.c.i.UG;
        ((TextView)inflate.findViewById(ug)).setVisibility(h.U(this.canSendMessageToStudents, 0, 1, null));
        final int tg = com.untis.mobile.c.i.TG;
        ((TextView)inflate.findViewById(tg)).setVisibility(h.U(this.canSendMessageToParents, 0, 1, null));
        ((TextView)inflate.findViewById(ug)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.main.c(this));
        ((TextView)inflate.findViewById(tg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.main.d(this));
        ((Button)inflate.findViewById(com.untis.mobile.c.i.tG)).setOnClickListener((View$OnClickListener)new com.untis.mobile.messages.ui.main.a(this));
        final d sendMessageDialog3 = this.sendMessageDialog;
        if (sendMessageDialog3 != null) {
            ((Dialog)sendMessageDialog3).show();
            return;
        }
        k0.S("sendMessageDialog");
        throw null;
    }
    
    private static final void showSendMessageBottomDialog$lambda-3(final MessagesMainFragment messagesMainFragment, final View view) {
        k0.p(messagesMainFragment, "this$0");
        messagesMainFragment.navigateToSelectStudentsToSendMessage();
    }
    
    private static final void showSendMessageBottomDialog$lambda-4(final MessagesMainFragment messagesMainFragment, final View view) {
        k0.p(messagesMainFragment, "this$0");
        messagesMainFragment.navigateToSelectParentsToSendMessage();
    }
    
    private static final void showSendMessageBottomDialog$lambda-5(final MessagesMainFragment messagesMainFragment, final View view) {
        k0.p(messagesMainFragment, "this$0");
        final d sendMessageDialog = messagesMainFragment.sendMessageDialog;
        if (sendMessageDialog != null) {
            ((i)sendMessageDialog).dismiss();
            return;
        }
        k0.S("sendMessageDialog");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected boolean bottomNavigationBarVisibility() {
        return true;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        boolean b = false;
        if (bundle != null) {
            if (bundle.containsKey("profile_id")) {
                b = true;
            }
        }
        if (b) {
            final j0 g = j0.G;
            String d;
            if ((d = com.untis.mobile.utils.extension.b.d(bundle, "profile_id")) == null) {
                d = "";
            }
            final Profile l = g.l(d);
            if (l != null) {
                g.h(l);
            }
        }
        final FragmentManager childFragmentManager = this.getChildFragmentManager();
        k0.o(childFragmentManager, "childFragmentManager");
        final MessagesViewPagerAdapter messagesPagerAdapter = new MessagesViewPagerAdapter(childFragmentManager);
        this.messagesPagerAdapter = messagesPagerAdapter;
        final InboxFragment inboxFragment = this.getInboxFragment();
        final String string = this.getString(2131886388);
        k0.o(string, "getString(R.string.message_inbox)");
        messagesPagerAdapter.addFragment(inboxFragment, string);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493297, viewGroup, false);
        k0.o(inflate, "view");
        this.initViews(inflate);
        this.handleMessagesPermissions(inflate);
        return inflate;
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.dismissSendMessageDialog();
    }
}
