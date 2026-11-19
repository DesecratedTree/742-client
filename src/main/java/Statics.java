import java.applet.Applet;
import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.management.GarbageCollectorMXBean;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import net.ClientProt;

public class Statics {
   @deob.ObfuscatedName("ct.sb")
   public static byte field2757;
   @deob.ObfuscatedName("va.sv")
   public static byte field8884;
   @deob.ObfuscatedName("bl.m")
   public static float field2168;
   @deob.ObfuscatedName("ha.e")
   public static float field3970;
   @deob.ObfuscatedName("nf.a")
   public static float field6092;
   @deob.ObfuscatedName("og.e")
   public static float field6398;
   @deob.ObfuscatedName("og.z")
   public static float field6419;
   @deob.ObfuscatedName("yz.u")
   public static int field10450;
   @deob.ObfuscatedName("yz.t")
   public static int field10451;
   @deob.ObfuscatedName("yz.ai")
   public static int field10455;
   @deob.ObfuscatedName("yz.e")
   public static int field10456;
   @deob.ObfuscatedName("yz.v")
   public static int field10462;
   @deob.ObfuscatedName("yz.g")
   public static int field10463;
   @deob.ObfuscatedName("yz.h")
   public static int field10464;
   @deob.ObfuscatedName("yz.z")
   public static int field10466;
   @deob.ObfuscatedName("yz.m")
   public static int field10467;
   @deob.ObfuscatedName("yz.i")
   public static int field10468;
   @deob.ObfuscatedName("yz.c")
   public static int field10470;
   @deob.ObfuscatedName("yz.q")
   public static int field10472;
   @deob.ObfuscatedName("yz.y")
   public static int field10473;
   @deob.ObfuscatedName("yz.w")
   public static int field10476;
   @deob.ObfuscatedName("yz.ap")
   public static int field10477;
   @deob.ObfuscatedName("yz.j")
   public static int field10479;
   @deob.ObfuscatedName("yz.f")
   public static int field10484;
   @deob.ObfuscatedName("z.au")
   public static int field10520;
   @deob.ObfuscatedName("zl.tx")
   public static int field10584;
   @deob.ObfuscatedName("zn.g")
   public static int field10596;
   @deob.ObfuscatedName("zn.oa")
   public static int field10597;
   @deob.ObfuscatedName("afd.la")
   public static int field1097;
   @deob.ObfuscatedName("ag.u")
   public static int field1159;
   @deob.ObfuscatedName("ahq.ie")
   public static int field1371;
   @deob.ObfuscatedName("aan.x")
   public static int field161;
   @deob.ObfuscatedName("ajn.tr")
   public static int field1734;
   @deob.ObfuscatedName("aap.be")
   public static int field182;
   @deob.ObfuscatedName("akm.d")
   public static int field1852;
   @deob.ObfuscatedName("akm.b")
   public static int field1853;
   @deob.ObfuscatedName("al.bd")
   public static int field1896;
   @deob.ObfuscatedName("an.mi")
   public static int field1977;
   @deob.ObfuscatedName("ao.k")
   public static int field1979;
   @deob.ObfuscatedName("ao.d")
   public static int field1980;
   @deob.ObfuscatedName("ao.tg")
   public static int field1994;
   @deob.ObfuscatedName("as.v")
   public static int field2050;
   @deob.ObfuscatedName("aw.b")
   public static int field2072;
   @deob.ObfuscatedName("aw.d")
   public static int field2074;
   @deob.ObfuscatedName("aw.o")
   public static int field2075;
   @deob.ObfuscatedName("aw.r")
   public static int field2076;
   @deob.ObfuscatedName("aw.p")
   public static int field2077;
   @deob.ObfuscatedName("aw.a")
   public static int field2078;
   @deob.ObfuscatedName("cl.z")
   public static int field2388;
   @deob.ObfuscatedName("abf.tw")
   public static int field262;
   @deob.ObfuscatedName("cu.ts")
   public static int field2763;
   @deob.ObfuscatedName("d.d")
   public static int field2830;
   @deob.ObfuscatedName("dc.n")
   public static int field2864;
   @deob.ObfuscatedName("dc.o")
   public static int field2865;
   @deob.ObfuscatedName("dc.k")
   public static int field2866;
   @deob.ObfuscatedName("dc.r")
   public static int field2867;
   @deob.ObfuscatedName("dc.p")
   public static int field2868;
   @deob.ObfuscatedName("dc.d")
   public static int field2869;
   @deob.ObfuscatedName("dc.a")
   public static int field2870;
   @deob.ObfuscatedName("dl.tc")
   public static int field2957;
   @deob.ObfuscatedName("do.ah")
   public static int field2959;
   @deob.ObfuscatedName("dw.qd")
   public static int field3085;
   @deob.ObfuscatedName("eb.js")
   public static int field3113;
   @deob.ObfuscatedName("ed.ko")
   public static int field3115;
   @deob.ObfuscatedName("ee.e")
   public static int field3126;
   @deob.ObfuscatedName("ef.pl")
   public static int field3131;
   @deob.ObfuscatedName("eg.k")
   public static int field3135;
   @deob.ObfuscatedName("abt.kn")
   public static int field337;
   @deob.ObfuscatedName("el.jg")
   public static int field3374;
   @deob.ObfuscatedName("eo.ac")
   public static int field3571;
   @deob.ObfuscatedName("eo.jp")
   public static int field3572;
   @deob.ObfuscatedName("et.h")
   public static int field3600;
   @deob.ObfuscatedName("ez.az")
   public static int field3644;
   @deob.ObfuscatedName("f.ai")
   public static int field3653;
   @deob.ObfuscatedName("fc.g")
   public static int field3666;
   @deob.ObfuscatedName("fc.jh")
   public static int field3667;
   @deob.ObfuscatedName("fe.bv")
   public static int field3678;
   @deob.ObfuscatedName("ff.h")
   public static int field3682;
   @deob.ObfuscatedName("g.to")
   public static int field3823;
   @deob.ObfuscatedName("gj.ad")
   public static int field3871;
   @deob.ObfuscatedName("gl.qk")
   public static int field3877;
   @deob.ObfuscatedName("gn.am")
   public static int field3889;
   @deob.ObfuscatedName("id.d")
   public static int field4150;
   @deob.ObfuscatedName("im.kt")
   public static int field4218;
   @deob.ObfuscatedName("iq.bf")
   public static int field4246;
   @deob.ObfuscatedName("iu.os")
   public static int field4335;
   @deob.ObfuscatedName("iu.tk")
   public static int field4337;
   @deob.ObfuscatedName("j.k")
   public static int field4363;
   @deob.ObfuscatedName("jb.ad")
   public static int field4779;
   @deob.ObfuscatedName("jb.ny")
   public static int field4780;
   @deob.ObfuscatedName("jf.bp")
   public static int field4906;
   @deob.ObfuscatedName("ack.ql")
   public static int field491;
   @deob.ObfuscatedName("jl.tj")
   public static int field5127;
   @deob.ObfuscatedName("jr.av")
   public static int field5194;
   @deob.ObfuscatedName("acp.p")
   public static int field522;
   @deob.ObfuscatedName("acp.aj")
   public static int field525;
   @deob.ObfuscatedName("jt.ve")
   public static int field5278;
   @deob.ObfuscatedName("kb.d")
   public static int field5326;
   @deob.ObfuscatedName("kb.k")
   public static int field5327;
   @deob.ObfuscatedName("kh.x")
   public static int field5374;
   @deob.ObfuscatedName("kh.a")
   public static int field5377;
   @deob.ObfuscatedName("kl.e")
   public static int field5408;
   @deob.ObfuscatedName("kx.k")
   public static int field5476;
   @deob.ObfuscatedName("kx.d")
   public static int field5477;
   @deob.ObfuscatedName("le.le")
   public static int field5542;
   @deob.ObfuscatedName("lk.ar")
   public static int field5595;
   @deob.ObfuscatedName("lo.qy")
   public static int field5611;
   @deob.ObfuscatedName("ls.g")
   public static int field5712;
   @deob.ObfuscatedName("ly.tu")
   public static int field5754;
   @deob.ObfuscatedName("mc.tf")
   public static int field5794;
   @deob.ObfuscatedName("me.ao")
   public static int field5803;
   @deob.ObfuscatedName("mf.jn")
   public static int field5809;
   @deob.ObfuscatedName("mj.b")
   public static int field5845;
   @deob.ObfuscatedName("mj.k")
   public static int field5854;
   @deob.ObfuscatedName("ml.tm")
   public static int field5929;
   @deob.ObfuscatedName("mo.r")
   public static int field5937;
   @deob.ObfuscatedName("mo.qx")
   public static int field5945;
   @deob.ObfuscatedName("mu.tv")
   public static int field5998;
   @deob.ObfuscatedName("mv.tp")
   public static int field6047;
   @deob.ObfuscatedName("nc.ay")
   public static int field6080;
   @deob.ObfuscatedName("nd.iu")
   public static int field6081;
   @deob.ObfuscatedName("nf.x")
   public static int field6091;
   @deob.ObfuscatedName("nh.o")
   public static int field6102;
   @deob.ObfuscatedName("nh.u")
   public static int field6104;
   @deob.ObfuscatedName("nh.n")
   public static int field6115;
   @deob.ObfuscatedName("ni.vv")
   public static int field6134;
   @deob.ObfuscatedName("nn.pi")
   public static int field6160;
   @deob.ObfuscatedName("adc.v")
   public static int field631;
   @deob.ObfuscatedName("oc.v")
   public static int field6354;
   @deob.ObfuscatedName("od.th")
   public static int field6369;
   @deob.ObfuscatedName("adc.u")
   public static int field637;
   @deob.ObfuscatedName("oe.ar")
   public static int field6374;
   @deob.ObfuscatedName("og.ag")
   public static int field6383;
   @deob.ObfuscatedName("adc.g")
   public static int field639;
   @deob.ObfuscatedName("og.ah")
   public static int field6393;
   @deob.ObfuscatedName("og.aw")
   public static int field6397;
   @deob.ObfuscatedName("og.an")
   public static int field6401;
   @deob.ObfuscatedName("og.t")
   public static int field6402;
   @deob.ObfuscatedName("og.q")
   public static int field6403;
   @deob.ObfuscatedName("og.w")
   public static int field6404;
   @deob.ObfuscatedName("og.al")
   public static int field6413;
   @deob.ObfuscatedName("og.v")
   public static int field6417;
   @deob.ObfuscatedName("og.c")
   public static int field6418;
   @deob.ObfuscatedName("og.ak")
   public static int field6420;
   @deob.ObfuscatedName("og.aa")
   public static int field6421;
   @deob.ObfuscatedName("og.ao")
   public static int field6422;
   @deob.ObfuscatedName("adc.l")
   public static int field648;
   @deob.ObfuscatedName("on.nh")
   public static int field6495;
   @deob.ObfuscatedName("oy.a")
   public static int field6635;
   @deob.ObfuscatedName("oy.jm")
   public static int field6636;
   @deob.ObfuscatedName("oy.tz")
   public static int field6637;
   @deob.ObfuscatedName("p.o")
   public static int field6640;
   @deob.ObfuscatedName("pa.as")
   public static int field6641;
   @deob.ObfuscatedName("add.az")
   public static int field666;
   @deob.ObfuscatedName("pc.op")
   public static int field6667;
   @deob.ObfuscatedName("ade.r")
   public static int field668;
   @deob.ObfuscatedName("pn.kw")
   public static int field6719;
   @deob.ObfuscatedName("pt.x")
   public static int field6781;
   @deob.ObfuscatedName("pv.bm")
   public static int field6796;
   @deob.ObfuscatedName("pv.ok")
   public static int field6798;
   @deob.ObfuscatedName("px.u")
   public static int field6806;
   @deob.ObfuscatedName("q.d")
   public static int field6855;
   @deob.ObfuscatedName("qg.kg")
   public static int field6938;
   @deob.ObfuscatedName("qg.sk")
   public static int field6939;
   @deob.ObfuscatedName("qk.o")
   public static int field6951;
   @deob.ObfuscatedName("qk.p")
   public static int field6955;
   @deob.ObfuscatedName("qk.s")
   public static int field6956;
   @deob.ObfuscatedName("qs.l")
   public static int field7012;
   @deob.ObfuscatedName("qt.ol")
   public static int field7025;
   @deob.ObfuscatedName("r.b")
   public static int field7083;
   @deob.ObfuscatedName("r.k")
   public static int field7084;
   @deob.ObfuscatedName("r.l")
   public static int field7085;
   @deob.ObfuscatedName("r.r")
   public static int field7086;
   @deob.ObfuscatedName("r.p")
   public static int field7087;
   @deob.ObfuscatedName("r.v")
   public static int field7088;
   @deob.ObfuscatedName("r.x")
   public static int field7089;
   @deob.ObfuscatedName("r.n")
   public static int field7091;
   @deob.ObfuscatedName("r.s")
   public static int field7092;
   @deob.ObfuscatedName("r.a")
   public static int field7097;
   @deob.ObfuscatedName("r.kv")
   public static int field7098;
   @deob.ObfuscatedName("rc.aq")
   public static int field7128;
   @deob.ObfuscatedName("rf.ab")
   public static int field7145;
   @deob.ObfuscatedName("rj.b")
   public static int field7161;
   @deob.ObfuscatedName("rk.ai")
   public static int field7166;
   @deob.ObfuscatedName("ry.am")
   public static int field7271;
   @deob.ObfuscatedName("sf.p")
   public static int field7306;
   @deob.ObfuscatedName("si.qz")
   public static int field8381;
   @deob.ObfuscatedName("sl.aa")
   public static int field8391;
   @deob.ObfuscatedName("sl.ae")
   public static int field8392;
   @deob.ObfuscatedName("so.ch")
   public static int field8398;
   @deob.ObfuscatedName("so.ty")
   public static int field8399;
   @deob.ObfuscatedName("sp.h")
   public static int field8401;
   @deob.ObfuscatedName("ta.ou")
   public static int field8467;
   @deob.ObfuscatedName("te.ob")
   public static int field8478;
   @deob.ObfuscatedName("th.u")
   public static int field8502;
   @deob.ObfuscatedName("ti.on")
   public static int field8518;
   @deob.ObfuscatedName("tp.z")
   public static int field8558;
   @deob.ObfuscatedName("ts.nv")
   public static int field8650;
   @deob.ObfuscatedName("ts.tb")
   public static int field8651;
   @deob.ObfuscatedName("ub.ax")
   public static int field8746;
   @deob.ObfuscatedName("up.bj")
   public static int field8823;
   @deob.ObfuscatedName("ux.ap")
   public static int field8870;
   @deob.ObfuscatedName("ux.v")
   public static int field8871;
   @deob.ObfuscatedName("aaa.g")
   public static int field9;
   @deob.ObfuscatedName("vd.as")
   public static int field9063;
   @deob.ObfuscatedName("aeg.g")
   public static int field908;
   @deob.ObfuscatedName("aeg.aq")
   public static int field909;
   @deob.ObfuscatedName("vp.k")
   public static int field9103;
   @deob.ObfuscatedName("vp.d")
   public static int field9104;
   @deob.ObfuscatedName("vq.pb")
   public static int field9110;
   @deob.ObfuscatedName("aei.s")
   public static int field912;
   @deob.ObfuscatedName("aek.bp")
   public static int field924;
   @deob.ObfuscatedName("vz.qc")
   public static int field9242;
   @deob.ObfuscatedName("wd.s")
   public static int field9255;
   @deob.ObfuscatedName("we.lo")
   public static int field9259;
   @deob.ObfuscatedName("we.at")
   public static int field9260;
   @deob.ObfuscatedName("wi.kd")
   public static int field9346;
   @deob.ObfuscatedName("ws.af")
   public static int field9398;
   @deob.ObfuscatedName("xr.of")
   public static int field9532;
   @deob.ObfuscatedName("xr.f")
   public static int field9533;
   @deob.ObfuscatedName("xu.bx")
   public static int field9568;
   @deob.ObfuscatedName("yb.iq")
   public static int field9623;
   @deob.ObfuscatedName("yd.qp")
   public static int field9635;
   @deob.ObfuscatedName("yk.bt")
   public static int field9724;
   @deob.ObfuscatedName("yk.be")
   public static int field9780;
   @deob.ObfuscatedName("yk.bb")
   public static int field9781;
   @deob.ObfuscatedName("ym.og")
   public static int field9868;
   @deob.ObfuscatedName("akd.z")
   private static final int field9875 = 1;
   @deob.ObfuscatedName("yo.aj")
   public static int field9883;
   @deob.ObfuscatedName("za.p")
   public static long field10538;
   @deob.ObfuscatedName("zq.u")
   public static long field10611;
   @deob.ObfuscatedName("akm.n")
   public static long field1857;
   @deob.ObfuscatedName("br.u")
   public static long field2209;
   @deob.ObfuscatedName("es.n")
   public static long field3592;
   @deob.ObfuscatedName("es.k")
   public static long field3593;
   @deob.ObfuscatedName("fs.ul")
   public static long field3791;
   @deob.ObfuscatedName("kg.m")
   public static long field5371;
   @deob.ObfuscatedName("lq.ix")
   public static long field5703;
   @deob.ObfuscatedName("sf.a")
   public static long field7307;
   @deob.ObfuscatedName("tk.na")
   public static long field8538;
   @deob.ObfuscatedName("wj.nj")
   public static long field9348;
   @deob.ObfuscatedName("yh.eh")
   public static long field9664;
   @deob.ObfuscatedName("d.b")
   public static class110 field2790;
   @deob.ObfuscatedName("uv.cn")
   public static class112 field8859;
   @deob.ObfuscatedName("fu.jw")
   public static class124 field3803;
   @deob.ObfuscatedName("ui.x")
   private static class124 field8795;
   @deob.ObfuscatedName("aep.n")
   public static volatile class126 field944;
   @deob.ObfuscatedName("wk.ct")
   public static class127 field9361;
   @deob.ObfuscatedName("agr.bc")
   public static class191 field1198;
   @deob.ObfuscatedName("ab.bx")
   public static class191 field242;
   @deob.ObfuscatedName("ls.bm")
   public static class191 field5711;
   @deob.ObfuscatedName("mc.bq")
   public static class191 field5795;
   @deob.ObfuscatedName("ny.bw")
   public static class191 field6232;
   @deob.ObfuscatedName("pb.bh")
   public static class191 field6659;
   @deob.ObfuscatedName("qz.bg")
   public static class191 field7082;
   @deob.ObfuscatedName("tf.by")
   public static class191 field8494;
   @deob.ObfuscatedName("lp.ns")
   public static class211 field5701;
   @deob.ObfuscatedName("ee.b")
   public static class221 field3119;
   @deob.ObfuscatedName("gl.c")
   public static class221 field3876;
   @deob.ObfuscatedName("pr.s")
   public static class221 field6775;
   @deob.ObfuscatedName("aev.g")
   public static class223 field1029;
   @deob.ObfuscatedName("og.o")
   public static class252 field6389;
   @deob.ObfuscatedName("z.d")
   public static class261 field10493;
   @deob.ObfuscatedName("z.e")
   public static class261 field10500;
   @deob.ObfuscatedName("z.g")
   public static class261 field10512;
   @deob.ObfuscatedName("od.z")
   public static class261 field6367;
   @deob.ObfuscatedName("od.h")
   public static class261 field6368;
   @deob.ObfuscatedName("c.db")
   public static class358 field2285;
   @deob.ObfuscatedName("ao.bs")
   public static class383 field1993;
   @deob.ObfuscatedName("dg.by")
   public static class383 field2895;
   @deob.ObfuscatedName("abu.ax")
   public static class383 field340;
   @deob.ObfuscatedName("ig.bw")
   public static class383 field4165;
   @deob.ObfuscatedName("js.bg")
   public static class383 field5243;
   @deob.ObfuscatedName("acu.h")
   public static class383 field562;
   @deob.ObfuscatedName("mb.av")
   public static class383 field5785;
   @deob.ObfuscatedName("mb.ax")
   public static class383 field5786;
   @deob.ObfuscatedName("ne.br")
   public static class383 field6083;
   @deob.ObfuscatedName("ol.ba")
   public static class383 field6475;
   @deob.ObfuscatedName("ot.bc")
   public static class383 field6555;
   @deob.ObfuscatedName("wv.af")
   public static class383 field9426;
   @deob.ObfuscatedName("aaf.bf")
   public static class383 field95;
   @deob.ObfuscatedName("y.bq")
   public static class383 field9606;
   @deob.ObfuscatedName("dl.m")
   public static class386 field2955;
   @deob.ObfuscatedName("ig.l")
   public static class400 field4166;
   @deob.ObfuscatedName("ajj.v")
   public static class407 field1706;
   @deob.ObfuscatedName("aw.l")
   public static class407 field2080;
   @deob.ObfuscatedName("aw.u")
   public static class407 field2081;
   @deob.ObfuscatedName("rq.t")
   public static class415 field7192;
   @deob.ObfuscatedName("ml.pt")
   public static class425 field5928;
   @deob.ObfuscatedName("adz.ac")
   public static class425 field818;
   @deob.ObfuscatedName("wo.mu")
   public static class425 field9382;
   @deob.ObfuscatedName("nn.v")
   public static class430 field6155;
   @deob.ObfuscatedName("zv.di")
   public static class439 field10637;
   @deob.ObfuscatedName("pp.hw")
   public static class445 field6768;
   @deob.ObfuscatedName("fk.n")
   public static class458 field3713;
   @deob.ObfuscatedName("wx.gx")
   public static class476 field9434;
   @deob.ObfuscatedName("z.ta")
   public static class483 field10534;
   @deob.ObfuscatedName("ws.te")
   public static class483 field9397;
   @deob.ObfuscatedName("yu.bu")
   public static class514 field10137;
   @deob.ObfuscatedName("aw.k")
   public static class526 field2073;
   @deob.ObfuscatedName("aw.n")
   public static class544 field2079;
   @deob.ObfuscatedName("zr.gy")
   public static class557 field10616;
   @deob.ObfuscatedName("tw.hy")
   public static class559 field8710;
   @deob.ObfuscatedName("gf.h")
   public static class588 field3854;
   @deob.ObfuscatedName("wq.s")
   public static class598 field9392;
   @deob.ObfuscatedName("sc.dz")
   public static class604 field7305;
   @deob.ObfuscatedName("agc.bh")
   public static class609 field1165;
   @deob.ObfuscatedName("av.k")
   public static class609 field2068;
   @deob.ObfuscatedName("ky.i")
   public static class609 field5483;
   @deob.ObfuscatedName("no.t")
   public static class609 field6177;
   @deob.ObfuscatedName("r.c")
   public static class609 field7095;
   @deob.ObfuscatedName("agg.fv")
   public static class612 field1169;
   @deob.ObfuscatedName("aai.eg")
   public static class612 field132;
   @deob.ObfuscatedName("aak.c")
   public static class612 field148;
   @deob.ObfuscatedName("aam.gn")
   public static class612 field160;
   @deob.ObfuscatedName("ajb.a")
   public static class612 field1635;
   @deob.ObfuscatedName("ak.fs")
   public static class612 field1805;
   @deob.ObfuscatedName("ao.fa")
   public static class612 field1995;
   @deob.ObfuscatedName("aav.fl")
   public static class612 field200;
   @deob.ObfuscatedName("av.l")
   public static class612 field2071;
   @deob.ObfuscatedName("az.v")
   public static class612 field2110;
   @deob.ObfuscatedName("client.gj")
   public static class612 field2508;
   @deob.ObfuscatedName("cx.ey")
   public static class612 field2775;
   @deob.ObfuscatedName("d.fx")
   public static class612 field2838;
   @deob.ObfuscatedName("ec.t")
   public static class612 field3114;
   @deob.ObfuscatedName("ee.k")
   public static class612 field3117;
   @deob.ObfuscatedName("ee.d")
   public static class612 field3118;
   @deob.ObfuscatedName("ee.n")
   public static class612 field3123;
   @deob.ObfuscatedName("em.w")
   public static class612 field3392;
   @deob.ObfuscatedName("en.ep")
   public static class612 field3567;
   @deob.ObfuscatedName("gb.fr")
   public static class612 field3827;
   @deob.ObfuscatedName("gq.fb")
   public static class612 field3937;
   @deob.ObfuscatedName("gz.ft")
   public static class612 field3965;
   @deob.ObfuscatedName("id.z")
   public static class612 field4152;
   @deob.ObfuscatedName("il.k")
   public static class612 field4192;
   @deob.ObfuscatedName("acg.fy")
   public static class612 field452;
   @deob.ObfuscatedName("jc.ff")
   public static class612 field4891;
   @deob.ObfuscatedName("kh.p")
   public static class612 field5375;
   @deob.ObfuscatedName("kh.o")
   public static class612 field5376;
   @deob.ObfuscatedName("mv.fq")
   public static class612 field6046;
   @deob.ObfuscatedName("ne.fi")
   public static class612 field6084;
   @deob.ObfuscatedName("oe.gi")
   public static class612 field6375;
   @deob.ObfuscatedName("og.a")
   public static class612 field6387;
   @deob.ObfuscatedName("ok.fk")
   public static class612 field6467;
   @deob.ObfuscatedName("po.fn")
   public static class612 field6723;
   @deob.ObfuscatedName("po.fe")
   public static class612 field6724;
   @deob.ObfuscatedName("q.fp")
   public static class612 field6858;
   @deob.ObfuscatedName("rj.fw")
   public static class612 field7162;
   @deob.ObfuscatedName("rk.b")
   public static class612 field7167;
   @deob.ObfuscatedName("rr.fm")
   public static class612 field7197;
   @deob.ObfuscatedName("rw.fj")
   public static class612 field7262;
   @deob.ObfuscatedName("ry.o")
   public static class612 field7270;
   @deob.ObfuscatedName("t.fz")
   public static class612 field8465;
   @deob.ObfuscatedName("tm.fu")
   public static class612 field8546;
   @deob.ObfuscatedName("ug.fg")
   public static class612 field8783;
   @deob.ObfuscatedName("ur.fc")
   public static class612 field8828;
   @deob.ObfuscatedName("uw.ev")
   public static class612 field8866;
   @deob.ObfuscatedName("w.fh")
   public static class612 field9246;
   @deob.ObfuscatedName("wc.fo")
   public static class612 field9250;
   @deob.ObfuscatedName("wy.fd")
   public static class612 field9437;
   @deob.ObfuscatedName("yo.gu")
   public static class612 field9882;
   @deob.ObfuscatedName("yr.eb")
   public static class612 field9961;
   @deob.ObfuscatedName("tv.hp")
   public static class617 field8671;
   @deob.ObfuscatedName("ds.en")
   public static class618 field3048;
   @deob.ObfuscatedName("jc.iw")
   public static class623 field4892;
   @deob.ObfuscatedName("ug.et")
   public static class624 field8782;
   @deob.ObfuscatedName("wt.em")
   public static class630 field9401;
   @deob.ObfuscatedName("ey.m")
   public static class637 field3640;
   @deob.ObfuscatedName("oq.cz")
   public static class637 field6508;
   @deob.ObfuscatedName("zh.z")
   public static class639 field10564;
   @deob.ObfuscatedName("mj.r")
   public static class643 field5846;
   @deob.ObfuscatedName("at.e")
   public static class646 field2063;
   @deob.ObfuscatedName("ee.r")
   public static class646 field3120;
   @deob.ObfuscatedName("vp.h")
   public static class646 field9102;
   @deob.ObfuscatedName("ee.q")
   public static class655 field3127;
   @deob.ObfuscatedName("rf.u")
   public static class656 field7146;
   @deob.ObfuscatedName("fp.ah")
   public static class665 field3759;
   @deob.ObfuscatedName("agc.b")
   public static class672 field1166;
   @deob.ObfuscatedName("gf.gc")
   public static class680 field3855;
   @deob.ObfuscatedName("az.es")
   public static class692 field2111;
   @deob.ObfuscatedName("do.ge")
   public static class695 field2958;
   @deob.ObfuscatedName("nm.b")
   public static class699 field6141;
   @deob.ObfuscatedName("og.m")
   public static class701 field6400;
   @deob.ObfuscatedName("ft.gv")
   public static class704 field3797;
   @deob.ObfuscatedName("abt.dy")
   public static class706 field336;
   @deob.ObfuscatedName("rb.hf")
   public static class707 field7125;
   @deob.ObfuscatedName("mh.in")
   public static class711 field5815;
   @deob.ObfuscatedName("qz.eo")
   public static class711 field7081;
   @deob.ObfuscatedName("uq.r")
   public static class717 field8826;
   @deob.ObfuscatedName("ag.w")
   public static class71 field1160;
   @deob.ObfuscatedName("og.b")
   public static class721 field6386;
   @deob.ObfuscatedName("pt.gh")
   public static class721 field6782;
   @deob.ObfuscatedName("lo.hc")
   public static class729 field5610;
   @deob.ObfuscatedName("sp.gd")
   public static class731 field8402;
   @deob.ObfuscatedName("lv.gq")
   public static class740 field5741;
   @deob.ObfuscatedName("mb.ap")
   public static class745 field5777;
   @deob.ObfuscatedName("vf.ha")
   public static class763 field9068;
   @deob.ObfuscatedName("fp.hu")
   public static class766 field3757;
   @deob.ObfuscatedName("av.n")
   public static class772 field2069;
   @deob.ObfuscatedName("os.f")
   public static class772 field6527;
   @deob.ObfuscatedName("ut.ci")
   public static class772 field8847;
   @deob.ObfuscatedName("ff.hv")
   public static class774 field3681;
   @deob.ObfuscatedName("aiv.gs")
   public static class785 field1613;
   @deob.ObfuscatedName("og.n")
   public static class785 field6399;
   @deob.ObfuscatedName("aax.ir")
   public static class786 field207;
   @deob.ObfuscatedName("ei.bt")
   public static class793 field3302;
   @deob.ObfuscatedName("gb.hq")
   public static class794 field3828;
   @deob.ObfuscatedName("fp.hm")
   public static class796 field3758;
   @deob.ObfuscatedName("lv.hd")
   public static class797 field5740;
   @deob.ObfuscatedName("dt.hg")
   public static class800 field3060;
   @deob.ObfuscatedName("aq.hl")
   public static class818 field2046;
   @deob.ObfuscatedName("oc.g")
   public static class818 field6355;
   @deob.ObfuscatedName("jd.bj")
   public static class819 field4896;
   @deob.ObfuscatedName("ab.bd")
   public static class823 field243;
   @deob.ObfuscatedName("og.d")
   public static class831 field6385;
   @deob.ObfuscatedName("wu.gk")
   public static class831 field9422;
   @deob.ObfuscatedName("t.o")
   public static class834 field8464;
   @deob.ObfuscatedName("fb.bo")
   public static class840 field3662;
   @deob.ObfuscatedName("fk.a")
   public static class842 field3714;
   @deob.ObfuscatedName("t.p")
   public static class845 field8459;
   @deob.ObfuscatedName("om.bd")
   public static class849 field6489;
   @deob.ObfuscatedName("g.tt")
   public static class84 field3822;
   @deob.ObfuscatedName("iu.ti")
   public static class84 field4336;
   @deob.ObfuscatedName("og.k")
   public static class858 field6384;
   @deob.ObfuscatedName("ta.gf")
   public static class858 field8466;
   @deob.ObfuscatedName("og.p")
   public static class865 field6388;
   @deob.ObfuscatedName("dw.gl")
   public static class866 field3086;
   @deob.ObfuscatedName("ug.sf")
   public static class868 field8784;
   @deob.ObfuscatedName("ui.b")
   public static class873 field8788;
   @deob.ObfuscatedName("ui.k")
   public static class873 field8789;
   @deob.ObfuscatedName("ui.d")
   public static class873 field8790;
   @deob.ObfuscatedName("ui.n")
   public static class873 field8792;
   @deob.ObfuscatedName("ui.r")
   public static class873 field8794;
   @deob.ObfuscatedName("ps.av")
   public static class876 field6776;
   @deob.ObfuscatedName("ack.hb")
   public static class878 field490;
   @deob.ObfuscatedName("akm.m")
   public static class883 field1855;
   @deob.ObfuscatedName("aw.g")
   public static class883 field2082;
   @deob.ObfuscatedName("du.bn")
   public static class883 field3067;
   @deob.ObfuscatedName("r.e")
   public static class883 field7093;
   @deob.ObfuscatedName("r.z")
   public static class883 field7094;
   @deob.ObfuscatedName("d.gm")
   public static class886 field2839;
   @deob.ObfuscatedName("il.gg")
   public static class892 field4196;
   @deob.ObfuscatedName("pv.gt")
   public static class897 field6797;
   @deob.ObfuscatedName("qe.td")
   public static class8 field6895;
   @deob.ObfuscatedName("rc.k")
   public static class8 field7127;
   @deob.ObfuscatedName("qv.hn")
   public static class900 field7033;
   @deob.ObfuscatedName("lp.he")
   public static class903 field5700;
   @deob.ObfuscatedName("tc.hh")
   public static class904 field8477;
   @deob.ObfuscatedName("adz.hz")
   public static class909 field819;
   @deob.ObfuscatedName("kh.r")
   public static class910 field5380;
   @deob.ObfuscatedName("we.go")
   public static class911 field9258;
   @deob.ObfuscatedName("og.r")
   public static class918 field6416;
   @deob.ObfuscatedName("rj.ga")
   public static class918 field7163;
   @deob.ObfuscatedName("aae.gp")
   public static class919 field93;
   @deob.ObfuscatedName("wt.n")
   public static class920 field9399;
   @deob.ObfuscatedName("nn.hr")
   public static class928 field6159;
   @deob.ObfuscatedName("mo.ho")
   public static class929 field5946;
   @deob.ObfuscatedName("act.dv")
   public static client field561;
   @deob.ObfuscatedName("akm.r")
   public static Applet field1851;
   @deob.ObfuscatedName("qm.q")
   public static Applet field6978;
   @deob.ObfuscatedName("mc.w")
   public static Canvas field5796;
   @deob.ObfuscatedName("pc.bk")
   public static EventQueue field6666;
   @deob.ObfuscatedName("aj.m")
   public static Font field1633;
   @deob.ObfuscatedName("ic.t")
   public static Frame field4149;
   @deob.ObfuscatedName("adg.c")
   public static Frame field688;
   @deob.ObfuscatedName("ajc.j")
   public static Image field1652;
   @deob.ObfuscatedName("aeq.rb")
   public static Clipboard field991;
   @deob.ObfuscatedName("afo.ag")
   public static File field1127;
   @deob.ObfuscatedName("ih.ak")
   public static File field4170;
   @deob.ObfuscatedName("nm.k")
   public static File field6139;
   @deob.ObfuscatedName("mf.h")
   public static FileOutputStream field5808;
   @deob.ObfuscatedName("bo.v")
   public static Object field2180;
   @deob.ObfuscatedName("bo.l")
   public static Object field2187;
   @deob.ObfuscatedName("bo.u")
   public static Object field2188;
   @deob.ObfuscatedName("go.u")
   public static Object field3892;
   @deob.ObfuscatedName("go.l")
   public static Object field3900;
   @deob.ObfuscatedName("go.v")
   public static Object field3902;
   @deob.ObfuscatedName("agr.bx")
   public static String field1199;
   @deob.ObfuscatedName("akm.k")
   public static String field1854;
   @deob.ObfuscatedName("eq.m")
   public static String field3582;
   @deob.ObfuscatedName("ie.bm")
   public static String field4156;
   @deob.ObfuscatedName("jf.bn")
   public static String field4905;
   @deob.ObfuscatedName("jq.nk")
   public static String field5177;
   @deob.ObfuscatedName("kp.bw")
   public static String field5425;
   @deob.ObfuscatedName("le.bu")
   public static String field5541;
   @deob.ObfuscatedName("lk.z")
   public static String field5593;
   @deob.ObfuscatedName("lq.bq")
   public static String field5702;
   @deob.ObfuscatedName("mg.dw")
   public static String field5813;
   @deob.ObfuscatedName("mn.v")
   public static String field5936;
   @deob.ObfuscatedName("mu.bh")
   public static String field5999;
   @deob.ObfuscatedName("nh.by")
   public static String field6120;
   @deob.ObfuscatedName("pq.ce")
   public static String field6769;
   @deob.ObfuscatedName("pk.l")
   public static Thread field6691;
   @deob.ObfuscatedName("ww.vs")
   public static GarbageCollectorMXBean field9429;
   @deob.ObfuscatedName("tq.ex")
   public static Socket field8566;
   @deob.ObfuscatedName("qt.n")
   public static List field7018;
   @deob.ObfuscatedName("ef.d")
   public static Map field3129;
   @deob.ObfuscatedName("ze.u")
   public static short field10553;
   @deob.ObfuscatedName("aio.v")
   public static short field1579;
   @deob.ObfuscatedName("dl.g")
   public static short field2952;
   @deob.ObfuscatedName("fz.h")
   public static short field3819;
   @deob.ObfuscatedName("dw.z")
   public static boolean field3084;
   @deob.ObfuscatedName("fe.t")
   public static boolean field3677;
   @deob.ObfuscatedName("gw.i")
   public static boolean field3951;
   @deob.ObfuscatedName("mj.d")
   public static boolean field5844;
   @deob.ObfuscatedName("q.at")
   public static boolean field6857;
   @deob.ObfuscatedName("rj.nc")
   public static boolean field7164;
   @deob.ObfuscatedName("tu.ot")
   public static boolean field8665;
   @deob.ObfuscatedName("vg.nr")
   public static boolean field9073;
   @deob.ObfuscatedName("vl.p")
   public static boolean field9083;
   @deob.ObfuscatedName("wp.bo")
   public static boolean field9387;
   @deob.ObfuscatedName("yk.bu")
   public static boolean field9782;
   @deob.ObfuscatedName("og.af")
   public static byte[] field6390;
   @deob.ObfuscatedName("og.j")
   public static byte[] field6407;
   @deob.ObfuscatedName("og.f")
   public static byte[] field6408;
   @deob.ObfuscatedName("og.ap")
   public static byte[] field6410;
   @deob.ObfuscatedName("og.av")
   public static byte[] field6411;
   @deob.ObfuscatedName("adc.s")
   public static byte[] field659;
   @deob.ObfuscatedName("adc.at")
   public static float[] field646;
   @deob.ObfuscatedName("adc.f")
   public static float[] field651;
   @deob.ObfuscatedName("adc.ai")
   public static float[] field652;
   @deob.ObfuscatedName("adc.ap")
   public static float[] field653;
   @deob.ObfuscatedName("adc.av")
   public static float[] field654;
   @deob.ObfuscatedName("adc.ax")
   public static float[] field655;
   @deob.ObfuscatedName("adc.af")
   public static float[] field656;
   @deob.ObfuscatedName("agx.s")
   public static int[] field1211;
   @deob.ObfuscatedName("d.p")
   public static int[] field2804;
   @deob.ObfuscatedName("dc.b")
   public static int[] field2863;
   @deob.ObfuscatedName("ach.x")
   public static int[] field458;
   @deob.ObfuscatedName("le.aw")
   public static int[] field5543;
   @deob.ObfuscatedName("mq.s")
   public static int[] field5949;
   @deob.ObfuscatedName("mq.l")
   public static int[] field5955;
   @deob.ObfuscatedName("adc.aw")
   public static int[] field629;
   @deob.ObfuscatedName("adc.ah")
   public static int[] field635;
   @deob.ObfuscatedName("og.y")
   public static int[] field6406;
   @deob.ObfuscatedName("adc.t")
   public static int[] field658;
   @deob.ObfuscatedName("pw.bz")
   public static int[] field6803;
   @deob.ObfuscatedName("rl.j")
   public static int[] field7179;
   @deob.ObfuscatedName("rr.r")
   public static int[] field7193;
   @deob.ObfuscatedName("rr.b")
   public static int[] field7196;
   @deob.ObfuscatedName("rx.d")
   public static int[] field7263;
   @deob.ObfuscatedName("t.k")
   public static int[] field8463;
   @deob.ObfuscatedName("tj.o")
   public static int[] field8522;
   @deob.ObfuscatedName("uo.a")
   public static int[] field8818;
   @deob.ObfuscatedName("uu.rt")
   public static int[] field8854;
   @deob.ObfuscatedName("ux.z")
   public static int[] field8869;
   @deob.ObfuscatedName("vp.b")
   public static int[] field9105;
   @deob.ObfuscatedName("vp.r")
   public static int[] field9106;
   @deob.ObfuscatedName("yk.bj")
   public static long[] field9774;
   @deob.ObfuscatedName("qk.r")
   public static class114[] field6954;
   @deob.ObfuscatedName("e.se")
   public static class272[] field3105;
   @deob.ObfuscatedName("qt.k")
   public static class289[] field7013;
   @deob.ObfuscatedName("ahr.bi")
   public static class383[] field1373;
   @deob.ObfuscatedName("dw.f")
   public static class383[] field3083;
   @deob.ObfuscatedName("dz.y")
   public static class383[] field3102;
   @deob.ObfuscatedName("es.ai")
   public static class383[] field3594;
   @deob.ObfuscatedName("kz.at")
   public static class383[] field5489;
   @deob.ObfuscatedName("lk.ap")
   public static class383[] field5594;
   @deob.ObfuscatedName("pf.w")
   public static class383[] field6678;
   @deob.ObfuscatedName("qf.av")
   public static class383[] field6914;
   @deob.ObfuscatedName("r.j")
   public static class383[] field7090;
   @deob.ObfuscatedName("r.q")
   public static class383[] field7096;
   @deob.ObfuscatedName("dl.p")
   public static class389[] field2946;
   @deob.ObfuscatedName("dl.k")
   public static class392[] field2945;
   @deob.ObfuscatedName("ez.b")
   public static class406[] field3643;
   @deob.ObfuscatedName("dj.r")
   public static class410[] field2906;
   @deob.ObfuscatedName("wf.d")
   public static class411[] field9261;
   @deob.ObfuscatedName("ut.eq")
   public static class41[] field8846;
   @deob.ObfuscatedName("tf.qn")
   public static class425[] field8493;
   @deob.ObfuscatedName("aea.m")
   public static class427[] field844;
   @deob.ObfuscatedName("tz.k")
   public static class588[] field8739;
   @deob.ObfuscatedName("ro.d")
   public static class592[] field7184;
   @deob.ObfuscatedName("adc.h")
   public static class640[] field640;
   @deob.ObfuscatedName("adc.m")
   public static class649[] field643;
   @deob.ObfuscatedName("adc.e")
   public static class653[] field645;
   @deob.ObfuscatedName("adc.z")
   public static class682[] field642;
   @deob.ObfuscatedName("n.x")
   public static class753[] field6078;
   @deob.ObfuscatedName("qt.r")
   public static class756[] field7017;
   @deob.ObfuscatedName("adh.au")
   public static class859[] field698;
   @deob.ObfuscatedName("ws.mp")
   public static class867[] field9396;
   @deob.ObfuscatedName("ks.n")
   public static class901[] field5450;
   @deob.ObfuscatedName("aw.h")
   public static class998[] field2083;
   @deob.ObfuscatedName("fu.rq")
   public static Object[] field3804;
   @deob.ObfuscatedName("og.ax")
   public static Object[] field6412;
   @deob.ObfuscatedName("ao.b")
   public static String[] field1987;
   @deob.ObfuscatedName("acp.g")
   public static String[] field526;
   @deob.ObfuscatedName("ol.am")
   public static String[] field6474;
   @deob.ObfuscatedName("pd.aj")
   public static String[] field6674;
   @deob.ObfuscatedName("vb.rp")
   public static String[] field9056;
   @deob.ObfuscatedName("fq.vi")
   public static short[] field3776;
   @deob.ObfuscatedName("og.ai")
   public static short[] field6409;
   @deob.ObfuscatedName("ub.mo")
   public static short[] field8747;
   @deob.ObfuscatedName("ahq.i")
   public static boolean[] field1372;
   @deob.ObfuscatedName("mq.u")
   public static boolean[] field5958;
   @deob.ObfuscatedName("adc.i")
   public static boolean[] field644;
   @deob.ObfuscatedName("sp.ro")
   public static boolean[] field8400;
   @deob.ObfuscatedName("wt.df")
   public static byte[][] field9400;
   @deob.ObfuscatedName("cz.ja")
   public static int[][] field2786;
   @deob.ObfuscatedName("fd.u")
   public static short[][] field3671;
   @deob.ObfuscatedName("afg.x")
   public static byte[][][] field1103;
   @deob.ObfuscatedName("og.u")
   public static byte[][][] field6394;
   @deob.ObfuscatedName("og.at")
   public static ArrayList[][][] field6414;
   @deob.ObfuscatedName("qc.v")
   public static short[][][] field6884;

