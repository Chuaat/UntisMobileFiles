// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.common.StringUtil;
import android.annotation.SuppressLint;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.Origin;
import com.facebook.stetho.common.ListUtil;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import java.util.Collections;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.common.LogUtil;
import java.util.ArrayList;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class CSS implements ChromeDevtoolsDomain
{
    private final Document mDocument;
    private final ObjectMapper mObjectMapper;
    private final ChromePeerManager mPeerManager;
    
    public CSS(final Document document) {
        this.mDocument = Util.throwIfNull(document);
        this.mObjectMapper = new ObjectMapper();
        (this.mPeerManager = new ChromePeerManager()).setListener(new PeerManagerListener());
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getComputedStyleForNode(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final GetComputedStyleForNodeRequest getComputedStyleForNodeRequest = this.mObjectMapper.convertValue(jsonObject, GetComputedStyleForNodeRequest.class);
        final GetComputedStyleForNodeResult getComputedStyleForNodeResult = new GetComputedStyleForNodeResult();
        getComputedStyleForNodeResult.computedStyle = new ArrayList<CSSComputedStyleProperty>();
        this.mDocument.postAndWait(new Runnable() {
            @Override
            public void run() {
                final Object elementForNodeId = CSS.this.mDocument.getElementForNodeId(getComputedStyleForNodeRequest.nodeId);
                if (elementForNodeId == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Tried to get the style of an element that does not exist, using nodeid=");
                    sb.append(getComputedStyleForNodeRequest.nodeId);
                    LogUtil.e(sb.toString());
                    return;
                }
                CSS.this.mDocument.getElementComputedStyles(elementForNodeId, new ComputedStyleAccumulator() {
                    @Override
                    public void store(final String name, final String value) {
                        final CSSComputedStyleProperty cssComputedStyleProperty = new CSSComputedStyleProperty();
                        cssComputedStyleProperty.name = name;
                        cssComputedStyleProperty.value = value;
                        getComputedStyleForNodeResult.computedStyle.add(cssComputedStyleProperty);
                    }
                });
            }
        });
        return getComputedStyleForNodeResult;
    }
    
    @ChromeDevtoolsMethod
    @SuppressLint({ "DefaultLocale" })
    public JsonRpcResult getMatchedStylesForNode(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final GetMatchedStylesForNodeRequest getMatchedStylesForNodeRequest = this.mObjectMapper.convertValue(jsonObject, GetMatchedStylesForNodeRequest.class);
        final GetMatchedStylesForNodeResult getMatchedStylesForNodeResult = new GetMatchedStylesForNodeResult();
        getMatchedStylesForNodeResult.matchedCSSRules = new ArrayList<RuleMatch>();
        getMatchedStylesForNodeResult.inherited = Collections.emptyList();
        getMatchedStylesForNodeResult.pseudoElements = Collections.emptyList();
        this.mDocument.postAndWait(new Runnable() {
            @Override
            public void run() {
                final Object elementForNodeId = CSS.this.mDocument.getElementForNodeId(getMatchedStylesForNodeRequest.nodeId);
                if (elementForNodeId == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get style of an element that does not exist, nodeid=");
                    sb.append(getMatchedStylesForNodeRequest.nodeId);
                    LogUtil.w(sb.toString());
                    return;
                }
                CSS.this.mDocument.getElementStyleRuleNames(elementForNodeId, new StyleRuleNameAccumulator() {
                    @Override
                    public void store(final String value, final boolean b) {
                        final ArrayList<CSSProperty> cssProperties = new ArrayList<CSSProperty>();
                        final RuleMatch ruleMatch = new RuleMatch();
                        ruleMatch.matchingSelectors = ListUtil.newImmutableList(0);
                        final Selector selector = new Selector();
                        selector.value = value;
                        final CSSRule rule = new CSSRule();
                        rule.origin = Origin.REGULAR;
                        final SelectorList selectorList = new SelectorList();
                        rule.selectorList = selectorList;
                        selectorList.selectors = ListUtil.newImmutableList(selector);
                        final CSSStyle style = new CSSStyle();
                        rule.style = style;
                        style.cssProperties = cssProperties;
                        style.shorthandEntries = Collections.emptyList();
                        if (b) {
                            rule.style.styleSheetId = String.format("%s.%s", Integer.toString(getMatchedStylesForNodeRequest.nodeId), selector.value);
                        }
                        CSS.this.mDocument.getElementStyles(elementForNodeId, value, new StyleAccumulator() {
                            @Override
                            public void store(final String name, final String value, final boolean b) {
                                final CSSProperty e = new CSSProperty();
                                e.name = name;
                                e.value = value;
                                cssProperties.add(e);
                            }
                        });
                        ruleMatch.rule = rule;
                        getMatchedStylesForNodeResult.matchedCSSRules.add(ruleMatch);
                    }
                });
            }
        });
        return getMatchedStylesForNodeResult;
    }
    
    @ChromeDevtoolsMethod
    public SetPropertyTextResult setPropertyText(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final SetPropertyTextRequest setPropertyTextRequest = this.mObjectMapper.convertValue(jsonObject, SetPropertyTextRequest.class);
        final String[] split = setPropertyTextRequest.styleSheetId.split("\\.", 2);
        final int int1 = Integer.parseInt(split[0]);
        final String s = split[1];
        final String text = setPropertyTextRequest.text;
        String trim;
        String trim2;
        if (text != null && text.contains(":")) {
            final String[] split2 = setPropertyTextRequest.text.split(":", 2);
            trim = split2[0].trim();
            trim2 = StringUtil.removeAll(split2[1], ';').trim();
        }
        else {
            trim = (trim2 = null);
        }
        final SetPropertyTextResult setPropertyTextResult = new SetPropertyTextResult();
        final CSSStyle style = new CSSStyle();
        setPropertyTextResult.style = style;
        style.styleSheetId = setPropertyTextRequest.styleSheetId;
        style.cssProperties = new ArrayList<CSSProperty>();
        setPropertyTextResult.style.shorthandEntries = Collections.emptyList();
        this.mDocument.postAndWait(new Runnable() {
            @Override
            public void run() {
                final Object elementForNodeId = CSS.this.mDocument.getElementForNodeId(int1);
                if (elementForNodeId == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get style of an element that does not exist, nodeid=");
                    sb.append(int1);
                    LogUtil.w(sb.toString());
                    return;
                }
                if (trim != null) {
                    CSS.this.mDocument.setElementStyle(elementForNodeId, s, trim, trim2);
                }
                CSS.this.mDocument.getElementStyles(elementForNodeId, s, new StyleAccumulator() {
                    @Override
                    public void store(final String name, final String value, final boolean b) {
                        final CSSProperty cssProperty = new CSSProperty();
                        cssProperty.name = name;
                        cssProperty.value = value;
                        setPropertyTextResult.style.cssProperties.add(cssProperty);
                    }
                });
            }
        });
        return setPropertyTextResult;
    }
    
    private static class CSSComputedStyleProperty
    {
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public String value;
    }
    
    private static class CSSProperty
    {
        @JsonProperty
        public Boolean disabled;
        @JsonProperty
        public Boolean implicit;
        @JsonProperty
        public Boolean important;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty
        public Boolean parsedOk;
        @JsonProperty
        public SourceRange range;
        @JsonProperty
        public String text;
        @JsonProperty(required = true)
        public String value;
    }
    
    private static class CSSRule
    {
        @JsonProperty
        public Origin origin;
        @JsonProperty(required = true)
        public SelectorList selectorList;
        @JsonProperty
        public CSSStyle style;
        @JsonProperty
        public String styleSheetId;
    }
    
    private static class CSSStyle
    {
        @JsonProperty(required = true)
        public List<CSSProperty> cssProperties;
        @JsonProperty
        public String cssText;
        @JsonProperty
        public SourceRange range;
        @JsonProperty
        public List<ShorthandEntry> shorthandEntries;
        @JsonProperty
        public String styleSheetId;
    }
    
    private static class GetComputedStyleForNodeRequest
    {
        @JsonProperty(required = true)
        public int nodeId;
    }
    
    private static class GetComputedStyleForNodeResult implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<CSSComputedStyleProperty> computedStyle;
    }
    
    private static class GetMatchedStylesForNodeRequest implements JsonRpcResult
    {
        @JsonProperty
        public Boolean excludeInherited;
        @JsonProperty
        public Boolean excludePseudo;
        @JsonProperty(required = true)
        public int nodeId;
    }
    
    private static class GetMatchedStylesForNodeResult implements JsonRpcResult
    {
        @JsonProperty
        public List<InheritedStyleEntry> inherited;
        @JsonProperty
        public List<RuleMatch> matchedCSSRules;
        @JsonProperty
        public List<PseudoIdMatches> pseudoElements;
    }
    
    private static class InheritedStyleEntry
    {
        @JsonProperty(required = true)
        public CSSStyle inlineStyle;
        @JsonProperty(required = true)
        public List<RuleMatch> matchedCSSRules;
    }
    
    private final class PeerManagerListener extends PeersRegisteredListener
    {
        @Override
        protected void onFirstPeerRegistered() {
            synchronized (this) {
                CSS.this.mDocument.addRef();
            }
        }
        
        @Override
        protected void onLastPeerUnregistered() {
            synchronized (this) {
                CSS.this.mDocument.release();
            }
        }
    }
    
    private static class PseudoIdMatches
    {
        @JsonProperty(required = true)
        public List<RuleMatch> matches;
        @JsonProperty(required = true)
        public int pseudoId;
        
        public PseudoIdMatches() {
            this.matches = new ArrayList<RuleMatch>();
        }
    }
    
    private static class RuleMatch
    {
        @JsonProperty
        public List<Integer> matchingSelectors;
        @JsonProperty
        public CSSRule rule;
    }
    
    private static class Selector
    {
        @JsonProperty
        public SourceRange range;
        @JsonProperty(required = true)
        public String value;
    }
    
    private static class SelectorList
    {
        @JsonProperty
        public List<Selector> selectors;
        @JsonProperty
        public String text;
    }
    
    private static class SetPropertyTextRequest implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public String styleSheetId;
        @JsonProperty(required = true)
        public String text;
    }
    
    private static class SetPropertyTextResult implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public CSSStyle style;
    }
    
    private static class ShorthandEntry
    {
        @JsonProperty
        public Boolean important;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public String value;
    }
    
    private static class SourceRange
    {
        @JsonProperty(required = true)
        public int endColumn;
        @JsonProperty(required = true)
        public int endLine;
        @JsonProperty(required = true)
        public int startColumn;
        @JsonProperty(required = true)
        public int startLine;
    }
}
