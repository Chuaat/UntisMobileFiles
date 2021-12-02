// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.persistence;

import java.io.Writer;
import com.google.firebase.crashlytics.internal.common.p;
import java.util.Arrays;
import java.util.Locale;
import java.util.Collection;
import java.io.FileFilter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import com.google.firebase.crashlytics.internal.model.b0;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.firebase.crashlytics.internal.f;
import com.google.firebase.crashlytics.internal.model.a0;
import java.util.Collections;
import java.util.List;
import androidx.annotation.k0;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import com.google.firebase.crashlytics.internal.settings.e;
import androidx.annotation.j0;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.File;
import java.util.Comparator;
import java.nio.charset.Charset;
import java.io.FilenameFilter;

public class g
{
    private static final FilenameFilter A;
    private static final Charset g;
    private static final int h = 8;
    private static final String i = "report-persistence";
    private static final String j = "sessions";
    private static final String k = "priority-reports";
    private static final String l = "native-reports";
    private static final String m = "reports";
    private static final String n = "report";
    private static final String o = "user";
    private static final String p = "app-exit-info";
    private static final String q = "start-time";
    private static final String r = "event";
    private static final int s = 10;
    private static final String t = "%010d";
    private static final int u;
    private static final String v = "_";
    private static final String w = "";
    private static final String x = "anr";
    private static final com.google.firebase.crashlytics.internal.model.serialization.g y;
    private static final Comparator<? super File> z;
    @j0
    private final AtomicInteger a;
    @j0
    private final File b;
    @j0
    private final File c;
    @j0
    private final File d;
    @j0
    private final File e;
    @j0
    private final e f;
    
    static {
        g = Charset.forName("UTF-8");
        u = 15;
        y = new com.google.firebase.crashlytics.internal.model.serialization.g();
        z = com.google.firebase.crashlytics.internal.persistence.e.G;
        A = d.a;
    }
    
    public g(@j0 File parent, @j0 final e f) {
        this.a = new AtomicInteger(0);
        parent = new File(parent, "report-persistence");
        this.b = new File(parent, "sessions");
        this.c = new File(parent, "priority-reports");
        this.d = new File(parent, "reports");
        this.e = new File(parent, "native-reports");
        this.f = f;
    }
    
    private static boolean G(@j0 final File file) {
        return file.exists() || file.mkdirs();
    }
    
    private static int H(@j0 final File file, @j0 final File file2) {
        return s(file.getName()).compareTo(s(file2.getName()));
    }
    
