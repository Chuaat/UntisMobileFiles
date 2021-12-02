// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.diagnostics;

import java.util.logging.Level;
import java.util.logging.Logger;

class a implements b
{
    private final Logger a;
    
    a(final String name) {
        this.a = Logger.getLogger(name);
    }
    
    private boolean p(final Level level) {
        return this.a.isLoggable(level);
    }
    
    private void q(final Level level, final String msg) {
        this.a.log(level, msg);
    }
    
    @Override
    public boolean a() {
        return this.a.isLoggable(Level.WARNING);
    }
    
    @Override
    public boolean b() {
        return this.p(Level.FINE);
    }
    
    @Override
    public void c(final String s) {
        this.q(Level.SEVERE, s);
    }
    
    @Override
    public void d(final String s, final Throwable t) {
        this.r(Level.SEVERE, s, t);
    }
    
    @Override
    public boolean e() {
        return this.a.isLoggable(Level.SEVERE);
    }
    
    @Override
    public boolean f() {
        return this.a.isLoggable(Level.INFO);
    }
    
    @Override
    public void g(final String s) {
        this.q(Level.FINE, s);
    }
    
    @Override
    public String getName() {
        return this.a.getName();
    }
    
    @Override
    public boolean h() {
        return this.p(Level.FINER);
    }
    
    @Override
    public void i(final String s, final Throwable t) {
        this.r(Level.INFO, s, t);
    }
    
    @Override
    public void j(final String s, final Throwable t) {
        this.r(Level.WARNING, s, t);
    }
    
    @Override
    public void k(final String s, final Throwable t) {
        this.r(Level.FINER, s, t);
    }
    
    @Override
    public void l(final String s, final Throwable t) {
        this.r(Level.FINE, s, t);
    }
    
    @Override
    public void m(final String s) {
        this.q(Level.INFO, s);
    }
    
    @Override
    public void n(final String s) {
        this.q(Level.WARNING, s);
    }
    
    @Override
    public void o(final String s) {
        this.q(Level.FINER, s);
    }
    
    public void r(final Level level, final String msg, final Throwable thrown) {
        this.a.log(level, msg, thrown);
    }
}
