// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

import java.io.FilterOutputStream;
import org.joda.time.t;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.TreeMap;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.joda.time.c;
import org.joda.time.format.b;
import org.joda.time.g0;
import org.joda.time.z;
import org.joda.time.format.j;
import org.joda.time.f;
import java.util.Locale;
import java.io.File;
import org.joda.time.chrono.b0;
import org.joda.time.chrono.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.a;

public class h
{
    static a e;
    static org.joda.time.a f;
    private Map<String, c> a;
    private List<d> b;
    private List<String> c;
    private List<String> d;
    
    public h() {
        this.a = new HashMap<String, c>();
        this.b = new ArrayList<d>();
        this.c = new ArrayList<String>();
        this.d = new ArrayList<String>();
    }
    
    static org.joda.time.a b() {
        if (h.f == null) {
            h.f = b0.d0(x.e0());
        }
        return h.f;
    }
    
    static a c() {
        if (h.e == null) {
            h.e = new a();
        }
        return h.e;
    }
    
    public static void d(final String[] array) throws Exception {
        if (array.length == 0) {
            l();
            return;
        }
        File parent = null;
        final int n = 0;
        File file = null;
        int i = 0;
        boolean b = false;
        while (i < array.length) {
            try {
                Label_0058: {
                    if (!"-src".equals(array[i])) {
                        break Label_0058;
                    }
                    ++i;
                    try {
                        parent = new File(array[i]);
                        Label_0103: {
                            break Label_0103;
                            ++i;
                            try {
                                file = new File(array[i]);
                                ++i;
                                continue;
                                // iftrue(Label_0109:, !"-verbose".equals((Object)array[i]))
                                // iftrue(Label_0130:, !"-?".equals((Object)array[i]))
                                Block_13: {
                                    break Block_13;
                                    Label_0109: {
                                        l();
                                    }
                                    return;
                                }
                                b = true;
                            }
                            catch (IndexOutOfBoundsException ex) {
                                l();
                                return;
                            }
                        }
                    }
                    // iftrue(Label_0088:, !"-dst".equals((Object)array[i]))
                    catch (IndexOutOfBoundsException ex2) {}
                }
            }
            catch (IndexOutOfBoundsException ex3) {}
            break;
        }
        Label_0130: {
            if (i >= array.length) {
                l();
                return;
            }
        }
        final File[] array2 = new File[array.length - i];
        for (int j = i, n2 = n; j < array.length; ++j, ++n2) {
            File file2;
            if (parent == null) {
                file2 = new File(array[j]);
            }
            else {
                file2 = new File(parent, array[j]);
            }
            array2[n2] = file2;
        }
        org.joda.time.tz.i.a(b);
        new h().a(file, array2);
    }
    
    static int f(final String s) {
        final f h = x.e0().h();
        return h.g(h.V(0L, s, Locale.ENGLISH));
    }
    
    static int g(final String s) {
        final f f = x.e0().F();
        return f.g(f.V(0L, s, Locale.ENGLISH));
    }
    
    static String h(final String s) {
        String s2 = s;
        if (s.equals("-")) {
            s2 = null;
        }
        return s2;
    }
    
    static int i(final String s) {
        final org.joda.time.format.b i = j.I();
        final z z = new z(0L, b());
        final int startsWith = s.startsWith("-") ? 1 : 0;
        if (i.o(z, s, startsWith) != ~startsWith) {
            int n = (int)z.n();
            if (startsWith == 1) {
                n = -n;
            }
            return n;
        }
        throw new IllegalArgumentException(s);
    }
    
