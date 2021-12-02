// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.graphics.Insets;
import androidx.annotation.k0;
import androidx.core.graphics.j;
import androidx.annotation.t;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.view.WindowInsetsAnimationController;
import android.os.Build$VERSION;

public final class w0
{
    private final b a;
    
    w0() {
        if (Build$VERSION.SDK_INT < 30) {
            this.a = new b();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("On API 30+, the constructor taking a ");
        sb.append(WindowInsetsAnimationController.class.getSimpleName());
        sb.append(" as parameter");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    @p0(30)
    w0(@j0 final WindowInsetsAnimationController windowInsetsAnimationController) {
        this.a = (b)new a(windowInsetsAnimationController);
    }
    
    public void a(final boolean b) {
        this.a.a(b);
    }
    
    public float b() {
        return this.a.b();
    }
    
    @t(from = 0.0, to = 1.0)
    public float c() {
        return this.a.c();
    }
    
    @j0
    public j d() {
        return this.a.d();
    }
    
    @j0
    public j e() {
        return this.a.e();
    }
    
    @j0
    public j f() {
        return this.a.f();
    }
    
    public int g() {
        return this.a.g();
    }
    
    public boolean h() {
        return this.a.h();
    }
    
    public boolean i() {
        return this.a.i();
    }
    
    public boolean j() {
        return !this.i() && !this.h();
    }
    
    public void k(@k0 final j j, @t(from = 0.0, to = 1.0) final float n, @t(from = 0.0, to = 1.0) final float n2) {
        this.a.k(j, n, n2);
    }
    
    @p0(30)
    private static class a extends b
    {
        private final WindowInsetsAnimationController a;
        
        a(@j0 final WindowInsetsAnimationController a) {
            this.a = a;
        }
        
        @Override
        void a(final boolean b) {
            this.a.finish(b);
        }
        
        @Override
        public float b() {
            return this.a.getCurrentAlpha();
        }
        
        @Override
        public float c() {
            return this.a.getCurrentFraction();
        }
        
        @j0
        @Override
        public j d() {
            return j.g(this.a.getCurrentInsets());
        }
        
        @j0
        @Override
        public j e() {
            return j.g(this.a.getHiddenStateInsets());
        }
        
        @j0
        @Override
        public j f() {
            return j.g(this.a.getShownStateInsets());
        }
        
        @Override
        public int g() {
            return this.a.getTypes();
        }
        
        @Override
        boolean h() {
            return this.a.isCancelled();
        }
        
        @Override
        boolean i() {
            return this.a.isFinished();
        }
        
        @Override
        public boolean j() {
            return this.a.isReady();
        }
        
        @Override
        public void k(@k0 final j j, final float n, final float n2) {
            final WindowInsetsAnimationController a = this.a;
            Insets h;
            if (j == null) {
                h = null;
            }
            else {
                h = j.h();
            }
            a.setInsetsAndAlpha(h, n, n2);
        }
    }
    
    private static class b
    {
        b() {
        }
        
        void a(final boolean b) {
        }
        
        public float b() {
            return 0.0f;
        }
        
        @t(from = 0.0, to = 1.0)
        public float c() {
            return 0.0f;
        }
        
        @j0
        public j d() {
            return j.e;
        }
        
        @j0
        public j e() {
            return j.e;
        }
        
        @j0
        public j f() {
            return j.e;
        }
        
        public int g() {
            return 0;
        }
        
        boolean h() {
            return true;
        }
        
        boolean i() {
            return false;
        }
        
        public boolean j() {
            return false;
        }
        
        public void k(@k0 final j j, @t(from = 0.0, to = 1.0) final float n, @t(from = 0.0, to = 1.0) final float n2) {
        }
    }
}
