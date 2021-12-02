// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.response;

import android.util.Log;
import java.io.Reader;
import java.io.InputStreamReader;
import androidx.annotation.RecentlyNonNull;
import java.io.InputStream;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.util.c;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import androidx.annotation.k0;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.google.android.gms.common.internal.b0;

@b0
@f2.a
public class b<T extends com.google.android.gms.common.server.response.a>
{
    private static final char[] g;
    private static final char[] h;
    private static final char[] i;
    private static final char[] j;
    private static final char[] k;
    private static final char[] l;
    private static final b<Integer> m;
    private static final b<Long> n;
    private static final b<Float> o;
    private static final b<Double> p;
    private static final b<Boolean> q;
    private static final b<String> r;
    private static final b<BigInteger> s;
    private static final b<BigDecimal> t;
    private final char[] a;
    private final char[] b;
    private final char[] c;
    private final StringBuilder d;
    private final StringBuilder e;
    private final Stack<Integer> f;
    
    static {
        g = new char[] { 'u', 'l', 'l' };
        h = new char[] { 'r', 'u', 'e' };
        i = new char[] { 'r', 'u', 'e', '\"' };
        j = new char[] { 'a', 'l', 's', 'e' };
        k = new char[] { 'a', 'l', 's', 'e', '\"' };
        l = new char[] { '\n' };
        m = (b)new e();
        n = (b)new g();
        o = (b)new f();
        p = (b)new i();
        q = (b)new h();
        r = (b)new k();
        s = (b)new j();
        t = (b)new l();
    }
    
    public b() {
        this.a = new char[1];
        this.b = new char[32];
        this.c = new char[1024];
        this.d = new StringBuilder(32);
        this.e = new StringBuilder(1024);
        this.f = new Stack<Integer>();
    }
    
    @k0
    private final BigDecimal A(final BufferedReader bufferedReader) throws a, IOException {
        final int c = this.c(bufferedReader, this.c);
        if (c == 0) {
            return null;
        }
        return new BigDecimal(new String(this.c, 0, c));
    }
    
    private final char B(final BufferedReader bufferedReader) throws a, IOException {
        if (bufferedReader.read(this.a) == -1) {
            return '\0';
        }
        while (Character.isWhitespace(this.a[0])) {
            if (bufferedReader.read(this.a) == -1) {
                return '\0';
            }
        }
        return this.a[0];
    }
    
    private final int c(final BufferedReader bufferedReader, final char[] array) throws a, IOException {
        final char b = this.B(bufferedReader);
        if (b == '\0') {
            throw new a("Unexpected EOF");
        }
        if (b == ',') {
            throw new a("Missing value");
        }
        if (b == 'n') {
            this.o(bufferedReader, com.google.android.gms.common.server.response.b.g);
            return 0;
        }
        bufferedReader.mark(1024);
        int n2;
        if (b == '\"') {
            int off = 0;
            int n = 0;
            while (true) {
                n2 = off;
                if (off >= array.length) {
                    break;
                }
                n2 = off;
                if (bufferedReader.read(array, off, 1) == -1) {
                    break;
                }
                final char ch = array[off];
                if (Character.isISOControl(ch)) {
                    throw new a("Unexpected control character while reading string");
                }
                if (ch == '\"' && n == 0) {
                    bufferedReader.reset();
                    bufferedReader.skip(off + 1);
                    return off;
                }
                int n3;
                if (ch == '\\') {
                    n3 = (n ^ 0x1);
                }
                else {
                    n3 = 0;
                }
                ++off;
                n = n3;
            }
        }
        else {
            array[0] = b;
            int off2 = 1;
            while (true) {
                n2 = off2;
                if (off2 >= array.length) {
                    break;
                }
                n2 = off2;
                if (bufferedReader.read(array, off2, 1) == -1) {
                    break;
                }
                if (array[off2] == '}' || array[off2] == ',' || Character.isWhitespace(array[off2]) || array[off2] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(off2 - 1);
                    array[off2] = 0;
                    return off2;
                }
                ++off2;
            }
        }
        if (n2 == array.length) {
            throw new a("Absurdly long value");
        }
        throw new a("Unexpected EOF");
    }
    
