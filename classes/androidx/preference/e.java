// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.Collection;
import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class e extends g
{
    private static final String Z = "MultiSelectListPreferenceDialogFragment.values";
    private static final String a0 = "MultiSelectListPreferenceDialogFragment.changed";
    private static final String b0 = "MultiSelectListPreferenceDialogFragment.entries";
    private static final String c0 = "MultiSelectListPreferenceDialogFragment.entryValues";
    Set<String> V;
    boolean W;
    CharSequence[] X;
    CharSequence[] Y;
    
    @Deprecated
    public e() {
        this.V = new HashSet<String>();
    }
    
    private MultiSelectListPreference h() {
        return (MultiSelectListPreference)this.a();
    }
    
    @Deprecated
    public static e i(final String s) {
        final e e = new e();
        final Bundle arguments = new Bundle(1);
        arguments.putString("key", s);
        e.setArguments(arguments);
        return e;
    }
    
    @Deprecated
    @Override
    public void e(final boolean b) {
        final MultiSelectListPreference h = this.h();
        if (b && this.W) {
            final Set<String> v = this.V;
            if (h.d(v)) {
                h.Q2(v);
            }
        }
        this.W = false;
    }
    
    @Override
    protected void f(final AlertDialog$Builder alertDialog$Builder) {
        super.f(alertDialog$Builder);
        final int length = this.Y.length;
        final boolean[] array = new boolean[length];
        for (int i = 0; i < length; ++i) {
            array[i] = this.V.contains(this.Y[i].toString());
        }
        alertDialog$Builder.setMultiChoiceItems(this.X, array, (DialogInterface$OnMultiChoiceClickListener)new DialogInterface$OnMultiChoiceClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n, final boolean b) {
                final e a = e.this;
                boolean b2;
                boolean b3;
                if (b) {
                    b2 = a.W;
                    b3 = a.V.add(a.Y[n].toString());
                }
                else {
                    b2 = a.W;
                    b3 = a.V.remove(a.Y[n].toString());
                }
                a.W = (b3 | b2);
            }
        });
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            final MultiSelectListPreference h = this.h();
            if (h.G2() == null || h.H2() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.V.clear();
            this.V.addAll(h.J2());
            this.W = false;
            this.X = h.G2();
            this.Y = h.H2();
        }
        else {
            this.V.clear();
            this.V.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.W = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.X = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.Y = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
        }
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList((Collection<? extends E>)this.V));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.W);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.X);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.Y);
    }
}
