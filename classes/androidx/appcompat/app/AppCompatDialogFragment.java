// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import androidx.annotation.t0;
import androidx.annotation.j0;
import android.app.Dialog;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment
{
    @j0
    @Override
    public Dialog B(@k0 final Bundle bundle) {
        return new androidx.appcompat.app.i(this.getContext(), this.z());
    }
    
    @t0({ t0.a.I })
    @Override
    public void J(@j0 final Dialog dialog, final int n) {
        if (dialog instanceof androidx.appcompat.app.i) {
            final androidx.appcompat.app.i i = (androidx.appcompat.app.i)dialog;
            if (n != 1 && n != 2) {
                if (n != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            i.e(1);
        }
        else {
            super.J(dialog, n);
        }
    }
}