    @j0
    private static File M(@j0 final File obj) throws IOException {
        if (G(obj)) {
            return obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not create directory ");
        sb.append(obj);
        throw new IOException(sb.toString());
    }
    
    @j0
    private static String N(@j0 File file) throws IOException {
        final byte[] array = new byte[8192];
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        file = (File)new FileInputStream(file);
        try {
            while (true) {
                final int read = ((FileInputStream)file).read(array);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(array, 0, read);
            }
            final String s = new String(byteArrayOutputStream.toByteArray(), com.google.firebase.crashlytics.internal.persistence.g.g);
            ((FileInputStream)file).close();
            return s;
        }
        finally {
            try {
                ((FileInputStream)file).close();
            }
            finally {
                final Throwable t;
                final Throwable exception;
                t.addSuppressed(exception);
            }
        }
    }
    
    private static void O(@k0 final File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                O(listFiles[i]);
            }
        }
        file.delete();
    }
    
    @j0
    private static List<File> P(@j0 final List<File>... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            Collections.sort(array[i], com.google.firebase.crashlytics.internal.persistence.g.z);
        }
        return j(array);
    }
    
    private static void Q(@j0 final File obj, @j0 final File file, @j0 final a0.e e, @j0 final String child) {
        try {
            final com.google.firebase.crashlytics.internal.model.serialization.g y = com.google.firebase.crashlytics.internal.persistence.g.y;
            U(new File(M(file), child), y.G(y.F(N(obj)).n(e)));
        }
        catch (IOException ex) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not synthesize final native report file for ");
            sb.append(obj);
            f.n(sb.toString(), (Throwable)ex);
        }
    }
    
    private void R(@j0 File file, final long n) {
        final List<File> u = u(file, com.google.firebase.crashlytics.internal.persistence.g.A);
        if (u.isEmpty()) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Session ");
            sb.append(file.getName());
            sb.append(" has no events.");
            f.k(sb.toString());
            return;
        }
        Collections.sort((List<Comparable>)u);
        final ArrayList<a0.f.d> list = new ArrayList<a0.f.d>();
        final Iterator<File> iterator = u.iterator();
        boolean b = false;
    Label_0095:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                final File obj = iterator.next();
                try {
                    list.add(com.google.firebase.crashlytics.internal.persistence.g.y.i(N(obj)));
                    if (!b && !y(obj.getName())) {
                        continue Label_0095;
                    }
                    b = true;
                }
                catch (IOException ex) {
                    final f f2 = com.google.firebase.crashlytics.internal.f.f();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not add event to report for ");
                    sb2.append(obj);
                    f2.n(sb2.toString(), (Throwable)ex);
                }
            }
            break;
        }
        if (list.isEmpty()) {
            final f f3 = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not parse event files for session ");
            sb3.append(file.getName());
            f3.m(sb3.toString());
            return;
        }
        final String s = null;
        final File file2 = new File(file, "user");
        String n2 = s;
        if (file2.isFile()) {
            try {
                n2 = N(file2);
            }
            catch (IOException ex2) {
                final f f4 = com.google.firebase.crashlytics.internal.f.f();
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Could not read user ID file in ");
                sb4.append(file.getName());
                f4.n(sb4.toString(), (Throwable)ex2);
                n2 = s;
            }
        }
        final File file3 = new File(file, "report");
        if (b) {
            file = this.c;
        }
        else {
            file = this.d;
        }
        S(file3, file, list, n, b, n2);
    }
    
    private static void S(@j0 final File obj, @j0 final File file, @j0 final List<a0.f.d> list, final long n, final boolean b, @k0 final String s) {
        try {
            final com.google.firebase.crashlytics.internal.model.serialization.g y = com.google.firebase.crashlytics.internal.persistence.g.y;
            final a0 m = y.F(N(obj)).p(n, b, s).m(b0.b(list));
            final a0.f j = m.j();
            if (j == null) {
                return;
            }
            U(new File(M(file), j.h()), y.G(m));
        }
        catch (IOException ex) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not synthesize final report file for ");
            sb.append(obj);
            f.n(sb.toString(), (Throwable)ex);
        }
    }
    
    private static int T(@j0 final File file, final int n) {
        final List<File> u = u(file, c.a);
        Collections.sort((List<Object>)u, com.google.firebase.crashlytics.internal.persistence.f.G);
        return h(u, n);
    }
    
    private static void U(File file, final String str) throws IOException {
        file = (File)new OutputStreamWriter(new FileOutputStream(file), com.google.firebase.crashlytics.internal.persistence.g.g);
        try {
            ((Writer)file).write(str);
            ((OutputStreamWriter)file).close();
        }
        finally {
            try {
                ((OutputStreamWriter)file).close();
            }
            finally {
                final Throwable exception;
                ((Throwable)str).addSuppressed(exception);
            }
        }
    }
    
    private static void V(final File file, final String str, final long n) throws IOException {
        final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), com.google.firebase.crashlytics.internal.persistence.g.g);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(k(n));
            outputStreamWriter.close();
        }
        finally {
            try {
                outputStreamWriter.close();
            }
            finally {
                final Throwable exception;
                ((Throwable)file).addSuppressed(exception);
            }
        }
    }
    
    @j0
    private List<File> g(@k0 final String s) {
        final List<File> t = t(this.b, new a(s));
        Collections.sort((List<Object>)t, (Comparator<? super Object>)com.google.firebase.crashlytics.internal.persistence.g.z);
        if (t.size() <= 8) {
            return t;
        }
        final Iterator<File> iterator = t.subList(8, t.size()).iterator();
        while (iterator.hasNext()) {
            O(iterator.next());
        }
        return t.subList(0, 8);
    }
    
    private static int h(final List<File> list, final int n) {
        int size = list.size();
        for (final File file : list) {
            if (size <= n) {
                return size;
            }
            O(file);
            --size;
        }
        return size;
    }
    
    private void i() {
        final int b = this.f.b().e().b;
        final List<File> r = this.r();
        final int size = r.size();
        if (size <= b) {
            return;
        }
        final Iterator<File> iterator = r.subList(b, size).iterator();
        while (iterator.hasNext()) {
            iterator.next().delete();
        }
    }
    
    @j0
    private static List<File> j(@j0 final List<File>... array) {
        final ArrayList<File> list = new ArrayList<File>();
        final int length = array.length;
        final int n = 0;
        int i = 0;
        int minCapacity = 0;
        while (i < length) {
            minCapacity += array[i].size();
            ++i;
        }
        list.ensureCapacity(minCapacity);
        for (int length2 = array.length, j = n; j < length2; ++j) {
            list.addAll(array[j]);
        }
        return list;
    }
    
    private static long k(final long n) {
        return n * 1000L;
    }
    
    @j0
    private static String p(final int i, final boolean b) {
        final String format = String.format(Locale.US, "%010d", i);
        String str;
        if (b) {
            str = "_";
        }
        else {
            str = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("event");
        sb.append(format);
        sb.append(str);
        return sb.toString();
    }
    
    @j0
    private static List<File> q(@j0 final File file) {
        return t(file, null);
    }
    
    @j0
    private List<File> r() {
        return P(j(q(this.c), q(this.e)), q(this.d));
    }
    
    @j0
    private static String s(@j0 final String s) {
        return s.substring(0, com.google.firebase.crashlytics.internal.persistence.g.u);
    }
    
    @j0
    private static List<File> t(@j0 final File file, @k0 final FileFilter filter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] a;
        if (filter == null) {
            a = file.listFiles();
        }
        else {
            a = file.listFiles(filter);
        }
        List<File> list;
        if (a != null) {
            list = Arrays.asList(a);
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    @j0
    private static List<File> u(@j0 final File file, @k0 final FilenameFilter filter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] a;
        if (filter == null) {
            a = file.listFiles();
        }
        else {
            a = file.listFiles(filter);
        }
        List<File> list;
        if (a != null) {
            list = Arrays.asList(a);
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    @j0
    private File v(@j0 final String child) {
        return new File(this.b, child);
    }
    
    private static boolean y(@j0 final String s) {
        return s.startsWith("event") && s.endsWith("_");
    }
    
    private static boolean z(@j0 final File file, @j0 final String s) {
        return s.startsWith("event") && !s.endsWith("_");
    }
    
    @j0
    public List<String> E() {
        final List<File> q = q(this.b);
        Collections.sort((List<Object>)q, (Comparator<? super Object>)com.google.firebase.crashlytics.internal.persistence.g.z);
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<File> iterator = q.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getName());
        }
        return list;
    }
    
    @j0
    public List<p> F() {
        final List<File> r = this.r();
        final ArrayList<p> list = new ArrayList<p>();
        list.ensureCapacity(r.size());
        for (final File obj : this.r()) {
            try {
                list.add(com.google.firebase.crashlytics.internal.common.p.a(com.google.firebase.crashlytics.internal.persistence.g.y.F(N(obj)), obj.getName()));
            }
            catch (IOException ex) {
                final f f = com.google.firebase.crashlytics.internal.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not load report file ");
                sb.append(obj);
                sb.append("; deleting");
                f.n(sb.toString(), (Throwable)ex);
                obj.delete();
            }
        }
        return list;
    }
    
    public void I(@j0 final a0.f.d d, @j0 final String s) {
        this.J(d, s, false);
    }
    
    public void J(@j0 final a0.f.d d, @j0 final String str, final boolean b) {
        final int a = this.f.b().e().a;
        final File v = this.v(str);
        final String j = com.google.firebase.crashlytics.internal.persistence.g.y.j(d);
        final String p3 = p(this.a.getAndIncrement(), b);
        try {
            U(new File(v, p3), j);
        }
        catch (IOException ex) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not persist event for session ");
            sb.append(str);
            f.n(sb.toString(), (Throwable)ex);
        }
        T(v, a);
    }
    
    public void K(@j0 final a0 a0) {
        final a0.f j = a0.j();
        if (j == null) {
            com.google.firebase.crashlytics.internal.f.f().b("Could not get session for report");
            return;
        }
        final String h = j.h();
        try {
            final File m = M(this.v(h));
            U(new File(m, "report"), com.google.firebase.crashlytics.internal.persistence.g.y.G(a0));
            V(new File(m, "start-time"), "", j.k());
        }
        catch (IOException ex) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not persist report for session ");
            sb.append(h);
            f.c(sb.toString(), (Throwable)ex);
        }
    }
    
    public void L(@j0 final String s, @j0 final String str) {
        final File v = this.v(str);
        try {
            U(new File(v, "user"), s);
        }
        catch (IOException ex) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not persist user ID for session ");
            sb.append(str);
            f.n(sb.toString(), (Throwable)ex);
        }
    }
    
    public void l() {
        final Iterator<File> iterator = this.r().iterator();
        while (iterator.hasNext()) {
            iterator.next().delete();
        }
    }
    
    public void m(final String s) {
        final b b = new b(s);
        final Iterator<File> iterator = j(u(this.c, b), u(this.e, b), u(this.d, b)).iterator();
        while (iterator.hasNext()) {
            iterator.next().delete();
        }
    }
    
    public void n(@k0 final String s, final long n) {
        for (final File file : this.g(s)) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Finalizing report for session ");
            sb.append(file.getName());
            f.k(sb.toString());
            this.R(file, n);
            O(file);
        }
        this.i();
    }
    
    public void o(@j0 final String s, @j0 final a0.e e) {
        Q(new File(this.v(s), "report"), this.e, e, s);
    }
    
    public long w(final String s) {
        return new File(this.v(s), "start-time").lastModified();
    }
    
    public boolean x() {
        return this.r().isEmpty() ^ true;
    }
}
