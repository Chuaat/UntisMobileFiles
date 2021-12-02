// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d;
import android.os.Bundle;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat
{
    private static final String A0 = "ListPreferenceDialogFragment.entries";
    private static final String B0 = "ListPreferenceDialogFragment.entryValues";
    private static final String z0 = "ListPreferenceDialogFragment.index";
    int w0;
    private CharSequence[] x0;
    private CharSequence[] y0;
    
    private ListPreference U() {
        return (ListPreference)this.N();
    }
    
    public static ListPreferenceDialogFragmentCompat V(final String s) {
        final ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        final Bundle arguments = new Bundle(1);
        arguments.putString("key", s);
        listPreferenceDialogFragmentCompat.setArguments(arguments);
        return listPreferenceDialogFragmentCompat;
    }
    
    @Override
    public void R(final boolean b) {
        if (b) {
            final int w0 = this.w0;
            if (w0 >= 0) {
                final String string = this.y0[w0].toString();
                final ListPreference u = this.U();
                if (u.d(string)) {
                    u.R2(string);
                }
            }
        }
    }
    
    @Override
    protected void S(final d.a a) {
        super.S(a);
        a.I(this.x0, this.w0, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int w0) {
                final ListPreferenceDialogFragmentCompat g = ListPreferenceDialogFragmentCompat.this;
                g.w0 = w0;
                g.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        a.C(null, null);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            final ListPreference u = this.U();
            if (u.G2() == null || u.I2() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.w0 = u.F2(u.J2());
            this.x0 = u.G2();
            this.y0 = u.I2();
        }
        else {
            this.w0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.x0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.y0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.w0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.x0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.y0);
    }
}
