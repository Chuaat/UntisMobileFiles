// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import android.view.View;
import android.content.res.Resources;
import android.app.Dialog;
import c6.h;
import android.os.Build$VERSION;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.DialogFragment;
import android.app.Fragment;

@TargetApi(11)
final class FragmentCompatFramework extends FragmentCompat<Fragment, DialogFragment, FragmentManager, Activity>
{
    private static final DialogFragmentAccessorFramework sDialogFragmentAccessor;
    private static final FragmentAccessorFrameworkHoneycomb sFragmentAccessor;
    private static final FragmentActivityAccessorFramework sFragmentActivityAccessor;
    private static final FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor;
    
    static {
        sFragmentManagerAccessor = new FragmentManagerAccessorViaReflection();
        sFragmentActivityAccessor = new FragmentActivityAccessorFramework();
        FragmentAccessor<Fragment, FragmentManager> sFragmentAccessor2;
        if (Build$VERSION.SDK_INT >= 17) {
            sFragmentAccessor2 = new FragmentAccessorFrameworkJellyBean();
        }
        else {
            sFragmentAccessor2 = new FragmentAccessorFrameworkHoneycomb();
        }
        sFragmentAccessor = (FragmentAccessorFrameworkHoneycomb)sFragmentAccessor2;
        sDialogFragmentAccessor = new DialogFragmentAccessorFramework(FragmentCompatFramework.sFragmentAccessor);
    }
    
    @Override
    public DialogFragmentAccessorFramework forDialogFragment() {
        return FragmentCompatFramework.sDialogFragmentAccessor;
    }
    
    @Override
    public FragmentAccessorFrameworkHoneycomb forFragment() {
        return FragmentCompatFramework.sFragmentAccessor;
    }
    
    @Override
    public FragmentActivityAccessorFramework forFragmentActivity() {
        return FragmentCompatFramework.sFragmentActivityAccessor;
    }
    
    @Override
    public FragmentManagerAccessorViaReflection<FragmentManager, Fragment> forFragmentManager() {
        return FragmentCompatFramework.sFragmentManagerAccessor;
    }
    
    @Override
    public Class<DialogFragment> getDialogFragmentClass() {
        return DialogFragment.class;
    }
    
    @Override
    public Class<Activity> getFragmentActivityClass() {
        return Activity.class;
    }
    
    @Override
    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }
    
    private static class DialogFragmentAccessorFramework implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager>
    {
        private final FragmentAccessor<Fragment, FragmentManager> mFragmentAccessor;
        
        public DialogFragmentAccessorFramework(final FragmentAccessor<Fragment, FragmentManager> mFragmentAccessor) {
            this.mFragmentAccessor = mFragmentAccessor;
        }
        
        @h
        @Override
        public FragmentManager getChildFragmentManager(final Fragment fragment) {
            return this.mFragmentAccessor.getChildFragmentManager(fragment);
        }
        
        @Override
        public Dialog getDialog(final DialogFragment dialogFragment) {
            return dialogFragment.getDialog();
        }
        
        @h
        @Override
        public FragmentManager getFragmentManager(final Fragment fragment) {
            return this.mFragmentAccessor.getFragmentManager(fragment);
        }
        
        @Override
        public int getId(final Fragment fragment) {
            return this.mFragmentAccessor.getId(fragment);
        }
        
        @Override
        public Resources getResources(final Fragment fragment) {
            return this.mFragmentAccessor.getResources(fragment);
        }
        
        @h
        @Override
        public String getTag(final Fragment fragment) {
            return this.mFragmentAccessor.getTag(fragment);
        }
        
        @h
        @Override
        public View getView(final Fragment fragment) {
            return this.mFragmentAccessor.getView(fragment);
        }
    }
    
    private static class FragmentAccessorFrameworkHoneycomb implements FragmentAccessor<Fragment, FragmentManager>
    {
        @h
        @Override
        public FragmentManager getChildFragmentManager(final Fragment fragment) {
            return null;
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
    
    @TargetApi(17)
    private static class FragmentAccessorFrameworkJellyBean extends FragmentAccessorFrameworkHoneycomb
    {
        @h
        @Override
        public FragmentManager getChildFragmentManager(final Fragment fragment) {
            return fragment.getChildFragmentManager();
        }
    }
    
    private static class FragmentActivityAccessorFramework implements FragmentActivityAccessor<Activity, FragmentManager>
    {
        @h
        @Override
        public FragmentManager getFragmentManager(final Activity activity) {
            return activity.getFragmentManager();
        }
    }
}
