// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Arrays;
import io.realm.y;

public class OsCollectionChangeSet implements y, k
{
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 2147483639;
    private static long M;
    private final long G;
    private final boolean H;
    
    static {
        OsCollectionChangeSet.M = nativeGetFinalizerPtr();
    }
    
    public OsCollectionChangeSet(final long g, final boolean h) {
        this.G = g;
        this.H = h;
        j.c.a(this);
    }
    
    private a[] j(final int[] array) {
        int i = 0;
        if (array == null) {
            return new a[0];
        }
        final int n = array.length / 2;
        final a[] array2 = new a[n];
        while (i < n) {
            final int n2 = i * 2;
            array2[i] = new a(array[n2], array[n2 + 1]);
            ++i;
        }
        return array2;
    }
    
    private static native long nativeGetFinalizerPtr();
    
    private static native int[] nativeGetIndices(final long p0, final int p1);
    
    private static native int[] nativeGetRanges(final long p0, final int p1);
    
    @Override
    public a[] a() {
        return this.j(nativeGetRanges(this.G, 1));
    }
    
    @Override
    public a[] b() {
        return this.j(nativeGetRanges(this.G, 2));
    }
    
    @Override
    public a[] c() {
        return this.j(nativeGetRanges(this.G, 0));
    }
    
    @Override
    public Throwable d() {
        return null;
    }
    
    @Override
    public int[] e() {
        return nativeGetIndices(this.G, 0);
    }
    
    @Override
    public int[] f() {
        return nativeGetIndices(this.G, 2);
    }
    
    @Override
    public int[] g() {
        return nativeGetIndices(this.G, 1);
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsCollectionChangeSet.M;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
    
    @Override
    public b getState() {
        throw new UnsupportedOperationException("This method should be overridden in a subclass");
    }
    
    public boolean h() {
        return this.G == 0L;
    }
    
    public boolean i() {
        return this.H;
    }
    
    @Override
    public String toString() {
        if (this.G == 0L) {
            return "Change set is empty.";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Deletion Ranges: ");
        sb.append(Arrays.toString(this.c()));
        sb.append("\nInsertion Ranges: ");
        sb.append(Arrays.toString(this.a()));
        sb.append("\nChange Ranges: ");
        sb.append(Arrays.toString(this.b()));
        return sb.toString();
    }
}
