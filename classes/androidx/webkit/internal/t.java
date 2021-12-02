// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

public class t
{
    private WebSettingsBoundaryInterface a;
    
    public t(final WebSettingsBoundaryInterface a) {
        this.a = a;
    }
    
    public int a() {
        return this.a.getDisabledActionModeMenuItems();
    }
    
    public int b() {
        return this.a.getForceDark();
    }
    
    public int c() {
        return this.a.getForceDarkBehavior();
    }
    
    public boolean d() {
        return this.a.getOffscreenPreRaster();
    }
    
    public boolean e() {
        return this.a.getSafeBrowsingEnabled();
    }
    
    public void f(final int disabledActionModeMenuItems) {
        this.a.setDisabledActionModeMenuItems(disabledActionModeMenuItems);
    }
    
    public void g(final int forceDark) {
        this.a.setForceDark(forceDark);
    }
    
    public void h(final int forceDarkBehavior) {
        this.a.setForceDarkBehavior(forceDarkBehavior);
    }
    
    public void i(final boolean offscreenPreRaster) {
        this.a.setOffscreenPreRaster(offscreenPreRaster);
    }
    
    public void j(final boolean safeBrowsingEnabled) {
        this.a.setSafeBrowsingEnabled(safeBrowsingEnabled);
    }
    
    public void k(final boolean willSuppressErrorPage) {
        this.a.setWillSuppressErrorPage(willSuppressErrorPage);
    }
    
    public boolean l() {
        return this.a.getWillSuppressErrorPage();
    }
}
