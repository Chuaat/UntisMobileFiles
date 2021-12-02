// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.disklrucache;

import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.ArrayList;
import android.annotation.TargetApi;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import android.os.Build$VERSION;
import java.util.Map;
import java.io.EOFException;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import java.io.PrintStream;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.LinkedHashMap;
import java.io.Writer;
import java.io.File;
import java.io.Closeable;

public final class a implements Closeable
{
    static final String U = "journal";
    static final String V = "journal.tmp";
    static final String W = "journal.bkp";
    static final String X = "libcore.io.DiskLruCache";
    static final String Y = "1";
    static final long Z = -1L;
    private static final String a0 = "CLEAN";
    private static final String b0 = "DIRTY";
    private static final String c0 = "REMOVE";
    private static final String d0 = "READ";
    private final File G;
    private final File H;
    private final File I;
    private final File J;
    private final int K;
    private long L;
    private final int M;
    private long N;
    private Writer O;
    private final LinkedHashMap<String, d> P;
    private int Q;
    private long R;
    final ThreadPoolExecutor S;
    private final Callable<Void> T;
    
    private a(final File file, final int k, final int m, final long l) {
        this.N = 0L;
        this.P = new LinkedHashMap<String, d>(0, 0.75f, true);
        this.R = 0L;
        this.S = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new b());
        this.T = new Callable<Void>() {
            public Void a() throws Exception {
                synchronized (a.this) {
                    if (a.this.O == null) {
                        return null;
                    }
                    a.this.T();
                    if (a.this.G()) {
                        a.this.M();
                        a.this.Q = 0;
                    }
                    return null;
                }
            }
        };
        this.G = file;
        this.K = k;
        this.H = new File(file, "journal");
        this.I = new File(file, "journal.tmp");
        this.J = new File(file, "journal.bkp");
        this.M = m;
        this.L = l;
    }
    
    private static String F(final InputStream in) throws IOException {
        return com.bumptech.glide.disklrucache.c.c(new InputStreamReader(in, com.bumptech.glide.disklrucache.c.b));
    }
    
    private boolean G() {
        final int q = this.Q;
        return q >= 2000 && q >= this.P.size();
    }
    
    public static a H(final File obj, final int n, final int n2, final long n3) throws IOException {
        if (n3 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (n2 > 0) {
            final File file = new File(obj, "journal.bkp");
            if (file.exists()) {
                final File file2 = new File(obj, "journal");
                if (file2.exists()) {
                    file.delete();
                }
                else {
                    Q(file, file2, false);
                }
            }
            final a a = new a(obj, n, n2, n3);
            if (a.H.exists()) {
                try {
                    a.K();
                    a.J();
                    return a;
                }
                catch (IOException ex) {
                    final PrintStream out = System.out;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(obj);
                    sb.append(" is corrupt: ");
                    sb.append(ex.getMessage());
                    sb.append(", removing");
                    out.println(sb.toString());
                    a.r();
                }
            }
            obj.mkdirs();
            final a a2 = new a(obj, n, n2, n3);
            a2.M();
            return a2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }
    
    private void J() throws IOException {
        s(this.I);
        final Iterator<d> iterator = this.P.values().iterator();
        while (iterator.hasNext()) {
            final d d = iterator.next();
            final c g = d.f;
            final int n = 0;
            int i = 0;
            if (g == null) {
                while (i < this.M) {
                    this.N += d.b[i];
                    ++i;
                }
            }
            else {
                d.f = null;
                for (int j = n; j < this.M; ++j) {
                    s(d.j(j));
                    s(d.k(j));
                }
                iterator.remove();
            }
        }
    }
    
    private void K() throws IOException {
        final com.bumptech.glide.disklrucache.b b = new com.bumptech.glide.disklrucache.b(new FileInputStream(this.H), com.bumptech.glide.disklrucache.c.a);
        try {
            final String d = b.d();
            final String d2 = b.d();
            final String d3 = b.d();
            final String d4 = b.d();
            final String d5 = b.d();
            if ("libcore.io.DiskLruCache".equals(d) && "1".equals(d2) && Integer.toString(this.K).equals(d3) && Integer.toString(this.M).equals(d4) && "".equals(d5)) {
                int n = 0;
                try {
                    while (true) {
                        this.L(b.d());
                        ++n;
                    }
                }
                catch (EOFException ex) {
                    this.Q = n - this.P.size();
                    if (b.c()) {
                        this.M();
                    }
                    else {
                        this.O = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.H, true), com.bumptech.glide.disklrucache.c.a));
                    }
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal header: [");
            sb.append(d);
            sb.append(", ");
            sb.append(d2);
            sb.append(", ");
            sb.append(d4);
            sb.append(", ");
            sb.append(d5);
            sb.append("]");
            throw new IOException(sb.toString());
        }
        finally {
            com.bumptech.glide.disklrucache.c.a(b);
        }
    }
    
    private void L(final String s) throws IOException {
        final int index = s.indexOf(32);
        if (index != -1) {
            final int beginIndex = index + 1;
            final int index2 = s.indexOf(32, beginIndex);
            String s2;
            if (index2 == -1) {
                final String key = s2 = s.substring(beginIndex);
                if (index == 6) {
                    s2 = key;
                    if (s.startsWith("REMOVE")) {
                        this.P.remove(key);
                        return;
                    }
                }
            }
            else {
                s2 = s.substring(beginIndex, index2);
            }
            d value;
            if ((value = this.P.get(s2)) == null) {
                value = new d(s2);
                this.P.put(s2, value);
            }
            if (index2 != -1 && index == 5 && s.startsWith("CLEAN")) {
                final String[] split = s.substring(index2 + 1).split(" ");
                value.e = true;
                value.f = null;
                value.n(split);
            }
            else if (index2 == -1 && index == 5 && s.startsWith("DIRTY")) {
                value.f = new c(value);
            }
            else if (index2 != -1 || index != 4 || !s.startsWith("READ")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("unexpected journal line: ");
                sb.append(s);
                throw new IOException(sb.toString());
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("unexpected journal line: ");
        sb2.append(s);
        throw new IOException(sb2.toString());
    }
    
    private void M() throws IOException {
        synchronized (this) {
            final Writer o = this.O;
            if (o != null) {
                o(o);
            }
            BufferedWriter o2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.I), com.bumptech.glide.disklrucache.c.a));
            try {
                o2.write("libcore.io.DiskLruCache");
                o2.write("\n");
                o2.write("1");
                o2.write("\n");
                o2.write(Integer.toString(this.K));
                o2.write("\n");
                o2.write(Integer.toString(this.M));
                o2.write("\n");
                o2.write("\n");
                for (final d d : this.P.values()) {
                    String str;
                    if (d.f != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(d.a);
                        sb.append('\n');
                        str = sb.toString();
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(d.a);
                        sb2.append(d.l());
                        sb2.append('\n');
                        str = sb2.toString();
                    }
                    o2.write(str);
                }
                o(o2);
                if (this.H.exists()) {
                    Q(this.H, this.J, true);
                }
                Q(this.I, this.H, false);
                this.J.delete();
                o2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.H, true), com.bumptech.glide.disklrucache.c.a));
                this.O = o2;
            }
            finally {
                o(o2);
            }
        }
    }
    
    private static void Q(final File file, final File dest, final boolean b) throws IOException {
        if (b) {
            s(dest);
        }
        if (file.renameTo(dest)) {
            return;
        }
        throw new IOException();
    }
    
    private void T() throws IOException {
        while (this.N > this.L) {
            this.N(this.P.entrySet().iterator().next().getKey());
        }
    }
    
    private void n() {
        if (this.O != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }
    
    @TargetApi(26)
    private static void o(final Writer writer) throws IOException {
        if (Build$VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    private void q(final c c, final boolean b) throws IOException {
        synchronized (this) {
            final d c2 = c.a;
            if (c2.f == c) {
                int i;
                final int n = i = 0;
                if (b) {
                    i = n;
                    if (!c2.e) {
                        int j = 0;
                        while (true) {
                            i = n;
                            if (j >= this.M) {
                                break;
                            }
                            if (!c.b[j]) {
                                c.a();
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Newly created entry didn't create value for index ");
                                sb.append(j);
                                throw new IllegalStateException(sb.toString());
                            }
                            if (!c2.k(j).exists()) {
                                c.a();
                                return;
                            }
                            ++j;
                        }
                    }
                }
                while (i < this.M) {
                    final File k = c2.k(i);
                    if (b) {
                        if (k.exists()) {
                            final File l = c2.j(i);
                            k.renameTo(l);
                            final long n2 = c2.b[i];
                            final long length = l.length();
                            c2.b[i] = length;
                            this.N = this.N - n2 + length;
                        }
                    }
                    else {
                        s(k);
                    }
                    ++i;
                }
                ++this.Q;
                c2.f = null;
                if (c2.e | b) {
                    c2.e = true;
                    this.O.append((CharSequence)"CLEAN");
                    this.O.append(' ');
                    this.O.append((CharSequence)c2.a);
                    this.O.append((CharSequence)c2.l());
                    this.O.append('\n');
                    if (b) {
                        final long r = this.R;
                        this.R = 1L + r;
                        c2.g = r;
                    }
                }
                else {
                    this.P.remove(c2.a);
                    this.O.append((CharSequence)"REMOVE");
                    this.O.append(' ');
                    this.O.append((CharSequence)c2.a);
                    this.O.append('\n');
                }
                x(this.O);
                if (this.N > this.L || this.G()) {
                    this.S.submit(this.T);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    private static void s(final File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
    
    private c w(final String csq, final long n) throws IOException {
        synchronized (this) {
            this.n();
            d value = this.P.get(csq);
            if (n != -1L && (value == null || value.g != n)) {
                return null;
            }
            if (value == null) {
                value = new d(csq);
                this.P.put(csq, value);
            }
            else if (value.f != null) {
                return null;
            }
            final c c = new c(value);
            value.f = c;
            this.O.append((CharSequence)"DIRTY");
            this.O.append(' ');
            this.O.append((CharSequence)csq);
            this.O.append('\n');
            x(this.O);
            return c;
        }
    }
    
    @TargetApi(26)
    private static void x(final Writer writer) throws IOException {
        if (Build$VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    public File C() {
        return this.G;
    }
    
    public long D() {
        synchronized (this) {
            return this.L;
        }
    }
    
    public boolean N(final String key) throws IOException {
        synchronized (this) {
            this.n();
            final d d = this.P.get(key);
            int i = 0;
            if (d != null && d.f == null) {
                while (i < this.M) {
                    final File j = d.j(i);
                    if (j.exists() && !j.delete()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
                        sb.append(j);
                        throw new IOException(sb.toString());
                    }
                    this.N -= d.b[i];
                    d.b[i] = 0L;
                    ++i;
                }
                ++this.Q;
                this.O.append((CharSequence)"REMOVE");
                this.O.append(' ');
                this.O.append((CharSequence)key);
                this.O.append('\n');
                this.P.remove(key);
                if (this.G()) {
                    this.S.submit(this.T);
                }
                return true;
            }
            return false;
        }
    }
    
    public void R(final long l) {
        synchronized (this) {
            this.L = l;
            this.S.submit(this.T);
        }
    }
    
    public long S() {
        synchronized (this) {
            return this.N;
        }
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this) {
            if (this.O == null) {
                return;
            }
            for (final d d : new ArrayList<d>(this.P.values())) {
                if (d.f != null) {
                    d.f.a();
                }
            }
            this.T();
            o(this.O);
            this.O = null;
        }
    }
    
    public void flush() throws IOException {
        synchronized (this) {
            this.n();
            this.T();
            x(this.O);
        }
    }
    
    public boolean isClosed() {
        synchronized (this) {
            return this.O == null;
        }
    }
    
    public void r() throws IOException {
        this.close();
        com.bumptech.glide.disklrucache.c.b(this.G);
    }
    
    public c t(final String s) throws IOException {
        return this.w(s, -1L);
    }
    
    public e y(final String s) throws IOException {
        synchronized (this) {
            this.n();
            final d d = this.P.get(s);
            if (d == null) {
                return null;
            }
            if (!d.e) {
                return null;
            }
            final File[] c = d.c;
            for (int length = c.length, i = 0; i < length; ++i) {
                if (!c[i].exists()) {
                    return null;
                }
            }
            ++this.Q;
            this.O.append((CharSequence)"READ");
            this.O.append(' ');
            this.O.append((CharSequence)s);
            this.O.append('\n');
            if (this.G()) {
                this.S.submit(this.T);
            }
            return new e(s, d.g, d.c, d.b);
        }
    }
    
    private static final class b implements ThreadFactory
    {
        @Override
        public Thread newThread(final Runnable target) {
            synchronized (this) {
                final Thread thread = new Thread(target, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
                return thread;
            }
        }
    }
    
    public final class c
    {
        private final d a;
        private final boolean[] b;
        private boolean c;
        
        private c(final d a) {
            this.a = a;
            boolean[] b;
            if (a.e) {
                b = null;
            }
            else {
                b = new boolean[com.bumptech.glide.disklrucache.a.this.M];
            }
            this.b = b;
        }
        
        private InputStream h(final int n) throws IOException {
            synchronized (com.bumptech.glide.disklrucache.a.this) {
                if (this.a.f == this) {
                    if (!this.a.e) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.a.j(n));
                    }
                    catch (FileNotFoundException ex) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }
        
        public void a() throws IOException {
            com.bumptech.glide.disklrucache.a.this.q(this, false);
        }
        
        public void b() {
            if (this.c) {
                return;
            }
            try {
                this.a();
            }
            catch (IOException ex) {}
        }
        
        public void e() throws IOException {
            com.bumptech.glide.disklrucache.a.this.q(this, true);
            this.c = true;
        }
        
        public File f(final int n) throws IOException {
            synchronized (com.bumptech.glide.disklrucache.a.this) {
                if (this.a.f == this) {
                    if (!this.a.e) {
                        this.b[n] = true;
                    }
                    final File k = this.a.k(n);
                    if (!com.bumptech.glide.disklrucache.a.this.G.exists()) {
                        com.bumptech.glide.disklrucache.a.this.G.mkdirs();
                    }
                    return k;
                }
                throw new IllegalStateException();
            }
        }
        
        public String g(final int n) throws IOException {
            final InputStream h = this.h(n);
            String c;
            if (h != null) {
                c = F(h);
            }
            else {
                c = null;
            }
            return c;
        }
        
        public void i(final int n, final String str) throws IOException {
            Closeable closeable = null;
            try {
                final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.f(n)), com.bumptech.glide.disklrucache.c.b);
                try {
                    outputStreamWriter.write(str);
                    com.bumptech.glide.disklrucache.c.a(outputStreamWriter);
                    return;
                }
                finally {
                    closeable = outputStreamWriter;
                }
            }
            finally {}
            com.bumptech.glide.disklrucache.c.a(closeable);
        }
    }
    
    private final class d
    {
        private final String a;
        private final long[] b;
        File[] c;
        File[] d;
        private boolean e;
        private c f;
        private long g;
        
        private d(final String s) {
            this.a = s;
            this.b = new long[com.bumptech.glide.disklrucache.a.this.M];
            this.c = new File[com.bumptech.glide.disklrucache.a.this.M];
            this.d = new File[com.bumptech.glide.disklrucache.a.this.M];
            final StringBuilder sb = new StringBuilder(s);
            sb.append('.');
            final int length = sb.length();
            for (int i = 0; i < com.bumptech.glide.disklrucache.a.this.M; ++i) {
                sb.append(i);
                this.c[i] = new File(com.bumptech.glide.disklrucache.a.this.G, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(com.bumptech.glide.disklrucache.a.this.G, sb.toString());
                sb.setLength(length);
            }
        }
        
        private IOException m(final String[] a) throws IOException {
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(a));
            throw new IOException(sb.toString());
        }
        
        private void n(final String[] array) throws IOException {
            if (array.length == com.bumptech.glide.disklrucache.a.this.M) {
                int i = 0;
                try {
                    while (i < array.length) {
                        this.b[i] = Long.parseLong(array[i]);
                        ++i;
                    }
                    return;
                }
                catch (NumberFormatException ex) {
                    throw this.m(array);
                }
            }
            throw this.m(array);
        }
        
        public File j(final int n) {
            return this.c[n];
        }
        
        public File k(final int n) {
            return this.d[n];
        }
        
        public String l() throws IOException {
            final StringBuilder sb = new StringBuilder();
            for (final long lng : this.b) {
                sb.append(' ');
                sb.append(lng);
            }
            return sb.toString();
        }
    }
    
    public final class e
    {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;
        
        private e(final String a, final long b, final File[] d, final long[] c) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.c = c;
        }
        
        public c a() throws IOException {
            return com.bumptech.glide.disklrucache.a.this.w(this.a, this.b);
        }
        
        public File b(final int n) {
            return this.d[n];
        }
        
        public long c(final int n) {
            return this.c[n];
        }
        
        public String d(final int n) throws IOException {
            return F(new FileInputStream(this.d[n]));
        }
    }
}
