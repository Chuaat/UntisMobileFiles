// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.database.DataSetObserver;
import android.widget.ThemedSpinnerAdapter;
import android.content.DialogInterface;
import android.widget.ListView;
import android.util.Log;
import androidx.appcompat.app.d;
import android.content.DialogInterface$OnClickListener;
import androidx.annotation.s;
import android.widget.ListAdapter;
import android.widget.Adapter;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.t0;
import android.content.res.ColorStateList;
import androidx.annotation.b1;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import androidx.annotation.k0;
import c.a;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.graphics.Rect;
import android.widget.SpinnerAdapter;
import android.content.Context;
import androidx.core.view.h0;
import android.widget.Spinner;

public class u extends Spinner implements h0
{
    private static final int[] O;
    private static final int P = 15;
    private static final String Q = "AppCompatSpinner";
    private static final int R = 0;
    private static final int S = 1;
    private static final int T = -1;
    private final androidx.appcompat.widget.f G;
    private final Context H;
    private e0 I;
    private SpinnerAdapter J;
    private final boolean K;
    private g L;
    int M;
    final Rect N;
    
    static {
        O = new int[] { 16843505 };
    }
    
    public u(@j0 final Context context) {
        this(context, null);
    }
    
    public u(@j0 final Context context, final int n) {
        this(context, null, a.c.f3, n);
    }
    