    @k0
    private final String d(final BufferedReader bufferedReader) throws a, IOException {
        this.f.push(2);
        final char b = this.B(bufferedReader);
        if (b != '\"') {
            if (b == ']') {
                this.h(2);
                this.h(1);
                this.h(5);
                return null;
            }
            if (b == '}') {
                this.h(2);
                return null;
            }
            final StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(b);
            throw new a(sb.toString());
        }
        else {
            this.f.push(3);
            final String n = n(bufferedReader, this.b, this.d, null);
            this.h(3);
            if (this.B(bufferedReader) == ':') {
                return n;
            }
            throw new a("Expected key/value separator");
        }
    }
    
    @k0
    private final String e(final BufferedReader bufferedReader, final char[] array, final StringBuilder sb, @k0 final char[] array2) throws a, IOException {
        final char b = this.B(bufferedReader);
        if (b == '\"') {
            return n(bufferedReader, array, sb, array2);
        }
        if (b == 'n') {
            this.o(bufferedReader, com.google.android.gms.common.server.response.b.g);
            return null;
        }
        throw new a("Expected string");
    }
    
    @k0
    private final <T extends com.google.android.gms.common.server.response.a> ArrayList<T> f(final BufferedReader bufferedReader, final com.google.android.gms.common.server.response.a.a<?, ?> a) throws a, IOException {
        final ArrayList<T> list = new ArrayList<T>();
        final char b = this.B(bufferedReader);
        if (b == ']') {
            this.h(5);
            return list;
        }
        if (b != 'n') {
            if (b == '{') {
                Stack<Integer> stack = this.f;
                while (true) {
                    stack.push(1);
                    try {
                        final com.google.android.gms.common.server.response.a u5 = a.U5();
                        if (!this.j(bufferedReader, u5)) {
                            return list;
                        }
                        list.add((T)u5);
                        final char b2 = this.B(bufferedReader);
                        if (b2 != ',') {
                            if (b2 == ']') {
                                this.h(5);
                                return list;
                            }
                            final StringBuilder sb = new StringBuilder(19);
                            sb.append("Unexpected token: ");
                            sb.append(b2);
                            throw new a(sb.toString());
                        }
                        else {
                            if (this.B(bufferedReader) == '{') {
                                stack = this.f;
                                continue;
                            }
                            throw new a("Expected start of next object in array");
                        }
                    }
                    catch (IllegalAccessException ex) {
                        throw new a("Error instantiating inner object", ex);
                    }
                    catch (InstantiationException ex2) {
                        throw new a("Error instantiating inner object", ex2);
                    }
                    break;
                }
            }
            final StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Unexpected token: ");
            sb2.append(b);
            throw new a(sb2.toString());
        }
        this.o(bufferedReader, com.google.android.gms.common.server.response.b.g);
        this.h(5);
        return null;
    }
    
    @k0
    private final <O> ArrayList<O> g(final BufferedReader bufferedReader, final b<O> b) throws a, IOException {
        final char b2 = this.B(bufferedReader);
        if (b2 == 'n') {
            this.o(bufferedReader, b.g);
            return null;
        }
        if (b2 != '[') {
            throw new a("Expected start of array");
        }
        this.f.push(5);
        final ArrayList<O> list = new ArrayList<O>();
        while (true) {
            bufferedReader.mark(1024);
            final char b3 = this.B(bufferedReader);
            if (b3 == '\0') {
                throw new a("Unexpected EOF");
            }
            if (b3 == ',') {
                continue;
            }
            if (b3 == ']') {
                this.h(5);
                return list;
            }
            bufferedReader.reset();
            list.add(b.a(this, bufferedReader));
        }
    }
    
    private final void h(final int n) throws a {
        if (this.f.isEmpty()) {
            final StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(n);
            sb.append(" but had empty stack");
            throw new a(sb.toString());
        }
        final int intValue = this.f.pop();
        if (intValue == n) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(n);
        sb2.append(" but had ");
        sb2.append(intValue);
        throw new a(sb2.toString());
    }
    
