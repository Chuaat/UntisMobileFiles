// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.t0;
import android.os.Bundle;
import android.widget.EditText;

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat
{
    private static final String y0 = "EditTextPreferenceDialogFragment.text";
    private EditText w0;
    private CharSequence x0;
    
    private EditTextPreference U() {
        return (EditTextPreference)this.N();
    }
    
    public static EditTextPreferenceDialogFragmentCompat V(final String s) {
        final EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        final Bundle arguments = new Bundle(1);
        arguments.putString("key", s);
        editTextPreferenceDialogFragmentCompat.setArguments(arguments);
        return editTextPreferenceDialogFragmentCompat;
    }
    
    @t0({ androidx.annotation.t0.a.G })
    @Override
    protected boolean O() {
        return true;
    }
    
    @Override
    protected void P(final View view) {
        super.P(view);
        final EditText w0 = (EditText)view.findViewById(16908291);
        this.w0 = w0;
        if (w0 != null) {
            w0.requestFocus();
            this.w0.setText(this.x0);
            final EditText w2 = this.w0;
            w2.setSelection(w2.getText().length());
            if (this.U().F2() != null) {
                this.U().F2().a(this.w0);
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }
    
    @Override
    public void R(final boolean b) {
        if (b) {
            final String string = this.w0.getText().toString();
            final EditTextPreference u = this.U();
            if (u.d(string)) {
                u.I2(string);
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        CharSequence x0;
        if (bundle == null) {
            x0 = this.U().G2();
        }
        else {
            x0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.x0 = x0;
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.x0);
    }
}
