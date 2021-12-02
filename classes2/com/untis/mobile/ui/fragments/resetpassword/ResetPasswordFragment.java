// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.resetpassword;

import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.app.Activity;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import android.widget.TextView$OnEditorActionListener;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.j2;
import n6.l;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.text.s;
import com.untis.mobile.c;
import com.google.android.material.textfield.TextInputEditText;
import com.untis.mobile.utils.u0;
import rx.functions.b;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/ui/fragments/resetpassword/ResetPasswordFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "B", "", "E", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "outState", "onSaveInstanceState", "Lcom/untis/mobile/ui/fragments/resetpassword/viewmodel/a;", "G", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/ui/fragments/resetpassword/viewmodel/a;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ResetPasswordFragment extends UmFragment
{
    @e
    public static final a H;
    @e
    public static final String I = "reset-password-fragment";
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public ResetPasswordFragment() {
        this.G = d0.c((n6.a<?>)new n6.a<com.untis.mobile.ui.fragments.resetpassword.viewmodel.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.ui.fragments.resetpassword.viewmodel.a invoke() {
                return (com.untis.mobile.ui.fragments.resetpassword.viewmodel.a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.ui.fragments.resetpassword.viewmodel.a.class), null, null);
            }
        });
    }
    
    private static final void A(final ResetPasswordFragment resetPasswordFragment, final View view) {
        k0.p(resetPasswordFragment, "this$0");
        resetPasswordFragment.onBackPressed();
    }
    
    private final void B(final View view) {
        if (!this.E(view)) {
            return;
        }
        UmFragment.hideKeyboard$default(this, null, 1, null);
        this.x().m().C5((b)new com.untis.mobile.ui.fragments.resetpassword.e(this), (b)new d(view));
    }
    
    private static final void C(final ResetPasswordFragment resetPasswordFragment, final Boolean b) {
        k0.p(resetPasswordFragment, "this$0");
        final androidx.fragment.app.d activity = resetPasswordFragment.getActivity();
        if (activity != null) {
            ((Activity)activity).setResult(-1);
        }
        final androidx.fragment.app.d activity2 = resetPasswordFragment.getActivity();
        if (activity2 != null) {
            ((Activity)activity2).finish();
        }
    }
    
    private static final void D(final View view, final Throwable t) {
        k0.p(view, "$view");
        u0.d(view, t);
    }
    
    private final boolean E(final View view) {
        final Editable text = ((AppCompatEditText)view.findViewById(c.i.Rr)).getText();
        boolean b = true;
        final boolean b2 = false;
        if (text == null || s.U1((CharSequence)text)) {
            ((TextInputLayout)view.findViewById(c.i.Qr)).setError((CharSequence)this.getString(2131886702));
            b = false;
        }
        final String value = String.valueOf(((AppCompatEditText)view.findViewById(c.i.Pr)).getText());
        if (s.U1((CharSequence)value) || !com.untis.mobile.utils.b0.a.a(value)) {
            ((TextInputLayout)view.findViewById(c.i.Or)).setError((CharSequence)this.getString(2131886696));
            b = b2;
        }
        return b;
    }
    
    private final com.untis.mobile.ui.fragments.resetpassword.viewmodel.a x() {
        return this.G.getValue();
    }
    
    private static final boolean y(final ResetPasswordFragment resetPasswordFragment, final View view, final TextView textView, final int n, final KeyEvent keyEvent) {
        k0.p(resetPasswordFragment, "this$0");
        k0.p(view, "$view");
        if (n == 6) {
            resetPasswordFragment.B(view);
            return true;
        }
        return false;
    }
    
    private static final void z(final ResetPasswordFragment resetPasswordFragment, final View view, final View view2) {
        k0.p(resetPasswordFragment, "this$0");
        k0.p(view, "$view");
        resetPasswordFragment.B(view);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        final com.untis.mobile.ui.fragments.resetpassword.viewmodel.a x = this.x();
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        x.f(arguments);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493118, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((TextView)inflate.findViewById(c.i.Xr)).setText((CharSequence)this.getString(2131886596));
        final TextInputEditText textInputEditText = (TextInputEditText)inflate.findViewById(2131297755);
        ((EditText)textInputEditText).requestFocus();
        k0.o(textInputEditText, "");
        h.B(textInputEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "newText");
                ((Button)inflate.findViewById(2131297756)).setEnabled(ResetPasswordFragment.this.x().o());
                ResetPasswordFragment.this.x().l(s);
                ((EditText)textInputEditText).setError((CharSequence)null);
            }
        });
        ((EditText)textInputEditText).setText((CharSequence)this.x().e());
        if (s.U1((CharSequence)this.x().e())) {
            ((EditText)textInputEditText).requestFocus();
            this.showKeyboard((View)textInputEditText);
        }
        final TextInputEditText textInputEditText2 = (TextInputEditText)inflate.findViewById(2131297753);
        k0.o(textInputEditText2, "");
        h.B(textInputEditText2, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "newText");
                ((Button)inflate.findViewById(2131297756)).setEnabled(ResetPasswordFragment.this.x().o());
                ResetPasswordFragment.this.x().k(s);
                ((EditText)textInputEditText2).setError((CharSequence)null);
            }
        });
        ((EditText)textInputEditText2).setText((CharSequence)this.x().d());
        ((EditText)textInputEditText2).setOnEditorActionListener((TextView$OnEditorActionListener)new com.untis.mobile.ui.fragments.resetpassword.c(this, inflate));
        if (s.U1((CharSequence)this.x().e()) ^ true) {
            ((EditText)textInputEditText2).requestFocus();
            this.showKeyboard((View)textInputEditText2);
        }
        ((Button)inflate.findViewById(c.i.Sr)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.fragments.resetpassword.b(this, inflate));
        ((ImageView)inflate.findViewById(c.i.Ur)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.fragments.resetpassword.a(this));
        return inflate;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.x().n());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "com/untis/mobile/ui/fragments/resetpassword/ResetPasswordFragment$a", "", "", "schoolUrl", "", "schoolId", "schoolLogin", "userLogin", "Lcom/untis/mobile/ui/fragments/resetpassword/ResetPasswordFragment;", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final ResetPasswordFragment a(@e final String s, final long n, @e final String s2, @e final String s3) {
            k0.p(s, "schoolUrl");
            k0.p(s2, "schoolLogin");
            k0.p(s3, "userLogin");
            final ResetPasswordFragment resetPasswordFragment = new ResetPasswordFragment();
            resetPasswordFragment.setArguments(com.untis.mobile.ui.fragments.resetpassword.viewmodel.a.g.a(s3, "", s2, s, n));
            return resetPasswordFragment;
        }
    }
}
