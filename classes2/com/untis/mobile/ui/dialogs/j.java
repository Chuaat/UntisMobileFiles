// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import android.view.View;
import java.util.Arrays;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.app.d$a;
import android.app.Dialog;
import android.os.Bundle;
import android.content.Context;
import com.untis.mobile.utils.a;
import android.widget.NumberPicker;
import android.content.DialogInterface;
import android.app.DialogFragment;

public class j extends DialogFragment
{
    public static final String[] H;
    private a G;
    
    static {
        H = new String[] { "0", "5", "10", "15", "20", "30", "45", "60", "90", "120" };
    }
    
    public static j c() {
        return new j();
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        this.G = (a)this.getActivity();
        final int b = com.untis.mobile.utils.a.a((Context)this.getActivity()).B();
        final d$a d$a = new d$a((Context)this.getActivity());
        final View inflate = this.getActivity().getLayoutInflater().inflate(2131493061, (ViewGroup)null);
        final NumberPicker numberPicker = (NumberPicker)inflate.findViewById(2131297440);
        d$a.J(2131886621).M(inflate).B(2131886660, (DialogInterface$OnClickListener)new i(this, numberPicker)).r(2131886649, (DialogInterface$OnClickListener)new h(this));
        numberPicker.setMinValue(0);
        final String[] h = j.H;
        numberPicker.setMaxValue(h.length - 1);
        numberPicker.setDisplayedValues(h);
        numberPicker.setValue(Arrays.asList(h).indexOf(Integer.toString(b)));
        numberPicker.setWrapSelectorWheel(false);
        return (Dialog)d$a.a();
    }
    
    public interface a
    {
        void a();
    }
}
