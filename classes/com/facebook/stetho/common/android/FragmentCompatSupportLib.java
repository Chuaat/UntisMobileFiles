// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import android.app.Activity;
import android.view.View;
import android.content.res.Resources;
import c6.h;
import android.app.Dialog;
import androidx.fragment.app.d;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

final class FragmentCompatSupportLib extends FragmentCompat<Fragment, DialogFragment, FragmentManager, d>
{
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor;
    private static final FragmentAccessorSupportLib sFragmentAccessor;
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor;
    private static final FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor;
    
    static {
        sFragmentAccessor = new FragmentAccessorSupportLib();
        sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
        sFragmentManagerAccessor = new FragmentManagerAccessorViaReflection();
        sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();
    }
    
    @Override
    public DialogFragmentAccessorSupportLib forDialogFragment() {
        return FragmentCompatSupportLib.sDialogFragmentAccessor;
    }
    
    @Override
    public FragmentAccessorSupportLib forFragment() {
        return FragmentCompatSupportLib.sFragmentAccessor;
    }
    
    @Override
    public FragmentActivityAccessorSupportLib forFragmentActivity() {
        return FragmentCompatSupportLib.sFragmentActivityAccessor;
    }
    
    @Override
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager() {
        return FragmentCompatSupportLib.sFragmentManagerAccessor;
    }
    
    @Override
    public Class<DialogFragment> getDialogFragmentClass() {
        return DialogFragment.class;
    }
    
    @Override
    public Class<d> getFragmentActivityClass() {
        return d.class;
    }
    
    @Override
    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }
    
    private static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager>
    {
        @Override
        public Dialog getDialog(final DialogFragment dialogFragment) {
            return dialogFragment.x();
        }
    }
    
    private static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, FragmentManager>
    {
        @h
        @Override
        public FragmentManager getChildFragmentManager(final Fragment fragment) {
            return fragment.getChildFragmentManager();
        }
        
        @h
        @Override
        public FragmentManager getFragmentManager(final Fragment fragment) {
            return fragment.getFragmentManager();
        }
        
        @Override
        public int getId(final Fragment fragment) {
            return fragment.getId();
        }
        
        @Override
        public Resources getResources(final Fragment fragment) {
            return fragment.getResources();
        }
        
        @h
        @Override
        public String getTag(final Fragment fragment) {
            return fragment.getTag();
        }
        
        @h
        @Override
        public View getView(final Fragment fragment) {
            return fragment.getView();
        }
    }
    
    private static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<d, FragmentManager>
    {
        @h
        @Override
        public FragmentManager getFragmentManager(final d d) {
            return d.getSupportFragmentManager();
        }
    }
}
