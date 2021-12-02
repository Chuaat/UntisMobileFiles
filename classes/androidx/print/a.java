// 
// Decompiled by Procyon v0.5.36
// 

package androidx.print;

import android.os.CancellationSignal$OnCancelListener;
import android.print.PrintDocumentInfo$Builder;
import android.os.Bundle;
import android.print.PrintDocumentAdapter$LayoutResultCallback;
import android.print.PageRange;
import android.os.AsyncTask;
import android.print.PrintAttributes$Margins;
import android.print.PrintDocumentAdapter$WriteResultCallback;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import android.print.PrintAttributes$MediaSize;
import android.print.PrintManager;
import androidx.annotation.k0;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import android.util.Log;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.p0;
import android.print.PrintAttributes$Builder;
import android.print.PrintAttributes;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import androidx.annotation.j0;
import android.os.Build$VERSION;
import android.graphics.BitmapFactory$Options;
import android.content.Context;
import android.annotation.SuppressLint;

public final class a
{
    private static final String g = "PrintHelper";
    private static final int h = 3500;
    static final boolean i;
    static final boolean j;
    public static final int k = 1;
    public static final int l = 2;
    @SuppressLint({ "InlinedApi" })
    public static final int m = 1;
    @SuppressLint({ "InlinedApi" })
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 2;
    final Context a;
    BitmapFactory$Options b;
    final Object c;
    int d;
    int e;
    int f;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        i = (sdk_INT < 20 || sdk_INT > 23);
        boolean k = b;
        if (sdk_INT != 23) {
            k = true;
        }
        j = k;
    }
    
    public a(@j0 final Context a) {
        this.b = null;
        this.c = new Object();
        this.d = 2;
        this.e = 2;
        this.f = 1;
        this.a = a;
    }
    
    static Bitmap a(final Bitmap bitmap, final int n) {
        if (n != 1) {
            return bitmap;
        }
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint();
        final ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter((ColorFilter)new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap((Bitmap)null);
        return bitmap2;
    }
    
    @p0(19)
    private static PrintAttributes$Builder b(final PrintAttributes printAttributes) {
        final PrintAttributes$Builder setMinMargins = new PrintAttributes$Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            setMinMargins.setColorMode(printAttributes.getColorMode());
        }
        if (Build$VERSION.SDK_INT >= 23 && printAttributes.getDuplexMode() != 0) {
            setMinMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return setMinMargins;
    }
    
    static Matrix d(final int n, final int n2, final RectF rectF, final int n3) {
        final Matrix matrix = new Matrix();
        final float width = rectF.width();
        final float n4 = (float)n;
        final float n5 = width / n4;
        float n6;
        if (n3 == 2) {
            n6 = Math.max(n5, rectF.height() / n2);
        }
        else {
            n6 = Math.min(n5, rectF.height() / n2);
        }
        matrix.postScale(n6, n6);
        matrix.postTranslate((rectF.width() - n4 * n6) / 2.0f, (rectF.height() - n2 * n6) / 2.0f);
        return matrix;
    }
    
    static boolean g(final Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }
    
    private Bitmap h(Uri decodeStream, final BitmapFactory$Options bitmapFactory$Options) throws FileNotFoundException {
        if (decodeStream != null) {
            final Context a = this.a;
            if (a != null) {
                final InputStream inputStream = null;
                InputStream inputStream2;
                try {
                    final InputStream openInputStream = a.getContentResolver().openInputStream(decodeStream);
                    try {
                        decodeStream = (Uri)BitmapFactory.decodeStream(openInputStream, (Rect)null, bitmapFactory$Options);
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            }
                            catch (IOException ex) {
                                Log.w("PrintHelper", "close fail ", (Throwable)ex);
                            }
                        }
                        return (Bitmap)decodeStream;
                    }
                    finally {}
                }
                finally {
                    inputStream2 = inputStream;
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    }
                    catch (IOException ex2) {
                        Log.w("PrintHelper", "close fail ", (Throwable)ex2);
                    }
                }
            }
        }
        throw new IllegalArgumentException("bad argument to loadBitmap");
    }
    
    public static boolean q() {
        return Build$VERSION.SDK_INT >= 19;
    }
    
    public int c() {
        return this.e;
    }
    
    public int e() {
        if (Build$VERSION.SDK_INT >= 19 && this.f == 0) {
            return 1;
        }
        return this.f;
    }
    
    public int f() {
        return this.d;
    }
    
    Bitmap i(final Uri uri) throws FileNotFoundException {
        if (uri != null && this.a != null) {
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            bitmapFactory$Options.inJustDecodeBounds = true;
            this.h(uri, bitmapFactory$Options);
            final int outWidth = bitmapFactory$Options.outWidth;
            final int outHeight = bitmapFactory$Options.outHeight;
            if (outWidth > 0) {
                if (outHeight > 0) {
                    int i;
                    int inSampleSize;
                    for (i = Math.max(outWidth, outHeight), inSampleSize = 1; i > 3500; i >>>= 1, inSampleSize <<= 1) {}
                    if (inSampleSize > 0) {
                        if (Math.min(outWidth, outHeight) / inSampleSize > 0) {
                            final Object c = this.c;
                            synchronized (c) {
                                final BitmapFactory$Options b = new BitmapFactory$Options();
                                this.b = b;
                                b.inMutable = true;
                                b.inSampleSize = inSampleSize;
                                // monitorexit(c)
                                try {
                                    final Bitmap h = this.h(uri, b);
                                    synchronized (this.c) {
                                        this.b = null;
                                        return h;
                                    }
                                }
                                finally {
                                    synchronized (this.c) {
                                        this.b = null;
                                    }
                                    // monitorexit(this.c)
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("bad argument to getScaledBitmap");
    }
    
    public void j(@j0 final String s, @j0 final Bitmap bitmap) {
        this.k(s, bitmap, null);
    }
    
    public void k(@j0 final String s, @j0 final Bitmap bitmap, @k0 final b b) {
        if (Build$VERSION.SDK_INT >= 19) {
            if (bitmap != null) {
                final PrintManager printManager = (PrintManager)this.a.getSystemService("print");
                PrintAttributes$MediaSize mediaSize;
                if (g(bitmap)) {
                    mediaSize = PrintAttributes$MediaSize.UNKNOWN_PORTRAIT;
                }
                else {
                    mediaSize = PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE;
                }
                printManager.print(s, (PrintDocumentAdapter)new c(s, this.d, bitmap, b), new PrintAttributes$Builder().setMediaSize(mediaSize).setColorMode(this.e).build());
            }
        }
    }
    
    public void l(@j0 final String s, @j0 final Uri uri) throws FileNotFoundException {
        this.m(s, uri, null);
    }
    
    public void m(@j0 final String s, @j0 final Uri uri, @k0 final b b) throws FileNotFoundException {
        if (Build$VERSION.SDK_INT < 19) {
            return;
        }
        final d d = new d(s, uri, b, this.d);
        final PrintManager printManager = (PrintManager)this.a.getSystemService("print");
        final PrintAttributes$Builder printAttributes$Builder = new PrintAttributes$Builder();
        printAttributes$Builder.setColorMode(this.e);
        final int f = this.f;
        Label_0103: {
            PrintAttributes$MediaSize mediaSize;
            if (f != 1 && f != 0) {
                if (f != 2) {
                    break Label_0103;
                }
                mediaSize = PrintAttributes$MediaSize.UNKNOWN_PORTRAIT;
            }
            else {
                mediaSize = PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE;
            }
            printAttributes$Builder.setMediaSize(mediaSize);
        }
        printManager.print(s, (PrintDocumentAdapter)d, printAttributes$Builder.build());
    }
    
    public void n(final int e) {
        this.e = e;
    }
    
    public void o(final int f) {
        this.f = f;
    }
    
    public void p(final int d) {
        this.d = d;
    }
    
    @p0(19)
    void r(final PrintAttributes printAttributes, final int n, final Bitmap bitmap, final ParcelFileDescriptor parcelFileDescriptor, final CancellationSignal cancellationSignal, final PrintDocumentAdapter$WriteResultCallback printDocumentAdapter$WriteResultCallback) {
        PrintAttributes build;
        if (androidx.print.a.j) {
            build = printAttributes;
        }
        else {
            build = b(printAttributes).setMinMargins(new PrintAttributes$Margins(0, 0, 0, 0)).build();
        }
        new AsyncTask<Void, Void, Throwable>() {
            protected Throwable a(final Void... p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        androidx/print/a$a.a:Landroid/os/CancellationSignal;
                //     4: invokevirtual   android/os/CancellationSignal.isCanceled:()Z
                //     7: ifeq            12
                //    10: aconst_null    
                //    11: areturn        
                //    12: new             Landroid/print/pdf/PrintedPdfDocument;
                //    15: astore_2       
                //    16: aload_2        
                //    17: aload_0        
                //    18: getfield        androidx/print/a$a.h:Landroidx/print/a;
                //    21: getfield        androidx/print/a.a:Landroid/content/Context;
                //    24: aload_0        
                //    25: getfield        androidx/print/a$a.b:Landroid/print/PrintAttributes;
                //    28: invokespecial   android/print/pdf/PrintedPdfDocument.<init>:(Landroid/content/Context;Landroid/print/PrintAttributes;)V
                //    31: aload_0        
                //    32: getfield        androidx/print/a$a.c:Landroid/graphics/Bitmap;
                //    35: aload_0        
                //    36: getfield        androidx/print/a$a.b:Landroid/print/PrintAttributes;
                //    39: invokevirtual   android/print/PrintAttributes.getColorMode:()I
                //    42: invokestatic    androidx/print/a.a:(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
                //    45: astore_3       
                //    46: aload_0        
                //    47: getfield        androidx/print/a$a.a:Landroid/os/CancellationSignal;
                //    50: invokevirtual   android/os/CancellationSignal.isCanceled:()Z
                //    53: istore          4
                //    55: iload           4
                //    57: ifeq            62
                //    60: aconst_null    
                //    61: areturn        
                //    62: aload_2        
                //    63: iconst_1       
                //    64: invokevirtual   android/print/pdf/PrintedPdfDocument.startPage:(I)Landroid/graphics/pdf/PdfDocument$Page;
                //    67: astore          5
                //    69: getstatic       androidx/print/a.j:Z
                //    72: istore          4
                //    74: iload           4
                //    76: ifeq            98
                //    79: new             Landroid/graphics/RectF;
                //    82: astore_1       
                //    83: aload_1        
                //    84: aload           5
                //    86: invokevirtual   android/graphics/pdf/PdfDocument$Page.getInfo:()Landroid/graphics/pdf/PdfDocument$PageInfo;
                //    89: invokevirtual   android/graphics/pdf/PdfDocument$PageInfo.getContentRect:()Landroid/graphics/Rect;
                //    92: invokespecial   android/graphics/RectF.<init>:(Landroid/graphics/Rect;)V
                //    95: goto            155
                //    98: new             Landroid/print/pdf/PrintedPdfDocument;
                //   101: astore          6
                //   103: aload           6
                //   105: aload_0        
                //   106: getfield        androidx/print/a$a.h:Landroidx/print/a;
                //   109: getfield        androidx/print/a.a:Landroid/content/Context;
                //   112: aload_0        
                //   113: getfield        androidx/print/a$a.d:Landroid/print/PrintAttributes;
                //   116: invokespecial   android/print/pdf/PrintedPdfDocument.<init>:(Landroid/content/Context;Landroid/print/PrintAttributes;)V
                //   119: aload           6
                //   121: iconst_1       
                //   122: invokevirtual   android/print/pdf/PrintedPdfDocument.startPage:(I)Landroid/graphics/pdf/PdfDocument$Page;
                //   125: astore          7
                //   127: new             Landroid/graphics/RectF;
                //   130: astore_1       
                //   131: aload_1        
                //   132: aload           7
                //   134: invokevirtual   android/graphics/pdf/PdfDocument$Page.getInfo:()Landroid/graphics/pdf/PdfDocument$PageInfo;
                //   137: invokevirtual   android/graphics/pdf/PdfDocument$PageInfo.getContentRect:()Landroid/graphics/Rect;
                //   140: invokespecial   android/graphics/RectF.<init>:(Landroid/graphics/Rect;)V
                //   143: aload           6
                //   145: aload           7
                //   147: invokevirtual   android/print/pdf/PrintedPdfDocument.finishPage:(Landroid/graphics/pdf/PdfDocument$Page;)V
                //   150: aload           6
                //   152: invokevirtual   android/print/pdf/PrintedPdfDocument.close:()V
                //   155: aload_3        
                //   156: invokevirtual   android/graphics/Bitmap.getWidth:()I
                //   159: aload_3        
                //   160: invokevirtual   android/graphics/Bitmap.getHeight:()I
                //   163: aload_1        
                //   164: aload_0        
                //   165: getfield        androidx/print/a$a.e:I
                //   168: invokestatic    androidx/print/a.d:(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
                //   171: astore          6
                //   173: iload           4
                //   175: ifeq            181
                //   178: goto            205
                //   181: aload           6
                //   183: aload_1        
                //   184: getfield        android/graphics/RectF.left:F
                //   187: aload_1        
                //   188: getfield        android/graphics/RectF.top:F
                //   191: invokevirtual   android/graphics/Matrix.postTranslate:(FF)Z
                //   194: pop            
                //   195: aload           5
                //   197: invokevirtual   android/graphics/pdf/PdfDocument$Page.getCanvas:()Landroid/graphics/Canvas;
                //   200: aload_1        
                //   201: invokevirtual   android/graphics/Canvas.clipRect:(Landroid/graphics/RectF;)Z
                //   204: pop            
                //   205: aload           5
                //   207: invokevirtual   android/graphics/pdf/PdfDocument$Page.getCanvas:()Landroid/graphics/Canvas;
                //   210: aload_3        
                //   211: aload           6
                //   213: aconst_null    
                //   214: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
                //   217: aload_2        
                //   218: aload           5
                //   220: invokevirtual   android/print/pdf/PrintedPdfDocument.finishPage:(Landroid/graphics/pdf/PdfDocument$Page;)V
                //   223: aload_0        
                //   224: getfield        androidx/print/a$a.a:Landroid/os/CancellationSignal;
                //   227: invokevirtual   android/os/CancellationSignal.isCanceled:()Z
                //   230: istore          4
                //   232: iload           4
                //   234: ifeq            268
                //   237: aload_2        
                //   238: invokevirtual   android/print/pdf/PrintedPdfDocument.close:()V
                //   241: aload_0        
                //   242: getfield        androidx/print/a$a.f:Landroid/os/ParcelFileDescriptor;
                //   245: astore_1       
                //   246: aload_1        
                //   247: ifnull          254
                //   250: aload_1        
                //   251: invokevirtual   android/os/ParcelFileDescriptor.close:()V
                //   254: aload_3        
                //   255: aload_0        
                //   256: getfield        androidx/print/a$a.c:Landroid/graphics/Bitmap;
                //   259: if_acmpeq       266
                //   262: aload_3        
                //   263: invokevirtual   android/graphics/Bitmap.recycle:()V
                //   266: aconst_null    
                //   267: areturn        
                //   268: new             Ljava/io/FileOutputStream;
                //   271: astore_1       
                //   272: aload_1        
                //   273: aload_0        
                //   274: getfield        androidx/print/a$a.f:Landroid/os/ParcelFileDescriptor;
                //   277: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
                //   280: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/FileDescriptor;)V
                //   283: aload_2        
                //   284: aload_1        
                //   285: invokevirtual   android/print/pdf/PrintedPdfDocument.writeTo:(Ljava/io/OutputStream;)V
                //   288: aload_2        
                //   289: invokevirtual   android/print/pdf/PrintedPdfDocument.close:()V
                //   292: aload_0        
                //   293: getfield        androidx/print/a$a.f:Landroid/os/ParcelFileDescriptor;
                //   296: astore_1       
                //   297: aload_1        
                //   298: ifnull          305
                //   301: aload_1        
                //   302: invokevirtual   android/os/ParcelFileDescriptor.close:()V
                //   305: aload_3        
                //   306: aload_0        
                //   307: getfield        androidx/print/a$a.c:Landroid/graphics/Bitmap;
                //   310: if_acmpeq       317
                //   313: aload_3        
                //   314: invokevirtual   android/graphics/Bitmap.recycle:()V
                //   317: aconst_null    
                //   318: areturn        
                //   319: astore_1       
                //   320: aload_2        
                //   321: invokevirtual   android/print/pdf/PrintedPdfDocument.close:()V
                //   324: aload_0        
                //   325: getfield        androidx/print/a$a.f:Landroid/os/ParcelFileDescriptor;
                //   328: astore_2       
                //   329: aload_2        
                //   330: ifnull          337
                //   333: aload_2        
                //   334: invokevirtual   android/os/ParcelFileDescriptor.close:()V
                //   337: aload_3        
                //   338: aload_0        
                //   339: getfield        androidx/print/a$a.c:Landroid/graphics/Bitmap;
                //   342: if_acmpeq       349
                //   345: aload_3        
                //   346: invokevirtual   android/graphics/Bitmap.recycle:()V
                //   349: aload_1        
                //   350: athrow         
                //   351: astore_1       
                //   352: aload_1        
                //   353: areturn        
                //   354: astore_1       
                //   355: goto            254
                //   358: astore_1       
                //   359: goto            305
                //   362: astore_2       
                //   363: goto            337
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                 
                //  -----  -----  -----  -----  ---------------------
                //  0      10     351    354    Any
                //  12     55     351    354    Any
                //  62     74     319    351    Any
                //  79     95     319    351    Any
                //  98     155    319    351    Any
                //  155    173    319    351    Any
                //  181    205    319    351    Any
                //  205    232    319    351    Any
                //  237    246    351    354    Any
                //  250    254    354    358    Ljava/io/IOException;
                //  250    254    351    354    Any
                //  254    266    351    354    Any
                //  268    288    319    351    Any
                //  288    297    351    354    Any
                //  301    305    358    362    Ljava/io/IOException;
                //  301    305    351    354    Any
                //  305    317    351    354    Any
                //  320    329    351    354    Any
                //  333    337    362    366    Ljava/io/IOException;
                //  333    337    351    354    Any
                //  337    349    351    354    Any
                //  349    351    351    354    Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IndexOutOfBoundsException: Index 181 out of bounds for length 181
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
            
            protected void b(final Throwable t) {
                if (cancellationSignal.isCanceled()) {
                    printDocumentAdapter$WriteResultCallback.onWriteCancelled();
                }
                else if (t == null) {
                    printDocumentAdapter$WriteResultCallback.onWriteFinished(new PageRange[] { PageRange.ALL_PAGES });
                }
                else {
                    Log.e("PrintHelper", "Error writing printed content", t);
                    printDocumentAdapter$WriteResultCallback.onWriteFailed((CharSequence)null);
                }
            }
        }.execute((Object[])new Void[0]);
    }
    
    public interface b
    {
        void a();
    }
    
    @p0(19)
    private class c extends PrintDocumentAdapter
    {
        private final String a;
        private final int b;
        private final Bitmap c;
        private final b d;
        private PrintAttributes e;
        
        c(final String a, final int b, final Bitmap c, final b d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public void onFinish() {
            final b d = this.d;
            if (d != null) {
                d.a();
            }
        }
        
        public void onLayout(final PrintAttributes printAttributes, final PrintAttributes e, final CancellationSignal cancellationSignal, final PrintDocumentAdapter$LayoutResultCallback printDocumentAdapter$LayoutResultCallback, final Bundle bundle) {
            this.e = e;
            printDocumentAdapter$LayoutResultCallback.onLayoutFinished(new PrintDocumentInfo$Builder(this.a).setContentType(1).setPageCount(1).build(), e.equals((Object)printAttributes) ^ true);
        }
        
        public void onWrite(final PageRange[] array, final ParcelFileDescriptor parcelFileDescriptor, final CancellationSignal cancellationSignal, final PrintDocumentAdapter$WriteResultCallback printDocumentAdapter$WriteResultCallback) {
            androidx.print.a.this.r(this.e, this.b, this.c, parcelFileDescriptor, cancellationSignal, printDocumentAdapter$WriteResultCallback);
        }
    }
    
    @p0(19)
    private class d extends PrintDocumentAdapter
    {
        final String a;
        final Uri b;
        final b c;
        final int d;
        PrintAttributes e;
        AsyncTask<Uri, Boolean, Bitmap> f;
        Bitmap g;
        final /* synthetic */ a h;
        
        d(final String a, final Uri b, final b c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.g = null;
        }
        
        void a() {
            synchronized (androidx.print.a.this.c) {
                final BitmapFactory$Options b = androidx.print.a.this.b;
                if (b != null) {
                    if (Build$VERSION.SDK_INT < 24) {
                        b.requestCancelDecode();
                    }
                    androidx.print.a.this.b = null;
                }
            }
        }
        
        public void onFinish() {
            super.onFinish();
            this.a();
            final AsyncTask<Uri, Boolean, Bitmap> f = this.f;
            if (f != null) {
                f.cancel(true);
            }
            final b c = this.c;
            if (c != null) {
                c.a();
            }
            final Bitmap g = this.g;
            if (g != null) {
                g.recycle();
                this.g = null;
            }
        }
        
        public void onLayout(final PrintAttributes printAttributes, final PrintAttributes e, final CancellationSignal cancellationSignal, final PrintDocumentAdapter$LayoutResultCallback printDocumentAdapter$LayoutResultCallback, final Bundle bundle) {
            synchronized (this) {
                this.e = e;
                // monitorexit(this)
                if (cancellationSignal.isCanceled()) {
                    printDocumentAdapter$LayoutResultCallback.onLayoutCancelled();
                    return;
                }
                if (this.g != null) {
                    printDocumentAdapter$LayoutResultCallback.onLayoutFinished(new PrintDocumentInfo$Builder(this.a).setContentType(1).setPageCount(1).build(), e.equals((Object)printAttributes) ^ true);
                    return;
                }
                this.f = (AsyncTask<Uri, Boolean, Bitmap>)new AsyncTask<Uri, Boolean, Bitmap>() {
                    protected Bitmap a(final Uri... array) {
                        try {
                            final d e = androidx.print.a.d.this;
                            return e.h.i(e.b);
                        }
                        catch (FileNotFoundException ex) {
                            return null;
                        }
                    }
                    
                    protected void b(final Bitmap bitmap) {
                        printDocumentAdapter$LayoutResultCallback.onLayoutCancelled();
                        androidx.print.a.d.this.f = null;
                    }
                    
                    protected void c(final Bitmap bitmap) {
                        super.onPostExecute((Object)bitmap);
                        Object bitmap2 = bitmap;
                        Label_0106: {
                            if (bitmap != null) {
                                if (androidx.print.a.i) {
                                    bitmap2 = bitmap;
                                    if (androidx.print.a.this.f != 0) {
                                        break Label_0106;
                                    }
                                }
                                synchronized (this) {
                                    final PrintAttributes$MediaSize mediaSize = androidx.print.a.d.this.e.getMediaSize();
                                    // monitorexit(this)
                                    bitmap2 = bitmap;
                                    if (mediaSize != null) {
                                        bitmap2 = bitmap;
                                        if (mediaSize.isPortrait() != androidx.print.a.g(bitmap)) {
                                            bitmap2 = new Matrix();
                                            ((Matrix)bitmap2).postRotate(90.0f);
                                            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix)bitmap2, true);
                                        }
                                    }
                                }
                            }
                        }
                        if ((androidx.print.a.d.this.g = (Bitmap)bitmap2) != null) {
                            printDocumentAdapter$LayoutResultCallback.onLayoutFinished(new PrintDocumentInfo$Builder(androidx.print.a.d.this.a).setContentType(1).setPageCount(1).build(), true ^ e.equals((Object)printAttributes));
                        }
                        else {
                            printDocumentAdapter$LayoutResultCallback.onLayoutFailed((CharSequence)null);
                        }
                        androidx.print.a.d.this.f = null;
                    }
                    
                    protected void onPreExecute() {
                        cancellationSignal.setOnCancelListener((CancellationSignal$OnCancelListener)new CancellationSignal$OnCancelListener() {
                            public void onCancel() {
                                androidx.print.a.d.this.a();
                                AsyncTask.this.cancel(false);
                            }
                        });
                    }
                }.execute((Object[])new Uri[0]);
            }
        }
        
        public void onWrite(final PageRange[] array, final ParcelFileDescriptor parcelFileDescriptor, final CancellationSignal cancellationSignal, final PrintDocumentAdapter$WriteResultCallback printDocumentAdapter$WriteResultCallback) {
            androidx.print.a.this.r(this.e, this.d, this.g, parcelFileDescriptor, cancellationSignal, printDocumentAdapter$WriteResultCallback);
        }
    }
}
