// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.diagnostics;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

class d implements b
{
    private final Logger a;
    
    d(final String s) {
        this.a = LoggerFactory.getLogger(s);
    }
    
    @Override
    public boolean a() {
        return this.a.isWarnEnabled();
    }
    
    @Override
    public boolean b() {
        return this.a.isDebugEnabled();
    }
    
    @Override
    public void c(final String s) {
        this.a.error(s);
    }
    
    @Override
    public void d(final String s, final Throwable t) {
        this.a.error(s, t);
    }
    
    @Override
    public boolean e() {
        return this.a.isErrorEnabled();
    }
    
    @Override
    public boolean f() {
        return this.a.isInfoEnabled();
    }
    
    @Override
    public void g(final String s) {
        this.a.debug(s);
    }
    
    @Override
    public String getName() {
        return this.a.getName();
    }
    
    @Override
    public boolean h() {
        return this.a.isTraceEnabled();
    }
    
    @Override
    public void i(final String s, final Throwable t) {
        this.a.info(s, t);
    }
    
    @Override
    public void j(final String s, final Throwable t) {
        this.a.warn(s, t);
    }
    
    @Override
    public void k(final String s, final Throwable t) {
        this.a.trace(s, t);
    }
    
    @Override
    public void l(final String s, final Throwable t) {
        this.a.debug(s, t);
    }
    
    @Override
    public void m(final String s) {
        this.a.info(s);
    }
    
    @Override
    public void n(final String s) {
        this.a.warn(s);
    }
    
    @Override
    public void o(final String s) {
        this.a.trace(s);
    }
}
