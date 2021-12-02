// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.q0;
import java.util.Calendar;
import java.util.TimeZone;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import org.bson.r0;
import org.bson.x0;
import org.bson.g0;
import java.io.Serializable;
import org.bson.types.h;
import org.bson.types.g;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import org.bson.q;
import org.bson.o;
import org.bson.w0;
import org.bson.v0;
import org.bson.u;
import java.io.Reader;
import org.bson.a;

public class w extends a
{
    private final x L;
    private c0 M;
    private Object N;
    private c O;
    
    public w(final Reader reader) {
        this(new x(reader));
    }
    
    public w(final String s) {
        this(new x(s));
    }
    
    private w(final x l) {
        this.L = l;
        this.a0((a.b)new b(null, u.G));
    }
    
    private v0 A2() {
        this.e1(d0.K);
        final c0 m0 = this.M0();
        final d0 a = m0.a();
        final d0 q = d0.Q;
        if (a != q) {
            throw new v("JSON reader expected an integer but found '%s'.", new Object[] { m0.b() });
        }
        final int intValue = m0.c(Integer.class);
        this.e1(d0.O);
        final c0 m2 = this.M0();
        if (m2.a() == q) {
            final int intValue2 = m2.c(Integer.class);
            this.e1(d0.L);
            return new v0(intValue, intValue2);
        }
        throw new v("JSON reader expected an integer but found '%s'.", new Object[] { m0.b() });
    }
    
    private void B1() {
        final c0 m0 = this.M0();
        final String s = m0.c(String.class);
        final d0 a = m0.a();
        while (true) {
            Label_0448: {
                if (a != d0.T && a != d0.U) {
                    break Label_0448;
                }
                w0 w0;
                if (!"$binary".equals(s) && !"$type".equals(s)) {
                    if (!"$regex".equals(s) && !"$options".equals(s)) {
                        if ("$code".equals(s)) {
                            this.G1();
                            return;
                        }
                        if ("$date".equals(s)) {
                            this.N = this.t1();
                            w0 = org.bson.w0.Q;
                            break Label_0114;
                        }
                        if ("$maxKey".equals(s)) {
                            this.N = this.J1();
                            w0 = org.bson.w0.c0;
                            break Label_0114;
                        }
                        if ("$minKey".equals(s)) {
                            this.N = this.L1();
                            w0 = org.bson.w0.b0;
                            break Label_0114;
                        }
                        if ("$oid".equals(s)) {
                            this.N = this.r2();
                            w0 = org.bson.w0.O;
                            break Label_0114;
                        }
                        if ("$regularExpression".equals(s)) {
                            this.N = this.P1();
                        }
                        else {
                            if ("$symbol".equals(s)) {
                                this.N = this.z2();
                                w0 = org.bson.w0.V;
                                break Label_0114;
                            }
                            if ("$timestamp".equals(s)) {
                                this.N = this.G2();
                                w0 = org.bson.w0.Y;
                                break Label_0114;
                            }
                            if ("$undefined".equals(s)) {
                                this.N = this.N2();
                                w0 = org.bson.w0.N;
                                break Label_0114;
                            }
                            if ("$numberLong".equals(s)) {
                                this.N = this.p2();
                                w0 = org.bson.w0.Z;
                                break Label_0114;
                            }
                            if ("$numberInt".equals(s)) {
                                this.N = this.k2();
                                w0 = org.bson.w0.X;
                                break Label_0114;
                            }
                            if ("$numberDouble".equals(s)) {
                                this.N = this.f2();
                                w0 = org.bson.w0.I;
                                break Label_0114;
                            }
                            if ("$numberDecimal".equals(s)) {
                                this.N = this.c2();
                                w0 = org.bson.w0.a0;
                                break Label_0114;
                            }
                            if ("$dbPointer".equals(s)) {
                                this.N = this.v1();
                                w0 = org.bson.w0.T;
                                break Label_0114;
                            }
                            break Label_0448;
                        }
                    }
                    else if ((this.N = this.x2(s)) == null) {
                        break Label_0448;
                    }
                    w0 = org.bson.w0.S;
                }
                else {
                    if ((this.N = this.k1(s)) == null) {
                        break Label_0448;
                    }
                    w0 = org.bson.w0.M;
                }
                this.d0(w0);
                return;
            }
            this.N0(m0);
            w0 w0 = org.bson.w0.K;
            continue;
        }
    }
    
    private o E1() {
        this.e1(d0.K);
        final c0 m0 = this.M0();
        final d0 a = m0.a();
        final d0 q = d0.Q;
        int i = 0;
        if (a == q) {
            this.e1(d0.O);
            final String a2 = this.a1();
            this.e1(d0.L);
            String string = a2;
            if ((a2.length() & 0x1) != 0x0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("0");
                sb.append(a2);
                string = sb.toString();
            }
            for (q[] values = org.bson.q.values(); i < values.length; ++i) {
                final q q2 = values[i];
                if (q2.b() == m0.c(Integer.class)) {
                    return new o(q2, H0(string));
                }
            }
            return new o(H0(string));
        }
        throw new v("JSON reader expected a binary subtype but found '%s'.", new Object[] { m0.b() });
    }
    