   @deob.ObfuscatedName("lw.n(Ljava/lang/String;I)Ljava/lang/String;")
   public static String method9135(String arg0) {
      int var1 = arg0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = arg0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var5 = new StringBuilder(var1 + var2);

      for(int var6 = 0; var6 < var1; ++var6) {
         char var7 = arg0.charAt(var6);
         if (var7 == '<') {
            var5.append("<lt>");
         } else if (var7 == '>') {
            var5.append("<gt>");
         } else {
            var5.append(var7);
         }
      }

      return var5.toString();
   }

   @deob.ObfuscatedName("tn.n(J)V")
   public static final void method14813(long arg0) {
      if (arg0 > 0L) {
         if (arg0 % 10L == 0L) {
            class416.method3853(arg0 - 1L);
            class416.method3853(1L);
         } else {
            class416.method3853(arg0);
         }

      }
   }

   @deob.ObfuscatedName("lk.n(I)[Lup;")
   public static class868[] method8943() {
      return new class868[]{class868.field8821, class868.field8820, class868.field8822};
   }

   @deob.ObfuscatedName("sf.n(Ljava/lang/String;I)Ljava/lang/String;")
   public static String method14301(String arg0) {
      StringBuilder var1 = new StringBuilder();
      int var2 = arg0.length();

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4 = arg0.charAt(var3);
         if (var4 == '%' && var2 > var3 + 2) {
            char var5 = arg0.charAt(var3 + 1);
            boolean var6 = false;
            int var7;
            if (var5 >= '0' && var5 <= '9') {
               var7 = var5 - '0';
            } else if (var5 >= 'a' && var5 <= 'f') {
               var7 = var5 + '\n' - 97;
            } else {
               if (var5 < 'A' || var5 > 'F') {
                  var1.append('%');
                  continue;
               }

               var7 = var5 + '\n' - 65;
            }

            int var8 = var7 * 16;
            char var9 = arg0.charAt(var3 + 2);
            int var10;
            if (var9 >= '0' && var9 <= '9') {
               var10 = var9 - '0' + var8;
            } else if (var9 >= 'a' && var9 <= 'f') {
               var10 = var9 + '\n' - 97 + var8;
            } else {
               if (var9 < 'A' || var9 > 'F') {
                  var1.append('%');
                  continue;
               }

               var10 = var9 + '\n' - 65 + var8;
            }

            if (var10 != 0 && class813.method6256((byte)var10)) {
               var1.append(class813.method10307((byte)var10));
            }

            var3 += 2;
         } else if (var4 == '+') {
            var1.append(' ');
         } else {
            var1.append(var4);
         }
      }

