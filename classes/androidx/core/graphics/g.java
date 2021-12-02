// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import androidx.annotation.l;
import androidx.annotation.p0;
import android.graphics.Color;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\u0002\u001a\r\u0010\u0006\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\t\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\n\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\bH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\bH\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0011\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0013\u001a\u00020\u0000*\u00020\rH\u0087\b\u001a\r\u0010\u0014\u001a\u00020\b*\u00020\rH\u0087\b\u001a\u0015\u0010\u0017\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f\u001a\u0015\u0010\u0019\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0018H\u0087\f\u001a\u0015\u0010\u001a\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f\u001a\u0015\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0018H\u0087\f\u001a\u0015\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0018H\u0087\f\u001a\r\u0010\u001f\u001a\u00020\b*\u00020\u001eH\u0087\b\"\u0018\u0010\"\u001a\u00020\u0001*\u00020\b8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0018\u0010%\u001a\u00020\u0001*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0018\u0010(\u001a\u00020\b*\u00020\b8\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0018\u0010,\u001a\u00020)*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0018\u0010.\u001a\u00020\b*\u00020\b8\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010'\"\u0018\u0010%\u001a\u00020\b*\u00020\b8\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010'\"\u0018\u0010.\u001a\u00020\u0001*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b0\u0010$\"\u0018\u00102\u001a\u00020\u0001*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b1\u0010$\"\u0018\u00102\u001a\u00020\b*\u00020\b8\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b3\u0010'\"\u0018\u00105\u001a\u00020)*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b4\u0010+\"\u0018\u0010\"\u001a\u00020\u0001*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b6\u0010$\"\u0018\u0010\u0016\u001a\u00020\u0018*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0018\u0010(\u001a\u00020\u0001*\u00020\r8\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010$¨\u0006:" }, d2 = { "Landroid/graphics/Color;", "", "b", "e", "h", "k", "c", "F", "", "f", "i", "l", "G", "", "K", "a", "d", "g", "j", "H", "I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "m", "Landroid/graphics/ColorSpace;", "n", "o", "p", "q", "r", "", "J", "z", "(I)F", "luminance", "x", "(J)F", "green", "v", "(I)I", "blue", "", "D", "(J)Z", "isSrgb", "C", "red", "y", "B", "s", "alpha", "t", "E", "isWideGamut", "A", "w", "(J)Landroid/graphics/ColorSpace;", "u", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class g
{
    @p0(26)
    public static final float A(final long n) {
        return Color.luminance(n);
    }
    
    @p0(26)
    public static final float B(final long n) {
        return Color.red(n);
    }
    
    public static final int C(@l final int n) {
        return n >> 16 & 0xFF;
    }
    
    @p0(26)
    public static final boolean D(final long n) {
        return Color.isSrgb(n);
    }
    
    @p0(26)
    public static final boolean E(final long n) {
        return Color.isWideGamut(n);
    }
    
    @p0(26)
    @e
    public static final Color F(@e Color u, @e final Color color) {
        k0.p((Object)u, "<this>");
        k0.p((Object)color, "c");
        u = h.u(color, u);
        k0.o((Object)u, "compositeColors(c, this)");
        return u;
    }
    
    @p0(26)
    @e
    public static final Color G(@l final int n) {
        final Color value = Color.valueOf(n);
        k0.o((Object)value, "valueOf(this)");
        return value;
    }
    
    @p0(26)
    @e
    public static final Color H(final long n) {
        final Color value = Color.valueOf(n);
        k0.o((Object)value, "valueOf(this)");
        return value;
    }
    
    @l
    @p0(26)
    public static final int I(final long n) {
        return Color.toArgb(n);
    }
    
    @l
    public static final int J(@e final String s) {
        k0.p((Object)s, "<this>");
        return Color.parseColor(s);
    }
    
    @p0(26)
    public static final long K(@l final int n) {
        return Color.pack(n);
    }
    
    @p0(26)
    public static final float a(final long n) {
        return Color.red(n);
    }
    
    @p0(26)
    public static final float b(@e final Color color) {
        k0.p((Object)color, "<this>");
        return color.getComponent(0);
    }
    
    public static final int c(@l final int n) {
        return n >> 24 & 0xFF;
    }
    
    @p0(26)
    public static final float d(final long n) {
        return Color.green(n);
    }
    
    @p0(26)
    public static final float e(@e final Color color) {
        k0.p((Object)color, "<this>");
        return color.getComponent(1);
    }
    
    public static final int f(@l final int n) {
        return n >> 16 & 0xFF;
    }
    
    @p0(26)
    public static final float g(final long n) {
        return Color.blue(n);
    }
    
    @p0(26)
    public static final float h(@e final Color color) {
        k0.p((Object)color, "<this>");
        return color.getComponent(2);
    }
    
    public static final int i(@l final int n) {
        return n >> 8 & 0xFF;
    }
    
    @p0(26)
    public static final float j(final long n) {
        return Color.alpha(n);
    }
    
    @p0(26)
    public static final float k(@e final Color color) {
        k0.p((Object)color, "<this>");
        return color.getComponent(3);
    }
    
    public static final int l(@l final int n) {
        return n & 0xFF;
    }
    
    @p0(26)
    public static final long m(@l final int n, @e final ColorSpace$Named colorSpace$Named) {
        k0.p((Object)colorSpace$Named, "colorSpace");
        return Color.convert(n, ColorSpace.get(colorSpace$Named));
    }
    
    @p0(26)
    public static final long n(@l final int n, @e final ColorSpace colorSpace) {
        k0.p((Object)colorSpace, "colorSpace");
        return Color.convert(n, colorSpace);
    }
    
    @p0(26)
    public static final long o(final long n, @e final ColorSpace$Named colorSpace$Named) {
        k0.p((Object)colorSpace$Named, "colorSpace");
        return Color.convert(n, ColorSpace.get(colorSpace$Named));
    }
    
    @p0(26)
    public static final long p(final long n, @e final ColorSpace colorSpace) {
        k0.p((Object)colorSpace, "colorSpace");
        return Color.convert(n, colorSpace);
    }
    
    @p0(26)
    @e
    public static final Color q(@e Color convert, @e final ColorSpace$Named colorSpace$Named) {
        k0.p((Object)convert, "<this>");
        k0.p((Object)colorSpace$Named, "colorSpace");
        convert = convert.convert(ColorSpace.get(colorSpace$Named));
        k0.o((Object)convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }
    
    @p0(26)
    @e
    public static final Color r(@e Color convert, @e final ColorSpace colorSpace) {
        k0.p((Object)convert, "<this>");
        k0.p((Object)colorSpace, "colorSpace");
        convert = convert.convert(colorSpace);
        k0.o((Object)convert, "convert(colorSpace)");
        return convert;
    }
    
    @p0(26)
    public static final float s(final long n) {
        return Color.alpha(n);
    }
    
    public static final int t(@l final int n) {
        return n >> 24 & 0xFF;
    }
    
    @p0(26)
    public static final float u(final long n) {
        return Color.blue(n);
    }
    
    public static final int v(@l final int n) {
        return n & 0xFF;
    }
    
    @p0(26)
    @e
    public static final ColorSpace w(final long n) {
        final ColorSpace colorSpace = Color.colorSpace(n);
        k0.o((Object)colorSpace, "colorSpace(this)");
        return colorSpace;
    }
    
    @p0(26)
    public static final float x(final long n) {
        return Color.green(n);
    }
    
    public static final int y(@l final int n) {
        return n >> 8 & 0xFF;
    }
    
    @p0(26)
    public static final float z(@l final int n) {
        return Color.luminance(n);
    }
}
