// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

public interface w
{
    public static final String a = "CUSTOM";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 100;
    public static final int g = 101;
    
    boolean b(final int p0, final int p1);
    
    boolean c(final int p0, final float p1);
    
    boolean d(final int p0, final String p1);
    
    boolean e(final int p0, final boolean p1);
    
    int f(final String p0);
    
    public interface a
    {
        public static final String A = "rotationY";
        public static final String B = "rotationZ";
        public static final String C = "scaleX";
        public static final String D = "scaleY";
        public static final String E = "pivotX";
        public static final String F = "pivotY";
        public static final String G = "progress";
        public static final String H = "pathRotate";
        public static final String I = "easing";
        public static final String J = "CUSTOM";
        public static final String K = "frame";
        public static final String L = "target";
        public static final String M = "pivotTarget";
        public static final String[] N = { "curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", "frame", "target", "pivotTarget" };
        public static final int a = 301;
        public static final int b = 302;
        public static final int c = 303;
        public static final int d = 304;
        public static final int e = 305;
        public static final int f = 306;
        public static final int g = 307;
        public static final int h = 308;
        public static final int i = 309;
        public static final int j = 310;
        public static final int k = 311;
        public static final int l = 312;
        public static final int m = 313;
        public static final int n = 314;
        public static final int o = 315;
        public static final int p = 316;
        public static final int q = 317;
        public static final int r = 318;
        public static final String s = "curveFit";
        public static final String t = "visibility";
        public static final String u = "alpha";
        public static final String v = "translationX";
        public static final String w = "translationY";
        public static final String x = "translationZ";
        public static final String y = "elevation";
        public static final String z = "rotationX";
    }
    
    public interface b
    {
        public static final String a = "integer";
        public static final String b = "float";
        public static final String c = "color";
        public static final String d = "string";
        public static final String e = "boolean";
        public static final String f = "dimension";
        public static final String g = "refrence";
        public static final String[] h = { "float", "color", "string", "boolean", "dimension", "refrence" };
        public static final int i = 900;
        public static final int j = 901;
        public static final int k = 902;
        public static final int l = 903;
        public static final int m = 904;
        public static final int n = 905;
        public static final int o = 906;
    }
    
    public interface c
    {
        public static final String A = "translationY";
        public static final String B = "translationZ";
        public static final String C = "elevation";
        public static final String D = "rotationX";
        public static final String E = "rotationY";
        public static final String F = "rotationZ";
        public static final String G = "scaleX";
        public static final String H = "scaleY";
        public static final String I = "pivotX";
        public static final String J = "pivotY";
        public static final String K = "progress";
        public static final String L = "pathRotate";
        public static final String M = "easing";
        public static final String N = "waveShape";
        public static final String O = "customWave";
        public static final String P = "period";
        public static final String Q = "offset";
        public static final String R = "phase";
        public static final String[] S = { "curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", "customWave", "period", "offset", "phase" };
        public static final int a = 401;
        public static final int b = 402;
        public static final int c = 403;
        public static final int d = 304;
        public static final int e = 305;
        public static final int f = 306;
        public static final int g = 307;
        public static final int h = 308;
        public static final int i = 309;
        public static final int j = 310;
        public static final int k = 311;
        public static final int l = 312;
        public static final int m = 313;
        public static final int n = 314;
        public static final int o = 315;
        public static final int p = 416;
        public static final int q = 420;
        public static final int r = 421;
        public static final int s = 422;
        public static final int t = 423;
        public static final int u = 424;
        public static final int v = 425;
        public static final String w = "curveFit";
        public static final String x = "visibility";
        public static final String y = "alpha";
        public static final String z = "translationX";
    }
    
    public interface d
    {
        public static final int A = 612;
        public static final String a = "Stagger";
        public static final String b = "PathRotate";
        public static final String c = "QuantizeMotionPhase";
        public static final String d = "TransitionEasing";
        public static final String e = "QuantizeInterpolator";
        public static final String f = "AnimateRelativeTo";
        public static final String g = "AnimateCircleAngleTo";
        public static final String h = "PathMotionArc";
        public static final String i = "DrawPath";
        public static final String j = "PolarRelativeTo";
        public static final String k = "QuantizeMotionSteps";
        public static final String l = "QuantizeInterpolatorType";
        public static final String m = "QuantizeInterpolatorID";
        public static final String[] n = { "Stagger", "PathRotate", "QuantizeMotionPhase", "TransitionEasing", "QuantizeInterpolator", "AnimateRelativeTo", "AnimateCircleAngleTo", "PathMotionArc", "DrawPath", "PolarRelativeTo", "QuantizeMotionSteps", "QuantizeInterpolatorType", "QuantizeInterpolatorID" };
        public static final int o = 600;
        public static final int p = 601;
        public static final int q = 602;
        public static final int r = 603;
        public static final int s = 604;
        public static final int t = 605;
        public static final int u = 606;
        public static final int v = 607;
        public static final int w = 608;
        public static final int x = 609;
        public static final int y = 610;
        public static final int z = 611;
    }
    
    public interface e
    {
        public static final String a = "transitionEasing";
        public static final String b = "drawPath";
        public static final String c = "percentWidth";
        public static final String d = "percentHeight";
        public static final String e = "sizePercent";
        public static final String f = "percentX";
        public static final String g = "percentY";
        public static final int h = 501;
        public static final int i = 502;
        public static final int j = 503;
        public static final int k = 504;
        public static final int l = 505;
        public static final int m = 506;
        public static final int n = 507;
        public static final int o = 508;
        public static final int p = 509;
        public static final int q = 510;
        public static final String[] r = { "transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY" };
    }
    
    public interface f
    {
        public static final String a = "viewTransitionOnCross";
        public static final String b = "viewTransitionOnPositiveCross";
        public static final String c = "viewTransitionOnNegativeCross";
        public static final String d = "postLayout";
        public static final String e = "triggerSlack";
        public static final String f = "triggerCollisionView";
        public static final String g = "triggerCollisionId";
        public static final String h = "triggerID";
        public static final String i = "positiveCross";
        public static final String j = "negativeCross";
        public static final String k = "triggerReceiver";
        public static final String l = "CROSS";
        public static final String[] m = { "viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS" };
        public static final int n = 301;
        public static final int o = 302;
        public static final int p = 303;
        public static final int q = 304;
        public static final int r = 305;
        public static final int s = 306;
        public static final int t = 307;
        public static final int u = 308;
        public static final int v = 309;
        public static final int w = 310;
        public static final int x = 311;
        public static final int y = 312;
    }
}