      return var1.toString();
   }

   @deob.ObfuscatedName("aef.n(Laen;I)Lpe;")
   public static class722 method1512(class124 arg0) {
      class738 var1 = class738.method3950(arg0.method1688());
      if (class738.field6785 == var1) {
         return class732.method15112(arg0);
      } else if (class738.field6784 == var1) {
         return class741.method5509(arg0);
      } else {
         return class738.field6783 == var1 ? class727.method9837(arg0) : null;
      }
   }

   @deob.ObfuscatedName("vi.n(I)V")
   public static void method15483() {
   }

   @deob.ObfuscatedName("vd.p(I)Z")
   public static boolean method15426() {
      try {
         if (!class126.available()) {
            return false;
         }
      } catch (Throwable var2) {
         return false;
      }

      if (field944 != null) {
         throw new IllegalStateException("");
      } else {
         field944 = new class126();
         Thread var1 = new Thread(new class784());
         var1.setDaemon(true);
         var1.start();
         return true;
      }
   }

   @deob.ObfuscatedName("yo.n(IIILpg;Lml;Z[I[II)I")
   public static int method16263(int arg0, int arg1, int arg2, class724 arg3, class648 arg4, boolean arg5, int[] arg6, int[] arg7) {
      for(int var8 = 0; var8 < 128; ++var8) {
         for(int var9 = 0; var9 < 128; ++var9) {
            class651.field5940[var8][var9] = 0;
            class651.field5941[var8][var9] = 99999999;
         }
      }

      boolean var10;
      if (arg2 == 1) {
         var10 = class651.method10652(arg0, arg1, arg3, arg4);
      } else if (arg2 == 2) {
         var10 = class651.method6217(arg0, arg1, arg3, arg4);
      } else {
         var10 = class651.method8029(arg0, arg1, arg2, arg3, arg4);
      }

      int var11 = arg0 - 64;
      int var12 = arg1 - 64;
      int var13 = field5937;
      int var14 = field7306;
      if (!var10) {
         if (!arg5) {
            return -1;
         }

         int var15 = Integer.MAX_VALUE;
         int var16 = Integer.MAX_VALUE;
         byte var17 = 10;
         int var18 = arg3.field6680;
         int var19 = arg3.field6682;
         int var20 = arg3.field6679;
         int var21 = arg3.field6681;

         for(int var22 = var18 - var17; var22 <= var17 + var18; ++var22) {
            for(int var23 = var19 - var17; var23 <= var17 + var19; ++var23) {
               int var24 = var22 - var11;
               int var25 = var23 - var12;
               if (var24 >= 0 && var25 >= 0 && var24 < 128 && var25 < 128 && class651.field5941[var24][var25] < 100) {
                  int var26 = 0;
                  if (var22 < var18) {
                     var26 = var18 - var22;
                  } else if (var22 > var18 + var20 - 1) {
                     var26 = var22 - (var18 + var20 - 1);
                  }

                  int var27 = 0;
                  if (var23 < var19) {
                     var27 = var19 - var23;
                  } else if (var23 > var19 + var21 - 1) {
                     var27 = var23 - (var19 + var21 - 1);
                  }

                  int var28 = var26 * var26 + var27 * var27;
                  if (var28 < var15 || var15 == var28 && class651.field5941[var24][var25] < var16) {
                     var15 = var28;
                     var16 = class651.field5941[var24][var25];
                     var13 = var22;
                     var14 = var23;
                  }
               }
            }
         }

         if (var15 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (arg0 == var13 && arg1 == var14) {
         return 0;
      } else {
         byte var29 = 0;
         class651.field5943[var29] = var13;
         int var34 = var29 + 1;
         class651.field5944[var29] = var14;
         int var30;
         int var31 = var30 = class651.field5940[var13 - var11][var14 - var12];

         while(arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
               var30 = var31;
               class651.field5943[var34] = var13;
               class651.field5944[var34++] = var14;
            }

            if ((var31 & 2) != 0) {
               ++var13;
            } else if ((var31 & 8) != 0) {
               --var13;
            }

            if ((var31 & 1) != 0) {
               ++var14;
            } else if ((var31 & 4) != 0) {
               --var14;
            }

            var31 = class651.field5940[var13 - var11][var14 - var12];
         }

         int var32 = 0;

         while(var34-- > 0) {
            arg6[var32] = class651.field5943[var34];
            arg7[var32++] = class651.field5944[var34];
            if (var32 >= arg6.length) {
               break;
            }
         }

         return var32;
      }
   }

   @deob.ObfuscatedName("ct.k(II)V")
   public static void method5155(int arg0) {
      class864.method6228(new class837(arg0));
   }

   @deob.ObfuscatedName("nz.b(Lrs;I)V")
   public static void method10113(class790 arg0) {
      arg0.field7203[arg0.field7204 - 1] = field3757.method11377(arg0.field7203[arg0.field7204 - 1]).field7040;
   }

   @deob.ObfuscatedName("vq.k(CI)Z")
   private static final boolean method15587(char arg0) {
      if (Character.isISOControl(arg0)) {
         return false;
      } else if (class816.method5270(arg0)) {
         return true;
      } else {
         char[] var1 = class930.field9432;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            char var3 = var1[var2];
            if (arg0 == var3) {
               return true;
            }
         }

         char[] var4 = class930.field9430;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            char var6 = var4[var5];
            if (arg0 == var6) {
               return true;
            }
         }

         return false;
      }
   }

   @deob.ObfuscatedName("lw.k(Loy;I)V")
   public static void method9134(class715 arg0) {
      arg0.field6632 = null;
      Stack var1 = class715.field6634;
      synchronized(class715.field6634) {
         if (class715.field6634.size() < 200) {
            class715.field6634.push(arg0);
         }

      }
   }

   @deob.ObfuscatedName("tn.d(Ladx;Ladx;I)V")
   public static void method14810(class107 arg0, class107 arg1) {
      if (arg0.field810 != null) {
         arg0.method1393();
      }

      arg0.field810 = arg1.field810;
      arg0.field809 = arg1;
      arg0.field810.field809 = arg0;
      arg0.field809.field810 = arg0;
   }

   @deob.ObfuscatedName("ab.d(Ljava/io/File;B)[B")
   public static byte[] method485(File arg0) {
      return class877.method8944(arg0, (int)arg0.length());
   }

   @deob.ObfuscatedName("acy.b(Laen;II)Ljava/lang/String;")
   public static String method1134(class124 arg0, int arg1) {
      try {
         int var2 = arg0.method1604();
         if (var2 > arg1) {
            var2 = arg1;
         }

         byte[] var3 = new byte[var2];
         arg0.field935 += field3713.method6498(arg0.field931, arg0.field935, var3, 0, var2);
         return method5675(var3, 0, var2);
      } catch (Exception var6) {
         return "Cabbage";
      }
   }

   @deob.ObfuscatedName("su.d(Lsu;I)Z")
   public static boolean method14487(class819 arg0) {
      return class819.field8434 == arg0 || class819.field8431 == arg0 || class819.field8432 == arg0 || class819.field8429 == arg0 || class819.field8430 == arg0 || class819.field8427 == arg0;
   }

   @deob.ObfuscatedName("aje.n(I)V")
   public static void method3383() {
      if (class861.field8799) {
         if (class861.field8791 < field6955) {
            class861.field8791 = field6955;
         }

         while(true) {
            while(class861.field8791 < field6951) {
               class114 var0 = class755.method5207(class861.field8791);
               if (var0 != null && var0.field895 == -1) {
                  if (class861.field8798 == null) {
                     class861.field8798 = client.field2467.method11637(var0.field894);
                  }

                  int var1 = class861.field8798.field7185;
                  if (var1 == -1) {
                     return;
                  }

                  var0.field895 = var1;
                  ++class861.field8791;
                  class861.field8798 = null;
               } else {
                  ++class861.field8791;
               }
            }

            return;
         }
      }
   }

   @deob.ObfuscatedName("qc.r(B)V")
   public static void method11085() {
      if (client.field2410 == 1 && client.field2463 != null) {
         while(true) {
            class829 var0 = (class829)class864.field8811.poll();
            if (var0 == null) {
               return;
            }

            var0.method2332();
         }
      }
   }

   @deob.ObfuscatedName("acm.d(I)V")
   public static void method1015() {
      if (field7263 == null) {
         field7263 = new int[65536];
         double var0 = 0.7D + (Math.random() * 0.03D - 0.015D);
         int var2 = 0;

         for(int var3 = 0; var3 < 512; ++var3) {
            float var4 = ((float)(var3 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var5 = (float)(var3 & 7) / 8.0F + 0.0625F;

            for(int var6 = 0; var6 < 128; ++var6) {
               float var7 = (float)var6 / 128.0F;
               float var8 = 0.0F;
               float var9 = 0.0F;
               float var10 = 0.0F;
               float var11 = var4 / 60.0F;
               int var12 = (int)var11;
               int var13 = var12 % 6;
               float var14 = var11 - (float)var12;
               float var15 = (1.0F - var5) * var7;
               float var16 = (1.0F - var5 * var14) * var7;
               float var17 = (1.0F - (1.0F - var14) * var5) * var7;
               if (var13 == 0) {
                  var8 = var7;
                  var9 = var17;
                  var10 = var15;
               } else if (var13 == 1) {
                  var8 = var16;
                  var9 = var7;
                  var10 = var15;
               } else if (var13 == 2) {
                  var8 = var15;
                  var9 = var7;
                  var10 = var17;
               } else if (var13 == 3) {
                  var8 = var15;
                  var9 = var16;
                  var10 = var7;
               } else if (var13 == 4) {
                  var8 = var17;
                  var9 = var15;
                  var10 = var7;
               } else if (var13 == 5) {
                  var8 = var7;
                  var9 = var15;
                  var10 = var16;
               }

               float var18 = (float)Math.pow((double)var8, var0);
               float var19 = (float)Math.pow((double)var9, var0);
               float var20 = (float)Math.pow((double)var10, var0);
               int var21 = (int)(var18 * 256.0F);
               int var22 = (int)(var19 * 256.0F);
               int var23 = (int)(var20 * 256.0F);
               int var24 = (var22 << 8) + (var21 << 16) + -16777216 + var23;
               field7263[var2++] = var24;
            }
         }

      }
   }

   @deob.ObfuscatedName("ob.d(Lwz;IIB)Lajc;")
   public static class248 method10133(class932 arg0, int arg1, int arg2) {
      int var3 = arg0.field9443 | arg1 << 10;
      class248 var4 = (class248)class795.field7264.method10867((long)var3 << 16);
      if (var4 != null) {
         return var4;
      } else {
         byte[] var5 = field3827.method8809(field3827.method8787(var3));
         if (var5 != null) {
            if (var5.length <= 1) {
               return null;
            } else {
               class248 var6;
               try {
                  var6 = class795.method2232(var5);
               } catch (Exception var18) {
                  throw new RuntimeException(var18.getMessage() + " " + var3);
               }

               var6.field1639 = arg0;
               class795.field7264.method10862(var6, (long)var3 << 16);
               return var6;
            }
         } else {
            int var8 = arg0.field9443 | arg2 + 65536 << 10;
            class248 var9 = (class248)class795.field7264.method10867((long)var8 << 16);
            if (var9 != null) {
               return var9;
            } else {
               byte[] var10 = field3827.method8809(field3827.method8787(var8));
               if (var10 != null) {
                  if (var10.length <= 1) {
                     return null;
                  } else {
                     class248 var11;
                     try {
                        var11 = class795.method2232(var10);
                     } catch (Exception var19) {
                        throw new RuntimeException(var19.getMessage() + " " + var8);
                     }

                     var11.field1639 = arg0;
                     class795.field7264.method10862(var11, (long)var8 << 16);
                     return var11;
                  }
               } else {
                  int var13 = arg0.field9443 | 67107840;
                  class248 var14 = (class248)class795.field7264.method10867((long)var13 << 16);
                  if (var14 != null) {
                     return var14;
                  } else {
                     byte[] var15 = field3827.method8809(field3827.method8787(var13));
                     if (var15 != null) {
                        if (var15.length <= 1) {
                           return null;
                        } else {
                           class248 var16;
                           try {
                              var16 = class795.method2232(var15);
                           } catch (Exception var20) {
                              throw new RuntimeException(var20.getMessage() + " " + var13);
                           }

                           var16.field1639 = arg0;
                           class795.field7264.method10862(var16, (long)var13 << 16);
                           return var16;
                        }
                     } else {
                        return null;
                     }
                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("kc.d(B)V")
   public static void method8262() {
      Stack var0 = class715.field6634;
      synchronized(class715.field6634) {
         class715.field6634 = new Stack();
      }
   }

   @deob.ObfuscatedName("qh.d(I)Ladz;")
   public static class109 method11181() {
      class109 var0 = class109.method11180();
      var0.field815 = null;
      var0.field813 = 0;
      var0.field814 = new class251(5000);
      return var0;
   }

   @deob.ObfuscatedName("lr.bq(III)B")
   public static byte method9101(int arg0, int arg1) {
      if (class850.field8717.field8736 != arg0) {
         return 0;
      } else {
         return (byte)((arg1 & 1) == 0 ? 1 : 2);
      }
   }

   @deob.ObfuscatedName("tq.n(Lvt;Laen;I)Lva;")
   public static class880 method14843(class899 arg0, class124 arg1) {
      class880 var2 = new class880(arg0);
      int var3 = arg1.method1688();
      boolean var4 = (var3 & 1) != 0;
      boolean var5 = (var3 & 2) != 0;
      boolean var6 = (var3 & 4) != 0;
      boolean var7 = (var3 & 8) != 0;
      if (var4) {
         var2.field8879[0] = arg1.method1608();
         var2.field8874[0] = arg1.method1608();
         if (arg0.field9155 != -1 || arg0.field9190 != -1) {
            var2.field8879[1] = arg1.method1608();
            var2.field8874[1] = arg1.method1608();
         }

         if (arg0.field9145 != -1 || arg0.field9159 != -1) {
            var2.field8879[2] = arg1.method1608();
            var2.field8874[2] = arg1.method1608();
         }
      }

      if (var5) {
         var2.field8880[0] = arg1.method1608();
         var2.field8881[0] = arg1.method1608();
         if (arg0.field9167 != -1 || arg0.field9169 != -1) {
            var2.field8880[1] = arg1.method1608();
            var2.field8881[1] = arg1.method1608();
         }
      }

      if (var6) {
         int var8 = arg1.method1587();
         int[] var9 = new int[]{var8 & 15, var8 >> 4 & 15, var8 >> 8 & 15, var8 >> 12 & 15};

         for(int var10 = 0; var10 < 4; ++var10) {
            if (var9[var10] != 15) {
               var2.field8882[var9[var10]] = (short)arg1.method1587();
            }
         }
      }

      if (var7) {
         int var11 = arg1.method1688();
         int[] var12 = new int[]{var11 & 15, var11 >> 4 & 15};

         for(int var13 = 0; var13 < 2; ++var13) {
            if (var12[var13] != 15) {
               var2.field8883[var12[var13]] = (short)arg1.method1587();
            }
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("an.d(I)Z")
   public static boolean method3955() {
      return field8826 != null;
   }

   @deob.ObfuscatedName("jh.n(I)[Lei;")
   public static class421[] method7942() {
      return new class421[]{class421.field3278, class421.field3289, class421.field3270, class421.field3279, class421.field3265, class421.field3293, class421.field3280, class421.field3264, class421.field3269, class421.field3262, class421.field3296, class421.field3268, class421.field3286, class421.field3275, class421.field3281, class421.field3287, class421.field3274, class421.field3301, class421.field3292, class421.field3272, class421.field3282, class421.field3299, class421.field3291, class421.field3298, class421.field3285, class421.field3266, class421.field3276, class421.field3284, class421.field3300, class421.field3295, class421.field3273, class421.field3277, class421.field3283, class421.field3267, class421.field3263, class421.field3288, class421.field3290, class421.field3297};
   }

   @deob.ObfuscatedName("ox.d(I)V")
   public static void method10642() {
      class762.field7009.method11254();
      class762.field7007.method11254();
      class762.field7005 = -1L;
      class762.field7006 = true;
   }

   @deob.ObfuscatedName("sa.d(Ljava/lang/String;II)Z")
   public static boolean method14242(String arg0, int arg1) {
      return class689.method7945(arg0, arg1, "openjs");
   }

   @deob.ObfuscatedName("is.d(B)V")
   public static void method7420() {
      if (field2069 != null) {
         field2069.method11494();
         field2069 = null;
         field2068 = null;
      }

   }

   @deob.ObfuscatedName("qs.b(Ljava/lang/String;I)V")
   public static void method11332(String arg0) {
      if (client.field2410 == 14) {
         class109 var1 = class109.method15110(ClientProt.UNKNOWN_10, client.field2462.field832);
         var1.field814.method1569(0);
         int var2 = var1.field814.field935;
         var1.field814.method1577(arg0);
         var1.field814.field935 += 7;
         var1.field814.method1673(field8463, var2, var1.field814.field935);
         var1.field814.method1582(var1.field814.field935 - var2);
         client.field2462.method1408(var1);
         field3714 = class842.field8560;
      }
   }

   @deob.ObfuscatedName("eh.s(Lrs;I)V")
   public static void method5775(class790 arg0) {
      arg0.field7203[arg0.field7204 - 1] = field3757.method11377(arg0.field7203[arg0.field7204 - 1]).field7046;
   }

   @deob.ObfuscatedName("nd.d(Lux;Ljava/awt/Frame;I)V")
   public static void method9727(class876 arg0, Frame arg1) {
      arg0.method15342();
      arg1.setVisible(false);
      arg1.dispose();
   }

   @deob.ObfuscatedName("wd.gj(IIILqa;B)Lov;")
   public static class712 method15751(int arg0, int arg1, int arg2, class745 arg3) {
      return arg3 == null ? null : new class712(arg0, arg1, arg2, arg3.method7004(), arg3.method7033(), arg3.method6940(), arg3.method6941(), arg3.method6951(), arg3.method7046(), arg3.method6943());
   }

   @deob.ObfuscatedName("ke.r(Ljava/lang/CharSequence;Lwg;I)Ljava/lang/String;")
   public static String method8276(CharSequence arg0, class913 arg1) {
      if (arg0 == null) {
         return null;
      } else {
         int var2 = 0;
         int var3 = arg0.length();

         while(var2 < var3 && class930.method14953(arg0.charAt(var2))) {
            ++var2;
         }

         while(var3 > var2 && class930.method14953(arg0.charAt(var3 - 1))) {
            --var3;
         }

         int var4 = var3 - var2;
         if (var4 >= 1 && var4 <= class930.method15956(arg1)) {
            StringBuilder var5 = new StringBuilder(var4);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = arg0.charAt(var6);
               if (method15587(var7)) {
                  char var8 = method5523(var7);
                  if (var8 != 0) {
                     var5.append(var8);
                  }
               }
            }

            if (var5.length() == 0) {
               return null;
            } else {
               return var5.toString();
            }
         } else {
            return null;
         }
      }
   }

   @deob.ObfuscatedName("cb.b(IZI)V")
   public static void method4441(int arg0, boolean arg1) {
      if (arg1) {
         class109 var2 = class109.method15110(ClientProt.VIDEO_END, client.field2463.field832);
         var2.field814.method1569(arg0);
         client.field2463.method1408(var2);
      } else {
         class783.method14203(class932.field9446, arg0, -1);
      }

   }

   @deob.ObfuscatedName("pb.n(I)Z")
   public static boolean method10666() {
      return !method2265(client.field2410);
   }

   @deob.ObfuscatedName("aib.k(B)V")
   public static void method2964() {
      class299.field1882 = 0;
      class299.field1890 = -1;
      class299.field1895 = -1;
   }

   @deob.ObfuscatedName("zh.r(Z[BB)V")
   public static void method17066(boolean arg0, byte[] arg1) {
      if (field8795 == null) {
         field8795 = new class124(20000);
      }

      field8795.method1753(arg1, 0, arg1.length);
      if (arg0) {
         class755.method10740(field8795.field931);
         class861.field8796 = new class114[field6635];
         int var2 = 0;

         for(int var3 = field6955; var3 <= field6951; ++var3) {
            class114 var4 = class755.method5207(var3);
            if (var4 != null) {
               class861.field8796[var2++] = var4;
            }
         }

         class861.field8793 = false;
         field7307 = class431.method2169();
         field8795 = null;
      }

   }

   @deob.ObfuscatedName("dt.p(CI)C")
   private static char method5523(char arg0) {
      switch(arg0) {
      case ' ':
      case '-':
      case '_':
      case ' ':
         return '_';
      case '#':
      case '[':
      case ']':
         return arg0;
      case 'À':
      case 'Á':
      case 'Â':
      case 'Ã':
      case 'Ä':
      case 'à':
      case 'á':
      case 'â':
      case 'ã':
      case 'ä':
         return 'a';
      case 'Ç':
      case 'ç':
         return 'c';
      case 'È':
      case 'É':
      case 'Ê':
      case 'Ë':
      case 'è':
      case 'é':
      case 'ê':
      case 'ë':
         return 'e';
      case 'Í':
      case 'Î':
      case 'Ï':
      case 'í':
      case 'î':
      case 'ï':
         return 'i';
      case 'Ñ':
      case 'ñ':
         return 'n';
      case 'Ò':
      case 'Ó':
      case 'Ô':
      case 'Õ':
      case 'Ö':
      case 'ò':
      case 'ó':
      case 'ô':
      case 'õ':
      case 'ö':
         return 'o';
      case 'Ù':
      case 'Ú':
      case 'Û':
      case 'Ü':
      case 'ù':
      case 'ú':
      case 'û':
      case 'ü':
         return 'u';
      case 'ß':
         return 'b';
      case 'ÿ':
      case 'Ÿ':
         return 'y';
      default:
         return Character.toLowerCase(arg0);
      }
   }

   @deob.ObfuscatedName("sp.d(I)V")
   public static void method14382() {
      field1979 = field1855.field9062 + field1855.field9061 + 2;
      field1980 = field7094.field9062 + field7094.field9061 + 2;
      field1987 = new String[500];

      for(int var0 = 0; var0 < field1987.length; ++var0) {
         field1987[var0] = "";
      }

      class319.method10037(class881.field8901.method15374(field243));
   }

   @deob.ObfuscatedName("to.o(II)V")
   public static void method14817(int arg0) {
      field3119.method2968(arg0 >> 8);
   }

   @deob.ObfuscatedName("aes.r(II)V")
   public static void method1926(int arg0) {
      class231 var1 = class231.method15817(2, (long)arg0);
      var1.method3239();
   }

   @deob.ObfuscatedName("jc.r(I)V")
   public static void method7901() {
      if (field9102 != null) {
         field9102.method9296();
      }

      if (field2063 != null) {
         field2063.method9296();
      }

   }

   @deob.ObfuscatedName("aen.x(I)V")
   public static void method1797() {
      field3119.method3056();
      class417.field3124 = 1;
      field2071 = null;
      field3876 = null;
   }

   @deob.ObfuscatedName("aan.a(IIS)I")
   public static int method378(int arg0, int arg1) {
      int var2 = 0;

      while(arg1 > 0) {
         var2 = var2 << 1 | arg0 & 1;
         arg0 >>>= 1;
         --arg1;
      }

      return var2;
   }

   @deob.ObfuscatedName("wx.k(I)V")
   public static void method15952() {
      for(class98 var0 = (class98)class98.field765.method14964(); var0 != null; var0 = (class98)class98.field765.method15006()) {
         if (var0.field751) {
            var0.method1331();
         }
      }

      for(class98 var1 = (class98)class98.field733.method14964(); var1 != null; var1 = (class98)class98.field733.method15006()) {
         if (var1.field751) {
            var1.method1331();
         }
      }

   }

   @deob.ObfuscatedName("ack.s(ILlc;IIIZB)V")
   public static void method1011(int arg0, class612 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      class417.field3124 = 1;
      field2071 = arg1;
      field8502 = arg2;
      field2050 = arg3;
      field3876 = null;
      field908 = arg4;
      field3951 = arg5;
      field3682 = arg0;
      field7192 = null;
   }

   @deob.ObfuscatedName("eo.b(I)Lagg;")
   public static class171 method5930() {
      class171 var0 = new class171();
      boolean var1 = true;
      boolean var2 = false;
      boolean var3 = false;
      if (field8859.field845 < 512 && field8859.field845 != 0) {
         var1 = false;
         var0.method2327(128);
      }

      boolean var4;
      if (field6120.startsWith("win")) {
         var3 = true;
         var4 = true;
      } else {
         var4 = true;
      }

      if (class29.field239) {
         var0.method2327(8);
         var1 = false;
      }

      if (class29.field228) {
         var0.method2327(16);
         var4 = false;
      }

      if (class29.field236) {
         var0.method2327(32);
         var3 = false;
      }

      if (!var1 && !var4 && !var3) {
         class29.method15728(var0);
         return var0;
      } else {
         int var5 = -1;
         int var6 = -1;
         int var7 = -1;
         if (var1) {
            try {
               var5 = client.method11313(2, 1000);
               if (field9361.field974.method2236() == 2) {
                  var0.method2327(1);
               }
            } catch (Exception var20) {
               var0.method2327(1024);
            }
         }

         if (var3) {
            try {
               var7 = client.method11313(3, 1000);
               if (field9361.field974.method2236() == 3) {
                  var0.method2327(4);
                  class384 var9 = field8847.method2505();
                  long var10 = var9.field2785 & 281474976710655L;
                  switch(var9.field2781) {
                  case 4098:
                     boolean var12 = var10 >= 60129613779L;
                     var4 &= var12;
                     if (!var12) {
                        var0.method2327(512);
                     }
                     break;
                  case 4318:
                     boolean var13 = var10 >= 64425238954L;
                     var4 &= var13;
                     if (!var13) {
                        var0.method2327(256);
                     }
                  }
               }
            } catch (Exception var19) {
               var0.method2327(4096);
            }
         }

         if (var4) {
            try {
               var6 = client.method11313(1, 1000);
               if (field9361.field974.method2236() == 1) {
                  var0.method2327(2);
               }
            } catch (Exception var18) {
               var0.method2327(2048);
            }
         }

         if (var5 == -1 && var6 == -1 && var7 == -1) {
            class29.method15728(var0);
            return var0;
         } else {
            var0.method2329(3, var7);
            var0.method2329(1, var6);
            var0.method2329(2, var5);
            int var16 = (int)((float)var7 * 1.3F);
            int var17 = (int)((float)var6 * 1.1F);
            if (var5 > var16 && var5 > var17) {
               class29.method10346(var0, var5);
            } else if (var16 > var17) {
               class29.method10721(var0, 3, var16);
            } else {
               class29.method10721(var0, 1, var17);
            }

            return var0;
         }
      }
   }

   @deob.ObfuscatedName("vs.o(I)V")
   public static void method15601() {
      class762.method1314();
      class762.field7009.method11253();
      class762.field7007.method11253();
      if (client.field2458 > 0) {
         class109 var0 = class109.method15110(ClientProt.EVENT_KEYBOARD, client.field2463.field832);
         var0.field814.method1569(client.field2458 * 4);

         for(int var1 = 0; var1 < client.field2458; ++var1) {
            class708 var2 = client.field2441[var1];
            long var3 = var2.method1305() - class762.field7005;
            if (var3 > 16777215L) {
               var3 = 16777215L;
            }

            class762.field7005 = var2.method1305();
            var0.field814.method1568(var2.method1297());
            var0.field814.method1571((int)var3);
         }

         client.field2463.method1408(var0);
      }

      if (class762.field7008 > 0) {
         --class762.field7008;
      }

      if (client.field2432 && class762.field7008 <= 0) {
         class762.field7008 = 20;
         client.field2432 = false;
         class109 var5 = class109.method15110(ClientProt.EVENT_CAMERA_POSITION, client.field2463.field832);
         var5.field814.method1750((int)client.field2603 >> 3);
         var5.field814.method1627((int)client.field2502 >> 3);
         client.field2463.method1408(var5);
      }

      if (class762.field7006 != field6857) {
         class762.field7006 = field6857;
         class109 var6 = class109.method15110(ClientProt.EVENT_APPLET_FOCUS, client.field2463.field832);
         var6.field814.method1568(field6857 ? 1 : 0);
         client.field2463.method1408(var6);
      }

      if (!client.field2419) {
         class109 var7 = class109.method15110(ClientProt.CLIENT_DETAILOPTIONS_STATUS, client.field2463.field832);
         var7.field814.method1568(0);
         int var8 = var7.field814.field935;
         class124 var9 = field9361.method1884();
         var7.field814.method1753(var9.field931, 0, var9.field935);
         var7.field814.method1664(var7.field814.field935 - var8);
         client.field2463.method1408(var7);
         client.field2419 = true;
      }

   }

   @deob.ObfuscatedName("jt.x(IIIIIII)J")
   private static long method8015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      class902.field9226.clear();
      class902.field9226.set(arg5, arg4, arg3, arg2, arg1, arg0);
      return class902.field9226.getTime().getTime();
   }

   @deob.ObfuscatedName("ax.o([Ljava/lang/String;B)V")
   public static void method4084(String[] arg0) {
      if (arg0.length > 1) {
         for(int var1 = 0; var1 < arg0.length; ++var1) {
            if (arg0[var1].startsWith("pause")) {
               int var2 = 5;

               try {
                  var2 = Integer.parseInt(arg0[var1].substring(6));
               } catch (Exception var4) {
               }

               class319.method10037("Pausing for " + var2 + " seconds...");
               field526 = arg0;
               class319.field1985 = var1 + 1;
               field10611 = class431.method2169() + (long)(var2 * 1000);
               return;
            }

            class319.field1984 = arg0[var1];
            class319.method10930(false);
         }
      } else {
         class319.field1984 = class319.field1984 + arg0[0];
         class319.field1986 += arg0[0].length();
      }

   }

   @deob.ObfuscatedName("abl.b(IB)V")
   public static void method666(int arg0) {
      class737 var1 = class547.field4362;
      synchronized(class547.field4362) {
         class547.field4362.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("od.j(Lrs;B)V")
   public static void method10165(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class923 var3 = field5946.method15930(var2);
      if (var3.method15884()) {
         String var4 = var3.field9389;
         if (var1 == -1) {
            arg0.field7226[++arg0.field7205 - 1] = var4;
         } else {
            arg0.field7226[++arg0.field7205 - 1] = field3757.method11377(var1).method11392(var2, var4);
         }
      } else {
         int var5 = var3.field9388;
         if (var1 == -1) {
            arg0.field7203[++arg0.field7204 - 1] = var5;
         } else {
            arg0.field7203[++arg0.field7204 - 1] = field3757.method11377(var1).method11412(var2, var5);
         }
      }

   }

   @deob.ObfuscatedName("aq.r(II)S")
   public static short method4006(int arg0) {
      int var1 = arg0 >> 10 & 63;
      int var2 = arg0 >> 3 & 112;
      int var3 = arg0 & 127;
      int var4 = var3 <= 64 ? var2 * var3 >> 7 : (127 - var3) * var2 >> 7;
      int var5 = var3 + var4;
      int var6;
      if (var5 != 0) {
         var6 = (var4 << 8) / var5;
      } else {
         var6 = var4 << 1;
      }

      return (short)(var1 << 10 | var6 >> 4 << 7 | var5);
   }

   @deob.ObfuscatedName("c.p(III)I")
   public static int method4415(int arg0, int arg1) {
      int var2 = (arg0 & 127) * arg1 >> 7;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 126) {
         var2 = 126;
      }

      return (arg0 & 65408) + var2;
   }

   @deob.ObfuscatedName("eb.a([BIIB)Ljava/lang/String;")
   public static String method5675(byte[] arg0, int arg1, int arg2) {
      char[] var3 = new char[arg2];
      int var4 = 0;

      for(int var5 = 0; var5 < arg2; ++var5) {
         int var6 = arg0[arg1 + var5] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class813.field8397[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @deob.ObfuscatedName("ig.b(B)V")
   public static void method7346() {
      field10553 = client.field2687;
      field2952 = client.field2688;
      field1579 = client.field2629;
      field3819 = client.field2686;
      class397.field2951 = true;
      class397.field2954 = class677.field6149;
      if (class397.field2953 != 0 && class397.field2949 != 0) {
         client.field2629 = 334;
         client.field2686 = 334;
         client.field2688 = client.field2687 = (short)(class397.field2953 * 512 / class397.field2949);
      }

   }

   @deob.ObfuscatedName("vx.v(CB)Z")
   private static boolean method15711(char arg0) {
      return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
   }

   @deob.ObfuscatedName("x.b(Lajf;I)I")
   public static int method15959(class251 arg0) {
      int var1 = arg0.method3394(2);
      int var2;
      if (var1 == 0) {
         var2 = 0;
      } else if (var1 == 1) {
         var2 = arg0.method3394(5);
      } else if (var1 == 2) {
         var2 = arg0.method3394(8);
      } else {
         var2 = arg0.method3394(11);
      }

      return var2;
   }

   @deob.ObfuscatedName("lw.s(II)I")
   public static int method9136(int arg0) {
      double var1 = (double)(arg0 >> 16 & 255) / 256.0D;
      double var3 = (double)(arg0 >> 8 & 255) / 256.0D;
      double var5 = (double)(arg0 & 255) / 256.0D;
      double var7 = var1;
      if (var3 < var1) {
         var7 = var3;
      }

      if (var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if (var3 > var1) {
         var9 = var3;
      }

      if (var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if (var7 != var9) {
         if (var15 < 0.5D) {
            var13 = (var9 - var7) / (var7 + var9);
         }

         if (var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if (var1 == var9) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if (var3 == var9) {
            var11 = (var5 - var1) / (var9 - var7) + 2.0D;
         } else if (var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      double var17 = var11 / 6.0D;
      int var19 = (int)(var17 * 256.0D);
      int var20 = (int)(var13 * 256.0D);
      int var21 = (int)(var15 * 256.0D);
      if (var20 < 0) {
         var20 = 0;
      } else if (var20 > 255) {
         var20 = 255;
      }

      if (var21 < 0) {
         var21 = 0;
      } else if (var21 > 255) {
         var21 = 255;
      }

      if (var21 > 243) {
         var20 >>= 4;
      } else if (var21 > 217) {
         var20 >>= 3;
      } else if (var21 > 192) {
         var20 >>= 2;
      } else if (var21 > 179) {
         var20 >>= 1;
      }

      return (var21 >> 1) + ((var19 & 255) >> 2 << 10) + (var20 >> 5 << 7);
   }

   @deob.ObfuscatedName("acd.e(I)Z")
   public static boolean method957() {
      try {
         if (class417.field3124 == 2) {
            if (field1160 == null) {
               field1160 = class71.method1032(field2071, field8502, field2050);
               if (field1160 == null) {
                  return false;
               }
            }

            if (field3127 == null) {
               field3127 = new class655(field3118, field3117);
            }

            class221 var0 = field3119;
            if (field3876 != null) {
               var0 = field3876;
            }

            if (var0.method2970(field1160, field3123, field3127, 22050)) {
               field3119 = var0;
               field3119.method2971();
               if (field3126 > 0) {
                  class417.field3124 = 3;
                  field3119.method2966(field3126 > field908 ? field908 : field3126);

                  for(int var1 = 0; var1 < field8869.length; ++var1) {
                     field3119.method2969(var1, field8869[var1]);
                     field8869[var1] = 255;
                  }
               } else {
                  class417.field3124 = 0;
                  field3119.method2966(field908);

                  for(int var2 = 0; var2 < field8869.length; ++var2) {
                     field3119.method2969(var2, field8869[var2]);
                     field8869[var2] = 255;
                  }
               }

               if (field3876 == null) {
                  if (field5371 > 0L) {
                     field3119.method2975(field1160, field3951, true, field5371);
                  } else {
                     field3119.method3008(field1160, field3951);
                  }

                  if (field7192 != null) {
                     field7192.method432();
                  }
               }

               if (field3120 != null) {
                  field3120.method9297(field3119);
               }

               field1160 = null;
               field3127 = null;
               field2071 = null;
               field5371 = 0L;
               field3876 = null;
               field7192 = null;
               return true;
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         field3119.method3056();
         class417.method8016();
      }

      return false;
   }

   @deob.ObfuscatedName("vd.r(Lajf;IB)V")
   public static void method15425(class251 arg0, int arg1) {
      class723 var2 = client.field2468.method9649();
      boolean var3 = arg0.method3394(1) == 1;
      if (var3) {
         class324.field2059[++class324.field2061 - 1] = arg1;
      }

      int var4 = arg0.method3394(2);
      class211 var5 = client.field2408[arg1];
      if (var4 == 0) {
         if (var3) {
            var5.field1404 = false;
         } else if (client.field2452 == arg1) {
            throw new RuntimeException();
         } else {
            class852 var6 = class324.field2060[arg1] = new class852();
            var6.field8742 = (var2.field6677 + var5.field62[0] >> 6) + (var2.field6676 + var5.field16[0] >> 6 << 14) + (var5.field1032 << 28);
            if (var5.field1383 != -1) {
               var6.field8741 = var5.field1383;
            } else {
               var6.field8741 = var5.field57.method6560();
            }

            var6.field8740 = var5.field34;
            var6.field8743 = var5.field1410;
            var6.field8744 = var5.field1409;
            if (var5.field1401 > 0) {
               method395(var5);
            }

            client.field2408[arg1] = null;
            if (arg0.method3394(1) != 0) {
               class324.method3854(arg0, arg1);
            }

         }
      } else if (var4 == 1) {
         int var7 = arg0.method3394(3);
         int var8 = var5.field16[0];
         int var9 = var5.field62[0];
         if (var7 == 0) {
            --var8;
            --var9;
         } else if (var7 == 1) {
            --var9;
         } else if (var7 == 2) {
            ++var8;
            --var9;
         } else if (var7 == 3) {
            --var8;
         } else if (var7 == 4) {
            ++var8;
         } else if (var7 == 5) {
            --var8;
            ++var9;
         } else if (var7 == 6) {
            ++var9;
         } else if (var7 == 7) {
            ++var8;
            ++var9;
         }

         if (var3) {
            var5.field1407 = var8;
            var5.field1406 = var9;
            var5.field1404 = true;
         } else {
            var5.method2864(var8, var9, class324.field2058[arg1]);
         }

      } else if (var4 == 2) {
         int var10 = arg0.method3394(4);
         int var11 = var5.field16[0];
         int var12 = var5.field62[0];
         if (var10 == 0) {
            var11 -= 2;
            var12 -= 2;
         } else if (var10 == 1) {
            --var11;
            var12 -= 2;
         } else if (var10 == 2) {
            var12 -= 2;
         } else if (var10 == 3) {
            ++var11;
            var12 -= 2;
         } else if (var10 == 4) {
            var11 += 2;
            var12 -= 2;
         } else if (var10 == 5) {
            var11 -= 2;
            --var12;
         } else if (var10 == 6) {
            var11 += 2;
            --var12;
         } else if (var10 == 7) {
            var11 -= 2;
         } else if (var10 == 8) {
            var11 += 2;
         } else if (var10 == 9) {
            var11 -= 2;
            ++var12;
         } else if (var10 == 10) {
            var11 += 2;
            ++var12;
         } else if (var10 == 11) {
            var11 -= 2;
            var12 += 2;
         } else if (var10 == 12) {
            --var11;
            var12 += 2;
         } else if (var10 == 13) {
            var12 += 2;
         } else if (var10 == 14) {
            ++var11;
            var12 += 2;
         } else if (var10 == 15) {
            var11 += 2;
            var12 += 2;
         }

         if (var3) {
            var5.field1407 = var11;
            var5.field1406 = var12;
            var5.field1404 = true;
         } else {
            var5.method2864(var11, var12, class324.field2058[arg1]);
         }

      } else {
         int var13 = arg0.method3394(1);
         if (var13 == 0) {
            int var14 = arg0.method3394(12);
            int var15 = var14 >> 10;
            int var16 = var14 >> 5 & 31;
            if (var16 > 15) {
               var16 -= 32;
            }

            int var17 = var14 & 31;
            if (var17 > 15) {
               var17 -= 32;
            }

            int var18 = var5.field16[0] + var16;
            int var19 = var5.field62[0] + var17;
            if (var3) {
               var5.field1407 = var18;
               var5.field1406 = var19;
               var5.field1404 = true;
            } else {
               var5.method2864(var18, var19, class324.field2058[arg1]);
            }

            var5.field1032 = var5.field1034 = (byte)(var5.field1032 + var15 & 3);
            if (client.field2468.method9592().method8746(var18, var19)) {
               ++var5.field1034;
            }

            if (client.field2452 == arg1 && field1977 != var5.field1032) {
               field1977 = var5.field1032;
            }

         } else {
            int var20 = arg0.method3394(30);
            int var21 = var20 >> 28;
            int var22 = var20 >> 14 & 16383;
            int var23 = var20 & 16383;
            int var24 = (var2.field6676 + var5.field16[0] + var22 & 16383) - var2.field6676;
            int var25 = (var2.field6677 + var5.field62[0] + var23 & 16383) - var2.field6677;
            if (var3) {
               var5.field1407 = var24;
               var5.field1406 = var25;
               var5.field1404 = true;
            } else {
               var5.method2864(var24, var25, class324.field2058[arg1]);
            }

            var5.field1032 = var5.field1034 = (byte)(var5.field1032 + var21 & 3);
            if (client.field2468.method9592().method8746(var24, var25)) {
               ++var5.field1034;
            }

            if (client.field2452 == arg1) {
               field1977 = var5.field1032;
            }

         }
      }
   }

   @deob.ObfuscatedName("of.r([Lem;I)V")
   public static void method10200(class425[] arg0) {
      for(int var1 = 0; var1 < arg0.length; ++var1) {
         class425 var2 = arg0[var1];
         if (var2.field3424 != null) {
            class90 var3 = new class90();
            var3.field679 = var2;
            var3.field683 = var2.field3424;
            class783.method10736(var3, 2000000);
         }
      }

   }

   @deob.ObfuscatedName("ry.z(Ljava/lang/String;CB)[Ljava/lang/String;")
   public static String[] method14220(String arg0, char arg1) {
      int var2 = class816.method6108(arg0, arg1);
      String[] var3 = new String[var2 + 1];
      int var4 = 0;
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7;
         for(var7 = var5; arg0.charAt(var7) != arg1; ++var7) {
         }

         var3[var4++] = arg0.substring(var5, var7);
         var5 = var7 + 1;
      }

      var3[var2] = arg0.substring(var5);
      return var3;
   }

   @deob.ObfuscatedName("aiu.d(II)Leo;")
   public static class427 method3348(int arg0) {
      return field844[arg0 >> 16];
   }

   @deob.ObfuscatedName("aby.b(III)Lem;")
   public static class425 method886(int arg0, int arg1) {
      class425 var2 = class425.method11190(arg0);
      if (arg1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.field3551 != null && arg1 < var2.field3551.length ? var2.field3551[arg1] : null;
      }
   }

   @deob.ObfuscatedName("wj.bi(ZB)V")
   public static void method15823(boolean arg0) {
      if (arg0 && field6389 != null) {
         field924 = field6389.field1666;
      } else {
         field924 = -1;
      }

      field6389 = null;
      field6489 = null;
      class131.field1015 = 0;
      field818 = null;
      class131.method10201();
      class131.field6415.method14958();
      field6400 = null;
      field95 = null;
      class131.field1016 = -1;
      class131.field1017 = -1;
      field7082 = null;
      field1198 = null;
      field6232 = null;
      field5795 = null;
      field8494 = null;
      field242 = null;
      field5711 = null;
      field6659 = null;
      if (field6386 != null) {
         field6386.method10687();
         field6386.method10690(128, 64);
      }

      if (field6416 != null) {
         field6416.method15832(64, 64);
      }

      if (field6385 != null) {
         field6385.method14636(256);
      }

      field5610.method10755(64);
   }

   @deob.ObfuscatedName("aaq.o(Laht;I)V")
   public static void method395(class211 arg0) {
      class98 var1 = (class98)class98.field734.method15322((long)arg0.field12);
      if (var1 != null) {
         if (var1.field758 != null) {
            field1029.method3091(var1.field758);
            var1.field758 = null;
         }

         var1.method9864();
      }

   }

   @deob.ObfuscatedName("nw.x(Lahi;I)I")
   public static int method10036(class200 arg0) {
      class915 var1 = arg0.field1312;
      if (var1.field9319 != null) {
         var1 = var1.method15778(field10637);
         if (var1 == null) {
            return -1;
         }
      }

      int var2 = var1.field9329;
      class743 var3 = arg0.method101();
      int var4 = arg0.field35.method14716();
      if (var4 != -1 && !arg0.field35.field1200) {
         if (var3.field6848 != var4 && var3.field6822 != var4 && var3.field6837 != var4 && var3.field6823 != var4) {
            if (var3.field6825 == var4 || var3.field6843 == var4 || var3.field6833 == var4 || var3.field6827 == var4) {
               var2 = var1.field9342;
            }
         } else {
            var2 = var1.field9337;
         }
      } else {
         var2 = var1.field9327;
      }

      return var2;
   }

   @deob.ObfuscatedName("na.u(ILjava/lang/String;II)V")
   public static void method9708(int arg0, String arg1, int arg2) {
      class248 var3 = method10133(class932.field9442, arg0, -1);
      if (var3 != null) {
         class790 var4 = class783.method10734();
         var4.field7211 = new int[var3.field1645];
         var4.field7199 = new String[var3.field1646];
         var4.field7199[0] = arg1;
         var4.field7211[0] = arg2;
         class783.method8895(var3, 200000, var4);
      }
   }

   @deob.ObfuscatedName("qe.s(Laht;I)I")
   public static int method11103(class211 arg0) {
      int var1 = arg0.field1387;
      class743 var2 = arg0.method101();
      int var3 = arg0.field35.method14716();
      if (var3 != -1 && !arg0.field35.field1200) {
         if (var2.field6848 != var3 && var2.field6822 != var3 && var2.field6837 != var3 && var2.field6823 != var3) {
            if (var2.field6825 == var3 || var2.field6843 == var3 || var2.field6833 == var3 || var2.field6827 == var3) {
               var1 = arg0.field1397;
            }
         } else {
            var1 = arg0.field1399;
         }
      } else {
         var1 = arg0.field1398;
      }

      return var1;
   }

   @deob.ObfuscatedName("acu.l(IIIIB)V")
   public static void method1100(int arg0, int arg1, int arg2, int arg3) {
      for(class98 var4 = (class98)class98.field765.method14964(); var4 != null; var4 = (class98)class98.field765.method15006()) {
         method17054(var4, arg0, arg1, arg2, arg3);
      }

      for(class98 var5 = (class98)class98.field733.method14964(); var5 != null; var5 = (class98)class98.field733.method15006()) {
         byte var6 = 1;
         class743 var7 = var5.field748.method101();
         int var8 = var5.field748.field35.method14716();
         if (var8 != -1 && !var5.field748.field35.field1200) {
            if (var7.field6848 != var8 && var7.field6822 != var8 && var7.field6837 != var8 && var7.field6823 != var8) {
               if (var7.field6825 == var8 || var7.field6843 == var8 || var7.field6833 == var8 || var7.field6827 == var8) {
                  var6 = 3;
               }
            } else {
               var6 = 2;
            }
         } else {
            var6 = 0;
         }

         if (var5.field754 != var6) {
            int var9 = method10036(var5.field748);
            class915 var10 = var5.field748.field1312;
            if (var10.field9319 != null) {
               var10 = var10.method15778(field10637);
            }

            if (var10 != null && var9 != -1) {
               if (var5.field742 == var9 && var5.field755 == var10.field9334) {
                  var5.field754 = var6;
                  var5.field747 = var10.field9331;
               } else {
                  boolean var11 = false;
                  if (var5.field758 != null) {
                     var5.field747 -= 512;
                     if (var5.field747 <= 0) {
                        field1029.method3091(var5.field758);
                        var5.field758 = null;
                        var11 = true;
                     }
                  } else {
                     var11 = true;
                  }

                  if (var11) {
                     var5.field747 = var10.field9331;
                     var5.field757 = null;
                     var5.field756 = null;
                     var5.field742 = var9;
                     var5.field755 = var10.field9334;
                     var5.field754 = var6;
                  }
               }
            } else {
               var5.field742 = -1;
               var5.field755 = false;
               var5.field754 = var6;
            }
         }

         class584 var12 = var5.field748.method11602().field5446;
         var5.field736 = (int)var12.field5328;
         var5.field738 = (int)var12.field5328 + (var5.field748.method96() << 8);
         var5.field737 = (int)var12.field5331;
         var5.field745 = (int)var12.field5331 + (var5.field748.method96() << 8);
         var5.field735 = var5.field748.field1032;
         method17054(var5, arg0, arg1, arg2, arg3);
      }

      for(class98 var13 = (class98)class98.field734.method15313(); var13 != null; var13 = (class98)class98.field734.method15314()) {
         byte var14 = 1;
         class743 var15 = var13.field752.method101();
         int var16 = var13.field752.field35.method14716();
         if (var16 != -1 && !var13.field752.field35.field1200) {
            if (var15.field6848 != var16 && var15.field6822 != var16 && var15.field6837 != var16 && var15.field6823 != var16) {
               if (var15.field6825 == var16 || var15.field6843 == var16 || var15.field6833 == var16 || var15.field6827 == var16) {
                  var14 = 3;
               }
            } else {
               var14 = 2;
            }
         } else {
            var14 = 0;
         }

         if (var13.field754 != var14) {
            int var17 = method11103(var13.field752);
            if (var13.field742 == var17 && var13.field752.field1400 == var13.field755) {
               var13.field747 = var13.field752.field1393;
               var13.field754 = var14;
            } else {
               boolean var18 = false;
               if (var13.field758 != null) {
                  var13.field747 -= 512;
                  if (var13.field747 <= 0) {
                     field1029.method3091(var13.field758);
                     var13.field758 = null;
                     var18 = true;
                  }
               } else {
                  var18 = true;
               }

               if (var18) {
                  var13.field747 = var13.field752.field1393;
                  var13.field757 = null;
                  var13.field756 = null;
                  var13.field742 = var17;
                  var13.field755 = var13.field752.field1400;
                  var13.field754 = var14;
               }
            }
         }

         class584 var19 = var13.field752.method11602().field5446;
         var13.field736 = (int)var19.field5328;
         var13.field738 = (int)var19.field5328 + (var13.field752.method96() << 8);
         var13.field737 = (int)var19.field5331;
         var13.field745 = (int)var19.field5331 + (var13.field752.method96() << 8);
         var13.field735 = var13.field752.field1032;
         method17054(var13, arg0, arg1, arg2, arg3);
      }

   }

   @deob.ObfuscatedName("aaz.h(I)V")
   public static void method461() {
   }

   @deob.ObfuscatedName("wo.o(I)Ljava/io/File;")
   public static File method15867() {
      return field4170;
   }

   @deob.ObfuscatedName("lo.s(I)V")
   public static void method8993() {
      field9361.method1857(field9361.field948, 1);
      field9361.method1857(field9361.field968, 1);
      field9361.method1857(field9361.field982, 1);
      field9361.method1857(field9361.field960, 1);
      field9361.method1857(field9361.field962, 0);
      field9361.method1857(field9361.field958, 0);
      field9361.method1857(field9361.field971, 0);
      field9361.method1857(field9361.field964, 0);
      field9361.method1857(field9361.field972, 0);
      field9361.method1857(field9361.field951, 0);
      field9361.method1857(field9361.field975, 0);
      field9361.method1857(field9361.field986, 0);
      field9361.method1857(field9361.field952, 0);
      field9361.method1857(field9361.field946, 0);
      field9361.method1857(field9361.field965, 0);
      field9361.method1857(field9361.field961, class441.field3655.field3657);
      field9361.method1857(field9361.field954, 0);
      if (field8847 != null && field8847.method7492() && field8847.method7574()) {
         field8847.method7559();
      }

      field9361.method1857(field9361.field970, 0);
      class29.method895();
      field9361.method1857(field9361.field973, 2);
      field9361.method1857(field9361.field966, 2);
      client.method7899();
      client.field2468.method9512().method11128();
      client.field2429 = true;
   }

   @deob.ObfuscatedName("nu.q(I)V")
   public static void method10030() {
      for(int var0 = 0; var0 < class677.field6150; ++var0) {
         class678 var1 = class677.field6156[var0];
         if (var1.field6168 == 3) {
            class677.method9251(var1);
         }
      }

   }

   @deob.ObfuscatedName("zb.u(Lado;IIIII)V")
   private static void method17054(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0.field742 != -1 || arg0.field761 != null) {
         int var5 = 0;
         int var6 = arg0.field747 * field9361.field985.method2319() >> 8;
         if (arg2 > arg0.field738) {
            var5 += arg2 - arg0.field738;
         } else if (arg2 < arg0.field736) {
            var5 += arg0.field736 - arg2;
         }

         if (arg3 > arg0.field745) {
            var5 += arg3 - arg0.field745;
         } else if (arg3 < arg0.field737) {
            var5 += arg0.field737 - arg3;
         }

         if (arg0.field741 != 0 && var5 - 256 <= arg0.field741 && field9361.field985.method2319() != 0 && arg0.field735 == arg1) {
            var5 -= 256;
            if (var5 < 0) {
               var5 = 0;
            }

            int var7 = arg0.field741 - arg0.field740;
            if (var7 < 0) {
               var7 = arg0.field741;
            }

            int var8 = var6;
            int var9 = var5 - arg0.field740;
            if (var9 > 0 && var7 > 0) {
               var8 = (var7 - var9) * var6 / var7;
            }

            field5701.method96();
            int var10 = 8192;
            int var11 = (arg0.field738 + arg0.field736) / 2 - arg2;
            int var12 = (arg0.field745 + arg0.field737) / 2 - arg3;
            if (var11 != 0 || var12 != 0) {
               int var13 = -field7098 - (int)(Math.atan2((double)var11, (double)var12) * 2607.5945876176133D) - 4096 & 16383;
               if (var13 > 8192) {
                  var13 = 16384 - var13;
               }

               int var14;
               if (var5 <= 0) {
                  var14 = 8192;
               } else if (var5 >= 4096) {
                  var14 = 16384;
               } else {
                  var14 = var5 * 8192 / 4096 + 8192;
               }

               var10 = (16384 - var14 >> 1) + var13 * var14 / 8192;
            }

            if (arg0.field758 == null) {
               if (arg0.field742 >= 0) {
                  int var15 = arg0.field750 == 256 && arg0.field753 == 256 ? 256 : class677.method8032(arg0.field753, arg0.field750);
                  if (arg0.field755) {
                     if (arg0.field756 == null) {
                        arg0.field756 = class86.method1171(field7262, arg0.field742);
                     }

                     if (arg0.field756 != null) {
                        if (arg0.field757 == null) {
                           arg0.field757 = arg0.field756.method1200();
                        }

                        if (arg0.field757 != null) {
                           class287 var16 = (class287)arg0.field757.method3111(var15, var8 << 6, var10);
                           var16.method3313(-1);
                           field1029.method3107(var16);
                           arg0.field758 = var16;
                        }
                     }
                  } else {
                     class660 var17 = class660.method9661(field2775, arg0.field742, 0);
                     if (var17 != null) {
                        class302 var18 = var17.method9662().method3889(field10564);
                        class294 var19 = (class294)var18.method3111(var15, var8 << 6, var10);
                        var19.method3313(-1);
                        field1029.method3107(var19);
                        arg0.field758 = var19;
                     }
                  }
               }
            } else {
               arg0.field758.method3248(var8);
               arg0.field758.method3250(var10);
            }

            if (arg0.field766 == null) {
               if (arg0.field761 != null && (arg0.field732 -= arg4) <= 0) {
                  int var20 = arg0.field750 == 256 && arg0.field753 == 256 ? 256 : (int)(Math.random() * (double)(arg0.field750 - arg0.field753)) + arg0.field753;
                  if (arg0.field762) {
                     if (arg0.field763 == null) {
                        int var21 = (int)(Math.random() * (double)arg0.field761.length);
                        arg0.field763 = class86.method1171(field7262, arg0.field761[var21]);
                     }

                     if (arg0.field763 != null) {
                        if (arg0.field764 == null) {
                           arg0.field764 = arg0.field763.method1200();
                        }

                        if (arg0.field764 != null) {
                           class287 var22 = (class287)arg0.field764.method3111(var20, var8 << 6, var10);
                           var22.method3313(0);
                           field1029.method3107(var22);
                           arg0.field766 = var22;
                           arg0.field732 = arg0.field731 + (int)(Math.random() * (double)(arg0.field739 - arg0.field731));
                        }
                     }
                  } else {
                     int var23 = (int)(Math.random() * (double)arg0.field761.length);
                     class660 var24 = class660.method9661(field2775, arg0.field761[var23], 0);
                     if (var24 != null) {
                        class302 var25 = var24.method9662().method3889(field10564);
                        class294 var26 = (class294)var25.method3111(var20, var8 << 6, var10);
                        var26.method3313(0);
                        field1029.method3107(var26);
                        arg0.field766 = var26;
                        arg0.field732 = arg0.field731 + (int)(Math.random() * (double)(arg0.field739 - arg0.field731));
                     }
                  }
               }
            } else {
               arg0.field766.method3248(var8);
               arg0.field766.method3250(var10);
               if (!arg0.field766.method9863()) {
                  arg0.field766 = null;
                  arg0.field763 = null;
                  arg0.field764 = null;
               }
            }

         } else {
            if (arg0.field758 != null) {
               field1029.method3091(arg0.field758);
               arg0.field758 = null;
               arg0.field757 = null;
               arg0.field756 = null;
            }

            if (arg0.field766 != null) {
               field1029.method3091(arg0.field766);
               arg0.field766 = null;
               arg0.field763 = null;
               arg0.field764 = null;
            }

         }
      }
   }

   @deob.ObfuscatedName("fo.v(IS)V")
   public static void method6464(int arg0) {
      class737 var1 = class747.field6893;
      synchronized(class747.field6893) {
         class747.field6893.method10882(arg0);
      }

      class737 var3 = class747.field6885;
      synchronized(class747.field6885) {
         class747.field6885.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("air.u(IILem;Lta;IIB)V")
   public static void method3315(int arg0, int arg1, class425 arg2, class826 arg3, int arg4, int arg5) {
      int var6 = class324.field2053;
      int[] var7 = class324.field2057;

      for(int var8 = 0; var8 < var6; ++var8) {
         class211 var9 = client.field2408[var7[var8]];
         if (var9 != null && var9.method2867() && !var9.field1408 && field5701 != var9 && field5701.field1032 == var9.field1032) {
            class584 var10 = var9.method11602().field5446;
            int var11 = (int)var10.field5328 / 128 - arg0 / 128;
            int var12 = (int)var10.field5331 / 128 - arg1 / 128;
            boolean var13 = false;

            for(int var14 = 0; var14 < client.field2694; ++var14) {
               class960 var15 = client.field2697[var14];
               if (var9.field1381.equals(var15.field9601) && var15.field9605 != 0) {
                  var13 = true;
                  break;
               }
            }

            boolean var16 = false;

            for(int var17 = 0; var17 < field6939; ++var17) {
               if (var9.field1381.equals(field3105[var17].field1802)) {
                  var16 = true;
                  break;
               }
            }

            boolean var18 = false;
            if (field5701.field1395 != 0 && var9.field1395 != 0 && field5701.field1395 == var9.field1395) {
               var18 = true;
            }

            if (var9.field1410) {
               class299.method1089(arg2, arg3, arg4, arg5, var11, var12, field5594[6]);
            } else if (var18) {
               class299.method1089(arg2, arg3, arg4, arg5, var11, var12, field5594[4]);
            } else if (var9.field1409) {
               class299.method1089(arg2, arg3, arg4, arg5, var11, var12, field5594[7]);
            } else if (var13) {
               class299.method1089(arg2, arg3, arg4, arg5, var11, var12, field5594[3]);
            } else if (var16) {
               class299.method1089(arg2, arg3, arg4, arg5, var11, var12, field5594[5]);
            } else {
               class299.method1089(arg2, arg3, arg4, arg5, var11, var12, field5594[2]);
            }
         }
      }

   }

   @deob.ObfuscatedName("me.co(Lra;Ladp;Lpp;IIIILah;I)V")
   public static void method9256(class772 arg0, class99 arg1, class733 arg2, int arg3, int arg4, int arg5, int arg6, class191 arg7) {
      int var8 = arg4 - arg6 / 2 - 5;
      int var9 = arg5 + 2;
      if (arg2.field6736 != 0) {
         arg0.method11524(var8, var9, arg6 + 10, arg5 + arg3 * arg7.method2476() - var9 + 1, arg2.field6736);
      }

      if (arg2.field6737 != 0) {
         arg0.method11505(var8, var9, arg6 + 10, arg5 + arg3 * arg7.method2476() - var9 + 1, arg2.field6737);
      }

      int var10 = arg2.field6739;
      if (arg1.field769 && arg2.field6759 != -1) {
         var10 = arg2.field6759;
      }

      for(int var11 = 0; var11 < arg3; ++var11) {
         String var12 = class131.field1022[var11];
         if (var11 < arg3 - 1) {
            var12 = var12.substring(0, var12.length() - 4);
         }

         arg7.method2484(arg0, var12, arg4, arg5, var10, true);
         arg5 += arg7.method2476();
      }

   }

   @deob.ObfuscatedName("qf.u(ILsy;I)Ljava/lang/String;")
   public static String method11114(int arg0, class823 arg1) {
      if (arg0 < 100000) {
         return "<col=ffff00>" + arg0 + "</col>";
      } else {
         return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + class881.field9024.method15374(arg1) + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class881.field8917.method15374(arg1) + "</col>";
      }
   }

   @deob.ObfuscatedName("ml.m(B)V")
   public static void method9395() {
      if (field9361.field983.method2195() == 1) {
         field4892.method8954(new class650(class657.field5992, (class251)null));
      } else {
         client.field2468.method9531();
         class299.method8733();
      }

   }

   @deob.ObfuscatedName("dd.i(I)V")
   public static void method5381() {
      class425.field3393.method10883();
      class425.field3501.method10883();
      class425.field3388.method10883();
      class425.field3395.method10883();
   }

   @deob.ObfuscatedName("pr.ah(B)V")
   public static final void method10870() {
      field1652 = null;
      field1633 = null;
   }

   @deob.ObfuscatedName("l.w(II)V")
   public static void method8732(int arg0) {
   }

   @deob.ObfuscatedName("kg.j(II)V")
   public static void method8289(int arg0) {
      if (field2830 == 131) {
         class385.field2802 = arg0;
      } else if (field2830 == 262) {
         class385.field2832 = arg0;
      }

   }

   @deob.ObfuscatedName("ru.ah(Lem;III)V")
   public static void method14170(class425 arg0, int arg1, int arg2) {
      class987.field10503 = arg0;
      class987.field10495 = arg1;
      class987.field10510 = arg2;
   }

   @deob.ObfuscatedName("pt.an(I)Lajp;")
   public static class261 method10915() {
      return field6368;
   }

   @deob.ObfuscatedName("kq.ak(Lajp;B)Ljava/lang/String;")
   public static String method8533(class261 arg0) {
      return !class987.field10492 && arg0 != null ? arg0.field1737 : "";
   }

   @deob.ObfuscatedName("fr.az(Lko;I)V")
   public static void method6489(class597 arg0) {
      class987.field10491.method8386(arg0);
   }

   @deob.ObfuscatedName("fq.as(Lra;IIIIIIB)V")
   public static void method6477(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      arg0.method11524(arg1, arg2, arg3, arg4, arg5);
      arg0.method11524(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6);
      arg0.method11505(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6);
   }

   @deob.ObfuscatedName("j.bm(Lahi;ZI)V")
   public static void method7468(class200 arg0, boolean arg1) {
      if (class987.field10501 < 406) {
         class915 var2 = arg0.field1312;
         String var3 = arg0.field1302;
         if (var2.field9319 != null) {
            var2 = var2.method15778(field10637);
            if (var2 == null) {
               return;
            }

            var3 = var2.field9282;
         }

         if (var2.field9308) {
            if (arg0.field1304 != 0) {
               String var4 = client.field2584 == class801.field7298 ? class881.field9017.method15374(field243) : class881.field8940.method15374(field243);
               var3 = var3 + class987.method14590(arg0.field1304, field5701.field1382) + class582.field5307 + var4 + arg0.field1304 + class582.field5308;
            }

            if (client.field2588 && !arg1) {
               class923 var5 = field3131 != -1 ? field5946.method15930(field3131) : null;
               if ((field9110 & 2) != 0 && (var5 == null || var2.method15776(field3131, var5.field9388) != var5.field9388)) {
                  class987.method15520(client.field2591, client.field2592 + " " + class582.field5309 + " " + class582.method7399(16776960) + var3, field6160, 8, -1, (long)arg0.field12, 0, 0, true, false, (long)arg0.field12, false);
               }
            }

            if (!arg1) {
               String[] var6 = var2.field9299;
               if (client.field2600) {
                  var6 = client.method15055(var6);
               }

               if (var6 != null) {
                  for(int var7 = var6.length - 1; var7 >= 0; --var7) {
                     if (var6[var7] != null && (var2.field9340 == 0 || !var6[var7].equalsIgnoreCase(class881.field9010.method15374(field243)) && !var6[var7].equalsIgnoreCase(class881.field9009.method15374(field243)))) {
                        short var8 = 0;
                        int var9 = client.field2586;
                        if (var7 == 0) {
                           var8 = 9;
                        }

                        if (var7 == 1) {
                           var8 = 10;
                        }

                        if (var7 == 2) {
                           var8 = 11;
                        }

                        if (var7 == 3) {
                           var8 = 12;
                        }

                        if (var7 == 4) {
                           var8 = 13;
                        }

                        if (var7 == 5) {
                           var8 = 1003;
                        }

                        int var10 = var2.method15799(var7);
                        if (var10 != -1) {
                           var9 = var10;
                        }

                        class987.method15520(var6[var7], class582.method7399(16776960) + var3, var6[var7].equalsIgnoreCase(class881.field9010.method15374(field243)) ? var2.field9284 : var9, var8, -1, (long)arg0.field12, 0, 0, true, false, (long)arg0.field12, false);
                     }
                  }

                  if (var2.field9340 == 1) {
                     for(int var11 = 0; var11 < var6.length; ++var11) {
                        if (var6[var11] != null && (var6[var11].equalsIgnoreCase(class881.field9010.method15374(field243)) || var6[var11].equalsIgnoreCase(class881.field9009.method15374(field243)))) {
                           short var12 = 0;
                           if (arg0.field1304 > field5701.field1382) {
                              var12 = 2000;
                           }

                           short var13 = 0;
                           int var14 = client.field2586;
                           if (var11 == 0) {
                              var13 = 9;
                           }

                           if (var11 == 1) {
                              var13 = 10;
                           }

                           if (var11 == 2) {
                              var13 = 11;
                           }

                           if (var11 == 3) {
                              var13 = 12;
                           }

                           if (var11 == 4) {
                              var13 = 13;
                           }

                           if (var11 == 5) {
                              var13 = 1003;
                           }

                           if (var13 != 0) {
                              var13 += var12;
                           }

                           int var15 = var2.method15799(var11);
                           if (var15 != -1) {
                              var14 = var15;
                           }

                           class987.method15520(var6[var11], class582.method7399(16776960) + var3, var6[var11].equalsIgnoreCase(class881.field9010.method15374(field243)) ? var2.field9284 : var14, var13, -1, (long)arg0.field12, 0, 0, true, false, (long)arg0.field12, false);
                        }
                     }
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("afy.du(II)Z")
   public static boolean method2265(int arg0) {
      return arg0 == 12 || arg0 == 2 || arg0 == 10;
   }

   @deob.ObfuscatedName("ll.ei(I)Lae;")
   public static class110 method8951() {
      return client.method7373(client.field2410) ? client.field2462 : client.field2463;
   }

   @deob.ObfuscatedName("d.fd(I)V")
   public static final void method5340() {
      class299.method10325(field8847);
      if (client.field2545 != field1977) {
         client.method15057();
      }

   }

   @deob.ObfuscatedName("my.gc(B)V")
   public static final void method9678() {
      for(int var0 = 0; var0 < 5; ++var0) {
         client.field2531[var0] = false;
      }

      client.field2521 = -1;
      client.field2698 = -1;
      field2957 = 0;
      field10584 = 0;
      field5998 = 6;
      field6637 = -1;
      field5929 = -1;
      client.field2673 = client.field2418;
      field6047 = field337;
      field2763 = field6719;
      field6369 = field3115;
      field5754 = field4218;
      field4337 = field7098;
   }

   @deob.ObfuscatedName("qh.f(Lrs;I)V")
   public static final void method11177(class790 arg0) {
      arg0.field7204 -= 2;
      if (arg0.field7203[arg0.field7204] == arg0.field7203[arg0.field7204 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("ui.af(Lrs;B)V")
   public static final void method15188(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7203[++arg0.field7204 - 1] = ((class200)arg0.field7216).field1306.method4447(var1);
   }

   @deob.ObfuscatedName("on.ah(Lrs;B)V")
   public static final void method10341(class790 arg0) {
      if (arg0.field7209 != 0) {
         class787 var1 = arg0.field7210[--arg0.field7209];
         arg0.field7225 = var1.field7189;
         arg0.field7201 = arg0.field7225.field1641;
         arg0.field7222 = arg0.field7225.field1642;
         arg0.field7206 = var1.field7188;
         arg0.field7211 = var1.field7190;
         arg0.field7199 = var1.field7187;
         arg0.field7200 = var1.field7191;
      }
   }

   @deob.ObfuscatedName("jt.ao(Lrs;I)V")
   public static final void method8011(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = arg0.field7199[arg0.field7222[arg0.field7206]];
   }

   @deob.ObfuscatedName("nx.ab(Lrs;B)V")
   public static final void method10058(class790 arg0) {
      arg0.field7199[arg0.field7222[arg0.field7206]] = arg0.field7226[--arg0.field7205];
   }

   @deob.ObfuscatedName("aaq.br(Lrs;B)V")
   public static final void method398(class790 arg0) {
      arg0.field7207[++arg0.field7208 - 1] = arg0.field7200[arg0.field7222[arg0.field7206]];
   }

   @deob.ObfuscatedName("va.bz(Lrs;B)V")
   public static final void method15371(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      String var2 = arg0.field7214.method6831(client.field2584.field7304 << 16 | var1);
      String var3;
      if (var2 == null) {
         var3 = "";
      } else {
         var3 = var2;
      }

      arg0.field7226[++arg0.field7205 - 1] = var3;
   }

   @deob.ObfuscatedName("wk.go(Laab;I)V")
   public static final void method15828(class4 arg0) {
      class183 var1 = arg0.field35;
      if (var1.method14691() && var1.method14711(1) && var1.method14707()) {
         if (var1.field1200) {
            var1.method14697(arg0.method101().method10965(), false, true);
            var1.field1200 = var1.method14691();
         }

         var1.method14761();
      }

      for(int var2 = 0; var2 < arg0.field37.length; ++var2) {
         if (arg0.field37[var2].field2770 != -1) {
            class836 var3 = arg0.field37[var2].field2774;
            if (var3.method14749()) {
               class815 var4 = field3758.method14209(arg0.field37[var2].field2770);
               class806 var5 = var3.method14698();
               if (var4.field8418) {
                  if (var5.field8368 == 3) {
                     if (arg0.field65 > 0 && arg0.field40 <= client.field2418 && arg0.field43 < client.field2418) {
                        var3.method14694(-1);
                        arg0.field37[var2].field2770 = -1;
                        continue;
                     }
                  } else if (var5.field8368 == 1 && arg0.field65 > 0 && arg0.field40 <= client.field2418 && arg0.field43 < client.field2418) {
                     continue;
                  }
               }
            }

            if (var3.method14711(1) && var3.method14707()) {
               var3.method14694(-1);
               arg0.field37[var2].field2770 = -1;
            }
         }
      }

      class836 var6 = arg0.field38;
      if (var6.method14691()) {
         label84: {
            class806 var7 = var6.method14698();
            if (var7.field8368 == 3) {
               if (arg0.field65 > 0 && arg0.field40 <= client.field2418 && arg0.field43 < client.field2418) {
                  arg0.field41 = null;
                  var6.method14694(-1);
                  break label84;
               }
            } else if (var7.field8368 == 1) {
               if (arg0.field65 > 0 && arg0.field40 <= client.field2418 && arg0.field43 < client.field2418) {
                  var6.method14702(1);
                  break label84;
               }

               var6.method14702(0);
            }

            if (var6.method14711(1) && var6.method14707()) {
               arg0.field41 = null;
               var6.method14694(-1);
            }
         }
      }

      for(int var8 = 0; var8 < arg0.field31.length; ++var8) {
         class278 var9 = arg0.field31[var8];
         if (var9 != null) {
            if (var9.field1829 > 0) {
               --var9.field1829;
            } else if (var9.method14711(1) && var9.method14707()) {
               arg0.field31[var8] = null;
            }
         }
      }

   }

   @deob.ObfuscatedName("agf.bu(Lrs;I)V")
   public static final void method2323(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class778 var3;
      if (arg0.field7219) {
         var3 = arg0.field7212;
      } else {
         var3 = arg0.field7223;
      }

      arg0.field7203[++arg0.field7204 - 1] = var2 != -1 && var3.method11663(var1, var2) ? 1 : 0;
   }

   @deob.ObfuscatedName("adl.cg(Lrs;I)V")
   public static final void method1321(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method10342(var2, var3, arg0);
   }

   @deob.ObfuscatedName("my.cl(Lrs;B)V")
   public static final void method9675(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method585(var2, var3, arg0);
   }

   @deob.ObfuscatedName("df.do(Lem;Leo;Lrs;I)V")
   public static final void method5383(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3448 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method9854(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("az.gg(IIIIZI)V")
   public static final void method4098(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      if (arg2 < 1) {
         arg2 = 1;
      }

      if (arg3 < 1) {
         arg3 = 1;
      }

      int var5 = arg3 - 334;
      if (var5 < 0) {
         var5 = 0;
      } else if (var5 > 100) {
         var5 = 100;
      }

      int var6 = (client.field2664 - client.field2559) * var5 / 100 + client.field2559;
      int var7 = arg3 * var6 * 512 / (arg2 * 334);
      if (var7 < client.field2687) {
         short var8 = client.field2687;
         var6 = arg2 * var8 * 334 / (arg3 * 512);
         if (var6 > client.field2686) {
            var6 = client.field2686;
            int var9 = arg3 * var6 * 512 / (var8 * 334);
            int var10 = (arg2 - var9) / 2;
            if (arg4) {
               field8847.method7508();
               field8847.method11524(arg0, arg1, var10, arg3, -16777216);
               field8847.method11524(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
            }

            arg0 += var10;
            arg2 -= var10 * 2;
         }
      } else if (var7 > client.field2688) {
         short var11 = client.field2688;
         var6 = arg2 * var11 * 334 / (arg3 * 512);
         if (var6 < client.field2629) {
            var6 = client.field2629;
            int var12 = arg2 * var11 * 334 / (var6 * 512);
            int var13 = (arg3 - var12) / 2;
            if (arg4) {
               field8847.method7508();
               field8847.method11524(arg0, arg1, arg2, var13, -16777216);
               field8847.method11524(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
            }

            arg1 += var13;
            arg3 -= var13 * 2;
         }
      }

      client.field2693 = arg3 * var6 / 334;
      client.field2689 = arg0;
      client.field2690 = arg1;
      client.field2431 = (short)arg2;
      client.field2692 = (short)arg3;
   }

   @deob.ObfuscatedName("nm.di(Lem;Leo;Lrs;I)V")
   public static final void method9882(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3534 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("ie.dx(Lrs;B)V")
   public static final void method7327(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      method9882(var2, var3, arg0);
   }

   @deob.ObfuscatedName("aah.es(Lem;Leo;Lrs;I)V")
   public static final void method273(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204];
      if (arg0.field3549 != var3) {
         if (var3 != -1) {
            if (arg0.field3550 == null) {
               arg0.field3550 = new class169();
            }

            arg0.field3550.method14694(var3);
         } else {
            arg0.field3550 = null;
         }

         arg0.field3549 = var3;
         client.method7309(arg0);
      }

      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method1520(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("ax.em(Lem;Leo;Lrs;B)V")
   public static final void method4085(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3468 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method11696(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("adv.et(Lrs;I)V")
   public static final void method1391(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method4085(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qm.ev(Lrs;B)V")
   public static final void method11263(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method15954(var2, var3, arg0);
   }

   @deob.ObfuscatedName("acz.eb(Lrs;I)V")
   public static final void method1137(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class783.method15954(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ni.eg(Lrs;I)V")
   public static final void method9852(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method5677(var2, var3, arg0);
   }

   @deob.ObfuscatedName("wj.fl(Lrs;I)V")
   public static final void method15825(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method3324(var2, var3, arg0);
   }

   @deob.ObfuscatedName("re.ff(Lrs;I)V")
   public static final void method11653(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method15365(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ew.fd(Lrs;I)V")
   public static final void method6113(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method14449(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ra.gp(Lrs;I)V")
   public static final void method11582(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method8679(var2, var3, arg0);
   }

   @deob.ObfuscatedName("jc.hu(Lem;Leo;Lrs;I)V")
   public static final void method7904(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3441 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method10179(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("sz.hr(Lrs;I)V")
   public static final void method14546(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      class783.method17100(var2, var3, false, 2, arg0);
   }

   @deob.ObfuscatedName("jh.hh(Lrs;I)V")
   public static final void method7943(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class783.method17100(var2, var3, true, 2, arg0);
   }

   @deob.ObfuscatedName("lg.ik(Lem;Leo;Lrs;I)V")
   public static final void method8890(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 4;
      arg0.field3498 = arg2.field7203[arg2.field7204];
      arg0.field3444 = arg2.field7203[arg2.field7204 + 1];
      if (arg2.field7203[arg2.field7204 + 2] == 1) {
         arg0.field3442 = 9;
      } else {
         arg0.field3442 = 8;
      }

      if (arg2.field7203[arg2.field7204 + 3] == 1) {
         arg0.field3541 = true;
      } else {
         arg0.field3541 = false;
      }

      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7423(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("afh.iq(Lrs;B)V")
   public static final void method2115(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class783.method6556(var2, var3, arg0);
   }

   @deob.ObfuscatedName("tz.iu(Lem;Leo;Lrs;I)V")
   public static final void method15058(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204];
      if (class425.field3418 == var3 || class425.field3507 == var3 || class425.field3377 == var3) {
         arg0.field3495 = var3;
      }
   }

   @deob.ObfuscatedName("sx.ij(Lem;Leo;Lrs;I)V")
   public static final void method14521(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3493 = arg2.field7203[--arg2.field7204];
   }

   @deob.ObfuscatedName("rh.jc(Lrs;B)V")
   public static final void method11691(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method14521(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lo.jq(Lem;Leo;Lrs;I)V")
   public static final void method8988(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3488 = null;
   }

   @deob.ObfuscatedName("rl.ji(Lem;Leo;Lrs;I)V")
   public static final void method14036(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204];
      int var4 = arg2.field7203[--arg2.field7204];
      if (var4 >= 1 && var4 <= 10) {
         arg0.method5845(var4 - 1, var3);
      }

   }

   @deob.ObfuscatedName("nn.jv(Lrs;B)V")
   public static final void method9950(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = field844[var1 >> 16];
      method14036(var2, var3, arg0);
   }

   @deob.ObfuscatedName("du.jn(Lem;Leo;Lrs;I)V")
   public static final void method5534(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3564 = (String)arg2.field7226[--arg2.field7205];
   }

   @deob.ObfuscatedName("un.ku(Lem;[B[BLrs;I)V")
   public static final void method15215(class425 arg0, byte[] arg1, byte[] arg2, class790 arg3) {
      int var4 = arg3.field7203[--arg3.field7204] - 1;
      if (var4 >= 0 && var4 <= 9) {
         class783.method15816(arg0, var4, arg1, arg2, arg3);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("z.ka(Lrs;B)V")
   public static final void method17037(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7204 -= 10;
      byte[] var3 = null;
      byte[] var4 = null;

      int var5;
      for(var5 = 0; var5 < 10 && arg0.field7203[arg0.field7204 + var5] >= 0; var5 += 2) {
      }

      if (var5 > 0) {
         var3 = new byte[var5 / 2];
         var4 = new byte[var5 / 2];

         for(var5 -= 2; var5 >= 0; var5 -= 2) {
            var3[var5 / 2] = (byte)arg0.field7203[arg0.field7204 + var5];
            var4[var5 / 2] = (byte)arg0.field7203[arg0.field7204 + var5 + 1];
         }
      }

      method15215(var2, var3, var4, arg0);
   }

   @deob.ObfuscatedName("my.kn(Lem;Leo;Lrs;B)V")
   public static final void method9677(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3433 = arg2.field7203[--arg2.field7204];
   }

   @deob.ObfuscatedName("pm.hs(IIIII)V")
   public static final void method10792(int arg0, int arg1, int arg2, int arg3) {
      int var4 = client.field2537;
      int var5 = client.field2504;
      if (client.field2517 == 1) {
         class383 var6 = field3594[client.field2539 / 100];
         var6.method5221(var4 - 8, var5 - 8);
      }

      if (client.field2517 == 2) {
         class383 var7 = field3594[client.field2539 / 100 + 4];
         var7.method5221(var4 - 8, var5 - 8);
      }

   }

   @deob.ObfuscatedName("akz.kz(Lem;Leo;Lrs;I)V")
   public static final void method3815(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (class783.method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3469 = class783.method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("acu.lr(Lrs;I)V")
   public static final void method1101(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class783.method10868(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ec.mb(Lrs;B)V")
   public static final void method5682(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class783.method16040(var2, var3, arg0);
   }

   @deob.ObfuscatedName("of.mq(Lem;Leo;Lrs;I)V")
   public static final void method10199(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      int[] var4 = class783.method6858(var3, arg2);
      if (var4 != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3514 = class783.method1549(var3, arg2);
      arg0.field3515 = var4;
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("dj.mm(Lem;Leo;Lrs;S)V")
   public static final void method5404(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (class783.method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3526 = class783.method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("rn.md(Lrs;I)V")
   public static final void method14059(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5404(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fn.ox(Lrs;B)V")
   public static final void method6443(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class783.method6125(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lk.ow(Lrs;I)V")
   public static final void method8942(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class783.method15506(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gl.pu(Lrs;I)V")
   public static final void method6740(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3447;
   }

   @deob.ObfuscatedName("tw.qj(Lrs;I)V")
   public static final void method14956(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3539;
   }

   @deob.ObfuscatedName("eq.qu(Lrs;I)V")
   public static final void method5938(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      if (var2.field3539 != -1) {
         arg0.field7203[++arg0.field7204 - 1] = var2.field3540;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("y.qt(Lem;Lrs;B)V")
   public static final void method16062(class425 arg0, class790 arg1) {
      class883 var2 = arg0.method5817(field10616, client.field2430);
      int var3 = arg1.field7203[--arg1.field7204];
      int var4 = arg1.field7203[--arg1.field7204];
      int var5 = var2.method15392(arg0.field3470, arg0.field3405, arg0.field3471, var4, var3, field6914);
      arg1.field7203[++arg1.field7204 - 1] = var5;
   }

   @deob.ObfuscatedName("re.ql(Lrs;B)V")
   public static final void method11647(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method16062(var2, arg0);
   }

   @deob.ObfuscatedName("abf.qc(Lrs;B)V")
   public static final void method578(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class783.method7441(var2, arg0);
   }

   @deob.ObfuscatedName("kq.qf(Lem;Lrs;I)V")
   public static final void method8530(class425 arg0, class790 arg1) {
      int var2 = arg1.field7203[--arg1.field7204];
      int var3 = arg1.field7203[--arg1.field7204] - 1;
      if (arg0.field3442 != 6) {
         throw new RuntimeException("");
      } else {
         class915 var4 = field93.method15857(arg0.field3498);
         if (arg0.field3566 == null) {
            arg0.field3566 = new class921(var4, true);
         }

         arg0.field3566.field9378 = class783.method5793();
         if (var3 >= 0 && var3 < var4.field9324.length) {
            arg0.field3566.field9380[var3] = var2;
            client.method7309(arg0);
         } else {
            throw new RuntimeException("" + var3);
         }
      }
   }

   @deob.ObfuscatedName("jd.rc(Lrs;B)V")
   public static final void method7915(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3462;
   }

   @deob.ObfuscatedName("zq.sh(Lrs;I)V")
   public static final void method17091(class790 arg0) {
      class425 var1 = class425.method11190(arg0.field7203[--arg0.field7204]);
      arg0.field7203[++arg0.field7204 - 1] = var1.field3539;
   }

   @deob.ObfuscatedName("mf.sv(Lrs;B)V")
   public static final void method9262(class790 arg0) {
      --arg0.field7204;
      int var1 = arg0.field7203[arg0.field7204];
      class118 var2 = (class118)client.field2594.method15322((long)var1);
      if (var2 != null && var2.field910 == 3) {
         method689(var2, true, true);
      }

   }

   @deob.ObfuscatedName("ms.tb(Lrs;B)V")
   public static final void method9462(class790 arg0) {
      arg0.field7204 -= 5;
      class677.method6230(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2], arg0.field7203[arg0.field7204 + 3], false, arg0.field7203[arg0.field7204 + 4]);
   }

   @deob.ObfuscatedName("t.tc(Lrs;I)V")
   public static final void method14584(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method2000(var1, var2, false);
   }

   @deob.ObfuscatedName("jt.tp(Lrs;I)V")
   public static final void method8013(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = field9258.method15756(var1).field928;
   }

   @deob.ObfuscatedName("tn.td(Lrs;I)V")
   public static final void method14811(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = var1 & 16383;
   }

   @deob.ObfuscatedName("mk.ub(Lrs;I)V")
   public static final void method9338(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method8037(var1, var2, true);
   }

   @deob.ObfuscatedName("aaq.uq(Lrs;I)V")
   public static final void method396(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = field6857 ? 1 : 0;
   }

   @deob.ObfuscatedName("es.wo(Lrs;I)V")
   public static final void method5964(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      int var2 = arg0.field7203[--arg0.field7204];
      client.method14202(var1, var2);
   }

   @deob.ObfuscatedName("pd.wi(Lrs;I)V")
   public static final void method10698(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      client.method9176(var1);
   }

   @deob.ObfuscatedName("t.ww(Lrs;B)V")
   public static final void method14589(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      client.method11492(var1);
   }

   @deob.ObfuscatedName("aep.wc(Lrs;I)V")
   public static final void method1851(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2578 != null && var1 < field6939) {
         arg0.field7203[++arg0.field7204 - 1] = field3105[var1].field1804;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("vr.xf(Lrs;I)V")
   public static final void method15599(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 == 2 && var1 < client.field2694) {
         arg0.field7203[++arg0.field7204 - 1] = client.field2697[var1].field9602 ? 1 : 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("w.yq(Lrs;I)V")
   public static final void method15730(class790 arg0) {
      arg0.field7203[arg0.field7204 - 1] = arg0.field7215.method1140()[arg0.field7203[arg0.field7204 - 1]];
   }

   @deob.ObfuscatedName("abm.yx(Lrs;B)V")
   public static final void method691(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int var2 = client.field2681[var1].method9167();
      arg0.field7203[++arg0.field7204 - 1] = var2 == 5 ? 1 : 0;
   }

   @deob.ObfuscatedName("zs.zp(Lrs;B)V")
   public static final void method17096(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = (int)(Math.random() * (double)var1);
   }

   @deob.ObfuscatedName("av.zu(Lrs;I)V")
   public static final void method4054(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 & var2;
   }

   @deob.ObfuscatedName("qq.zl(Lrs;I)V")
   public static final void method11294(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      int var2 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = var1 + class816.method6109(var2, true);
   }

   @deob.ObfuscatedName("jb.aau(Lrs;I)V")
   public static final void method7896(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      if (arg0.field7203[--arg0.field7204] == 1) {
         arg0.field7226[++arg0.field7205 - 1] = var1;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var2;
      }

   }

   @deob.ObfuscatedName("gl.aab(Lrs;I)V")
   public static final void method6737(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = method15711((char)var1) ? 1 : 0;
   }

   @deob.ObfuscatedName("rw.aal(Lrs;B)V")
   public static final void method14185(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7204 -= 2;
      int var2 = arg0.field7203[arg0.field7204];
      int var3 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1.indexOf(var2, var3);
   }

   @deob.ObfuscatedName("st.abq(Lrs;I)V")
   public static final void method14486(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class923 var3 = field5946.method15930(var2);
      if (var3.method15884()) {
         arg0.field7226[++arg0.field7205 - 1] = field4196.method15540(var1).method15619(var2, var3.field9389);
      } else {
         arg0.field7203[++arg0.field7204 - 1] = field4196.method15540(var1).method15630(var2, var3.field9388);
      }

   }

   @deob.ObfuscatedName("ai.abc(Lrs;I)V")
   public static final void method2953(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      int var2 = arg0.field7203[--arg0.field7204];
      client.method8551(var1, var2 == 1);
      arg0.field7203[++arg0.field7204 - 1] = field6134;
   }

   @deob.ObfuscatedName("oy.abi(Lrs;B)V")
   public static final void method10647(class790 arg0) {
      arg0.field7205 -= 2;
      arg0.field7204 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      int var2 = arg0.field7203[arg0.field7204];
      int var3 = arg0.field7203[arg0.field7204 + 1];
      String var4 = (String)arg0.field7226[arg0.field7205 + 1];
      method8990(var1, var2 == 1, var3, var4);
      arg0.field7203[++arg0.field7204 - 1] = field6134;
   }

   @deob.ObfuscatedName("u.aby(Lrs;B)V")
   public static final void method15063(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (client.field2410 == 15 && !class385.method14262()) {
         if (var1.length() > 20) {
            client.field2703 = -4;
         } else {
            client.field2703 = -1;
            class109 var2 = class109.method15110(ClientProt.CREATE_CHECK_NAME, client.field2462.field832);
            var2.field814.method1568(0);
            int var3 = var2.field814.field935;
            var2.field814.method1577(var1);
            var2.field814.method1664(var2.field814.field935 - var3);
            client.field2462.method1408(var2);
         }
      } else {
         client.field2703 = -5;
      }
   }

   @deob.ObfuscatedName("lp.abx(Lrs;I)V")
   public static final void method9072(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2703;
      if (client.field2703 != -1) {
         client.field2703 = -6;
      }

   }

   @deob.ObfuscatedName("id.acx(Lrs;I)V")
   public static final void method7313(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      String var3 = "";
      if (var2 != null && var2.field3630 != null) {
         var3 = var2.field3630;
      }

      arg0.field7226[++arg0.field7205 - 1] = var3;
   }

   @deob.ObfuscatedName("rv.acf(Lrs;I)V")
   public static final void method14177(class790 arg0) {
      String var1;
      if (field5701 != null && field5701.field1391 != null) {
         var1 = field5701.method2862(true);
      } else {
         var1 = "";
      }

      arg0.field7226[++arg0.field7205 - 1] = var1;
   }

   @deob.ObfuscatedName("cn.acg(Lrs;I)V")
   public static final void method5043(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class267 var3 = field8671.method8893(var1);
      int var4 = var3.field1786[var2];
      arg0.field7203[++arg0.field7204 - 1] = var4;
   }

   @deob.ObfuscatedName("agr.adi(Lrs;I)V")
   public static final void method2442(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = field8671.method8893(var1).field1787[var2];
   }

   @deob.ObfuscatedName("acf.aeq(Lrs;I)V")
   public static final void method959(class790 arg0) {
      class252 var1 = class697.method10207(arg0.field7203[--arg0.field7204]);
      if (var1 != null && var1.field1660 != null) {
         arg0.field7226[++arg0.field7205 - 1] = var1.field1660;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("am.aej(Lrs;I)V")
   public static final void method3946(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class846 var3 = class697.method10208(var1 >> 14 & 16383, var1 & 16383);
      boolean var4 = false;

      for(class252 var5 = (class252)var3.method14944(); var5 != null; var5 = (class252)var3.method14929()) {
         if (var5.field1666 == var2) {
            var4 = true;
            break;
         }
      }

      if (var4) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("pq.aeg(Lrs;B)V")
   public static final void method10849(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class131.method1010(var1 >> 14 & 16383, var1 & 16383);
   }

   @deob.ObfuscatedName("sq.aer(Lrs;I)V")
   public static final void method14402(class790 arg0) {
      class131.method6905(arg0.field7203[--arg0.field7204]);
   }

   @deob.ObfuscatedName("ey.afx(Lrs;I)V")
   public static final void method6127(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 >= 1 && var1 <= 2) {
         client.method10176(var1, -1, -1, false);
      }
   }

   @deob.ObfuscatedName("vg.aff(Lrs;S)V")
   public static final void method15456(class790 arg0) {
      arg0.field7205 -= 2;
      class783.method663((String)arg0.field7226[arg0.field7205], (String)arg0.field7226[arg0.field7205 + 1], "", arg0.field7203[--arg0.field7204] == 1, false);
   }

   @deob.ObfuscatedName("jg.afk(Lrs;I)V")
   public static final void method7937(class790 arg0) {
      arg0.field7204 -= 2;
      field8747[arg0.field7203[arg0.field7204]] = (short)method9136(arg0.field7203[arg0.field7204 + 1]);
      field4196.method15529();
      field4196.method15528();
      field93.method15848();
      client.method208();
   }

   @deob.ObfuscatedName("ps.agz(Lrs;I)V")
   public static final void method10875(class790 arg0) {
      String var1 = "";
      if (field991 != null) {
         Transferable var2 = field991.getContents((Object)null);
         if (var2 != null) {
            try {
               var1 = (String)var2.getTransferData(DataFlavor.stringFlavor);
               if (var1 == null) {
                  var1 = "";
               }
            } catch (Exception var4) {
            }
         }
      }

      arg0.field7226[++arg0.field7205 - 1] = var1;
   }

   @deob.ObfuscatedName("oh.jy(ZB)V")
   public static final void method10286(boolean arg0) {
      client.method11293(client.field2593, field6104, field6354, arg0);
   }

   @deob.ObfuscatedName("rh.agm(Lrs;I)V")
   public static final void method11695(class790 arg0) {
      boolean var1 = false;
      String var2 = "";
      if (arg0.field7221 != null && arg0.field7221.method4069()) {
         File var3 = arg0.field7221.method4070();
         if (var3 != null) {
            var2 = var3.getPath();
            if (var2 == null) {
               var2 = "";
            }
         }

         var1 = true;
         arg0.field7221 = null;
      }

      arg0.field7203[++arg0.field7204 - 1] = var1 ? 1 : 0;
      arg0.field7226[++arg0.field7205 - 1] = var2;
   }

   @deob.ObfuscatedName("fy.agq(Lrs;I)V")
   public static final void method6541(class790 arg0) {
      client.method7969();
   }

   @deob.ObfuscatedName("qb.ahe(Lrs;I)V")
   public static final void method11052(class790 arg0) {
      if (field6895.method6320() != class444.field3674) {
         throw new RuntimeException();
      } else {
         class13 var1 = (class13)field6895.method6316();
         var1.method348(field7305, -1);
      }
   }

   @deob.ObfuscatedName("nu.ahb(Lrs;I)V")
   public static final void method10029(class790 arg0) {
      field6895.method6312();
   }

   @deob.ObfuscatedName("dg.ail(Lrs;B)V")
   public static final void method5391(class790 arg0) throws class168 {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class584 var4 = class584.method8136((float)var1, (float)var2, (float)var3);
      field6895.method6301(var4);
      var4.method8201();
   }

   @deob.ObfuscatedName("dl.aij(Lrs;I)V")
   public static final void method5488(class790 arg0) {
      float var1 = class603.method8577(arg0.field7203[--arg0.field7204]);
      class316 var2 = new class316(field6895.method246(), var1);
      field6895.method6309(var2);
      arg0.field7203[++arg0.field7204 - 1] = var2.field1735;
   }

   @deob.ObfuscatedName("wg.aix(Lrs;B)V")
   public static final void method15765(class790 arg0) {
      if (!class385.method14262()) {
         class385.method15553();
      }

   }

   @deob.ObfuscatedName("jc.ajg(Lrs;I)V")
   public static final void method7902(class790 arg0) {
      if (client.field2410 == 3) {
         class109 var1 = class109.method15110(ClientProt.UID_PASSPORT_RESEND_REQUEST, client.field2462.field832);
         client.field2462.method1408(var1);
      }
   }

   @deob.ObfuscatedName("u.ajj(Lrs;I)V")
   public static final void method15065(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class385.method15760(var1);
   }

   @deob.ObfuscatedName("aap.kk(Lem;B)V")
   public static void method389(class425 arg0) {
      if (arg0.field3402 == 5 && arg0.field3539 != -1) {
         class326.method15866(field8847, arg0);
      }

   }

   @deob.ObfuscatedName("jr.akh(Lrs;I)V")
   public static final void method8004(class790 arg0) {
      field9361.method1857(field9361.field972, arg0.field7203[--arg0.field7204] == 1 ? 1 : 0);
      class29.method7336();
      client.method7899();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("wh.akn(Lrs;B)V")
   public static final void method15768(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int var2 = field9361.field988.method2319();
      if (var1 != var2 && class677.field6157 == class677.field6149) {
         if (!client.method6612(client.field2410)) {
            if (var2 == 0) {
               class417.method15349(field6467, class677.field6149, 0, var1, false);
               class677.method8735();
               class677.field6153 = false;
            } else if (var1 == 0) {
               method1797();
               class677.field6153 = false;
            } else {
               class417.method9121(var1);
            }
         }

         field9361.method1857(field9361.field988, var1);
         class29.method7336();
         client.field2419 = false;
      }

   }

   @deob.ObfuscatedName("ds.alz(Lrs;I)V")
   public static final void method5518(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = field9361.field958.method2214() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("lk.als(Lrs;B)V")
   public static final void method8946(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = field9361.field951.method1448() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("re.amq(Lrs;I)V")
   public static final void method11648(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = field9361.field969.method2319();
   }

   @deob.ObfuscatedName("gd.amv(Lrs;B)V")
   public static final void method6613(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = field9361.field988.method2319();
   }

   @deob.ObfuscatedName("abm.kt(Laeh;ZZB)V")
   public static final void method689(class118 arg0, boolean arg1, boolean arg2) {
      int var3 = arg0.field911;
      int var4 = (int)arg0.field6137;
      arg0.method9864();
      if (arg1) {
         class425.method15487(var3);
      }

      client.method10309(var3);
      class425 var5 = class425.method11190(var4);
      if (var5 != null) {
         client.method7309(var5);
      }

      class987.method4005();
      if (!arg2 && client.field2593 != -1) {
         client.method10317(client.field2593, 1);
      }

      class874 var6 = new class874(client.field2594);

      for(class118 var7 = (class118)var6.method15293(); var7 != null; var7 = (class118)var6.next()) {
         if (!var7.method9863()) {
            var7 = (class118)var6.method15293();
            if (var7 == null) {
               break;
            }
         }

         if (var7.field910 == 3) {
            int var8 = (int)var7.field6137;
            if (var8 >>> 16 == var3) {
               method689(var7, true, arg2);
            }
         }
      }

   }

   @deob.ObfuscatedName("rk.amp(Lrs;I)V")
   public static final void method11733(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2683;
      arg0.field7203[++arg0.field7204 - 1] = client.field2627;
   }

   @deob.ObfuscatedName("px.amn(Lrs;I)V")
   public static final void method10953(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      long var4 = method8015(0, 0, 12, var1, var2, var3);
      int var6 = class902.method10985(var4);
      if (var3 < 1970) {
         --var6;
      }

      arg0.field7203[++arg0.field7204 - 1] = var6;
   }

   @deob.ObfuscatedName("vs.kq(Ljava/lang/String;I)V")
   public static final void method15600(String arg0) {
      if (field3105 != null) {
         class110 var1 = method8951();
         class109 var2 = class109.method15110(ClientProt.CLAN_KICK_USER, var1.field832);
         var2.field814.method1568(class124.method1229(arg0));
         var2.field814.method1577(arg0);
         var1.method1408(var2);
      }
   }

   @deob.ObfuscatedName("ra.amk(Lrs;I)V")
   public static final void method11578(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int[] var2 = class902.method14664(var1);
      class803.method14267(var2, 0, arg0.field7203, arg0.field7204, 3);
      arg0.field7204 += 3;
   }

   @deob.ObfuscatedName("r.kz(Ljava/lang/String;I)V")
   public static final void method11491(String arg0) {
      if (!arg0.equals("")) {
         class110 var1 = method8951();
         class109 var2 = class109.method15110(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var1.field832);
         var2.field814.method1568(class124.method1229(arg0));
         var2.field814.method1577(arg0);
         var1.method1408(var2);
      }
   }

   @deob.ObfuscatedName("sr.anc(Lrs;S)V")
   public static final void method14448(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      String var2 = (String)arg0.field7226[--arg0.field7205];
      if (client.field2410 == 15 && !class385.method14262()) {
         arg0.field7203[++arg0.field7204 - 1] = class861.method9127(var1, var2) ? 1 : 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ug.lc(Ljava/lang/String;ZB)V")
   public static final void method15142(String arg0, boolean arg1) {
      if (arg0 != null) {
         if (client.field2699 >= 100) {
            class419.method10919(4, class881.field8922.method15374(field243));
         } else {
            String var2 = class930.method8532(arg0);
            if (var2 != null) {
               for(int var3 = 0; var3 < client.field2699; ++var3) {
                  class906 var4 = client.field2701[var3];
                  String var5 = class930.method8532(var4.field9244);
                  if (var5 != null && var5.equals(var2)) {
                     class419.method10919(4, arg0 + class881.field9029.method15374(field243));
                     return;
                  }

                  if (var4.field9245 != null) {
                     String var6 = class930.method8532(var4.field9245);
                     if (var6 != null && var6.equals(var2)) {
                        class419.method10919(4, arg0 + class881.field9029.method15374(field243));
                        return;
                     }
                  }
               }

               for(int var7 = 0; var7 < client.field2694; ++var7) {
                  class960 var8 = client.field2697[var7];
                  String var9 = class930.method8532(var8.field9601);
                  if (var9 != null && var9.equals(var2)) {
                     class419.method10919(4, class881.field9035.method15374(field243) + arg0 + class881.field9036.method15374(field243));
                     return;
                  }

                  if (var8.field9599 != null) {
                     String var10 = class930.method8532(var8.field9599);
                     if (var10 != null && var10.equals(var2)) {
                        class419.method10919(4, class881.field9035.method15374(field243) + arg0 + class881.field9036.method15374(field243));
                        return;
                     }
                  }
               }

               if (class930.method8532(field5701.field1381).equals(var2)) {
                  class419.method10919(4, class881.field9031.method15374(field243));
               } else {
                  class110 var11 = method8951();
                  class109 var12 = class109.method15110(ClientProt.IGNORELIST_ADD, var11.field832);
                  var12.field814.method1568(class124.method1229(arg0) + 1);
                  var12.field814.method1577(arg0);
                  var12.field814.method1568(arg1 ? 1 : 0);
                  var11.method1408(var12);
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("pq.ans(Lrs;B)V")
   public static final void method10858(class790 arg0) {
      class861.method5744();
   }

   @deob.ObfuscatedName("ix.ank(Lrs;B)V")
   public static final void method7451(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(4, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("lo.lf(Ljava/lang/String;ZILjava/lang/String;B)V")
   private static void method8990(String arg0, boolean arg1, int arg2, String arg3) {
      method15951(arg0, arg1, arg2, -1, arg3, true);
   }

   @deob.ObfuscatedName("aif.lj(Ljava/lang/String;ZIII)V")
   public static void method3115(String arg0, boolean arg1, int arg2, int arg3) {
      method15951(arg0, arg1, arg2, arg3, (String)null, false);
   }

   @deob.ObfuscatedName("wx.la(Ljava/lang/String;ZIILjava/lang/String;ZI)V")
   private static void method15951(String arg0, boolean arg1, int arg2, int arg3, String arg4, boolean arg5) {
      String var6 = arg0.toLowerCase();
      short[] var7 = new short[16];
      int var8 = -1;
      String var9 = null;
      if (arg2 != -1) {
         class923 var10 = field5946.method15930(arg2);
         if (var10 == null || var10.method15884() != arg5) {
            return;
         }

         if (var10.method15884()) {
            var9 = var10.field9389;
         } else {
            var8 = var10.field9388;
         }
      }

      int var11 = 0;

      for(int var12 = 0; var12 < field4196.field9087; ++var12) {
         class899 var13 = field4196.method15540(var12);
         if ((!arg1 || var13.field9182) && var13.field9173 == -1 && var13.field9175 == -1 && var13.field9188 == -1 && var13.field9168 == 0 && var13.field9158.toLowerCase().indexOf(var6) != -1) {
            if (arg2 != -1) {
               if (arg5) {
                  if (!arg4.equals(var13.method15619(arg2, var9))) {
                     continue;
                  }
               } else if (arg3 != var13.method15630(arg2, var8)) {
                  continue;
               }
            }

            if (var11 >= 250) {
               field6134 = -1;
               field3776 = null;
               return;
            }

            if (var11 >= var7.length) {
               short[] var14 = new short[var7.length * 2];

               for(int var15 = 0; var15 < var11; ++var15) {
                  var14[var15] = var7[var15];
               }

               var7 = var14;
            }

            var7[var11++] = (short)var12;
         }
      }

      field3776 = var7;
      field5278 = 0;
      field6134 = var11;
      String[] var16 = new String[field6134];

      for(int var17 = 0; var17 < field6134; ++var17) {
         var16[var17] = field4196.method15540(var7[var17]).field9158;
      }

      class781.method6468(var16, field3776);
   }

   @deob.ObfuscatedName("az.ly(B)V")
   public static void method4099() {
      if (class671.method11178() != class686.field6209) {
         try {
            String var0 = field6978.getParameter(class563.field4929.field4944);
            int var1 = (int)(class431.method2169() / 86400000L) - 11745;
            String var2 = "usrdob=" + var1 + "; version=1; path=/; domain=" + var0;
            class855.method15071(field6978, "document.cookie=\"" + var2 + "\"");
         } catch (Throwable var4) {
         }

      }
   }

   @deob.ObfuscatedName("uv.me(I)V")
   public static void method15303() {
      if (class819.field8433 != field4896) {
         class573.field5192.method7991();
      }
   }

   @deob.ObfuscatedName("t.apt(Lrs;I)V")
   public static final void method14586(class790 arg0) {
      if (field2388 == 2) {
         class29.field239 = true;
      } else if (field2388 == 1) {
         class29.field228 = true;
      } else if (field2388 == 3) {
         class29.field236 = true;
      }

   }

   @deob.ObfuscatedName("ai.aqr(Lrs;I)V")
   public static final void method2948(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = field9361.field965.method1446(var1);
   }

   @deob.ObfuscatedName("jd.aqw(Lrs;I)V")
   public static final void method7917(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = field9361.field986.method1446(var1);
   }

   @deob.ObfuscatedName("mf.aqx(Lrs;I)V")
   public static final void method9264(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = field9361.field963.method1446(var1);
   }

   @deob.ObfuscatedName("x.aqz(Lrs;B)V")
   public static final void method15961(class790 arg0) {
      arg0.field7216.method185(arg0.field7203[--arg0.field7204]);
   }
}

