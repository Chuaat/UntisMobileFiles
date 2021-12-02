// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import java.math.BigDecimal;
import android.content.pm.ActivityInfo;
import android.content.ComponentName;
import java.util.Collections;
import java.util.Collection;
import android.os.AsyncTask;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import android.content.Intent;
import android.content.Context;
import java.util.List;
import java.util.Map;
import android.database.DataSetObservable;

class d extends DataSetObservable
{
    private static final Object A;
    private static final Map<String, d> B;
    static final boolean n = false;
    static final String o;
    static final String p = "historical-records";
    static final String q = "historical-record";
    static final String r = "activity";
    static final String s = "time";
    static final String t = "weight";
    public static final String u = "activity_choser_model_history.xml";
    public static final int v = 50;
    private static final int w = 5;
    private static final float x = 1.0f;
    private static final String y = ".xml";
    private static final int z = -1;
    private final Object a;
    private final List<b> b;
    private final List<e> c;
    final Context d;
    final String e;
    private Intent f;
    private c g;
    private int h;
    boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private f m;
    
    static {
        o = d.class.getSimpleName();
        A = new Object();
        B = new HashMap<String, d>();
    }
    
    private d(final Context context, final String s) {
        this.a = new Object();
        this.b = new ArrayList<b>();
        this.c = new ArrayList<e>();
        this.g = (c)new d();
        this.h = 50;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = false;
        this.d = context.getApplicationContext();
        if (!TextUtils.isEmpty((CharSequence)s) && !s.endsWith(".xml")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(".xml");
            this.e = sb.toString();
        }
        else {
            this.e = s;
        }
    }
    
    private boolean a(final e e) {
        final boolean add = this.c.add(e);
        if (add) {
            this.k = true;
            this.n();
            this.m();
            this.v();
            this.notifyChanged();
        }
        return add;
    }
    
    private void c() {
        final boolean l = this.l();
        final boolean o = this.o();
        this.n();
        if (l | o) {
            this.v();
            this.notifyChanged();
        }
    }
    
    public static d d(final Context context, final String s) {
        synchronized (d.A) {
            final Map<String, d> b = d.B;
            d d;
            if ((d = b.get(s)) == null) {
                d = new d(context, s);
                b.put(s, d);
            }
            return d;
        }
    }
    
    private boolean l() {
        final boolean l = this.l;
        int i = 0;
        if (l && this.f != null) {
            this.l = false;
            this.b.clear();
            for (List queryIntentActivities = this.d.getPackageManager().queryIntentActivities(this.f, 0); i < queryIntentActivities.size(); ++i) {
                this.b.add(new b(queryIntentActivities.get(i)));
            }
            return true;
        }
        return false;
    }
    
