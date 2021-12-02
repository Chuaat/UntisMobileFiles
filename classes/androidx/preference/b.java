// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.t0;
import android.os.Bundle;
import android.widget.EditText;

@Deprecated
public class b extends g
{
    private static final String X = "EditTextPreferenceDialogFragment.text";
    private EditText V;
    private CharSequence W;
    
    @Deprecated
    public b() {
    }
    
    private EditTextPreference h() {
        return (EditTextPreference)this.a();
    }
    
    @Deprecated
    public static b i(final String s) {
        final b b = new b();
        final Bundle arguments = new Bundle(1);
        arguments.putString("key", s);
        b.setArguments(arguments);
        return b;
    }
    
    @t0({ t0.a.G })
    @Override
    protected boolean b() {
        return true;
    }
    
    @Override
    protected void c(final View view) {
        super.c(view);
        (this.V = (EditText)view.findViewById(16908291)).requestFocus();
        final EditText v = this.V;
        if (v != null) {
            v.setText(this.W);
            final EditText v2 = this.V;
            v2.setSelection(v2.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }
    
    @Deprecated
    @Override
    public void e(final boolean b) {
        if (b) {
            final String string = this.V.getText().toString();
            if (this.h().d(string)) {
                this.h().I2(string);
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        CharSequence w;
        if (bundle == null) {
            w = this.h().G2();
        }
        else {
            w = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.W = w;
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.W);
    }
}