    public u(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.f3);
    }
    
    public u(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        this(context, set, n, -1);
    }
    
    public u(@j0 final Context context, @k0 final AttributeSet set, final int n, final int n2) {
        this(context, set, n, n2, null);
    }
    
    public u(@j0 final Context p0, @k0 final AttributeSet p1, final int p2, final int p3, final Resources$Theme p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: iload_3        
        //     4: invokespecial   android/widget/Spinner.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //     7: aload_0        
        //     8: new             Landroid/graphics/Rect;
        //    11: dup            
        //    12: invokespecial   android/graphics/Rect.<init>:()V
        //    15: putfield        androidx/appcompat/widget/u.N:Landroid/graphics/Rect;
        //    18: aload_0        
        //    19: aload_0        
        //    20: invokevirtual   android/widget/Spinner.getContext:()Landroid/content/Context;
        //    23: invokestatic    androidx/appcompat/widget/p0.a:(Landroid/view/View;Landroid/content/Context;)V
        //    26: aload_1        
        //    27: aload_2        
        //    28: getstatic       c/a$n.v6:[I
        //    31: iload_3        
        //    32: iconst_0       
        //    33: invokestatic    androidx/appcompat/widget/u0.G:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/u0;
        //    36: astore          6
        //    38: aload_0        
        //    39: new             Landroidx/appcompat/widget/f;
        //    42: dup            
        //    43: aload_0        
        //    44: invokespecial   androidx/appcompat/widget/f.<init>:(Landroid/view/View;)V
        //    47: putfield        androidx/appcompat/widget/u.G:Landroidx/appcompat/widget/f;
        //    50: aload           5
        //    52: ifnull          76
        //    55: new             Landroidx/appcompat/view/d;
        //    58: dup            
        //    59: aload_1        
        //    60: aload           5
        //    62: invokespecial   androidx/appcompat/view/d.<init>:(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
        //    65: astore          5
        //    67: aload_0        
        //    68: aload           5
        //    70: putfield        androidx/appcompat/widget/u.H:Landroid/content/Context;
        //    73: goto            112
        //    76: aload           6
        //    78: getstatic       c/a$n.A6:I
        //    81: iconst_0       
        //    82: invokevirtual   androidx/appcompat/widget/u0.u:(II)I
        //    85: istore          7
        //    87: iload           7
        //    89: ifeq            107
        //    92: new             Landroidx/appcompat/view/d;
        //    95: dup            
        //    96: aload_1        
        //    97: iload           7
        //    99: invokespecial   androidx/appcompat/view/d.<init>:(Landroid/content/Context;I)V
        //   102: astore          5
        //   104: goto            67
        //   107: aload_0        
        //   108: aload_1        
        //   109: putfield        androidx/appcompat/widget/u.H:Landroid/content/Context;
        //   112: aconst_null    
        //   113: astore          8
        //   115: iload           4
        //   117: istore          7
        //   119: iload           4
        //   121: iconst_m1      
        //   122: if_icmpne       244
        //   125: aload_1        
        //   126: aload_2        
        //   127: getstatic       androidx/appcompat/widget/u.O:[I
        //   130: iload_3        
        //   131: iconst_0       
        //   132: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
        //   135: astore          5
        //   137: iload           4
        //   139: istore          7
        //   141: aload           5
        //   143: astore          9
        //   145: aload           5
        //   147: astore          8
        //   149: aload           5
        //   151: iconst_0       
        //   152: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   155: ifeq            175
        //   158: aload           5
        //   160: astore          8
        //   162: aload           5
        //   164: iconst_0       
        //   165: iconst_0       
        //   166: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //   169: istore          7
        //   171: aload           5
        //   173: astore          9
        //   175: aload           9
        //   177: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   180: goto            244
        //   183: astore          9
        //   185: goto            197
        //   188: astore_1       
        //   189: goto            232
        //   192: astore          9
        //   194: aconst_null    
        //   195: astore          5
        //   197: aload           5
        //   199: astore          8
        //   201: ldc             "AppCompatSpinner"
        //   203: ldc             "Could not read android:spinnerMode"
        //   205: aload           9
        //   207: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   210: pop            
        //   211: iload           4
        //   213: istore          7
        //   215: aload           5
        //   217: ifnull          244
        //   220: iload           4
        //   222: istore          7
        //   224: aload           5
        //   226: astore          9
        //   228: goto            175
        //   231: astore_1       
        //   232: aload           8
        //   234: ifnull          242
        //   237: aload           8
        //   239: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   242: aload_1        
        //   243: athrow         
        //   244: iload           7
        //   246: ifeq            358
        //   249: iload           7
        //   251: iconst_1       
        //   252: if_icmpeq       258
        //   255: goto            389
        //   258: new             Landroidx/appcompat/widget/u$e;
        //   261: dup            
        //   262: aload_0        
        //   263: aload_0        
        //   264: getfield        androidx/appcompat/widget/u.H:Landroid/content/Context;
        //   267: aload_2        
        //   268: iload_3        
        //   269: invokespecial   androidx/appcompat/widget/u$e.<init>:(Landroidx/appcompat/widget/u;Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //   272: astore          8
        //   274: aload_0        
        //   275: getfield        androidx/appcompat/widget/u.H:Landroid/content/Context;
        //   278: aload_2        
        //   279: getstatic       c/a$n.v6:[I
        //   282: iload_3        
        //   283: iconst_0       
        //   284: invokestatic    androidx/appcompat/widget/u0.G:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/u0;
        //   287: astore          5
        //   289: aload_0        
        //   290: aload           5
        //   292: getstatic       c/a$n.z6:I
        //   295: bipush          -2
        //   297: invokevirtual   androidx/appcompat/widget/u0.q:(II)I
        //   300: putfield        androidx/appcompat/widget/u.M:I
        //   303: aload           8
        //   305: aload           5
        //   307: getstatic       c/a$n.x6:I
        //   310: invokevirtual   androidx/appcompat/widget/u0.h:(I)Landroid/graphics/drawable/Drawable;
        //   313: invokevirtual   androidx/appcompat/widget/f0.b:(Landroid/graphics/drawable/Drawable;)V
        //   316: aload           8
        //   318: aload           6
        //   320: getstatic       c/a$n.y6:I
        //   323: invokevirtual   androidx/appcompat/widget/u0.w:(I)Ljava/lang/String;
        //   326: invokevirtual   androidx/appcompat/widget/u$e.j:(Ljava/lang/CharSequence;)V
        //   329: aload           5
        //   331: invokevirtual   androidx/appcompat/widget/u0.I:()V
        //   334: aload_0        
        //   335: aload           8
        //   337: putfield        androidx/appcompat/widget/u.L:Landroidx/appcompat/widget/u$g;
        //   340: aload_0        
        //   341: new             Landroidx/appcompat/widget/u$a;
        //   344: dup            
        //   345: aload_0        
        //   346: aload_0        
        //   347: aload           8
        //   349: invokespecial   androidx/appcompat/widget/u$a.<init>:(Landroidx/appcompat/widget/u;Landroid/view/View;Landroidx/appcompat/widget/u$e;)V
        //   352: putfield        androidx/appcompat/widget/u.I:Landroidx/appcompat/widget/e0;
        //   355: goto            389
        //   358: new             Landroidx/appcompat/widget/u$c;
        //   361: dup            
        //   362: aload_0        
        //   363: invokespecial   androidx/appcompat/widget/u$c.<init>:(Landroidx/appcompat/widget/u;)V
        //   366: astore          5
        //   368: aload_0        
        //   369: aload           5
        //   371: putfield        androidx/appcompat/widget/u.L:Landroidx/appcompat/widget/u$g;
        //   374: aload           5
        //   376: aload           6
        //   378: getstatic       c/a$n.y6:I
        //   381: invokevirtual   androidx/appcompat/widget/u0.w:(I)Ljava/lang/String;
        //   384: invokeinterface androidx/appcompat/widget/u$g.j:(Ljava/lang/CharSequence;)V
        //   389: aload           6
        //   391: getstatic       c/a$n.w6:I
        //   394: invokevirtual   androidx/appcompat/widget/u0.y:(I)[Ljava/lang/CharSequence;
        //   397: astore          5
        //   399: aload           5
        //   401: ifnull          429
        //   404: new             Landroid/widget/ArrayAdapter;
        //   407: dup            
        //   408: aload_1        
        //   409: ldc             17367048
        //   411: aload           5
        //   413: invokespecial   android/widget/ArrayAdapter.<init>:(Landroid/content/Context;I[Ljava/lang/Object;)V
        //   416: astore_1       
        //   417: aload_1        
        //   418: getstatic       c/a$k.M:I
        //   421: invokevirtual   android/widget/ArrayAdapter.setDropDownViewResource:(I)V
        //   424: aload_0        
        //   425: aload_1        
        //   426: invokevirtual   androidx/appcompat/widget/u.setAdapter:(Landroid/widget/SpinnerAdapter;)V
        //   429: aload           6
        //   431: invokevirtual   androidx/appcompat/widget/u0.I:()V
        //   434: aload_0        
        //   435: iconst_1       
        //   436: putfield        androidx/appcompat/widget/u.K:Z
        //   439: aload_0        
        //   440: getfield        androidx/appcompat/widget/u.J:Landroid/widget/SpinnerAdapter;
        //   443: astore_1       
        //   444: aload_1        
        //   445: ifnull          458
        //   448: aload_0        
        //   449: aload_1        
        //   450: invokevirtual   androidx/appcompat/widget/u.setAdapter:(Landroid/widget/SpinnerAdapter;)V
        //   453: aload_0        
        //   454: aconst_null    
        //   455: putfield        androidx/appcompat/widget/u.J:Landroid/widget/SpinnerAdapter;
        //   458: aload_0        
        //   459: getfield        androidx/appcompat/widget/u.G:Landroidx/appcompat/widget/f;
        //   462: aload_2        
        //   463: iload_3        
        //   464: invokevirtual   androidx/appcompat/widget/f.e:(Landroid/util/AttributeSet;I)V
        //   467: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  125    137    192    197    Ljava/lang/Exception;
        //  125    137    188    192    Any
        //  149    158    183    188    Ljava/lang/Exception;
        //  149    158    231    232    Any
        //  162    171    183    188    Ljava/lang/Exception;
        //  162    171    231    232    Any
        //  201    211    231    232    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0175:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    int a(final SpinnerAdapter spinnerAdapter, final Drawable drawable) {
        int n = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        final int max = Math.max(0, this.getSelectedItemPosition());
        final int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int max2 = 0;
        while (i < min) {
            final int itemViewType = spinnerAdapter.getItemViewType(i);
            int n2;
            if (itemViewType != (n2 = n)) {
                view = null;
                n2 = itemViewType;
            }
            view = spinnerAdapter.getView(i, view, (ViewGroup)this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
            }
            view.measure(measureSpec, measureSpec2);
            max2 = Math.max(max2, view.getMeasuredWidth());
            ++i;
            n = n2;
        }
        int n3 = max2;
        if (drawable != null) {
            drawable.getPadding(this.N);
            final Rect n4 = this.N;
            n3 = max2 + (n4.left + n4.right);
        }
        return n3;
    }
    
    void b() {
        if (Build$VERSION.SDK_INT >= 17) {
            this.L.n(this.getTextDirection(), this.getTextAlignment());
        }
        else {
            this.L.n(-1, -1);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final androidx.appcompat.widget.f g = this.G;
        if (g != null) {
            g.b();
        }
    }
    
    public int getDropDownHorizontalOffset() {
        final g l = this.L;
        if (l != null) {
            return l.d();
        }
        if (Build$VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }
    
    public int getDropDownVerticalOffset() {
        final g l = this.L;
        if (l != null) {
            return l.o();
        }
        if (Build$VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }
    
    public int getDropDownWidth() {
        if (this.L != null) {
            return this.M;
        }
        if (Build$VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }
    
    @b1
    final g getInternalPopup() {
        return this.L;
    }
    
    public Drawable getPopupBackground() {
        final g l = this.L;
        if (l != null) {
            return l.i();
        }
        if (Build$VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }
    
    public Context getPopupContext() {
        return this.H;
    }
    
    public CharSequence getPrompt() {
        final g l = this.L;
        CharSequence charSequence;
        if (l != null) {
            charSequence = l.g();
        }
        else {
            charSequence = super.getPrompt();
        }
        return charSequence;
    }
    
    @k0
    @t0({ t0.a.I })
    public ColorStateList getSupportBackgroundTintList() {
        final androidx.appcompat.widget.f g = this.G;
        ColorStateList c;
        if (g != null) {
            c = g.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    @k0
    @t0({ t0.a.I })
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final androidx.appcompat.widget.f g = this.G;
        PorterDuff$Mode d;
        if (g != null) {
            d = g.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final g l = this.L;
        if (l != null && l.c()) {
            this.L.dismiss();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.L != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final f f = (f)parcelable;
        super.onRestoreInstanceState(f.getSuperState());
        if (f.G) {
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (!u.this.getInternalPopup().c()) {
                            u.this.b();
                        }
                        final ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            if (Build$VERSION.SDK_INT >= 16) {
                                viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                            }
                            else {
                                viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                            }
                        }
                    }
                });
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final f f = new f(super.onSaveInstanceState());
        final g l = this.L;
        f.G = (l != null && l.c());
        return (Parcelable)f;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final e0 i = this.I;
        return (i != null && i.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public boolean performClick() {
        final g l = this.L;
        if (l != null) {
            if (!l.c()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }
    
    public void setAdapter(final SpinnerAdapter spinnerAdapter) {
        if (!this.K) {
            this.J = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.L != null) {
            Context context;
            if ((context = this.H) == null) {
                context = this.getContext();
            }
            this.L.q((ListAdapter)new d(spinnerAdapter, context.getTheme()));
        }
    }
    
    public void setBackgroundDrawable(@k0 final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final androidx.appcompat.widget.f g = this.G;
        if (g != null) {
            g.f(backgroundDrawable);
        }
    }
    
    public void setBackgroundResource(@s final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final androidx.appcompat.widget.f g = this.G;
        if (g != null) {
            g.g(backgroundResource);
        }
    }
    
    public void setDropDownHorizontalOffset(final int dropDownHorizontalOffset) {
        final g l = this.L;
        if (l != null) {
            l.m(dropDownHorizontalOffset);
            this.L.f(dropDownHorizontalOffset);
        }
        else if (Build$VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(dropDownHorizontalOffset);
        }
    }
    
    public void setDropDownVerticalOffset(final int dropDownVerticalOffset) {
        final g l = this.L;
        if (l != null) {
            l.k(dropDownVerticalOffset);
        }
        else if (Build$VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(dropDownVerticalOffset);
        }
    }
    
    public void setDropDownWidth(final int n) {
        if (this.L != null) {
            this.M = n;
        }
        else if (Build$VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(n);
        }
    }
    
    public void setPopupBackgroundDrawable(final Drawable popupBackgroundDrawable) {
        final g l = this.L;
        if (l != null) {
            l.b(popupBackgroundDrawable);
        }
        else if (Build$VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(popupBackgroundDrawable);
        }
    }
    
    public void setPopupBackgroundResource(@s final int n) {
        this.setPopupBackgroundDrawable(androidx.appcompat.content.res.a.d(this.getPopupContext(), n));
    }
    
    public void setPrompt(final CharSequence prompt) {
        final g l = this.L;
        if (l != null) {
            l.j(prompt);
        }
        else {
            super.setPrompt(prompt);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintList(@k0 final ColorStateList list) {
        final androidx.appcompat.widget.f g = this.G;
        if (g != null) {
            g.i(list);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        final androidx.appcompat.widget.f g = this.G;
        if (g != null) {
            g.j(porterDuff$Mode);
        }
    }
    
    @b1
    class c implements g, DialogInterface$OnClickListener
    {
        @b1
        androidx.appcompat.app.d G;
        private ListAdapter H;
        private CharSequence I;
        
        @Override
        public void b(final Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
        
        @Override
        public boolean c() {
            final androidx.appcompat.app.d g = this.G;
            return g != null && g.isShowing();
        }
        
        @Override
        public int d() {
            return 0;
        }
        
        @Override
        public void dismiss() {
            final androidx.appcompat.app.d g = this.G;
            if (g != null) {
                g.dismiss();
                this.G = null;
            }
        }
        
        @Override
        public void f(final int n) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public CharSequence g() {
            return this.I;
        }
        
        @Override
        public Drawable i() {
            return null;
        }
        
        @Override
        public void j(final CharSequence i) {
            this.I = i;
        }
        
        @Override
        public void k(final int n) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public void m(final int n) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public void n(final int textDirection, final int textAlignment) {
            if (this.H == null) {
                return;
            }
            final androidx.appcompat.app.d.a a = new androidx.appcompat.app.d.a(u.this.getPopupContext());
            final CharSequence i = this.I;
            if (i != null) {
                a.K(i);
            }
            final androidx.appcompat.app.d a2 = a.H(this.H, u.this.getSelectedItemPosition(), (DialogInterface$OnClickListener)this).a();
            this.G = a2;
            final ListView g = a2.g();
            if (Build$VERSION.SDK_INT >= 17) {
                g.setTextDirection(textDirection);
                g.setTextAlignment(textAlignment);
            }
            this.G.show();
        }
        
        @Override
        public int o() {
            return 0;
        }
        
        public void onClick(final DialogInterface dialogInterface, final int selection) {
            u.this.setSelection(selection);
            if (u.this.getOnItemClickListener() != null) {
                u.this.performItemClick((View)null, selection, this.H.getItemId(selection));
            }
            this.dismiss();
        }
        
        @Override
        public int p() {
            return 0;
        }
        
        @Override
        public void q(final ListAdapter h) {
            this.H = h;
        }
    }
    
    private static class d implements ListAdapter, SpinnerAdapter
    {
        private SpinnerAdapter G;
        private ListAdapter H;
        
        public d(@k0 final SpinnerAdapter g, @k0 final Resources$Theme resources$Theme) {
            this.G = g;
            if (g instanceof ListAdapter) {
                this.H = (ListAdapter)g;
            }
            if (resources$Theme != null) {
                if (Build$VERSION.SDK_INT >= 23 && g instanceof ThemedSpinnerAdapter) {
                    final ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter)g;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != resources$Theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(resources$Theme);
                    }
                }
                else if (g instanceof q0) {
                    final q0 q0 = (q0)g;
                    if (q0.getDropDownViewTheme() == null) {
                        q0.setDropDownViewTheme(resources$Theme);
                    }
                }
            }
        }
        
        public boolean areAllItemsEnabled() {
            final ListAdapter h = this.H;
            return h == null || h.areAllItemsEnabled();
        }
        
        public int getCount() {
            final SpinnerAdapter g = this.G;
            int count;
            if (g == null) {
                count = 0;
            }
            else {
                count = g.getCount();
            }
            return count;
        }
        
        public View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
            final SpinnerAdapter g = this.G;
            if (g == null) {
                dropDownView = null;
            }
            else {
                dropDownView = g.getDropDownView(n, dropDownView, viewGroup);
            }
            return dropDownView;
        }
        
        public Object getItem(final int n) {
            final SpinnerAdapter g = this.G;
            Object item;
            if (g == null) {
                item = null;
            }
            else {
                item = g.getItem(n);
            }
            return item;
        }
        
        public long getItemId(final int n) {
            final SpinnerAdapter g = this.G;
            long itemId;
            if (g == null) {
                itemId = -1L;
            }
            else {
                itemId = g.getItemId(n);
            }
            return itemId;
        }
        
        public int getItemViewType(final int n) {
            return 0;
        }
        
        public View getView(final int n, final View view, final ViewGroup viewGroup) {
            return this.getDropDownView(n, view, viewGroup);
        }
        
        public int getViewTypeCount() {
            return 1;
        }
        
        public boolean hasStableIds() {
            final SpinnerAdapter g = this.G;
            return g != null && g.hasStableIds();
        }
        
        public boolean isEmpty() {
            return this.getCount() == 0;
        }
        
        public boolean isEnabled(final int n) {
            final ListAdapter h = this.H;
            return h == null || h.isEnabled(n);
        }
        
        public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter g = this.G;
            if (g != null) {
                g.registerDataSetObserver(dataSetObserver);
            }
        }
        
        public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter g = this.G;
            if (g != null) {
                g.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
    
    @b1
    class e extends f0 implements u.g
    {
        ListAdapter A0;
        private final Rect B0;
        private int C0;
        final /* synthetic */ u D0;
        private CharSequence z0;
        
        public e(final Context context, final AttributeSet set, final int n) {
            super(context, set, n);
            this.B0 = new Rect();
            this.S((View)u.this);
            this.d0(true);
            this.j0(0);
            this.f0((AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
                public void onItemClick(final AdapterView<?> adapterView, final View view, final int selection, final long n) {
                    u.this.setSelection(selection);
                    if (u.this.getOnItemClickListener() != null) {
                        final e h = e.this;
                        h.D0.performItemClick(view, selection, h.A0.getItemId(selection));
                    }
                    e.this.dismiss();
                }
            });
        }
        
        @Override
        public CharSequence g() {
            return this.z0;
        }
        
        @Override
        public void j(final CharSequence z0) {
            this.z0 = z0;
        }
        
        @Override
        public void m(final int c0) {
            this.C0 = c0;
        }
        
        @Override
        public void n(final int textDirection, final int textAlignment) {
            final boolean c = this.c();
            this.q0();
            this.a0(2);
            super.a();
            final ListView l = this.l();
            l.setChoiceMode(1);
            if (Build$VERSION.SDK_INT >= 17) {
                l.setTextDirection(textDirection);
                l.setTextAlignment(textAlignment);
            }
            this.l0(u.this.getSelectedItemPosition());
            if (c) {
                return;
            }
            final ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        final e g = e.this;
                        if (!g.r0((View)g.D0)) {
                            e.this.dismiss();
                        }
                        else {
                            e.this.q0();
                            androidx.appcompat.widget.f0.this.a();
                        }
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)viewTreeObserver$OnGlobalLayoutListener);
                this.e0((PopupWindow$OnDismissListener)new PopupWindow$OnDismissListener() {
                    public void onDismiss() {
                        final ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
                        }
                    }
                });
            }
        }
        
        @Override
        public int p() {
            return this.C0;
        }
        
        @Override
        public void q(final ListAdapter a0) {
            super.q(a0);
            this.A0 = a0;
        }
        
        void q0() {
            final Drawable i = this.i();
            int right = 0;
            if (i != null) {
                i.getPadding(u.this.N);
                if (a1.b((View)u.this)) {
                    right = u.this.N.right;
                }
                else {
                    right = -u.this.N.left;
                }
            }
            else {
                final Rect n = u.this.N;
                n.right = 0;
                n.left = 0;
            }
            final int paddingLeft = u.this.getPaddingLeft();
            final int paddingRight = u.this.getPaddingRight();
            final int width = u.this.getWidth();
            final u d0 = u.this;
            final int m = d0.M;
            Label_0243: {
                int max;
                if (m == -2) {
                    final int a = d0.a((SpinnerAdapter)this.A0, this.i());
                    final int widthPixels = u.this.getContext().getResources().getDisplayMetrics().widthPixels;
                    final Rect n2 = u.this.N;
                    final int n3 = widthPixels - n2.left - n2.right;
                    int a2;
                    if ((a2 = a) > n3) {
                        a2 = n3;
                    }
                    max = Math.max(a2, width - paddingLeft - paddingRight);
                }
                else {
                    if (m != -1) {
                        this.U(m);
                        break Label_0243;
                    }
                    max = width - paddingLeft - paddingRight;
                }
                this.U(max);
            }
            int n4;
            if (a1.b((View)u.this)) {
                n4 = right + (width - paddingRight - this.H() - this.p());
            }
            else {
                n4 = right + (paddingLeft + this.p());
            }
            this.f(n4);
        }
        
        boolean r0(final View view) {
            return androidx.core.view.j0.N0(view) && view.getGlobalVisibleRect(this.B0);
        }
    }
    
    static class f extends View$BaseSavedState
    {
        public static final Parcelable$Creator<f> CREATOR;
        boolean G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<f>() {
                public f a(final Parcel parcel) {
                    return new f(parcel);
                }
                
                public f[] b(final int n) {
                    return new f[n];
                }
            };
        }
        
        f(final Parcel parcel) {
            super(parcel);
            this.G = (parcel.readByte() != 0);
        }
        
        f(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeByte((byte)(byte)(this.G ? 1 : 0));
        }
    }
    
    @b1
    interface g
    {
        void b(final Drawable p0);
        
        boolean c();
        
        int d();
        
        void dismiss();
        
        void f(final int p0);
        
        CharSequence g();
        
        Drawable i();
        
        void j(final CharSequence p0);
        
        void k(final int p0);
        
        void m(final int p0);
        
        void n(final int p0, final int p1);
        
        int o();
        
        int p();
        
        void q(final ListAdapter p0);
    }
}
