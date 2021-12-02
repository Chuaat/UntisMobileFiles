// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.os.Bundle;

@Deprecated
public class d extends g
{
    private static final String Y = "ListPreferenceDialogFragment.index";
    private static final String Z = "ListPreferenceDialogFragment.entries";
    private static final String a0 = "ListPreferenceDialogFragment.entryValues";
    int V;
    private CharSequence[] W;
    private CharSequence[] X;
    
    @Deprecated
    public d() {
    }
    
    private ListPreference h() {
        return (ListPreference)this.a();
    }
    
    @Deprecated
    public static d i(final String s) {
        final d d = new d();
        final Bundle arguments = new Bundle(1);
        arguments.putString("key", s);
        d.setArguments(arguments);
        return d;
    }
    
    @Deprecated
    @Override
    public void e(final boolean b) {
        final ListPreference h = this.h();
        if (b) {
            final int v = this.V;
            if (v >= 0) {
                final String string = this.X[v].toString();
                if (h.d(string)) {
                    h.R2(string);
                }
            }
        }
    }
    
    @Override
    protected void f(final AlertDialog$Builder alertDialog$Builder) {
        super.f(alertDialog$Builder);
        alertDialog$Builder.setSingleChoiceItems(this.W, this.V, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int v) {
                final d g = d.this;
                g.V = v;
                g.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        alertDialog$Builder.setPositiveButton((CharSequence)null, (DialogInterface$OnClickListener)null);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            final ListPreference h = this.h();
            if (h.G2() == null || h.I2() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.V = h.F2(h.J2());
            this.W = h.G2();
            this.X = h.I2();
        }
        else {
            this.V = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.W = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.X = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.V);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.W);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.X);
    }
}