    private final boolean j(final BufferedReader bufferedReader, final com.google.android.gms.common.server.response.a a) throws a, IOException {
        final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> c = a.c();
        String s = this.d(bufferedReader);
        final Integer value = 1;
        if (s == null) {
            this.h(1);
            return false;
        }
    Label_0489_Outer:
        while (s != null) {
            final com.google.android.gms.common.server.response.a.a<?, ?> a2 = c.get(s);
            if (a2 == null) {
                s = this.m(bufferedReader);
            }
            else {
                this.f.push(4);
                switch (a2.H) {
                    default: {
                        final int h = a2.H;
                        final StringBuilder sb = new StringBuilder(30);
                        sb.append("Invalid field type ");
                        sb.append(h);
                        throw new a(sb.toString());
                    }
                    case 11: {
                        if (a2.I) {
                            final char b = this.B(bufferedReader);
                            if (b == 'n') {
                                this.o(bufferedReader, com.google.android.gms.common.server.response.b.g);
                                a.a(a2, a2.L, (ArrayList<com.google.android.gms.common.server.response.a>)null);
                                break;
                            }
                            this.f.push(5);
                            if (b == '[') {
                                a.a(a2, a2.L, this.f(bufferedReader, a2));
                                break;
                            }
                            throw new a("Expected array start");
                        }
                        else {
                            final char b2 = this.B(bufferedReader);
                            if (b2 == 'n') {
                                this.o(bufferedReader, com.google.android.gms.common.server.response.b.g);
                                a.b(a2, a2.L, (com.google.android.gms.common.server.response.a)null);
                                break;
                            }
                            this.f.push(value);
                            if (b2 == '{') {
                                try {
                                    final com.google.android.gms.common.server.response.a u5 = a2.U5();
                                    this.j(bufferedReader, u5);
                                    a.b(a2, a2.L, u5);
                                    break;
                                }
                                catch (IllegalAccessException ex) {
                                    throw new a("Error instantiating inner object", ex);
                                }
                                catch (InstantiationException ex2) {
                                    throw new a("Error instantiating inner object", ex2);
                                }
                            }
                            throw new a("Expected start of object");
                        }
                        break;
                    }
                    case 10: {
                        final char b3 = this.B(bufferedReader);
                        HashMap<String, String> hashMap = null;
                        Label_0665: {
                            if (b3 == 'n') {
                                this.o(bufferedReader, com.google.android.gms.common.server.response.b.g);
                                hashMap = null;
                            }
                            else {
                                if (b3 == '{') {
                                    this.f.push(value);
                                    hashMap = new HashMap<String, String>();
                                    String n = null;
                                    Block_16: {
                                        Block_14: {
                                            char b5 = '\0';
                                            while (true) {
                                                Block_18: {
                                                    while (true) {
                                                        final char b4 = this.B(bufferedReader);
                                                        if (b4 == '\0') {
                                                            throw new a("Unexpected EOF");
                                                        }
                                                        if (b4 != '\"') {
                                                            if (b4 != '}') {
                                                                continue Label_0489_Outer;
                                                            }
                                                            break;
                                                        }
                                                        else {
                                                            n = n(bufferedReader, this.b, this.d, null);
                                                            if (this.B(bufferedReader) != ':') {
                                                                break Block_14;
                                                            }
                                                            if (this.B(bufferedReader) != '\"') {
                                                                break Block_16;
                                                            }
                                                            hashMap.put(n, n(bufferedReader, this.b, this.d, null));
                                                            b5 = this.B(bufferedReader);
                                                            if (b5 != ',') {
                                                                break Block_18;
                                                            }
                                                            continue Label_0489_Outer;
                                                        }
                                                    }
                                                    this.h(1);
                                                    break Label_0665;
                                                }
                                                if (b5 == '}') {
                                                    continue;
                                                }
                                                break;
                                            }
                                            final StringBuilder sb2 = new StringBuilder(48);
                                            sb2.append("Unexpected character while parsing string map: ");
                                            sb2.append(b5);
                                            throw new a(sb2.toString());
                                        }
                                        final String value2 = String.valueOf(n);
                                        String concat;
                                        if (value2.length() != 0) {
                                            concat = "No map value found for key ".concat(value2);
                                        }
                                        else {
                                            concat = new String("No map value found for key ");
                                        }
                                        throw new a(concat);
                                    }
                                    final String value3 = String.valueOf(n);
                                    String concat2;
                                    if (value3.length() != 0) {
                                        concat2 = "Expected String value for key ".concat(value3);
                                    }
                                    else {
                                        concat2 = new String("Expected String value for key ");
                                    }
                                    throw new a(concat2);
                                }
                                throw new a("Expected start of a map object");
                            }
                        }
                        a.C((com.google.android.gms.common.server.response.a.a<Map<String, String>, Object>)a2, hashMap);
                        break;
                    }
                    case 9: {
                        a.E((com.google.android.gms.common.server.response.a.a<byte[], Object>)a2, com.google.android.gms.common.util.c.b(this.e(bufferedReader, this.c, this.e, com.google.android.gms.common.server.response.b.l)));
                        break;
                    }
                    case 8: {
                        a.E((com.google.android.gms.common.server.response.a.a<byte[], Object>)a2, com.google.android.gms.common.util.c.a(this.e(bufferedReader, this.c, this.e, com.google.android.gms.common.server.response.b.l)));
                        break;
                    }
                    case 7: {
                        if (a2.I) {
                            a.U((com.google.android.gms.common.server.response.a.a<ArrayList<String>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.r));
                            break;
                        }
                        a.t((com.google.android.gms.common.server.response.a.a<String, Object>)a2, this.q(bufferedReader));
                        break;
                    }
                    case 6: {
                        if (a2.I) {
                            a.T((com.google.android.gms.common.server.response.a.a<ArrayList<Boolean>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.q));
                            break;
                        }
                        a.D((com.google.android.gms.common.server.response.a.a<Boolean, Object>)a2, this.k(bufferedReader, false));
                        break;
                    }
                    case 5: {
                        if (a2.I) {
                            a.R((com.google.android.gms.common.server.response.a.a<ArrayList<BigDecimal>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.t));
                            break;
                        }
                        a.z((com.google.android.gms.common.server.response.a.a<BigDecimal, Object>)a2, this.A(bufferedReader));
                        break;
                    }
                    case 4: {
                        if (a2.I) {
                            a.P((com.google.android.gms.common.server.response.a.a<ArrayList<Double>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.p));
                            break;
                        }
                        a.p((com.google.android.gms.common.server.response.a.a<Double, Object>)a2, this.z(bufferedReader));
                        break;
                    }
                    case 3: {
                        if (a2.I) {
                            a.N((com.google.android.gms.common.server.response.a.a<ArrayList<Float>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.o));
                            break;
                        }
                        a.q((com.google.android.gms.common.server.response.a.a<Float, Object>)a2, this.x(bufferedReader));
                        break;
                    }
                    case 2: {
                        if (a2.I) {
                            a.L((com.google.android.gms.common.server.response.a.a<ArrayList<Long>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.n));
                            break;
                        }
                        a.s((com.google.android.gms.common.server.response.a.a<Long, Object>)a2, this.t(bufferedReader));
                        break;
                    }
                    case 1: {
                        if (a2.I) {
                            a.J((com.google.android.gms.common.server.response.a.a<ArrayList<BigInteger>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.s));
                            break;
                        }
                        a.A((com.google.android.gms.common.server.response.a.a<BigInteger, Object>)a2, this.w(bufferedReader));
                        break;
                    }
                    case 0: {
                        if (a2.I) {
                            a.B((com.google.android.gms.common.server.response.a.a<ArrayList<Integer>, Object>)a2, this.g(bufferedReader, com.google.android.gms.common.server.response.b.m));
                            break;
                        }
                        a.r((com.google.android.gms.common.server.response.a.a<Integer, Object>)a2, this.s(bufferedReader));
                        break;
                    }
                }
                this.h(4);
                this.h(2);
                final char b6 = this.B(bufferedReader);
                if (b6 != ',') {
                    if (b6 != '}') {
                        final StringBuilder sb3 = new StringBuilder(55);
                        sb3.append("Expected end of object or field separator, but found: ");
                        sb3.append(b6);
                        throw new a(sb3.toString());
                    }
                    s = null;
                }
                else {
                    s = this.d(bufferedReader);
                }
            }
        }
        this.h(1);
        return true;
    }
    
