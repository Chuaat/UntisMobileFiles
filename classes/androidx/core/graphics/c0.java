// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.fonts.Font;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.Font$Builder;
import java.io.InputStream;
import androidx.annotation.j0;
import androidx.core.provider.f;
import android.os.CancellationSignal;
import androidx.annotation.k0;
import android.graphics.Typeface;
import android.content.res.Resources;
import androidx.core.content.res.d;
import android.content.Context;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(29)
@t0({ t0.a.H })
public class c0 extends d0
{
    @k0
    @Override
    public Typeface b(final Context p0, final d.c p1, final Resources p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          5
        //     3: aload_2        
        //     4: invokevirtual   androidx/core/content/res/d$c.a:()[Landroidx/core/content/res/d$d;
        //     7: astore          6
        //     9: aload           6
        //    11: arraylength    
        //    12: istore          7
        //    14: iconst_0       
        //    15: istore          8
        //    17: aconst_null    
        //    18: astore_1       
        //    19: iconst_0       
        //    20: istore          9
        //    22: iconst_1       
        //    23: istore          10
        //    25: iload           9
        //    27: iload           7
        //    29: if_icmpge       135
        //    32: aload           6
        //    34: iload           9
        //    36: aaload         
        //    37: astore_2       
        //    38: new             Landroid/graphics/fonts/Font$Builder;
        //    41: astore          11
        //    43: aload           11
        //    45: aload_3        
        //    46: aload_2        
        //    47: invokevirtual   androidx/core/content/res/d$d.b:()I
        //    50: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/content/res/Resources;I)V
        //    53: aload           11
        //    55: aload_2        
        //    56: invokevirtual   androidx/core/content/res/d$d.e:()I
        //    59: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //    62: astore          11
        //    64: aload_2        
        //    65: invokevirtual   androidx/core/content/res/d$d.f:()Z
        //    68: ifeq            74
        //    71: goto            77
        //    74: iconst_0       
        //    75: istore          10
        //    77: aload           11
        //    79: iload           10
        //    81: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //    84: aload_2        
        //    85: invokevirtual   androidx/core/content/res/d$d.c:()I
        //    88: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //    91: aload_2        
        //    92: invokevirtual   androidx/core/content/res/d$d.d:()Ljava/lang/String;
        //    95: invokevirtual   android/graphics/fonts/Font$Builder.setFontVariationSettings:(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;
        //    98: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //   101: astore          11
        //   103: aload_1        
        //   104: ifnonnull       122
        //   107: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   110: astore_2       
        //   111: aload_2        
        //   112: aload           11
        //   114: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   117: aload_2        
        //   118: astore_1       
        //   119: goto            129
        //   122: aload_1        
        //   123: aload           11
        //   125: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   128: pop            
        //   129: iinc            9, 1
        //   132: goto            22
        //   135: aload_1        
        //   136: ifnonnull       141
        //   139: aconst_null    
        //   140: areturn        
        //   141: new             Landroid/graphics/fonts/FontStyle;
        //   144: astore_2       
        //   145: iload           4
        //   147: iconst_1       
        //   148: iand           
        //   149: ifeq            160
        //   152: sipush          700
        //   155: istore          9
        //   157: goto            165
        //   160: sipush          400
        //   163: istore          9
        //   165: iload           8
        //   167: istore          10
        //   169: iload           4
        //   171: iconst_2       
        //   172: iand           
        //   173: ifeq            179
        //   176: iconst_1       
        //   177: istore          10
        //   179: aload_2        
        //   180: iload           9
        //   182: iload           10
        //   184: invokespecial   android/graphics/fonts/FontStyle.<init>:(II)V
        //   187: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   190: astore_3       
        //   191: aload_3        
        //   192: aload_1        
        //   193: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   196: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   199: aload_3        
        //   200: aload_2        
        //   201: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   204: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   207: astore_1       
        //   208: aload_1        
        //   209: areturn        
        //   210: astore_1       
        //   211: aload           5
        //   213: astore_1       
        //   214: goto            208
        //   217: astore_2       
        //   218: goto            129
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      14     210    217    Ljava/lang/Exception;
        //  38     71     217    221    Ljava/io/IOException;
        //  38     71     210    217    Ljava/lang/Exception;
        //  77     103    217    221    Ljava/io/IOException;
        //  77     103    210    217    Ljava/lang/Exception;
        //  107    117    217    221    Ljava/io/IOException;
        //  107    117    210    217    Ljava/lang/Exception;
        //  122    129    217    221    Ljava/io/IOException;
        //  122    129    210    217    Ljava/lang/Exception;
        //  141    145    210    217    Ljava/lang/Exception;
        //  179    208    210    217    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
    
    @k0
    @Override
    public Typeface c(final Context p0, @k0 final CancellationSignal p1, @j0 final f.c[] p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore          5
        //     6: aload_3        
        //     7: arraylength    
        //     8: istore          6
        //    10: iconst_0       
        //    11: istore          7
        //    13: aconst_null    
        //    14: astore_1       
        //    15: iconst_0       
        //    16: istore          8
        //    18: iconst_1       
        //    19: istore          9
        //    21: iload           8
        //    23: iload           6
        //    25: if_icmpge       205
        //    28: aload_3        
        //    29: iload           8
        //    31: aaload         
        //    32: astore          10
        //    34: aload_1        
        //    35: astore          11
        //    37: aload           5
        //    39: aload           10
        //    41: invokevirtual   androidx/core/provider/f$c.d:()Landroid/net/Uri;
        //    44: ldc             "r"
        //    46: aload_2        
        //    47: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    50: astore          12
        //    52: aload           12
        //    54: ifnonnull       79
        //    57: aload_1        
        //    58: astore          11
        //    60: aload           12
        //    62: ifnull          196
        //    65: aload_1        
        //    66: astore          11
        //    68: aload           12
        //    70: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    73: aload_1        
        //    74: astore          11
        //    76: goto            196
        //    79: new             Landroid/graphics/fonts/Font$Builder;
        //    82: astore          11
        //    84: aload           11
        //    86: aload           12
        //    88: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/os/ParcelFileDescriptor;)V
        //    91: aload           11
        //    93: aload           10
        //    95: invokevirtual   androidx/core/provider/f$c.e:()I
        //    98: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //   101: astore          11
        //   103: aload           10
        //   105: invokevirtual   androidx/core/provider/f$c.f:()Z
        //   108: ifeq            114
        //   111: goto            117
        //   114: iconst_0       
        //   115: istore          9
        //   117: aload           11
        //   119: iload           9
        //   121: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //   124: aload           10
        //   126: invokevirtual   androidx/core/provider/f$c.c:()I
        //   129: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //   132: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //   135: astore          11
        //   137: aload_1        
        //   138: ifnonnull       158
        //   141: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   144: dup            
        //   145: aload           11
        //   147: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   150: astore          11
        //   152: aload           11
        //   154: astore_1       
        //   155: goto            65
        //   158: aload_1        
        //   159: aload           11
        //   161: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   164: pop            
        //   165: goto            65
        //   168: astore          10
        //   170: aload           12
        //   172: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   175: goto            190
        //   178: astore          12
        //   180: aload_1        
        //   181: astore          11
        //   183: aload           10
        //   185: aload           12
        //   187: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   190: aload_1        
        //   191: astore          11
        //   193: aload           10
        //   195: athrow         
        //   196: iinc            8, 1
        //   199: aload           11
        //   201: astore_1       
        //   202: goto            18
        //   205: aload_1        
        //   206: ifnonnull       211
        //   209: aconst_null    
        //   210: areturn        
        //   211: new             Landroid/graphics/fonts/FontStyle;
        //   214: astore_3       
        //   215: iload           4
        //   217: iconst_1       
        //   218: iand           
        //   219: ifeq            230
        //   222: sipush          700
        //   225: istore          8
        //   227: goto            235
        //   230: sipush          400
        //   233: istore          8
        //   235: iload           7
        //   237: istore          9
        //   239: iload           4
        //   241: iconst_2       
        //   242: iand           
        //   243: ifeq            249
        //   246: iconst_1       
        //   247: istore          9
        //   249: aload_3        
        //   250: iload           8
        //   252: iload           9
        //   254: invokespecial   android/graphics/fonts/FontStyle.<init>:(II)V
        //   257: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   260: astore_2       
        //   261: aload_2        
        //   262: aload_1        
        //   263: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   266: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   269: aload_2        
        //   270: aload_3        
        //   271: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   274: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   277: astore_1       
        //   278: aload_1        
        //   279: areturn        
        //   280: astore_1       
        //   281: aconst_null    
        //   282: areturn        
        //   283: astore_1       
        //   284: goto            196
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      10     280    283    Ljava/lang/Exception;
        //  37     52     283    287    Ljava/io/IOException;
        //  37     52     280    283    Ljava/lang/Exception;
        //  68     73     283    287    Ljava/io/IOException;
        //  68     73     280    283    Ljava/lang/Exception;
        //  79     111    168    196    Any
        //  117    137    168    196    Any
        //  141    152    168    196    Any
        //  158    165    168    196    Any
        //  170    175    178    190    Any
        //  183    190    283    287    Ljava/io/IOException;
        //  183    190    280    283    Ljava/lang/Exception;
        //  193    196    283    287    Ljava/io/IOException;
        //  193    196    280    283    Ljava/lang/Exception;
        //  211    215    280    283    Ljava/lang/Exception;
        //  249    278    280    283    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    @Override
    protected Typeface d(final Context context, final InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
    
    @k0
    @Override
    public Typeface e(final Context context, final Resources resources, final int n, final String s, final int n2) {
        try {
            final Font build = new Font$Builder(resources, n).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    @Override
    protected f.c h(final f.c[] array, final int n) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
