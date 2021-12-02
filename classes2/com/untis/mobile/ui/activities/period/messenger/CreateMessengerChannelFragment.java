// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period.messenger;

import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import android.app.Dialog;
import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.lifecycle.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b1;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.utils.u0;
import com.untis.mobile.ui.dialogs.ValidationErrorDialog;
import com.untis.mobile.persistence.models.messenger.MessengerChannelData;
import android.text.Editable;
import android.widget.EditText;
import kotlin.text.s;
import com.untis.mobile.c;
import com.google.android.material.textfield.TextInputEditText;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import androidx.fragment.app.d;
import android.content.Context;
import android.widget.Toast;
import com.untis.mobile.persistence.models.messenger.MessengerChannel;
import kotlin.jvm.internal.k0;
import rx.functions.b;
import android.content.DialogInterface;
import android.view.View;
import kotlin.jvm.internal.w;
import k5.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$" }, d2 = { "Lcom/untis/mobile/ui/activities/period/messenger/CreateMessengerChannelFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelData;", "data", "Lkotlin/j2;", "S", "M", "", "channelName", "G", "channelId", "J", "D", "", "throwable", "R", "U", "V", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "onCreateView", "", "H", "I", "highlightColor", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CreateMessengerChannelFragment extends UmFragment
{
    @e
    public static final a I;
    @e
    public static final String J = "create-messenger-channel-fragment";
    @e
    private static final String K = "a";
    @e
    private static final String L = "b";
    @e
    private static final String M = "c";
    private k5.a G;
    private int H;
    
    static {
        I = new a(null);
    }
    
    public CreateMessengerChannelFragment() {
        this.H = -12303292;
    }
    
    private final void D(final View view, final String s) {
        if (view == null) {
            return;
        }
        this.U(view);
        final k5.a g = this.G;
        if (g != null) {
            g.a(s).C5((b)new k(this, s, view), (b)new h(this, view));
            return;
        }
        k0.S("viewModel");
        throw null;
    }
    
    private static final void E(final CreateMessengerChannelFragment createMessengerChannelFragment, final View view, final Throwable t) {
        k0.p(createMessengerChannelFragment, "this$0");
        k0.o(t, "it");
        createMessengerChannelFragment.R(view, t);
    }
    
    private static final void F(final CreateMessengerChannelFragment createMessengerChannelFragment, final String str, final View view, final MessengerChannel messengerChannel) {
        k0.p(createMessengerChannelFragment, "this$0");
        k0.p(str, "$channelId");
        final Context context = createMessengerChannelFragment.getContext();
        if (context == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("success connect lesson with '");
        sb.append(str);
        sb.append('\'');
        Toast.makeText(context, (CharSequence)sb.toString(), 1).show();
        final d activity = createMessengerChannelFragment.getActivity();
        if (activity != null) {
            ((Activity)activity).setResult(-1, CreateMessengerChannelFragment.I.b(messengerChannel.getId()));
        }
        final d activity2 = createMessengerChannelFragment.getActivity();
        if (activity2 != null) {
            ((Activity)activity2).finish();
        }
        createMessengerChannelFragment.V(view);
    }
    
    private final void G(final View view, final String s) {
        if (view == null) {
            return;
        }
        this.U(view);
        final k5.a g = this.G;
        if (g != null) {
            g.b(s).C5((b)new com.untis.mobile.ui.activities.period.messenger.b(this, s, view), (b)new j(this, view));
            return;
        }
        k0.S("viewModel");
        throw null;
    }
    
    private static final void H(final CreateMessengerChannelFragment createMessengerChannelFragment, final String str, final View view, final MessengerChannel messengerChannel) {
        k0.p(createMessengerChannelFragment, "this$0");
        k0.p(str, "$channelName");
        final Context context = createMessengerChannelFragment.getContext();
        if (context == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("success create '");
        sb.append(str);
        sb.append('\'');
        Toast.makeText(context, (CharSequence)sb.toString(), 1).show();
        final d activity = createMessengerChannelFragment.getActivity();
        if (activity != null) {
            ((Activity)activity).setResult(-1, CreateMessengerChannelFragment.I.b(messengerChannel.getId()));
        }
        final d activity2 = createMessengerChannelFragment.getActivity();
        if (activity2 != null) {
            ((Activity)activity2).finish();
        }
        createMessengerChannelFragment.V(view);
    }
    
    private static final void I(final CreateMessengerChannelFragment createMessengerChannelFragment, final View view, final Throwable t) {
        k0.p(createMessengerChannelFragment, "this$0");
        k0.o(t, "it");
        createMessengerChannelFragment.R(view, t);
    }
    
    private final void J(final String s, final String s2) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final String string = this.getString(2131886437);
        k0.o(string, "getString(R.string.messenger_linkGroupX_text)");
        ((Dialog)new d$a((Context)o, 2131951624).J(2131886438).n((CharSequence)com.untis.mobile.utils.extension.h.Q(string, this.H, s)).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.period.messenger.d.G).B(2131886439, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.period.messenger.a(this, s2)).a()).show();
    }
    
    private static final void K(final DialogInterface dialogInterface, final int n) {
    }
    
    private static final void L(final CreateMessengerChannelFragment createMessengerChannelFragment, final String s, final DialogInterface dialogInterface, final int n) {
        k0.p(createMessengerChannelFragment, "this$0");
        k0.p(s, "$channelId");
        createMessengerChannelFragment.D(createMessengerChannelFragment.getView(), s);
    }
    
    private final void M() {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final View view = this.getView();
        final EditText editText = null;
        String string = null;
        Label_0074: {
            if (view != null) {
                final TextInputEditText textInputEditText = (TextInputEditText)view.findViewById(c.i.Zn);
                if (textInputEditText != null) {
                    final Editable text = ((AppCompatEditText)textInputEditText).getText();
                    if (text != null) {
                        string = text.toString();
                        break Label_0074;
                    }
                }
            }
            string = null;
        }
        if (string == null || s.U1((CharSequence)string)) {
            final View view2 = this.getView();
            Object o2;
            if (view2 == null) {
                o2 = editText;
            }
            else {
                o2 = view2.findViewById(c.i.Zn);
            }
            if (o2 != null) {
                ((EditText)o2).setError((CharSequence)this.getString(2131886702));
            }
            return;
        }
        final String string2 = this.getString(2131886434);
        k0.o(string2, "getString(R.string.messenger_createGroupX_text)");
        ((Dialog)new d$a((Context)o, 2131951624).J(2131886435).n((CharSequence)com.untis.mobile.utils.extension.h.Q(string2, this.H, string)).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.period.messenger.e.G).B(2131886682, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.period.messenger.c(this, string)).a()).show();
    }
    
    private static final void N(final DialogInterface dialogInterface, final int n) {
    }
    
    private static final void O(final CreateMessengerChannelFragment createMessengerChannelFragment, final String s, final DialogInterface dialogInterface, final int n) {
        k0.p(createMessengerChannelFragment, "this$0");
        createMessengerChannelFragment.G(createMessengerChannelFragment.getView(), s);
    }
    
    private static final void P(final CreateMessengerChannelFragment createMessengerChannelFragment, final View view, final MessengerChannelData messengerChannelData) {
        k0.p(createMessengerChannelFragment, "this$0");
        k0.p(view, "$view");
        k0.o(messengerChannelData, "it");
        createMessengerChannelFragment.S(view, messengerChannelData);
    }
    
    private static final void Q(final CreateMessengerChannelFragment createMessengerChannelFragment, final View view, final Throwable t) {
        k0.p(createMessengerChannelFragment, "this$0");
        k0.p(view, "$view");
        k0.o(t, "it");
        createMessengerChannelFragment.R(view, t);
    }
    
    private final void R(final View view, final Throwable t) {
        this.V(view);
        final FragmentManager fragmentManager = this.getFragmentManager();
        if (t instanceof f5.a && fragmentManager != null) {
            ValidationErrorDialog.P(((f5.a)t).a()).L(fragmentManager, "create-messenger-channel-error");
            return;
        }
        u0.d(view, t);
    }
    
    private final void S(final View view, final MessengerChannelData messengerChannelData) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        this.V(view);
        ((EditText)view.findViewById(c.i.Zn)).setText((CharSequence)messengerChannelData.getProposedMessengerChannelName());
        if (messengerChannelData.getProposedconnectableMessengerChannels().isEmpty() ^ true) {
            ((FrameLayout)view.findViewById(c.i.Wn)).setVisibility(0);
        }
        final int yn = c.i.Yn;
        ((RecyclerView)view.findViewById(yn)).setAdapter((RecyclerView$h)new n((Context)o, messengerChannelData.getProposedconnectableMessengerChannels(), new p<String, String, j2>() {
            public final void a(@e final String s, @e final String s2) {
                k0.p(s, "channelName");
                k0.p(s2, "channelId");
                CreateMessengerChannelFragment.this.J(s, s2);
            }
        }));
        ((RecyclerView)view.findViewById(yn)).setLayoutManager((RecyclerView$p)new LinearLayoutManager((Context)o));
        ((RecyclerView)view.findViewById(yn)).n((RecyclerView$o)new l((Context)o, 1));
        ((Button)view.findViewById(c.i.Vn)).setOnClickListener((View$OnClickListener)new f(this));
    }
    
    private static final void T(final CreateMessengerChannelFragment createMessengerChannelFragment, final View view) {
        k0.p(createMessengerChannelFragment, "this$0");
        createMessengerChannelFragment.M();
    }
    
    private final void U(final View view) {
        final RelativeLayout relativeLayout = (RelativeLayout)view.findViewById(c.i.nE);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }
    
    private final void V(final View view) {
        final RelativeLayout relativeLayout = (RelativeLayout)view.findViewById(c.i.nE);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        final w0 a = b1.a((Fragment)this).a((Class)k5.a.class);
        k0.o(a, "ViewModelProviders.of(this)[CreateMessengerChannelFragmentViewModel::class.java]");
        this.G = (k5.a)a;
        Bundle arguments;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        else {
            arguments = bundle;
        }
        final String s = "";
        String string;
        if (arguments == null) {
            string = s;
        }
        else {
            string = arguments.getString("a");
            if (string == null) {
                string = s;
            }
        }
        Bundle arguments2;
        if ((arguments2 = bundle) == null) {
            arguments2 = this.getArguments();
        }
        Long value;
        if (arguments2 == null) {
            value = null;
        }
        else {
            value = arguments2.getLong("b");
        }
        if (value == null) {
            throw new IllegalArgumentException("lesson id must not be null");
        }
        final long longValue = value;
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final k5.a g = this.G;
        if (g != null) {
            g.c(string, longValue);
            this.H = androidx.core.content.d.f((Context)o, 2131099692);
            return;
        }
        k0.S("viewModel");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493082, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.U(inflate);
        final k5.a g = this.G;
        if (g != null) {
            g.d().C5((b)new g(this, inflate), (b)new i(this, inflate));
            return inflate;
        }
        k0.S("viewModel");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\tR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014" }, d2 = { "com/untis/mobile/ui/activities/period/messenger/CreateMessengerChannelFragment$a", "", "", "profileId", "", "lessonId", "Lcom/untis/mobile/ui/activities/period/messenger/CreateMessengerChannelFragment;", "c", "channelId", "Landroid/content/Intent;", "b", "data", "a", "BUNDLE_CHANNEL_ID", "Ljava/lang/String;", "BUNDLE_LESSON_ID", "BUNDLE_PROFILE_ID", "TAG", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final String a(@org.jetbrains.annotations.f final Intent intent) {
            String stringExtra;
            if (intent == null) {
                stringExtra = null;
            }
            else {
                stringExtra = intent.getStringExtra("c");
            }
            return stringExtra;
        }
        
        @e
        public final Intent b(@e final String s) {
            k0.p(s, "channelId");
            final Intent intent = new Intent();
            intent.putExtra("c", s);
            return intent;
        }
        
        @e
        public final CreateMessengerChannelFragment c(@e final String s, final long n) {
            k0.p(s, "profileId");
            final CreateMessengerChannelFragment createMessengerChannelFragment = new CreateMessengerChannelFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("a", s);
            arguments.putLong("b", n);
            createMessengerChannelFragment.setArguments(arguments);
            return createMessengerChannelFragment;
        }
    }
}
