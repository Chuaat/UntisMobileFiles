// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

import java.util.Collection;
import org.joda.time.h;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Arrays;
import java.io.PrintStream;
import org.joda.time.c;
import org.joda.time.d0;
import org.joda.time.e0;
import java.text.DateFormatSymbols;
import java.util.Locale;
import org.joda.time.chrono.x;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.DataOutput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.DataInput;
import org.joda.time.i;
import java.util.ArrayList;

public class b
{
    private final ArrayList<f> a;
    
    public b() {
        this.a = new ArrayList<f>(10);
    }
    
    private boolean c(final ArrayList<g> list, final g g) {
        final int size = list.size();
        if (size == 0) {
            list.add(g);
            return true;
        }
        final int n = size - 1;
        final g g2 = list.get(n);
        final boolean f = g.f(g2);
        int e = 0;
        if (!f) {
            return false;
        }
        if (size >= 2) {
            e = list.get(size - 2).e();
        }
        if (g.a() + g2.e() != g2.a() + e) {
            list.add(g);
            return true;
        }
        return this.c(list, g.g(list.remove(n).a()));
    }
    
    private static i d(final String anObject, final String anObject2, final int n, final int n2) {
        if ("UTC".equals(anObject) && anObject.equals(anObject2) && n == 0 && n2 == 0) {
            return i.I;
        }
        return new org.joda.time.tz.d(anObject, anObject2, n, n2);
    }
    
