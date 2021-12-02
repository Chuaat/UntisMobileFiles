// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.b1;
import java.util.Collections;
import androidx.annotation.k0;
import java.util.Set;
import java.util.Arrays;
import androidx.annotation.t0;
import java.util.Iterator;
import java.io.IOException;
import android.util.Log;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import androidx.room.f3;
import java.util.HashMap;
import androidx.annotation.j0;
import java.util.Map;
import android.annotation.SuppressLint;

public final class f
{
    private static final String b;
    public static final f c;
    @SuppressLint({ "MinMaxConstant" })
    public static final int d = 10240;
    Map<String, Object> a;
    
    static {
        b = q.f("Data");
        c = new a().a();
    }
    
    f() {
    }
    
    public f(@j0 final f f) {
        this.a = new HashMap<String, Object>(f.a);
    }
    
    f(@j0 final Map<String, ?> m) {
        this.a = new HashMap<String, Object>(m);
    }
    
    @j0
    static Boolean[] a(@j0 final boolean[] array) {
        final Boolean[] array2 = new Boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    @j0
    static Byte[] b(@j0 final byte[] array) {
        final Byte[] array2 = new Byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    @j0
    static Double[] c(@j0 final double[] array) {
        final Double[] array2 = new Double[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    @j0
    static Float[] d(@j0 final float[] array) {
        final Float[] array2 = new Float[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    @j0
    static Integer[] e(@j0 final int[] array) {
        final Integer[] array2 = new Integer[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    @j0
    static Long[] f(@j0 final long[] array) {
        final Long[] array2 = new Long[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    @j0
    @f3
    public static f g(@j0 final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: sipush          10240
        //     5: if_icmpgt       226
        //     8: new             Ljava/util/HashMap;
        //    11: dup            
        //    12: invokespecial   java/util/HashMap.<init>:()V
        //    15: astore_1       
        //    16: new             Ljava/io/ByteArrayInputStream;
        //    19: dup            
        //    20: aload_0        
        //    21: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    24: astore_2       
        //    25: new             Ljava/io/ObjectInputStream;
        //    28: astore_3       
        //    29: aload_3        
        //    30: aload_2        
        //    31: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    34: aload_3        
        //    35: astore_0       
        //    36: aload_3        
        //    37: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    40: istore          4
        //    42: iload           4
        //    44: ifle            70
        //    47: aload_3        
        //    48: astore_0       
        //    49: aload_1        
        //    50: aload_3        
        //    51: invokevirtual   java/io/ObjectInputStream.readUTF:()Ljava/lang/String;
        //    54: aload_3        
        //    55: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    58: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    63: pop            
        //    64: iinc            4, -1
        //    67: goto            42
        //    70: aload_3        
        //    71: invokevirtual   java/io/ObjectInputStream.close:()V
        //    74: goto            88
        //    77: astore_0       
        //    78: getstatic       androidx/work/f.b:Ljava/lang/String;
        //    81: ldc             "Error in Data#fromByteArray: "
        //    83: aload_0        
        //    84: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    87: pop            
        //    88: aload_2        
        //    89: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //    92: goto            174
        //    95: astore          5
        //    97: goto            121
        //   100: astore          5
        //   102: goto            121
        //   105: astore_3       
        //   106: aconst_null    
        //   107: astore_0       
        //   108: goto            184
        //   111: astore_0       
        //   112: goto            116
        //   115: astore_0       
        //   116: aconst_null    
        //   117: astore_3       
        //   118: aload_0        
        //   119: astore          5
        //   121: aload_3        
        //   122: astore_0       
        //   123: getstatic       androidx/work/f.b:Ljava/lang/String;
        //   126: ldc             "Error in Data#fromByteArray: "
        //   128: aload           5
        //   130: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   133: pop            
        //   134: aload_3        
        //   135: ifnull          156
        //   138: aload_3        
        //   139: invokevirtual   java/io/ObjectInputStream.close:()V
        //   142: goto            156
        //   145: astore_0       
        //   146: getstatic       androidx/work/f.b:Ljava/lang/String;
        //   149: ldc             "Error in Data#fromByteArray: "
        //   151: aload_0        
        //   152: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   155: pop            
        //   156: aload_2        
        //   157: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   160: goto            174
        //   163: astore_0       
        //   164: getstatic       androidx/work/f.b:Ljava/lang/String;
        //   167: ldc             "Error in Data#fromByteArray: "
        //   169: aload_0        
        //   170: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   173: pop            
        //   174: new             Landroidx/work/f;
        //   177: dup            
        //   178: aload_1        
        //   179: invokespecial   androidx/work/f.<init>:(Ljava/util/Map;)V
        //   182: areturn        
        //   183: astore_3       
        //   184: aload_0        
        //   185: ifnull          206
        //   188: aload_0        
        //   189: invokevirtual   java/io/ObjectInputStream.close:()V
        //   192: goto            206
        //   195: astore_0       
        //   196: getstatic       androidx/work/f.b:Ljava/lang/String;
        //   199: ldc             "Error in Data#fromByteArray: "
        //   201: aload_0        
        //   202: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   205: pop            
        //   206: aload_2        
        //   207: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   210: goto            224
        //   213: astore_0       
        //   214: getstatic       androidx/work/f.b:Ljava/lang/String;
        //   217: ldc             "Error in Data#fromByteArray: "
        //   219: aload_0        
        //   220: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   223: pop            
        //   224: aload_3        
        //   225: athrow         
        //   226: new             Ljava/lang/IllegalStateException;
        //   229: dup            
        //   230: ldc             "Data cannot occupy more than 10240 bytes when serialized"
        //   232: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   235: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  25     34     115    116    Ljava/io/IOException;
        //  25     34     111    115    Ljava/lang/ClassNotFoundException;
        //  25     34     105    111    Any
        //  36     42     100    105    Ljava/io/IOException;
        //  36     42     95     100    Ljava/lang/ClassNotFoundException;
        //  36     42     183    184    Any
        //  49     64     100    105    Ljava/io/IOException;
        //  49     64     95     100    Ljava/lang/ClassNotFoundException;
        //  49     64     183    184    Any
        //  70     74     77     88     Ljava/io/IOException;
        //  88     92     163    174    Ljava/io/IOException;
        //  123    134    183    184    Any
        //  138    142    145    156    Ljava/io/IOException;
        //  156    160    163    174    Ljava/io/IOException;
        //  188    192    195    206    Ljava/io/IOException;
        //  206    210    213    224    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    @j0
    @t0({ t0.a.H })
    @f3
    public static byte[] z(@j0 final f f) {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final ObjectOutputStream objectOutputStream = null;
        Object o2;
        final Object o = o2 = null;
        ObjectOutputStream objectOutputStream2 = null;
        ObjectOutputStream objectOutputStream3;
        try {
            try {
                o2 = o;
                objectOutputStream2 = new ObjectOutputStream(out);
                try {
                    objectOutputStream2.writeInt(f.x());
                    final Iterator<Map.Entry<String, Object>> iterator = f.a.entrySet().iterator();
                    while (iterator.hasNext()) {
                        o2 = iterator.next();
                        objectOutputStream2.writeUTF(((Map.Entry<String, V>)o2).getKey());
                        objectOutputStream2.writeObject(((Map.Entry)o2).getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    }
                    catch (IOException ex) {
                        Log.e(f.b, "Error in Data#toByteArray: ", (Throwable)ex);
                    }
                    try {
                        out.close();
                    }
                    catch (IOException ex2) {
                        Log.e(f.b, "Error in Data#toByteArray: ", (Throwable)ex2);
                    }
                    if (out.size() <= 10240) {
                        return out.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                catch (IOException o2) {}
                finally {
                    o2 = objectOutputStream2;
                }
            }
            finally {}
        }
        catch (IOException objectOutputStream2) {
            objectOutputStream3 = objectOutputStream;
        }
        Log.e(f.b, "Error in Data#toByteArray: ", (Throwable)objectOutputStream2);
        final byte[] byteArray = out.toByteArray();
        if (objectOutputStream3 != null) {
            try {
                objectOutputStream3.close();
            }
            catch (IOException ex3) {
                Log.e(f.b, "Error in Data#toByteArray: ", (Throwable)ex3);
            }
        }
        try {
            out.close();
        }
        catch (IOException ex4) {
            Log.e(f.b, "Error in Data#toByteArray: ", (Throwable)ex4);
        }
        return byteArray;
        if (o2 != null) {
            try {
                ((ObjectOutputStream)o2).close();
            }
            catch (IOException ex5) {
                Log.e(f.b, "Error in Data#toByteArray: ", (Throwable)ex5);
            }
        }
        try {
            out.close();
        }
        catch (IOException ex6) {
            Log.e(f.b, "Error in Data#toByteArray: ", (Throwable)ex6);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || f.class != o.getClass()) {
            return false;
        }
        final f f = (f)o;
        final Set<String> keySet = this.a.keySet();
        if (!keySet.equals(f.a.keySet())) {
            return false;
        }
        for (final String s : keySet) {
            final Object value = this.a.get(s);
            final Object value2 = f.a.get(s);
            boolean b;
            if (value != null && value2 != null) {
                if (value instanceof Object[] && value2 instanceof Object[]) {
                    b = Arrays.deepEquals((Object[])value, (Object[])value2);
                }
                else {
                    b = value.equals(value2);
                }
            }
            else {
                b = (value == value2);
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    public boolean h(@j0 final String s, final boolean b) {
        final Boolean value = this.a.get(s);
        if (value instanceof Boolean) {
            return value;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31;
    }
    
    @k0
    public boolean[] i(@j0 final String s) {
        final Boolean[] value = this.a.get(s);
        if (value instanceof Boolean[]) {
            final Boolean[] array = value;
            final boolean[] array2 = new boolean[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    public byte j(@j0 final String s, final byte b) {
        final Byte value = this.a.get(s);
        if (value instanceof Byte) {
            return value;
        }
        return b;
    }
    
    @k0
    public byte[] k(@j0 final String s) {
        final Byte[] value = this.a.get(s);
        if (value instanceof Byte[]) {
            final Byte[] array = value;
            final byte[] array2 = new byte[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    public double l(@j0 final String s, final double n) {
        final Double value = this.a.get(s);
        if (value instanceof Double) {
            return value;
        }
        return n;
    }
    
    @k0
    public double[] m(@j0 final String s) {
        final Double[] value = this.a.get(s);
        if (value instanceof Double[]) {
            final Double[] array = value;
            final double[] array2 = new double[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    public float n(@j0 final String s, final float n) {
        final Float value = this.a.get(s);
        if (value instanceof Float) {
            return value;
        }
        return n;
    }
    
    @k0
    public float[] o(@j0 final String s) {
        final Float[] value = this.a.get(s);
        if (value instanceof Float[]) {
            final Float[] array = value;
            final float[] array2 = new float[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    public int p(@j0 final String s, final int n) {
        final Integer value = this.a.get(s);
        if (value instanceof Integer) {
            return value;
        }
        return n;
    }
    
    @k0
    public int[] q(@j0 final String s) {
        final Integer[] value = this.a.get(s);
        if (value instanceof Integer[]) {
            final Integer[] array = value;
            final int[] array2 = new int[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    @j0
    public Map<String, Object> r() {
        return Collections.unmodifiableMap((Map<? extends String, ?>)this.a);
    }
    
    public long s(@j0 final String s, final long n) {
        final Long value = this.a.get(s);
        if (value instanceof Long) {
            return value;
        }
        return n;
    }
    
    @k0
    public long[] t(@j0 final String s) {
        final Long[] value = this.a.get(s);
        if (value instanceof Long[]) {
            final Long[] array = value;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (final String str : this.a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                final Object value = this.a.get(str);
                if (value instanceof Object[]) {
                    sb.append(Arrays.toString((Object[])value));
                }
                else {
                    sb.append(value);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
    
    @k0
    public String u(@j0 final String s) {
        final String value = this.a.get(s);
        if (value instanceof String) {
            return value;
        }
        return null;
    }
    
    @k0
    public String[] v(@j0 final String s) {
        final String[] value = this.a.get(s);
        if (value instanceof String[]) {
            return value;
        }
        return null;
    }
    
    public <T> boolean w(@j0 final String s, @j0 final Class<T> clazz) {
        final Object value = this.a.get(s);
        return value != null && clazz.isAssignableFrom(value.getClass());
    }
    
    @b1
    @t0({ t0.a.H })
    public int x() {
        return this.a.size();
    }
    
    @j0
    public byte[] y() {
        return z(this);
    }
    
    public static final class a
    {
        private Map<String, Object> a;
        
        public a() {
            this.a = new HashMap<String, Object>();
        }
        
        @j0
        public f a() {
            final f f = new f(this.a);
            androidx.work.f.z(f);
            return f;
        }
        
        @j0
        @t0({ t0.a.H })
        public a b(@j0 final String s, @k0 final Object o) {
            if (o == null) {
                this.a.put(s, null);
            }
            else {
                final Class<?> class1 = o.getClass();
                if (class1 != Boolean.class && class1 != Byte.class && class1 != Integer.class && class1 != Long.class && class1 != Float.class && class1 != Double.class && class1 != String.class && class1 != Boolean[].class && class1 != Byte[].class && class1 != Integer[].class && class1 != Long[].class && class1 != Float[].class && class1 != Double[].class && class1 != String[].class) {
                    if (class1 == boolean[].class) {
                        this.a.put(s, f.a((boolean[])o));
                    }
                    else if (class1 == byte[].class) {
                        this.a.put(s, f.b((byte[])o));
                    }
                    else if (class1 == int[].class) {
                        this.a.put(s, f.e((int[])o));
                    }
                    else if (class1 == long[].class) {
                        this.a.put(s, f.f((long[])o));
                    }
                    else if (class1 == float[].class) {
                        this.a.put(s, f.d((float[])o));
                    }
                    else {
                        if (class1 != double[].class) {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", s, class1));
                        }
                        this.a.put(s, f.c((double[])o));
                    }
                }
                else {
                    this.a.put(s, o);
                }
            }
            return this;
        }
        
        @j0
        public a c(@j0 final f f) {
            this.d(f.a);
            return this;
        }
        
        @j0
        public a d(@j0 final Map<String, Object> map) {
            for (final Map.Entry<String, Object> entry : map.entrySet()) {
                this.b(entry.getKey(), entry.getValue());
            }
            return this;
        }
        
        @j0
        public a e(@j0 final String s, final boolean b) {
            this.a.put(s, b);
            return this;
        }
        
        @j0
        public a f(@j0 final String s, @j0 final boolean[] array) {
            this.a.put(s, f.a(array));
            return this;
        }
        
        @j0
        public a g(@j0 final String s, final byte b) {
            this.a.put(s, b);
            return this;
        }
        
        @j0
        public a h(@j0 final String s, @j0 final byte[] array) {
            this.a.put(s, f.b(array));
            return this;
        }
        
        @j0
        public a i(@j0 final String s, final double d) {
            this.a.put(s, d);
            return this;
        }
        
        @j0
        public a j(@j0 final String s, @j0 final double[] array) {
            this.a.put(s, f.c(array));
            return this;
        }
        
        @j0
        public a k(@j0 final String s, final float f) {
            this.a.put(s, f);
            return this;
        }
        
        @j0
        public a l(@j0 final String s, @j0 final float[] array) {
            this.a.put(s, f.d(array));
            return this;
        }
        
        @j0
        public a m(@j0 final String s, final int i) {
            this.a.put(s, i);
            return this;
        }
        
        @j0
        public a n(@j0 final String s, @j0 final int[] array) {
            this.a.put(s, f.e(array));
            return this;
        }
        
        @j0
        public a o(@j0 final String s, final long l) {
            this.a.put(s, l);
            return this;
        }
        
        @j0
        public a p(@j0 final String s, @j0 final long[] array) {
            this.a.put(s, f.f(array));
            return this;
        }
        
        @j0
        public a q(@j0 final String s, @k0 final String s2) {
            this.a.put(s, s2);
            return this;
        }
        
        @j0
        public a r(@j0 final String s, @j0 final String[] array) {
            this.a.put(s, array);
            return this;
        }
    }
}