    private final boolean k(final BufferedReader bufferedReader, boolean b) throws a, IOException {
        while (true) {
            final char b2 = this.B(bufferedReader);
            if (b2 != '\"') {
                if (b2 == 'f') {
                    char[] array;
                    if (b) {
                        array = b.k;
                    }
                    else {
                        array = b.j;
                    }
                    this.o(bufferedReader, array);
                    return false;
                }
                if (b2 == 'n') {
                    this.o(bufferedReader, b.g);
                    return false;
                }
                if (b2 == 't') {
                    char[] array2;
                    if (b) {
                        array2 = b.i;
                    }
                    else {
                        array2 = b.h;
                    }
                    this.o(bufferedReader, array2);
                    return true;
                }
                final StringBuilder sb = new StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(b2);
                throw new a(sb.toString());
            }
            else {
                if (b) {
                    throw new a("No boolean value found in string");
                }
                b = true;
            }
        }
    }
    
    @k0
    private final String m(final BufferedReader bufferedReader) throws a, IOException {
        bufferedReader.mark(1024);
        final char b = this.B(bufferedReader);
        if (b != '\"') {
            if (b == ',') {
                throw new a("Missing value");
            }
            int i = 1;
            if (b != '[') {
                if (b != '{') {
                    bufferedReader.reset();
                    this.c(bufferedReader, this.c);
                }
                else {
                    this.f.push(1);
                    bufferedReader.mark(32);
                    final char b2 = this.B(bufferedReader);
                    if (b2 != '}') {
                        if (b2 != '\"') {
                            final StringBuilder sb = new StringBuilder(18);
                            sb.append("Unexpected token ");
                            sb.append(b2);
                            throw new a(sb.toString());
                        }
                        bufferedReader.reset();
                        this.d(bufferedReader);
                        while (this.m(bufferedReader) != null) {}
                    }
                    this.h(1);
                }
            }
            else {
                this.f.push(5);
                bufferedReader.mark(32);
                if (this.B(bufferedReader) != ']') {
                    bufferedReader.reset();
                    int n = 0;
                    int n2 = 0;
                    while (i > 0) {
                        final char b3 = this.B(bufferedReader);
                        if (b3 == '\0') {
                            throw new a("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(b3)) {
                            throw new a("Unexpected control character while reading array");
                        }
                        int n3 = n2;
                        if (b3 == '\"') {
                            n3 = n2;
                            if (n == 0) {
                                n3 = (n2 ^ 0x1);
                            }
                        }
                        int n4 = i;
                        if (b3 == '[') {
                            n4 = i;
                            if (n3 == 0) {
                                n4 = i + 1;
                            }
                        }
                        i = n4;
                        if (b3 == ']') {
                            i = n4;
                            if (n3 == 0) {
                                i = n4 - 1;
                            }
                        }
                        if (b3 == '\\' && n3 != 0) {
                            n ^= 0x1;
                            n2 = n3;
                        }
                        else {
                            n = 0;
                            n2 = n3;
                        }
                    }
                }
                this.h(5);
            }
        }
        else {
            if (bufferedReader.read(this.a) == -1) {
                throw new a("Unexpected EOF while parsing string");
            }
            char c = this.a[0];
            char ch;
            for (int n5 = 0; c != '\"' || n5 != 0; c = ch) {
                if (c == '\\') {
                    n5 ^= 0x1;
                }
                else {
                    n5 = 0;
                }
                if (bufferedReader.read(this.a) == -1) {
                    throw new a("Unexpected EOF while parsing string");
                }
                ch = this.a[0];
                if (Character.isISOControl(ch)) {
                    throw new a("Unexpected control character while reading string");
                }
            }
        }
        final char b4 = this.B(bufferedReader);
        if (b4 == ',') {
            this.h(2);
            return this.d(bufferedReader);
        }
        if (b4 == '}') {
            this.h(2);
            return null;
        }
        final StringBuilder sb2 = new StringBuilder(18);
        sb2.append("Unexpected token ");
        sb2.append(b4);
        throw new a(sb2.toString());
    }
    
    private static String n(final BufferedReader bufferedReader, final char[] str, final StringBuilder sb, @k0 final char[] array) throws a, IOException {
        sb.setLength(0);
        bufferedReader.mark(str.length);
        int n = 0;
        int n2 = 0;
        while (true) {
            final int read = bufferedReader.read(str);
            if (read == -1) {
                throw new a("Unexpected EOF while parsing string");
            }
            int n3;
            int n4;
            for (int i = 0; i < read; ++i, n = n3, n2 = n4) {
                final char ch = str[i];
                if (Character.isISOControl(ch)) {
                    boolean b = false;
                    Label_0092: {
                        if (array != null) {
                            for (int j = 0; j < array.length; ++j) {
                                if (array[j] == ch) {
                                    b = true;
                                    break Label_0092;
                                }
                            }
                        }
                        b = false;
                    }
                    if (!b) {
                        throw new a("Unexpected control character while reading string");
                    }
                }
                if (ch == '\"' && n == 0) {
                    sb.append(str, 0, i);
                    bufferedReader.reset();
                    bufferedReader.skip(i + 1);
                    String s = sb.toString();
                    if (n2 != 0) {
                        s = com.google.android.gms.common.util.r.c(s);
                    }
                    return s;
                }
                if (ch == '\\') {
                    n3 = (n ^ 0x1);
                    n4 = 1;
                }
                else {
                    final int n5 = 0;
                    n4 = n2;
                    n3 = n5;
                }
            }
            sb.append(str, 0, read);
            bufferedReader.mark(str.length);
        }
    }
    
    private final void o(final BufferedReader bufferedReader, final char[] array) throws a, IOException {
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = bufferedReader.read(this.b, 0, array.length - i);
            if (read == -1) {
                throw new a("Unexpected EOF");
            }
            for (int j = 0; j < read; ++j) {
                if (array[j + i] != this.b[j]) {
                    throw new a("Unexpected character");
                }
            }
        }
    }
    
