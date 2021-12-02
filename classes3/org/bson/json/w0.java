// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import e7.a;
import org.bson.h;
import java.io.IOException;
import org.bson.g0;
import java.io.Writer;

public final class w0 implements y0
{
    private final Writer a;
    private final x0 b;
    private c c;
    private b d;
    private int e;
    private boolean f;
    
    public w0(final Writer a, final x0 b) {
        this.c = new c(null, w0.a.G, "");
        this.d = w0.b.G;
        this.a = a;
        this.b = b;
    }
    
    private void j(final b b) {
        if (this.d == b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid state ");
        sb.append(this.d);
        throw new g0(sb.toString());
    }
    
    private void p() {
        Label_0082: {
            if (this.c.b == w0.a.I) {
                if (this.c.d) {
                    this.t(",");
                }
                String c;
                if (this.b.e()) {
                    this.t(this.b.d());
                    c = this.c.c;
                }
                else {
                    if (!this.c.d) {
                        break Label_0082;
                    }
                    c = " ";
                }
                this.t(c);
            }
        }
        this.c.d = true;
    }
    
    private void q() {
        b d;
        if (this.c.b == w0.a.I) {
            d = w0.b.I;
        }
        else {
            d = w0.b.H;
        }
        this.d = d;
    }
    
    private void r(final IOException ex) {
        throw new h("Wrapping IOException", ex);
    }
    
    private void s(final char c) {
        try {
            if (this.b.c() != 0 && this.e >= this.b.c()) {
                this.f = true;
            }
            else {
                this.a.write(c);
                ++this.e;
            }
        }
        catch (IOException ex) {
            this.r(ex);
        }
    }
    
    private void t(final String str) {
        try {
            if (this.b.c() != 0 && str.length() + this.e >= this.b.c()) {
                this.a.write(str.substring(0, this.b.c() - this.e));
                this.e = this.b.c();
                this.f = true;
            }
            else {
                this.a.write(str);
                this.e += str.length();
            }
        }
        catch (IOException ex) {
            this.r(ex);
        }
    }
    
    private void u(final String s) {
        this.s('\"');
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            String hexString = null;
            Label_0283: {
                if (char1 != '\f') {
                    if (char1 != '\r') {
                        if (char1 != '\"') {
                            if (char1 != '\\') {
                                switch (char1) {
                                    default: {
                                        final int type = Character.getType(char1);
                                        Label_0257: {
                                            if (type != 1 && type != 2 && type != 3 && type != 5) {
                                                switch (type) {
                                                    default: {
                                                        switch (type) {
                                                            default: {
                                                                this.t("\\u");
                                                                this.t(Integer.toHexString(('\uf000' & char1) >> 12));
                                                                this.t(Integer.toHexString((char1 & '\u0f00') >> 8));
                                                                this.t(Integer.toHexString((char1 & '\u00f0') >> 4));
                                                                hexString = Integer.toHexString(char1 & '\u000f');
                                                                break Label_0283;
                                                            }
                                                            case 20:
                                                            case 21:
                                                            case 22:
                                                            case 23:
                                                            case 24:
                                                            case 25:
                                                            case 26:
                                                            case 27:
                                                            case 28:
                                                            case 29:
                                                            case 30: {
                                                                break Label_0257;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12: {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        this.s(char1);
                                        continue;
                                    }
                                    case 10: {
                                        hexString = "\\n";
                                        break;
                                    }
                                    case 9: {
                                        hexString = "\\t";
                                        break;
                                    }
                                    case 8: {
                                        hexString = "\\b";
                                        break;
                                    }
                                }
                            }
                            else {
                                hexString = "\\\\";
                            }
                        }
                        else {
                            hexString = "\\\"";
                        }
                    }
                    else {
                        hexString = "\\r";
                    }
                }
                else {
                    hexString = "\\f";
                }
            }
            this.t(hexString);
        }
        this.s('\"');
    }
    
    @Override
    public void C(final String s) {
        this.K(s);
        this.T();
    }
    
    @Override
    public void J(final String s, final boolean b) {
        e7.a.e("name", s);
        this.K(s);
        this.Q(b);
    }
    
    @Override
    public void K(final String s) {
        e7.a.e("name", s);
        this.j(w0.b.H);
        if (this.c.d) {
            this.t(",");
        }
        Label_0083: {
            String c;
            if (this.b.e()) {
                this.t(this.b.d());
                c = this.c.c;
            }
            else {
                if (!this.c.d) {
                    break Label_0083;
                }
                c = " ";
            }
            this.t(c);
        }
        this.u(s);
        this.t(": ");
        this.d = w0.b.I;
    }
    
    @Override
    public void Q(final boolean b) {
        this.j(w0.b.I);
        this.p();
        String s;
        if (b) {
            s = "true";
        }
        else {
            s = "false";
        }
        this.t(s);
        this.q();
    }
    
    @Override
    public void R() {
        this.p();
        this.t("[");
        this.c = new c(this.c, w0.a.I, this.b.b());
        this.d = w0.b.I;
    }
    
    @Override
    public void S(final String s, final String s2) {
        e7.a.e("name", s);
        e7.a.e("value", s2);
        this.K(s);
        this.i(s2);
    }
    
    @Override
    public void T() {
        this.j(w0.b.I);
        this.p();
        this.t("null");
        this.q();
    }
    
    @Override
    public boolean a() {
        return this.f;
    }
    
    @Override
    public void b() {
        this.j(w0.b.H);
        if (this.b.e() && this.c.d) {
            this.t(this.b.d());
            this.t(this.c.a.c);
        }
        this.t("}");
        final c d = this.c.a;
        this.c = d;
        if (d.b == w0.a.G) {
            this.d = w0.b.J;
        }
        else {
            this.q();
        }
    }
    
    @Override
    public void c(final String s) {
        this.K(s);
        this.f();
    }
    
    @Override
    public void d(final String s) {
        e7.a.e("value", s);
        this.j(w0.b.I);
        this.p();
        this.t(s);
        this.q();
    }
    
    @Override
    public void e(final String s, final String s2) {
        e7.a.e("name", s);
        e7.a.e("value", s2);
        this.K(s);
        this.h(s2);
    }
    
    @Override
    public void f() {
        final b d = this.d;
        if (d != w0.b.G && d != w0.b.I) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid state ");
            sb.append(this.d);
            throw new g0(sb.toString());
        }
        this.p();
        this.t("{");
        this.c = new c(this.c, w0.a.H, this.b.b());
        this.d = w0.b.H;
    }
    
    @Override
    public void g(final String s, final String s2) {
        e7.a.e("name", s);
        e7.a.e("value", s2);
        this.K(s);
        this.d(s2);
    }
    
    @Override
    public void h(final String s) {
        e7.a.e("value", s);
        this.j(w0.b.I);
        this.p();
        this.t(s);
        this.q();
    }
    
    @Override
    public void i(final String s) {
        e7.a.e("value", s);
        this.j(w0.b.I);
        this.p();
        this.u(s);
        this.q();
    }
    
    void k() {
        try {
            this.a.flush();
        }
        catch (IOException ex) {
            this.r(ex);
        }
    }
    
    public int l() {
        return this.e;
    }
    
    Writer m() {
        return this.a;
    }
    
    @Override
    public void n(final String s) {
        this.K(s);
        this.R();
    }
    
    @Override
    public void o() {
        this.j(w0.b.I);
        if (this.c.b == w0.a.I) {
            if (this.b.e() && this.c.d) {
                this.t(this.b.d());
                this.t(this.c.a.c);
            }
            this.t("]");
            final c d = this.c.a;
            this.c = d;
            if (d.b == w0.a.G) {
                this.d = w0.b.J;
            }
            else {
                this.q();
            }
            return;
        }
        throw new g0("Can't end an array if not in an array");
    }
    
    private enum a
    {
        G, 
        H, 
        I;
    }
    
    private enum b
    {
        G, 
        H, 
        I, 
        J;
    }
    
    private static class c
    {
        private final c a;
        private final a b;
        private final String c;
        private boolean d;
        
        c(final c a, final a b, String string) {
            this.a = a;
            this.b = b;
            if (a != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(a.c);
                sb.append(string);
                string = sb.toString();
            }
            this.c = string;
        }
    }
}
