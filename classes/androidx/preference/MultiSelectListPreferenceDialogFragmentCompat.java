// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.Collection;
import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import androidx.appcompat.app.d;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat
{
    private static final String A0 = "MultiSelectListPreferenceDialogFragmentCompat.values";
    private static final String B0 = "MultiSelectListPreferenceDialogFragmentCompat.changed";
    private static final String C0 = "MultiSelectListPreferenceDialogFragmentCompat.entries";
    private static final String D0 = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";
    Set<String> w0;
    boolean x0;
    CharSequence[] y0;
    CharSequence[] z0;
    
    public MultiSelectListPreferenceDialogFragmentCompat() {
        this.w0 = new HashSet<String>();
    }
    
    private MultiSelectListPreference U() {
        return (MultiSelectListPreference)this.N();
    }
    
    public static MultiSelectListPreferenceDialogFragmentCompat V(final String s) {
        final MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        final Bundle arguments = new Bundle(1);
        arguments.putString("key", s);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(arguments);
        return multiSelectListPreferenceDialogFragmentCompat;
    }
    
    @Override
    public void R(final boolean b) {
        if (b && this.x0) {
            final MultiSelectListPreference u = this.U();
            if (u.d(this.w0)) {
                u.Q2(this.w0);
            }
        }
        this.x0 = false;
    }
    
    @Override
    protected void S(final d.a a) {
        super.S(a);
        final int length = this.z0.length;
        final boolean[] array = new boolean[length];
        for (int i = 0; i < length; ++i) {
            array[i] = this.w0.contains(this.z0[i].toString());
        }
        a.q(this.y0, array, (DialogInterface$OnMultiChoiceClickListener)new DialogInterface$OnMultiChoiceClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n, final boolean b) {
                final MultiSelectListPreferenceDialogFragmentCompat a = MultiSelectListPreferenceDialogFragmentCompat.this;
                boolean b2;
                boolean b3;
                if (b) {
                    b2 = a.x0;
                    b3 = a.w0.add(a.z0[n].toString());
                }
                else {
                    b2 = a.x0;
                    b3 = a.w0.remove(a.z0[n].toString());
                }
                a.x0 = (b3 | b2);
            }
        });
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            final MultiSelectListPreference u = this.U();
            if (u.G2() == null || u.H2() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.w0.clear();
            this.w0.addAll(u.J2());
            this.x0 = false;
            this.y0 = u.G2();
            this.z0 = u.H2();
        }
        else {
            this.w0.clear();
            this.w0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.x0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.y0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.z0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList((Collection<? extends E>)this.w0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.x0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.y0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.z0);
    }
}