    @k0
    private final String q(final BufferedReader bufferedReader) throws a, IOException {
        return this.e(bufferedReader, this.b, this.d, null);
    }
    
    private final int s(final BufferedReader bufferedReader) throws a, IOException {
        final int c = this.c(bufferedReader, this.c);
        int n = 0;
        if (c == 0) {
            return 0;
        }
        final char[] c2 = this.c;
        if (c <= 0) {
            throw new a("No number to parse");
        }
        int n2;
        int n3;
        boolean b;
        if (c2[0] == '-') {
            n2 = Integer.MIN_VALUE;
            n3 = 1;
            b = true;
        }
        else {
            n2 = -2147483647;
            n3 = 0;
            b = false;
        }
        int i = n3;
        if (n3 < c) {
            final int digit = Character.digit(c2[n3], 10);
            if (digit < 0) {
                throw new a("Unexpected non-digit character");
            }
            n = -digit;
            i = n3 + 1;
        }
        while (i < c) {
            final int digit2 = Character.digit(c2[i], 10);
            if (digit2 < 0) {
                throw new a("Unexpected non-digit character");
            }
            if (n < -214748364) {
                throw new a("Number too large");
            }
            final int n4 = n * 10;
            if (n4 < n2 + digit2) {
                throw new a("Number too large");
            }
            n = n4 - digit2;
            ++i;
        }
        if (!b) {
            return -n;
        }
        if (i > 1) {
            return n;
        }
        throw new a("No digits to parse");
    }
    