    private void m() {
        if (!this.j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (!this.k) {
            return;
        }
        this.k = false;
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] { new ArrayList(this.c), this.e });
        }
    }
    
    private void n() {
        final int n = this.c.size() - this.h;
        if (n <= 0) {
            return;
        }
        this.k = true;
        for (int i = 0; i < n; ++i) {
            final e e = this.c.remove(0);
        }
    }
    
    private boolean o() {
        if (this.i && this.k && !TextUtils.isEmpty((CharSequence)this.e)) {
            this.i = false;
            this.j = true;
            this.p();
            return true;
        }
        return false;
    }
    
    private void p() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        androidx/appcompat/widget/d.d:Landroid/content/Context;
        //     4: aload_0        
        //     5: getfield        androidx/appcompat/widget/d.e:Ljava/lang/String;
        //     8: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //    11: astore_1       
        //    12: invokestatic    android/util/Xml.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //    15: astore_2       
        //    16: aload_2        
        //    17: aload_1        
        //    18: ldc_w           "UTF-8"
        //    21: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/InputStream;Ljava/lang/String;)V
        //    26: iconst_0       
        //    27: istore_3       
        //    28: iload_3        
        //    29: iconst_1       
        //    30: if_icmpeq       48
        //    33: iload_3        
        //    34: iconst_2       
        //    35: if_icmpeq       48
        //    38: aload_2        
        //    39: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    44: istore_3       
        //    45: goto            28
        //    48: ldc             "historical-records"
        //    50: aload_2        
        //    51: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //    56: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    59: ifeq            206
        //    62: aload_0        
        //    63: getfield        androidx/appcompat/widget/d.c:Ljava/util/List;
        //    66: astore          4
        //    68: aload           4
        //    70: invokeinterface java/util/List.clear:()V
        //    75: aload_2        
        //    76: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    81: istore_3       
        //    82: iload_3        
        //    83: iconst_1       
        //    84: if_icmpne       98
        //    87: aload_1        
        //    88: ifnull          331
        //    91: aload_1        
        //    92: invokevirtual   java/io/FileInputStream.close:()V
        //    95: goto            331
        //    98: iload_3        
        //    99: iconst_3       
        //   100: if_icmpeq       75
        //   103: iload_3        
        //   104: iconst_4       
        //   105: if_icmpne       111
        //   108: goto            75
        //   111: ldc             "historical-record"
        //   113: aload_2        
        //   114: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   119: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   122: ifeq            193
        //   125: aload_2        
        //   126: aconst_null    
        //   127: ldc             "activity"
        //   129: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   134: astore          5
        //   136: aload_2        
        //   137: aconst_null    
        //   138: ldc             "time"
        //   140: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   145: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   148: lstore          6
        //   150: aload_2        
        //   151: aconst_null    
        //   152: ldc             "weight"
        //   154: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   159: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   162: fstore          8
        //   164: new             Landroidx/appcompat/widget/d$e;
        //   167: astore          9
        //   169: aload           9
        //   171: aload           5
        //   173: lload           6
        //   175: fload           8
        //   177: invokespecial   androidx/appcompat/widget/d$e.<init>:(Ljava/lang/String;JF)V
        //   180: aload           4
        //   182: aload           9
        //   184: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   189: pop            
        //   190: goto            75
        //   193: new             Lorg/xmlpull/v1/XmlPullParserException;
        //   196: astore_2       
        //   197: aload_2        
        //   198: ldc_w           "Share records file not well-formed."
        //   201: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //   204: aload_2        
        //   205: athrow         
        //   206: new             Lorg/xmlpull/v1/XmlPullParserException;
        //   209: astore_2       
        //   210: aload_2        
        //   211: ldc_w           "Share records file does not start with historical-records tag."
        //   214: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //   217: aload_2        
        //   218: athrow         
        //   219: astore_2       
        //   220: goto            332
        //   223: astore          5
        //   225: getstatic       androidx/appcompat/widget/d.o:Ljava/lang/String;
        //   228: astore_2       
        //   229: new             Ljava/lang/StringBuilder;
        //   232: astore          4
        //   234: aload           4
        //   236: invokespecial   java/lang/StringBuilder.<init>:()V
        //   239: aload           4
        //   241: ldc_w           "Error reading historical recrod file: "
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: pop            
        //   248: aload           4
        //   250: aload_0        
        //   251: getfield        androidx/appcompat/widget/d.e:Ljava/lang/String;
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload_2        
        //   259: aload           4
        //   261: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   264: aload           5
        //   266: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   269: pop            
        //   270: aload_1        
        //   271: ifnull          331
        //   274: goto            91
        //   277: astore_2       
        //   278: getstatic       androidx/appcompat/widget/d.o:Ljava/lang/String;
        //   281: astore          4
        //   283: new             Ljava/lang/StringBuilder;
        //   286: astore          5
        //   288: aload           5
        //   290: invokespecial   java/lang/StringBuilder.<init>:()V
        //   293: aload           5
        //   295: ldc_w           "Error reading historical recrod file: "
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: pop            
        //   302: aload           5
        //   304: aload_0        
        //   305: getfield        androidx/appcompat/widget/d.e:Ljava/lang/String;
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: pop            
        //   312: aload           4
        //   314: aload           5
        //   316: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   319: aload_2        
        //   320: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   323: pop            
        //   324: aload_1        
        //   325: ifnull          331
        //   328: goto            91
        //   331: return         
        //   332: aload_1        
        //   333: ifnull          340
        //   336: aload_1        
        //   337: invokevirtual   java/io/FileInputStream.close:()V
        //   340: aload_2        
        //   341: athrow         
        //   342: astore_1       
        //   343: return         
        //   344: astore_1       
        //   345: goto            331
        //   348: astore_1       
        //   349: goto            340
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  0      12     342    344    Ljava/io/FileNotFoundException;
        //  12     26     277    331    Lorg/xmlpull/v1/XmlPullParserException;
        //  12     26     223    277    Ljava/io/IOException;
        //  12     26     219    342    Any
        //  38     45     277    331    Lorg/xmlpull/v1/XmlPullParserException;
        //  38     45     223    277    Ljava/io/IOException;
        //  38     45     219    342    Any
        //  48     75     277    331    Lorg/xmlpull/v1/XmlPullParserException;
        //  48     75     223    277    Ljava/io/IOException;
        //  48     75     219    342    Any
        //  75     82     277    331    Lorg/xmlpull/v1/XmlPullParserException;
        //  75     82     223    277    Ljava/io/IOException;
        //  75     82     219    342    Any
        //  91     95     344    348    Ljava/io/IOException;
        //  111    190    277    331    Lorg/xmlpull/v1/XmlPullParserException;
        //  111    190    223    277    Ljava/io/IOException;
        //  111    190    219    342    Any
        //  193    206    277    331    Lorg/xmlpull/v1/XmlPullParserException;
        //  193    206    223    277    Ljava/io/IOException;
        //  193    206    219    342    Any
        //  206    219    277    331    Lorg/xmlpull/v1/XmlPullParserException;
        //  206    219    223    277    Ljava/io/IOException;
        //  206    219    219    342    Any
        //  225    270    219    342    Any
        //  278    324    219    342    Any
        //  336    340    348    352    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 165 out of bounds for length 165
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
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
    
    private boolean v() {
        if (this.g != null && this.f != null && !this.b.isEmpty() && !this.c.isEmpty()) {
            this.g.a(this.f, this.b, Collections.unmodifiableList((List<? extends e>)this.c));
            return true;
        }
        return false;
    }
    
    public Intent b(final int n) {
        synchronized (this.a) {
            if (this.f == null) {
                return null;
            }
            this.c();
            final ActivityInfo activityInfo = this.b.get(n).G.activityInfo;
            final ComponentName component = new ComponentName(activityInfo.packageName, activityInfo.name);
            final Intent intent = new Intent(this.f);
            intent.setComponent(component);
            if (this.m != null && this.m.a(this, new Intent(intent))) {
                return null;
            }
            this.a(new e(component, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }
    
    public ResolveInfo e(final int n) {
        synchronized (this.a) {
            this.c();
            return this.b.get(n).G;
        }
    }
    
    public int f() {
        synchronized (this.a) {
            this.c();
            return this.b.size();
        }
    }
    
    public int g(final ResolveInfo resolveInfo) {
        synchronized (this.a) {
            this.c();
            final List<b> b = this.b;
            for (int size = b.size(), i = 0; i < size; ++i) {
                if (b.get(i).G == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }
    
    public ResolveInfo h() {
        synchronized (this.a) {
            this.c();
            if (!this.b.isEmpty()) {
                return this.b.get(0).G;
            }
            return null;
        }
    }
    
    public int i() {
        synchronized (this.a) {
            return this.h;
        }
    }
    
    public int j() {
        synchronized (this.a) {
            this.c();
            return this.c.size();
        }
    }
    
    public Intent k() {
        synchronized (this.a) {
            return this.f;
        }
    }
    
    public void q(final c g) {
        synchronized (this.a) {
            if (this.g == g) {
                return;
            }
            this.g = g;
            if (this.v()) {
                this.notifyChanged();
            }
        }
    }
    
    public void r(final int n) {
        synchronized (this.a) {
            this.c();
            final b b = this.b.get(n);
            final b b2 = this.b.get(0);
            float n2;
            if (b2 != null) {
                n2 = b2.H - b.H + 5.0f;
            }
            else {
                n2 = 1.0f;
            }
            final ActivityInfo activityInfo = b.G.activityInfo;
            this.a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), n2));
        }
    }
    
    public void s(final int h) {
        synchronized (this.a) {
            if (this.h == h) {
                return;
            }
            this.h = h;
            this.n();
            if (this.v()) {
                this.notifyChanged();
            }
        }
    }
    
    public void t(final Intent f) {
        synchronized (this.a) {
            if (this.f == f) {
                return;
            }
            this.f = f;
            this.l = true;
            this.c();
        }
    }
    
    public void u(final f m) {
        synchronized (this.a) {
            this.m = m;
        }
    }
    
    public interface a
    {
        void setActivityChooserModel(final d p0);
    }
    
    public static final class b implements Comparable<b>
    {
        public final ResolveInfo G;
        public float H;
        
        public b(final ResolveInfo g) {
            this.G = g;
        }
        
        public int b(final b b) {
            return Float.floatToIntBits(b.H) - Float.floatToIntBits(this.H);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && b.class == o.getClass() && Float.floatToIntBits(this.H) == Float.floatToIntBits(((b)o).H));
        }
        
        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.H) + 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.G.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal(this.H));
            sb.append("]");
            return sb.toString();
        }
    }
    
    public interface c
    {
        void a(final Intent p0, final List<b> p1, final List<e> p2);
    }
    
    private static final class d implements c
    {
        private static final float b = 0.95f;
        private final Map<ComponentName, b> a;
        
        d() {
            this.a = new HashMap<ComponentName, b>();
        }
        
        @Override
        public void a(final Intent intent, final List<b> list, final List<e> list2) {
            final Map<ComponentName, b> a = this.a;
            a.clear();
            for (int size = list.size(), i = 0; i < size; ++i) {
                final b b = list.get(i);
                b.H = 0.0f;
                final ActivityInfo activityInfo = b.G.activityInfo;
                a.put(new ComponentName(activityInfo.packageName, activityInfo.name), b);
            }
            int j = list2.size() - 1;
            float n = 1.0f;
            while (j >= 0) {
                final e e = list2.get(j);
                final b b2 = a.get(e.a);
                float n2 = n;
                if (b2 != null) {
                    b2.H += e.c * n;
                    n2 = n * 0.95f;
                }
                --j;
                n = n2;
            }
            Collections.sort((List<Comparable>)list);
        }
    }
    
    public static final class e
    {
        public final ComponentName a;
        public final long b;
        public final float c;
        
        public e(final ComponentName a, final long b, final float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public e(final String s, final long n, final float n2) {
            this(ComponentName.unflattenFromString(s), n, n2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (e.class != o.getClass()) {
                return false;
            }
            final e e = (e)o;
            final ComponentName a = this.a;
            if (a == null) {
                if (e.a != null) {
                    return false;
                }
            }
            else if (!a.equals((Object)e.a)) {
                return false;
            }
            return this.b == e.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(e.c);
        }
        
        @Override
        public int hashCode() {
            final ComponentName a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            final long b = this.b;
            return ((hashCode + 31) * 31 + (int)(b ^ b >>> 32)) * 31 + Float.floatToIntBits(this.c);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.a);
            sb.append("; time:");
            sb.append(this.b);
            sb.append("; weight:");
            sb.append(new BigDecimal(this.c));
            sb.append("]");
            return sb.toString();
        }
    }
    
    public interface f
    {
        boolean a(final d p0, final Intent p1);
    }
    
    private final class g extends AsyncTask<Object, Void, Void>
    {
        g() {
        }
        
        public Void a(final Object... p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: iconst_0       
            //     2: aaload         
            //     3: checkcast       Ljava/util/List;
            //     6: astore_2       
            //     7: aload_1        
            //     8: iconst_1       
            //     9: aaload         
            //    10: checkcast       Ljava/lang/String;
            //    13: astore_3       
            //    14: aload_0        
            //    15: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //    18: getfield        androidx/appcompat/widget/d.d:Landroid/content/Context;
            //    21: aload_3        
            //    22: iconst_0       
            //    23: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
            //    26: astore_1       
            //    27: invokestatic    android/util/Xml.newSerializer:()Lorg/xmlpull/v1/XmlSerializer;
            //    30: astore_3       
            //    31: aload_3        
            //    32: aload_1        
            //    33: aconst_null    
            //    34: invokeinterface org/xmlpull/v1/XmlSerializer.setOutput:(Ljava/io/OutputStream;Ljava/lang/String;)V
            //    39: aload_3        
            //    40: ldc             "UTF-8"
            //    42: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
            //    45: invokeinterface org/xmlpull/v1/XmlSerializer.startDocument:(Ljava/lang/String;Ljava/lang/Boolean;)V
            //    50: aload_3        
            //    51: aconst_null    
            //    52: ldc             "historical-records"
            //    54: invokeinterface org/xmlpull/v1/XmlSerializer.startTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
            //    59: pop            
            //    60: aload_2        
            //    61: invokeinterface java/util/List.size:()I
            //    66: istore          4
            //    68: iconst_0       
            //    69: istore          5
            //    71: iload           5
            //    73: iload           4
            //    75: if_icmpge       170
            //    78: aload_2        
            //    79: iconst_0       
            //    80: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
            //    85: checkcast       Landroidx/appcompat/widget/d$e;
            //    88: astore          6
            //    90: aload_3        
            //    91: aconst_null    
            //    92: ldc             "historical-record"
            //    94: invokeinterface org/xmlpull/v1/XmlSerializer.startTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
            //    99: pop            
            //   100: aload_3        
            //   101: aconst_null    
            //   102: ldc             "activity"
            //   104: aload           6
            //   106: getfield        androidx/appcompat/widget/d$e.a:Landroid/content/ComponentName;
            //   109: invokevirtual   android/content/ComponentName.flattenToString:()Ljava/lang/String;
            //   112: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
            //   117: pop            
            //   118: aload_3        
            //   119: aconst_null    
            //   120: ldc             "time"
            //   122: aload           6
            //   124: getfield        androidx/appcompat/widget/d$e.b:J
            //   127: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
            //   130: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
            //   135: pop            
            //   136: aload_3        
            //   137: aconst_null    
            //   138: ldc             "weight"
            //   140: aload           6
            //   142: getfield        androidx/appcompat/widget/d$e.c:F
            //   145: invokestatic    java/lang/String.valueOf:(F)Ljava/lang/String;
            //   148: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
            //   153: pop            
            //   154: aload_3        
            //   155: aconst_null    
            //   156: ldc             "historical-record"
            //   158: invokeinterface org/xmlpull/v1/XmlSerializer.endTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
            //   163: pop            
            //   164: iinc            5, 1
            //   167: goto            71
            //   170: aload_3        
            //   171: aconst_null    
            //   172: ldc             "historical-records"
            //   174: invokeinterface org/xmlpull/v1/XmlSerializer.endTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
            //   179: pop            
            //   180: aload_3        
            //   181: invokeinterface org/xmlpull/v1/XmlSerializer.endDocument:()V
            //   186: aload_0        
            //   187: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   190: iconst_1       
            //   191: putfield        androidx/appcompat/widget/d.i:Z
            //   194: aload_1        
            //   195: ifnull          389
            //   198: aload_1        
            //   199: invokevirtual   java/io/FileOutputStream.close:()V
            //   202: goto            389
            //   205: astore_2       
            //   206: goto            391
            //   209: astore_2       
            //   210: getstatic       androidx/appcompat/widget/d.o:Ljava/lang/String;
            //   213: astore_3       
            //   214: new             Ljava/lang/StringBuilder;
            //   217: astore          6
            //   219: aload           6
            //   221: invokespecial   java/lang/StringBuilder.<init>:()V
            //   224: aload           6
            //   226: ldc             "Error writing historical record file: "
            //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   231: pop            
            //   232: aload           6
            //   234: aload_0        
            //   235: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   238: getfield        androidx/appcompat/widget/d.e:Ljava/lang/String;
            //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   244: pop            
            //   245: aload_3        
            //   246: aload           6
            //   248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   251: aload_2        
            //   252: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   255: pop            
            //   256: aload_0        
            //   257: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   260: iconst_1       
            //   261: putfield        androidx/appcompat/widget/d.i:Z
            //   264: aload_1        
            //   265: ifnull          389
            //   268: goto            198
            //   271: astore          6
            //   273: getstatic       androidx/appcompat/widget/d.o:Ljava/lang/String;
            //   276: astore_3       
            //   277: new             Ljava/lang/StringBuilder;
            //   280: astore_2       
            //   281: aload_2        
            //   282: invokespecial   java/lang/StringBuilder.<init>:()V
            //   285: aload_2        
            //   286: ldc             "Error writing historical record file: "
            //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   291: pop            
            //   292: aload_2        
            //   293: aload_0        
            //   294: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   297: getfield        androidx/appcompat/widget/d.e:Ljava/lang/String;
            //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   303: pop            
            //   304: aload_3        
            //   305: aload_2        
            //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   309: aload           6
            //   311: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   314: pop            
            //   315: aload_0        
            //   316: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   319: iconst_1       
            //   320: putfield        androidx/appcompat/widget/d.i:Z
            //   323: aload_1        
            //   324: ifnull          389
            //   327: goto            198
            //   330: astore_3       
            //   331: getstatic       androidx/appcompat/widget/d.o:Ljava/lang/String;
            //   334: astore          6
            //   336: new             Ljava/lang/StringBuilder;
            //   339: astore_2       
            //   340: aload_2        
            //   341: invokespecial   java/lang/StringBuilder.<init>:()V
            //   344: aload_2        
            //   345: ldc             "Error writing historical record file: "
            //   347: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   350: pop            
            //   351: aload_2        
            //   352: aload_0        
            //   353: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   356: getfield        androidx/appcompat/widget/d.e:Ljava/lang/String;
            //   359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   362: pop            
            //   363: aload           6
            //   365: aload_2        
            //   366: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   369: aload_3        
            //   370: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   373: pop            
            //   374: aload_0        
            //   375: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   378: iconst_1       
            //   379: putfield        androidx/appcompat/widget/d.i:Z
            //   382: aload_1        
            //   383: ifnull          389
            //   386: goto            198
            //   389: aconst_null    
            //   390: areturn        
            //   391: aload_0        
            //   392: getfield        androidx/appcompat/widget/d$g.a:Landroidx/appcompat/widget/d;
            //   395: iconst_1       
            //   396: putfield        androidx/appcompat/widget/d.i:Z
            //   399: aload_1        
            //   400: ifnull          407
            //   403: aload_1        
            //   404: invokevirtual   java/io/FileOutputStream.close:()V
            //   407: aload_2        
            //   408: athrow         
            //   409: astore_1       
            //   410: getstatic       androidx/appcompat/widget/d.o:Ljava/lang/String;
            //   413: astore          6
            //   415: new             Ljava/lang/StringBuilder;
            //   418: dup            
            //   419: invokespecial   java/lang/StringBuilder.<init>:()V
            //   422: astore_2       
            //   423: aload_2        
            //   424: ldc             "Error writing historical record file: "
            //   426: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   429: pop            
            //   430: aload_2        
            //   431: aload_3        
            //   432: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   435: pop            
            //   436: aload           6
            //   438: aload_2        
            //   439: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   442: aload_1        
            //   443: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   446: pop            
            //   447: aconst_null    
            //   448: areturn        
            //   449: astore_1       
            //   450: goto            389
            //   453: astore_1       
            //   454: goto            407
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                
            //  -----  -----  -----  -----  ------------------------------------
            //  14     27     409    449    Ljava/io/FileNotFoundException;
            //  31     68     330    389    Ljava/lang/IllegalArgumentException;
            //  31     68     271    330    Ljava/lang/IllegalStateException;
            //  31     68     209    271    Ljava/io/IOException;
            //  31     68     205    409    Any
            //  78     164    330    389    Ljava/lang/IllegalArgumentException;
            //  78     164    271    330    Ljava/lang/IllegalStateException;
            //  78     164    209    271    Ljava/io/IOException;
            //  78     164    205    409    Any
            //  170    186    330    389    Ljava/lang/IllegalArgumentException;
            //  170    186    271    330    Ljava/lang/IllegalStateException;
            //  170    186    209    271    Ljava/io/IOException;
            //  170    186    205    409    Any
            //  198    202    449    453    Ljava/io/IOException;
            //  210    256    205    409    Any
            //  273    315    205    409    Any
            //  331    374    205    409    Any
            //  403    407    453    457    Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index 228 out of bounds for length 228
            //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
            //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
    }
}
