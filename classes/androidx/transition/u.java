// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Matrix$ScaleToFit;
import android.graphics.RectF;
import android.graphics.Matrix;

class u
{
    static final Matrix a;
    
    static {
        a = new Matrix() {
            void a() {
                throw new IllegalStateException("Matrix can not be modified");
            }
            
            public boolean postConcat(final Matrix matrix) {
                this.a();
                return false;
            }
            
            public boolean postRotate(final float n) {
                this.a();
                return false;
            }
            
            public boolean postRotate(final float n, final float n2, final float n3) {
                this.a();
                return false;
            }
            
            public boolean postScale(final float n, final float n2) {
                this.a();
                return false;
            }
            
            public boolean postScale(final float n, final float n2, final float n3, final float n4) {
                this.a();
                return false;
            }
            
            public boolean postSkew(final float n, final float n2) {
                this.a();
                return false;
            }
            
            public boolean postSkew(final float n, final float n2, final float n3, final float n4) {
                this.a();
                return false;
            }
            
            public boolean postTranslate(final float n, final float n2) {
                this.a();
                return false;
            }
            
            public boolean preConcat(final Matrix matrix) {
                this.a();
                return false;
            }
            
            public boolean preRotate(final float n) {
                this.a();
                return false;
            }
            
            public boolean preRotate(final float n, final float n2, final float n3) {
                this.a();
                return false;
            }
            
            public boolean preScale(final float n, final float n2) {
                this.a();
                return false;
            }
            
            public boolean preScale(final float n, final float n2, final float n3, final float n4) {
                this.a();
                return false;
            }
            
            public boolean preSkew(final float n, final float n2) {
                this.a();
                return false;
            }
            
            public boolean preSkew(final float n, final float n2, final float n3, final float n4) {
                this.a();
                return false;
            }
            
            public boolean preTranslate(final float n, final float n2) {
                this.a();
                return false;
            }
            
            public void reset() {
                this.a();
            }
            
            public void set(final Matrix matrix) {
                this.a();
            }
            
            public boolean setConcat(final Matrix matrix, final Matrix matrix2) {
                this.a();
                return false;
            }
            
            public boolean setPolyToPoly(final float[] array, final int n, final float[] array2, final int n2, final int n3) {
                this.a();
                return false;
            }
            
            public boolean setRectToRect(final RectF rectF, final RectF rectF2, final Matrix$ScaleToFit matrix$ScaleToFit) {
                this.a();
                return false;
            }
            
            public void setRotate(final float n) {
                this.a();
            }
            
            public void setRotate(final float n, final float n2, final float n3) {
                this.a();
            }
            
            public void setScale(final float n, final float n2) {
                this.a();
            }
            
            public void setScale(final float n, final float n2, final float n3, final float n4) {
                this.a();
            }
            
            public void setSinCos(final float n, final float n2) {
                this.a();
            }
            
            public void setSinCos(final float n, final float n2, final float n3, final float n4) {
                this.a();
            }
            
            public void setSkew(final float n, final float n2) {
                this.a();
            }
            
            public void setSkew(final float n, final float n2, final float n3, final float n4) {
                this.a();
            }
            
            public void setTranslate(final float n, final float n2) {
                this.a();
            }
            
            public void setValues(final float[] array) {
                this.a();
            }
        };
    }
    
    private u() {
    }
}
