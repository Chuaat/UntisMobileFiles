// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

public abstract class b
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    
    public static b a(int n, final double[] array, final double[][] array2) {
        if (array.length == 1) {
            n = 2;
        }
        if (n == 0) {
            return new k(array, array2);
        }
        if (n != 2) {
            return new j(array, array2);
        }
        return new a(array[0], array2[0]);
    }
    
    public static b b(final int[] array, final double[] array2, final double[][] array3) {
        return new androidx.constraintlayout.core.motion.utils.a(array, array2, array3);
    }
    
    public abstract double c(final double p0, final int p1);
    
    public abstract void d(final double p0, final double[] p1);
    
    public abstract void e(final double p0, final float[] p1);
    
    public abstract double f(final double p0, final int p1);
    
    public abstract void g(final double p0, final double[] p1);
    
    public abstract double[] h();
    
    static class a extends b
    {
        double d;
        double[] e;
        
        a(final double d, final double[] e) {
            this.d = d;
            this.e = e;
        }
        
        @Override
        public double c(final double n, final int n2) {
            return this.e[n2];
        }
        
        @Override
        public void d(final double n, final double[] array) {
            final double[] e = this.e;
            System.arraycopy(e, 0, array, 0, e.length);
        }
        
        @Override
        public void e(final double n, final float[] array) {
            int n2 = 0;
            while (true) {
                final double[] e = this.e;
                if (n2 >= e.length) {
                    break;
                }
                array[n2] = (float)e[n2];
                ++n2;
            }
        }
        
        @Override
        public double f(final double n, final int n2) {
            return 0.0;
        }
        
        @Override
        public void g(final double n, final double[] array) {
            for (int i = 0; i < this.e.length; ++i) {
                array[i] = 0.0;
            }
        }
        
        @Override
        public double[] h() {
            return new double[] { this.d };
        }
    }
}
