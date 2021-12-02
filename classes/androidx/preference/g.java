// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.os.Parcelable;
import androidx.annotation.j0;
import android.app.AlertDialog;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.app.Fragment;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.os.Bundle;
import android.content.DialogInterface;
import android.app.AlertDialog$Builder;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.t0;
import android.app.Dialog;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.e0;
import android.content.DialogInterface$OnClickListener;
import android.app.DialogFragment;

@Deprecated
public abstract class g extends DialogFragment implements DialogInterface$OnClickListener
{
    @Deprecated
    protected static final String O = "key";
    private static final String P = "PreferenceDialogFragment.title";
    private static final String Q = "PreferenceDialogFragment.positiveText";
    private static final String R = "PreferenceDialogFragment.negativeText";
    private static final String S = "PreferenceDialogFragment.message";
    private static final String T = "PreferenceDialogFragment.layout";
    private static final String U = "PreferenceDialogFragment.icon";
    private DialogPreference G;
    private CharSequence H;
    private CharSequence I;
    private CharSequence J;
    private CharSequence K;
    @e0
    private int L;
    private BitmapDrawable M;
    private int N;
    
    @Deprecated
    public g() {
    }
    
    private void g(final Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }
    
    @Deprecated
    public DialogPreference a() {
        if (this.G == null) {
            this.G = ((DialogPreference.a)this.getTargetFragment()).d(this.getArguments().getString("key"));
        }
        return this.G;
    }
    
    @t0({ t0.a.G })
    protected boolean b() {
        return false;
    }
    
    @Deprecated
    protected void c(final View view) {
        final View viewById = view.findViewById(16908299);
        if (viewById != null) {
            final CharSequence k = this.K;
            int visibility = 8;
            if (!TextUtils.isEmpty(k)) {
                if (viewById instanceof TextView) {
                    ((TextView)viewById).setText(k);
                }
                visibility = 0;
            }
            if (viewById.getVisibility() != visibility) {
                viewById.setVisibility(visibility);
            }
        }
    }
    
    @Deprecated
    protected View d(final Context context) {
        final int l = this.L;
        if (l == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(l, (ViewGroup)null);
    }
    
    @Deprecated
    public abstract void e(final boolean p0);
    
    @Deprecated
    protected void f(final AlertDialog$Builder alertDialog$Builder) {
    }
    
    @Deprecated
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.N = n;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Fragment targetFragment = this.getTargetFragment();
        if (targetFragment instanceof DialogPreference.a) {
            final DialogPreference.a a = (DialogPreference.a)targetFragment;
            final String string = this.getArguments().getString("key");
            if (bundle == null) {
                final DialogPreference g = a.d(string);
                this.G = g;
                this.H = g.m2();
                this.I = this.G.o2();
                this.J = this.G.n2();
                this.K = this.G.l2();
                this.L = this.G.j2();
                final Drawable i2 = this.G.i2();
                BitmapDrawable m;
                if (i2 != null && !(i2 instanceof BitmapDrawable)) {
                    final Bitmap bitmap = Bitmap.createBitmap(i2.getIntrinsicWidth(), i2.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
                    final Canvas canvas = new Canvas(bitmap);
                    i2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    i2.draw(canvas);
                    m = new BitmapDrawable(this.getResources(), bitmap);
                }
                else {
                    m = (BitmapDrawable)i2;
                }
                this.M = m;
            }
            else {
                this.H = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.I = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.J = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.K = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.L = bundle.getInt("PreferenceDialogFragment.layout", 0);
                final Bitmap bitmap2 = (Bitmap)bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap2 != null) {
                    this.M = new BitmapDrawable(this.getResources(), bitmap2);
                }
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }
    
    @j0
    public Dialog onCreateDialog(final Bundle bundle) {
        final Activity activity = this.getActivity();
        this.N = -2;
        final AlertDialog$Builder setNegativeButton = new AlertDialog$Builder((Context)activity).setTitle(this.H).setIcon((Drawable)this.M).setPositiveButton(this.I, (DialogInterface$OnClickListener)this).setNegativeButton(this.J, (DialogInterface$OnClickListener)this);
        final View d = this.d((Context)activity);
        if (d != null) {
            this.c(d);
            setNegativeButton.setView(d);
        }
        else {
            setNegativeButton.setMessage(this.K);
        }
        this.f(setNegativeButton);
        final AlertDialog create = setNegativeButton.create();
        if (this.b()) {
            this.g((Dialog)create);
        }
        return (Dialog)create;
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.e(this.N == -1);
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.H);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.I);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.J);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.K);
        bundle.putInt("PreferenceDialogFragment.layout", this.L);
        final BitmapDrawable m = this.M;
        if (m != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", (Parcelable)m.getBitmap());
        }
    }
}