    private final long t(final BufferedReader bufferedReader) throws a, IOException {
        final int c = this.c(bufferedReader, this.c);
        long n = 0L;
        if (c == 0) {
            return 0L;
        }
        final char[] c2 = this.c;
        if (c <= 0) {
            throw new a("No number to parse");
        }
        int n2 = 0;
        long n3;
        boolean b;
        if (c2[0] == '-') {
            n3 = Long.MIN_VALUE;
            n2 = 1;
            b = true;
        }
        else {
            n3 = -9223372036854775807L;
            b = false;
        }
        int i = n2;
        if (n2 < c) {
            final int digit = Character.digit(c2[n2], 10);
            if (digit < 0) {
                throw new a("Unexpected non-digit character");
            }
            n = -digit;
            i = n2 + 1;
        }
        while (i < c) {
            final int digit2 = Character.digit(c2[i], 10);
            if (digit2 < 0) {
                throw new a("Unexpected non-digit character");
            }
            if (n < -922337203685477580L) {
                throw new a("Number too large");
            }
            final long n4 = n * 10L;
            final long n5 = digit2;
            if (n4 < n3 + n5) {
                throw new a("Number too large");
            }
            n = n4 - n5;
            ++i;
        }
        if (!b) {
            return -n;
        }
        if (i > 1) {
            return n;
        }
        throw new a("No digits to parse");
    }
    
