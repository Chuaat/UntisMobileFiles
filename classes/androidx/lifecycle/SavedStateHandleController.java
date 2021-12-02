// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.Iterator;
import androidx.savedstate.c;
import androidx.annotation.j0;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

final class SavedStateHandleController implements v
{
    static final String J = "androidx.lifecycle.savedstate.vm.tag";
    private final String G;
    private boolean H;
    private final r0 I;
    
    SavedStateHandleController(final String g, final r0 i) {
        this.H = false;
        this.G = g;
        this.I = i;
    }
    
    static void e(final w0 w0, final SavedStateRegistry savedStateRegistry, final s s) {
        final SavedStateHandleController savedStateHandleController = w0.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.l()) {
            savedStateHandleController.i(savedStateRegistry, s);
            m(savedStateRegistry, s);
        }
    }
    
    static SavedStateHandleController j(final SavedStateRegistry savedStateRegistry, final s s, final String s2, final Bundle bundle) {
        final SavedStateHandleController savedStateHandleController = new SavedStateHandleController(s2, r0.c(savedStateRegistry.a(s2), bundle));
        savedStateHandleController.i(savedStateRegistry, s);
        m(savedStateRegistry, s);
        return savedStateHandleController;
    }
    
    private static void m(final SavedStateRegistry savedStateRegistry, final s s) {
        final s.c b = s.b();
        if (b != androidx.lifecycle.s.c.H && !b.b(androidx.lifecycle.s.c.J)) {
            s.a(new v() {
                @Override
                public void h(@j0 final y y, @j0 final s.b b) {
                    if (b == s.b.ON_START) {
                        s.c(this);
                        savedStateRegistry.f((Class<? extends SavedStateRegistry.a>)a.class);
                    }
                }
            });
        }
        else {
            savedStateRegistry.f((Class<? extends SavedStateRegistry.a>)a.class);
        }
    }
    
    @Override
    public void h(@j0 final y y, @j0 final s.b b) {
        if (b == s.b.ON_DESTROY) {
            this.H = false;
            y.getLifecycle().c(this);
        }
    }
    
    void i(final SavedStateRegistry savedStateRegistry, final s s) {
        if (!this.H) {
            this.H = true;
            s.a(this);
            savedStateRegistry.e(this.G, this.I.j());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
    
    r0 k() {
        return this.I;
    }
    
    boolean l() {
        return this.H;
    }
    
    static final class a implements SavedStateRegistry.a
    {
        @Override
        public void a(@j0 final c c) {
            if (c instanceof d1) {
                final c1 viewModelStore = ((d1)c).getViewModelStore();
                final SavedStateRegistry savedStateRegistry = c.getSavedStateRegistry();
                final Iterator<String> iterator = viewModelStore.c().iterator();
                while (iterator.hasNext()) {
                    SavedStateHandleController.e(viewModelStore.b(iterator.next()), savedStateRegistry, c.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.f((Class<? extends SavedStateRegistry.a>)a.class);
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }
}