    private f e() {
        if (this.a.size() == 0) {
            this.a(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        final ArrayList<f> a = this.a;
        return a.get(a.size() - 1);
    }
    
    public static i f(final DataInput dataInput, final String s) throws IOException {
        final int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return org.joda.time.tz.a.S(c.T(dataInput, s));
        }
        if (unsignedByte == 70) {
            final org.joda.time.tz.d d = new org.joda.time.tz.d(s, dataInput.readUTF(), (int)h(dataInput), (int)h(dataInput));
            final i i = org.joda.time.i.I;
            i j = d;
            if (d.equals(i)) {
                j = i;
            }
            return j;
        }
        if (unsignedByte == 80) {
            return c.T(dataInput, s);
        }
        throw new IOException("Invalid encoding");
    }
    
    public static i g(final InputStream in, final String s) throws IOException {
        if (in instanceof DataInput) {
            return f((DataInput)in, s);
        }
        return f(new DataInputStream(in), s);
    }
    
    static long h(final DataInput dataInput) throws IOException {
        final int unsignedByte = dataInput.readUnsignedByte();
        final int n = unsignedByte >> 6;
        long n2;
        long n3;
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return dataInput.readLong();
                }
                n2 = unsignedByte << 26 >> 26;
                n3 = 1800000L;
            }
            else {
                n2 = ((long)unsignedByte << 58 >> 26 | (long)(dataInput.readUnsignedByte() << 24) | (long)(dataInput.readUnsignedByte() << 16) | (long)(dataInput.readUnsignedByte() << 8) | (long)dataInput.readUnsignedByte());
                n3 = 1000L;
            }
        }
        else {
            n2 = (dataInput.readUnsignedByte() | (unsignedByte << 26 >> 2 | dataInput.readUnsignedByte() << 16 | dataInput.readUnsignedByte() << 8));
            n3 = 60000L;
        }
        return n2 * n3;
    }
    
    static void l(final DataOutput dataOutput, final long n) throws IOException {
        if (n % 1800000L == 0L) {
            final long n2 = n / 1800000L;
            if (n2 << 58 >> 58 == n2) {
                dataOutput.writeByte((int)(n2 & 0x3FL));
                return;
            }
        }
        if (n % 60000L == 0L) {
            final long n3 = n / 60000L;
            if (n3 << 34 >> 34 == n3) {
                dataOutput.writeInt(0x40000000 | (int)(n3 & 0x3FFFFFFFL));
                return;
            }
        }
        if (n % 1000L == 0L) {
            final long n4 = n / 1000L;
            if (n4 << 26 >> 26 == n4) {
                dataOutput.writeByte((int)(n4 >> 32 & 0x3FL) | 0x80);
                dataOutput.writeInt((int)(-1L & n4));
                return;
            }
        }
        int n5;
        if (n < 0L) {
            n5 = 255;
        }
        else {
            n5 = 192;
        }
        dataOutput.writeByte(n5);
        dataOutput.writeLong(n);
    }
    
    public b a(final int n, final char c, final int n2, final int n3, final int n4, final boolean b, final int n5) {
        if (this.a.size() > 0) {
            final b b2 = new b(c, n2, n3, n4, b, n5);
            final ArrayList<f> a = this.a;
            a.get(a.size() - 1).i(n, b2);
        }
        this.a.add(new f());
        return this;
    }
    
    public b b(final String s, final int n, final int n2, final int n3, final char c, final int n4, final int n5, final int n6, final boolean b, final int n7) {
        if (n2 <= n3) {
            this.e().a(new e(new d(new b(c, n4, n5, n6, b, n7), s, n), n2, n3));
        }
        return this;
    }
    
    public b i(final String s, final int n) {
        this.e().g(s, n);
        return this;
    }
    
    public b j(final int n) {
        this.e().h(n);
        return this;
    }
    
    public i k(final String s, final boolean b) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        final ArrayList<g> list = new ArrayList<g>();
        i i = null;
        long e = Long.MIN_VALUE;
        for (int size = this.a.size(), j = 0; j < size; ++j) {
            final f f = this.a.get(j);
            final g c = f.c(e);
            if (c != null) {
                this.c(list, c);
                long n = c.a();
                int n2 = c.c();
                final f f2 = new f(f);
                while (true) {
                    final g f3 = f2.f(n, n2);
                    if (f3 == null || (this.c(list, f3) && i != null)) {
                        break;
                    }
                    n = f3.a();
                    n2 = f3.c();
                    i b2;
                    if ((b2 = i) == null) {
                        b2 = i;
                        if (j == size - 1) {
                            b2 = f2.b(s);
                        }
                    }
                    i = b2;
                }
                e = f2.e(n2);
            }
        }
        if (list.size() == 0) {
            if (i != null) {
                return i;
            }
            return d(s, "UTC", 0, 0);
        }
        else {
            if (list.size() == 1 && i == null) {
                final g g = list.get(0);
                return d(s, g.b(), g.e(), g.d());
            }
            i k;
            final c c2 = (c)(k = c.R(s, b, list, (a)i));
            if (c2.S()) {
                k = org.joda.time.tz.a.S(c2);
            }
            return k;
        }
    }
    
    public void m(final String s, final DataOutput dataOutput) throws IOException {
        i i = this.k(s, false);
        if (i instanceof org.joda.time.tz.d) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(i.u(0L));
            l(dataOutput, i.w(0L));
            l(dataOutput, i.D(0L));
        }
        else {
            if (i instanceof org.joda.time.tz.a) {
                dataOutput.writeByte(67);
                i = ((org.joda.time.tz.a)i).U();
            }
            else {
                dataOutput.writeByte(80);
            }
            ((c)i).U(dataOutput);
        }
    }
    
    public void n(final String s, final OutputStream out) throws IOException {
        if (out instanceof DataOutput) {
            this.m(s, (DataOutput)out);
        }
        else {
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            this.m(s, dataOutputStream);
            dataOutputStream.flush();
        }
    }
    
    private static final class a extends i
    {
        private static final long R = 6941492635554961361L;
        final int O;
        final d P;
        final d Q;
        
        a(final String s, final int o, final d p4, final d q) {
            super(s);
            this.O = o;
            this.P = p4;
            this.Q = q;
        }
        
        private d R(long d) {
            final int o = this.O;
            final d p = this.P;
            Object q = this.Q;
            long d2;
            try {
                d2 = p.d(d, o, ((d)q).c());
            }
            catch (IllegalArgumentException | ArithmeticException ex) {
                d2 = d;
            }
            try {
                d = ((d)q).d(d, o, p.c());
            }
            catch (IllegalArgumentException ex2) {}
            catch (ArithmeticException ex3) {}
            if (d2 > d) {
                q = p;
            }
            return (d)q;
        }
        
        static a S(final DataInput dataInput, final String s) throws IOException {
            return new a(s, (int)b.h(dataInput), d.f(dataInput), d.f(dataInput));
        }
        
        @Override
        public int D(final long n) {
            return this.O;
        }
        
        @Override
        public boolean E() {
            return false;
        }
        
        @Override
        public long H(long n) {
            final int o = this.O;
            final d p = this.P;
            final d q = this.Q;
            while (true) {
                try {
                    long d;
                    final long n2 = d = p.d(n, o, q.c());
                    if (n > 0L) {
                        d = n2;
                        if (n2 < 0L) {
                            d = n;
                        }
                    }
                    try {
                        final long d2 = q.d(n, o, p.c());
                        if (n <= 0L || d2 >= 0L) {
                            n = d2;
                        }
                    }
                    catch (IllegalArgumentException ex) {}
                    catch (ArithmeticException ex2) {}
                    long n3 = d;
                    if (d > n) {
                        n3 = n;
                    }
                    return n3;
                }
                catch (IllegalArgumentException | ArithmeticException ex3) {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public long J(long e) {
            long n = e + 1L;
            final int o = this.O;
            final d p = this.P;
            final d q = this.Q;
            while (true) {
                try {
                    final long n2 = e = p.e(n, o, q.c());
                    if (n < 0L) {
                        e = n2;
                        if (n2 > 0L) {
                            e = n;
                        }
                    }
                    try {
                        final long e2 = q.e(n, o, p.c());
                        if (n >= 0L || e2 <= 0L) {
                            n = e2;
                        }
                    }
                    catch (IllegalArgumentException ex) {}
                    catch (ArithmeticException ex2) {}
                    if (e <= n) {
                        e = n;
                    }
                    return e - 1L;
                }
                catch (IllegalArgumentException | ArithmeticException ex3) {
                    continue;
                }
                break;
            }
        }
        
        public void T(final DataOutput dataOutput) throws IOException {
            b.l(dataOutput, this.O);
            this.P.i(dataOutput);
            this.Q.i(dataOutput);
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof a) {
                final a a = (a)o;
                if (!this.q().equals(a.q()) || this.O != a.O || !this.P.equals(a.P) || !this.Q.equals(a.Q)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public String u(final long n) {
            return this.R(n).a();
        }
        
        @Override
        public int w(final long n) {
            return this.O + this.R(n).c();
        }
    }
    
    private static final class b
    {
        final char a;
        final int b;
        final int c;
        final int d;
        final boolean e;
        final int f;
        
        b(final char c, final int b, final int c2, final int d, final boolean e, final int f) {
            if (c != 'u' && c != 'w' && c != 's') {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown mode: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
            this.a = c;
            this.b = b;
            this.c = c2;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        static b c(final DataInput dataInput) throws IOException {
            return new b((char)dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int)org.joda.time.tz.b.h(dataInput));
        }
        
        private long d(final org.joda.time.a a, long n) {
            if (this.c >= 0) {
                n = a.g().T(n, this.c);
            }
            else {
                n = a.g().T(n, 1);
                n = a.F().a(n, 1);
                n = a.g().a(n, this.c);
            }
            return n;
        }
        
        private long e(final org.joda.time.a a, long n) {
            try {
                n = this.d(a, n);
            }
            catch (IllegalArgumentException ex) {
                if (this.b != 2 || this.c != 29) {
                    throw ex;
                }
                while (!a.T().K(n)) {
                    n = a.T().a(n, 1);
                }
                n = this.d(a, n);
            }
            return n;
        }
        
        private long f(final org.joda.time.a a, long n) {
            try {
                n = this.d(a, n);
            }
            catch (IllegalArgumentException ex) {
                if (this.b != 2 || this.c != 29) {
                    throw ex;
                }
                while (!a.T().K(n)) {
                    n = a.T().a(n, -1);
                }
                n = this.d(a, n);
            }
            return n;
        }
        
        private long g(final org.joda.time.a a, final long n) {
            final int n2 = this.d - a.h().g(n);
            long a2 = n;
            if (n2 != 0) {
                int n3;
                if (this.e) {
                    if ((n3 = n2) < 0) {
                        n3 = n2 + 7;
                    }
                }
                else if ((n3 = n2) > 0) {
                    n3 = n2 - 7;
                }
                a2 = a.h().a(n, n3);
            }
            return a2;
        }
        
        public long a(long n, int n2, final int n3) {
            final char a = this.a;
            if (a == 'w') {
                n2 += n3;
            }
            else if (a != 's') {
                n2 = 0;
            }
            final long n4 = n2;
            final long n5 = n + n4;
            final x e0 = x.e0();
            n = e0.F().T(n5, this.b);
            n = e0.z().T(n, 0);
            final long e2 = this.e(e0, e0.z().a(n, this.f));
            if (this.d == 0) {
                n = e2;
                if (e2 <= n5) {
                    n = this.e(e0, e0.T().a(e2, 1));
                }
            }
            else {
                final long n6 = n = this.g(e0, e2);
                if (n6 <= n5) {
                    n = e0.T().a(n6, 1);
                    n = this.g(e0, this.e(e0, e0.F().T(n, this.b)));
                }
            }
            n = e0.z().T(n, 0);
            return e0.z().a(n, this.f) - n4;
        }
        
        public long b(long n, int n2, final int n3) {
            final char a = this.a;
            if (a == 'w') {
                n2 += n3;
            }
            else if (a != 's') {
                n2 = 0;
            }
            final long n4 = n2;
            final long n5 = n + n4;
            final x e0 = x.e0();
            n = e0.F().T(n5, this.b);
            n = e0.z().T(n, 0);
            final long f = this.f(e0, e0.z().a(n, this.f));
            if (this.d == 0) {
                n = f;
                if (f >= n5) {
                    n = this.f(e0, e0.T().a(f, -1));
                }
            }
            else {
                final long n6 = n = this.g(e0, f);
                if (n6 >= n5) {
                    n = e0.T().a(n6, -1);
                    n = this.g(e0, this.f(e0, e0.F().T(n, this.b)));
                }
            }
            n = e0.z().T(n, 0);
            return e0.z().a(n, this.f) - n4;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof b) {
                final b b2 = (b)o;
                if (this.a != b2.a || this.b != b2.b || this.c != b2.c || this.d != b2.d || this.e != b2.e || this.f != b2.f) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public long h(final int n, int n2, final int n3) {
            final char a = this.a;
            if (a == 'w') {
                n2 += n3;
            }
            else if (a != 's') {
                n2 = 0;
            }
            final x e0 = x.e0();
            long n4 = this.d(e0, e0.z().T(e0.F().T(e0.T().T(0L, n), this.b), this.f));
            if (this.d != 0) {
                n4 = this.g(e0, n4);
            }
            return n4 - n2;
        }
        
        public void i(final DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeByte(this.d);
            dataOutput.writeBoolean(this.e);
            org.joda.time.tz.b.l(dataOutput, this.f);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("[OfYear]\nMode: ");
            sb.append(this.a);
            sb.append('\n');
            sb.append("MonthOfYear: ");
            sb.append(this.b);
            sb.append('\n');
            sb.append("DayOfMonth: ");
            sb.append(this.c);
            sb.append('\n');
            sb.append("DayOfWeek: ");
            sb.append(this.d);
            sb.append('\n');
            sb.append("AdvanceDayOfWeek: ");
            sb.append(this.e);
            sb.append('\n');
            sb.append("MillisOfDay: ");
            sb.append(this.f);
            sb.append('\n');
            return sb.toString();
        }
    }
    
    private static final class c extends i
    {
        private static final long T = 7811976468055766265L;
        private final long[] O;
        private final int[] P;
        private final int[] Q;
        private final String[] R;
        private final a S;
        
        private c(final String s, final long[] o, final int[] p6, final int[] q, final String[] r, final a s2) {
            super(s);
            this.O = o;
            this.P = p6;
            this.Q = q;
            this.R = r;
            this.S = s2;
        }
        
        static c R(String s, final boolean b, final ArrayList<g> list, final a a) {
            final int size = list.size();
            if (size != 0) {
                final long[] array = new long[size];
                final int[] array2 = new int[size];
                final int[] array3 = new int[size];
                final String[] array4 = new String[size];
                g g = null;
                final int n = 0;
                g g2;
                for (int i = 0; i < size; ++i, g = g2) {
                    g2 = list.get(i);
                    if (!g2.f(g)) {
                        throw new IllegalArgumentException(s);
                    }
                    array[i] = g2.a();
                    array2[i] = g2.e();
                    array3[i] = g2.d();
                    array4[i] = g2.b();
                }
                String[] array5 = new String[5];
                final String[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                String[] array7;
                for (int j = 0; j < zoneStrings.length; ++j, array5 = array7) {
                    final String[] array6 = zoneStrings[j];
                    array7 = array5;
                    if (array6 != null) {
                        array7 = array5;
                        if (array6.length == 5) {
                            array7 = array5;
                            if (s.equals(array6[0])) {
                                array7 = array6;
                            }
                        }
                    }
                }
                final x e0 = x.e0();
                final int[] array8 = array3;
                int n8;
                for (int k = n; k < size - 1; k = n8 + 1) {
                    final String str = array4[k];
                    final int n2 = k + 1;
                    final String str2 = array4[n2];
                    final long n3 = array2[k];
                    final long n4 = array2[n2];
                    final long n5 = array8[k];
                    final long n6 = array8[n2];
                    final d0 d0 = new d0(array[k], array[n2], org.joda.time.e0.F(), e0);
                    final long n7 = lcmp(n3, n4);
                    n8 = k;
                    if (n7 != 0) {
                        n8 = k;
                        if (n5 == n6) {
                            n8 = k;
                            if (str.equals(str2)) {
                                n8 = k;
                                if (d0.s0() == 0) {
                                    n8 = k;
                                    if (d0.p0() > 4) {
                                        n8 = k;
                                        if (d0.p0() < 8) {
                                            n8 = k;
                                            if (str.equals(array5[2])) {
                                                n8 = k;
                                                if (str.equals(array5[4])) {
                                                    if (org.joda.time.tz.i.b()) {
                                                        final PrintStream out = System.out;
                                                        final StringBuilder sb = new StringBuilder();
                                                        sb.append("Fixing duplicate name key - ");
                                                        sb.append(str2);
                                                        out.println(sb.toString());
                                                        final PrintStream out2 = System.out;
                                                        final StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("     - ");
                                                        sb2.append(new org.joda.time.c(array[k], e0));
                                                        sb2.append(" - ");
                                                        sb2.append(new org.joda.time.c(array[n2], e0));
                                                        out2.println(sb2.toString());
                                                    }
                                                    if (n7 > 0) {
                                                        final StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(str);
                                                        sb3.append("-Summer");
                                                        array4[k] = sb3.toString().intern();
                                                        n8 = k;
                                                    }
                                                    else {
                                                        n8 = k;
                                                        if (n7 < 0) {
                                                            final StringBuilder sb4 = new StringBuilder();
                                                            sb4.append(str2);
                                                            sb4.append("-Summer");
                                                            array4[n2] = sb4.toString().intern();
                                                            n8 = n2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                a a2;
                if (a != null && a.P.a().equals(a.Q.a())) {
                    if (org.joda.time.tz.i.b()) {
                        final PrintStream out3 = System.out;
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Fixing duplicate recurrent name key - ");
                        sb5.append(a.P.a());
                        out3.println(sb5.toString());
                    }
                    if (a.P.c() > 0) {
                        a2 = new a(a.q(), a.O, a.P.h("-Summer"), a.Q);
                    }
                    else {
                        a2 = new a(a.q(), a.O, a.P, a.Q.h("-Summer"));
                    }
                }
                else {
                    a2 = a;
                }
                if (!b) {
                    s = "";
                }
                return new c(s, array, array2, array8, array4, a2);
            }
            throw new IllegalArgumentException();
        }
        
        static c T(final DataInput dataInput, final String s) throws IOException {
            final int unsignedShort = dataInput.readUnsignedShort();
            final String[] array = new String[unsignedShort];
            final int n = 0;
            for (int i = 0; i < unsignedShort; ++i) {
                array[i] = dataInput.readUTF();
            }
            final int int1 = dataInput.readInt();
            final long[] array2 = new long[int1];
            final int[] array3 = new int[int1];
            final int[] array4 = new int[int1];
            final String[] array5 = new String[int1];
            int j = n;
            int n2;
            Label_0139_Outer:Label_0131_Outer:
            while (j < int1) {
                array2[j] = b.h(dataInput);
                array3[j] = (int)b.h(dataInput);
                array4[j] = (int)b.h(dataInput);
                while (true) {
                    if (unsignedShort < 256) {
                        try {
                            n2 = dataInput.readUnsignedByte();
                            while (true) {
                                array5[j] = array[n2];
                                ++j;
                                continue Label_0139_Outer;
                                n2 = dataInput.readUnsignedShort();
                                continue Label_0131_Outer;
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            throw new IOException("Invalid encoding");
                        }
                        break;
                    }
                    continue;
                }
            }
            i s2;
            if (dataInput.readBoolean()) {
                s2 = a.S(dataInput, s);
            }
            else {
                s2 = null;
            }
            return new c(s, array2, array3, array4, array5, (a)s2);
        }
        
        @Override
        public int D(final long key) {
            final long[] o = this.O;
            final int binarySearch = Arrays.binarySearch(o, key);
            if (binarySearch >= 0) {
                return this.Q[binarySearch];
            }
            final int n = ~binarySearch;
            if (n < o.length) {
                if (n > 0) {
                    return this.Q[n - 1];
                }
                return 0;
            }
            else {
                final a s = this.S;
                if (s == null) {
                    return this.Q[n - 1];
                }
                return s.D(key);
            }
        }
        
        @Override
        public boolean E() {
            return false;
        }
        
        @Override
        public long H(final long key) {
            final long[] o = this.O;
            int binarySearch = Arrays.binarySearch(o, key);
            if (binarySearch >= 0) {
                ++binarySearch;
            }
            else {
                binarySearch ^= -1;
            }
            if (binarySearch < o.length) {
                return o[binarySearch];
            }
            final a s = this.S;
            if (s == null) {
                return key;
            }
            final long n = o[o.length - 1];
            long n2 = key;
            if (key < n) {
                n2 = n;
            }
            return s.H(n2);
        }
        
        @Override
        public long J(final long key) {
            final long[] o = this.O;
            final int binarySearch = Arrays.binarySearch(o, key);
            if (binarySearch >= 0) {
                long n = key;
                if (key > Long.MIN_VALUE) {
                    n = key - 1L;
                }
                return n;
            }
            final int n2 = ~binarySearch;
            if (n2 < o.length) {
                if (n2 > 0) {
                    final long n3 = o[n2 - 1];
                    if (n3 > Long.MIN_VALUE) {
                        return n3 - 1L;
                    }
                }
                return key;
            }
            final a s = this.S;
            if (s != null) {
                final long j = s.J(key);
                if (j < key) {
                    return j;
                }
            }
            final long n4 = o[n2 - 1];
            if (n4 > Long.MIN_VALUE) {
                return n4 - 1L;
            }
            return key;
        }
        
        public boolean S() {
            if (this.S != null) {
                return true;
            }
            final long[] o = this.O;
            if (o.length <= 1) {
                return false;
            }
            double n = 0.0;
            int i = 1;
            int n2 = 0;
            while (i < o.length) {
                final long n3 = o[i] - o[i - 1];
                double n4 = n;
                int n5 = n2;
                if (n3 < 63158400000L) {
                    n4 = n + n3;
                    n5 = n2 + 1;
                }
                ++i;
                n = n4;
                n2 = n5;
            }
            return n2 > 0 && n / n2 / 8.64E7 >= 25.0;
        }
        
        public void U(final DataOutput dataOutput) throws IOException {
            final int length = this.O.length;
            final HashSet<String> set = new HashSet<String>();
            boolean b = false;
            for (int i = 0; i < length; ++i) {
                set.add(this.R[i]);
            }
            final int size = set.size();
            if (size <= 65535) {
                final String[] array = new String[size];
                final Iterator<Object> iterator = set.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    array[n] = iterator.next();
                    ++n;
                }
                dataOutput.writeShort(size);
                for (int j = 0; j < size; ++j) {
                    dataOutput.writeUTF(array[j]);
                }
                dataOutput.writeInt(length);
                for (int k = 0; k < length; ++k) {
                    org.joda.time.tz.b.l(dataOutput, this.O[k]);
                    org.joda.time.tz.b.l(dataOutput, this.P[k]);
                    org.joda.time.tz.b.l(dataOutput, this.Q[k]);
                    final String anObject = this.R[k];
                    int l = 0;
                    while (l < size) {
                        if (array[l].equals(anObject)) {
                            if (size < 256) {
                                dataOutput.writeByte(l);
                                break;
                            }
                            dataOutput.writeShort(l);
                            break;
                        }
                        else {
                            ++l;
                        }
                    }
                }
                if (this.S != null) {
                    b = true;
                }
                dataOutput.writeBoolean(b);
                final a s = this.S;
                if (s != null) {
                    s.T(dataOutput);
                }
                return;
            }
            throw new UnsupportedOperationException("String pool is too large");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof c) {
                final c c = (c)o;
                if (this.q().equals(c.q()) && Arrays.equals(this.O, c.O) && Arrays.equals(this.R, c.R) && Arrays.equals(this.P, c.P) && Arrays.equals(this.Q, c.Q)) {
                    final a s = this.S;
                    final a s2 = c.S;
                    if (s == null) {
                        if (s2 == null) {
                            return b;
                        }
                    }
                    else if (s.equals(s2)) {
                        return b;
                    }
                }
                b = false;
                return b;
            }
            return false;
        }
        
        @Override
        public String u(final long key) {
            final long[] o = this.O;
            final int binarySearch = Arrays.binarySearch(o, key);
            if (binarySearch >= 0) {
                return this.R[binarySearch];
            }
            final int n = ~binarySearch;
            if (n < o.length) {
                if (n > 0) {
                    return this.R[n - 1];
                }
                return "UTC";
            }
            else {
                final a s = this.S;
                if (s == null) {
                    return this.R[n - 1];
                }
                return s.u(key);
            }
        }
        
        @Override
        public int w(final long key) {
            final long[] o = this.O;
            final int binarySearch = Arrays.binarySearch(o, key);
            if (binarySearch >= 0) {
                return this.P[binarySearch];
            }
            final int n = ~binarySearch;
            if (n < o.length) {
                if (n > 0) {
                    return this.P[n - 1];
                }
                return 0;
            }
            else {
                final a s = this.S;
                if (s == null) {
                    return this.P[n - 1];
                }
                return s.w(key);
            }
        }
    }
    
    private static final class d
    {
        final b a;
        final String b;
        final int c;
        
        d(final b a, final String b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        static d f(final DataInput dataInput) throws IOException {
            return new d(b.c(dataInput), dataInput.readUTF(), (int)b.h(dataInput));
        }
        
        public String a() {
            return this.b;
        }
        
        public b b() {
            return this.a;
        }
        
        public int c() {
            return this.c;
        }
        
        public long d(final long n, final int n2, final int n3) {
            return this.a.a(n, n2, n3);
        }
        
        public long e(final long n, final int n2, final int n3) {
            return this.a.b(n, n2, n3);
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof d) {
                final d d = (d)o;
                if (this.c != d.c || !this.b.equals(d.b) || !this.a.equals(d.a)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        d g(final String s) {
            return new d(this.a, s, this.c);
        }
        
        d h(final String str) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(str);
            return this.g(sb.toString().intern());
        }
        
        public void i(final DataOutput dataOutput) throws IOException {
            this.a.i(dataOutput);
            dataOutput.writeUTF(this.b);
            org.joda.time.tz.b.l(dataOutput, this.c);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" named ");
            sb.append(this.b);
            sb.append(" at ");
            sb.append(this.c);
            return sb.toString();
        }
    }
    
    private static final class e
    {
        final d a;
        final int b;
        final int c;
        
        e(final d a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public int a() {
            return this.b;
        }
        
        public String b() {
            return this.a.a();
        }
        
        public b c() {
            return this.a.b();
        }
        
        public int d() {
            return this.a.c();
        }
        
        public int e() {
            return this.c;
        }
        
        public long f(long n, final int n2, final int n3) {
            final x e0 = x.e0();
            final int n4 = n2 + n3;
            int g;
            if (n == Long.MIN_VALUE) {
                g = Integer.MIN_VALUE;
            }
            else {
                g = e0.T().g(n4 + n);
            }
            long n5;
            if (g < this.b) {
                n5 = e0.T().T(0L, this.b) - n4 - 1L;
            }
            else {
                n5 = n;
            }
            final long d = this.a.d(n5, n2, n3);
            if (d <= n || e0.T().g(n4 + d) <= this.c) {
                n = d;
            }
            return n;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(" to ");
            sb.append(this.c);
            sb.append(" using ");
            sb.append(this.a);
            return sb.toString();
        }
    }
    
    private static final class f
    {
        private static final int g;
        private int a;
        private ArrayList<e> b;
        private String c;
        private int d;
        private int e;
        private b f;
        
        static {
            g = x.e0().T().g(h.c()) + 100;
        }
        
        f() {
            this.b = new ArrayList<e>(10);
            this.e = Integer.MAX_VALUE;
        }
        
        f(final f f) {
            this.a = f.a;
            this.b = new ArrayList<e>(f.b);
            this.c = f.c;
            this.d = f.d;
            this.e = f.e;
            this.f = f.f;
        }
        
        public void a(final e e) {
            if (!this.b.contains(e)) {
                this.b.add(e);
            }
        }
        
        public a b(final String s) {
            if (this.b.size() == 2) {
                final e e = this.b.get(0);
                final e e2 = this.b.get(1);
                if (e.e() == Integer.MAX_VALUE && e2.e() == Integer.MAX_VALUE) {
                    return new a(s, this.a, e.a, e2.a);
                }
            }
            return null;
        }
        
        public g c(final long n) {
            final String c = this.c;
            if (c != null) {
                final int a = this.a;
                return new g(n, c, a + this.d, a);
            }
            final ArrayList<e> b = new ArrayList<e>(this.b);
            long a2 = Long.MIN_VALUE;
            int c2 = 0;
            g g = null;
            Object o;
            while (true) {
                final g f = this.f(a2, c2);
                o = g;
                if (f == null) {
                    break;
                }
                a2 = f.a();
                final long n2 = lcmp(a2, n);
                if (n2 == 0) {
                    o = new g(n, f);
                    break;
                }
                if (n2 > 0) {
                    g g2 = null;
                    Label_0176: {
                        if ((g2 = g) == null) {
                            final Iterator<e> iterator = b.iterator();
                            e e;
                            do {
                                g2 = g;
                                if (!iterator.hasNext()) {
                                    break Label_0176;
                                }
                                e = iterator.next();
                            } while (e.d() != 0);
                            g2 = new g(n, e, this.a);
                        }
                    }
                    if ((o = g2) == null) {
                        final String b2 = f.b();
                        final int a3 = this.a;
                        o = new g(n, b2, a3, a3);
                        break;
                    }
                    break;
                }
                else {
                    g = new g(n, f);
                    c2 = f.c();
                }
            }
            this.b = b;
            return (g)o;
        }
        
        public int d() {
            return this.a;
        }
        
        public long e(final int n) {
            final int e = this.e;
            if (e == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.f.h(e, this.a, n);
        }
        
        public g f(final long n, final int n2) {
            final x e0 = x.e0();
            final Iterator<e> iterator = this.b.iterator();
            long n3 = Long.MAX_VALUE;
            e e2 = null;
            while (iterator.hasNext()) {
                final e e3 = iterator.next();
                final long f = e3.f(n, this.a, n2);
                if (f <= n) {
                    iterator.remove();
                }
                else {
                    if (f > n3) {
                        continue;
                    }
                    e2 = e3;
                    n3 = f;
                }
            }
            if (e2 == null) {
                return null;
            }
            if (e0.T().g(n3) >= org.joda.time.tz.b.f.g) {
                return null;
            }
            final int e4 = this.e;
            if (e4 < Integer.MAX_VALUE && n3 >= this.f.h(e4, this.a, n2)) {
                return null;
            }
            return new g(n3, e2, this.a);
        }
        
        public void g(final String c, final int d) {
            this.c = c;
            this.d = d;
        }
        
        public void h(final int a) {
            this.a = a;
        }
        
        public void i(final int e, final b f) {
            this.e = e;
            this.f = f;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append(" initial: ");
            sb.append(this.d);
            sb.append(" std: ");
            sb.append(this.a);
            sb.append(" upper: ");
            sb.append(this.e);
            sb.append(" ");
            sb.append(this.f);
            sb.append(" ");
            sb.append(this.b);
            return sb.toString();
        }
    }
    
    private static final class g
    {
        private final long a;
        private final String b;
        private final int c;
        private final int d;
        
        g(final long a, final String b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        g(final long a, final e e, final int d) {
            this.a = a;
            this.b = e.b();
            this.c = e.d() + d;
            this.d = d;
        }
        
        g(final long a, final g g) {
            this.a = a;
            this.b = g.b;
            this.c = g.c;
            this.d = g.d;
        }
        
        public long a() {
            return this.a;
        }
        
        public String b() {
            return this.b;
        }
        
        public int c() {
            return this.c - this.d;
        }
        
        public int d() {
            return this.d;
        }
        
        public int e() {
            return this.c;
        }
        
        public boolean f(final g g) {
            final boolean b = true;
            if (g == null) {
                return true;
            }
            if (this.a > g.a) {
                boolean b2 = b;
                if (this.c != g.c) {
                    return b2;
                }
                b2 = b;
                if (this.d != g.d) {
                    return b2;
                }
                if (!this.b.equals(g.b)) {
                    b2 = b;
                    return b2;
                }
            }
            return false;
        }
        
        public g g(final long n) {
            return new g(n, this.b, this.c, this.d);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(new org.joda.time.c(this.a, i.I));
            sb.append(" ");
            sb.append(this.d);
            sb.append(" ");
            sb.append(this.c);
            return sb.toString();
        }
    }
}
