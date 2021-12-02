// 
// Decompiled by Procyon v0.5.36
// 

package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import androidx.core.content.d;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.j0;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.widget.ImageView;

class a extends ImageView
{
    private static final int I = 503316480;
    private static final int J = 1023410176;
    private static final float K = 0.0f;
    private static final float L = 1.75f;
    private static final float M = 3.5f;
    private static final int N = 4;
    private Animation$AnimationListener G;
    int H;
    
    a(final Context context, final int color) {
        super(context);
        final float density = this.getContext().getResources().getDisplayMetrics().density;
        final int n = (int)(1.75f * density);
        final int n2 = (int)(0.0f * density);
        this.H = (int)(3.5f * density);
        ShapeDrawable shapeDrawable;
        if (this.a()) {
            shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
            j0.L1((View)this, density * 4.0f);
        }
        else {
            shapeDrawable = new ShapeDrawable((Shape)new a(this.H));
            this.setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float)this.H, (float)n2, (float)n, 503316480);
            final int h = this.H;
            this.setPadding(h, h, h, h);
        }
        shapeDrawable.getPaint().setColor(color);
        j0.G1((View)this, (Drawable)shapeDrawable);
    }
    
    private boolean a() {
        return Build$VERSION.SDK_INT >= 21;
    }
    
    public void b(final Animation$AnimationListener g) {
        this.G = g;
    }
    
    public void c(final int n) {
        this.setBackgroundColor(d.f(this.getContext(), n));
    }
    
    public void onAnimationEnd() {
        super.onAnimationEnd();
        final Animation$AnimationListener g = this.G;
        if (g != null) {
            g.onAnimationEnd(this.getAnimation());
        }
    }
    
    public void onAnimationStart() {
        super.onAnimationStart();
        final Animation$AnimationListener g = this.G;
        if (g != null) {
            g.onAnimationStart(this.getAnimation());
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (!this.a()) {
            this.setMeasuredDimension(this.getMeasuredWidth() + this.H * 2, this.getMeasuredHeight() + this.H * 2);
        }
    }
    
    public void setBackgroundColor(final int color) {
        if (this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(color);
        }
    }
    
    private class a extends OvalShape
    {
        private RadialGradient G;
        private Paint H;
        
        a(final int h) {
            this.H = new Paint();
            androidx.swiperefreshlayout.widget.a.this.H = h;
            this.a((int)this.rect().width());
        }
        
        private void a(final int n) {
            final float n2 = (float)(n / 2);
            final RadialGradient radialGradient = new RadialGradient(n2, n2, (float)androidx.swiperefreshlayout.widget.a.this.H, new int[] { 1023410176, 0 }, (float[])null, Shader$TileMode.CLAMP);
            this.G = radialGradient;
            this.H.setShader((Shader)radialGradient);
        }
        
        public void draw(final Canvas canvas, final Paint paint) {
            final int width = androidx.swiperefreshlayout.widget.a.this.getWidth();
            final int height = androidx.swiperefreshlayout.widget.a.this.getHeight();
            final int n = width / 2;
            final float n2 = (float)n;
            final float n3 = (float)(height / 2);
            canvas.drawCircle(n2, n3, n2, this.H);
            canvas.drawCircle(n2, n3, (float)(n - androidx.swiperefreshlayout.widget.a.this.H), paint);
        }
        
        protected void onResize(final float n, final float n2) {
            super.onResize(n, n2);
            this.a((int)n);
        }
    }
}