    @k0
    private final BigInteger w(final BufferedReader bufferedReader) throws a, IOException {
        final int c = this.c(bufferedReader, this.c);
        if (c == 0) {
            return null;
        }
        return new BigInteger(new String(this.c, 0, c));
    }
    
    private final float x(final BufferedReader bufferedReader) throws a, IOException {
        final int c = this.c(bufferedReader, this.c);
        if (c == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.c, 0, c));
    }
    
    private final double z(final BufferedReader bufferedReader) throws a, IOException {
        final int c = this.c(bufferedReader, this.c);
        if (c == 0) {
            return 0.0;
        }
        return Double.parseDouble(new String(this.c, 0, c));
    }
    
    @f2.a
    public void a(@RecentlyNonNull InputStream in, @RecentlyNonNull final T t) throws a {
        in = (IOException)new BufferedReader(new InputStreamReader((InputStream)in), 1024);
        try {
            this.f.push(0);
            final char b = this.B((BufferedReader)in);
            if (b != '\0') {
                if (b != '[') {
                    if (b != '{') {
                        final StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(b);
                        throw new a(sb.toString());
                    }
                    this.f.push(1);
                    this.j((BufferedReader)in, t);
                }
                else {
                    this.f.push(5);
                    final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> c = t.c();
                    if (c.size() != 1) {
                        throw new a("Object array response class must have a single Field");
                    }
                    final com.google.android.gms.common.server.response.a.a<?, ?> a = c.entrySet().iterator().next().getValue();
                    t.a(a, a.L, this.f((BufferedReader)in, a));
                }
                this.h(0);
                try {
                    ((BufferedReader)in).close();
                    return;
                }
                catch (IOException in) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                    return;
                }
                throw new a("Object array response class must have a single Field");
            }
            throw new a("No data to parse");
        }
        catch (IOException ex) {}
        finally {
            try {
                ((BufferedReader)in).close();
            }
            catch (IOException ex2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
        }
    }
    
    @b0
    @f2.a
    public static class a extends Exception
    {
        public a(@RecentlyNonNull final String message) {
            super(message);
        }
        
        public a(@RecentlyNonNull final String message, @RecentlyNonNull final Throwable cause) {
            super(message, cause);
        }
        
        public a(@RecentlyNonNull final Throwable cause) {
            super(cause);
        }
    }
    
    private interface b<O>
    {
        @k0
        O a(final com.google.android.gms.common.server.response.b p0, final BufferedReader p1) throws a, IOException;
    }
}
