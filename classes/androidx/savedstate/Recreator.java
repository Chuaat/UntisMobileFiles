// 
// Decompiled by Procyon v0.5.36
// 

package androidx.savedstate;

import androidx.annotation.j0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import androidx.lifecycle.x;
import androidx.lifecycle.s;
import androidx.lifecycle.y;
import java.lang.reflect.Constructor;
import android.annotation.SuppressLint;
import androidx.lifecycle.q;

@SuppressLint({ "RestrictedApi" })
final class Recreator implements q
{
    static final String H = "classes_to_restore";
    static final String I = "androidx.savedstate.Restarter";
    private final c G;
    
    Recreator(final c g) {
        this.G = g;
    }
    
    private void e(String str) {
        try {
            final Class<? extends SavedStateRegistry.a> subclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                final Constructor<? extends SavedStateRegistry.a> declaredConstructor = subclass.getDeclaredConstructor((Class<?>[])new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a)declaredConstructor.newInstance(new Object[0])).a(this.G);
                }
                catch (Exception subclass) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), (Throwable)subclass);
                }
            }
            catch (NoSuchMethodException cause) {
                str = (String)new StringBuilder();
                ((StringBuilder)str).append("Class");
                ((StringBuilder)str).append(subclass.getSimpleName());
                ((StringBuilder)str).append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(((StringBuilder)str).toString(), cause);
            }
        }
        catch (ClassNotFoundException cause2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Class ");
            sb2.append(str);
            sb2.append(" wasn't found");
            throw new RuntimeException(sb2.toString(), cause2);
        }
    }
    
    @Override
    public void h(final y y, final s.b b) {
        if (b != s.b.ON_CREATE) {
            throw new AssertionError((Object)"Next event must be ON_CREATE");
        }
        y.getLifecycle().c(this);
        final Bundle a = this.G.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        final ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            final Iterator<String> iterator = stringArrayList.iterator();
            while (iterator.hasNext()) {
                this.e(iterator.next());
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
    
    static final class a implements b
    {
        final Set<String> a;
        
        a(final SavedStateRegistry savedStateRegistry) {
            this.a = new HashSet<String>();
            savedStateRegistry.e("androidx.savedstate.Restarter", (SavedStateRegistry.b)this);
        }
        
        @j0
        @Override
        public Bundle a() {
            final Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList((Collection<? extends E>)this.a));
            return bundle;
        }
        
        void b(final String s) {
            this.a.add(s);
        }
    }
}
