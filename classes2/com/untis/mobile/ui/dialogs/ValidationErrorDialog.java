// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import androidx.fragment.app.Fragment;
import android.view.View$OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import androidx.annotation.j0;
import android.view.View;
import com.untis.mobile.persistence.models.booking.ValidationError;
import java.util.List;
import androidx.fragment.app.DialogFragment;

public class ValidationErrorDialog extends DialogFragment
{
    public static final String i0 = "koriander";
    private static final String j0 = "validationErrors";
    private List<ValidationError> h0;
    
    @j0
    public static ValidationErrorDialog P(@j0 final List<ValidationError> c) {
        final ValidationErrorDialog validationErrorDialog = new ValidationErrorDialog();
        final Bundle arguments = new Bundle();
        arguments.putParcelableArrayList("validationErrors", new ArrayList((Collection<? extends E>)c));
        ((Fragment)validationErrorDialog).setArguments(arguments);
        return validationErrorDialog;
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = ((Fragment)this).getArguments();
        }
        if (arguments != null) {
            this.h0 = (List<ValidationError>)arguments.getParcelableArrayList("validationErrors");
        }
        if (this.h0 == null) {
            this.h0 = new ArrayList<ValidationError>();
        }
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493065, viewGroup, false);
        ((ListView)inflate.findViewById(2131297447)).setAdapter((ListAdapter)new l(((Fragment)this).getContext(), this.h0));
        inflate.findViewById(2131297446).setOnClickListener((View$OnClickListener)new m(this));
        return inflate;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("validationErrors", new ArrayList((Collection<? extends E>)this.h0));
    }
}