    static int j(String lowerCase, final int n) {
        lowerCase = lowerCase.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return Integer.MIN_VALUE;
        }
        if (lowerCase.equals("maximum") || lowerCase.equals("max")) {
            return Integer.MAX_VALUE;
        }
        if (lowerCase.equals("only")) {
            return n;
        }
        return Integer.parseInt(lowerCase);
    }
    
    static char k(final char c) {
        if (c != 'G') {
            if (c != 'S') {
                if (c == 'U' || c == 'Z' || c == 'g') {
                    return 'u';
                }
                if (c != 's') {
                    if (c != 'u' && c != 'z') {
                        return 'w';
                    }
                    return 'u';
                }
            }
            return 's';
        }
        return 'u';
    }
    
    private static void l() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }
    
    static boolean m(String u, final org.joda.time.i i) {
        if (!u.equals(i.q())) {
            return true;
        }
        long t = x.e0().T().T(0L, 1850);
        final long t2 = x.e0().T().T(0L, 2050);
        int w = i.w(t);
        final int d = i.D(t);
        u = i.u(t);
        final ArrayList<Object> list = new ArrayList<Object>();
        PrintStream printStream = null;
        StringBuilder sb2 = null;
        Label_0206: {
            org.joda.time.c obj = null;
        Label_0199:
            while (true) {
                final long h = i.H(t);
                if (h == t || h > t2) {
                    long t3 = x.e0().T().T(0L, 2050);
                    final long t4 = x.e0().T().T(0L, 1850);
                    int size = list.size();
                    while (--size >= 0) {
                        final long j = i.J(t3);
                        if (j == t3) {
                            break;
                        }
                        if (j < t4) {
                            break;
                        }
                        final long n = list.get(size) - 1L;
                        if (n != j) {
                            printStream = System.out;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("*r* Error in ");
                            sb.append(i.q());
                            sb.append(" ");
                            sb.append(new org.joda.time.c(j, x.e0()));
                            sb.append(" != ");
                            obj = new org.joda.time.c(n, x.e0());
                            sb2 = sb;
                            break Label_0199;
                        }
                        t3 = j;
                    }
                    return true;
                }
                final int w2 = i.w(h);
                final int d2 = i.D(h);
                final String u2 = i.u(h);
                if (w == w2 && d == d2 && u.equals(u2)) {
                    printStream = System.out;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("*d* Error in ");
                    sb3.append(i.q());
                    sb3.append(" ");
                    obj = new org.joda.time.c(h, x.e0());
                    sb2 = sb3;
                    break;
                }
                if (u2 == null || (u2.length() < 3 && !"??".equals(u2))) {
                    printStream = System.out;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("*s* Error in ");
                    sb4.append(i.q());
                    sb4.append(" ");
                    sb4.append(new org.joda.time.c(h, x.e0()));
                    sb4.append(", nameKey=");
                    sb4.append(u2);
                    sb2 = sb4;
                    break Label_0206;
                }
                list.add(h);
                u = u2;
                w = w2;
                t = h;
            }
            sb2.append(obj);
        }
        printStream.println(sb2.toString());
        return false;
    }
    
    private void n(File parent, final org.joda.time.tz.b b, final org.joda.time.i i) throws IOException {
        if (i.b()) {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("Writing ");
            sb.append(i.q());
            out.println(sb.toString());
        }
        final File file = new File(parent, i.q());
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        parent = (File)new FileOutputStream(file);
        try {
            b.n(i.q(), (OutputStream)parent);
            ((OutputStream)parent).close();
            parent = (File)new FileInputStream(file);
            final org.joda.time.i g = b.g((InputStream)parent, i.q());
            ((InputStream)parent).close();
            if (!i.equals(g)) {
                final PrintStream out2 = System.out;
                parent = (File)new StringBuilder();
                ((StringBuilder)parent).append("*e* Error in ");
                ((StringBuilder)parent).append(i.q());
                ((StringBuilder)parent).append(": Didn't read properly from file");
                out2.println(((StringBuilder)parent).toString());
            }
        }
        finally {
            ((OutputStream)parent).close();
        }
    }
    
    static void o(final DataOutputStream dataOutputStream, final Map<String, org.joda.time.i> map) throws IOException {
        if (dataOutputStream != null) {
            final HashMap<Object, Object> hashMap = new HashMap<Object, Object>(map.size());
            final TreeMap<Short, String> treeMap = new TreeMap<Short, String>();
            final short n = 0;
            final Iterator<Map.Entry<String, org.joda.time.i>> iterator = map.entrySet().iterator();
            short s = n;
            while (iterator.hasNext()) {
                final Map.Entry<String, org.joda.time.i> entry = iterator.next();
                final String value = entry.getKey();
                short s2 = s;
                if (!hashMap.containsKey(value)) {
                    final Short value2 = s;
                    hashMap.put(value, value2);
                    treeMap.put(value2, value);
                    final short n2 = (short)(s + 1);
                    if (n2 == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                    s2 = n2;
                }
                final String q = entry.getValue().q();
                s = s2;
                if (!hashMap.containsKey(q)) {
                    final Short value3 = s2;
                    hashMap.put(q, value3);
                    treeMap.put(value3, q);
                    final short n3 = (short)(s2 + 1);
                    if (n3 == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                    s = n3;
                }
            }
            dataOutputStream.writeShort(treeMap.size());
            final Iterator<String> iterator2 = treeMap.values().iterator();
            while (iterator2.hasNext()) {
                dataOutputStream.writeUTF(iterator2.next());
            }
            dataOutputStream.writeShort(map.size());
            for (final Map.Entry<String, org.joda.time.i> entry2 : map.entrySet()) {
                dataOutputStream.writeShort(hashMap.get(entry2.getKey()));
                dataOutputStream.writeShort(hashMap.get(entry2.getValue().q()));
            }
            return;
        }
        throw new IllegalArgumentException("DataOutputStream must not be null.");
    }
    
    public Map<String, org.joda.time.i> a(File parent, File[] array) throws IOException {
        if (array != null) {
            int i = 0;
            while (i < array.length) {
                final File[] array2 = null;
                try {
                    final BufferedReader bufferedReader = new BufferedReader(new FileReader(array[i]));
                    try {
                        this.e(bufferedReader, "backward".equals(array[i].getName()));
                        bufferedReader.close();
                        ++i;
                    }
                    finally {}
                }
                finally {
                    array = array2;
                }
                if (array != null) {
                    ((BufferedReader)(Object)array).close();
                }
            }
        }
        if (parent != null) {
            if (!parent.exists() && !parent.mkdirs()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Destination directory doesn't exist and cannot be created: ");
                sb.append(parent);
                throw new IOException(sb.toString());
            }
            if (!parent.isDirectory()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Destination is not a directory: ");
                sb2.append(parent);
                throw new IOException(sb2.toString());
            }
        }
        final TreeMap<Object, org.joda.time.i> treeMap = new TreeMap<Object, org.joda.time.i>();
        final TreeMap<Object, d> treeMap2 = new TreeMap<Object, d>();
        System.out.println("Writing zoneinfo files");
        for (int j = 0; j < this.b.size(); ++j) {
            final d d = this.b.get(j);
            final org.joda.time.tz.b b = new org.joda.time.tz.b();
            d.a(b, this.a);
            final org.joda.time.i k = b.k(d.a, true);
            if (m(k.q(), k)) {
                treeMap.put(k.q(), k);
                treeMap2.put(k.q(), d);
                if (parent != null) {
                    this.n(parent, b, k);
                }
            }
        }
        for (int l = 0; l < this.c.size(); l += 2) {
            final String s = this.c.get(l);
            final String s2 = this.c.get(l + 1);
            final d d2 = treeMap2.get(s);
            if (d2 == null) {
                final PrintStream out = System.out;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Cannot find source zone '");
                sb3.append(s);
                sb3.append("' to link alias '");
                sb3.append(s2);
                sb3.append("' to");
                out.println(sb3.toString());
            }
            else {
                final org.joda.time.tz.b b2 = new org.joda.time.tz.b();
                d2.a(b2, this.a);
                final org.joda.time.i m = b2.k(s2, true);
                if (m(m.q(), m)) {
                    treeMap.put(m.q(), m);
                    if (parent != null) {
                        this.n(parent, b2, m);
                    }
                }
                treeMap.put(m.q(), m);
                if (i.b()) {
                    final PrintStream out2 = System.out;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Good link: ");
                    sb4.append(s2);
                    sb4.append(" -> ");
                    sb4.append(s);
                    sb4.append(" revived");
                    out2.println(sb4.toString());
                }
            }
        }
        for (int n = 0; n < 2; ++n) {
            for (int n2 = 0; n2 < this.d.size(); n2 += 2) {
                final String str = this.d.get(n2);
                final String s3 = this.d.get(n2 + 1);
                final org.joda.time.i i2 = treeMap.get(str);
                if (i2 == null) {
                    if (n > 0) {
                        final PrintStream out3 = System.out;
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Cannot find time zone '");
                        sb5.append(str);
                        sb5.append("' to link alias '");
                        sb5.append(s3);
                        sb5.append("' to");
                        out3.println(sb5.toString());
                    }
                }
                else {
                    treeMap.put(s3, i2);
                    if (i.b()) {
                        final PrintStream out4 = System.out;
                        final StringBuilder sb6 = new StringBuilder();
                        sb6.append("Back link: ");
                        sb6.append(s3);
                        sb6.append(" -> ");
                        sb6.append(i2.q());
                        out4.println(sb6.toString());
                    }
                }
            }
        }
        if (parent != null) {
            System.out.println("Writing ZoneInfoMap");
            final File file = new File(parent, "ZoneInfoMap");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            parent = (File)new DataOutputStream(new FileOutputStream(file));
            try {
                final TreeMap<String, org.joda.time.i> treeMap3 = new TreeMap<String, org.joda.time.i>(String.CASE_INSENSITIVE_ORDER);
                treeMap3.putAll((Map<?, ?>)treeMap);
                o((DataOutputStream)parent, treeMap3);
            }
            finally {
                ((FilterOutputStream)parent).close();
            }
        }
        return (Map<String, org.joda.time.i>)treeMap;
    }
    
    public void e(final BufferedReader bufferedReader, final boolean b) throws IOException {
    Label_0000:
        while (true) {
            d d = null;
            Label_0421: {
                String substring = null;
                StringTokenizer stringTokenizer = null;
                String nextToken = null;
                Label_0270: {
                    while (true) {
                        final String line = bufferedReader.readLine();
                        if (line == null) {
                            break Label_0421;
                        }
                        final String trim = line.trim();
                        if (trim.length() == 0) {
                            continue;
                        }
                        if (trim.charAt(0) == '#') {
                            continue;
                        }
                        final int index = line.indexOf(35);
                        substring = line;
                        if (index >= 0) {
                            substring = line.substring(0, index);
                        }
                        stringTokenizer = new StringTokenizer(substring, " \t");
                        if (Character.isWhitespace(substring.charAt(0)) && stringTokenizer.hasMoreTokens()) {
                            if (d == null) {
                                continue;
                            }
                            d.c(stringTokenizer);
                        }
                        else {
                            if (d != null) {
                                this.b.add(d);
                            }
                            if (!stringTokenizer.hasMoreTokens()) {
                                continue Label_0000;
                            }
                            nextToken = stringTokenizer.nextToken();
                            if (nextToken.equalsIgnoreCase("Rule")) {
                                break;
                            }
                            if (!nextToken.equalsIgnoreCase("Zone")) {
                                break Label_0270;
                            }
                            if (stringTokenizer.countTokens() < 4) {
                                throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                            }
                            d = new d(stringTokenizer);
                        }
                    }
                    final b b2 = new b(stringTokenizer);
                    final c c = this.a.get(b2.a);
                    if (c == null) {
                        this.a.put(b2.a, new c(b2));
                        continue;
                    }
                    c.b(b2);
                    continue;
                }
                if (nextToken.equalsIgnoreCase("Link")) {
                    final String nextToken2 = stringTokenizer.nextToken();
                    final String nextToken3 = stringTokenizer.nextToken();
                    List<String> list;
                    if (!b && !nextToken3.equals("US/Pacific-New") && !nextToken3.startsWith("Etc/") && !nextToken3.equals("GMT")) {
                        this.c.add(nextToken2);
                        list = this.c;
                    }
                    else {
                        this.d.add(nextToken2);
                        list = this.d;
                    }
                    list.add(nextToken3);
                    continue;
                }
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown line: ");
                sb.append(substring);
                out.println(sb.toString());
                continue;
            }
            if (d != null) {
                this.b.add(d);
            }
        }
    }
    
    static class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;
        public final char f;
        
        a() {
            this.a = 1;
            this.b = 1;
            this.c = 0;
            this.d = false;
            this.e = 0;
            this.f = 119;
        }
        
        a(final StringTokenizer stringTokenizer) {
            final boolean hasMoreTokens = stringTokenizer.hasMoreTokens();
            int c = 0;
            int a = 1;
            int k = 119;
            int b = 0;
            boolean d = false;
            int i = 0;
            Label_0366: {
                if (hasMoreTokens) {
                    a = h.g(stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        final String nextToken = stringTokenizer.nextToken();
                        Label_0166: {
                            Label_0067: {
                                if (!nextToken.startsWith("last")) {
                                    try {
                                        b = Integer.parseInt(nextToken);
                                        c = 0;
                                    }
                                    catch (NumberFormatException ex) {
                                        final int index = nextToken.indexOf(">=");
                                        if (index > 0) {
                                            b = Integer.parseInt(nextToken.substring(index + 2));
                                            c = h.f(nextToken.substring(0, index));
                                            d = true;
                                            break Label_0166;
                                        }
                                        final int index2 = nextToken.indexOf("<=");
                                        if (index2 <= 0) {
                                            throw new IllegalArgumentException(nextToken);
                                        }
                                        b = Integer.parseInt(nextToken.substring(index2 + 2));
                                        c = h.f(nextToken.substring(0, index2));
                                    }
                                    break Label_0067;
                                }
                                c = h.f(nextToken.substring(4));
                                b = -1;
                            }
                            d = false;
                        }
                        Label_0342: {
                            if (stringTokenizer.hasMoreTokens()) {
                                final String nextToken2 = stringTokenizer.nextToken();
                                k = h.k(nextToken2.charAt(nextToken2.length() - 1));
                                String s = nextToken2;
                                if (nextToken2.equals("24:00")) {
                                    if (a != 12 || b != 31) {
                                        t t2;
                                        if (b == -1) {
                                            final t t = new t(2001, a, 1);
                                            t2 = t.n0(1);
                                        }
                                        else {
                                            final t t = new t(2001, a, b);
                                            t2 = t.l0(1);
                                        }
                                        d = (b != -1 && c != 0);
                                        a = t2.f3();
                                        final int x3 = t2.X3();
                                        int n = c;
                                        if (c != 0) {
                                            n = (c - 1 + 1) % 7 + 1;
                                        }
                                        c = n;
                                        b = x3;
                                        break Label_0342;
                                    }
                                    s = "23:59:59.999";
                                }
                                i = h.i(s);
                                break Label_0366;
                            }
                        }
                        i = 0;
                        break Label_0366;
                    }
                }
                i = 0;
                b = 1;
                d = false;
            }
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = i;
            this.f = (char)k;
        }
        
        public void a(final org.joda.time.tz.b b, final int n) {
            b.a(n, this.f, this.a, this.b, this.c, this.d, this.e);
        }
        
        public void b(final org.joda.time.tz.b b, final String s, final int n, final int n2, final int n3) {
            b.b(s, n, n2, n3, this.f, this.a, this.b, this.c, this.d, this.e);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("MonthOfYear: ");
            sb.append(this.a);
            sb.append("\nDayOfMonth: ");
            sb.append(this.b);
            sb.append("\nDayOfWeek: ");
            sb.append(this.c);
            sb.append("\nAdvanceDayOfWeek: ");
            sb.append(this.d);
            sb.append("\nMillisOfDay: ");
            sb.append(this.e);
            sb.append("\nZoneChar: ");
            sb.append(this.f);
            sb.append("\n");
            return sb.toString();
        }
    }
    
    private static class b
    {
        public final String a;
        public final int b;
        public final int c;
        public final String d;
        public final a e;
        public final int f;
        public final String g;
        
        b(final StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() < 6) {
                throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
            }
            this.a = stringTokenizer.nextToken().intern();
            final int j = h.j(stringTokenizer.nextToken(), 0);
            if ((this.c = h.j(stringTokenizer.nextToken(), j)) >= (this.b = j)) {
                this.d = h.h(stringTokenizer.nextToken());
                this.e = new a(stringTokenizer);
                this.f = h.i(stringTokenizer.nextToken());
                this.g = h.h(stringTokenizer.nextToken());
                return;
            }
            throw new IllegalArgumentException();
        }
        
        b(final b b) {
            this.a = b.a;
            this.b = 1800;
            this.c = b.b;
            this.d = null;
            this.e = b.e;
            this.f = 0;
            this.g = b.g;
        }
        
        private static String b(String s, int index, final String str) {
            final int index2 = s.indexOf(47);
            if (index2 > 0) {
                if (index == 0) {
                    s = s.substring(0, index2);
                }
                else {
                    s = s.substring(index2 + 1);
                }
                return s.intern();
            }
            index = s.indexOf("%s");
            if (index < 0) {
                return s;
            }
            final String substring = s.substring(0, index);
            final String substring2 = s.substring(index + 2);
            if (str == null) {
                s = substring.concat(substring2);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append(str);
                sb.append(substring2);
                s = sb.toString();
            }
            return s.intern();
        }
        
        public void a(final org.joda.time.tz.b b, int n, String b2) {
            n = this.f + -n;
            b2 = b(b2, n, this.g);
            this.e.b(b, b2, n, this.b, this.c);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("[Rule]\nName: ");
            sb.append(this.a);
            sb.append("\nFromYear: ");
            sb.append(this.b);
            sb.append("\nToYear: ");
            sb.append(this.c);
            sb.append("\nType: ");
            sb.append(this.d);
            sb.append("\n");
            sb.append(this.e);
            sb.append("SaveMillis: ");
            sb.append(this.f);
            sb.append("\nLetterS: ");
            sb.append(this.g);
            sb.append("\n");
            return sb.toString();
        }
    }
    
    private static class c
    {
        private List<b> a;
        
        c(final b b) {
            (this.a = new ArrayList<b>()).add(b);
        }
        
        public void a(final org.joda.time.tz.b b, int i, final String s) {
            final int n = 0;
            int j = 0;
            int a = 0;
            while (j < this.a.size()) {
                final int f = this.a.get(j).f;
                int min = a;
                if (f < 0) {
                    min = Math.min(a, f);
                }
                ++j;
                a = min;
            }
            int n2 = i;
            String string = s;
            if (a < 0) {
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append("Fixed negative save values for rule '");
                sb.append(this.a.get(0).a);
                sb.append("'");
                out.println(sb.toString());
                i += a;
                final int index = s.indexOf("/");
                n2 = i;
                string = s;
                if (index > 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s.substring(index + 1));
                    sb2.append("/");
                    sb2.append(s.substring(0, index));
                    string = sb2.toString();
                    n2 = i;
                }
            }
            b.j(n2);
            i = n;
            if (a < 0) {
                new b((b)this.a.get(0)).a(b, a, string);
                i = n;
            }
            while (i < this.a.size()) {
                this.a.get(i).a(b, a, string);
                ++i;
            }
        }
        
        void b(final b b) {
            if (b.a.equals(this.a.get(0).a)) {
                this.a.add(b);
                return;
            }
            throw new IllegalArgumentException("Rule name mismatch");
        }
    }
    
    private static class d
    {
        public final String a;
        public final int b;
        public final String c;
        public final String d;
        public final int e;
        public final a f;
        private d g;
        
        private d(final String s, final StringTokenizer stringTokenizer) {
            this.a = s.intern();
            this.b = h.i(stringTokenizer.nextToken());
            this.c = h.h(stringTokenizer.nextToken());
            this.d = stringTokenizer.nextToken().intern();
            Object c = h.c();
            int int1;
            if (stringTokenizer.hasMoreTokens()) {
                int1 = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    c = new a(stringTokenizer);
                    int1 = int1;
                }
            }
            else {
                int1 = Integer.MAX_VALUE;
            }
            this.e = int1;
            this.f = (a)c;
        }
        
        d(final StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }
        
        private static void b(d g, final org.joda.time.tz.b b, final Map<String, c> map) {
            while (g != null) {
                final String c = g.c;
                Label_0096: {
                    if (c != null) {
                        Label_0130: {
                            try {
                                final int i = h.i(c);
                                b.j(g.b);
                                b.i(g.d, i);
                            }
                            catch (Exception ex) {
                                final c c2 = map.get(g.c);
                                if (c2 == null) {
                                    break Label_0130;
                                }
                                c2.a(b, g.b, g.d);
                            }
                            break Label_0096;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Rules not found: ");
                        sb.append(g.c);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    b.j(g.b);
                    b.i(g.d, 0);
                }
                final int e = g.e;
                if (e == Integer.MAX_VALUE) {
                    break;
                }
                g.f.a(b, e);
                g = g.g;
            }
        }
        
        public void a(final org.joda.time.tz.b b, final Map<String, c> map) {
            b(this, b, map);
        }
        
        void c(final StringTokenizer stringTokenizer) {
            final d g = this.g;
            if (g != null) {
                g.c(stringTokenizer);
            }
            else {
                this.g = new d(this.a, stringTokenizer);
            }
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("[Zone]\nName: ");
            sb.append(this.a);
            sb.append("\nOffsetMillis: ");
            sb.append(this.b);
            sb.append("\nRules: ");
            sb.append(this.c);
            sb.append("\nFormat: ");
            sb.append(this.d);
            sb.append("\nUntilYear: ");
            sb.append(this.e);
            sb.append("\n");
            sb.append(this.f);
            final String string = sb.toString();
            if (this.g == null) {
                return string;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("...\n");
            sb2.append(this.g.toString());
            return sb2.toString();
        }
    }
}
