// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import android.app.Dialog;

public interface DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> extends FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER>
{
    Dialog getDialog(final DIALOG_FRAGMENT p0);
}