    private long F1() {
        this.e1(d0.K);
        final c0 m0 = this.M0();
        final d0 a = m0.a();
        final d0 l = d0.L;
        if (a == l) {
            return new Date().getTime();
        }
        if (m0.a() == d0.T) {
            this.e1(l);
            final String[] array = { "yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ssz", "yyyy-MM-dd'T'HH:mm:ss.SSSz" };
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(array[0], Locale.ENGLISH);
            final ParsePosition pos = new ParsePosition(0);
            String string;
            final String s = string = m0.c(String.class);
            if (s.endsWith("Z")) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, s.length() - 1));
                sb.append("GMT-00:00");
                string = sb.toString();
            }
            for (int i = 0; i < 3; ++i) {
                simpleDateFormat.applyPattern(array[i]);
                simpleDateFormat.setLenient(true);
                pos.setIndex(0);
                final Date parse = simpleDateFormat.parse(string, pos);
                if (parse != null && pos.getIndex() == string.length()) {
                    return parse.getTime();
                }
            }
            throw new v("Invalid date format.");
        }
        throw new v("JSON reader expected a string but found '%s'.", new Object[] { m0.b() });
    }
    
    private void G1() {
        final d0 n = d0.N;
        this.e1(n);
        final String a1 = this.a1();
        final c0 m0 = this.M0();
        final int n2 = w$a.a[m0.a().ordinal()];
        if (n2 != 3) {
            if (n2 != 11) {
                throw new v("JSON reader expected ',' or '}' but found '%s'.", new Object[] { m0 });
            }
            this.d1("$scope");
            this.e1(n);
            this.f0(d.J);
            this.N = a1;
            this.d0(w0.W);
            this.a0((a.b)new b(this.L0(), u.K));
        }
        else {
            this.N = a1;
            this.d0(w0.U);
        }
    }
    
    private v0 G2() {
        final d0 n = d0.N;
        this.e1(n);
        this.e1(d0.I);
        final String a1 = this.a1();
        int n2;
        int n3;
        if (a1.equals("t")) {
            this.e1(n);
            n2 = this.Z0();
            this.e1(d0.O);
            this.d1("i");
            this.e1(n);
            n3 = this.Z0();
        }
        else {
            if (!a1.equals("i")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected 't' and 'i' fields in $timestamp document but found ");
                sb.append(a1);
                throw new v(sb.toString());
            }
            this.e1(n);
            n3 = this.Z0();
            this.e1(d0.O);
            this.d1("t");
            this.e1(n);
            n2 = this.Z0();
        }
        final d0 m = d0.M;
        this.e1(m);
        this.e1(m);
        return new v0(n2, n3);
    }
    
    private static byte[] H0(final String s) {
        if (s.length() % 2 == 0) {
            final byte[] array = new byte[s.length() / 2];
            for (int i = 0; i < s.length(); i += 2) {
                final int digit = Character.digit(s.charAt(i), 16);
                final int digit2 = Character.digit(s.charAt(i + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("A hex string can only contain the characters 0-9, A-F, a-f: ");
                    sb.append(s);
                    throw new IllegalArgumentException(sb.toString());
                }
                array[i / 2] = (byte)(digit * 16 + digit2);
            }
            return array;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("A hex string must contain an even number of characters: ");
        sb2.append(s);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    private o H1(final String s) {
        final c c = new c();
        try {
            try {
                final d0 n = d0.N;
                this.e1(n);
                byte[] array;
                byte q0;
                if (s.equals("$binary")) {
                    array = org.bson.internal.a.b(this.a1());
                    this.e1(d0.O);
                    this.d1("$type");
                    this.e1(n);
                    q0 = this.Q0();
                }
                else {
                    final byte q2 = this.Q0();
                    this.e1(d0.O);
                    this.d1("$binary");
                    this.e1(n);
                    array = org.bson.internal.a.b(this.a1());
                    q0 = q2;
                }
                this.e1(d0.M);
                final o o = new o(q0, array);
                c.c();
                return o;
            }
            finally {}
        }
        catch (NumberFormatException ex) {
            c.reset();
            c.c();
            return null;
        }
        catch (v v) {
            c.reset();
            c.c();
            return null;
        }
        c.c();
    }
    
    private g J1() {
        this.e1(d0.N);
        this.f1(d0.Q, 1);
        this.e1(d0.M);
        return new g();
    }
    
    private o K2(final String s) {
        this.e1(d0.K);
        final String replaceAll = this.a1().replaceAll("\\{", "").replaceAll("}", "").replaceAll("-", "");
        this.e1(d0.L);
        final byte[] h0 = H0(replaceAll);
        q q = org.bson.q.L;
        if (!"UUID".equals(s) || !"GUID".equals(s)) {
            q = org.bson.q.K;
        }
        return new o(q, h0);
    }
    
    private h L1() {
        this.e1(d0.N);
        this.f1(d0.Q, 1);
        this.e1(d0.M);
        return new h();
    }
    
    private c0 M0() {
        final c0 m = this.M;
        if (m != null) {
            this.M = null;
            return m;
        }
        return this.L.c();
    }
    
    private void M1() {
        final c0 m0 = this.M0();
        if (m0.a() == d0.U) {
            final String s = m0.c(String.class);
            Serializable n;
            if ("MinKey".equals(s)) {
                this.z1();
                this.d0(w0.b0);
                n = new h();
            }
            else {
                if (!"MaxKey".equals(s)) {
                    w0 w0 = null;
                    Label_0118: {
                        o n2 = null;
                        Label_0109: {
                            if (!"BinData".equals(s)) {
                                long l;
                                if ("Date".equals(s)) {
                                    l = this.p1();
                                }
                                else {
                                    if ("HexData".equals(s)) {
                                        n2 = this.E1();
                                        break Label_0109;
                                    }
                                    if ("ISODate".equals(s)) {
                                        l = this.F1();
                                    }
                                    else {
                                        if ("NumberInt".equals(s)) {
                                            this.N = this.j2();
                                            w0 = org.bson.w0.X;
                                            break Label_0118;
                                        }
                                        if ("NumberLong".equals(s)) {
                                            this.N = this.o2();
                                            w0 = org.bson.w0.Z;
                                            break Label_0118;
                                        }
                                        if ("NumberDecimal".equals(s)) {
                                            this.N = this.Q1();
                                            w0 = org.bson.w0.a0;
                                            break Label_0118;
                                        }
                                        if ("ObjectId".equals(s)) {
                                            this.N = this.q2();
                                            w0 = org.bson.w0.O;
                                            break Label_0118;
                                        }
                                        if ("RegExp".equals(s)) {
                                            this.N = this.u2();
                                            w0 = org.bson.w0.S;
                                            break Label_0118;
                                        }
                                        if ("DBPointer".equals(s)) {
                                            this.N = this.o1();
                                            w0 = org.bson.w0.T;
                                            break Label_0118;
                                        }
                                        if (!"UUID".equals(s) && !"GUID".equals(s) && !"CSUUID".equals(s) && !"CSGUID".equals(s) && !"JUUID".equals(s) && !"JGUID".equals(s) && !"PYUUID".equals(s) && !"PYGUID".equals(s)) {
                                            throw new v("JSON reader expected a type name but found '%s'.", new Object[] { s });
                                        }
                                        n2 = this.K2(s);
                                        break Label_0109;
                                    }
                                }
                                this.N = l;
                                w0 = org.bson.w0.Q;
                                break Label_0118;
                            }
                            n2 = this.g1();
                        }
                        this.N = n2;
                        w0 = org.bson.w0.M;
                    }
                    this.d0(w0);
                    return;
                }
                this.z1();
                this.d0(w0.c0);
                n = new g();
            }
            this.N = n;
            return;
        }
        throw new v("JSON reader expected a type name but found '%s'.", new Object[] { m0.b() });
    }
    
    private void N0(final c0 m) {
        if (this.M == null) {
            this.M = m;
            return;
        }
        throw new g0("There is already a pending token.");
    }
    
    private x0 N2() {
        this.e1(d0.N);
        final c0 m0 = this.M0();
        if (m0.c(String.class).equals("true")) {
            this.e1(d0.M);
            return new x0();
        }
        throw new v("JSON reader requires $undefined to have the value of true but found '%s'.", new Object[] { m0.b() });
    }
    
    private r0 P1() {
        final d0 n = d0.N;
        this.e1(n);
        this.e1(d0.I);
        final String a1 = this.a1();
        String s;
        String s2;
        if (a1.equals("pattern")) {
            this.e1(n);
            s = this.a1();
            this.e1(d0.O);
            this.d1("options");
            this.e1(n);
            s2 = this.a1();
        }
        else {
            if (!a1.equals("options")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected 't' and 'i' fields in $timestamp document but found ");
                sb.append(a1);
                throw new v(sb.toString());
            }
            this.e1(n);
            s2 = this.a1();
            this.e1(d0.O);
            this.d1("pattern");
            this.e1(n);
            s = this.a1();
        }
        final d0 m = d0.M;
        this.e1(m);
        this.e1(m);
        return new r0(s, s2);
    }
    
    private byte Q0() {
        final c0 m0 = this.M0();
        final d0 a = m0.a();
        final d0 t = d0.T;
        if (a != t && m0.a() != d0.Q) {
            throw new v("JSON reader expected a string or number but found '%s'.", new Object[] { m0.b() });
        }
        if (m0.a() == t) {
            return (byte)Integer.parseInt(m0.c(String.class), 16);
        }
        return m0.c(Integer.class).byteValue();
    }
    
    private Decimal128 Q1() {
        this.e1(d0.K);
        final c0 m0 = this.M0();
        Decimal128 y;
        if (m0.a() != d0.Q && m0.a() != d0.R && m0.a() != d0.P) {
            if (m0.a() != d0.T) {
                throw new v("JSON reader expected a number or a string but found '%s'.", new Object[] { m0.b() });
            }
            y = Decimal128.y(m0.c(String.class));
        }
        else {
            y = m0.c(Decimal128.class);
        }
        this.e1(d0.L);
        return y;
    }
    
    private ObjectId W0() {
        this.e1(d0.N);
        this.e1(d0.I);
        this.f1(d0.T, "$oid");
        return this.r2();
    }
    
    private int Z0() {
        final c0 m0 = this.M0();
        int n;
        if (m0.a() == d0.Q) {
            n = m0.c(Integer.class);
        }
        else {
            if (m0.a() != d0.R) {
                throw new v("JSON reader expected an integer but found '%s'.", new Object[] { m0.b() });
            }
            n = m0.c(Long.class).intValue();
        }
        return n;
    }
    
    private String a1() {
        final c0 m0 = this.M0();
        if (m0.a() == d0.T) {
            return m0.c(String.class);
        }
        throw new v("JSON reader expected a string but found '%s'.", new Object[] { m0.b() });
    }
    
    private Decimal128 c2() {
        this.e1(d0.N);
        final String a1 = this.a1();
        try {
            final Decimal128 y = Decimal128.y(a1);
            this.e1(d0.M);
            return y;
        }
        catch (NumberFormatException ex) {
            throw new v(String.format("Exception converting value '%s' to type %s", a1, Decimal128.class.getName()), new Object[] { ex });
        }
    }
    
    private void d1(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("Can't be null");
        }
        final c0 m0 = this.M0();
        final d0 a = m0.a();
        if ((a == d0.T || a == d0.U) && s.equals(m0.b())) {
            return;
        }
        throw new v("JSON reader expected '%s' but found '%s'.", new Object[] { s, m0.b() });
    }
    
    private void e1(final d0 d0) {
        final c0 m0 = this.M0();
        if (d0 == m0.a()) {
            return;
        }
        throw new v("JSON reader expected token type '%s' but found '%s'.", new Object[] { d0, m0.b() });
    }
    
    private void f1(final d0 d0, final Object o) {
        final c0 m0 = this.M0();
        if (d0 != m0.a()) {
            throw new v("JSON reader expected token type '%s' but found '%s'.", new Object[] { d0, m0.b() });
        }
        if (o.equals(m0.b())) {
            return;
        }
        throw new v("JSON reader expected '%s' but found '%s'.", new Object[] { o, m0.b() });
    }
    
    private Double f2() {
        this.e1(d0.N);
        final String a1 = this.a1();
        try {
            final Double value = Double.valueOf(a1);
            this.e1(d0.M);
            return value;
        }
        catch (NumberFormatException ex) {
            throw new v(String.format("Exception converting value '%s' to type %s", a1, Double.class.getName()), new Object[] { ex });
        }
    }
    
    private o g1() {
        this.e1(d0.K);
        final c0 m0 = this.M0();
        if (m0.a() != d0.Q) {
            throw new v("JSON reader expected a binary subtype but found '%s'.", new Object[] { m0.b() });
        }
        this.e1(d0.O);
        final c0 m2 = this.M0();
        if (m2.a() != d0.U && m2.a() != d0.T) {
            throw new v("JSON reader expected a string but found '%s'.", new Object[] { m2.b() });
        }
        this.e1(d0.L);
        return new o(m0.c(Integer.class).byteValue(), org.bson.internal.a.b(m2.c(String.class)));
    }
    
    private int j2() {
        this.e1(d0.K);
        final c0 m0 = this.M0();
        int n;
        if (m0.a() == d0.Q) {
            n = m0.c(Integer.class);
        }
        else {
            if (m0.a() != d0.T) {
                throw new v("JSON reader expected an integer or a string but found '%s'.", new Object[] { m0.b() });
            }
            n = Integer.parseInt(m0.c(String.class));
        }
        this.e1(d0.L);
        return n;
    }
    
    private o k1(String str) {
        final c c = new c();
        try {
            final d0 n = d0.N;
            this.e1(n);
            if (!str.equals("$binary")) {
                c.reset();
                return this.H1(str);
            }
            if (this.M0().a() == d0.I) {
                str = this.M0().c(String.class);
                byte[] array;
                byte q0;
                if (str.equals("base64")) {
                    this.e1(n);
                    array = org.bson.internal.a.b(this.a1());
                    this.e1(d0.O);
                    this.d1("subType");
                    this.e1(n);
                    q0 = this.Q0();
                }
                else {
                    if (!str.equals("subType")) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected key for $binary: ");
                        sb.append(str);
                        throw new v(sb.toString());
                    }
                    this.e1(n);
                    final byte q2 = this.Q0();
                    this.e1(d0.O);
                    this.d1("base64");
                    this.e1(n);
                    array = org.bson.internal.a.b(this.a1());
                    q0 = q2;
                }
                final d0 m = d0.M;
                this.e1(m);
                this.e1(m);
                return new o(q0, array);
            }
            c.reset();
            return this.H1(str);
        }
        finally {
            c.c();
        }
    }
    
    private Integer k2() {
        this.e1(d0.N);
        final String a1 = this.a1();
        try {
            final Integer value = Integer.valueOf(a1);
            this.e1(d0.M);
            return value;
        }
        catch (NumberFormatException ex) {
            throw new v(String.format("Exception converting value '%s' to type %s", a1, Integer.class.getName()), new Object[] { ex });
        }
    }
    
    private org.bson.w o1() {
        this.e1(d0.K);
        final String a1 = this.a1();
        this.e1(d0.O);
        final ObjectId objectId = new ObjectId(this.a1());
        this.e1(d0.L);
        return new org.bson.w(a1, objectId);
    }
    
    private long o2() {
        this.e1(d0.K);
        final c0 m0 = this.M0();
        long n;
        if (m0.a() != d0.Q && m0.a() != d0.R) {
            if (m0.a() != d0.T) {
                throw new v("JSON reader expected an integer or a string but found '%s'.", new Object[] { m0.b() });
            }
            n = Long.parseLong(m0.c(String.class));
        }
        else {
            n = m0.c(Long.class);
        }
        this.e1(d0.L);
        return n;
    }
    
    private long p1() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH);
        this.e1(d0.K);
        c0 c0 = this.M0();
        final d0 a = c0.a();
        final d0 l = d0.L;
        if (a == l) {
            return new Date().getTime();
        }
        if (c0.a() == d0.T) {
            this.e1(l);
            final String s = c0.c(String.class);
            final ParsePosition parsePosition = new ParsePosition(0);
            final Date parse = simpleDateFormat.parse(s, parsePosition);
            if (parse != null && parsePosition.getIndex() == s.length()) {
                return parse.getTime();
            }
            throw new v("JSON reader expected a date in 'EEE MMM dd yyyy HH:mm:ss z' format but found '%s'.", new Object[] { s });
        }
        else {
            if (c0.a() != d0.Q && c0.a() != d0.R) {
                throw new v("JSON reader expected an integer or a string but found '%s'.", new Object[] { c0.b() });
            }
            final long[] array = new long[7];
            int n = 0;
            while (true) {
                int i;
                if ((i = n) < 7) {
                    array[n] = c0.c(Long.class);
                    i = n + 1;
                }
                final c0 m0 = this.M0();
                if (m0.a() == d0.L) {
                    if (i == 1) {
                        return array[0];
                    }
                    if (i >= 3 && i <= 7) {
                        final Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        instance.set(1, (int)array[0]);
                        instance.set(2, (int)array[1]);
                        instance.set(5, (int)array[2]);
                        instance.set(11, (int)array[3]);
                        instance.set(12, (int)array[4]);
                        instance.set(13, (int)array[5]);
                        instance.set(14, (int)array[6]);
                        return instance.getTimeInMillis();
                    }
                    throw new v("JSON reader expected 1 or 3-7 integers but found %d.", new Object[] { i });
                }
                else {
                    if (m0.a() != d0.O) {
                        throw new v("JSON reader expected a ',' or a ')' but found '%s'.", new Object[] { m0.b() });
                    }
                    final c0 c2 = c0 = this.M0();
                    n = i;
                    if (c2.a() == d0.Q) {
                        continue;
                    }
                    if (c2.a() != d0.R) {
                        throw new v("JSON reader expected an integer but found '%s'.", new Object[] { c2.b() });
                    }
                    c0 = c2;
                    n = i;
                }
            }
        }
    }
    
    private Long p2() {
        this.e1(d0.N);
        final String a1 = this.a1();
        try {
            final Long value = Long.valueOf(a1);
            this.e1(d0.M);
            return value;
        }
        catch (NumberFormatException ex) {
            throw new v(String.format("Exception converting value '%s' to type %s", a1, Long.class.getName()), new Object[] { ex });
        }
    }
    
    private String q1() {
        this.e1(d0.K);
        c0 c0 = this.M0();
        if (c0.a() != d0.L) {
            c0 c2;
            do {
                c2 = c0;
                if (c0.a() == d0.V) {
                    break;
                }
                c2 = (c0 = this.M0());
            } while (c2.a() != d0.L);
            if (c2.a() != d0.L) {
                throw new v("JSON reader expected a ')' but found '%s'.", new Object[] { c2.b() });
            }
        }
        return new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH).format(new Date());
    }
    
    private ObjectId q2() {
        this.e1(d0.K);
        final ObjectId objectId = new ObjectId(this.a1());
        this.e1(d0.L);
        return objectId;
    }
    
    private ObjectId r2() {
        this.e1(d0.N);
        final ObjectId objectId = new ObjectId(this.a1());
        this.e1(d0.M);
        return objectId;
    }
    
    private long t1() {
        this.e1(d0.N);
        final c0 m0 = this.M0();
        long n = 0L;
        Label_0054: {
            Long p2;
            if (m0.a() == d0.I) {
                final String s = this.M0().c(String.class);
                if (!s.equals("$numberLong")) {
                    throw new v(String.format("JSON reader expected $numberLong within $date, but found %s", s));
                }
                p2 = this.p2();
            }
            else {
                if (m0.a() != d0.Q && m0.a() != d0.R) {
                    if (m0.a() == d0.T) {
                        final String s2 = m0.c(String.class);
                        try {
                            n = org.bson.json.b.c(s2);
                            break Label_0054;
                        }
                        catch (IllegalArgumentException ex) {
                            throw new v("Failed to parse string as a date", new Object[] { ex });
                        }
                    }
                    throw new v("JSON reader expected an integer or string but found '%s'.", new Object[] { m0.b() });
                }
                p2 = m0.c(Long.class);
            }
            n = p2;
        }
        this.e1(d0.M);
        return n;
    }
    
    private r0 u2() {
        this.e1(d0.K);
        final String a1 = this.a1();
        final c0 m0 = this.M0();
        String a2;
        if (m0.a() == d0.O) {
            a2 = this.a1();
        }
        else {
            this.N0(m0);
            a2 = "";
        }
        this.e1(d0.L);
        return new r0(a1, a2);
    }
    
    private org.bson.w v1() {
        final d0 n = d0.N;
        this.e1(n);
        this.e1(d0.I);
        final String a1 = this.a1();
        String s;
        ObjectId objectId;
        if (a1.equals("$ref")) {
            this.e1(n);
            s = this.a1();
            this.e1(d0.O);
            this.d1("$id");
            objectId = this.W0();
            this.e1(d0.M);
        }
        else {
            if (!a1.equals("$id")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected $ref and $id fields in $dbPointer document but found ");
                sb.append(a1);
                throw new v(sb.toString());
            }
            objectId = this.W0();
            this.e1(d0.O);
            this.d1("$ref");
            this.e1(n);
            s = this.a1();
        }
        this.e1(d0.M);
        return new org.bson.w(s, objectId);
    }
    
    private r0 x2(String s) {
        final c c = new c();
        try {
            try {
                final d0 n = d0.N;
                this.e1(n);
                String s2;
                if (s.equals("$regex")) {
                    s2 = this.a1();
                    this.e1(d0.O);
                    this.d1("$options");
                    this.e1(n);
                    s = this.a1();
                }
                else {
                    s = this.a1();
                    this.e1(d0.O);
                    this.d1("$regex");
                    this.e1(n);
                    s2 = this.a1();
                }
                this.e1(d0.M);
                final r0 r0 = new r0(s2, s);
                c.c();
                return r0;
            }
            finally {}
        }
        catch (v v) {
            c.reset();
            c.c();
            return null;
        }
        c.c();
    }
    
    private void z1() {
        final c0 m0 = this.M0();
        if (m0.a() == d0.K) {
            this.e1(d0.L);
        }
        else {
            this.N0(m0);
        }
    }
    
    private String z2() {
        this.e1(d0.N);
        final String a1 = this.a1();
        this.e1(d0.M);
        return a1;
    }
    
    @Override
    protected long C() {
        return (long)this.N;
    }
    
    @Override
    protected String D() {
        return (String)this.N;
    }
    
    @Override
    protected String F() {
        return (String)this.N;
    }
    
    @Override
    protected void G() {
    }
    
    @Override
    protected void H() {
    }
    
    @Override
    protected void J() {
    }
    
    @Override
    protected ObjectId K() {
        return (ObjectId)this.N;
    }
    
    @Override
    protected r0 L() {
        return (r0)this.N;
    }
    
    protected b L0() {
        return (b)super.X();
    }
    
    @Override
    protected void M() {
        this.a0((a.b)new b(this.L0(), u.I));
    }
    
    @Override
    protected void N() {
        this.a0((a.b)new b(this.L0(), u.H));
    }
    
    @Deprecated
    @Override
    public void O() {
        if (this.O == null) {
            this.O = new c();
            return;
        }
        throw new org.bson.h("A mark already exists; it needs to be reset before creating a new one");
    }
    
    @Override
    protected String Q() {
        return (String)this.N;
    }
    
    @Override
    protected String R() {
        return (String)this.N;
    }
    
    @Override
    protected v0 S() {
        return (v0)this.N;
    }
    
    @Override
    public q0 S4() {
        return new c();
    }
    
    @Override
    protected void T() {
    }
    
    @Override
    protected void V() {
    }
    
    @Override
    protected void W() {
        switch (w$a.c[this.O5().ordinal()]) {
            default: {
                return;
            }
            case 20: {
                this.W3();
                return;
            }
            case 19: {
                this.R0();
                return;
            }
            case 18: {
                this.m1();
                return;
            }
            case 17: {
                this.U();
                return;
            }
            case 16: {
                this.C4();
                return;
            }
            case 15: {
                this.E();
                return;
            }
            case 14: {
                this.H4();
                return;
            }
            case 13: {
                this.X0();
                return;
            }
            case 12: {
                this.J2();
                return;
            }
            case 11: {
                this.F2();
                this.b4();
                while (this.o5() != w0.H) {
                    this.C1();
                    this.skipValue();
                }
                break;
            }
            case 10: {
                this.H3();
                return;
            }
            case 9: {
                this.q0();
                return;
            }
            case 8: {
                this.k0();
                return;
            }
            case 7: {
                this.b0();
                return;
            }
            case 6: {
                this.readDouble();
                return;
            }
            case 5: {
                this.b4();
                while (this.o5() != w0.H) {
                    this.C1();
                    this.skipValue();
                }
                break;
            }
            case 4: {
                this.U1();
                return;
            }
            case 3: {
                this.readBoolean();
                return;
            }
            case 2: {
                this.o0();
                return;
            }
            case 1: {
                this.h2();
                while (this.o5() != w0.H) {
                    this.skipValue();
                }
                this.P2();
                return;
            }
        }
        this.K3();
    }
    
    @Override
    protected int j() {
        return this.n().b1().length;
    }
    
    @Override
    protected byte k() {
        return this.n().c1();
    }
    
    @Override
    protected o n() {
        return (o)this.N;
    }
    
    @Override
    protected boolean o() {
        return (boolean)this.N;
    }
    
    @Override
    public w0 o5() {
        if (this.isClosed()) {
            throw new IllegalStateException("This instance has been closed");
        }
        if (this.Z() == d.G || this.Z() == d.N || this.Z() == d.K) {
            this.f0(d.H);
        }
        final d z = this.Z();
        final d h = d.H;
        if (z != h) {
            this.i0("readBSONType", h);
        }
        final u c = this.L0().c();
        final u h2 = u.H;
        c0 m3;
        u i;
        while (true) {
            Label_0210: {
                if (c != h2) {
                    break Label_0210;
                }
                final c0 m0 = this.M0();
                final int n = w$a.a[m0.a().ordinal()];
                d d;
                if (n != 1 && n != 2) {
                    if (n != 3) {
                        throw new v("JSON reader was expecting a name but found '%s'.", new Object[] { m0.b() });
                    }
                    d = a.d.L;
                }
                else {
                    this.e0(m0.c(String.class));
                    final c0 m2 = this.M0();
                    if (m2.a() == d0.N) {
                        break Label_0210;
                    }
                    throw new v("JSON reader was expecting ':' but found '%s'.", new Object[] { m2.b() });
                }
                this.f0(d);
                return w0.H;
            }
            m3 = this.M0();
            final u c2 = this.L0().c();
            i = u.I;
            if (c2 == i && m3.a() == d0.J) {
                final d d = a.d.M;
                continue;
            }
            break;
        }
        boolean b = false;
        Label_1009: {
            Label_1007: {
                Object n2 = null;
                Label_1002: {
                    w0 w0 = null;
                    Label_0991: {
                        w0 w2 = null;
                        Label_0371: {
                            switch (w$a.a[m3.a().ordinal()]) {
                                case 10: {
                                    w0 = org.bson.w0.S;
                                    break Label_0991;
                                }
                                case 9: {
                                    w0 = org.bson.w0.Z;
                                    break Label_0991;
                                }
                                case 8: {
                                    w0 = org.bson.w0.X;
                                    break Label_0991;
                                }
                                case 7: {
                                    w2 = org.bson.w0.H;
                                    break Label_0371;
                                }
                                case 6: {
                                    w0 = org.bson.w0.I;
                                    break Label_0991;
                                }
                                case 5: {
                                    this.B1();
                                    break Label_1007;
                                }
                                case 4: {
                                    w2 = org.bson.w0.L;
                                    break Label_0371;
                                }
                                case 2: {
                                    final String s = m3.c(String.class);
                                    if (!"false".equals(s) && !"true".equals(s)) {
                                        double d2;
                                        if ("Infinity".equals(s)) {
                                            this.d0(org.bson.w0.I);
                                            d2 = Double.POSITIVE_INFINITY;
                                        }
                                        else if ("NaN".equals(s)) {
                                            this.d0(org.bson.w0.I);
                                            d2 = Double.NaN;
                                        }
                                        else {
                                            if ("null".equals(s)) {
                                                w2 = org.bson.w0.R;
                                                break Label_0371;
                                            }
                                            if ("undefined".equals(s)) {
                                                w2 = org.bson.w0.N;
                                                break Label_0371;
                                            }
                                            if ("MinKey".equals(s)) {
                                                this.z1();
                                                this.d0(org.bson.w0.b0);
                                                n2 = new h();
                                                break Label_1002;
                                            }
                                            if ("MaxKey".equals(s)) {
                                                this.z1();
                                                this.d0(org.bson.w0.c0);
                                                n2 = new g();
                                                break Label_1002;
                                            }
                                            if ("BinData".equals(s)) {
                                                this.d0(org.bson.w0.M);
                                                n2 = this.g1();
                                                break Label_1002;
                                            }
                                            if ("Date".equals(s)) {
                                                this.N = this.q1();
                                                w2 = org.bson.w0.J;
                                                break Label_0371;
                                            }
                                            if ("HexData".equals(s)) {
                                                this.d0(org.bson.w0.M);
                                                n2 = this.E1();
                                                break Label_1002;
                                            }
                                            long l;
                                            if ("ISODate".equals(s)) {
                                                this.d0(org.bson.w0.Q);
                                                l = this.F1();
                                            }
                                            else {
                                                if ("NumberInt".equals(s)) {
                                                    this.d0(org.bson.w0.X);
                                                    n2 = this.j2();
                                                    break Label_1002;
                                                }
                                                if ("NumberLong".equals(s)) {
                                                    this.d0(org.bson.w0.Z);
                                                    l = this.o2();
                                                }
                                                else {
                                                    if ("NumberDecimal".equals(s)) {
                                                        this.d0(org.bson.w0.a0);
                                                        n2 = this.Q1();
                                                        break Label_1002;
                                                    }
                                                    if ("ObjectId".equals(s)) {
                                                        this.d0(org.bson.w0.O);
                                                        n2 = this.q2();
                                                        break Label_1002;
                                                    }
                                                    if ("Timestamp".equals(s)) {
                                                        this.d0(org.bson.w0.Y);
                                                        n2 = this.A2();
                                                        break Label_1002;
                                                    }
                                                    if ("RegExp".equals(s)) {
                                                        this.d0(org.bson.w0.S);
                                                        n2 = this.u2();
                                                        break Label_1002;
                                                    }
                                                    if ("DBPointer".equals(s)) {
                                                        this.d0(org.bson.w0.T);
                                                        n2 = this.o1();
                                                        break Label_1002;
                                                    }
                                                    if ("UUID".equals(s) || "GUID".equals(s) || "CSUUID".equals(s) || "CSGUID".equals(s) || "JUUID".equals(s) || "JGUID".equals(s) || "PYUUID".equals(s) || "PYGUID".equals(s)) {
                                                        this.d0(org.bson.w0.M);
                                                        n2 = this.K2(s);
                                                        break Label_1002;
                                                    }
                                                    if ("new".equals(s)) {
                                                        this.M1();
                                                        break Label_1007;
                                                    }
                                                    break;
                                                }
                                            }
                                            n2 = l;
                                            break Label_1002;
                                        }
                                        n2 = d2;
                                        break Label_1002;
                                    }
                                    this.d0(org.bson.w0.P);
                                    n2 = Boolean.parseBoolean(s);
                                    break Label_1002;
                                }
                                case 1: {
                                    w0 = org.bson.w0.J;
                                    break Label_0991;
                                }
                            }
                            b = true;
                            break Label_1009;
                        }
                        this.d0(w2);
                        break Label_1007;
                    }
                    this.d0(w0);
                    n2 = m3.b();
                }
                this.N = n2;
            }
            b = false;
        }
        if (!b) {
            if (this.L0().c() == i || this.L0().c() == h2) {
                final c0 m4 = this.M0();
                if (m4.a() != d0.O) {
                    this.N0(m4);
                }
            }
            final int n3 = w$a.b[this.L0().c().ordinal()];
            d d3;
            if (n3 != 3 && n3 != 4 && n3 != 5) {
                d3 = d.I;
            }
            else {
                d3 = d.J;
            }
            this.f0(d3);
            return this.O5();
        }
        throw new v("JSON reader was expecting a value but found '%s'.", new Object[] { m3.b() });
    }
    
    @Override
    protected org.bson.w q() {
        return (org.bson.w)this.N;
    }
    
    @Override
    protected long r() {
        return (long)this.N;
    }
    
    @Deprecated
    @Override
    public void reset() {
        final c o = this.O;
        if (o != null) {
            o.reset();
            this.O = null;
            return;
        }
        throw new org.bson.h("trying to reset a mark before creating it");
    }
    
    public Decimal128 s() {
        return (Decimal128)this.N;
    }
    
    @Override
    protected double t() {
        return (double)this.N;
    }
    
    @Override
    protected void w() {
        this.a0((a.b)this.L0().e());
        if (this.L0().c() == u.I || this.L0().c() == u.H) {
            final c0 m0 = this.M0();
            if (m0.a() != d0.O) {
                this.N0(m0);
            }
        }
    }
    
    @Override
    protected void x() {
        this.a0((a.b)this.L0().e());
        if (this.L0() != null && this.L0().c() == u.K) {
            this.a0((a.b)this.L0().e());
            this.e1(d0.M);
        }
        if (this.L0() != null) {
            if (this.L0().c() == u.I || this.L0().c() == u.H) {
                final c0 m0 = this.M0();
                if (m0.a() != d0.O) {
                    this.N0(m0);
                }
            }
            return;
        }
        throw new v("Unexpected end of document.");
    }
    
    @Override
    protected int y() {
        return (int)this.N;
    }
    
    protected class b extends a.b
    {
        protected b(final a.b b, final u u) {
            super(b, u);
        }
        
        @Override
        protected u c() {
            return super.c();
        }
        
        protected b e() {
            return (b)super.d();
        }
    }
    
    protected class c extends a.c
    {
        private final c0 g;
        private final Object h;
        private final int i;
        
        protected c() {
            this.g = w.this.M;
            this.h = w.this.N;
            this.i = w.this.L.b();
        }
        
        public void c() {
            w.this.L.a(this.i);
        }
        
        @Override
        public void reset() {
            super.reset();
            w.this.M = this.g;
            w.this.N = this.h;
            w.this.L.d(this.i);
            final w j = w.this;
            j.a0(j.new b(((a.c)this).b(), ((a.c)this).a()));
        }
    }
}
