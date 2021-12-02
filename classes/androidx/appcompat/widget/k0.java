// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.os.Bundle;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.graphics.Movie;
import androidx.annotation.p0;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.content.res.Configuration;
import android.content.res.ColorStateList;
import android.content.res.Resources$NotFoundException;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;

class k0 extends Resources
{
    private final Resources a;
    
    public k0(final Resources a) {
        super(a.getAssets(), a.getDisplayMetrics(), a.getConfiguration());
        this.a = a;
    }
    
    public XmlResourceParser getAnimation(final int n) throws Resources$NotFoundException {
        return this.a.getAnimation(n);
    }
    
    public boolean getBoolean(final int n) throws Resources$NotFoundException {
        return this.a.getBoolean(n);
    }
    
    public int getColor(final int n) throws Resources$NotFoundException {
        return this.a.getColor(n);
    }
    
    public ColorStateList getColorStateList(final int n) throws Resources$NotFoundException {
        return this.a.getColorStateList(n);
    }
    
    public Configuration getConfiguration() {
        return this.a.getConfiguration();
    }
    
    public float getDimension(final int n) throws Resources$NotFoundException {
        return this.a.getDimension(n);
    }
    
    public int getDimensionPixelOffset(final int n) throws Resources$NotFoundException {
        return this.a.getDimensionPixelOffset(n);
    }
    
    public int getDimensionPixelSize(final int n) throws Resources$NotFoundException {
        return this.a.getDimensionPixelSize(n);
    }
    
    public DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }
    
    public Drawable getDrawable(final int n) throws Resources$NotFoundException {
        return this.a.getDrawable(n);
    }
    
    @p0(21)
    public Drawable getDrawable(final int n, final Resources$Theme resources$Theme) throws Resources$NotFoundException {
        return this.a.getDrawable(n, resources$Theme);
    }
    
    @p0(15)
    public Drawable getDrawableForDensity(final int n, final int n2) throws Resources$NotFoundException {
        return this.a.getDrawableForDensity(n, n2);
    }
    
    @p0(21)
    public Drawable getDrawableForDensity(final int n, final int n2, final Resources$Theme resources$Theme) {
        return this.a.getDrawableForDensity(n, n2, resources$Theme);
    }
    
    public float getFraction(final int n, final int n2, final int n3) {
        return this.a.getFraction(n, n2, n3);
    }
    
    public int getIdentifier(final String s, final String s2, final String s3) {
        return this.a.getIdentifier(s, s2, s3);
    }
    
    public int[] getIntArray(final int n) throws Resources$NotFoundException {
        return this.a.getIntArray(n);
    }
    
    public int getInteger(final int n) throws Resources$NotFoundException {
        return this.a.getInteger(n);
    }
    
    public XmlResourceParser getLayout(final int n) throws Resources$NotFoundException {
        return this.a.getLayout(n);
    }
    
    public Movie getMovie(final int n) throws Resources$NotFoundException {
        return this.a.getMovie(n);
    }
    
    public String getQuantityString(final int n, final int n2) throws Resources$NotFoundException {
        return this.a.getQuantityString(n, n2);
    }
    
    public String getQuantityString(final int n, final int n2, final Object... array) throws Resources$NotFoundException {
        return this.a.getQuantityString(n, n2, array);
    }
    
    public CharSequence getQuantityText(final int n, final int n2) throws Resources$NotFoundException {
        return this.a.getQuantityText(n, n2);
    }
    
    public String getResourceEntryName(final int n) throws Resources$NotFoundException {
        return this.a.getResourceEntryName(n);
    }
    
    public String getResourceName(final int n) throws Resources$NotFoundException {
        return this.a.getResourceName(n);
    }
    
    public String getResourcePackageName(final int n) throws Resources$NotFoundException {
        return this.a.getResourcePackageName(n);
    }
    
    public String getResourceTypeName(final int n) throws Resources$NotFoundException {
        return this.a.getResourceTypeName(n);
    }
    
    public String getString(final int n) throws Resources$NotFoundException {
        return this.a.getString(n);
    }
    
    public String getString(final int n, final Object... array) throws Resources$NotFoundException {
        return this.a.getString(n, array);
    }
    
    public String[] getStringArray(final int n) throws Resources$NotFoundException {
        return this.a.getStringArray(n);
    }
    
    public CharSequence getText(final int n) throws Resources$NotFoundException {
        return this.a.getText(n);
    }
    
    public CharSequence getText(final int n, final CharSequence charSequence) {
        return this.a.getText(n, charSequence);
    }
    
    public CharSequence[] getTextArray(final int n) throws Resources$NotFoundException {
        return this.a.getTextArray(n);
    }
    
    public void getValue(final int n, final TypedValue typedValue, final boolean b) throws Resources$NotFoundException {
        this.a.getValue(n, typedValue, b);
    }
    
    public void getValue(final String s, final TypedValue typedValue, final boolean b) throws Resources$NotFoundException {
        this.a.getValue(s, typedValue, b);
    }
    
    @p0(15)
    public void getValueForDensity(final int n, final int n2, final TypedValue typedValue, final boolean b) throws Resources$NotFoundException {
        this.a.getValueForDensity(n, n2, typedValue, b);
    }
    
    public XmlResourceParser getXml(final int n) throws Resources$NotFoundException {
        return this.a.getXml(n);
    }
    
    public TypedArray obtainAttributes(final AttributeSet set, final int[] array) {
        return this.a.obtainAttributes(set, array);
    }
    
    public TypedArray obtainTypedArray(final int n) throws Resources$NotFoundException {
        return this.a.obtainTypedArray(n);
    }
    
    public InputStream openRawResource(final int n) throws Resources$NotFoundException {
        return this.a.openRawResource(n);
    }
    
    public InputStream openRawResource(final int n, final TypedValue typedValue) throws Resources$NotFoundException {
        return this.a.openRawResource(n, typedValue);
    }
    
    public AssetFileDescriptor openRawResourceFd(final int n) throws Resources$NotFoundException {
        return this.a.openRawResourceFd(n);
    }
    
    public void parseBundleExtra(final String s, final AttributeSet set, final Bundle bundle) throws XmlPullParserException {
        this.a.parseBundleExtra(s, set, bundle);
    }
    
    public void parseBundleExtras(final XmlResourceParser xmlResourceParser, final Bundle bundle) throws XmlPullParserException, IOException {
        this.a.parseBundleExtras(xmlResourceParser, bundle);
    }
    
    public void updateConfiguration(final Configuration configuration, final DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        final Resources a = this.a;
        if (a != null) {
            a.updateConfiguration(configuration, displayMetrics);
        }
    }
}
