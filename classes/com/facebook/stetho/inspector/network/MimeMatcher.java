// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import android.annotation.SuppressLint;
import c6.h;
import java.util.ArrayList;

public class MimeMatcher<T>
{
    private final ArrayList<MimeMatcherRule> mRuleMap;
    
    public MimeMatcher() {
        this.mRuleMap = new ArrayList<MimeMatcherRule>();
    }
    
    public void addRule(final String s, final T t) {
        this.mRuleMap.add(new MimeMatcherRule(s, t));
    }
    
    public void clear() {
        this.mRuleMap.clear();
    }
    
    @h
    public T match(final String s) {
        for (int size = this.mRuleMap.size(), i = 0; i < size; ++i) {
            final MimeMatcherRule mimeMatcherRule = this.mRuleMap.get(i);
            if (mimeMatcherRule.match(s)) {
                return mimeMatcherRule.getResultIfMatched();
            }
        }
        return null;
    }
    
    @SuppressLint({ "BadMethodUse-java.lang.String.length" })
    private class MimeMatcherRule
    {
        private final boolean mHasWildcard;
        private final String mMatchPrefix;
        private final T mResultIfMatched;
        
        public MimeMatcherRule(final String s, final T mResultIfMatched) {
            if (s.endsWith("*")) {
                this.mHasWildcard = true;
                this.mMatchPrefix = s.substring(0, s.length() - 1);
            }
            else {
                this.mHasWildcard = false;
                this.mMatchPrefix = s;
            }
            if (!this.mMatchPrefix.contains("*")) {
                this.mResultIfMatched = mResultIfMatched;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Multiple wildcards present in rule expression ");
            sb.append(s);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public T getResultIfMatched() {
            return this.mResultIfMatched;
        }
        
        public boolean match(final String s) {
            final boolean startsWith = s.startsWith(this.mMatchPrefix);
            boolean b = false;
            if (!startsWith) {
                return false;
            }
            if (this.mHasWildcard || s.length() == this.mMatchPrefix.length()) {
                b = true;
            }
            return b;
        }
    }
}
