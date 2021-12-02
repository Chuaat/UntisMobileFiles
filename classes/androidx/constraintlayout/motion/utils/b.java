// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.utils;

import java.lang.reflect.Method;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import androidx.constraintlayout.motion.widget.s;
import android.os.Build$VERSION;
import androidx.constraintlayout.widget.a;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.h;

public abstract class b extends androidx.constraintlayout.core.motion.utils.h
{
    private static final String i = "ViewOscillator";
    
    public static b l(final String s) {
        if (s.startsWith("CUSTOM")) {
            return new b();
        }
        int n = -1;
        switch (s) {
            case "waveOffset": {
                n = 13;
                break;
            }
            case "alpha": {
                n = 12;
                break;
            }
            case "transitionPathRotate": {
                n = 11;
                break;
            }
            case "elevation": {
                n = 10;
                break;
            }
            case "rotation": {
                n = 9;
                break;
            }
            case "waveVariesBy": {
                n = 8;
                break;
            }
            case "scaleY": {
                n = 7;
                break;
            }
            case "scaleX": {
                n = 6;
                break;
            }
            case "progress": {
                n = 5;
                break;
            }
            case "translationZ": {
                n = 4;
                break;
            }
            case "translationY": {
                n = 3;
                break;
            }
            case "translationX": {
                n = 2;
                break;
            }
            case "rotationY": {
                n = 1;
                break;
            }
            case "rotationX": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                return null;
            }
            case 13: {
                return new a();
            }
            case 12: {
                return new a();
            }
            case 11: {
                return new d();
            }
            case 10: {
                return new c();
            }
            case 9: {
                return new f();
            }
            case 8: {
                return new a();
            }
            case 7: {
                return new j();
            }
            case 6: {
                return new i();
            }
            case 5: {
                return new e();
            }
            case 4: {
                return new m();
            }
            case 3: {
                return new l();
            }
            case 2: {
                return new k();
            }
            case 1: {
                return new h();
            }
            case 0: {
                return new g();
            }
        }
    }
    
    public abstract void m(final View p0, final float p1);
    
    static class a extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setAlpha(this.a(n));
        }
    }
    
    static class b extends androidx.constraintlayout.motion.utils.b
    {
        float[] j;
        protected androidx.constraintlayout.widget.a k;
        
        b() {
            this.j = new float[1];
        }
        
        @Override
        protected void e(final Object o) {
            this.k = (androidx.constraintlayout.widget.a)o;
        }
        
        @Override
        public void m(final View view, final float n) {
            this.j[0] = this.a(n);
            this.k.o(view, this.j);
        }
    }
    
    static class c extends b
    {
        @Override
        public void m(final View view, final float n) {
            if (Build$VERSION.SDK_INT >= 21) {
                view.setElevation(this.a(n));
            }
        }
    }
    
    public static class d extends b
    {
        @Override
        public void m(final View view, final float n) {
        }
        
        public void n(final View view, final float n, final double x, final double y) {
            view.setRotation(this.a(n) + (float)Math.toDegrees(Math.atan2(y, x)));
        }
    }
    
    static class e extends b
    {
        boolean j;
        
        e() {
            this.j = false;
        }
        
        @Override
        public void m(final View obj, final float n) {
            if (obj instanceof s) {
                ((s)obj).setProgress(this.a(n));
            }
            else {
                if (this.j) {
                    return;
                }
                Method method = null;
                try {
                    method = obj.getClass().getMethod("setProgress", Float.TYPE);
                }
                catch (NoSuchMethodException ex) {
                    this.j = true;
                }
                if (method != null) {
                    try {
                        method.invoke(obj, this.a(n));
                        return;
                    }
                    catch (InvocationTargetException obj) {}
                    catch (IllegalAccessException ex2) {}
                    Log.e("ViewOscillator", "unable to setProgress", (Throwable)obj);
                }
            }
        }
    }
    
    static class f extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setRotation(this.a(n));
        }
    }
    
    static class g extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setRotationX(this.a(n));
        }
    }
    
    static class h extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setRotationY(this.a(n));
        }
    }
    
    static class i extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setScaleX(this.a(n));
        }
    }
    
    static class j extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setScaleY(this.a(n));
        }
    }
    
    static class k extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setTranslationX(this.a(n));
        }
    }
    
    static class l extends b
    {
        @Override
        public void m(final View view, final float n) {
            view.setTranslationY(this.a(n));
        }
    }
    
    static class m extends b
    {
        @Override
        public void m(final View view, final float n) {
            if (Build$VERSION.SDK_INT >= 21) {
                view.setTranslationZ(this.a(n));
            }
        }
    }
}
