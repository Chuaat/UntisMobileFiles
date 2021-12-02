// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Bitmap$Config;
import android.content.res.TypedArray;
import java.util.Iterator;
import android.graphics.PorterDuff$Mode;
import android.annotation.TargetApi;
import android.util.AttributeSet;
import android.graphics.Color;
import android.text.Editable;
import com.flask.colorpicker.builder.d;
import android.content.Context;
import android.widget.LinearLayout;
import android.text.TextWatcher;
import android.widget.EditText;
import com.flask.colorpicker.slider.b;
import java.util.ArrayList;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.view.View;

public class e extends View
{
    private static final float i0 = 2.0f;
    private Bitmap G;
    private Canvas H;
    private int I;
    private float J;
    private float K;
    private int L;
    private Integer[] M;
    private int N;
    private Integer O;
    private Integer P;
    private Paint Q;
    private Paint R;
    private Paint S;
    private Paint T;
    private com.flask.colorpicker.c U;
    private ArrayList<f> V;
    private ArrayList<g> W;
    private com.flask.colorpicker.slider.c a0;
    private b b0;
    private EditText c0;
    private TextWatcher d0;
    private LinearLayout e0;
    private com.flask.colorpicker.renderer.c f0;
    private int g0;
    private int h0;
    
    public e(final Context context) {
        super(context);
        this.I = 10;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 0;
        this.M = new Integer[] { null, null, null, null, null };
        this.N = 0;
        this.Q = d.c().c(0).b();
        this.R = d.c().c(-1).b();
        this.S = d.c().c(-16777216).b();
        this.T = d.c().b();
        this.V = new ArrayList<f>();
        this.W = new ArrayList<g>();
        this.d0 = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(final Editable editable) {
            }
            
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(final CharSequence charSequence, int color, final int n, final int n2) {
                try {
                    color = Color.parseColor(charSequence.toString());
                    e.this.h(color, false);
                }
                catch (Exception ex) {}
            }
        };
        this.g(context, null);
    }
    
    public e(final Context context, final AttributeSet set) {
        super(context, set);
        this.I = 10;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 0;
        this.M = new Integer[] { null, null, null, null, null };
        this.N = 0;
        this.Q = d.c().c(0).b();
        this.R = d.c().c(-1).b();
        this.S = d.c().c(-16777216).b();
        this.T = d.c().b();
        this.V = new ArrayList<f>();
        this.W = new ArrayList<g>();
        this.d0 = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(final Editable editable) {
            }
            
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(final CharSequence charSequence, int color, final int n, final int n2) {
                try {
                    color = Color.parseColor(charSequence.toString());
                    e.this.h(color, false);
                }
                catch (Exception ex) {}
            }
        };
        this.g(context, set);
    }
    
    public e(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.I = 10;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 0;
        this.M = new Integer[] { null, null, null, null, null };
        this.N = 0;
        this.Q = d.c().c(0).b();
        this.R = d.c().c(-1).b();
        this.S = d.c().c(-16777216).b();
        this.T = d.c().b();
        this.V = new ArrayList<f>();
        this.W = new ArrayList<g>();
        this.d0 = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(final Editable editable) {
            }
            
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(final CharSequence charSequence, int color, final int n, final int n2) {
                try {
                    color = Color.parseColor(charSequence.toString());
                    e.this.h(color, false);
                }
                catch (Exception ex) {}
            }
        };
        this.g(context, set);
    }
    
    @TargetApi(21)
    public e(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.I = 10;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 0;
        this.M = new Integer[] { null, null, null, null, null };
        this.N = 0;
        this.Q = d.c().c(0).b();
        this.R = d.c().c(-1).b();
        this.S = d.c().c(-16777216).b();
        this.T = d.c().b();
        this.V = new ArrayList<f>();
        this.W = new ArrayList<g>();
        this.d0 = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(final Editable editable) {
            }
            
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(final CharSequence charSequence, int color, final int n, final int n2) {
                try {
                    color = Color.parseColor(charSequence.toString());
                    e.this.h(color, false);
                }
                catch (Exception ex) {}
            }
        };
        this.g(context, set);
    }
    
    private void d() {
        this.H.drawColor(0, PorterDuff$Mode.CLEAR);
        if (this.f0 == null) {
            return;
        }
        final float n = this.H.getWidth() / 2.0f;
        final int i = this.I;
        final float b = n - 2.05f - n / i;
        final float c = b / (i - 1) / 2.0f;
        final com.flask.colorpicker.renderer.b c2 = this.f0.c();
        c2.a = this.I;
        c2.b = b;
        c2.c = c;
        c2.d = 2.05f;
        c2.e = this.K;
        c2.f = this.J;
        c2.g = this.H;
        this.f0.b(c2);
        this.f0.a();
    }
    
    private com.flask.colorpicker.c e(final int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        final double n2 = array[1];
        final double cos = Math.cos(array[0] * 3.141592653589793 / 180.0);
        final double n3 = array[1] * Math.sin(array[0] * 3.141592653589793 / 180.0);
        final Iterator<com.flask.colorpicker.c> iterator = this.f0.d().iterator();
        com.flask.colorpicker.c c = null;
        double n4 = Double.MAX_VALUE;
        while (iterator.hasNext()) {
            final com.flask.colorpicker.c c2 = iterator.next();
            final float[] b = c2.b();
            final double n5 = b[1];
            final double cos2 = Math.cos(b[0] * 3.141592653589793 / 180.0);
            final double n6 = b[1];
            final double sin = Math.sin(b[0] * 3.141592653589793 / 180.0);
            final double n7 = n2 * cos - n5 * cos2;
            final double n8 = n3 - n6 * sin;
            final double n9 = n7 * n7 + n8 * n8;
            double n10 = n4;
            if (n9 < n4) {
                n10 = n9;
                c = c2;
            }
            n4 = n10;
        }
        return c;
    }
    
    private com.flask.colorpicker.c f(final float n, final float n2) {
        final Iterator<com.flask.colorpicker.c> iterator = this.f0.d().iterator();
        com.flask.colorpicker.c c = null;
        double n3 = Double.MAX_VALUE;
        while (iterator.hasNext()) {
            final com.flask.colorpicker.c c2 = iterator.next();
            final double g = c2.g(n, n2);
            if (n3 > g) {
                c = c2;
                n3 = g;
            }
        }
        return c;
    }
    
    private void g(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, h.l.q3);
        this.I = obtainStyledAttributes.getInt(h.l.t3, 10);
        this.O = obtainStyledAttributes.getInt(h.l.u3, -1);
        this.P = obtainStyledAttributes.getInt(h.l.z3, -1);
        final com.flask.colorpicker.renderer.c a = com.flask.colorpicker.builder.c.a(c.b(obtainStyledAttributes.getInt(h.l.B3, 0)));
        this.g0 = obtainStyledAttributes.getResourceId(h.l.s3, 0);
        this.h0 = obtainStyledAttributes.getResourceId(h.l.w3, 0);
        this.setRenderer(a);
        this.setDensity(this.I);
        this.j(this.O, true);
        obtainStyledAttributes.recycle();
    }
    
    private void l() {
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        int n = measuredWidth;
        if (measuredHeight < measuredWidth) {
            n = measuredHeight;
        }
        if (n <= 0) {
            return;
        }
        if (this.G == null) {
            this.G = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
            this.H = new Canvas(this.G);
            this.T.setShader(d.b(8));
        }
        this.d();
        this.invalidate();
    }
    
    private void setColorPreviewColor(final int n) {
        final LinearLayout e0 = this.e0;
        if (e0 != null) {
            final Integer[] m = this.M;
            if (m != null) {
                final int n2 = this.N;
                if (n2 <= m.length) {
                    if (m[n2] != null) {
                        if (e0.getChildCount() != 0) {
                            if (this.e0.getVisibility() == 0) {
                                final View child = this.e0.getChildAt(this.N);
                                if (!(child instanceof LinearLayout)) {
                                    return;
                                }
                                ((ImageView)((LinearLayout)child).findViewById(h.g.Y)).setImageDrawable((Drawable)new com.flask.colorpicker.b(n));
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void setColorText(final int n) {
        final EditText c0 = this.c0;
        if (c0 == null) {
            return;
        }
        c0.setText((CharSequence)i.e(n, this.b0 != null));
    }
    
    private void setColorToSliders(final int n) {
        final com.flask.colorpicker.slider.c a0 = this.a0;
        if (a0 != null) {
            a0.setColor(n);
        }
        final b b0 = this.b0;
        if (b0 != null) {
            b0.setColor(n);
        }
    }
    
    private void setHighlightedColor(final int n) {
        final int childCount = this.e0.getChildCount();
        if (childCount != 0) {
            if (this.e0.getVisibility() == 0) {
                for (int i = 0; i < childCount; ++i) {
                    final View child = this.e0.getChildAt(i);
                    if (child instanceof LinearLayout) {
                        final LinearLayout linearLayout = (LinearLayout)child;
                        if (i == n) {
                            linearLayout.setBackgroundColor(-1);
                        }
                        else {
                            linearLayout.setBackgroundColor(0);
                        }
                    }
                }
            }
        }
    }
    
    public void a(final f e) {
        this.V.add(e);
    }
    
    public void b(final g e) {
        this.W.add(e);
    }
    
    protected void c(final int n, final int n2) {
        final ArrayList<f> v = this.V;
        if (v != null && n != n2) {
            for (final f f : v) {
                try {
                    f.a(n2);
                }
                catch (Exception ex) {}
            }
        }
    }
    
    public Integer[] getAllColors() {
        return this.M;
    }
    
    public int getSelectedColor() {
        final com.flask.colorpicker.c u = this.U;
        int hsvToColor;
        if (u != null) {
            hsvToColor = Color.HSVToColor(u.c(this.J));
        }
        else {
            hsvToColor = 0;
        }
        return i.a(this.K, hsvToColor);
    }
    
    public void h(final int n, final boolean b) {
        this.j(n, b);
        this.l();
        this.invalidate();
    }
    
    public void i(final LinearLayout e0, final Integer n) {
        if (e0 == null) {
            return;
        }
        this.e0 = e0;
        int i = 0;
        Integer value;
        if ((value = n) == null) {
            value = 0;
        }
        final int childCount = e0.getChildCount();
        if (childCount != 0) {
            if (e0.getVisibility() == 0) {
                while (i < childCount) {
                    final View child = e0.getChildAt(i);
                    if (child instanceof LinearLayout) {
                        final LinearLayout linearLayout = (LinearLayout)child;
                        if (i == value) {
                            linearLayout.setBackgroundColor(-1);
                        }
                        final ImageView imageView = (ImageView)linearLayout.findViewById(h.g.Y);
                        imageView.setClickable(true);
                        imageView.setTag((Object)i);
                        imageView.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                            public void onClick(final View view) {
                                if (view == null) {
                                    return;
                                }
                                final Object tag = view.getTag();
                                if (tag != null) {
                                    if (tag instanceof Integer) {
                                        e.this.setSelectedColor((int)tag);
                                    }
                                }
                            }
                        });
                    }
                    ++i;
                }
            }
        }
    }
    
    public void j(final int colorText, final boolean b) {
        final float[] array = new float[3];
        Color.colorToHSV(colorText, array);
        this.K = i.d(colorText);
        this.J = array[2];
        this.M[this.N] = colorText;
        this.O = colorText;
        this.setColorPreviewColor(colorText);
        this.setColorToSliders(colorText);
        if (this.c0 != null && b) {
            this.setColorText(colorText);
        }
        this.U = this.e(colorText);
    }
    
    public void k(final Integer[] m, final int n) {
        this.M = m;
        this.N = n;
        Integer value;
        if ((value = m[n]) == null) {
            value = -1;
        }
        this.j(value, true);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.L);
        final Bitmap g = this.G;
        if (g != null) {
            canvas.drawBitmap(g, 0.0f, 0.0f, (Paint)null);
        }
        if (this.U != null) {
            final float n = (canvas.getWidth() / 2.0f - 2.05f) / this.I / 2.0f;
            this.Q.setColor(Color.HSVToColor(this.U.c(this.J)));
            this.Q.setAlpha((int)(this.K * 255.0f));
            canvas.drawCircle(this.U.d(), this.U.e(), 2.0f * n, this.R);
            canvas.drawCircle(this.U.d(), this.U.e(), 1.5f * n, this.S);
            canvas.drawCircle(this.U.d(), this.U.e(), n, this.T);
            canvas.drawCircle(this.U.d(), this.U.e(), n, this.Q);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.g0 != 0) {
            this.setAlphaSlider((b)this.getRootView().findViewById(this.g0));
        }
        if (this.h0 != 0) {
            this.setLightnessSlider((com.flask.colorpicker.slider.c)this.getRootView().findViewById(this.h0));
        }
        this.l();
        this.U = this.e(this.O);
    }
    
    protected void onMeasure(int size, int n) {
        super.onMeasure(size, n);
        final int mode = View$MeasureSpec.getMode(size);
        int size2;
        if (mode == 0) {
            size2 = size;
        }
        else if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size2 = 0;
        }
        else {
            size2 = View$MeasureSpec.getSize(size);
        }
        final int mode2 = View$MeasureSpec.getMode(n);
        if (mode2 != 0) {
            if (mode2 != Integer.MIN_VALUE && mode != 1073741824) {
                size = 0;
            }
            else {
                size = View$MeasureSpec.getSize(n);
            }
        }
        n = size2;
        if (size < size2) {
            n = size;
        }
        this.setMeasuredDimension(n, n);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.l();
    }
    
    public boolean onTouchEvent(MotionEvent iterator) {
        final int action = iterator.getAction();
        Label_0141: {
            if (action != 0) {
                if (action == 1) {
                    final int selectedColor = this.getSelectedColor();
                    final ArrayList<g> w = this.W;
                    if (w != null) {
                        iterator = (MotionEvent)w.iterator();
                        while (((Iterator)iterator).hasNext()) {
                            final g g = ((Iterator<g>)iterator).next();
                            try {
                                g.a(selectedColor);
                            }
                            catch (Exception ex) {}
                        }
                    }
                    this.setColorToSliders(selectedColor);
                    this.setColorText(selectedColor);
                    this.setColorPreviewColor(selectedColor);
                    break Label_0141;
                }
                if (action != 2) {
                    return true;
                }
            }
            final int selectedColor2 = this.getSelectedColor();
            this.U = this.f(iterator.getX(), iterator.getY());
            final int selectedColor3 = this.getSelectedColor();
            this.c(selectedColor2, selectedColor3);
            this.O = selectedColor3;
            this.setColorToSliders(selectedColor3);
        }
        this.invalidate();
        return true;
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        this.l();
        this.U = this.e(this.O);
    }
    
    public void setAlphaSlider(final b b0) {
        this.b0 = b0;
        if (b0 != null) {
            b0.setColorPicker(this);
            this.b0.setColor(this.getSelectedColor());
        }
    }
    
    public void setAlphaValue(final float k) {
        final int selectedColor = this.getSelectedColor();
        this.K = k;
        final Integer value = Color.HSVToColor(i.b(k), this.U.c(this.J));
        this.O = value;
        final EditText c0 = this.c0;
        if (c0 != null) {
            c0.setText((CharSequence)i.e(value, this.b0 != null));
        }
        final com.flask.colorpicker.slider.c a0 = this.a0;
        if (a0 != null) {
            final Integer o = this.O;
            if (o != null) {
                a0.setColor(o);
            }
        }
        this.c(selectedColor, this.O);
        this.l();
        this.invalidate();
    }
    
    public void setColorEdit(final EditText c0) {
        this.c0 = c0;
        if (c0 != null) {
            c0.setVisibility(0);
            this.c0.addTextChangedListener(this.d0);
            this.setColorEditTextColor(this.P);
        }
    }
    
    public void setColorEditTextColor(final int n) {
        this.P = n;
        final EditText c0 = this.c0;
        if (c0 != null) {
            c0.setTextColor(n);
        }
    }
    
    public void setDensity(final int b) {
        this.I = Math.max(2, b);
        this.invalidate();
    }
    
    public void setLightness(final float j) {
        final int selectedColor = this.getSelectedColor();
        this.J = j;
        final Integer value = Color.HSVToColor(i.b(this.K), this.U.c(j));
        this.O = value;
        final EditText c0 = this.c0;
        if (c0 != null) {
            c0.setText((CharSequence)i.e(value, this.b0 != null));
        }
        final b b0 = this.b0;
        if (b0 != null) {
            final Integer o = this.O;
            if (o != null) {
                b0.setColor(o);
            }
        }
        this.c(selectedColor, this.O);
        this.l();
        this.invalidate();
    }
    
    public void setLightnessSlider(final com.flask.colorpicker.slider.c a0) {
        this.a0 = a0;
        if (a0 != null) {
            a0.setColorPicker(this);
            this.a0.setColor(this.getSelectedColor());
        }
    }
    
    public void setRenderer(final com.flask.colorpicker.renderer.c f0) {
        this.f0 = f0;
        this.invalidate();
    }
    
    public void setSelectedColor(final int n) {
        final Integer[] m = this.M;
        if (m != null) {
            if (m.length >= n) {
                this.setHighlightedColor(this.N = n);
                final Integer n2 = this.M[n];
                if (n2 == null) {
                    return;
                }
                this.h(n2, true);
            }
        }
    }
    
    public enum c
    {
        G, 
        H;
        
        public static c b(final int n) {
            if (n == 0) {
                return c.G;
            }
            if (n != 1) {
                return c.G;
            }
            return c.H;
        }
    }
}
