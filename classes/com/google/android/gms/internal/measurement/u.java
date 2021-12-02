// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.List;

public final class u implements Iterable<q>, q
{
    private final String G;
    
    public u(final String g) {
        if (g != null) {
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
    
    @Override
    public final q c() {
        return new u(this.G);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof u && this.G.equals(((u)o).G));
    }
    
    @Override
    public final Double g() {
        double d;
        if (this.G.isEmpty()) {
            d = 0.0;
        }
        else {
            try {
                return Double.valueOf(this.G);
            }
            catch (NumberFormatException ex) {
                d = Double.NaN;
            }
        }
        return d;
    }
    
    @Override
    public final int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public final q i(String s, final g5 g5, final List<q> list) {
        if (!"charAt".equals(s) && !"concat".equals(s) && !"hasOwnProperty".equals(s) && !"indexOf".equals(s) && !"lastIndexOf".equals(s) && !"match".equals(s) && !"replace".equals(s) && !"search".equals(s) && !"slice".equals(s) && !"split".equals(s) && !"substring".equals(s) && !"toLowerCase".equals(s) && !"toLocaleLowerCase".equals(s) && !"toString".equals(s) && !"toUpperCase".equals(s) && !"toLocaleUpperCase".equals(s) && !"trim".equals(s)) {
            throw new IllegalArgumentException(String.format("%s is not a String function", s));
        }
        int n = 0;
        Label_0600: {
            Label_0597: {
                Label_0517: {
                    switch (s.hashCode()) {
                        case 1943291465: {
                            if (s.equals("indexOf")) {
                                n = 3;
                                break Label_0517;
                            }
                            break;
                        }
                        case 1094496948: {
                            if (s.equals("replace")) {
                                n = 6;
                                break Label_0517;
                            }
                            break;
                        }
                        case 530542161: {
                            if (s.equals("substring")) {
                                n = 10;
                                break Label_0517;
                            }
                            break;
                        }
                        case 109648666: {
                            if (s.equals("split")) {
                                n = 9;
                                break Label_0517;
                            }
                            break;
                        }
                        case 109526418: {
                            if (s.equals("slice")) {
                                n = 8;
                                break Label_0517;
                            }
                            break;
                        }
                        case 103668165: {
                            if (s.equals("match")) {
                                n = 5;
                                break Label_0517;
                            }
                            break;
                        }
                        case 3568674: {
                            if (s.equals("trim")) {
                                n = 16;
                                break Label_0517;
                            }
                            break;
                        }
                        case -399551817: {
                            if (s.equals("toUpperCase")) {
                                n = 15;
                                break Label_0517;
                            }
                            break;
                        }
                        case -467511597: {
                            if (s.equals("lastIndexOf")) {
                                n = 4;
                                break Label_0517;
                            }
                            break;
                        }
                        case -726908483: {
                            if (s.equals("toLocaleUpperCase")) {
                                n = 11;
                                break Label_0517;
                            }
                            break;
                        }
                        case -906336856: {
                            if (s.equals("search")) {
                                n = 7;
                                break Label_0517;
                            }
                            break;
                        }
                        case -1137582698: {
                            if (s.equals("toLowerCase")) {
                                n = 13;
                                break Label_0517;
                            }
                            break;
                        }
                        case -1354795244: {
                            if (s.equals("concat")) {
                                n = 1;
                                break Label_0600;
                            }
                            break;
                        }
                        case -1361633751: {
                            if (s.equals("charAt")) {
                                n = 0;
                                break Label_0600;
                            }
                            break;
                        }
                        case -1464939364: {
                            if (s.equals("toLocaleLowerCase")) {
                                n = 12;
                                break Label_0517;
                            }
                            break;
                        }
                        case -1776922004: {
                            if (s.equals("toString")) {
                                n = 14;
                                break Label_0517;
                            }
                            break;
                        }
                        case -1789698943: {
                            if (s.equals("hasOwnProperty")) {
                                n = 2;
                                break Label_0600;
                            }
                            break;
                        }
                    }
                    break Label_0597;
                }
                break Label_0600;
            }
            n = -1;
        }
        final String s2 = "";
        s = "undefined";
        Object o = null;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 16: {
                h6.h("toUpperCase", 0, list);
                o = new u(this.G.trim());
                break;
            }
            case 15: {
                h6.h("toUpperCase", 0, list);
                o = new u(this.G.toUpperCase(Locale.ENGLISH));
                break;
            }
            case 14: {
                h6.h("toString", 0, list);
                return this;
            }
            case 13: {
                h6.h("toLowerCase", 0, list);
                o = new u(this.G.toLowerCase(Locale.ENGLISH));
                break;
            }
            case 12: {
                h6.h("toLocaleLowerCase", 0, list);
                o = new u(this.G.toLowerCase());
                break;
            }
            case 11: {
                h6.h("toLocaleUpperCase", 0, list);
                o = new u(this.G.toUpperCase());
                break;
            }
            case 10: {
                h6.j("substring", 2, list);
                s = this.G;
                int a;
                if (list.size() > 0) {
                    a = (int)h6.a(g5.b(list.get(0)).g());
                }
                else {
                    a = 0;
                }
                int length;
                if (list.size() > 1) {
                    length = (int)h6.a(g5.b(list.get(1)).g());
                }
                else {
                    length = s.length();
                }
                final int min = Math.min(Math.max(a, 0), s.length());
                final int min2 = Math.min(Math.max(length, 0), s.length());
                o = new u(s.substring(Math.min(min, min2), Math.max(min, min2)));
                break;
            }
            case 9: {
                h6.j("split", 2, list);
                final String g6 = this.G;
                if (g6.length() == 0) {
                    o = new f(Arrays.asList(this));
                    break;
                }
                final ArrayList<q> list2 = new ArrayList<q>();
                if (list.size() == 0) {
                    list2.add(this);
                }
                else {
                    final String k = g5.b(list.get(0)).k();
                    long d;
                    if (list.size() > 1) {
                        d = h6.d(g5.b(list.get(1)).g());
                    }
                    else {
                        d = 2147483647L;
                    }
                    if (d == 0L) {
                        o = new f();
                        break;
                    }
                    final String[] split = g6.split(Pattern.quote(k), (int)d + 1);
                    final int length2 = split.length;
                    int i;
                    int n2;
                    if (k.equals("") && length2 > 0) {
                        i = (split[0].equals("") ? 1 : 0);
                        if (!split[n2 = length2 - 1].equals("")) {
                            n2 = length2;
                        }
                    }
                    else {
                        n2 = length2;
                        i = 0;
                    }
                    int n3 = n2;
                    if (length2 > d) {
                        n3 = n2 - 1;
                    }
                    while (i < n3) {
                        list2.add(new u(split[i]));
                        ++i;
                    }
                }
                o = new f(list2);
                break;
            }
            case 8: {
                h6.j("slice", 2, list);
                s = this.G;
                double doubleValue;
                if (list.size() > 0) {
                    doubleValue = g5.b(list.get(0)).g();
                }
                else {
                    doubleValue = 0.0;
                }
                final double a2 = h6.a(doubleValue);
                double n4;
                if (a2 < 0.0) {
                    n4 = Math.max(s.length() + a2, 0.0);
                }
                else {
                    n4 = Math.min(a2, s.length());
                }
                final int beginIndex = (int)n4;
                double doubleValue2;
                if (list.size() > 1) {
                    doubleValue2 = g5.b(list.get(1)).g();
                }
                else {
                    doubleValue2 = s.length();
                }
                final double a3 = h6.a(doubleValue2);
                double n5;
                if (a3 < 0.0) {
                    n5 = Math.max(s.length() + a3, 0.0);
                }
                else {
                    n5 = Math.min(a3, s.length());
                }
                o = new u(s.substring(beginIndex, Math.max(0, (int)n5 - beginIndex) + beginIndex));
                break;
            }
            case 7: {
                h6.j("search", 1, list);
                if (list.size() > 0) {
                    s = g5.b(list.get(0)).k();
                }
                final Matcher matcher = Pattern.compile(s).matcher(this.G);
                if (matcher.find()) {
                    o = new i((double)matcher.start());
                    break;
                }
                o = new i(-1.0);
                break;
            }
            case 6: {
                h6.j("replace", 2, list);
                q q2;
                final q q = q2 = com.google.android.gms.internal.measurement.q.f;
                if (list.size() > 0) {
                    final String j = g5.b(list.get(0)).k();
                    q2 = q;
                    s = j;
                    if (list.size() > 1) {
                        q2 = g5.b(list.get(1));
                        s = j;
                    }
                }
                final String g7 = this.G;
                final int index = g7.indexOf(s);
                if (index >= 0) {
                    q a4 = q2;
                    if (q2 instanceof j) {
                        a4 = ((j)q2).a(g5, Arrays.asList(new u(s), new i((double)index), this));
                    }
                    final String substring = g7.substring(0, index);
                    final String l = a4.k();
                    s = g7.substring(index + s.length());
                    final StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + String.valueOf(l).length() + String.valueOf(s).length());
                    sb.append(substring);
                    sb.append(l);
                    sb.append(s);
                    o = new u(sb.toString());
                    break;
                }
                return this;
            }
            case 5: {
                h6.j("match", 1, list);
                final String g8 = this.G;
                if (list.size() <= 0) {
                    s = s2;
                }
                else {
                    s = g5.b(list.get(0)).k();
                }
                final Matcher matcher2 = Pattern.compile(s).matcher(g8);
                if (matcher2.find()) {
                    o = new f(Arrays.asList(new u(matcher2.group())));
                    break;
                }
                o = q.g;
                break;
            }
            case 4: {
                h6.j("lastIndexOf", 2, list);
                final String g9 = this.G;
                if (list.size() > 0) {
                    s = g5.b(list.get(0)).k();
                }
                double doubleValue3;
                if (list.size() < 2) {
                    doubleValue3 = Double.NaN;
                }
                else {
                    doubleValue3 = g5.b(list.get(1)).g();
                }
                double a5;
                if (Double.isNaN(doubleValue3)) {
                    a5 = Double.POSITIVE_INFINITY;
                }
                else {
                    a5 = h6.a(doubleValue3);
                }
                o = new i((double)g9.lastIndexOf(s, (int)a5));
                break;
            }
            case 3: {
                h6.j("indexOf", 2, list);
                final String g10 = this.G;
                if (list.size() > 0) {
                    s = g5.b(list.get(0)).k();
                }
                double doubleValue4;
                if (list.size() < 2) {
                    doubleValue4 = 0.0;
                }
                else {
                    doubleValue4 = g5.b(list.get(1)).g();
                }
                o = new i((double)g10.indexOf(s, (int)h6.a(doubleValue4)));
                break;
            }
            case 2: {
                h6.h("hasOwnProperty", 1, list);
                s = this.G;
                final q b = g5.b(list.get(0));
                Label_2266: {
                    if (!"length".equals(b.k())) {
                        final double doubleValue5 = b.g();
                        if (doubleValue5 == Math.floor(doubleValue5)) {
                            final int n6 = (int)doubleValue5;
                            if (n6 >= 0 && n6 < s.length()) {
                                break Label_2266;
                            }
                        }
                        o = q.l;
                        break;
                    }
                }
                o = q.k;
                break;
            }
            case 1: {
                if (list.size() != 0) {
                    final StringBuilder sb2 = new StringBuilder(this.G);
                    for (int n7 = 0; n7 < list.size(); ++n7) {
                        sb2.append(g5.b(list.get(n7)).k());
                    }
                    o = new u(sb2.toString());
                    break;
                }
                return this;
            }
            case 0: {
                h6.j("charAt", 1, list);
                int index2;
                if (list.size() > 0) {
                    index2 = (int)h6.a(g5.b(list.get(0)).g());
                }
                else {
                    index2 = 0;
                }
                s = this.G;
                if (index2 >= 0 && index2 < s.length()) {
                    o = new u(String.valueOf(s.charAt(index2)));
                    break;
                }
                o = q.m;
                break;
            }
        }
        return (q)o;
        o = this;
        return (q)o;
    }
    
    @Override
    public final Iterator<q> iterator() {
        return new t(this);
    }
    
    @Override
    public final String k() {
        return this.G;
    }
    
    @Override
    public final Boolean m() {
        return this.G.isEmpty() ^ true;
    }
    
    @Override
    public final Iterator<q> p() {
        return new s(this);
    }
    
    @Override
    public final String toString() {
        final String g = this.G;
        final StringBuilder sb = new StringBuilder(g.length() + 2);
        sb.append('\"');
        sb.append(g);
        sb.append('\"');
        return sb.toString();
    }
}
