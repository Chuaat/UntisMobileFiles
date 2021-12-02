// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import java.util.List;
import java.lang.reflect.Field;
import c6.h;
import android.os.Build$VERSION;
import com.facebook.stetho.common.ReflectionUtil;
import d6.c;
import android.app.Activity;

@c
public abstract class FragmentCompat<FRAGMENT, DIALOG_FRAGMENT, FRAGMENT_MANAGER, FRAGMENT_ACTIVITY extends Activity>
{
    private static FragmentCompat sFrameworkInstance;
    private static final boolean sHasSupportFragment;
    private static FragmentCompat sSupportInstance;
    
    static {
        sHasSupportFragment = (ReflectionUtil.tryGetClassForName("androidx.fragment.app.Fragment") != null);
    }
    
    FragmentCompat() {
    }
    
    @h
    public static FragmentCompat getFrameworkInstance() {
        if (FragmentCompat.sFrameworkInstance == null && Build$VERSION.SDK_INT >= 11) {
            FragmentCompat.sFrameworkInstance = new FragmentCompatFramework();
        }
        return FragmentCompat.sFrameworkInstance;
    }
    
    @h
    public static FragmentCompat getSupportLibInstance() {
        if (FragmentCompat.sSupportInstance == null && FragmentCompat.sHasSupportFragment) {
            FragmentCompat.sSupportInstance = new FragmentCompatSupportLib();
        }
        return FragmentCompat.sSupportInstance;
    }
    
    public abstract DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> forDialogFragment();
    
    public abstract FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> forFragment();
    
    public abstract FragmentActivityAccessor<FRAGMENT_ACTIVITY, FRAGMENT_MANAGER> forFragmentActivity();
    
    public abstract FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> forFragmentManager();
    
    public abstract Class<DIALOG_FRAGMENT> getDialogFragmentClass();
    
    public abstract Class<FRAGMENT_ACTIVITY> getFragmentActivityClass();
    
    public abstract Class<FRAGMENT> getFragmentClass();
    
    static class FragmentManagerAccessorViaReflection<FRAGMENT_MANAGER, FRAGMENT> implements FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT>
    {
        @h
        private Field mFieldMAdded;
        
        @h
        @Override
        public List<FRAGMENT> getAddedFragments(final FRAGMENT_MANAGER fragment_MANAGER) {
            if (this.mFieldMAdded == null) {
                final Field tryGetDeclaredField = ReflectionUtil.tryGetDeclaredField(fragment_MANAGER.getClass(), "mAdded");
                if (tryGetDeclaredField != null) {
                    tryGetDeclaredField.setAccessible(true);
                    this.mFieldMAdded = tryGetDeclaredField;
                }
            }
            final Field mFieldMAdded = this.mFieldMAdded;
            List<FRAGMENT> list;
            if (mFieldMAdded != null) {
                list = (List<FRAGMENT>)ReflectionUtil.getFieldValue(mFieldMAdded, fragment_MANAGER);
            }
            else {
                list = null;
            }
            return list;
        }
    }
}
