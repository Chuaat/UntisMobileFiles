// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.TextView;
import android.text.TextUtils;
import androidx.annotation.t0;
import androidx.annotation.j0;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.appcompat.app.d;
import android.os.Bundle;
import android.app.Dialog;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.e0;
import android.content.DialogInterface$OnClickListener;
import androidx.fragment.app.DialogFragment;

public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface$OnClickListener
{
    protected static final String p0 = "key";
    private static final String q0 = "PreferenceDialogFragment.title";
    private static final String r0 = "PreferenceDialogFragment.positiveText";
    private static final String s0 = "PreferenceDialogFragment.negativeText";
    private static final String t0 = "PreferenceDialogFragment.message";
    private static final String u0 = "PreferenceDialogFragment.layout";
    private static final String v0 = "PreferenceDialogFragment.icon";
    private DialogPreference h0;
    private CharSequence i0;
    private CharSequence j0;
    private CharSequence k0;
    private CharSequence l0;
    @e0
    private int m0;
    private BitmapDrawable n0;
    private int o0;
    
    private void T(final Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }
    
    @j0
    @Override
    public Dialog B(final Bundle bundle) {
        final androidx.fragment.app.d activity = this.getActivity();
        this.o0 = -2;
        final d.a s = new d.a((Context)activity).K(this.i0).h((Drawable)this.n0).C(this.j0, (DialogInterface$OnClickListener)this).s(this.k0, (DialogInterface$OnClickListener)this);
        final View q = this.Q((Context)activity);
        if (q != null) {
            this.P(q);
            s.M(q);
        }
        else {
            s.n(this.l0);
        }
        this.S(s);
        final d a = s.a();
        if (this.O()) {
            this.T(a);
        }
        return a;
    }
    
    public DialogPreference N() {
        if (this.h0 == null) {
            this.h0 = ((DialogPreference.a)this.getTargetFragment()).d(this.getArguments().getString("key"));
        }
        return this.h0;
    }
    
    @t0({ androidx.annotation.t0.a.G })
    protected boolean O() {
        return false;
    }
    
    protected void P(View viewById) {
        viewById = viewById.findViewById(16908299);
        if (viewById != null) {
            final CharSequence l0 = this.l0;
            int visibility = 8;
            if (!TextUtils.isEmpty(l0)) {
                if (viewById instanceof TextView) {
                    ((TextView)viewById).setText(l0);
                }
                visibility = 0;
            }
            if (viewById.getVisibility() != visibility) {
                viewById.setVisibility(visibility);
            }
        }
    }
    
    protected View Q(final Context context) {
        final int m0 = this.m0;
        if (m0 == 0) {
            return null;
        }
        return this.getLayoutInflater().inflate(m0, (ViewGroup)null);
    }
    
    public abstract void R(final boolean p0);
    
    protected void S(final d.a a) {
    }
    
    public void onClick(final DialogInterface dialogInterface, final int o0) {
        this.o0 = o0;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Fragment targetFragment = this.getTargetFragment();
        if (targetFragment instanceof DialogPreference.a) {
            final DialogPreference.a a = (DialogPreference.a)targetFragment;
            final String string = this.getArguments().getString("key");
            if (bundle == null) {
                final DialogPreference h0 = a.d(string);
                this.h0 = h0;
                this.i0 = h0.m2();
                this.j0 = this.h0.o2();
                this.k0 = this.h0.n2();
                this.l0 = this.h0.l2();
                this.m0 = this.h0.j2();
                final Drawable i2 = this.h0.i2();
                BitmapDrawable n0;
                if (i2 != null && !(i2 instanceof BitmapDrawable)) {
                    final Bitmap bitmap = Bitmap.createBitmap(i2.getIntrinsicWidth(), i2.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
                    final Canvas canvas = new Canvas(bitmap);
                    i2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    i2.draw(canvas);
                    n0 = new BitmapDrawable(this.getResources(), bitmap);
                }
                else {
                    n0 = (BitmapDrawable)i2;
                }
                this.n0 = n0;
            }
            else {
                this.i0 = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.j0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.k0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.l0 = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.m0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
                final Bitmap bitmap2 = (Bitmap)bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap2 != null) {
                    this.n0 = new BitmapDrawable(this.getResources(), bitmap2);
                }
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }
    
    @Override
    public void onDismiss(@j0 final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.R(this.o0 == -1);
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.i0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.j0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.k0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.l0);
        bundle.putInt("PreferenceDialogFragment.layout", this.m0);
        final BitmapDrawable n0 = this.n0;
        if (n0 != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", (Parcelable)n0.getBitmap());
        }
    }
}
