import jaclib.ping.Ping;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;
import net.ClientProt;
import net.ClientPacket;
import net.ServerProt;

@deob.ObfuscatedName("client")
public final class client extends class671 {
   @deob.ObfuscatedName("client.bv")
   public static class801 field2584 = null;
   @deob.ObfuscatedName("client.bi")
   public static boolean field2390 = false;
   @deob.ObfuscatedName("client.bz")
   public static boolean field2391 = false;
   @deob.ObfuscatedName("client.bt")
   public static String field2626 = null;
   @deob.ObfuscatedName("client.bb")
   public static int field2393 = 0;
   @deob.ObfuscatedName("client.bl")
   public static int field2647 = 0;
   @deob.ObfuscatedName("client.cm")
   public static boolean field2395 = false;
   @deob.ObfuscatedName("client.co")
   public static byte[] field2509 = null;
   @deob.ObfuscatedName("client.ca")
   public static long field2397 = 0L;
   @deob.ObfuscatedName("client.cf")
   public static boolean field2398 = false;
   @deob.ObfuscatedName("client.cj")
   public static boolean field2399 = false;
   @deob.ObfuscatedName("client.cw")
   public static String field2400 = null;
   @deob.ObfuscatedName("client.cd")
   public static String field2401 = null;
   @deob.ObfuscatedName("client.ck")
   public static boolean field2643 = false;
   @deob.ObfuscatedName("client.cs")
   public static boolean field2403 = false;
   @deob.ObfuscatedName("client.cg")
   public static boolean field2404 = false;
   @deob.ObfuscatedName("client.cp")
   private static boolean field2405 = false;
   @deob.ObfuscatedName("client.cv")
   public static int field2406 = 0;
   @deob.ObfuscatedName("client.cr")
   public static int field2407 = -1;
   @deob.ObfuscatedName("client.cc")
   public static String field2636 = null;
   @deob.ObfuscatedName("client.cx")
   public static String field2409 = null;
   @deob.ObfuscatedName("client.cu")
   public static int field2410 = 12;
   @deob.ObfuscatedName("client.cy")
   private static class597 field2435 = new class597();
   @deob.ObfuscatedName("client.cl")
   private static class583 field2672 = new class583();
   @deob.ObfuscatedName("client.cb")
   private static class583 field2413 = new class583();
   @deob.ObfuscatedName("client.cq")
   private static long field2414 = 0L;
   @deob.ObfuscatedName("client.dr")
   public static boolean field2415 = false;
   @deob.ObfuscatedName("client.do")
   public static boolean field2416 = true;
   @deob.ObfuscatedName("client.dk")
   public static int field2595 = 0;
   @deob.ObfuscatedName("client.de")
   public static int field2418 = 0;
   @deob.ObfuscatedName("client.dp")
   public static boolean field2419 = true;
   @deob.ObfuscatedName("client.dh")
   public static boolean field2665 = false;
   @deob.ObfuscatedName("client.dc")
   public static boolean field2503 = false;
   @deob.ObfuscatedName("client.ds")
   public static int field2479 = 0;
   @deob.ObfuscatedName("client.dm")
   public static class164[] field2423 = new class164[8];
   @deob.ObfuscatedName("client.dq")
   public static class684[] field2424 = new class684[12];
   @deob.ObfuscatedName("client.dt")
   public static boolean field2425 = false;
   @deob.ObfuscatedName("client.dj")
   private static boolean field2426 = false;
   @deob.ObfuscatedName("client.dx")
   public static boolean field2536 = true;
   @deob.ObfuscatedName("client.dl")
   public static long field2527 = (long)(Math.random() * 9.999999999E9D);
   @deob.ObfuscatedName("client.da")
   public static boolean field2429 = false;
   @deob.ObfuscatedName("client.dg")
   public static int field2412 = 0;
   @deob.ObfuscatedName("client.du")
   public static boolean field2657 = false;
   @deob.ObfuscatedName("client.dn")
   private static int field2498 = 0;
   @deob.ObfuscatedName("client.dd")
   public static boolean field2433 = false;
   @deob.ObfuscatedName("client.ea")
   public static class849 field2434 = new class849();
   @deob.ObfuscatedName("client.ef")
   public static int field2718 = 0;
   @deob.ObfuscatedName("client.ee")
   public static int field2437 = 0;
   @deob.ObfuscatedName("client.ec")
   public static class708[] field2438 = new class708[130];
   @deob.ObfuscatedName("client.eu")
   public static int field2458 = 0;
   @deob.ObfuscatedName("client.ek")
   public static class708[] field2441 = new class708[76];
   @deob.ObfuscatedName("client.ew")
   public static Color[] field2442 = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
   @deob.ObfuscatedName("client.el")
   public static Color[] field2443 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   @deob.ObfuscatedName("client.ei")
   public static Color[] field2444 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   @deob.ObfuscatedName("client.ej")
   private static int field2445 = 0;
   @deob.ObfuscatedName("client.ez")
   private static int field2446 = 0;
   @deob.ObfuscatedName("client.gb")
   private static int field2448 = 0;
   @deob.ObfuscatedName("client.gw")
   private static class737 field2516 = new class737(8);
   @deob.ObfuscatedName("client.gz")
   private static String field2450 = null;
   @deob.ObfuscatedName("client.gr")
   public static final class580 field2430 = new class331();
   @deob.ObfuscatedName("client.ht")
   public static class875 field2615 = new class875(64);
   @deob.ObfuscatedName("client.hk")
   public static class106[] field2453 = new class106[1024];
   @deob.ObfuscatedName("client.hj")
   public static int field2492 = 0;
   @deob.ObfuscatedName("client.hi")
   public static int field2455 = 0;
   @deob.ObfuscatedName("client.hs")
   public static int[] field2456 = new int[1024];
   @deob.ObfuscatedName("client.hx")
   private static int field2457 = 0;
   @deob.ObfuscatedName("client.ip")
   private static int[] field2612 = new int[252];
   @deob.ObfuscatedName("client.ib")
   private static int field2459 = 0;
   @deob.ObfuscatedName("client.it")
   private static int field2540 = 0;
   @deob.ObfuscatedName("client.ii")
   private static int[] field2568 = new int[1006];
   @deob.ObfuscatedName("client.io")
   public static final class110 field2462 = new class110();
   @deob.ObfuscatedName("client.id")
   public static final class110 field2463 = new class110();
   @deob.ObfuscatedName("client.iv")
   public static final class110[] field2464 = new class110[]{field2463, field2462};
   @deob.ObfuscatedName("client.iy")
   public static int field2465 = 0;
   @deob.ObfuscatedName("client.if")
   private static boolean field2533 = false;
   @deob.ObfuscatedName("client.ik")
   public static class776 field2467 = new class776();
   @deob.ObfuscatedName("client.ia")
   public static class658 field2468 = new class658(false);
   @deob.ObfuscatedName("client.ic")
   public static volatile boolean field2469 = false;
   @deob.ObfuscatedName("client.ig")
   public static Object field2470 = new Object();
   @deob.ObfuscatedName("client.ih")
   public static Object field2471 = new Object();
   @deob.ObfuscatedName("client.iz")
   public static int[] field2515 = new int[64];
   @deob.ObfuscatedName("client.il")
   public static int field2522 = 0;
   @deob.ObfuscatedName("client.is")
   public static final int[] field2474 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @deob.ObfuscatedName("client.im")
   public static int field2475 = -1;
   @deob.ObfuscatedName("client.ij")
   public static int field2476 = 2;
   @deob.ObfuscatedName("client.jt")
   public static boolean field2477 = false;
   @deob.ObfuscatedName("client.jc")
   private static int field2630 = -1;
   @deob.ObfuscatedName("client.ju")
   private static int field2620 = 0;
   @deob.ObfuscatedName("client.jl")
   public static int field2480 = -1;
   @deob.ObfuscatedName("client.jr")
   public static int field2460 = -1;
   @deob.ObfuscatedName("client.jq")
   public static int field2482 = 255;
   @deob.ObfuscatedName("client.jz")
   public static int field2483 = 0;
   @deob.ObfuscatedName("client.jy")
   public static int field2484 = 0;
   @deob.ObfuscatedName("client.jb")
   public static int field2389 = 0;
   @deob.ObfuscatedName("client.jd")
   private static int[] field2487 = new int[4096];
   @deob.ObfuscatedName("client.ji")
   private static int[] field2538 = new int[4096];
   @deob.ObfuscatedName("client.jv")
   private static int[] field2489 = new int[50];
   @deob.ObfuscatedName("client.jx")
   private static int[] field2660 = new int[50];
   @deob.ObfuscatedName("client.jo")
   private static final int[] field2396 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @deob.ObfuscatedName("client.jj")
   public static int field2478 = 0;
   @deob.ObfuscatedName("client.je")
   private static int field2493 = 2;
   @deob.ObfuscatedName("client.jk")
   public static int field2618 = 0;
   @deob.ObfuscatedName("client.kk")
   private static int field2495 = 2;
   @deob.ObfuscatedName("client.kp")
   public static int field2496 = 0;
   @deob.ObfuscatedName("client.ki")
   private static int field2497 = 1;
   @deob.ObfuscatedName("client.kf")
   private static int field2565 = 0;
   @deob.ObfuscatedName("client.kc")
   public static int field2519 = 0;
   @deob.ObfuscatedName("client.kh")
   private static int field2500 = 2;
   @deob.ObfuscatedName("client.kj")
   public static int field2619 = 0;
   @deob.ObfuscatedName("client.km")
   private static int field2420 = 1;
   @deob.ObfuscatedName("client.ku")
   private static int field2554 = 0;
   @deob.ObfuscatedName("client.ka")
   public static Random field2485 = new Random();
   @deob.ObfuscatedName("client.kr")
   private static int field2505 = 0;
   @deob.ObfuscatedName("client.kx")
   public static int field2506 = 0;
   @deob.ObfuscatedName("client.kb")
   public static int field2507 = 0;
   @deob.ObfuscatedName("client.ky")
   public static float field2603 = 1105.0F;
   @deob.ObfuscatedName("client.ke")
   public static float field2502 = 0.0F;
   @deob.ObfuscatedName("client.ks")
   private static float field2608 = 0.0F;
   @deob.ObfuscatedName("client.kl")
   private static float field2511 = 0.0F;
   @deob.ObfuscatedName("client.kq")
   private static boolean field2668 = false;
   @deob.ObfuscatedName("client.kz")
   private static boolean field2513 = false;
   @deob.ObfuscatedName("client.lg")
   public static int field2514 = 15;
   @deob.ObfuscatedName("client.lw")
   public static int field2579 = field2514 + 200;
   @deob.ObfuscatedName("client.lc")
   public static boolean field2432 = true;
   @deob.ObfuscatedName("client.lk")
   private static int field2394 = 0;
   @deob.ObfuscatedName("client.lb")
   public static int[][][] field2520 = new int[2][][];
   @deob.ObfuscatedName("client.lq")
   public static int field2521 = -1;
   @deob.ObfuscatedName("client.lp")
   public static int field2698 = -1;
   @deob.ObfuscatedName("client.lh")
   public static int field2523 = 0;
   @deob.ObfuscatedName("client.ls")
   public static int field2402 = 0;
   @deob.ObfuscatedName("client.lr")
   public static int field2525 = 0;
   @deob.ObfuscatedName("client.lx")
   public static int field2526 = 0;
   @deob.ObfuscatedName("client.lz")
   public static int field2454 = 0;
   @deob.ObfuscatedName("client.lf")
   private static boolean field2528 = false;
   @deob.ObfuscatedName("client.lj")
   private static boolean field2417 = false;
   @deob.ObfuscatedName("client.lm")
   public static int field2530 = 0;
   @deob.ObfuscatedName("client.ld")
   private static int[] field2461 = new int[504];
   @deob.ObfuscatedName("client.lt")
   private static int[] field2491 = new int[510];
   @deob.ObfuscatedName("client.ly")
   private static int field2671 = 0;
   @deob.ObfuscatedName("client.lv")
   private static class839 field2534 = new class839();
   @deob.ObfuscatedName("client.ln")
   private static int field2535 = 0;
   @deob.ObfuscatedName("client.ll")
   public static float[] field2573 = new float[3];
   @deob.ObfuscatedName("client.me")
   public static int field2537 = 0;
   @deob.ObfuscatedName("client.mf")
   public static int field2504 = 0;
   @deob.ObfuscatedName("client.mn")
   public static int field2539 = 0;
   @deob.ObfuscatedName("client.mv")
   public static int field2517 = 0;
   @deob.ObfuscatedName("client.ml")
   public static int field2541 = 0;
   @deob.ObfuscatedName("client.mb")
   public static int field2545 = -1;
   @deob.ObfuscatedName("client.mq")
   private static int[] field2546 = new int[2];
   @deob.ObfuscatedName("client.mr")
   private static int[] field2547 = new int[2];
   @deob.ObfuscatedName("client.mx")
   private static int[] field2585 = new int[2];
   @deob.ObfuscatedName("client.mz")
   private static int[] field2549 = new int[2];
   @deob.ObfuscatedName("client.ma")
   private static int[] field2550 = new int[2];
   @deob.ObfuscatedName("client.mg")
   private static long field2551 = 0L;
   @deob.ObfuscatedName("client.mh")
   private static boolean field2640 = true;
   @deob.ObfuscatedName("client.mj")
   private static int field2553 = 32;
   @deob.ObfuscatedName("client.mc")
   private static int field2581 = 16;
   @deob.ObfuscatedName("client.mm")
   public static int field2555 = 765;
   @deob.ObfuscatedName("client.ms")
   public static int field2556 = 553;
   @deob.ObfuscatedName("client.mw")
   public static class211[] field2408 = new class211[2048];
   @deob.ObfuscatedName("client.nf")
   public static int field2452 = -1;
   @deob.ObfuscatedName("client.nz")
   public static boolean field2722 = false;
   @deob.ObfuscatedName("client.nw")
   public static boolean field2561 = false;
   @deob.ObfuscatedName("client.nb")
   public static int field2562 = 0;
   @deob.ObfuscatedName("client.nq")
   public static int field2563 = 0;
   @deob.ObfuscatedName("client.ng")
   public static boolean field2635 = false;
   @deob.ObfuscatedName("client.nm")
   public static boolean field2680 = false;
   @deob.ObfuscatedName("client.ni")
   public static boolean field2566 = false;
   @deob.ObfuscatedName("client.nd")
   public static boolean field2567 = false;
   @deob.ObfuscatedName("client.nx")
   public static boolean field2682 = true;
   @deob.ObfuscatedName("client.no")
   public static boolean field2569 = false;
   @deob.ObfuscatedName("client.nn")
   public static final short[] field2571 = new short[]{44, 45, 46, 47, 48, 49, 50, 51};
   @deob.ObfuscatedName("client.nu")
   public static int[] field2574 = new int[8];
   @deob.ObfuscatedName("client.ne")
   public static String[] field2712 = new String[8];
   @deob.ObfuscatedName("client.np")
   public static boolean[] field2428 = new boolean[8];
   @deob.ObfuscatedName("client.nl")
   public static int field2575 = -1;
   @deob.ObfuscatedName("client.or")
   public static class875 field2576 = new class875(64);
   @deob.ObfuscatedName("client.od")
   public static class849 field2577 = new class849();
   @deob.ObfuscatedName("client.oe")
   public static class875 field2494 = new class875(16);
   @deob.ObfuscatedName("client.oj")
   public static class839 field2590 = new class839();
   @deob.ObfuscatedName("client.oq")
   public static int[] field2580 = new int[25];
   @deob.ObfuscatedName("client.ox")
   public static int[] field2663 = new int[25];
   @deob.ObfuscatedName("client.oc")
   public static int[] field2490 = new int[25];
   @deob.ObfuscatedName("client.oo")
   public static int field2583 = 0;
   @deob.ObfuscatedName("client.ow")
   public static int field2557 = -1;
   @deob.ObfuscatedName("client.om")
   public static int field2451 = -1;
   @deob.ObfuscatedName("client.oy")
   public static int field2586 = -1;
   @deob.ObfuscatedName("client.oz")
   public static int field2421 = -1;
   @deob.ObfuscatedName("client.oh")
   public static boolean field2588 = false;
   @deob.ObfuscatedName("client.ov")
   public static int field2589 = -1;
   @deob.ObfuscatedName("client.oi")
   public static int field2622 = -1;
   @deob.ObfuscatedName("client.pc")
   public static String field2591 = null;
   @deob.ObfuscatedName("client.pg")
   public static String field2592 = null;
   @deob.ObfuscatedName("client.ps")
   public static volatile int field2593 = -1;
   @deob.ObfuscatedName("client.pk")
   public static class875 field2594 = new class875(8);
   @deob.ObfuscatedName("client.pq")
   private static int field2691 = 0;
   @deob.ObfuscatedName("client.pz")
   public static class425 field2596 = null;
   @deob.ObfuscatedName("client.pn")
   public static int field2597 = 0;
   @deob.ObfuscatedName("client.pm")
   public static int field2598 = 0;
   @deob.ObfuscatedName("client.pw")
   public static boolean field2599 = false;
   @deob.ObfuscatedName("client.pp")
   public static boolean field2600 = false;
   @deob.ObfuscatedName("client.pd")
   public static class425 field2601 = null;
   @deob.ObfuscatedName("client.pe")
   private static boolean field2602 = false;
   @deob.ObfuscatedName("client.po")
   public static class425 field2501 = null;
   @deob.ObfuscatedName("client.pa")
   private static class425 field2604 = null;
   @deob.ObfuscatedName("client.px")
   private static int field2605 = 0;
   @deob.ObfuscatedName("client.pu")
   private static int field2606 = 0;
   @deob.ObfuscatedName("client.pj")
   private static class425 field2607 = null;
   @deob.ObfuscatedName("client.pr")
   private static boolean field2512 = false;
   @deob.ObfuscatedName("client.pf")
   private static int field2570 = -1;
   @deob.ObfuscatedName("client.pv")
   private static int field2610 = -1;
   @deob.ObfuscatedName("client.py")
   private static int field2572 = -1;
   @deob.ObfuscatedName("client.ph")
   private static int field2609 = -1;
   @deob.ObfuscatedName("client.qj")
   private static boolean field2613 = false;
   @deob.ObfuscatedName("client.qu")
   private static int field2614 = -1;
   @deob.ObfuscatedName("client.qi")
   private static int field2621 = -1;
   @deob.ObfuscatedName("client.qh")
   private static boolean field2616 = false;
   @deob.ObfuscatedName("client.qb")
   public static int field2617 = 0;
   @deob.ObfuscatedName("client.qt")
   private static boolean field2529 = false;
   @deob.ObfuscatedName("client.qg")
   private static boolean field2685 = false;
   @deob.ObfuscatedName("client.qf")
   public static int field2447 = 1;
   @deob.ObfuscatedName("client.qa")
   private static int[] field2623 = new int[32];
   @deob.ObfuscatedName("client.qe")
   private static int field2624 = 0;
   @deob.ObfuscatedName("client.qr")
   private static int[] field2625 = new int[32];
   @deob.ObfuscatedName("client.qm")
   private static int field2560 = 0;
   @deob.ObfuscatedName("client.qo")
   private static int[] field2449 = new int[32];
   @deob.ObfuscatedName("client.qv")
   private static int field2628 = 0;
   @deob.ObfuscatedName("client.qw")
   private static int[] field2666 = new int[32];
   @deob.ObfuscatedName("client.rr")
   private static int field2488 = 0;
   @deob.ObfuscatedName("client.ru")
   private static int[] field2631 = new int[32];
   @deob.ObfuscatedName("client.rn")
   private static int field2632 = 0;
   @deob.ObfuscatedName("client.rj")
   private static int[] field2633 = new int[32];
   @deob.ObfuscatedName("client.rd")
   private static int field2634 = 0;
   @deob.ObfuscatedName("client.rv")
   public static int field2548 = 0;
   @deob.ObfuscatedName("client.rk")
   private static int field2524 = 0;
   @deob.ObfuscatedName("client.rc")
   private static int field2481 = 0;
   @deob.ObfuscatedName("client.rf")
   private static int field2638 = 0;
   @deob.ObfuscatedName("client.ri")
   private static int field2639 = 0;
   @deob.ObfuscatedName("client.rz")
   private static int field2611 = 0;
   @deob.ObfuscatedName("client.rw")
   private static int field2641 = 0;
   @deob.ObfuscatedName("client.ra")
   public static int field2472 = 0;
   @deob.ObfuscatedName("client.re")
   public static boolean field2644 = false;
   @deob.ObfuscatedName("client.rx")
   private static long field2645 = -1L;
   @deob.ObfuscatedName("client.rh")
   public static class849 field2646 = new class849();
   @deob.ObfuscatedName("client.rl")
   private static class849 field2653 = new class849();
   @deob.ObfuscatedName("client.rs")
   private static class849 field2648 = new class849();
   @deob.ObfuscatedName("client.rg")
   private static class875 field2649 = new class875(512);
   @deob.ObfuscatedName("client.sq")
   private static int field2651 = 0;
   @deob.ObfuscatedName("client.sg")
   private static int field2652 = -2;
   @deob.ObfuscatedName("client.sh")
   public static boolean[] field2558 = new boolean[103];
   @deob.ObfuscatedName("client.st")
   private static boolean[] field2654 = new boolean[103];
   @deob.ObfuscatedName("client.sz")
   private static Rectangle[] field2655 = new Rectangle[103];
   @deob.ObfuscatedName("client.sm")
   private static int field2656;
   @deob.ObfuscatedName("client.sl")
   public static final int[] field2676;
   @deob.ObfuscatedName("client.si")
   private static int field2658;
   @deob.ObfuscatedName("client.su")
   private static int field2659;
   @deob.ObfuscatedName("client.sn")
   private static int[] field2440;
   @deob.ObfuscatedName("client.sd")
   private static int[] field2661;
   @deob.ObfuscatedName("client.sp")
   private static int[] field2662;
   @deob.ObfuscatedName("client.sy")
   private static class379[] field2392;
   @deob.ObfuscatedName("client.sa")
   private static final int[] field2532;
   @deob.ObfuscatedName("client.ss")
   public static int field2582;
   @deob.ObfuscatedName("client.sj")
   public static int field2411;
   @deob.ObfuscatedName("client.sw")
   private static long[] field2499;
   @deob.ObfuscatedName("client.sr")
   private static int field2669;
   @deob.ObfuscatedName("client.sc")
   public static String field2578;
   @deob.ObfuscatedName("client.sx")
   public static String field2427;
   @deob.ObfuscatedName("client.tq")
   public static class634[] field2681;
   @deob.ObfuscatedName("client.tn")
   public static int field2673;
   @deob.ObfuscatedName("client.tl")
   public static class933 field2674;
   @deob.ObfuscatedName("client.ub")
   public static boolean[] field2531;
   @deob.ObfuscatedName("client.ux")
   private static int[] field2677;
   @deob.ObfuscatedName("client.uo")
   private static int[] field2678;
   @deob.ObfuscatedName("client.uf")
   private static int[] field2679;
   @deob.ObfuscatedName("client.uk")
   private static int[] field2510;
   @deob.ObfuscatedName("client.uw")
   public static short field2559;
   @deob.ObfuscatedName("client.uv")
   public static short field2664;
   @deob.ObfuscatedName("client.um")
   public static short field2683;
   @deob.ObfuscatedName("client.ua")
   public static short field2627;
   // Camera distance zoom in thousandths of a percent (100000 = 100%), changed by Ctrl+scroll and
   // eased toward its target each frame so the camera glides instead of snapping (OSHD-style).
   private static int cameraZoom = 100000;
   private static int cameraZoomTarget = 100000;
   private static final int CAMERA_ZOOM_STEP = 10000;
   // Render distance in percent of the graphics preference (100 = default), changed by Alt+scroll.
   // class658 scales the meshed radius and the far plane by it, clamped to the loaded scene.
   public static int renderDistancePercent = 100;
   private static int renderDistancePercentTarget = 100;
   private static final int RENDER_DISTANCE_STEP = 10;
   @deob.ObfuscatedName("client.ut")
   public static short field2629;
   @deob.ObfuscatedName("client.ud")
   public static short field2686;
   @deob.ObfuscatedName("client.uj")
   public static short field2687;
   @deob.ObfuscatedName("client.uz")
   public static short field2688;
   @deob.ObfuscatedName("client.ur")
   public static int field2689;
   @deob.ObfuscatedName("client.uu")
   public static int field2690;
   @deob.ObfuscatedName("client.ui")
   public static int field2431;
   @deob.ObfuscatedName("client.uy")
   public static int field2692;
   @deob.ObfuscatedName("client.uh")
   public static int field2693;
   @deob.ObfuscatedName("client.ug")
   public static int field2694;
   @deob.ObfuscatedName("client.un")
   public static int field2695;
   @deob.ObfuscatedName("client.uq")
   public static class960[] field2697;
   @deob.ObfuscatedName("client.ue")
   private static class839 field2670;
   @deob.ObfuscatedName("client.uc")
   public static int field2699;
   @deob.ObfuscatedName("client.vy")
   public static class906[] field2701;
   @deob.ObfuscatedName("client.vb")
   public static Calendar field2702;
   @deob.ObfuscatedName("client.vp")
   public static byte field2703;
   @deob.ObfuscatedName("client.vq")
   public static class716 field2704;
   @deob.ObfuscatedName("client.vt")
   private static long field2705;
   @deob.ObfuscatedName("client.va")
   private static long field2706;
   @deob.ObfuscatedName("client.wo")
   private static final int[] field2723;

   private client() {
   }

   static {
      for(int var0 = 0; var0 < 103; ++var0) {
         field2655[var0] = new Rectangle();
      }

      field2656 = 0;
      field2676 = new int[4];
      field2658 = 0;
      field2659 = 52;
      field2440 = new int[field2659];
      field2661 = new int[field2659];
      field2662 = new int[field2659];
      field2392 = new class379[field2659];
      field2532 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field2582 = 0;
      field2411 = 0;
      field2499 = new long[100];
      field2669 = 0;
      field2578 = null;
      field2427 = null;
      field2681 = new class634[6];
      field2673 = 0;
      field2674 = new class933();
      field2531 = new boolean[5];
      field2677 = new int[5];
      field2678 = new int[5];
      field2679 = new int[5];
      field2510 = new int[5];
      field2559 = 256;
      field2664 = 205;
      field2683 = 256;
      field2627 = 320;
      field2629 = 1;
      field2686 = 32767;
      field2687 = 1;
      field2688 = 32767;
      field2689 = 0;
      field2690 = 0;
      field2431 = 0;
      field2692 = 0;
      field2693 = 0;
      field2694 = 0;
      field2695 = 0;
      field2697 = new class960[200];
      field2670 = new class839();
      field2699 = 0;
      field2701 = new class906[100];
      field2702 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
      field2703 = -6;
      field2704 = new class798();
      field2705 = -1L;
      field2706 = -1L;
      field2723 = new int[4];
   }

   private static int clamp(int value, int min, int max) {
      if (value < min) {
         return min;
      } else {
         return value > max ? max : value;
      }
   }

   /** Moves a value a quarter of the way to its target, at least one step, so wheel changes glide. */
   private static int ease(int current, int target) {
      if (current == target) {
         return current;
      }

      int step = (target - current) / 4;
      return current + (step != 0 ? step : (target > current ? 1 : -1));
   }

   public final void init() {
      if (this.method9754()) {
         String var1 = "";
         class563[] var2 = class563.method1994();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class563 var4 = var2[var3];
            String var5 = Statics.field6978.getParameter(var4.field4944);
            if (var5 != null) {
               switch(Integer.parseInt(var4.field4944)) {
               case 1:
                  field2407 = Integer.parseInt(var5);
                  break;
               case 2:
                  field2400 = var5;
                  if (field2400.length() > 100) {
                     field2400 = null;
                  }
               case 3:
               case 4:
                  break;
               case 5:
                  field2401 = var5;
                  break;
               case 6:
                  Statics.field8398 = Integer.parseInt(var5);
                  break;
               case 7:
                  field2584 = class801.method5912(Integer.parseInt(var5));
                  break;
               case 8:
                  if (Statics.field8792 == null) {
                     Statics.field8792 = new class873();
                  }

                  Statics.field8792.field8851 = Integer.parseInt(var5);
                  break;
               case 9:
                  if (var5.equalsIgnoreCase(class582.field5305)) {
                     field2722 = true;
                  }
                  break;
               case 10:
                  if (Statics.field8792 == null) {
                     Statics.field8792 = new class873();
                  }

                  Statics.field8792.field8849 = var5;
                  break;
               case 11:
                  Statics.field4896 = (class819)class814.method4102(class819.method14489(), Integer.parseInt(var5));
                  if (class819.field8433 == Statics.field4896) {
                     Statics.field4896 = class819.field8432;
                  } else if (!Statics.method14487(Statics.field4896) && class819.field8428 != Statics.field4896) {
                     Statics.field4896 = class819.field8428;
                  }
                  break;
               case 12:
                  if (var5.equalsIgnoreCase(class582.field5305)) {
                     field2391 = true;
                  } else {
                     field2391 = false;
                  }
                  break;
               case 13:
                  Statics.field243 = class823.method14529(Integer.parseInt(var5));
                  break;
               case 14:
                  if (var5.equalsIgnoreCase(class582.field5305)) {
                     field2405 = true;
                  } else {
                     field2405 = false;
                  }
                  break;
               case 15:
                  if (var5.equals(class582.field5305)) {
                     field2395 = true;
                  } else {
                     field2395 = false;
                  }
                  break;
               case 16:
                  field2647 = Integer.parseInt(var5);
                  if (field2647 < 0 || field2647 >= field2442.length) {
                     field2647 = 0;
                  }
                  break;
               case 17:
                  field2409 = var5;
                  break;
               case 18:
                  Statics.field8790 = new class873();
                  Statics.field8790.field8851 = Integer.parseInt(var5);
                  break;
               case 19:
               default:
                  class285.method15864("", new RuntimeException());
                  break;
               case 20:
                  field2393 = Integer.parseInt(var5);
                  break;
               case 21:
                  if (var5.equalsIgnoreCase(class582.field5305)) {
                     field2390 = true;
                  } else {
                     field2390 = false;
                  }
                  break;
               case 22:
                  if (var5.equalsIgnoreCase(class582.field5305)) {
                     field2643 = true;
                  } else {
                     field2643 = false;
                  }
                  break;
               case 23:
                  var1 = var5;
                  break;
               case 24:
                  if (var5 != null) {
                     field2509 = class821.method2050(Statics.method14301(var5));
                     if (field2509.length < 16) {
                        field2509 = null;
                     }
                  }
                  break;
               case 25:
                  if (var5.equalsIgnoreCase(class582.field5305)) {
                     field2403 = true;
                  } else {
                     field2403 = false;
                  }
                  break;
               case 26:
                  if (var5.equalsIgnoreCase(class582.field5305)) {
                     field2404 = true;
                  } else {
                     field2404 = false;
                  }
                  break;
               case 27:
                  if (var5.equals(class582.field5305)) {
                     field2433 = true;
                  } else {
                     field2433 = false;
                  }
                  break;
               case 28:
                  field2626 = var5;
                  break;
               case 29:
                  Statics.field5813 = var5;
                  break;
               case 30:
                  field2636 = var5;
                  break;
               case 31:
                  Statics.field5541 = var5;
                  break;
               case 32:
                  Statics.field6769 = var5;
                  break;
               case 33:
                  Statics.field3662 = class840.method6888(Integer.parseInt(var5));
                  if (class840.field8550 != Statics.field3662 && class840.field8551 != Statics.field3662 && class840.field8555 != Statics.field3662 && class840.field8549 != Statics.field3662) {
                     Statics.field3662 = class840.field8549;
                  }
                  break;
               case 34:
                  Statics.field182 = Integer.parseInt(var5);
                  break;
               case 35:
                  field2397 = Long.parseLong(var5);
               }
            }
         }

         if (field2626 == null) {
            field2626 = "";
         }

         class687 var6 = new class687(field2555, field2556, field2553, field2581, field2584.field7300);
         Statics.field561 = this;
         String var7 = Statics.field3662.field8554;
         int var8 = Statics.field3662.field8552 + 32;
         if (!var1.equals("")) {
            var7 = var7 + "_" + var1;
            var8 = 0;
         }

         this.method9780(var6, field2584.field7302, var7, var8, class421.method5520(), ClientConfig.REVISION, ClientConfig.SUBREVISION, field2405);
      }
   }

   @deob.ObfuscatedName("client.ap(B)V")
   protected final void method4822() {
      Frame var1 = new Frame(" ");
      var1.pack();
      var1.dispose();
      Statics.field5928 = new class425();
      method8285();
      Statics.field3048 = new class618();
      Statics.field9401 = new class42();
      int[] var2 = new int[]{20, 260};
      int[] var3 = new int[]{1000, 100};
      if (var2 != null && var3 != null) {
         Statics.field8522 = var2;
         Statics.field8818 = new int[var2.length];
         Statics.field1103 = new byte[var2.length][][];

         for(int var4 = 0; var4 < Statics.field8522.length; ++var4) {
            Statics.field1103[var4] = new byte[var3[var4]][];
         }
      } else {
         Statics.field8522 = null;
         Statics.field8818 = null;
         Statics.field1103 = (byte[][][])null;
      }

      class584.method8138(100);
      class606.method8651(10);
      class706.method10195(100);
      class254.method16043(100);
      if (class819.field8428 != Statics.field4896) {
         Statics.field9400 = new byte[50][];
      }

      Statics.field9361 = class29.method5341();
      if (Statics.field9361.field983.method2195() == 1) {
         class713.field6570 = false;
      }

      if (class819.field8428 == Statics.field4896) {
         Statics.field8790.field8849 = Statics.field6978.getCodeBase().getHost();
      } else if (Statics.method14487(Statics.field4896)) {
         Statics.field8790.field8849 = Statics.field6978.getCodeBase().getHost();
         Statics.field8790.field8850 = Statics.field8790.field8851 + 40000;
         Statics.field8792.field8850 = Statics.field8792.field8851 + 40000;
         Statics.field8790.field8852 = Statics.field8790.field8851 + 50000;
         Statics.field8792.field8852 = Statics.field8792.field8851 + 50000;
      } else if (class819.field8433 == Statics.field4896) {
         Statics.field8790.field8849 = class582.field5312;
         Statics.field8792.field8849 = class582.field5312;
         Statics.field8790.field8850 = Statics.field8790.field8851 + 40000;
         Statics.field8792.field8850 = Statics.field8792.field8851 + 40000;
         Statics.field8790.field8852 = Statics.field8790.field8851 + 50000;
         Statics.field8792.field8852 = Statics.field8792.field8851 + 50000;
      }

      // ClientConfig wins over jav_config's environment-specific hosts and ports.
      if (Statics.field8792 == null) {
         Statics.field8792 = new class873();
      }

      if (Statics.field8790 == null) {
         Statics.field8790 = new class873();
      }

      Statics.field8792.field8849 = ClientConfig.SERVER_HOST;
      Statics.field8790.field8849 = ClientConfig.SERVER_HOST;
      if (ClientConfig.SERVER_PORT > 0) {
         Statics.field8792.field8850 = ClientConfig.SERVER_PORT;
         Statics.field8792.field8852 = ClientConfig.SERVER_PORT;
         Statics.field8790.field8850 = ClientConfig.SERVER_PORT;
         Statics.field8790.field8852 = ClientConfig.SERVER_PORT;
      }
      Statics.field8789 = Statics.field8790;
      if (field2584 == class801.field7297) {
         field2536 = false;
      }

      Statics.field8747 = class843.field8572 = class915.field9279 = class899.field9149 = new short[256];

      try {
         Statics.field991 = class671.method8973().getToolkit().getSystemClipboard();
      } catch (Exception var6) {
      }

      Statics.field2111 = class692.method2199(Statics.field5796);
      Statics.field336 = class706.method15263(Statics.field5796, true);
      Statics.field6895 = new class8(field2674);
      if (class819.field8428 != Statics.field4896) {
         field2665 = true;
      }

      field6107 = class881.field8978.method15374(Statics.field243);
      Statics.field4892 = new class623();
      (new Thread(Statics.field4892)).start();
   }

   @deob.ObfuscatedName("client.av(B)V")
   protected final void method4906() {
      if (Statics.field9361.field974.method2236() == 2) {
         try {
            this.method4552();
         } catch (ThreadDeath var3) {
            throw var3;
         } catch (Throwable var4) {
            class285.method15864(var4.getMessage() + " " + this.method4556(), var4);
            field2415 = true;
            class864.method10009(class917.field9352);
            method5788(0, false);
         }
      } else {
         this.method4552();
      }

   }

   @deob.ObfuscatedName("client.dl(B)V")
   private void method4552() {
      if (field2410 != 13) {
         if (field2469) {
            Object var1 = field2471;
            synchronized(field2471) {
               field2471.notify();
            }

            Object var3 = field2470;
            synchronized(field2470) {
               try {
                  field2470.wait();
               } catch (InterruptedException var13) {
               }
            }

            field2469 = false;
         }

         ++field2418;
         if (field2418 % 1000 == 1) {
            GregorianCalendar var6 = new GregorianCalendar();
            Statics.field9346 = var6.get(11) * 600 + var6.get(12) * 10 + var6.get(13) / 6;
            field2485.setSeed((long)Statics.field9346);
         }

         field2463.method1412();
         field2462.method1412();
         this.method4557();
         if (Statics.field8782 != null) {
            Statics.field8782.method8980();
         }

         class677.method15481();
         class817.method6533();
         Statics.field2111.method1804();
         Statics.field336.method1892();
         if (Statics.field8847 != null) {
            Statics.field8847.method2580((int)class431.method2169());
         }

         field2437 = 0;
         field2458 = 0;

         for(class708 var7 = Statics.field2111.method1808(); var7 != null; var7 = Statics.field2111.method1808()) {
            int var8 = var7.method1295();
            if (var8 != 2 && var8 != 3) {
               if (var8 == 0) {
                  if (field2562 >= 2 && Statics.method10666() && var7.method1297() == 28 && Statics.field2111.method1803(82)) {
                     if (class744.method14383()) {
                        class744.method9884();
                     } else {
                        class744.method8021();
                     }
                  }

                  if (field2458 < 76) {
                     field2441[field2458] = var7;
                     ++field2458;
                  }
               }
            } else {
               char var9 = var7.method1296();
               if (Statics.method10666() && (var9 == '`' || var9 == 167 || var9 == 178)) {
                  if (class319.method9100()) {
                     class319.method1138();
                  } else {
                     class319.method11427();
                  }
               } else if (field2437 < 130) {
                  field2438[field2437] = var7;
                  ++field2437;
               }
            }
         }

         field2718 = 0;

         for(class102 var10 = Statics.field336.method1891(); var10 != null; var10 = Statics.field336.method1891()) {
            int var11 = var10.method1365();
            if (var11 == -1) {
               class762.method7431(var10);
            } else if (var11 == 6) {
               field2718 += var10.method1368();
               var10.method1370();
            } else if (class102.method5689(var11)) {
               field2434.method14959(var10);
               if (field2434.method14972() > 10) {
                  class102 var12 = (class102)field2434.method14961();
                  if (var12 != null) {
                     var12.method1370();
                  }
               }
            }
         }

         // Wheel over the 3D viewport: Ctrl zooms, Alt changes the render distance, Shift stays free.
         if (field2718 != 0 && field2601 != null && Statics.field5998 == 4 && !class319.method9100() && !Statics.field2111.method1803(81)) {
            int mouseX = Statics.field336.method1896();
            int mouseY = Statics.field336.method1897();
            if (mouseX >= field2689 && mouseX < field2689 + field2431 && mouseY >= field2690 && mouseY < field2690 + field2692) {
               boolean ctrl = Statics.field2111.method1803(82);
               boolean alt = Statics.field2111.method1803(86);
               if (ctrl != alt) {
                  if (ctrl) {
                     cameraZoomTarget = clamp(cameraZoomTarget + field2718 * CAMERA_ZOOM_STEP, ClientConfig.ZOOM_MIN, ClientConfig.ZOOM_MAX);
                  } else {
                     int maxRenderDistance = field2468.maxRenderDistancePercent();
                     if (ClientConfig.RENDER_DISTANCE_MAX > 0 && ClientConfig.RENDER_DISTANCE_MAX < maxRenderDistance) {
                        maxRenderDistance = ClientConfig.RENDER_DISTANCE_MAX;
                     }

                     renderDistancePercentTarget = clamp(renderDistancePercentTarget + field2718 * RENDER_DISTANCE_STEP, ClientConfig.RENDER_DISTANCE_MIN, maxRenderDistance);
                  }

                  field2718 = 0;
               }
            }
         }

         cameraZoom = ease(cameraZoom, cameraZoomTarget);
         renderDistancePercent = ease(renderDistancePercent, renderDistancePercentTarget);
         field2468.applyRenderDistance();

         if (class319.method9100()) {
            class319.method9099();
         }

         if (Statics.method2265(field2410)) {
            class590.method6861();
            class671.method5268();
         } else if (method14497(field2410)) {
            field2468.method9548();
         }

         if (method15888(field2410) && !method14497(field2410)) {
            this.method4560();
            class825.method8014();
            class385.method14229();
         } else if (method7373(field2410) && !method14497(field2410)) {
            this.method4560();
            class385.method14229();
         } else if (field2410 == 4) {
            class385.method14229();
         } else if (method6612(field2410) && !method14497(field2410)) {
            method15441();
         } else if (field2410 == 9 || field2410 == 0) {
            class385.method14229();
            if (class385.field2832 != -3 && class385.field2832 != 2 && class385.field2832 != 15) {
               if (field2410 == 0) {
                  class385.field2831 = class385.field2833;
                  class385.field2829 = class385.field2801;
                  class385.field2787 = class385.field2832;
                  if (Statics.field9083) {
                     class861.method9127(Statics.field8794.field8851, Statics.field8794.field8849);
                     field2463.method1431();
                     method14844(9);
                  } else {
                     method5519(class385.field2835);
                  }
               } else {
                  method5519(false);
               }
            }
         }

         class326.method2098(Statics.field8847);
         field2434.method14961();
      }
   }

   @deob.ObfuscatedName("client.ax(B)V")
   protected final void method4553() {
      if (Statics.field9361.field974.method2236() == 2) {
         try {
            this.method4994();
         } catch (ThreadDeath var3) {
            throw var3;
         } catch (Throwable var4) {
            class285.method15864(var4.getMessage() + " " + this.method4556(), var4);
            field2415 = true;
            class864.method10009(class917.field9352);
            method5788(0, false);
         }
      } else {
         this.method4994();
      }

   }

   @deob.ObfuscatedName("client.da(I)V")
   private void method4994() {
      if (field2410 != 13) {
         long var1 = class671.method2049() / 1000000L - field2414;
         field2414 = class671.method2049() / 1000000L;
         boolean var3 = Statics.method957();
         if (var3 && class677.field6153 && Statics.field9102 != null) {
            Statics.field9102.method9295();
         }

         if (method15969(field2410)) {
            if (field2551 != 0L && class431.method2169() > field2551) {
               method10176(method10038(), -1, -1, false);
            } else if (!Statics.field8847.method7490() && field6106) {
               method10657();
            }
         }

         if (Statics.field688 == null) {
            Container var4 = class671.method8973();
            int var5 = var4.getSize().width;
            int var6 = var4.getSize().height;
            if (Statics.field4149 == var4) {
               Insets var7 = Statics.field4149.getInsets();
               var5 -= var7.right + var7.left;
               var6 -= var7.top + var7.bottom;
            }

            if (Statics.field9255 != var5 || Statics.field7012 != var6 || field2429) {
               if (Statics.field8847 != null && !Statics.field8847.method7491()) {
                  Statics.field9255 = var5;
                  Statics.field7012 = var6;
               } else {
                  method8285();
               }

               field2551 = class431.method2169() + 500L;
               field2429 = false;
            }
         }

         if (class854.field8745 && Statics.field688 != null && !Statics.field6857 && method15969(field2410)) {
            method10176(Statics.field9361.field967.method2066(), -1, -1, false);
         }

         boolean var8 = false;
         if (field6112) {
            field6112 = false;
            var8 = true;
         }

         if (var8) {
            method3954();
         }

         if (Statics.field8847 != null && Statics.field8847.method7490() || method10038() != 1) {
            method208();
         }

         if (Statics.method2265(field2410)) {
            class590.method5489(var8);
         } else if (method17089(field2410)) {
            method2218();
         } else if (method15761(field2410)) {
            method2218();
         } else if (method14497(field2410)) {
            if (field2468.method9508() == class621.field5596) {
               int var9 = field2468.method9513() / 2;
               class327.method5400(class881.field8978.method15374(Statics.field243) + class582.field5311 + "(" + var9 + "%)", true, Statics.field8847, Statics.field6177, Statics.field7094);
            } else if (field2468.method9508() == class621.field5598) {
               int var10 = 50 + field2468.method9510() / 2;
               class327.method5400(class881.field8978.method15374(Statics.field243) + class582.field5311 + "(" + var10 + "%)", true, Statics.field8847, Statics.field6177, Statics.field7094);
            } else {
               class327.method5400(class881.field8978.method15374(Statics.field243), true, Statics.field8847, Statics.field6177, Statics.field7094);
            }
         } else if (field2410 == 1) {
            method9949(var1);
         } else if (field2410 == 9) {
            class327.method5400(class881.field8909.method15374(Statics.field243) + class582.field5311 + class881.field8981.method15374(Statics.field243), false, Statics.field8847, Statics.field6177, Statics.field7094);
         } else if (field2410 == 0) {
            class327.method5400(class881.field9030.method15374(Statics.field243), false, Statics.field8847, Statics.field6177, Statics.field7094);
         }

         if (field2656 == 3) {
            for(int var11 = 0; var11 < field2651; ++var11) {
               Rectangle var12 = field2655[var11];
               if (field2654[var11]) {
                  Statics.field8847.method11505(var12.x, var12.y, var12.width, var12.height, -65281);
               } else {
                  Statics.field8847.method11505(var12.x, var12.y, var12.width, var12.height, -16711936);
               }
            }
         }

         if (class319.method9100()) {
            class319.method274(Statics.field8847);
         }

         if (!Statics.method2265(field2410) && !method14497(field2410) && field2593 != -1) {
            try {
               Statics.field8847.method11515();
               Statics.field8847.method11522();
            } catch (class165 var15) {
               class285.method15864(var15.getMessage() + " " + this.method4556(), var15);
               switch(Statics.field9361.field974.method2236()) {
               case 3:
                  Statics.method5155(var15.method2292());
                  method5788(1, false);
                  break;
               default:
                  method5788(0, false);
               }
            }
         }

         class817.method5796();
         int var14 = Statics.field9361.field980.method2087();
         if (var14 == 0) {
            Statics.method14813(15L);
         } else if (var14 == 1) {
            Statics.method14813(10L);
         } else if (var14 == 2) {
            Statics.method14813(5L);
         } else if (var14 == 3) {
            Statics.method14813(2L);
         }

         if (field2425) {
            method1107();
         }

         if (Statics.field9361.field956.method2157() == 1 && field2410 == 6 && field2593 != -1) {
            Statics.field9361.method1857(Statics.field9361.field956, 0);
            class29.method7336();
         }

      }
   }

   @deob.ObfuscatedName("rb.dg(I)V")
   public static final void method11587() {
      String var0 = Statics.field5541 != null ? Statics.field5541 : method366();
      class689.method690(var0, false, Statics.field9361.field974.method2236() == 5, field2643, field2403);
   }

   @deob.ObfuscatedName("client.af(I)V")
   protected final void method4950() {
      if (field2644) {
         method430();
      }

      class590.method6239();
      if (Statics.field8847 != null) {
         Statics.field8847.method11494();
      }

      if (class854.field8745 && Statics.field688 != null) {
         Statics.method9727(Statics.field6776, Statics.field688);
         Statics.field688 = null;
      }

      field2463.method1411();
      field2463.field841.method9700();
      field2462.method1411();
      field2462.field841.method9700();
      Statics.method7901();
      Statics.field9401.method673();
      Statics.field3048.method8903();
      if (field2467 != null) {
         field2467.method11638();
         field2467 = null;
      }

      try {
         Ping.quit();
      } catch (Throwable var4) {
      }

      class762.method14679();

      try {
         class319.method3346();
      } catch (Exception var3) {
      }

      if (field6101) {
         method11587();
      }

   }

   @deob.ObfuscatedName("client.q(I)Ljava/lang/String;")
   public String method4556() {
      String var1 = " ";

      try {
         class723 var2 = field2468.method9649();
         var1 = var1 + var2.field6676 + class582.field5306 + var2.field6677 + class582.field5306 + field2468.method9648() + class582.field5306 + field2468.method9604() + " ";
         if (Statics.field5701 != null) {
            var1 = var1 + Statics.field1977 + class582.field5306 + (var2.field6676 + Statics.field5701.field16[0]) + class582.field5306 + (var2.field6677 + Statics.field5701.field62[0]) + " ";
         } else {
            var1 = var1 + Statics.field1977 + class582.field5306 + Statics.field1977 + class582.field5306 + Statics.field1977 + class582.field5306 + " ";
         }

         var1 = var1 + Statics.field9361.field974.method2236() + " " + Statics.field9361.field952.method2226() + " " + method10038() + " " + Statics.field6104 + class582.field5306 + Statics.field6354 + " ";
         var1 = var1 + Statics.field9361.field951.method1448() + " ";
         var1 = var1 + Statics.field9361.field964.method2210() + " ";
         var1 = var1 + Statics.field9361.field975.method2254() + " ";
         var1 = var1 + Statics.field9361.field972.method2268() + " ";
         var1 = var1 + Statics.field9361.field954.method2163() + " ";
         var1 = var1 + "0 ";
         var1 = var1 + field6130 + " ";
         var1 = var1 + field2410 + " ";
         if (Statics.field8859 != null) {
            var1 = var1 + Statics.field8859.field845;
         } else {
            var1 = var1 + -1;
         }

         var1 = var1 + " ";
         if (field2636 != null) {
            var1 = var1 + field2636;
         } else {
            var1 = var1 + class582.field5306;
         }

         try {
            if (Statics.field9361.field974.method2236() == 2) {
               Class var3 = Class.forName("java.lang.ClassLoader");
               Field var4 = var3.getDeclaredField("nativeLibraries");
               Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
               Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
               var6.invoke(var4, Boolean.TRUE);
               Vector var7 = (Vector)var4.get(client.class.getClassLoader());

               for(int var8 = 0; var8 < var7.size(); ++var8) {
                  try {
                     Object var9 = var7.elementAt(var8);
                     Field var10 = var9.getClass().getDeclaredField("name");
                     var6.invoke(var10, Boolean.TRUE);

                     try {
                        String var11 = (String)var10.get(var9);
                        if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                           Field var12 = var9.getClass().getDeclaredField("handle");
                           var6.invoke(var12, Boolean.TRUE);
                           var1 = var1 + " " + Long.toHexString(var12.getLong(var9));
                           var6.invoke(var12, Boolean.FALSE);
                        }
                     } catch (Throwable var17) {
                     }

                     var6.invoke(var10, Boolean.FALSE);
                  } catch (Throwable var18) {
                  }
               }
            }
         } catch (Throwable var19) {
         }
      } catch (Throwable var20) {
      }

      return var1;
   }

   @deob.ObfuscatedName("xa.dn(II)Z")
   private static boolean method15969(int arg0) {
      return arg0 == 6 || arg0 == 15 || arg0 == 11 || arg0 == 1;
   }

   @deob.ObfuscatedName("ll.dz(II)Z")
   public static boolean method8950(int arg0) {
      return arg0 == 11 || arg0 == 7;
   }

   @deob.ObfuscatedName("su.dd(II)Z")
   private static boolean method14497(int arg0) {
      return arg0 == 5 || arg0 == 19 || arg0 == 16 || arg0 == 7 || arg0 == 17;
   }

   @deob.ObfuscatedName("wq.dy(IB)Z")
   public static boolean method15888(int arg0) {
      return arg0 == 6 || arg0 == 5 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
   }

   @deob.ObfuscatedName("zp.ea(II)Z")
   private static boolean method17089(int arg0) {
      return arg0 == 6 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
   }

   @deob.ObfuscatedName("il.ef(II)Z")
   public static boolean method7373(int arg0) {
      return arg0 == 15 || arg0 == 19 || arg0 == 11 || arg0 == 7;
   }

   @deob.ObfuscatedName("wf.es(II)Z")
   private static boolean method15761(int arg0) {
      return arg0 == 15 || arg0 == 11;
   }

   @deob.ObfuscatedName("gd.ed(II)Z")
   public static boolean method6612(int arg0) {
      return arg0 == 1 || arg0 == 16 || arg0 == 4;
   }

   @deob.ObfuscatedName("tq.ee(II)V")
   public static void method14844(int arg0) {
      if (field2410 != arg0) {
         field2498 = 0;
         if (arg0 == 9 || arg0 == 0) {
            class385.method5210();
         }

         if (arg0 != 9 && Statics.field5815 != null) {
            Statics.field5815.method1532();
            Statics.field5815 = null;
         }

         if (arg0 == 6) {
            method272(field2410 == 14 || field2410 == 8 || field2593 != Statics.field5740.field7283);
         }

         if (arg0 == 15) {
            method11179(field2593 != Statics.field5740.field7284);
         }

         if (arg0 != 3 && arg0 != 4) {
            if (arg0 != 18 && (arg0 != 11 || field2410 == 7)) {
               if (arg0 == 8) {
                  class825.method7353();
               }
            } else if (!class385.method5210()) {
               return;
            }
         } else if (!class385.method391()) {
            return;
         }

         if (method14497(arg0)) {
            field2468.method9532();
            Statics.method15823(true);
         }

         if (arg0 == 16 || arg0 == 6) {
            Statics.method15303();
         }

         boolean var1 = arg0 == 10 || method15888(arg0) || method7373(arg0);
         boolean var2 = field2410 == 10 || method15888(field2410) || method7373(field2410);
         if (var1 != var2) {
            if (var1) {
               class677.field6149 = class677.field6157;
               if (Statics.field9361.field988.method2319() != 0) {
                  Statics.method1011(2, Statics.field6467, class677.field6157, 0, Statics.field9361.field988.method2319(), false);
                  class677.method8735();
               } else {
                  class417.method6598(2);
               }

               Statics.field9401.method670(false);
            } else {
               class417.method6598(2);
               Statics.field9401.method670(true);
            }
         }

         if (method14497(arg0) || arg0 == 9 || arg0 == 0) {
            Statics.field8847.method2520();
         }

         field2410 = arg0;
      }
   }

   @deob.ObfuscatedName("client.ec(B)V")
   private void method4557() {
      boolean var1 = Statics.field9401.method669();
      if (!var1) {
         this.method4558();
      }

   }

   @deob.ObfuscatedName("client.er(I)V")
   private void method4558() {
      if (Statics.field9401.field5732 > field2448) {
         Statics.field8789.method15276();
         field2446 = Statics.field9401.field5732 * 250 - 250;
         if (field2446 > 3000) {
            field2446 = 3000;
         }

         if (Statics.field9401.field5732 >= 2 && Statics.field9401.field5724 == 6) {
            this.method9774("js5connect_outofdate");
            field2410 = 13;
            return;
         }

         if (Statics.field9401.field5732 >= 1 && Statics.field9401.field5724 == 48) {
            this.method9774("sessionexpired");
            field2410 = 13;
            return;
         }

         if (Statics.field9401.field5732 >= 4 && Statics.field9401.field5724 == -1) {
            this.method9774("js5crc");
            field2410 = 13;
            return;
         }

         if (Statics.field9401.field5732 >= 4 && Statics.method2265(field2410)) {
            if (Statics.field9401.field5724 != 7 && Statics.field9401.field5724 != 9) {
               if (Statics.field9401.field5724 > 0) {
                  if (field2450 == null) {
                     this.method9774("js5connect");
                  } else {
                     this.method9774("js5proxy_" + field2450.trim());
                  }
               } else {
                  this.method9774("js5io");
               }
            } else {
               this.method9774("js5connect_full");
            }

            field2410 = 13;
            return;
         }
      }

      field2448 = Statics.field9401.field5732;
      if (field2446 > 0) {
         --field2446;
      } else {
         try {
            if (field2445 == 0) {
               Statics.field8566 = Statics.field8789.method15275();
               ++field2445;
            }

            if (field2445 == 1) {
               Statics.field7081 = class711.method14916(Statics.field8566, 125000);
               int var1 = 9 + field2636.length();
               class124 var2 = new class124(var1 + 2);
               var2.method1568(class576.field5280.field5290);
               var2.method1568(var1);
               var2.method1572(742);
               var2.method1572(1);
               var2.method1577(field2636);
               Statics.field7081.method1530(var2.field931, 0, var1 + 2);
               ++field2445;
               Statics.field9664 = class431.method2169();
            }

            if (field2445 == 2) {
               if (Statics.field7081.method1527(1)) {
                  byte[] var3 = new byte[1];
                  int var4 = Statics.field7081.method1541(var3, 0, 1);
                  if (var3[0] != 0) {
                     this.method4559(var4);
                     return;
                  }

                  ++field2445;
               } else if (class431.method2169() - Statics.field9664 > 30000L) {
                  this.method4559(1001);
                  return;
               }
            }

            if (field2445 == 3) {
               class901[] var5 = class901.method15678();
               int var6 = var5.length * 4;
               if (Statics.field7081.method1527(var6)) {
                  class124 var7 = new class124(var6);
                  Statics.field7081.method1541(var7.field931, 0, var7.field931.length);

                  for(int var8 = 0; var8 < var5.length; ++var8) {
                     var5[var8].method15677(var7.method1591());
                  }

                  boolean var9 = Statics.method2265(field2410) || method15888(field2410) || method7373(field2410);
                  Statics.field9401.method682(Statics.field7081, !var9);
                  Statics.field8566 = null;
                  Statics.field7081 = null;
                  field2445 = 0;
               }
            }
         } catch (IOException var11) {
            this.method4559(1002);
         }

      }
   }

   @deob.ObfuscatedName("client.eu(IB)V")
   private void method4559(int arg0) {
      Statics.field8566 = null;
      Statics.field7081 = null;
      field2445 = 0;
      ++Statics.field9401.field5732;
      Statics.field9401.field5724 = arg0;
   }

   @deob.ObfuscatedName("aah.ek(ZI)V")
   public static void method272(boolean arg0) {
      if (arg0) {
         if (field2593 != -1) {
            class425.method15487(field2593);
         }

         for(class118 var1 = (class118)field2594.method15313(); var1 != null; var1 = (class118)field2594.method15314()) {
            if (!var1.method9863()) {
               var1 = (class118)field2594.method15313();
               if (var1 == null) {
                  break;
               }
            }

            Statics.method689(var1, true, false);
         }

         field2593 = -1;
         field2594 = new class875(8);
         class425.method15708();
         field2593 = Statics.field5740.field7283;
         Statics.method10286(false);
         method208();
         class783.method10196(field2593, (int[])null);
      }

      class385.method8948();
      class385.field2835 = false;
      class987.method15289();
      field2451 = -1;
      method4455(field2557);
      Statics.field5701 = new class211((class713)null);
      Statics.field5701.method11608((float)(field2468.method9648() * 512 / 2), 0.0F, (float)(field2468.method9604() * 512 / 2));
      Statics.field5701.field16[0] = field2468.method9648() / 2;
      Statics.field5701.field62[0] = field2468.method9604() / 2;
      Statics.field3115 = 0;
      Statics.field337 = 0;
      if (Statics.field5998 == 3) {
         Statics.field337 = Statics.field5127 << 9;
         Statics.field3115 = Statics.field1994 << 9;
      } else {
         method9226();
      }

      field2468.method9512().method11128();
   }

   @deob.ObfuscatedName("qh.ew(ZI)V")
   private static void method11179(boolean arg0) {
      if (arg0) {
         if (field2593 != -1) {
            class425.method15487(field2593);
         }

         for(class118 var1 = (class118)field2594.method15313(); var1 != null; var1 = (class118)field2594.method15314()) {
            if (!var1.method9863()) {
               var1 = (class118)field2594.method15313();
               if (var1 == null) {
                  break;
               }
            }

            Statics.method689(var1, true, false);
         }

         field2593 = -1;
         field2594 = new class875(8);
         class425.method15708();
         field2593 = Statics.field5740.field7284;
         Statics.method10286(false);
         method208();
         class783.method10196(field2593, (int[])null);
      }

      class385.field2835 = true;
   }

   @deob.ObfuscatedName("ch.el(Lei;ZIZI)Llc;")
   public static class612 method4523(class421 arg0, boolean arg1, int arg2, boolean arg3) {
      if (Statics.field8846 == null) {
         Statics.field8846 = new class41[class421.method5520()];
      }

      class704 var4 = null;
      int var5 = arg0.method5782();
      if (field6122 != null) {
         var4 = new class704(var5, field6122, Statics.field698[var5], 1500000);
      }

      Statics.field8846[var5] = Statics.field8782.method8984(var5, var4, Statics.field3797);
      Statics.field8846[var5].method628();
      return new class612(Statics.field8846[var5], arg1, arg2);
   }

   @deob.ObfuscatedName("ei.ex(IZB)V")
   public static void method5788(int arg0, boolean arg1) {
      method11282(arg0, class881.field8978.method15374(Statics.field243), arg1);
   }

   @deob.ObfuscatedName("qo.eo(ILjava/lang/String;ZI)V")
   private static void method11282(int arg0, String arg1, boolean arg2) {
      class590.method6239();
      method15141();
      method15486();
      method1274(arg0, arg1, arg2);
      Statics.field10616.method7866();
      Statics.field10616.method7865(field2430);
      class771.method7316(Statics.field8847);
      class771.method10818(Statics.field8847, Statics.field6723);
      class987.method5962();
      class987.method7391(Statics.field6914);
      method208();
      method7899();
      if (field2410 == 6) {
         method14844(5);
      } else if (field2410 == 15) {
         method14844(19);
      } else if (field2410 == 11) {
         method14844(7);
      } else if (field2410 == 1) {
         method14844(16);
      } else if (field2410 != 2 && field2410 != 10) {
         if (field2410 == 14) {
            method14844(17);
         } else if (field2410 == 16) {
            class98.method17090(false);
         }
      } else {
         class590.method8326();
      }

   }

   @deob.ObfuscatedName("adg.em(ILjava/lang/String;ZI)V")
   public static void method1274(int arg0, String arg1, boolean arg2) {
      if (arg0 == 0) {
         Statics.field8847 = class772.method10665(0, Statics.field5796, Statics.field6508, Statics.field6375, Statics.field9361.field946.method2226() * 2);
         if (arg1 != null) {
            Statics.field8847.method2522(1, 0);
            class883 var3 = class883.method2003(Statics.field4891, Statics.field7084, 0);
            class609 var4 = Statics.field8847.method7606(var3, (class998[])((class998[])class375.method5064(Statics.field6723, Statics.field7084, 0)), true);
            method3954();
            class327.method5400(arg1, true, Statics.field8847, var4, var3);
         }
      } else {
         label230: {
            class772 var5 = null;
            if (arg1 != null) {
               var5 = class772.method10665(0, Statics.field5796, Statics.field6508, Statics.field6375, 0);
               var5.method2522(1, 0);
               class883 var6 = class883.method2003(Statics.field4891, Statics.field7084, 0);
               class609 var7 = var5.method7606(var6, (class998[])((class998[])class375.method5064(Statics.field6723, Statics.field7084, 0)), true);
               method3954();
               class327.method5400(arg1, true, var5, var7, var6);
            }

            try {
               try {
                  Statics.field8847 = class772.method10665(arg0, Statics.field5796, Statics.field6508, Statics.field6375, Statics.field9361.field946.method2226() * 2);
                  if (arg1 != null) {
                     var5.method2522(1, 0);
                     class883 var8 = class883.method2003(Statics.field4891, Statics.field7084, 0);
                     class609 var9 = var5.method7606(var8, (class998[])((class998[])class375.method5064(Statics.field6723, Statics.field7084, 0)), true);
                     method3954();
                     class327.method5400(arg1, true, var5, var9, var8);
                  }

                  if (Statics.field8847.method7489()) {
                     boolean var10 = true;

                     try {
                        var10 = Statics.field8859.field845 > 256;
                     } catch (Throwable var26) {
                     }

                     class879 var12;
                     if (var10) {
                        var12 = Statics.field8847.method7526(146800640);
                     } else {
                        var12 = Statics.field8847.method7526(104857600);
                     }

                     Statics.field8847.method7709(var12);
                  }
                  break label230;
               } catch (Throwable var27) {
                  switch(arg0) {
                  case 1:
                     class864.method10009(class917.field9353);
                     break;
                  case 2:
                     class864.method10009(class917.field9351);
                     break;
                  case 3:
                     class864.method10009(class917.field9360);
                  }
               }

               int var15 = Statics.field9361.field974.method2236();
               if (var15 == 2) {
                  field2415 = true;
               }

               Statics.field9361.method1857(Statics.field9361.field974, 0);
               method1274(var15, arg1, arg2);
            } finally {
               if (var5 != null) {
                  try {
                     var5.method11494();
                  } catch (Throwable var25) {
                  }
               }

            }

            return;
         }
      }

      if (arg2) {
         Statics.field9361.method1858(Statics.field9361.field974, !arg2);
      }

      Statics.field9361.method1857(Statics.field9361.field974, arg0);
      if (!arg2) {
         Statics.field9361.method1858(Statics.field9361.field974, !arg2);
      }

      Statics.method7420();
      Statics.field8847.method7695(10000);
      Statics.field8847.method7549(32);
      field2468.method9534();
      if (Statics.field8847.method7492()) {
         method4043(Statics.field9361.field954.method2163() == 1);
      }

      field2468.method9533();
      field2468.method9512().method11128();
      field2419 = false;
      field2429 = true;
      Statics.field9396 = null;
      Statics.field8847.method7507(0.0F, 1.0F);
   }

   @deob.ObfuscatedName("vq.en(Lko;ZFFFFIIB)V")
   private static void method15586(class597 arg0, boolean arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
      int var8 = field2468.method9517();
      int var9 = field2468.method9516();
      arg0.method8411(arg2, arg3, arg4, arg5, (float)var9, (float)var8, (float)arg6, (float)arg7);
   }

   @deob.ObfuscatedName("ug.et(B)V")
   private static void method15141() {
      if (Statics.field8847 != null) {
         field2468.method9613();
         class299.method8733();
         class987.method5962();
         Statics.method8262();
         field2468.method9533();
         class656.method6506();
         method14300(false);
         class771.method15379();
         Statics.method15823(true);
         class131.method11281();
         class590.method8326();

         for(int var0 = 0; var0 < field2424.length; ++var0) {
            if (field2424[var0] != null) {
            }
         }

         for(int var1 = 0; var1 < 2048; ++var1) {
            class211 var2 = field2408[var1];
            if (var2 != null) {
               for(int var3 = 0; var3 < var2.field70.length; ++var3) {
                  var2.field70[var3] = null;
               }
            }
         }

         for(int var4 = 0; var4 < field2492; ++var4) {
            class200 var5 = (class200)field2453[var4].field807;
            if (var5 != null) {
               for(int var6 = 0; var6 < var5.field70.length; ++var6) {
                  var5.field70[var6] = null;
               }
            }
         }

         field2494.method15312();
         Statics.field8847.method11494();
         Statics.field8847 = null;
      }

   }

   @deob.ObfuscatedName("vi.ej(I)V")
   private static void method15486() {
      Statics.field2111.method1806();
      Statics.field336.method1898();
      Statics.field561.method9761();
      Statics.field5796.setBackground(Color.black);
      field2421 = -1;
      Statics.field2111 = class692.method2199(Statics.field5796);
      Statics.field336 = class706.method15263(Statics.field5796, true);
   }

   @deob.ObfuscatedName("p.ez(B)V")
   private static void method10657() {
      if (Statics.field8847.method7484()) {
         Statics.field8847.method11500(Statics.field5796);
         method15486();
         Dimension var0 = Statics.field5796.getSize();
         Statics.field8847.method11495(Statics.field5796, var0.width, var0.height);
         Statics.field8847.method11519(Statics.field5796);
      } else {
         method5788(Statics.field9361.field974.method2236(), false);
      }

      method208();
   }

   @deob.ObfuscatedName("qr.eh(IIB)I")
   public static int method11313(int arg0, int arg1) {
      if (Statics.field5740.field7287 == -1) {
         return 1;
      } else {
         if (arg0 != Statics.field9361.field974.method2236()) {
            method11282(arg0, class881.field8885.method15374(Statics.field243), true);
            if (Statics.field9361.field974.method2236() != arg0) {
               return -1;
            }
         }

         try {
            Dimension var2 = Statics.field5796.getSize();
            class327.method5400(class881.field8885.method15374(Statics.field243), true, Statics.field8847, Statics.field6177, Statics.field7094);
            class396 var3 = class396.method5419(Statics.field8828, Statics.field5740.field7287, 0);
            long var4 = class431.method2169();
            Statics.field8847.method7508();
            field2672.method8071(0.0F, 256.0F, 0.0F);
            Statics.field8847.method7778(field2672);
            class597 var6 = Statics.field8847.method7509();
            var6.method8411((float)(var2.width / 2), (float)(var2.height / 2), 512.0F, 512.0F, (float)field2468.method9516(), (float)field2468.method9517(), (float)var2.width, (float)var2.height);
            Statics.field8847.method7545(var6);
            Statics.field8847.method7547(1.0F);
            Statics.field8847.method7588(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class745 var7 = Statics.field8847.method7528(var3, 2048, 64, 64, 768);
            int var8 = 0;

            label42:
            for(int var9 = 0; var9 < 500; ++var9) {
               Statics.field8847.method2522(3, 0);

               for(int var10 = 15; var10 >= 0; --var10) {
                  for(int var11 = 0; var11 <= var10; ++var11) {
                     field2413.method8071((float)((int)(((float)var11 - (float)var10 / 2.0F) * 512.0F)), 0.0F, (float)((var10 + 1) * 512));
                     var7.method7001(field2413, (class394)null, 0);
                     ++var8;
                     if (class431.method2169() - var4 >= (long)arg1) {
                        break label42;
                     }
                  }
               }
            }

            Statics.field8847.method2507();
            long var12 = (long)(var8 * 1000) / (class431.method2169() - var4);
            Statics.field8847.method2522(3, 0);
            return (int)var12;
         } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
         }
      }
   }

   @deob.ObfuscatedName("nw.eq(I)I")
   public static int method10038() {
      if (class854.field8745 && Statics.field688 != null) {
         return 3;
      } else {
         return field2640 ? 2 : 1;
      }
   }

   @deob.ObfuscatedName("oe.ev(IIIZI)V")
   public static void method10176(int arg0, int arg1, int arg2, boolean arg3) {
      field2551 = 0L;
      int var4 = method10038();
      if (arg0 == 3 || var4 == 3) {
         arg3 = true;
      }

      if (!Statics.field8847.method7491()) {
         arg3 = true;
      }

      method14064(var4, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ro.eb(IIIIZI)V")
   private static void method14064(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      if (class854.field8745 && Statics.field688 != null && (arg1 != 3 || Statics.field3666 != arg2 || Statics.field3600 != arg3)) {
         Statics.method9727(Statics.field6776, Statics.field688);
         Statics.field688 = null;
      }

      if (class854.field8745 && arg1 == 3 && Statics.field688 == null) {
         Statics.field688 = class854.method9705(Statics.field6776, arg2, arg3, 0, 0);
         if (Statics.field688 != null) {
            Statics.field3666 = arg2;
            Statics.field3600 = arg3;
            class29.method7336();
         }
      }

      if (arg1 == 3 && (!class854.field8745 || Statics.field688 == null)) {
         method14064(arg0, Statics.field9361.field967.method2066(), -1, -1, true);
      } else {
         Container var5 = class671.method8973();
         if (Statics.field688 != null) {
            Statics.field9255 = arg2;
            Statics.field7012 = arg3;
         } else if (Statics.field4149 != null) {
            Insets var6 = Statics.field4149.getInsets();
            int var10001 = var6.right + var6.left;
            Statics.field9255 = Statics.field4149.getSize().width - var10001;
            int var9 = var6.top + var6.bottom;
            Statics.field7012 = Statics.field4149.getSize().height - var9;
         } else {
            Statics.field9255 = var5.getSize().width;
            Statics.field7012 = var5.getSize().height;
         }

         if (Statics.field9255 <= 0) {
            Statics.field9255 = 1;
         }

         if (Statics.field7012 <= 0) {
            Statics.field7012 = 1;
         }

         if (arg1 != 1) {
            method10700();
         } else {
            Statics.field6104 = field2555;
            field6105 = (Statics.field9255 - field2555) / 2;
            Statics.field6354 = field2556;
            field6119 = 0;
         }

         if (class819.field8428 != Statics.field4896 && Statics.field6104 < 1024 && Statics.field6354 < 768) {
         }

         if (!arg4) {
            Statics.field5796.setSize(Statics.field6104, Statics.field6354);
            Statics.field8847.method11521(Statics.field5796, Statics.field6104, Statics.field6354);
            if (Statics.field4149 == var5) {
               Insets var7 = Statics.field4149.getInsets();
               Statics.field5796.setLocation(field6105 + var7.left, field6119 + var7.top);
            } else {
               Statics.field5796.setLocation(field6105, field6119);
            }
         } else {
            method10657();
         }

         if (arg1 >= 2) {
            field2640 = true;
         } else {
            field2640 = false;
         }

         method16303();
         if (field2593 != -1) {
            Statics.method10286(true);
         }

         if (field2463.method1413() != null && method6612(field2410)) {
            method15555();
         }

         for(int var8 = 0; var8 < 103; ++var8) {
            field2558[var8] = true;
         }

         field6112 = true;
      }
   }

   @deob.ObfuscatedName("vm.ep(I)V")
   public static void method15555() {
      class109 var0 = class109.method15110(ClientProt.WINDOW_STATUS, field2463.field832);
      var0.field814.method1568(method10038());
      var0.field814.method1569(Statics.field6104);
      var0.field814.method1569(Statics.field6354);
      var0.field814.method1568(Statics.field9361.field946.method2226());
      field2463.method1408(var0);
   }

   @deob.ObfuscatedName("kf.eg(I)V")
   public static void method8285() {
      client var0 = Statics.field561;
      synchronized(Statics.field561) {
         if (Statics.field688 == null) {
            Container var1 = class671.method8973();
            if (var1 != null) {
               Statics.field9255 = var1.getSize().width;
               Statics.field7012 = var1.getSize().height;
               if (Statics.field4149 == var1) {
                  Insets var2 = Statics.field4149.getInsets();
                  Statics.field9255 -= var2.right + var2.left;
                  Statics.field7012 -= var2.top + var2.bottom;
               }

               if (Statics.field9255 <= 0) {
                  Statics.field9255 = 1;
               }

               if (Statics.field7012 <= 0) {
                  Statics.field7012 = 1;
               }

               if (method10038() != 1) {
                  method10700();
               } else {
                  Statics.field6104 = field2555;
                  field6105 = (Statics.field9255 - field2555) / 2;
                  Statics.field6354 = field2556;
                  field6119 = 0;
               }

               if (class819.field8428 != Statics.field4896 && Statics.field6104 < 1024 && Statics.field6354 < 768) {
               }

               Statics.field5796.setSize(Statics.field6104, Statics.field6354);
               if (Statics.field8847 != null) {
                  Statics.field8847.method11521(Statics.field5796, Statics.field6104, Statics.field6354);
               }

               if (Statics.field4149 == var1) {
                  Insets var3 = Statics.field4149.getInsets();
                  Statics.field5796.setLocation(field6105 + var3.left, field6119 + var3.top);
               } else {
                  Statics.field5796.setLocation(field6105, field6119);
               }

               method16303();
               if (field2593 != -1) {
                  Statics.method10286(true);
               }

               method3954();
            }
         }
      }
   }

   @deob.ObfuscatedName("yr.ey(B)V")
   private static void method16303() {
      int var0 = Statics.field6104;
      int var1 = Statics.field6354;
      if (Statics.field9255 < var0) {
         var0 = Statics.field9255;
      }

      if (Statics.field7012 < var1) {
         var1 = Statics.field7012;
      }

      try {
         class573.field5182.method7998(new Object[]{var0, var1, method10038(), Statics.field9361.field973.method2137()});
      } catch (Throwable var3) {
      }

   }

   @deob.ObfuscatedName("pd.fs(I)V")
   private static void method10700() {
      int var0 = 0;
      if (Statics.field9361 != null) {
         var0 = Statics.field9361.field973.method2137();
      }

      if (var0 == 2) {
         int var1 = Statics.field9255 > 800 ? 800 : Statics.field9255;
         int var2 = Statics.field7012 > 600 ? 600 : Statics.field7012;
         Statics.field6104 = var1;
         field6105 = (Statics.field9255 - var1) / 2;
         Statics.field6354 = var2;
         field6119 = 0;
      } else if (var0 == 1) {
         int var3 = Statics.field9255 > 1024 ? 1024 : Statics.field9255;
         int var4 = Statics.field7012 > 768 ? 768 : Statics.field7012;
         Statics.field6104 = var3;
         field6105 = (Statics.field9255 - var3) / 2;
         Statics.field6354 = var4;
         field6119 = 0;
      } else {
         Statics.field6104 = Statics.field9255;
         field6105 = 0;
         Statics.field6354 = Statics.field7012;
         field6119 = 0;
      }

   }

   @deob.ObfuscatedName("an.fk(I)V")
   public static void method3954() {
      if (Statics.field688 == null) {
         int var0 = field6105;
         int var1 = field6119;
         int var2 = Statics.field9255 - Statics.field6104 - var0;
         int var3 = Statics.field7012 - Statics.field6354 - var1;
         if (var0 > 0 || var2 > 0 || var1 > 0 || var3 > 0) {
            try {
               Container var4 = class671.method8973();
               int var5 = 0;
               int var6 = 0;
               if (Statics.field4149 == var4) {
                  Insets var7 = Statics.field4149.getInsets();
                  var5 = var7.left;
                  var6 = var7.top;
               }

               Graphics var8 = var4.getGraphics();
               var8.setColor(Color.black);
               if (var0 > 0) {
                  var8.fillRect(var5, var6, var0, Statics.field7012);
               }

               if (var1 > 0) {
                  var8.fillRect(var5, var6, Statics.field9255, var1);
               }

               if (var2 > 0) {
                  var8.fillRect(Statics.field9255 + var5 - var2, var6, var2, Statics.field7012);
               }

               if (var3 > 0) {
                  var8.fillRect(var5, Statics.field7012 + var6 - var3, Statics.field9255, var3);
               }
            } catch (Exception var10) {
            }
         }

      }
   }

   @deob.ObfuscatedName("at.fc(ZI)Z")
   public static boolean method4043(boolean arg0) {
      boolean var1 = Statics.field8847.method7574();
      if (arg0 != var1) {
         if (arg0) {
            if (!Statics.field8847.method7558()) {
               arg0 = false;
            }
         } else {
            Statics.field8847.method7559();
         }

         if (arg0 != var1) {
            Statics.field9361.method1857(Statics.field9361.field954, arg0 ? 1 : 0);
            class29.method7336();
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("cc.fn(II)V")
   private static void method4455(int arg0) {
      if (Statics.field9361.field978.method2381() == 0) {
         arg0 = -1;
      }

      if (field2421 != arg0) {
         if (arg0 != -1) {
            class885 var1 = Statics.field2839.method15455(arg0);
            class407 var2 = var1.method15435();
            if (var2 != null) {
               Statics.field3759.setcustomcursor(Statics.field5796, var2.method5555(true), var2.method5547(), var2.method5548(), new Point(var1.field9066, var1.field9067));
               field2421 = arg0;
            } else {
               arg0 = -1;
            }
         }

         if (arg0 == -1 && field2421 != -1) {
            Statics.field3759.setcustomcursor(Statics.field5796, (int[])null, -1, -1, new Point());
            field2421 = -1;
         }

      }
   }

   @deob.ObfuscatedName("jb.fl(I)V")
   public static void method7899() {
      int var0 = 0;
      if (Statics.field9361.field951.method1448() == 1) {
         int var1 = var0 | 1;
         int var2 = var1 | 16;
         int var3 = var2 | 32;
         int var4 = var3 | 2;
         var0 = var4 | 4;
      }

      if (Statics.field9361.field972.method2268() == 0) {
         var0 |= 64;
      }

      class425.method1073(var0);
      field2468.method9636().method14635(var0);
      Statics.field4892.method8956().method9636().method14635(var0);
      Statics.field4196.method15546(var0);
      Statics.field93.method15846(var0);
      Statics.field3758.method14206(var0);
      class164.method6476(var0);
      class684.method583(var0);
      class547.method8017(var0);
      class747.method10815(var0);
      class72.method6546(var0);
      field2468.method9531();
   }

   @deob.ObfuscatedName("fc.fo(B)V")
   public static final void method6227() {
      field2475 = -1;
      field2476 = 2;
      Statics.field2786 = (int[][])null;
      Statics.field3803 = null;
      class397.method11737();
   }

   @deob.ObfuscatedName("acv.fz(B)V")
   public static final void method1102() {
      method6227();
      field2468.method9563();

      for(int var0 = 0; var0 < field2423.length; ++var0) {
         field2423[var0] = null;
      }

      for(int var1 = 0; var1 < field2424.length; ++var1) {
         field2424[var1] = null;
      }

      class324.method14496();

      for(int var2 = 0; var2 < 2048; ++var2) {
         field2408[var2] = null;
      }

      field2455 = 0;
      field2615.method15312();
      field2492 = 0;
      field2576.method15312();
      method6770();
      field2465 = 0;
      Statics.field10637.method6141();
      Statics.field10534 = null;
      Statics.field9397 = null;
      Statics.field3822 = null;
      Statics.field4336 = null;
      Statics.field207 = null;
      Statics.field5703 = 0L;
      class987.method11730();
      class987.method5514();
   }

   @deob.ObfuscatedName("ds.fb(ZS)V")
   public static final void method5519(boolean arg0) {
      class110[] var1 = field2464;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class110 var3 = var1[var2];

         try {
            var3.method1407();
         } catch (IOException var7) {
         }

         var3.method1411();
      }

      class385.method15553();
      method14300(false);
      field2468.method9613();
      field2468.method9563();
      Statics.method15823(false);
      class744.method9884();
      class417.method6598(2);
      class677.field6149 = -1;
      class677.field6153 = false;
      class677.method8735();
      class98.method17090(true);
      class131.method4057();
      class131.method15862();
      method1102();
      if (arg0) {
         method14844(4);
      } else {
         method14844(6);

         try {
            class855.method15072(Statics.field6978, "loggedout");
         } catch (Throwable var6) {
         }
      }

   }

   @deob.ObfuscatedName("acx.ft(I)V")
   private static final void method1107() {
      Statics.field1613.method14054(5);
      Statics.field8466.method15100(5);
      Statics.field9434.method6629(5);
      field2468.method9636().method14642(5);
      Statics.field93.method15843(5);
      Statics.field4196.method15530(5);
      Statics.field2046.method14477(5);
      Statics.field3758.method14205(5);
      Statics.field5610.method10759(5);
      Statics.field8710.method7910(5);
      Statics.field490.method15358(5);
      Statics.field3060.method14245(5);
      Statics.field6159.method15924(5);
      Statics.field9068.method11316(5);
      Statics.field8402.method10800(5);
      Statics.field6782.method10686(5);
      Statics.field7163.method15833(5);
      Statics.field5946.method15933(5);
      Statics.field7125.method10384(5);
      Statics.field6768.method6243(5);
      Statics.field6797.method15591(5);
      Statics.field2839.method15446(5);
      Statics.field5741.method10936(5);
      Statics.field2958.method10170(5);
      Statics.method6464(5);
      class425.method7467(50);
      Statics.field10616.method7874(50);
      class164.method8284(5);
      Statics.method666(5);
      field2516.method10882(5);
      class987.field10523.method10882(5);
      class783.field7172.method10882(5);
   }

   @deob.ObfuscatedName("ec.fr(I)V")
   public static final void method5685() {
      Statics.field1613.method14055();
      Statics.field8466.method15108();
      Statics.field9434.method6638();
      field2468.method9636().method14638();
      Statics.field93.method15860();
      Statics.field4196.method15531();
      Statics.field2046.method14483();
      Statics.field3758.method14212();
      Statics.field5610.method10753();
      Statics.field8710.method7907();
      Statics.field490.method15359();
      Statics.field3060.method14246();
      Statics.field6159.method15925();
      Statics.field9068.method11319();
      Statics.field8402.method10798();
      Statics.field7163.method15834();
      Statics.field6782.method10684();
      Statics.field5946.method15940();
      Statics.field7125.method10378();
      Statics.field6768.method6250();
      Statics.field6797.method15592();
      Statics.field2839.method15447();
      Statics.field5741.method10937();
      Statics.field2958.method10173();
      class747.method10472();
      class425.method7938();
      Statics.field10616.method7882();
      class164.method9726();
      class547.method9118();
      field2516.method10887();
      class987.field10523.method10887();
      class783.field7172.method10887();
   }

   @deob.ObfuscatedName("sf.ff(ZI)V")
   public static final void method14300(boolean arg0) {
      if (!arg0) {
         Statics.field1613.method14042();
         Statics.field8466.method15106();
         Statics.field9434.method6628();
         field2468.method9636().method14641();
         Statics.field93.method15847();
         Statics.field4196.method15527();
         Statics.field2046.method14476();
         Statics.field3758.method14207();
         Statics.field5610.method10752();
         Statics.field8710.method7909();
         Statics.field490.method15360();
         Statics.field3060.method14250();
         Statics.field6159.method15923();
         Statics.field9068.method11322();
         Statics.field8402.method10797();
         Statics.field7163.method15839();
         Statics.field6782.method10687();
         Statics.field5946.method15932();
         Statics.field7125.method10376();
         Statics.field6768.method6242();
         Statics.field6797.method15590();
         Statics.field2839.method15450();
         Statics.field5741.method10935();
         Statics.field2958.method10169();
         class747.method6855();
         Statics.method5381();
         Statics.field10616.method7892();
         class72.method15304();
         if (class819.field8428 != Statics.field4896) {
            for(int var1 = 0; var1 < Statics.field9400.length; ++var1) {
               Statics.field9400[var1] = null;
            }

            field2595 = 0;
         }

         field2468.method9512().method11155();
         class164.method15493();
         class547.method9965();
         class539.method6576();
         class537.method3850();
         class783.field7172.method10883();
         field2516.method10883();
         class987.field10523.method10883();
      }

      class795.method9946();
      Statics.method7420();
   }

   @deob.ObfuscatedName("aaf.fj(I)V")
   public static final void method248() {
      if (!method7373(field2410) && !method15888(field2410)) {
         Statics.field5815 = field2463.method1413();
         field2463.method1431();
         method14844(9);
      } else {
         method5519(false);
      }
   }

   @deob.ObfuscatedName("aat.fq(B)V")
   public static void method430() {
      class860 var0 = null;

      try {
         var0 = class671.method9175("2", field2584.field7302, true);
         class124 var1 = new class124(field2472 * 6 + 3);
         var1.method1568(1);
         var1.method1569(field2472);

         for(int var2 = 0; var2 < Statics.field8854.length; ++var2) {
            if (Statics.field8400[var2]) {
               var1.method1569(var2);
               var1.method1572(Statics.field8854[var2]);
            }
         }

         var0.method15146(var1.field931, 0, var1.field935);
      } catch (Exception var6) {
      }

      try {
         if (var0 != null) {
            var0.method15151();
         }
      } catch (Exception var5) {
      }

      field2645 = class431.method2169();
      field2644 = false;
   }

   @deob.ObfuscatedName("client.fw(I)V")
   private final void method4560() {
      if (field2410 == 15 && !class385.method14262() || field2410 == 11 && class385.field2832 == 42 || field2410 == 3 && (class385.field2802 == 49 || class385.field2802 == 52) || field2410 == 14) {
         if (field2479 > 1) {
            --field2479;
            field2641 = field2447;
         }

         if (!class987.field10492) {
            class987.method5514();
         }

         if (field2410 != 3 || class385.field2802 != 49 && class385.field2802 != 52) {
            for(int var1 = 0; var1 < 100 && method15380(field2462); ++var1) {
            }
         }
      }

      method16869();
      class762.method11097();
      ++field2505;
      class987.method9122(-1, -1);
      Statics.method14170((class425)null, -1, -1);
      method14629();
      ++field2447;

      for(int var2 = 0; var2 < field2492; ++var2) {
         class200 var3 = (class200)field2453[var2].field807;
         if (var3 != null) {
            byte var4 = var3.field1312.field9301;
            if ((var4 & 1) != 0) {
               int var5 = var3.method96();
               if ((var4 & 2) != 0 && var3.field60 == 0 && Math.random() * 1000.0D < 10.0D) {
                  int var6 = (int)Math.round(Math.random() * 10.0D - 5.0D);
                  int var7 = (int)Math.round(Math.random() * 10.0D - 5.0D);
                  if (var6 != 0 || var7 != 0) {
                     int var8 = var3.field16[0] + var6;
                     int var9 = var3.field62[0] + var7;
                     if (var8 < 0) {
                        var8 = 0;
                     } else if (var8 > field2468.method9648() - var5 - 1) {
                        var8 = field2468.method9648() - var5 - 1;
                     }

                     if (var9 < 0) {
                        var9 = 0;
                     } else if (var9 > field2468.method9604() - var5 - 1) {
                        var9 = field2468.method9604() - var5 - 1;
                     }

                     int var10 = Statics.method16263(var3.field16[0], var3.field62[0], var5, class720.method8678(var8, var9, var5, var5, 0), field2468.method9521(var3.field1032), true, field2489, field2660);
                     if (var10 > 0) {
                        if (var10 > 9) {
                           var10 = 9;
                        }

                        for(int var11 = 0; var11 < var10; ++var11) {
                           var3.field16[var11] = field2489[var10 - var11 - 1];
                           var3.field62[var11] = field2660[var10 - var11 - 1];
                           var3.field63[var11] = class647.field5875.field5871;
                        }

                        var3.field60 = var10;
                     }
                  }
               }

               method14657(var3, true);
               int var12 = method15907(var3);
               method5183(var3);
               method6769(var3, Statics.field5809, Statics.field3572, var12);
               method11115(var3, Statics.field5809);
               Statics.method15828(var3);
               class606 var13 = class606.method8602();
               var13.method8613(class603.method8577(var3.field57.method6560()), class603.method8577(var3.field51.method6560()), class603.method8577(var3.field58.method6560()));
               var3.method11606(var13);
               var13.method8654();
            }
         }
      }

      if ((field2410 == 6 || field2410 == 11 || field2410 == 15 || field2410 == 14) && (!class385.method14262() || field2410 == 11 && class385.field2832 == 42 || field2410 == 3 && (class385.field2802 == 49 || class385.field2802 == 52)) && !Statics.method3955()) {
         if (Statics.field5998 == 3) {
            method10853();
         } else {
            method9226();
         }

         if (Statics.field337 >> 9 < 14 || Statics.field337 >> 9 >= field2468.method9648() - 14 || Statics.field3115 >> 9 < 14 || Statics.field3115 >> 9 >= field2468.method9604() - 14) {
            field2468.method9537(new class650(class657.field5997, (class251)null));
         }
      }

      while(true) {
         class90 var14;
         class425 var15;
         class425 var16;
         do {
            var14 = (class90)field2653.method14961();
            if (var14 == null) {
               while(true) {
                  class90 var17;
                  class425 var18;
                  class425 var19;
                  do {
                     var17 = (class90)field2648.method14961();
                     if (var17 == null) {
                        while(true) {
                           class90 var20;
                           class425 var21;
                           class425 var22;
                           do {
                              var20 = (class90)field2646.method14961();
                              if (var20 == null) {
                                 if (field2501 != null) {
                                    method10102();
                                 }

                                 if (field2418 % 1500 == 0) {
                                    Statics.method15303();
                                 }

                                 if (field2410 == 15 && !class385.method14262() || field2410 == 11 && class385.field2832 == 42 || field2410 == 3 && (class385.field2802 == 49 || class385.field2802 == 52)) {
                                    class987.method11189();
                                 }

                                 Statics.method3383();
                                 if (field2644 && field2645 < class431.method2169() - 60000L) {
                                    method430();
                                 }

                                 for(class61 var23 = (class61)field2670.method14798(); var23 != null; var23 = (class61)field2670.method14793()) {
                                    if ((long)var23.field439 < class431.method2169() / 1000L - 5L) {
                                       if (var23.field441 > 0) {
                                          class419.method3849(5, 0, "", "", "", var23.field440 + class881.field9005.method15374(Statics.field243));
                                       }

                                       if (var23.field441 == 0) {
                                          class419.method3849(5, 0, "", "", "", var23.field440 + class881.field9006.method15374(Statics.field243));
                                       }

                                       var23.method9960();
                                    }
                                 }

                                 if (field2410 == 15 && !class385.method14262() || field2410 == 11 && class385.field2832 == 42 || field2410 == 3 && (class385.field2802 == 49 || class385.field2802 == 52) || field2410 == 14) {
                                    if (field2410 != 11 && field2462.method1413() == null) {
                                       method5519(false);
                                       return;
                                    }

                                    if (field2462 != null) {
                                       ++field2462.field820;
                                       if (field2462.field820 > 50) {
                                          class109 var24 = class109.method15110(ClientProt.NO_TIMEOUT, field2462.field832);
                                          field2462.method1408(var24);
                                       }

                                       try {
                                          field2462.method1407();
                                       } catch (IOException var26) {
                                          if (field2410 == 11) {
                                             field2462.method1411();
                                          } else {
                                             method5519(false);
                                          }
                                       }
                                    }
                                 }

                                 return;
                              }

                              var21 = var20.field679;
                              if (var21.field3401 < 0) {
                                 break;
                              }

                              var22 = class425.method11190(var21.field3462);
                           } while(var22 == null || var22.field3551 == null || var21.field3401 >= var22.field3551.length || var22.field3551[var21.field3401] != var21);

                           class783.method15429(var20);
                        }
                     }

                     var18 = var17.field679;
                     if (var18.field3401 < 0) {
                        break;
                     }

                     var19 = class425.method11190(var18.field3462);
                  } while(var19 == null || var19.field3551 == null || var18.field3401 >= var19.field3551.length || var19.field3551[var18.field3401] != var18);

                  class783.method15429(var17);
               }
            }

            var15 = var14.field679;
            if (var15.field3401 < 0) {
               break;
            }

            var16 = class425.method11190(var15.field3462);
         } while(var16 == null || var16.field3551 == null || var15.field3401 >= var16.field3551.length || var16.field3551[var15.field3401] != var15);

         class783.method15429(var14);
      }
   }

   @deob.ObfuscatedName("vf.fe(B)V")
   private static final void method15441() {
      if (field2479 > 1) {
         --field2479;
         field2641 = field2447;
      }

      if (field2463.field840) {
         field2463.field840 = false;
         method248();
      } else {
         if (!class987.field10492) {
            class987.method5514();
         }

         for(int var0 = 0; var0 < 100 && method15380(field2463); ++var0) {
         }

         if (field2410 == 1) {
            while(class896.method10959()) {
               class109 var1 = class109.method15110(ClientProt.REFLECTION_CHECK_REPLY, field2463.field832);
               var1.field814.method1568(0);
               int var2 = var1.field814.field935;
               class896.method9947(var1.field814);
               var1.field814.method1664(var1.field814.field935 - var2);
               field2463.method1408(var1);
            }

            if (Statics.field207 != null) {
               if (Statics.field207.field7185 != -1) {
                  class109 var3 = class109.method15110(ClientProt.PING_STATISTICS, field2463.field832);
                  if (Statics.field9429 == null || !Statics.field9429.isValid()) {
                     try {
                        Iterator var4 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                        while(var4.hasNext()) {
                           GarbageCollectorMXBean var5 = (GarbageCollectorMXBean)var4.next();
                           if (var5.isValid()) {
                              Statics.field9429 = var5;
                              field2706 = -1L;
                              field2705 = -1L;
                           }
                        }
                     } catch (Throwable var46) {
                     }
                  }

                  long var7 = class431.method2169();
                  int var9 = -1;
                  if (Statics.field9429 != null) {
                     long var10 = Statics.field9429.getCollectionTime();
                     if (field2705 != -1L) {
                        long var12 = var10 - field2705;
                        long var14 = var7 - field2706;
                        if (var14 != 0L) {
                           var9 = (int)(var12 * 100L / var14);
                        }
                     }

                     field2705 = var10;
                     field2706 = var7;
                  }

                  var3.field814.method1772(var9);
                  var3.field814.method1718(Statics.field207.field7185);
                  var3.field814.method1738(field6099);
                  field2463.method1408(var3);
                  Statics.field207 = null;
                  Statics.field5703 = var7 + 30000L;
               }
            } else if (class431.method2169() >= Statics.field5703) {
               Statics.field207 = field2467.method11637(Statics.field8789.field8849);
            }

            Statics.method15601();
            Statics.method11085();
            class102 var16 = (class102)field2434.method14964();
            if (field2468.method9639() != null) {
               if (Statics.field5998 == 3) {
                  method10853();
               } else if (Statics.field5998 == 1) {
                  method9226();
               }
            }

            if (field2668) {
               field2668 = false;
            } else {
               field2511 /= 2.0F;
            }

            if (field2513) {
               field2513 = false;
            } else {
               field2608 /= 2.0F;
            }

            if (class744.method14383()) {
               class744.method7968();
            } else {
               try {
                  if (Statics.field5998 != 2) {
                     Statics.field6895.method6291(class443.field3668);
                     if (Statics.field6895.method6316() == null) {
                        Statics.field6895.method6293(class444.field3676, false);
                     }

                     if (Statics.field6895.method6373() == null) {
                        Statics.field6895.method6292(class449.field3707, false);
                     }

                     if (Statics.field6895.method6320() != class444.field3676) {
                        Statics.field6895.method6293(class444.field3676, false);
                     }

                     Statics.field6895.method6301(class584.method8136(99999.0F, 99999.0F, 99999.0F));
                     Statics.field6895.method6299(class584.method8136(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
                     class5 var17 = (class5)Statics.field6895.method6316();
                     class723 var18 = field2468.method9649();
                     var17.method205(class88.method15740(Statics.field1977, Statics.field337 + var18.field6676 * 512, -Statics.field6719, Statics.field3115 + var18.field6677 * 512));
                     if (Statics.field6895.method6313() != class449.field3707) {
                        Statics.field6895.method6292(class449.field3707, false);
                     }

                     Statics.field6895.method6300(class584.method8136(99999.0F, 99999.0F, 99999.0F));
                     Statics.field6895.method6374(class584.method8136(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
                     class178 var19 = (class178)Statics.field6895.method6373();
                     var19.method2430(Statics.field5701.method2823());
                  }

                  Statics.field6895.method6289((float)(class431.method2169() - Statics.field3791) / 1000.0F, field2468.method9521(Statics.field1977), field2468.method9528().field5626);
                  Statics.field3791 = class431.method2169();
               } catch (class168 var45) {
               }
            }

            Statics.method5340();
            if (field2410 == 1) {
               field2468.method9512().method11137(field2468);
               class75.method6528();
               class677.method6623();
               if (field2498 > 10) {
                  ++field2463.field831;
               }

               if (field2463.field831 > 2250) {
                  method248();
               } else {
                  if (field2476 == 2) {
                     method9712();
                     method14503();
                  } else if (Statics.field3681.field7126.method10704(var16, field2441, field2458, Statics.field2111)) {
                     class397.method16041(false);
                  } else {
                     if (field2476 == 4 && class397.method1562(field2475)) {
                        field2468.method9537(new class650(class657.field5993, (class251)null));
                        field2476 = 3;
                     }

                     if (field2476 == 3 && field2410 != 16) {
                        class397.field2950.method15312();
                        field2476 = 0;
                        field2630 = field2418;
                        field2620 = 0;
                        Statics.method7346();
                     }

                     if (field2476 == 0) {
                        int var21 = field2418 - field2630;
                        if (field2620 < Statics.field2946.length) {
                           do {
                              class389 var22 = Statics.field2946[field2620];
                              if (var22.field2871 > var21) {
                                 break;
                              }

                              var22.method74();
                           } while(field2476 == 0 && ++field2620 < Statics.field2946.length);
                        }

                        if (field2476 == 0) {
                           for(int var23 = 0; var23 < Statics.field9261.length; ++var23) {
                              class411 var24 = Statics.field9261[var23];
                              if (var24.field3098) {
                                 class4 var25 = var24.method5645();
                                 method14352(var25, true);
                              }
                           }
                        }
                     }
                  }

                  method15205();
                  method10762();
                  method16869();
                  ++field2505;
                  if (field2517 != 0) {
                     field2539 += 20;
                     if (field2539 >= 400) {
                        field2517 = 0;
                     }
                  }

                  if (Statics.field9382 != null) {
                     ++field2541;
                     if (field2541 >= 15) {
                        method7309(Statics.field9382);
                        Statics.field9382 = null;
                     }
                  }

                  field2607 = null;
                  field2613 = false;
                  field2512 = false;
                  Statics.field818 = null;
                  Statics.method14170((class425)null, -1, -1);
                  if (!field2588) {
                     field2451 = -1;
                  }

                  method14629();
                  ++field2447;
                  if (field2685) {
                     class109 var26 = class109.method15110(ClientProt.CLICK_WORLDMAP, field2463.field832);
                     var26.field814.method1635(Statics.field9242 << 28 | Statics.field5611 << 14 | Statics.field3085);
                     field2463.method1408(var26);
                     field2685 = false;
                  }

                  while(true) {
                     class90 var27;
                     class425 var28;
                     class425 var29;
                     do {
                        var27 = (class90)field2653.method14961();
                        if (var27 == null) {
                           while(true) {
                              class90 var30;
                              class425 var31;
                              class425 var32;
                              do {
                                 var30 = (class90)field2648.method14961();
                                 if (var30 == null) {
                                    while(true) {
                                       class90 var33;
                                       class425 var34;
                                       class425 var35;
                                       do {
                                          var33 = (class90)field2646.method14961();
                                          if (var33 == null) {
                                             if (Statics.field818 == null) {
                                                field2617 = 0;
                                             }

                                             if (field2501 != null) {
                                                method10102();
                                             }

                                             class987.method11189();
                                             if (field2562 > 0 && Statics.field2111.method1803(82) && Statics.field2111.method1803(81) && field2718 != 0) {
                                                int var36 = Statics.field5701.field1032 - field2718;
                                                if (var36 < 0) {
                                                   var36 = 0;
                                                } else if (var36 > 3) {
                                                   var36 = 3;
                                                }

                                                class723 var37 = field2468.method9649();
                                                method15056(var36, var37.field6676 + Statics.field5701.field16[0], var37.field6677 + Statics.field5701.field62[0]);
                                             }

                                             for(int var38 = 0; var38 < 5; ++var38) {
                                                int var10002 = field2510[var38]++;
                                             }

                                             if (field2644 && field2645 < class431.method2169() - 60000L) {
                                                method430();
                                             }

                                             for(class61 var39 = (class61)field2670.method14798(); var39 != null; var39 = (class61)field2670.method14793()) {
                                                if ((long)var39.field439 < class431.method2169() / 1000L - 5L) {
                                                   if (var39.field441 > 0) {
                                                      class419.method3849(5, 0, "", "", "", var39.field440 + class881.field9005.method15374(Statics.field243));
                                                   }

                                                   if (var39.field441 == 0) {
                                                      class419.method3849(5, 0, "", "", "", var39.field440 + class881.field9006.method15374(Statics.field243));
                                                   }

                                                   var39.method9960();
                                                }
                                             }

                                             ++field2565;
                                             if (field2565 > 505) {
                                                field2565 = 0;
                                                int var40 = (int)(Math.random() * 8.0D);
                                                if ((var40 & 1) == 1) {
                                                   field2478 += field2493;
                                                }

                                                if ((var40 & 2) == 2) {
                                                   field2618 += field2495;
                                                }

                                                if ((var40 & 4) == 4) {
                                                   field2496 += field2497;
                                                }
                                             }

                                             if (field2478 < -51) {
                                                field2493 = 2;
                                             }

                                             if (field2478 > 53) {
                                                field2493 = -2;
                                             }

                                             if (field2618 < -55) {
                                                field2495 = 2;
                                             }

                                             if (field2618 > 56) {
                                                field2495 = -2;
                                             }

                                             if (field2496 < -43) {
                                                field2497 = 1;
                                             }

                                             if (field2496 > 43) {
                                                field2497 = -1;
                                             }

                                             ++field2554;
                                             if (field2554 > 503) {
                                                field2554 = 0;
                                                int var41 = (int)(Math.random() * 8.0D);
                                                if ((var41 & 1) == 1) {
                                                   field2519 += field2500;
                                                }

                                                if ((var41 & 2) == 2) {
                                                   field2619 += field2420;
                                                }
                                             }

                                             if (field2519 < -68) {
                                                field2500 = 2;
                                             }

                                             if (field2519 > 60) {
                                                field2500 = -2;
                                             }

                                             if (field2619 < -22) {
                                                field2420 = 1;
                                             }

                                             if (field2619 > 10) {
                                                field2420 = -1;
                                             }

                                             ++field2463.field820;
                                             if (field2463.field820 > 50) {
                                                class109 var42 = class109.method15110(ClientProt.NO_TIMEOUT, field2463.field832);
                                                field2463.method1408(var42);
                                             }

                                             if (field2533) {
                                                method15827();
                                                field2533 = false;
                                             }

                                             try {
                                                field2463.method1407();
                                             } catch (IOException var44) {
                                                method248();
                                             }

                                             return;
                                          }

                                          var34 = var33.field679;
                                          if (var34.field3401 < 0) {
                                             break;
                                          }

                                          var35 = class425.method11190(var34.field3462);
                                       } while(var35 == null || var35.field3551 == null || var34.field3401 >= var35.field3551.length || var35.field3551[var34.field3401] != var34);

                                       class783.method15429(var33);
                                    }
                                 }

                                 var31 = var30.field679;
                                 if (var31.field3401 < 0) {
                                    break;
                                 }

                                 var32 = class425.method11190(var31.field3462);
                              } while(var32 == null || var32.field3551 == null || var31.field3401 >= var32.field3551.length || var32.field3551[var31.field3401] != var31);

                              class783.method15429(var30);
                           }
                        }

                        var28 = var27.field679;
                        if (var28.field3401 < 0) {
                           break;
                        }

                        var29 = class425.method11190(var28.field3462);
                     } while(var29 == null || var29.field3551 == null || var28.field3401 >= var29.field3551.length || var29.field3551[var28.field3401] != var28);

                     class783.method15429(var27);
                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("yx.fu(I)V")
   private static final void method16869() {
      for(int var0 = Statics.field10637.method6142(true); var0 != -1; var0 = Statics.field10637.method6142(false)) {
         method10717(var0);
         field2623[++field2624 - 1 & 31] = var0;
      }

      for(class231 var1 = class231.method15305(); var1 != null; var1 = class231.method15305()) {
         int var2 = var1.method3140();
         long var3 = var1.method3159();
         if (var2 == 1) {
            Statics.field8854[(int)var3] = var1.field1561;
            field2644 |= Statics.field8400[(int)var3];
            field2666[++field2488 - 1 & 31] = (int)var3;
         } else if (var2 == 2) {
            Statics.field9056[(int)var3] = var1.field1546;
            field2631[++field2632 - 1 & 31] = (int)var3;
         } else if (var2 == 3) {
            class425 var5 = class425.method11190((int)var3);
            if (!var1.field1546.equals(var5.field3470)) {
               var5.field3470 = var1.field1546;
               method7309(var5);
            }
         } else if (var2 == 22) {
            class425 var6 = class425.method11190((int)var3);
            if (var6.field3478 != (var1.field1561 == 1)) {
               var6.field3478 = var1.field1561 == 1;
               method7309(var6);
            }
         } else if (var2 == 4) {
            class425 var7 = class425.method11190((int)var3);
            int var8 = var1.field1561;
            int var9 = var1.field1565;
            int var10 = var1.field1545;
            if (var7.field3442 != var8 || var7.field3498 != var9 || var7.field3444 != var10) {
               var7.field3442 = var8;
               var7.field3498 = var9;
               var7.field3444 = var10;
               var7.field3566 = null;
               method7309(var7);
            }
         } else if (var2 == 5) {
            class425 var11 = class425.method11190((int)var3);
            if (var1.field1561 != var11.field3549) {
               if (var1.field1561 != -1) {
                  if (var11.field3550 == null) {
                     var11.field3550 = new class169();
                  }

                  var11.field3550.method14694(var1.field1561);
               } else {
                  var11.field3550 = null;
               }

               var11.field3549 = var1.field1561;
               method7309(var11);
            }
         } else if (var2 == 6) {
            int var12 = var1.field1561;
            int var13 = var12 >> 10 & 31;
            int var14 = var12 >> 5 & 31;
            int var15 = var12 & 31;
            int var16 = (var15 << 3) + (var13 << 19) + (var14 << 11);
            class425 var17 = class425.method11190((int)var3);
            if (var17.field3448 != var16) {
               var17.field3448 = var16;
               method7309(var17);
            }
         } else if (var2 == 7) {
            class425 var18 = class425.method11190((int)var3);
            boolean var19 = var1.field1561 == 1;
            if (var18.field3419 != var19) {
               var18.field3419 = var19;
               method7309(var18);
            }
         } else if (var2 == 8) {
            class425 var20 = class425.method11190((int)var3);
            if (var1.field1561 != var20.field3394 || var1.field1565 != var20.field3415 || var1.field1545 != var20.field3454) {
               var20.field3394 = var1.field1561;
               var20.field3415 = var1.field1565;
               var20.field3454 = var1.field1545;
               if (var20.field3539 != -1) {
                  if (var20.field3455 > 0) {
                     var20.field3454 = var20.field3454 * 32 / var20.field3455;
                  } else if (var20.field3450 > 0) {
                     var20.field3454 = var20.field3454 * 32 / var20.field3450;
                  }
               }

               method7309(var20);
            }
         } else if (var2 == 9) {
            class425 var21 = class425.method11190((int)var3);
            if (var1.field1561 != var21.field3539 || var1.field1565 != var21.field3540) {
               var21.field3539 = var1.field1561;
               var21.field3540 = var1.field1565;
               method7309(var21);
            }
         } else if (var2 == 10) {
            class425 var22 = class425.method11190((int)var3);
            if (var1.field1561 != var22.field3375 || var1.field1565 != var22.field3447 || var1.field1545 != var22.field3440) {
               var22.field3375 = var1.field1561;
               var22.field3447 = var1.field1565;
               var22.field3440 = var1.field1545;
               method7309(var22);
            }
         } else if (var2 == 11) {
            class425 var23 = class425.method11190((int)var3);
            var23.field3531 = 0;
            var23.field3398 = var23.field3408 = var1.field1561;
            var23.field3500 = 0;
            var23.field3487 = var23.field3553 = var1.field1565;
            method7309(var23);
         } else if (var2 == 12) {
            class425 var24 = class425.method11190((int)var3);
            int var25 = var1.field1561;
            if (var24 != null && var24.field3402 == 0) {
               if (var25 > var24.field3461 - var24.field3557) {
                  var25 = var24.field3461 - var24.field3557;
               }

               if (var25 < 0) {
                  var25 = 0;
               }

               if (var24.field3425 != var25) {
                  var24.field3425 = var25;
                  method7309(var24);
               }
            }
         } else if (var2 == 14) {
            class425 var26 = class425.method11190((int)var3);
            var26.field3494 = var1.field1561;
         } else if (var2 == 15) {
            class299.field1892 = true;
            class299.field1890 = var1.field1561;
            class299.field1895 = var1.field1565;
         } else if (var2 == 16) {
            class425 var27 = class425.method11190((int)var3);
            var27.field3468 = var1.field1561;
         } else if (var2 == 20) {
            class425 var28 = class425.method11190((int)var3);
            var28.field3410 = var1.field1561 == 1;
         } else if (var2 == 21) {
            class425 var29 = class425.method11190((int)var3);
            var29.field3441 = var1.field1561 == 1;
         } else if (var2 == 17) {
            class425 var30 = class425.method11190((int)var3);
            var30.field3480 = var1.field1561;
         } else if (var2 == 18) {
            class425 var31 = class425.method11190((int)var3);
            int var32 = (int)(var3 >> 32);
            var31.method5830(var32, (short)var1.field1561, (short)var1.field1565);
         } else if (var2 == 19) {
            class425 var33 = class425.method11190((int)var3);
            int var34 = (int)(var3 >> 32);
            var33.method5831(var34, (short)var1.field1561, (short)var1.field1565);
         }
      }

   }

   @deob.ObfuscatedName("uk.fy(B)V")
   private static final void method15205() {
      int[] var0 = class324.field2057;

      for(int var1 = 0; var1 < class324.field2053; ++var1) {
         class211 var2 = field2408[var0[var1]];
         if (var2 != null) {
            var2.method92();
         }
      }

      for(int var3 = 0; var3 < field2455; ++var3) {
         long var4 = (long)field2456[var3];
         class106 var6 = (class106)field2615.method15322(var4);
         if (var6 != null) {
            ((class4)var6.field807).method92();
         }
      }

      if (field2476 == 0) {
         for(int var7 = 0; var7 < Statics.field9261.length; ++var7) {
            class411 var8 = Statics.field9261[var7];
            if (var8.field3098) {
               var8.method5645().method92();
            }
         }
      }

   }

   @deob.ObfuscatedName("tz.fv(IIIB)V")
   public static final void method15056(int arg0, int arg1, int arg2) {
      String var3 = "tele " + arg0 + class582.field5306 + (arg1 >> 6) + class582.field5306 + (arg2 >> 6) + class582.field5306 + (arg1 & 63) + class582.field5306 + (arg2 & 63);
      System.out.println(var3);
      class319.method8552(var3, true, false);
   }

   @deob.ObfuscatedName("ti.fi(I)[Luo;")
   public static class867[] method14680() {
      if (Statics.field9396 == null) {
         class867[] var0 = class854.method5690(Statics.field6776);
         class867[] var1 = new class867[var0.length];
         int var2 = 0;
         int var3 = Statics.field9361.field973.method2137();

         label71:
         for(int var4 = 0; var4 < var0.length; ++var4) {
            class867 var5 = var0[var4];
            if ((var5.field8816 <= 0 || var5.field8816 >= 24) && var5.field8814 >= 800 && var5.field8815 >= 600 && (var3 != 2 || var5.field8814 <= 800 && var5.field8815 <= 600) && (var3 != 1 || var5.field8814 <= 1024 && var5.field8815 <= 768)) {
               for(int var6 = 0; var6 < var2; ++var6) {
                  class867 var7 = var1[var6];
                  if (var5.field8814 == var7.field8814 && var5.field8815 == var7.field8815) {
                     if (var5.field8816 > var7.field8816) {
                        var1[var6] = var5;
                     }
                     continue label71;
                  }
               }

               var1[var2] = var5;
               ++var2;
            }
         }

         Statics.field9396 = new class867[var2];
         System.arraycopy(var1, 0, Statics.field9396, 0, var2);
         int[] var8 = new int[Statics.field9396.length];

         for(int var9 = 0; var9 < Statics.field9396.length; ++var9) {
            class867 var10 = Statics.field9396[var9];
            var8[var9] = var10.field8815 * var10.field8814;
         }

         class781.method11384(var8, Statics.field9396);
      }

      return Statics.field9396;
   }

   @deob.ObfuscatedName("mc.fp(B)V")
   public static final void method9226() {
      if (field2521 != -1 && field2698 != -1) {
         int var0 = (field2525 * (field2454 - field2526) >> 16) + field2526;
         field2525 += var0;
         if (field2525 >= 65535) {
            field2525 = 65535;
            if (!field2417) {
               field2528 = true;
            } else {
               field2528 = false;
            }

            field2417 = true;
         } else {
            field2528 = false;
            field2417 = false;
         }

         float var1 = (float)field2525 / 65535.0F;
         float[] var2 = new float[3];
         int var3 = field2523 * 2;

         for(int var4 = 0; var4 < 3; ++var4) {
            int var5 = field2520[field2521][var3][var4] * 3;
            int var6 = field2520[field2521][var3 + 1][var4] * 3;
            int var7 = (field2520[field2521][var3 + 2][var4] - (field2520[field2521][var3 + 3][var4] - field2520[field2521][var3 + 2][var4])) * 3;
            int var8 = field2520[field2521][var3][var4];
            int var9 = var6 - var5;
            int var10 = var5 - var6 * 2 + var7;
            int var11 = field2520[field2521][var3 + 2][var4] - var8 + var6 - var7;
            var2[var4] = (((float)var11 * var1 + (float)var10) * var1 + (float)var9) * var1 + (float)var8;
         }

         class723 var12 = field2468.method9649();
         Statics.field337 = (int)var2[0] - var12.field6676 * 512;
         Statics.field6719 = (int)var2[1] * -1;
         Statics.field3115 = (int)var2[2] - var12.field6677 * 512;
         float[] var13 = new float[3];
         int var14 = field2402 * 2;

         for(int var15 = 0; var15 < 3; ++var15) {
            int var16 = field2520[field2698][var14][var15] * 3;
            int var17 = field2520[field2698][var14 + 1][var15] * 3;
            int var18 = (field2520[field2698][var14 + 2][var15] - (field2520[field2698][var14 + 3][var15] - field2520[field2698][var14 + 2][var15])) * 3;
            int var19 = field2520[field2698][var14][var15];
            int var20 = var17 - var16;
            int var21 = var16 - var17 * 2 + var18;
            int var22 = field2520[field2698][var14 + 2][var15] - var19 + var17 - var18;
            var13[var15] = (((float)var22 * var1 + (float)var21) * var1 + (float)var20) * var1 + (float)var19;
         }

         float var23 = var13[0] - var2[0];
         float var24 = (var13[1] - var2[1]) * -1.0F;
         float var25 = var13[2] - var2[2];
         double var26 = Math.sqrt((double)(var23 * var23 + var25 * var25));
         Statics.field4218 = (int)(Math.atan2((double)var24, var26) * 2607.5945876176133D) & 16383;
         Statics.field7098 = (int)(-Math.atan2((double)var23, (double)var25) * 2607.5945876176133D) & 16383;
         Statics.field6938 = (field2525 * (field2520[field2521][var3 + 2][3] - field2520[field2521][var3][3]) >> 16) + field2520[field2521][var3][3];
      }
   }

   @deob.ObfuscatedName("pq.fg(I)V")
   private static final void method10853() {
      int var0 = Statics.field5127 * 512 + 256;
      int var1 = Statics.field1994 * 512 + 256;
      int var2 = method5777(var0, var1, Statics.field1977) - Statics.field1734;
      if (Statics.field8399 >= 100) {
         Statics.field337 = Statics.field5127 * 512 + 256;
         Statics.field3115 = Statics.field1994 * 512 + 256;
         Statics.field6719 = method5777(Statics.field337, Statics.field3115, Statics.field1977) - Statics.field1734;
      } else {
         if (Statics.field337 < var0) {
            Statics.field337 += Statics.field8399 * (var0 - Statics.field337) / 1000 + Statics.field5794;
            if (Statics.field337 > var0) {
               Statics.field337 = var0;
            }
         }

         if (Statics.field337 > var0) {
            Statics.field337 -= Statics.field8399 * (Statics.field337 - var0) / 1000 + Statics.field5794;
            if (Statics.field337 < var0) {
               Statics.field337 = var0;
            }
         }

         if (Statics.field6719 < var2) {
            Statics.field6719 += Statics.field8399 * (var2 - Statics.field6719) / 1000 + Statics.field5794;
            if (Statics.field6719 > var2) {
               Statics.field6719 = var2;
            }
         }

         if (Statics.field6719 > var2) {
            Statics.field6719 -= Statics.field8399 * (Statics.field6719 - var2) / 1000 + Statics.field5794;
            if (Statics.field6719 < var2) {
               Statics.field6719 = var2;
            }
         }

         if (Statics.field3115 < var1) {
            Statics.field3115 += Statics.field8399 * (var1 - Statics.field3115) / 1000 + Statics.field5794;
            if (Statics.field3115 > var1) {
               Statics.field3115 = var1;
            }
         }

         if (Statics.field3115 > var1) {
            Statics.field3115 -= Statics.field8399 * (Statics.field3115 - var1) / 1000 + Statics.field5794;
            if (Statics.field3115 < var1) {
               Statics.field3115 = var1;
            }
         }
      }

      int var3 = Statics.field262 * 512 + 256;
      int var4 = Statics.field8651 * 512 + 256;
      int var5 = method5777(var3, var4, Statics.field1977) - Statics.field3823;
      int var6 = var3 - Statics.field337;
      int var7 = var5 - Statics.field6719;
      int var8 = var4 - Statics.field3115;
      int var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8));
      int var10 = (int)(Math.atan2((double)var7, (double)var9) * 2607.5945876176133D) & 16383;
      int var11 = (int)(Math.atan2((double)var6, (double)var8) * -2607.5945876176133D) & 16383;
      if (var10 < 1024) {
         var10 = 1024;
      }

      if (var10 > 3072) {
         var10 = 3072;
      }

      if (Statics.field4218 < var10) {
         Statics.field4218 += (var10 - Statics.field4218 >> 3) * Statics.field10584 / 1000 + Statics.field2957 << 3;
         if (Statics.field4218 > var10) {
            Statics.field4218 = var10;
         }
      }

      if (Statics.field4218 > var10) {
         Statics.field4218 -= (Statics.field4218 - var10 >> 3) * Statics.field10584 / 1000 + Statics.field2957 << 3;
         if (Statics.field4218 < var10) {
            Statics.field4218 = var10;
         }
      }

      int var12 = var11 - Statics.field7098;
      if (var12 > 8192) {
         var12 -= 16384;
      }

      if (var12 < -8192) {
         var12 += 16384;
      }

      int var13 = var12 >> 3;
      if (var13 > 0) {
         Statics.field7098 += Statics.field10584 * var13 / 1000 + Statics.field2957 << 3;
         Statics.field7098 &= 16383;
      }

      if (var13 < 0) {
         Statics.field7098 -= Statics.field10584 * -var13 / 1000 + Statics.field2957 << 3;
         Statics.field7098 &= 16383;
      }

      int var14 = var11 - Statics.field7098;
      if (var14 > 8192) {
         var14 -= 16384;
      }

      if (var14 < -8192) {
         var14 += 16384;
      }

      if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
         Statics.field7098 = var11;
      }

      Statics.field6938 = 0;
   }

   @deob.ObfuscatedName("ks.fa(IB)V")
   private static final void method8549(int arg0) {
      int var1 = field2418 - field2673;
      if (var1 >= 100) {
         Statics.field5998 = 4;
         Statics.field6637 = -1;
         Statics.field5929 = -1;
      } else {
         int var2 = (int)field2603;
         if (field2394 >> 8 > var2) {
            var2 = field2394 >> 8;
         }

         if (field2531[4] && field2678[4] + 128 > var2) {
            var2 = field2678[4] + 128;
         }

         int var3 = field2496 + (int)field2502 & 16383;
         class584 var4 = Statics.field5701.method11602().field5446;
         method14658(Statics.field5542, method5777((int)var4.field5328, (int)var4.field5331, Statics.field1977) - field2579, Statics.field9259, var2, var3, (var2 >> 3) * 3 + 600 << 2, arg0);
         float var5 = 1.0F - (float)((100 - var1) * (100 - var1) * (100 - var1)) / 1000000.0F;
         Statics.field337 = (int)((float)(Statics.field337 - Statics.field6047) * var5 + (float)Statics.field6047);
         Statics.field6719 = (int)((float)(Statics.field6719 - Statics.field2763) * var5 + (float)Statics.field2763);
         Statics.field3115 = (int)((float)(Statics.field3115 - Statics.field6369) * var5 + (float)Statics.field6369);
         Statics.field4218 = (int)((float)(Statics.field4218 - Statics.field5754) * var5 + (float)Statics.field5754);
         int var6 = Statics.field7098 - Statics.field4337;
         if (var6 > 8192) {
            var6 -= 16384;
         } else if (var6 < -8192) {
            var6 += 16384;
         }

         Statics.field7098 = (int)((float)var6 * var5 + (float)Statics.field4337);
         Statics.field7098 &= 16383;
      }
   }

   @deob.ObfuscatedName("jh.fm(J)V")
   private static final void method7946(long arg0) {
      class584 var2 = Statics.field5701.method11602().field5446;
      int var3 = field2478 + (int)var2.field5328;
      int var4 = field2618 + (int)var2.field5331;
      if (Statics.field5542 - var3 < -2000 || Statics.field5542 - var3 > 2000 || Statics.field9259 - var4 < -2000 || Statics.field9259 - var4 > 2000) {
         Statics.field5542 = var3;
         Statics.field9259 = var4;
      }

      if (Statics.field5542 != var3) {
         int var5 = var3 - Statics.field5542;
         int var6 = (int)((long)var5 * arg0 / 320L);
         if (var5 > 0) {
            if (var6 == 0) {
               var6 = 1;
            } else if (var6 > var5) {
               var6 = var5;
            }
         } else if (var6 == 0) {
            var6 = -1;
         } else if (var6 < var5) {
            var6 = var5;
         }

         Statics.field5542 += var6;
      }

      if (Statics.field9259 != var4) {
         int var7 = var4 - Statics.field9259;
         int var8 = (int)((long)var7 * arg0 / 320L);
         if (var7 > 0) {
            if (var8 == 0) {
               var8 = 1;
            } else if (var8 > var7) {
               var8 = var7;
            }
         } else if (var8 == 0) {
            var8 = -1;
         } else if (var8 < var7) {
            var8 = var7;
         }

         Statics.field9259 += var8;
      }

      field2502 += (float)arg0 * field2608 / 6.0F;
      field2603 += (float)arg0 * field2511 / 6.0F;
      method6508();
   }

   @deob.ObfuscatedName("abi.fh(J)V")
   private static final void method594(long arg0) {
      int var2 = field2506;
      int var3 = field2507;
      if (Statics.field5542 != var2) {
         int var4 = var2 - Statics.field5542;
         int var5 = (int)((long)var4 * arg0 / 320L);
         if (var4 > 0) {
            if (var5 == 0) {
               var5 = 1;
            } else if (var5 > var4) {
               var5 = var4;
            }
         } else if (var5 == 0) {
            var5 = -1;
         } else if (var5 < var4) {
            var5 = var4;
         }

         Statics.field5542 += var5;
      }

      if (Statics.field9259 != var3) {
         int var6 = var3 - Statics.field9259;
         int var7 = (int)((long)var6 * arg0 / 320L);
         if (var6 > 0) {
            if (var7 == 0) {
               var7 = 1;
            } else if (var7 > var6) {
               var7 = var6;
            }
         } else if (var7 == 0) {
            var7 = -1;
         } else if (var7 < var6) {
            var7 = var6;
         }

         Statics.field9259 += var7;
      }

      field2502 += (float)arg0 * field2608 / 40.0F * 8.0F;
      field2603 += (float)arg0 * field2511 / 40.0F * 8.0F;
      method6508();
   }

   @deob.ObfuscatedName("lk.fx(B)V")
   public static final void method8945() {
      if (!field2668) {
         field2511 += (12.0F - field2511) / 2.0F;
         field2432 = true;
         field2668 = true;
      }
   }

   @deob.ObfuscatedName("jl.gu(B)V")
   public static final void method7969() {
      if (!field2668) {
         field2511 += (-12.0F - field2511) / 2.0F;
         field2432 = true;
         field2668 = true;
      }
   }

   @deob.ObfuscatedName("fw.gi(I)V")
   public static final void method6532() {
      if (!field2513) {
         field2608 += (24.0F - field2608) / 2.0F;
         field2432 = true;
         field2513 = true;
      }
   }

   @deob.ObfuscatedName("mt.gn(S)V")
   public static final void method9489() {
      if (!field2513) {
         field2608 += (-24.0F - field2608) / 2.0F;
         field2432 = true;
         field2513 = true;
      }
   }

   @deob.ObfuscatedName("ln.gj(IIII)V")
   public static void method8975(int arg0, int arg1, int arg2) {
      int var3 = arg0 << 3;
      int var4 = arg1 << 3;
      int var5 = arg2 << 3;
      field2603 = (float)var3;
      field2502 = (float)var4;
      if (Statics.field5998 == 3) {
         Statics.field4218 = var3;
         Statics.field7098 = var4;
         Statics.field6938 = var5;
      }

      method6508();
      field2432 = true;
   }

   @deob.ObfuscatedName("fs.gb(I)V")
   private static final void method6508() {
      if (field2603 < 1050.0F) {
         field2603 = 1050.0F;
      }

      if (field2603 > 2836.0F) {
         field2603 = 2836.0F;
      }

      while(field2502 >= 16384.0F) {
         field2502 -= 16384.0F;
      }

      while(field2502 < 0.0F) {
         field2502 += 16384.0F;
      }

      class611 var0 = field2468.method9592();
      class713 var1 = field2468.method9639();
      int var2 = Statics.field5542 >> 9;
      int var3 = Statics.field9259 >> 9;
      int var4 = method5777(Statics.field5542, Statics.field9259, Statics.field1977);
      int var5 = 0;
      if (var2 > 3 && var3 > 3 && var2 < field2468.method9648() - 4 && var3 < field2468.method9604() - 4) {
         for(int var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
            for(int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
               int var8 = Statics.field1977;
               if (var8 < 3 && var0.method8746(var6, var7)) {
                  ++var8;
               }

               int var9 = 0;
               byte[][] var10 = field2468.method9519(var8);
               if (var10 != null) {
                  var9 = (var10[var6][var7] & 255) * 8 << 2;
               }

               if (var1.field6580 != null && var1.field6580[var8] != null) {
                  int var11 = var4 - (var1.field6580[var8].method15966(var6, var7) - var9);
                  if (var11 > var5) {
                     var5 = var11;
                  }
               }
            }
         }
      }

      int var12 = (var5 >> 2) * 1536;
      if (var12 > 786432) {
         var12 = 786432;
      }

      if (var12 < 262144) {
         var12 = 262144;
      }

      if (var12 > field2394) {
         field2394 += (var12 - field2394) / 24;
      } else if (var12 < field2394) {
         field2394 += (var12 - field2394) / 80;
      }

   }

   @deob.ObfuscatedName("nk.gv(IIIIIZI)V")
   public static final void method9870(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      Statics.field5127 = arg0;
      Statics.field1994 = arg1;
      Statics.field1734 = arg2;
      Statics.field5794 = arg3;
      Statics.field8399 = arg4;
      if (arg5 && Statics.field8399 >= 100) {
         Statics.field337 = Statics.field5127 * 512 + 256;
         Statics.field3115 = Statics.field1994 * 512 + 256;
         Statics.field6719 = method5777(Statics.field337, Statics.field3115, Statics.field1977) - Statics.field1734;
      }

      Statics.field5998 = 3;
      Statics.field6637 = -1;
      Statics.field5929 = -1;
   }

   @deob.ObfuscatedName("sh.gw(IIIIIB)V")
   public static final void method14327(int arg0, int arg1, int arg2, int arg3, int arg4) {
      Statics.field262 = arg0;
      Statics.field8651 = arg1;
      Statics.field3823 = arg2;
      Statics.field2957 = arg3;
      Statics.field10584 = arg4;
      if (Statics.field10584 >= 100) {
         int var5 = Statics.field262 * 512 + 256;
         int var6 = Statics.field8651 * 512 + 256;
         int var7 = method5777(var5, var6, Statics.field1977) - Statics.field3823;
         int var8 = var5 - Statics.field337;
         int var9 = var7 - Statics.field6719;
         int var10 = var6 - Statics.field3115;
         int var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
         Statics.field4218 = (int)(Math.atan2((double)var9, (double)var11) * 2607.5945876176133D) & 16383;
         Statics.field7098 = (int)(Math.atan2((double)var8, (double)var10) * -2607.5945876176133D) & 16383;
         Statics.field6938 = 0;
         if (Statics.field4218 < 1024) {
            Statics.field4218 = 1024;
         }

         if (Statics.field4218 > 3072) {
            Statics.field4218 = 3072;
         }
      }

      Statics.field5998 = 3;
      Statics.field6637 = -1;
      Statics.field5929 = -1;
   }

   @deob.ObfuscatedName("gn.gz(S)V")
   public static final void method6770() {
      for(int var0 = 0; var0 < 5; ++var0) {
         field2531[var0] = false;
      }

      field2521 = -1;
      field2698 = -1;
      Statics.field2957 = 0;
      Statics.field10584 = 0;
      Statics.field5998 = 4;
      Statics.field6637 = -1;
      Statics.field5929 = -1;
   }

   @deob.ObfuscatedName("na.gy(B)V")
   private static final void method9712() {
      int var0 = class324.field2053;
      int[] var1 = class324.field2057;

      for(int var2 = 0; var2 < var0; ++var2) {
         class211 var3 = field2408[var1[var2]];
         if (var3 != null) {
            method14352(var3, false);
         }
      }

   }

   @deob.ObfuscatedName("sv.gr(I)V")
   private static final void method14503() {
      for(int var0 = 0; var0 < field2455; ++var0) {
         int var1 = field2456[var0];
         class106 var2 = (class106)field2615.method15322((long)var1);
         if (var2 != null) {
            class200 var3 = (class200)var2.field807;
            method14352(var3, false);
         }
      }

   }

   @deob.ObfuscatedName("sl.gd(Laab;ZI)V")
   private static final void method14352(class4 arg0, boolean arg1) {
      int var2 = class647.field5873.field5871;
      int var3 = 0;
      if (arg0.field40 > field2418) {
         method7314(arg0);
      } else if (arg0.field43 >= field2418) {
         method1518(arg0);
      } else {
         method14657(arg0, arg1);
         var2 = Statics.field5809;
         var3 = Statics.field3572;
      }

      class584 var4 = arg0.method11602().field5446;
      if ((int)var4.field5328 < 512 || (int)var4.field5331 < 512 || (int)var4.field5328 >= (field2468.method9648() - 1) * 512 || (int)var4.field5331 >= (field2468.method9604() - 1) * 512) {
         arg0.field38.method14694(-1);

         for(int var5 = 0; var5 < arg0.field37.length; ++var5) {
            arg0.field37[var5].field2770 = -1;
            arg0.field37[var5].field2774.method14694(-1);
         }

         arg0.field41 = null;
         arg0.field40 = 0;
         arg0.field43 = 0;
         var2 = class647.field5873.field5871;
         var3 = 0;
         arg0.method11608((float)(arg0.field16[0] * 512 + arg0.method96() * 256), var4.field5330, (float)(arg0.field62[0] * 512 + arg0.method96() * 256));
         arg0.method84();
      }

      if (Statics.field5701 == arg0 && ((int)var4.field5328 < 6144 || (int)var4.field5331 < 6144 || (int)var4.field5328 >= (field2468.method9648() - 12) * 512 || (int)var4.field5331 >= (field2468.method9604() - 12) * 512)) {
         arg0.field38.method14694(-1);

         for(int var6 = 0; var6 < arg0.field37.length; ++var6) {
            arg0.field37[var6].field2770 = -1;
            arg0.field37[var6].field2774.method14694(-1);
         }

         arg0.field41 = null;
         arg0.field40 = 0;
         arg0.field43 = 0;
         var2 = class647.field5873.field5871;
         var3 = 0;
         arg0.method11608((float)(arg0.field16[0] * 512 + arg0.method96() * 256), var4.field5330, (float)(arg0.field62[0] * 512 + arg0.method96() * 256));
         arg0.method84();
      }

      int var7 = method15907(arg0);
      method5183(arg0);
      method6769(arg0, var2, var3, var7);
      method11115(arg0, var2);
      Statics.method15828(arg0);
      class606 var8 = class606.method8602();
      var8.method8613(class603.method8577(arg0.field57.method6560()), class603.method8577(arg0.field51.method6560()), class603.method8577(arg0.field58.method6560()));
      arg0.method11606(var8);
      var8.method8654();
   }

   @deob.ObfuscatedName("id.gm(Laab;I)V")
   private static final void method7314(class4 arg0) {
      int var1 = arg0.field40 - field2418;
      int var2 = arg0.field69 * 512 + arg0.method96() * 256;
      int var3 = arg0.field73 * 512 + arg0.method96() * 256;
      class584 var4 = arg0.method11602().field5446;
      arg0.method11608((float)((var2 - (int)var4.field5328) / var1 + (int)var4.field5328), (float)((int)var4.field5330), (float)((var3 - (int)var4.field5331) / var1 + (int)var4.field5331));
      arg0.field71 = 0;
      arg0.method182(arg0.field44);
   }

   @deob.ObfuscatedName("aeg.gl(Laab;I)V")
   private static final void method1518(class4 arg0) {
      class836 var1 = arg0.field38;
      if (field2418 == arg0.field43 || !var1.method14691() || var1.method14712(1)) {
         int var2 = arg0.field43 - arg0.field40;
         int var3 = field2418 - arg0.field40;
         int var4 = arg0.field69 * 512 + arg0.method96() * 256;
         int var5 = arg0.field73 * 512 + arg0.method96() * 256;
         int var6 = arg0.field39 * 512 + arg0.method96() * 256;
         int var7 = arg0.field10 * 512 + arg0.method96() * 256;
         class584 var8 = arg0.method11602().field5446;
         arg0.method11608((float)(((var2 - var3) * var4 + var3 * var6) / var2), (float)((int)var8.field5330), (float)(((var2 - var3) * var5 + var3 * var7) / var2));
      }

      arg0.field71 = 0;
      arg0.method117(arg0.field44, false);
   }

   @deob.ObfuscatedName("tf.gs(Laab;ZB)V")
   private static final void method14657(class4 arg0, boolean arg1) {
      class743 var2 = arg0.method101();
      if (arg0.field60 == 0) {
         arg0.field71 = 0;
         Statics.field5809 = class647.field5873.field5871;
         Statics.field3572 = 0;
      } else {
         if (arg0.field38.method14691() && !arg0.field38.method14749()) {
            class806 var3 = arg0.field38.method14698();
            if (arg0.field65 > 0 && var3.field8368 == 0) {
               ++arg0.field71;
               Statics.field5809 = class647.field5873.field5871;
               Statics.field3572 = 0;
               return;
            }

            if (arg0.field65 <= 0 && var3.field8369 == 0) {
               ++arg0.field71;
               Statics.field5809 = class647.field5873.field5871;
               Statics.field3572 = 0;
               return;
            }
         }

         for(int var4 = 0; var4 < arg0.field37.length; ++var4) {
            if (arg0.field37[var4].field2770 != -1 && arg0.field37[var4].field2774.method14749()) {
               class815 var5 = Statics.field3758.method14209(arg0.field37[var4].field2770);
               if (var5.field8418 && var5.field8406 != -1) {
                  class806 var6 = Statics.field2046.method14475(var5.field8406);
                  if (arg0.field65 > 0 && var6.field8368 == 0) {
                     ++arg0.field71;
                     Statics.field5809 = class647.field5873.field5871;
                     Statics.field3572 = 0;
                     return;
                  }

                  if (arg0.field65 <= 0 && var6.field8369 == 0) {
                     ++arg0.field71;
                     Statics.field5809 = class647.field5873.field5871;
                     Statics.field3572 = 0;
                     return;
                  }
               }
            }
         }

         class584 var7 = class584.method8135(arg0.method11602().field5446);
         int var8 = (int)var7.field5328;
         int var9 = (int)var7.field5331;
         int var10 = arg0.field16[arg0.field60 - 1] * 512 + arg0.method96() * 256;
         int var11 = arg0.field62[arg0.field60 - 1] * 512 + arg0.method96() * 256;
         if (var8 < var10) {
            if (var9 < var11) {
               arg0.method182(10240);
            } else if (var9 > var11) {
               arg0.method182(14336);
            } else {
               arg0.method182(12288);
            }
         } else if (var8 > var10) {
            if (var9 < var11) {
               arg0.method182(6144);
            } else if (var9 > var11) {
               arg0.method182(2048);
            } else {
               arg0.method182(4096);
            }
         } else if (var9 < var11) {
            arg0.method182(8192);
         } else if (var9 > var11) {
            arg0.method182(0);
         }

         byte var12 = arg0.field63[arg0.field60 - 1];
         if (arg1 || var10 - var8 <= 1024 && var10 - var8 >= -1024 && var11 - var9 <= 1024 && var11 - var9 >= -1024) {
            int var13 = 16;
            boolean var14 = true;
            if (arg0 instanceof class200) {
               var14 = ((class200)arg0).field1312.field9318;
            }

            if (var14) {
               int var15 = arg0.field56 - arg0.field57.field3820;
               if (var15 != 0 && arg0.field34 == -1 && arg0.field67 != 0) {
                  var13 = 8;
               }

               if (!arg1 && arg0.field60 > 2) {
                  var13 = 24;
               }

               if (!arg1 && arg0.field60 > 3) {
                  var13 = 32;
               }
            } else {
               if (!arg1 && arg0.field60 > 1) {
                  var13 = 24;
               }

               if (!arg1 && arg0.field60 > 2) {
                  var13 = 32;
               }
            }

            if (arg0.field71 > 0 && arg0.field60 > 1) {
               var13 = 32;
               --arg0.field71;
            }

            if (class647.field5874.field5871 == var12) {
               var13 <<= 1;
            } else if (class647.field5872.field5871 == var12) {
               var13 >>= 1;
            }

            if (var2.field6852 != -1) {
               int var16 = var13 << 9;
               if (arg0.field60 == 1) {
                  int var17 = arg0.field66 * arg0.field66;
                  int var18 = ((int)var7.field5328 > var10 ? (int)var7.field5328 - var10 : var10 - (int)var7.field5328) << 9;
                  int var19 = ((int)var7.field5331 > var11 ? (int)var7.field5331 - var11 : var11 - (int)var7.field5331) << 9;
                  int var20 = var18 > var19 ? var18 : var19;
                  int var21 = var2.field6852 * 2 * var20;
                  if (var17 > var21) {
                     arg0.field66 /= 2;
                  } else if (var17 / 2 > var20) {
                     arg0.field66 -= var2.field6852;
                     if (arg0.field66 < 0) {
                        arg0.field66 = 0;
                     }
                  } else if (arg0.field66 < var16) {
                     arg0.field66 += var2.field6852;
                     if (arg0.field66 > var16) {
                        arg0.field66 = var16;
                     }
                  }
               } else if (arg0.field66 < var16) {
                  arg0.field66 += var2.field6852;
                  if (arg0.field66 > var16) {
                     arg0.field66 = var16;
                  }
               } else if (arg0.field66 > 0) {
                  arg0.field66 -= var2.field6852;
                  if (arg0.field66 < 0) {
                     arg0.field66 = 0;
                  }
               }

               var13 = arg0.field66 >> 9;
               if (var13 < 1) {
                  var13 = 1;
               }
            }

            Statics.field3572 = 0;
            if (var8 == var10 && var9 == var11) {
               Statics.field5809 = class647.field5873.field5871;
            } else {
               if (var8 < var10) {
                  var7.field5328 += (float)var13;
                  Statics.field3572 |= 4;
                  if (var7.field5328 > (float)var10) {
                     var7.field5328 = (float)var10;
                  }
               } else if (var8 > var10) {
                  var7.field5328 -= (float)var13;
                  Statics.field3572 |= 8;
                  if (var7.field5328 < (float)var10) {
                     var7.field5328 = (float)var10;
                  }
               }

               if (var9 < var11) {
                  var7.field5331 += (float)var13;
                  Statics.field3572 |= 1;
                  if (var7.field5331 > (float)var11) {
                     var7.field5331 = (float)var11;
                  }
               } else if (var9 > var11) {
                  var7.field5331 -= (float)var13;
                  Statics.field3572 |= 2;
                  if (var7.field5331 < (float)var11) {
                     var7.field5331 = (float)var11;
                  }
               }

               arg0.method11626(var7);
               if (var13 >= 32) {
                  Statics.field5809 = class647.field5874.field5871;
               } else {
                  Statics.field5809 = var12;
               }
            }

            if ((int)var7.field5328 == var10 && (int)var7.field5331 == var11) {
               --arg0.field60;
               if (arg0.field65 > 0) {
                  --arg0.field65;
               }
            }

            var7.method8201();
         } else {
            arg0.method11608((float)var10, var7.field5330, (float)var11);
            arg0.method117(arg0.field56, false);
            --arg0.field60;
            if (arg0.field65 > 0) {
               --arg0.field65;
            }

            Statics.field5809 = class647.field5873.field5871;
            Statics.field3572 = 0;
            var7.method8201();
         }
      }
   }

   @deob.ObfuscatedName("ws.gf(Laab;I)I")
   private static final int method15907(class4 arg0) {
      if (arg0.field67 == 0) {
         return 0;
      } else {
         if (arg0.field34 != -1) {
            class4 var1 = null;
            if (arg0.field34 < 32768) {
               class106 var2 = (class106)field2615.method15322((long)arg0.field34);
               if (var2 != null) {
                  var1 = (class4)var2.field807;
               }
            } else if (arg0.field34 >= 32768) {
               var1 = field2408[arg0.field34 - 32768];
            }

            if (var1 != null) {
               class584 var3 = class584.method8152(arg0.method11602().field5446, var1.method11602().field5446);
               int var4 = (int)var3.field5328;
               int var5 = (int)var3.field5331;
               if (var4 != 0 || var5 != 0) {
                  arg0.method182((int)(Math.atan2((double)var4, (double)var5) * 2607.5945876176133D) & 16383);
               }
            }
         }

         if (arg0 instanceof class211) {
            class211 var6 = (class211)arg0;
            if (var6.field1383 != -1 && (var6.field60 == 0 || var6.field71 > 0)) {
               var6.method182(var6.field1383);
               var6.field1383 = -1;
            }
         } else if (arg0 instanceof class200) {
            class200 var7 = (class200)arg0;
            if (var7.field1305 != -1 && (var7.field60 == 0 || var7.field71 > 0)) {
               class584 var8 = var7.method11602().field5446;
               class723 var9 = field2468.method9649();
               int var10 = (int)var8.field5328 - (var7.field1305 * 256 - var9.field6676 * 256 - var9.field6676 * 256);
               int var11 = (int)var8.field5331 - (var7.field1299 * 256 - var9.field6677 * 256 - var9.field6677 * 256);
               if (var10 != 0 || var11 != 0) {
                  var7.method182((int)(Math.atan2((double)var10, (double)var11) * 2607.5945876176133D) & 16383);
               }

               var7.field1305 = -1;
            }
         }

         return arg0.method108();
      }
   }

   @deob.ObfuscatedName("cu.gq(Laab;S)V")
   private static final void method5183(class4 arg0) {
      if (arg0.field33 != null || arg0.field24 != null) {
         boolean var1 = true;
         class723 var2 = field2468.method9649();

         for(int var3 = 0; var3 < arg0.field33.length; ++var3) {
            int var4 = -1;
            if (arg0.field33 != null) {
               var4 = arg0.field33[var3];
            }

            if (var4 == -1) {
               if (!arg0.method87(var3, -1)) {
                  var1 = false;
               }
            } else {
               var1 = false;
               boolean var5 = false;
               boolean var6 = false;
               class584 var7 = arg0.method11602().field5446;
               int var11;
               int var12;
               if ((var4 & -1073741824) == -1073741824) {
                  int var8 = var4 & 268435455;
                  int var9 = var8 >> 14;
                  int var10 = var8 & 16383;
                  var11 = (int)var7.field5328 - ((var9 - var2.field6676) * 512 + 256);
                  var12 = (int)var7.field5331 - ((var10 - var2.field6677) * 512 + 256);
               } else if ((var4 & 32768) != 0) {
                  int var13 = var4 & 32767;
                  class211 var14 = field2408[var13];
                  if (var14 == null) {
                     arg0.method87(var3, -1);
                     continue;
                  }

                  class584 var15 = var14.method11602().field5446;
                  var11 = (int)var7.field5328 - (int)var15.field5328;
                  var12 = (int)var7.field5331 - (int)var15.field5331;
               } else {
                  class106 var16 = (class106)field2615.method15322((long)var4);
                  if (var16 == null) {
                     arg0.method87(var3, -1);
                     continue;
                  }

                  class200 var17 = (class200)var16.field807;
                  class584 var18 = var17.method11602().field5446;
                  var11 = (int)var7.field5328 - (int)var18.field5328;
                  var12 = (int)var7.field5331 - (int)var18.field5331;
               }

               if (var11 != 0 || var12 != 0) {
                  arg0.method87(var3, (int)(Math.atan2((double)var11, (double)var12) * 2607.5945876176133D) & 16383);
               }
            }
         }

         if (var1) {
            arg0.field33 = null;
            arg0.field24 = null;
         }

      }
   }

   @deob.ObfuscatedName("qf.ge(Laab;II)V")
   public static void method11115(class4 arg0, int arg1) {
      if (arg0.field41 != null) {
         class647 var2 = (class647)class814.method4102(class647.method15598(), arg1);
         int var3 = arg0.field41[var2.method9330()];
         if (var3 != arg0.field38.method14716()) {
            arg0.field38.method14777(var3, arg0.field38.method14701());
            arg0.field65 = arg0.field60;
         }
      }

   }

   @deob.ObfuscatedName("gn.gx(Laab;IIIB)V")
   private static void method6769(class4 arg0, int arg1, int arg2, int arg3) {
      class743 var4 = arg0.method101();
      class183 var5 = arg0.field35;
      int var6 = arg0.field56 - arg0.field57.field3820 & 16383;
      if (class647.field5873.field5871 == arg1) {
         if (var6 == 0 && arg0.field32 <= 25) {
            if (!var5.field1200 || !var4.method10966(var5.method14716())) {
               var5.method14697(var4.method10965(), false, true);
               var5.field1200 = var5.method14691();
            }
         } else if (arg3 < 0 && var4.field6815 != -1) {
            var5.method14697(var4.field6815, false, true);
            var5.field1200 = false;
         } else if (arg3 > 0 && var4.field6816 != -1) {
            var5.method14697(var4.field6816, false, true);
            var5.field1200 = false;
         } else if (!var5.field1200 || !var4.method10966(var5.method14716())) {
            var5.method14697(var4.method10965(), false, true);
            var5.field1200 = arg0.field35.method14691();
         }
      } else if (arg0.field34 == -1 || var6 < 10240 && var6 > 2048) {
         if (var6 == 0 && arg0.field32 <= 25) {
            if (class647.field5874.field5871 == arg1 && var4.field6848 != -1) {
               var5.method14697(var4.field6848, false, true);
            } else if (class647.field5872.field5871 == arg1 && var4.field6825 != -1) {
               var5.method14697(var4.field6825, false, true);
            } else {
               var5.method14697(var4.field6817, false, true);
            }

            var5.field1200 = false;
         } else {
            if (class647.field5874.field5871 == arg1 && var4.field6848 != -1) {
               if (arg3 < 0 && var4.field6828 != -1) {
                  var5.method14697(var4.field6828, false, true);
               } else if (arg3 > 0 && var4.field6844 != -1) {
                  var5.method14697(var4.field6844, false, true);
               } else {
                  var5.method14697(var4.field6848, false, true);
               }
            } else if (class647.field5872.field5871 == arg1 && var4.field6825 != -1) {
               if (arg3 < 0 && var4.field6829 != -1) {
                  var5.method14697(var4.field6829, false, true);
               } else if (arg3 > 0 && var4.field6830 != -1) {
                  var5.method14697(var4.field6830, false, true);
               } else {
                  var5.method14697(var4.field6825, false, true);
               }
            } else if (arg3 < 0 && var4.field6838 != -1) {
               var5.method14697(var4.field6838, false, true);
            } else if (arg3 > 0 && var4.field6834 != -1) {
               var5.method14697(var4.field6834, false, true);
            } else {
               var5.method14697(var4.field6817, false, true);
            }

            var5.field1200 = false;
         }
      } else {
         int var7 = field2396[arg2] - arg0.field57.field3820 & 16383;
         if (class647.field5874.field5871 == arg1 && var4.field6848 != -1) {
            if (var7 > 2048 && var7 <= 6144 && var4.field6837 != -1) {
               var5.method14697(var4.field6837, false, true);
            } else if (var7 >= 10240 && var7 < 14336 && var4.field6823 != -1) {
               var5.method14697(var4.field6823, false, true);
            } else if (var7 > 6144 && var7 < 10240 && var4.field6822 != -1) {
               var5.method14697(var4.field6822, false, true);
            } else {
               var5.method14697(var4.field6848, false, true);
            }
         } else if (class647.field5872.field5871 == arg1 && var4.field6825 != -1) {
            if (var7 > 2048 && var7 <= 6144 && var4.field6833 != -1) {
               var5.method14697(var4.field6833, false, true);
            } else if (var7 >= 10240 && var7 < 14336 && var4.field6827 != -1) {
               var5.method14697(var4.field6827, false, true);
            } else if (var7 > 6144 && var7 < 10240 && var4.field6843 != -1) {
               var5.method14697(var4.field6843, false, true);
            } else {
               var5.method14697(var4.field6825, false, true);
            }
         } else if (var7 > 2048 && var7 <= 6144 && var4.field6820 != -1) {
            var5.method14697(var4.field6820, false, true);
         } else if (var7 >= 10240 && var7 < 14336 && var4.field6819 != -1) {
            var5.method14697(var4.field6819, false, true);
         } else if (var7 > 6144 && var7 < 10240 && var4.field6818 != -1) {
            var5.method14697(var4.field6818, false, true);
         } else {
            var5.method14697(var4.field6817, false, true);
         }

         var5.field1200 = false;
      }

   }

   @deob.ObfuscatedName("rk.gt(Laht;III)V")
   public static void method11738(class211 arg0, int arg1, int arg2) {
      int[] var3 = new int[class647.method15598().length];
      Arrays.fill(var3, 0, var3.length, arg1);
      method2051(arg0, var3, arg2, false);
   }

   @deob.ObfuscatedName("qb.gk(Laab;[I[I[II)V")
   public static void method11048(class4 arg0, int[] arg1, int[] arg2, int[] arg3) {
      for(int var4 = 0; var4 < arg1.length; ++var4) {
         int var5 = arg1[var4];
         int var6 = arg3[var4];
         int var7 = arg2[var4];
         int var8 = 0;

         while(var6 != 0 && var8 < arg0.field31.length) {
            if ((var6 & 1) != 0) {
               if (var5 == -1) {
                  arg0.field31[var8] = null;
               } else {
                  class806 var9 = Statics.field2046.method14475(var5);
                  int var10 = var9.field8370;
                  class278 var11 = arg0.field31[var8];
                  if (var11 != null && var11.method14691()) {
                     if (var5 == var11.method14716()) {
                        if (var10 == 0) {
                           arg0.field31[var8] = null;
                           var11 = null;
                        } else if (var10 == 1) {
                           var11.method14761();
                           var11.field1829 = var7;
                        } else if (var10 == 2) {
                           var11.method14737();
                        }
                     } else if (var9.field8365 >= var11.method14698().field8365) {
                        arg0.field31[var8] = null;
                        var11 = null;
                     }
                  }

                  if (var11 == null || !var11.method14691()) {
                     class278 var12 = arg0.field31[var8] = new class278(arg0);
                     var12.method14694(var5);
                     var12.field1829 = var7;
                  }
               }
            }

            ++var8;
            var6 >>>= 1;
         }
      }

   }

   @deob.ObfuscatedName("aft.gh(I)V")
   private static final void method2218() {
      class764.method17074(Statics.field8847, (long)field2418);
      if (field2593 != -1) {
         method15914(field2593);
      }

      for(int var0 = 0; var0 < field2651; ++var0) {
         field2654[var0] = field2558[var0];
         field2558[var0] = false;
      }

      field2652 = field2418;
      if (field2593 != -1) {
         field2651 = 0;
         method15734();
      }

      Statics.field8847.method7508();
      class987.method390(Statics.field8847);
      int var1 = class987.method6865();
      if (var1 == -1) {
         var1 = field2451;
      }

      if (var1 == -1) {
         var1 = field2557;
      }

      method4455(var1);
      field2505 = 0;
   }

   @deob.ObfuscatedName("nn.ga(J)V")
   private static final void method9949(long arg0) {
      if (field2468.method9639() != null) {
         if (Statics.field5998 != 4 && Statics.field5998 != 6) {
            if (Statics.field5998 == 5) {
               method594(arg0);
            }
         } else {
            method7946(arg0);
         }
      }

      class764.method17074(Statics.field8847, (long)field2418);
      if (field2593 != -1) {
         method15914(field2593);
      }

      for(int var2 = 0; var2 < field2651; ++var2) {
         field2654[var2] = field2558[var2];
         field2558[var2] = false;
      }

      field2652 = field2418;
      class987.method9122(-1, -1);
      if (field2593 != -1) {
         field2651 = 0;
         method15734();
      }

      Statics.field8847.method7508();
      class987.method390(Statics.field8847);
      int var3 = class987.method6865();
      if (var3 == -1) {
         var3 = field2451;
      }

      if (var3 == -1) {
         var3 = field2557;
      }

      method4455(var3);
      int var4 = Statics.field5701.method96() << 8;
      class584 var5 = Statics.field5701.method11602().field5446;
      Statics.method1100(Statics.field5701.field1032, (int)var5.field5328 + var4, (int)var5.field5331 + var4, field2505);
      field2505 = 0;
   }

   @deob.ObfuscatedName("nh.gp(IIIIZB)V")
   private static final void method9842(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      if (field2468.method9639() == null) {
         Statics.field8847.method11524(arg0, arg1, arg2, arg3, -16777216);
      } else {
         class584 var5 = Statics.field5701.method11602().field5446;
         boolean var6 = false;
         if (field2476 != 2) {
            if (!field2477) {
               var6 = true;
            }
         } else {
            if ((int)var5.field5328 < 0 || (int)var5.field5328 >= field2468.method9648() * 512 || (int)var5.field5331 < 0 || (int)var5.field5331 >= field2468.method9604() * 512) {
               var6 = true;
            }

            if (Statics.field5998 == 2 && !Statics.field6895.method6366()) {
               var6 = true;
            }
         }

         if (var6) {
            Statics.field8847.method11524(arg0, arg1, arg2, arg3, -16777216);
         } else {
            ++field2530;
            if (Statics.field5701 != null && (int)var5.field5328 - (Statics.field5701.method96() - 1) * 256 >> 9 == class299.field1890 && (int)var5.field5331 - (Statics.field5701.method96() - 1) * 256 >> 9 == class299.field1895) {
               class299.field1890 = -1;
               class299.field1895 = -1;
               class231.method11314();
            }

            method11265();
            if (!arg4) {
               method15364();
            }

            method10658();
            Statics.method4098(arg0, arg1, arg2, arg3, true);
            int var7 = field2689;
            int var8 = field2690;
            int var9 = field2431;
            int var10 = field2692;
            class987.method9122(var7, var8);
            if (Statics.field5998 == 4) {
               int var11 = (int)field2603;
               if (field2394 >> 8 > var11) {
                  var11 = field2394 >> 8;
               }

               if (field2531[4] && field2678[4] + 128 > var11) {
                  var11 = field2678[4] + 128;
               }

               int var12 = field2496 + (int)field2502 & 16383;
               method14658(Statics.field5542, method5777((int)var5.field5328, (int)var5.field5331, Statics.field1977) - field2579, Statics.field9259, var11, var12, (var11 >> 3) * 3 + 600 << 2, var10);
            } else if (Statics.field5998 == 5) {
               int var13 = (int)field2603;
               if (field2394 >> 8 > var13) {
                  var13 = field2394 >> 8;
               }

               if (field2531[4] && field2678[4] + 128 > var13) {
                  var13 = field2678[4] + 128;
               }

               int var14 = (int)field2502 & 16383;
               method14658(Statics.field5542, method5777(field2506, field2507, Statics.field1977) - field2579, Statics.field9259, var13, var14, (var13 >> 3) * 3 + 600 << 2, var10);
            } else if (Statics.field5998 == 6) {
               method8549(var10);
            }

            int var15 = Statics.field337;
            int var16 = Statics.field6719;
            int var17 = Statics.field3115;
            int var18 = Statics.field4218;
            int var19 = Statics.field7098;

            for(int var20 = 0; var20 < 5; ++var20) {
               if (field2531[var20]) {
                  int var21 = (int)(Math.random() * (double)(field2677[var20] * 2 + 1) - (double)field2677[var20] + Math.sin((double)field2679[var20] / 100.0D * (double)field2510[var20]) * (double)field2678[var20]);
                  if (var20 == 0) {
                     Statics.field337 += var21 << 2;
                  }

                  if (var20 == 1) {
                     Statics.field6719 += var21 << 2;
                  }

                  if (var20 == 2) {
                     Statics.field3115 += var21 << 2;
                  }

                  if (var20 == 3) {
                     Statics.field7098 = Statics.field7098 + var21 & 16383;
                  }

                  if (var20 == 4) {
                     Statics.field4218 += var21;
                     if (Statics.field4218 < 1024) {
                        Statics.field4218 = 1024;
                     } else if (Statics.field4218 > 3072) {
                        Statics.field4218 = 3072;
                     }
                  }
               }
            }

            if (Statics.field337 < 0) {
               Statics.field337 = 0;
            }

            if (Statics.field337 > (field2468.method9639().field6577 << 9) - 1) {
               Statics.field337 = (field2468.method9639().field6577 << 9) - 1;
            }

            if (Statics.field3115 < 0) {
               Statics.field3115 = 0;
            }

            if (Statics.field3115 > (field2468.method9639().field6578 << 9) - 1) {
               Statics.field3115 = (field2468.method9639().field6578 << 9) - 1;
            }

            method5392();
            Statics.field8847.method7505(var7, var8, var9, var10);
            Statics.field8847.method7716(var7, var8, var7 + var9, var8 + var10);
            class769 var22 = field2468.method9512().method11124();
            int var23 = var22.method11438();
            class461 var24 = new class461();
            class723 var25 = field2468.method9649();
            if (class744.method14383()) {
               Statics.field7127.method6314(var24, field2672, field2435, var25.field6676 << 9, var25.field6677 << 9);
            } else if (Statics.field5998 == 2) {
               Statics.field6895.method6314(var24, field2672, field2435, var25.field6676 << 9, var25.field6677 << 9);
            } else {
               field2672.method8071((float)(-Statics.field337), (float)(-Statics.field6719), (float)(-Statics.field3115));
               field2672.method8126(0.0F, -1.0F, 0.0F, class603.method8577(-Statics.field7098 & 16383));
               field2672.method8126(-1.0F, 0.0F, 0.0F, class603.method8577(-Statics.field4218 & 16383));
               field2672.method8126(0.0F, 0.0F, -1.0F, class603.method8577(-Statics.field6938 & 16383));
               method15586(field2435, true, (float)(var9 / 2), (float)(var10 / 2), (float)(field2693 << 1), (float)(field2693 << 1), var9, var10);
            }

            Statics.field8847.method7778(field2672);
            Statics.field8847.method7545(field2435);
            if (var22.method11439() != null) {
               Statics.field8847.method7547(1.0F);
               Statics.field8847.method7588(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
               var22.method11439().method9472(Statics.field8847, Statics.field1097 << 3, var7, var8, var9, var10, Statics.field4218, Statics.field7098, Statics.field6938, var23, true, false);
            } else {
               Statics.field8847.method2522(3, var23);
            }

            class987.method9123(field2672, field2435, var9, var10);
            field2468.method9512().method11137(field2468);
            byte var26 = Statics.field9361.field968.method2071() == 2 ? (byte)field2530 : 1;
            if (!class744.method14383() && Statics.field5998 != 2) {
               field2468.method9639().method10614(field2418, Statics.field337, Statics.field6719, Statics.field3115, field2468.method9526(), field2546, field2547, field2585, field2549, field2550, Statics.field5701.field1032 + 1, var26, (int)var5.field5328 >> 9, (int)var5.field5331 >> 9, Statics.field9361.field958.method2214() == 0, true, 0, true);
            } else {
               field2468.method9639().method10614(field2418, var24.field3806, var24.field3807, var24.field3805, field2468.method9526(), field2546, field2547, field2585, field2549, field2550, Statics.field5701.field1032 + 1, var26, (int)var5.field5328 >> 9, (int)var5.field5331 >> 9, Statics.field9361.field958.method2214() == 0, true, 0, true);
            }

            ++field2498;
            class677.method9259();
            if (field2410 == 1) {
               method6509(var7, var8, var9, var10, 256, 256);
               method8976(var7, var8, var9, var10, 256, 256);
               method11087(var7, var8, var9, var10, 256, 256);
               Statics.method10792(var7, var8, var9, var10);
            }

            field2468.method9639().method10578();
            Statics.field337 = var15;
            Statics.field6719 = var16;
            Statics.field3115 = var17;
            Statics.field4218 = var18;
            Statics.field7098 = var19;
            if (field2416 && Statics.field9401.method9116() == 0) {
               field2416 = false;
            }

            if (field2416) {
               Statics.field8847.method11524(var7, var8, var9, var10, -16777216);
               class327.method5400(class881.field8978.method15374(Statics.field243), false, Statics.field8847, Statics.field6177, Statics.field7094);
            }

            method15586(field2435, false, (float)(var9 / 2 + var7), (float)(var10 / 2 + var8), (float)(field2693 << 1), (float)(field2693 << 1), var9, var10);
            Statics.field8847.method7545(field2435);
            Statics.method6489(field2435);
         }
      }
   }

   @deob.ObfuscatedName("tz.ho(I)V")
   public static final void method15057() {
      int var0 = Statics.field9361.field968.method2071();
      if (var0 == 0) {
         field2468.method9578((byte[][][])null);
         method1513(0);
      } else if (var0 == 1) {
         method14063((byte)0);
         method1513(512);
         if (field2468.method9639() != null) {
            method15565();
         }
      } else {
         method14063((byte)(field2530 - 4 & 255));
         method1513(2);
      }

      field2545 = Statics.field1977;
   }

   @deob.ObfuscatedName("ro.hu(BI)V")
   private static final void method14063(byte arg0) {
      byte[][][] var1 = field2468.method9526();
      if (var1 == null) {
         var1 = new byte[4][field2468.method9648()][field2468.method9604()];
         field2468.method9578(var1);
      }

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < field2468.method9648(); ++var3) {
            for(int var4 = 0; var4 < field2468.method9604(); ++var4) {
               var1[var2][var3][var4] = arg0;
            }
         }
      }

   }

   @deob.ObfuscatedName("aef.hl(II)V")
   private static final void method1513(int arg0) {
      field2546 = new int[arg0];
      field2547 = new int[arg0];
      field2585 = new int[arg0];
      field2549 = new int[arg0];
      field2550 = new int[arg0];
   }

   @deob.ObfuscatedName("vp.hf(I)V")
   private static final void method15565() {
      int var0 = 0;
      class713 var1 = field2468.method9639();

      for(int var2 = 0; var2 < field2468.method9648(); ++var2) {
         for(int var3 = 0; var3 < field2468.method9604(); ++var3) {
            if (method17056(var1.field6579, var0, var2, var3, true)) {
               ++var0;
            }

            if (var0 >= 512) {
               return;
            }
         }
      }

   }

   @deob.ObfuscatedName("dg.hw(I)V")
   private static final void method5392() {
      if (Statics.field9361.field968.method2071() == 2) {
         byte[][][] var0 = field2468.method9526();
         byte var1 = (byte)(field2530 - 4 & 255);
         int var2 = field2530 % field2468.method9648();

         for(int var3 = 0; var3 < 4; ++var3) {
            for(int var4 = 0; var4 < field2468.method9604(); ++var4) {
               var0[var3][var2][var4] = var1;
            }
         }

         if (Statics.field1977 != 3) {
            for(int var5 = 0; var5 < 2; ++var5) {
               field2546[var5] = -1000000;
               field2547[var5] = 1000000;
               field2585[var5] = 0;
               field2550[var5] = 1000000;
               field2549[var5] = 0;
            }

            class584 var6 = Statics.field5701.method11602().field5446;
            int var7 = (int)var6.field5328;
            int var8 = (int)var6.field5331;
            class611 var9 = field2468.method9592();
            class713 var10 = field2468.method9639();
            if (Statics.field5998 != 4 && Statics.field5929 == -1) {
               int var11 = method5777(Statics.field337, Statics.field3115, Statics.field1977);
               if (var11 - Statics.field6719 < 3200 && (var9.field5520[Statics.field1977][Statics.field337 >> 9][Statics.field3115 >> 9] & 4) != 0) {
                  method17056(var10.field6579, 1, Statics.field337 >> 9, Statics.field3115 >> 9, false);
               }
            } else {
               if (Statics.field5998 != 4) {
                  var7 = Statics.field5929;
                  var8 = Statics.field6637;
               }

               if ((var9.field5520[Statics.field1977][var7 >> 9][var8 >> 9] & 4) != 0) {
                  method17056(var10.field6579, 0, var7 >> 9, var8 >> 9, false);
                  return;
               }

               int var12 = Statics.field337 >> 9;
               int var13 = Statics.field3115 >> 9;
               int var14 = var7 >> 9;
               int var15 = var8 >> 9;
               if (var9.method8753(var12, var13)) {
                  int var16 = method5777(Statics.field337, Statics.field3115, 3);
                  if (Statics.field6719 >= var16) {
                     method17056(var10.field6579, 1, var12, var13, false);
                  }

                  return;
               }

               if (Statics.field4218 < 2560) {
                  int var17;
                  if (var14 > var12) {
                     var17 = var14 - var12;
                  } else {
                     var17 = var12 - var14;
                  }

                  int var18;
                  if (var15 > var13) {
                     var18 = var15 - var13;
                  } else {
                     var18 = var13 - var15;
                  }

                  if (var17 == 0 && var18 == 0 || var17 <= -field2468.method9648() || var17 >= field2468.method9648() || var18 <= -field2468.method9604() || var18 >= field2468.method9604()) {
                     class723 var23 = field2468.method9649();
                     class285.method15864(var12 + class582.field5306 + var13 + " " + var14 + class582.field5306 + var15 + " " + var23.field6676 + class582.field5306 + var23.field6677, new RuntimeException());
                     return;
                  }

                  if (var17 > var18) {
                     int var19 = var18 * 65536 / var17;
                     int var20 = 32768;

                     while(var12 != var14) {
                        if (var12 < var14) {
                           ++var12;
                        } else if (var12 > var14) {
                           --var12;
                        }

                        if ((var9.field5520[Statics.field1977][var12][var13] & 4) != 0) {
                           method17056(var10.field6579, 1, var12, var13, false);
                           break;
                        }

                        var20 += var19;
                        if (var20 >= 65536) {
                           var20 -= 65536;
                           if (var13 < var15) {
                              ++var13;
                           } else if (var13 > var15) {
                              --var13;
                           }

                           if ((var9.field5520[Statics.field1977][var12][var13] & 4) != 0) {
                              method17056(var10.field6579, 1, var12, var13, false);
                              break;
                           }
                        }
                     }
                  } else {
                     int var21 = var17 * 65536 / var18;
                     int var22 = 32768;

                     while(var13 != var15) {
                        if (var13 < var15) {
                           ++var13;
                        } else if (var13 > var15) {
                           --var13;
                        }

                        if ((var9.field5520[Statics.field1977][var12][var13] & 4) != 0) {
                           method17056(var10.field6579, 1, var12, var13, false);
                           break;
                        }

                        var22 += var21;
                        if (var22 >= 65536) {
                           var22 -= 65536;
                           if (var12 < var14) {
                              ++var12;
                           } else if (var12 > var14) {
                              --var12;
                           }

                           if ((var9.field5520[Statics.field1977][var12][var13] & 4) != 0) {
                              method17056(var10.field6579, 1, var12, var13, false);
                              break;
                           }
                        }
                     }
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("zc.hm([[[Lom;IIIZB)Z")
   private static final boolean method17056(class703[][][] arg0, int arg1, int arg2, int arg3, boolean arg4) {
      byte[][][] var5 = field2468.method9526();
      byte var6 = arg4 ? 1 : (byte)(field2530 & 255);
      if (var5[Statics.field1977][arg2][arg3] == var6) {
         return false;
      } else {
         class611 var7 = field2468.method9592();
         if ((var7.field5520[Statics.field1977][arg2][arg3] & 4) == 0) {
            return false;
         } else {
            byte var8 = 0;
            int var9 = 0;
            field2487[var8] = arg2;
            int var36 = var8 + 1;
            field2538[var8] = arg3;
            var5[Statics.field1977][arg2][arg3] = var6;

            while(var36 != var9) {
               int var10 = field2487[var9] & 65535;
               int var11 = field2487[var9] >> 16 & 255;
               int var12 = field2487[var9] >> 24 & 255;
               int var13 = field2538[var9] & 65535;
               int var14 = field2538[var9] >> 16 & 255;
               var9 = var9 + 1 & 4095;
               boolean var15 = false;
               if ((var7.field5520[Statics.field1977][var10][var13] & 4) == 0) {
                  var15 = true;
               }

               boolean var16 = false;
               if (arg0 != null) {
                  label242:
                  for(int var17 = Statics.field1977 + 1; var17 <= 3; ++var17) {
                     if (arg0[var17] != null && (var7.field5520[var17][var10][var13] & 8) == 0) {
                        if (var15 && arg0[var17][var10][var13] != null) {
                           if (arg0[var17][var10][var13].field6481 != null) {
                              int var18 = method6122(var11);
                              if (arg0[var17][var10][var13].field6481.field1819 == var18 || arg0[var17][var10][var13].field6479 != null && arg0[var17][var10][var13].field6479.field1819 == var18) {
                                 continue;
                              }

                              if (var12 != 0) {
                                 int var19 = method6122(var12);
                                 if (arg0[var17][var10][var13].field6481.field1819 == var19 || arg0[var17][var10][var13].field6479 != null && arg0[var17][var10][var13].field6479.field1819 == var19) {
                                    continue;
                                 }
                              }

                              if (var14 != 0) {
                                 int var20 = method6122(var14);
                                 if (arg0[var17][var10][var13].field6481.field1819 == var20 || arg0[var17][var10][var13].field6479 != null && arg0[var17][var10][var13].field6479.field1819 == var20) {
                                    continue;
                                 }
                              }
                           }

                           class703 var21 = arg0[var17][var10][var13];
                           if (var21.field6484 != null) {
                              for(class699 var22 = var21.field6484; var22 != null; var22 = var22.field6457) {
                                 class290 var23 = var22.field6458;
                                 if (var23 instanceof class376) {
                                    class376 var24 = (class376)var23;
                                    int var25 = var24.method5083();
                                    int var26 = var24.method5084();
                                    if (var25 == 21) {
                                       var25 = 19;
                                    }

                                    int var27 = var25 | var26 << 6;
                                    if (var11 == var27 || var12 != 0 && var12 == var27 || var14 != 0 && var14 == var27) {
                                       continue label242;
                                    }
                                 }
                              }
                           }
                        }

                        class703 var28 = arg0[var17][var10][var13];
                        if (var28 != null && var28.field6484 != null) {
                           for(class699 var29 = var28.field6484; var29 != null; var29 = var29.field6457) {
                              class290 var30 = var29.field6458;
                              if (var30.field1875 != var30.field1873 || var30.field1876 != var30.field1874) {
                                 for(int var31 = var30.field1875; var31 <= var30.field1873; ++var31) {
                                    for(int var32 = var30.field1874; var32 <= var30.field1876; ++var32) {
                                       var5[var17][var31][var32] = var6;
                                    }
                                 }
                              }
                           }
                        }

                        var5[var17][var10][var13] = var6;
                        var16 = true;
                     }
                  }
               }

               if (var16) {
                  int var33 = field2468.method9639().field6580[Statics.field1977 + 1].method15966(var10, var13);
                  if (field2546[arg1] < var33) {
                     field2546[arg1] = var33;
                  }

                  int var34 = var10 << 9;
                  int var35 = var13 << 9;
                  if (field2547[arg1] > var34) {
                     field2547[arg1] = var34;
                  } else if (field2585[arg1] < var34) {
                     field2585[arg1] = var34;
                  }

                  if (field2550[arg1] > var35) {
                     field2550[arg1] = var35;
                  } else if (field2549[arg1] < var35) {
                     field2549[arg1] = var35;
                  }
               }

               if (!var15) {
                  if (var10 >= 1 && var5[Statics.field1977][var10 - 1][var13] != var6) {
                     field2487[var36] = var10 - 1 | 1179648 | -754974720;
                     field2538[var36] = var13 | 1245184;
                     var36 = var36 + 1 & 4095;
                     var5[Statics.field1977][var10 - 1][var13] = var6;
                  }

                  ++var13;
                  if (var13 < field2468.method9604()) {
                     if (var10 - 1 >= 0 && var5[Statics.field1977][var10 - 1][var13] != var6 && (var7.field5520[Statics.field1977][var10][var13] & 4) == 0 && (var7.field5520[Statics.field1977][var10 - 1][var13 - 1] & 4) == 0) {
                        field2487[var36] = var10 - 1 | 1179648 | 1375731712;
                        field2538[var36] = var13 | 1245184;
                        var36 = var36 + 1 & 4095;
                        var5[Statics.field1977][var10 - 1][var13] = var6;
                     }

                     if (var5[Statics.field1977][var10][var13] != var6) {
                        field2487[var36] = var10 | 5373952 | 318767104;
                        field2538[var36] = var13 | 5439488;
                        var36 = var36 + 1 & 4095;
                        var5[Statics.field1977][var10][var13] = var6;
                     }

                     if (var10 + 1 < field2468.method9648() && var5[Statics.field1977][var10 + 1][var13] != var6 && (var7.field5520[Statics.field1977][var10][var13] & 4) == 0 && (var7.field5520[Statics.field1977][var10 + 1][var13 - 1] & 4) == 0) {
                        field2487[var36] = var10 + 1 | 5373952 | -1845493760;
                        field2538[var36] = var13 | 5439488;
                        var36 = var36 + 1 & 4095;
                        var5[Statics.field1977][var10 + 1][var13] = var6;
                     }
                  }

                  --var13;
                  if (var10 + 1 < field2468.method9648() && var5[Statics.field1977][var10 + 1][var13] != var6) {
                     field2487[var36] = var10 + 1 | 9568256 | 1392508928;
                     field2538[var36] = var13 | 9633792;
                     var36 = var36 + 1 & 4095;
                     var5[Statics.field1977][var10 + 1][var13] = var6;
                  }

                  --var13;
                  if (var13 >= 0) {
                     if (var10 - 1 >= 0 && var5[Statics.field1977][var10 - 1][var13] != var6 && (var7.field5520[Statics.field1977][var10][var13] & 4) == 0 && (var7.field5520[Statics.field1977][var10 - 1][var13 + 1] & 4) == 0) {
                        field2487[var36] = var10 - 1 | 13762560 | 301989888;
                        field2538[var36] = var13 | 13828096;
                        var36 = var36 + 1 & 4095;
                        var5[Statics.field1977][var10 - 1][var13] = var6;
                     }

                     if (var5[Statics.field1977][var10][var13] != var6) {
                        field2487[var36] = var10 | 13762560 | -1828716544;
                        field2538[var36] = var13 | 13828096;
                        var36 = var36 + 1 & 4095;
                        var5[Statics.field1977][var10][var13] = var6;
                     }

                     if (var10 + 1 < field2468.method9648() && var5[Statics.field1977][var10 + 1][var13] != var6 && (var7.field5520[Statics.field1977][var10][var13] & 4) == 0 && (var7.field5520[Statics.field1977][var10 + 1][var13 + 1] & 4) == 0) {
                        field2487[var36] = var10 + 1 | 9568256 | -771751936;
                        field2538[var36] = var13 | 9633792;
                        var36 = var36 + 1 & 4095;
                        var5[Statics.field1977][var10 + 1][var13] = var6;
                     }
                  }
               }
            }

            if (field2546[arg1] != -1000000) {
               field2546[arg1] += 40;
               field2547[arg1] -= 512;
               field2585[arg1] += 512;
               field2549[arg1] += 512;
               field2550[arg1] -= 512;
            }

            return true;
         }
      }
   }

   @deob.ObfuscatedName("ex.he(IB)I")
   private static final int method6122(int arg0) {
      int var1 = arg0 & 63;
      int var2 = arg0 >> 6 & 3;
      if (var1 == 18) {
         if (var2 == 0) {
            return 1;
         }

         if (var2 == 1) {
            return 2;
         }

         if (var2 == 2) {
            return 4;
         }

         if (var2 == 3) {
            return 8;
         }
      } else if (var1 == 19 || var1 == 21) {
         if (var2 == 0) {
            return 16;
         }

         if (var2 == 1) {
            return 32;
         }

         if (var2 == 2) {
            return 64;
         }

         if (var2 == 3) {
            return 128;
         }
      }

      return 0;
   }

   @deob.ObfuscatedName("qm.hz(I)V")
   private static final void method11265() {
      for(class57 var0 = (class57)field2534.method14797(); var0 != null; var0 = (class57)field2534.method14797()) {
         class57.method17064(var0);
      }

      byte var1 = 0;
      byte var2 = 3;
      if (field2476 == 0) {
         for(int var3 = var1; var3 <= var2; ++var3) {
            method4564(var3);
         }

         method4566();
      } else {
         method4561();

         for(int var4 = var1; var4 <= var2; ++var4) {
            method4660();
            method4563(var4);
            method4564(var4);
         }

         method4614();
         method4566();
      }

   }

   @deob.ObfuscatedName("client.hn()V")
   private static final void method4561() {
      int var0 = class324.field2053;
      int[] var1 = class324.field2057;
      int var2 = Statics.field9361.field962.method2148();
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      for(int var4 = 0; var4 < var0; ++var4) {
         class211 var5 = field2408[var1[var4]];
         if (!var5.method2867()) {
            var5.field19 = -1;
         } else if (var5.field1408) {
            var5.field19 = -1;
         } else {
            var5.method184();
            if (var5.field1875 >= 0 && var5.field1874 >= 0 && var5.field1873 < field2468.method9648() && var5.field1876 < field2468.method9604()) {
               var5.field1394 = var5.field35.field1200 ? var3 : false;
               if (Statics.field5701 == var5) {
                  var5.field19 = Integer.MAX_VALUE;
               } else {
                  int var6 = 0;
                  if (!var5.field59) {
                     ++var6;
                  }

                  if (!var5.field49.method14805()) {
                     var6 += 2;
                  }

                  int var7 = var6 + (5 - var5.method96() << 2);
                  if (!var5.field1410 && !var5.field1409) {
                     if (field2535 == 0) {
                        var7 += 32;
                     } else {
                        var7 += 128;
                     }

                     var7 += 256;
                  } else {
                     var7 += 512;
                  }

                  var5.field19 = var7 + 1;
               }
            } else {
               var5.field19 = -1;
            }
         }
      }

      for(int var8 = 0; var8 < field2455; ++var8) {
         class200 var9 = (class200)((class106)field2615.method15322((long)field2456[var8])).field807;
         if (var9.method2791() && var9.field1312.method15779(Statics.field10637)) {
            var9.method184();
            if (var9.field1875 >= 0 && var9.field1874 >= 0 && var9.field1873 < field2468.method9648() && var9.field1876 < field2468.method9604()) {
               int var10 = 0;
               if (!var9.field59) {
                  ++var10;
               }

               if (!var9.field49.method14805()) {
                  var10 += 2;
               }

               int var11 = var10 + (5 - var9.method96() << 2);
               if (field2535 == 0) {
                  if (var9.field1312.field9344) {
                     var11 += 64;
                  } else {
                     var11 += 128;
                  }
               } else if (field2535 == 1) {
                  if (var9.field1312.field9344) {
                     var11 += 32;
                  } else {
                     var11 += 64;
                  }
               }

               if (var9.field1312.field9302) {
                  var11 += 1024;
               } else if (!var9.field1312.field9307) {
                  var11 += 256;
               }

               var9.field19 = var11 + 1;
            } else {
               var9.field19 = -1;
            }
         } else {
            var9.field19 = -1;
         }
      }

      for(int var12 = 0; var12 < field2423.length; ++var12) {
         class164 var13 = field2423[var12];
         if (var13 != null) {
            if (var13.field1156 == 1) {
               class106 var14 = (class106)field2615.method15322((long)var13.field1150);
               if (var14 != null) {
                  class200 var15 = (class200)var14.field807;
                  if (var15.field19 >= 0) {
                     var15.field19 += 2048;
                  }
               }
            } else if (var13.field1156 == 10) {
               class211 var16 = field2408[var13.field1150];
               if (var16 != null && Statics.field5701 != var16 && var16.field19 >= 0) {
                  var16.field19 += 2048;
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("client.hc()V")
   private static final void method4660() {
      int[][] var0 = field2468.method9518();
      int var1 = field2468.method9648();
      int var2 = field2468.method9604();

      for(int var3 = 0; var3 < var1; ++var3) {
         int[] var4 = var0[var3];

         for(int var5 = 0; var5 < var2; ++var5) {
            var4[var5] = 0;
         }
      }

   }

   @deob.ObfuscatedName("client.hy(I)V")
   private static final void method4563(int arg0) {
      int var1 = class324.field2053;
      int[] var2 = class324.field2057;
      int[][] var3 = field2468.method9518();
      int[][] var4 = field2468.method9525();
      int var5;
      if (field2476 == 0) {
         var5 = Statics.field9261.length;
      } else {
         var5 = field2455 + var1;
      }

      for(int var6 = 0; var6 < var5; ++var6) {
         class4 var8;
         if (field2476 == 0) {
            class411 var7 = Statics.field9261[var6];
            if (!var7.field3098) {
               continue;
            }

            var8 = var7.method5645();
         } else {
            if (var6 < var1) {
               var8 = field2408[var2[var6]];
            } else {
               var8 = (class4)((class106)field2615.method15322((long)field2456[var6 - var1])).field807;
            }

            if (var8.field1032 != arg0 || var8.field19 < 0) {
               continue;
            }
         }

         int var9 = var8.method96();
         class584 var10 = var8.method11602().field5446;
         if ((var9 & 1) == 0) {
            if (((int)var10.field5328 & 511) != 0 || ((int)var10.field5331 & 511) != 0) {
               continue;
            }
         } else if (((int)var10.field5328 & 511) != 256 || ((int)var10.field5331 & 511) != 256) {
            continue;
         }

         int var10002;
         if (var9 == 1) {
            int var11 = (int)var10.field5328 >> 9;
            int var12 = (int)var10.field5331 >> 9;
            if (var8.field19 > var3[var11][var12]) {
               var3[var11][var12] = var8.field19;
               var4[var11][var12] = 1;
            } else if (var8.field19 == var3[var11][var12]) {
               var10002 = var4[var11][var12]++;
            }
         } else {
            int var13 = (var9 - 1) * 256 + 60;
            int var14 = (int)var10.field5328 - var13 >> 9;
            int var15 = (int)var10.field5331 - var13 >> 9;
            int var16 = (int)var10.field5328 + var13 >> 9;
            int var17 = (int)var10.field5331 + var13 >> 9;

            for(int var18 = var14; var18 <= var16; ++var18) {
               for(int var19 = var15; var19 <= var17; ++var19) {
                  if (var8.field19 > var3[var18][var19]) {
                     var3[var18][var19] = var8.field19;
                     var4[var18][var19] = 1;
                  } else if (var8.field19 == var3[var18][var19]) {
                     var10002 = var4[var18][var19]++;
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("client.hr(I)V")
   private static final void method4564(int arg0) {
      int var1 = class324.field2053;
      int[] var2 = class324.field2057;
      int[][] var3 = field2468.method9518();
      int[][] var4 = field2468.method9525();
      int var5;
      if (field2476 == 0) {
         var5 = Statics.field9261.length;
      } else {
         var5 = field2426 ? var1 : field2455 + var1;
      }

      for(int var6 = 0; var6 < var5; ++var6) {
         class4 var8;
         if (field2476 == 0) {
            class411 var7 = Statics.field9261[var6];
            if (!var7.field3098) {
               continue;
            }

            var8 = var7.method5645();
         } else {
            if (var6 < var1) {
               var8 = field2408[var2[var6]];
            } else {
               var8 = (class4)((class106)field2615.method15322((long)field2456[var6 - var1])).field807;
            }

            if (var8.field1032 != arg0) {
               continue;
            }

            if (var8.field19 < 0) {
               var8.field59 = false;
               continue;
            }
         }

         var8.field17 = 0;
         int var9 = var8.method96();
         class584 var10 = var8.method11602().field5446;
         if ((var9 & 1) == 0) {
            if (((int)var10.field5328 & 511) != 0 || ((int)var10.field5331 & 511) != 0) {
               var8.field59 = false;
               continue;
            }
         } else if (((int)var10.field5328 & 511) != 256 || ((int)var10.field5331 & 511) != 256) {
            var8.field59 = false;
            continue;
         }

         if (field2476 != 0) {
            int var10002;
            if (var9 == 1) {
               int var11 = (int)var10.field5328 >> 9;
               int var12 = (int)var10.field5331 >> 9;
               if (var8.field19 != var3[var11][var12]) {
                  var8.field59 = true;
                  continue;
               }

               if (var4[var11][var12] > 1) {
                  var10002 = var4[var11][var12]--;
                  var8.field59 = true;
                  continue;
               }
            } else {
               int var13 = (var9 - 1) * 256 + 252;
               int var14 = (int)var10.field5328 - var13 >> 9;
               int var15 = (int)var10.field5331 - var13 >> 9;
               int var16 = (int)var10.field5328 + var13 >> 9;
               int var17 = (int)var10.field5331 + var13 >> 9;
               if (!method5629(var3, var4, var8.field19, var14, var15, var16, var17)) {
                  for(int var18 = var14; var18 <= var16; ++var18) {
                     for(int var19 = var15; var19 <= var17; ++var19) {
                        if (var8.field19 == var3[var18][var19]) {
                           var10002 = var4[var18][var19]--;
                        }
                     }
                  }

                  var8.field59 = true;
                  continue;
               }
            }
         }

         var8.field59 = false;
         var8.method11608(var10.field5328, (float)method5777((int)var10.field5328, (int)var10.field5331, var8.field1032), var10.field5331);
         field2468.method9639().method10498(var8, true);
      }

   }

   @deob.ObfuscatedName("dw.hb([[I[[IIIIIIB)Z")
   private static final boolean method5629(int[][] arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      for(int var7 = arg3; var7 <= arg5; ++var7) {
         for(int var8 = arg4; var8 <= arg6; ++var8) {
            if (arg0[var7][var8] == arg2 && arg1[var7][var8] <= 1) {
               return true;
            }
         }
      }

      return false;
   }

   @deob.ObfuscatedName("client.hg()V")
   private static final void method4614() {
      field2671 = 0;

      for(int var0 = 0; var0 < field2455; ++var0) {
         class200 var1 = (class200)((class106)field2615.method15322((long)field2456[var0])).field807;
         if (var1.field59 && var1.method103() != -1) {
            int var2 = (var1.method96() - 1) * 256 + 252;
            class584 var3 = var1.method11602().field5446;
            int var4 = (int)var3.field5328 - var2 >> 9;
            int var5 = (int)var3.field5331 - var2 >> 9;
            class4 var6 = method7918(var1.field1032, var4, var5);
            if (var6 != null) {
               int var7 = var6.field12;
               if (var6 instanceof class200) {
                  var7 += 2048;
               }

               if (var6.field17 == 0 && var6.method103() != -1) {
                  field2461[field2671] = var7;
                  field2491[field2671] = var7;
                  ++field2671;
                  ++var6.field17;
               }

               field2461[field2671] = var7;
               field2491[field2671] = var1.field12 + 2048;
               ++field2671;
               ++var6.field17;
            }
         }
      }

      class781.method14256(field2491, field2461, 0, field2671 - 1);
   }

   @deob.ObfuscatedName("jd.ha(IIIB)Laab;")
   private static class4 method7918(int arg0, int arg1, int arg2) {
      class703 var3 = field2468.method9639().field6579[arg0][arg1][arg2];
      if (var3 == null) {
         return null;
      } else {
         class4 var4 = null;
         int var5 = -1;

         for(class699 var6 = var3.field6484; var6 != null; var6 = var6.field6457) {
            class290 var7 = var6.field6458;
            if (var7 instanceof class4) {
               class4 var8 = (class4)var7;
               int var9 = (var8.method96() - 1) * 256 + 252;
               class584 var10 = var8.method11602().field5446;
               int var11 = (int)var10.field5328 - var9 >> 9;
               int var12 = (int)var10.field5331 - var9 >> 9;
               int var13 = (int)var10.field5328 + var9 >> 9;
               int var14 = (int)var10.field5331 + var9 >> 9;
               if (var11 <= arg1 && var12 <= arg2 && var13 >= arg1 && var14 >= arg2) {
                  int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
                  if (var15 > var5) {
                     var4 = var8;
                     var5 = var15;
                  }
               }
            }
         }

         return var4;
      }
   }

   @deob.ObfuscatedName("client.hp()V")
   private static final void method4566() {
      int var0 = class324.field2053;
      int[] var1 = class324.field2057;
      int var2;
      if (field2476 == 0) {
         var2 = Statics.field9261.length;
      } else {
         var2 = field2426 ? var0 : field2455 + var0;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         class4 var5;
         if (field2476 == 0) {
            class411 var4 = Statics.field9261[var3];
            if (!var4.field3098) {
               continue;
            }

            var5 = var4.method5645();
         } else {
            if (var3 < var0) {
               var5 = field2408[var1[var3]];
            } else {
               var5 = (class4)((class106)field2615.method15322((long)field2456[var3 - var0])).field807;
            }

            if (var5.field19 < 0) {
               continue;
            }
         }

         int var6 = var5.method96();
         class584 var7 = var5.method11602().field5446;
         if ((var6 & 1) == 0) {
            if (((int)var7.field5328 & 511) == 0 && ((int)var7.field5331 & 511) == 0) {
               continue;
            }
         } else if (((int)var7.field5328 & 511) == 256 && ((int)var7.field5331 & 511) == 256) {
            continue;
         }

         var5.method11608(var7.field5328, (float)method5777((int)var7.field5328, (int)var7.field5331, var5.field1032), var7.field5331);
         field2468.method9639().method10498(var5, true);
      }

   }

   @deob.ObfuscatedName("uz.hh(B)V")
   private static final void method15364() {
      for(class246 var0 = (class246)field2577.method14964(); var0 != null; var0 = (class246)field2577.method15006()) {
         class312 var1 = var0.field1634;
         if (field2418 > var1.field1959) {
            var0.method9864();
            var1.method3917();
         } else if (field2418 >= var1.field1948) {
            var1.method3915();
            if (var1.field1952 > 0) {
               if (field2476 == 0) {
                  class4 var2 = Statics.field9261[var1.field1952 - 1].method5645();
                  if (var2 != null) {
                     class584 var3 = var2.method11602().field5446;
                     if ((int)var3.field5328 >= 0 && (int)var3.field5328 < field2468.method9648() * 512 && (int)var3.field5331 >= 0 && (int)var3.field5331 < field2468.method9604() * 512) {
                        var1.method3914((int)var3.field5328, (int)var3.field5331, method5777((int)var3.field5328, (int)var3.field5331, var2.field1032) - var1.field1956, field2418);
                     }
                  }
               } else {
                  class106 var4 = (class106)field2615.method15322((long)(var1.field1952 - 1));
                  if (var4 != null) {
                     class200 var5 = (class200)var4.field807;
                     class584 var6 = var5.method11602().field5446;
                     if ((int)var6.field5328 >= 0 && (int)var6.field5328 < field2468.method9648() * 512 && (int)var6.field5331 >= 0 && (int)var6.field5331 < field2468.method9604() * 512) {
                        var1.method3914((int)var6.field5328, (int)var6.field5331, method5777((int)var6.field5328, (int)var6.field5331, var1.field1032) - var1.field1956, field2418);
                     }
                  }
               }
            }

            if (var1.field1952 < 0) {
               int var7 = -var1.field1952 - 1;
               class211 var8;
               if (field2452 == var7) {
                  var8 = Statics.field5701;
               } else {
                  var8 = field2408[var7];
               }

               if (var8 != null) {
                  class584 var9 = var8.method11602().field5446;
                  if ((int)var9.field5328 >= 0 && (int)var9.field5328 < field2468.method9648() * 512 && (int)var9.field5331 >= 0 && (int)var9.field5331 < field2468.method9604() * 512) {
                     var1.method3914((int)var9.field5328, (int)var9.field5331, method5777((int)var9.field5328, (int)var9.field5331, var1.field1032) - var1.field1956, field2418);
                  }
               }
            }

            var1.method3933(field2505);
            field2468.method9639().method10498(var1, true);
         }
      }

   }

   @deob.ObfuscatedName("pl.hq(I)V")
   private static final void method10762() {
      Iterator var0 = field2494.iterator();

      while(var0.hasNext()) {
         class244 var1 = (class244)var0.next();
         class301 var2 = var1.field1624;
         var2.method3870(1);
         if (var2.method3872()) {
            var1.method9864();
            var2.method3885();
         }
      }

   }

   @deob.ObfuscatedName("p.hv(I)V")
   private static final void method10658() {
      Iterator var0 = field2494.iterator();

      while(var0.hasNext()) {
         class244 var1 = (class244)var0.next();
         class301 var2 = var1.field1624;
         if (field2468.method9639() != null && var2.method3871()) {
            field2468.method9639().method10498(var2, true);
         }
      }

   }

   @deob.ObfuscatedName("fs.ht(IIIIIII)V")
   private static final void method6509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      for(class74 var6 = (class74)field2590.method14798(); var6 != null; var6 = (class74)field2590.method14793()) {
         if (field2418 >= var6.field540) {
            var6.method9960();
         } else {
            method10701(var6.field541, (var6.field537 << 9) + 256, (var6.field542 << 9) + 256, var6.field539 * 2);
            Statics.field7095.method8691(var6.field536, (int)(field2573[0] + (float)arg0), (int)(field2573[1] + (float)arg1), -16777216 | var6.field538, 0);
         }
      }

   }

   @deob.ObfuscatedName("qc.hk(IIIIIIB)V")
   private static final void method11087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      class164[] var6 = field2423;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         class164 var8 = var6[var7];
         if (var8 != null && var8.field1156 == 2) {
            method10701(var8.field1157, var8.field1152, var8.field1155, var8.field1154 * 2);
            if (field2573[0] > -1.0F && field2418 % 20 < 10) {
               class383 var9 = Statics.field3102[var8.field1153];
               int var10 = (int)(field2573[0] + (float)arg0 - 12.0F);
               int var11 = (int)(field2573[1] + (float)arg1 - 28.0F);
               var9.method5221(var10, var11);
            }
         }
      }

   }

   @deob.ObfuscatedName("ln.hj(IIIIIII)V")
   private static final void method8976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = class324.field2053;
      int[] var7 = class324.field2057;
      field2658 = 0;
      int var8;
      if (field2476 == 0) {
         var8 = Statics.field9261.length;
      } else {
         var8 = field2455 + var6;
      }

      for(int var9 = 0; var9 < var8; ++var9) {
         class915 var10 = null;
         class4 var12;
         if (field2476 == 0) {
            class411 var11 = Statics.field9261[var9];
            if (!var11.field3098) {
               continue;
            }

            var12 = var11.method5645();
            if (field2530 != var12.field9959) {
               continue;
            }

            if (var11.field3096 >= 0) {
               var10 = ((class200)var12).field1312;
               if (var10.field9319 != null) {
                  var10 = var10.method15778(Statics.field10637);
                  if (var10 == null) {
                     continue;
                  }
               }
            }
         } else {
            if (var9 < var6) {
               var12 = field2408[var7[var9]];
            } else {
               var12 = (class4)((class106)field2615.method15322((long)field2456[var9 - var6])).field807;
               var10 = ((class200)var12).field1312;
               if (var10.field9319 != null) {
                  var10 = var10.method15778(Statics.field10637);
                  if (var10 == null) {
                     continue;
                  }
               }
            }

            if (var12.field19 < 0 || field2530 != var12.field9959 && Statics.field5701.field1032 != var12.field1032) {
               continue;
            }
         }

         method17071(var12, var12.method162());
         if (!(field2573[0] < 0.0F)) {
            if (var12.method105()) {
               class379 var13 = var12.method97();
               if (var13 != null && field2658 < field2659) {
                  field2662[field2658] = Statics.field1855.method15384(var13.method5164()) / 2;
                  field2440[field2658] = (int)field2573[0];
                  field2661[field2658] = (int)field2573[1];
                  field2392[field2658] = var13;
                  ++field2658;
               }
            }

            int var14 = (int)(field2573[1] + (float)arg1);
            int var15 = var14 - Statics.field1855.field9061;
            boolean var16 = false;
            if (!var12.field59 && !var12.field49.method14805()) {
               for(class60 var17 = (class60)var12.field49.method14798(); var17 != null; var17 = (class60)var12.field49.method14793()) {
                  class70 var18 = var17.method953(field2418);
                  if (var18 == null) {
                     if (var17.method950()) {
                        var17.method9960();
                     }
                  } else {
                     class694 var19 = var17.field438;
                     class211 var20 = field2408[var7[var9]];
                     class383 var21;
                     class383 var22;
                     if (var20 != null && var20.field1410) {
                        var21 = var19.method10148(Statics.field8847);
                        var22 = var19.method10157(Statics.field8847);
                     } else {
                        var21 = var19.method10161(Statics.field8847);
                        var22 = var19.method10145(Statics.field8847);
                     }

                     if (var21 != null && var22 != null) {
                        int var23 = 255;
                        boolean var24 = true;
                        int var25 = field2418 - var18.field514;
                        int var26 = var22.method5216() * var18.field516 / 255;
                        int var29;
                        if (var18.field517 > var25) {
                           int var27 = var19.field6361 == 0 ? 0 : var25 / var19.field6361 * var19.field6361;
                           int var28 = var22.method5216() * var18.field515 / 255;
                           var29 = (var26 - var28) * var27 / var18.field517 + var28;
                        } else {
                           var29 = var26;
                           int var30 = var18.field517 + var19.field6362 - var25;
                           if (var19.field6360 >= 0) {
                              var23 = (var30 << 8) / (var19.field6362 - var19.field6360);
                           }
                        }

                        if (var18.field516 > 0 && var29 < 2) {
                           var29 = 2;
                        }

                        int var31 = var21.method5218();
                        int var32 = (int)(field2573[0] + (float)arg0 - (float)(var21.method5216() >> 1));
                        var15 -= var31;
                        if (var23 >= 0 && var23 < 255) {
                           int var33 = var23 << 24;
                           int var34 = var33 | 16777215;
                           var21.method2388(var32, var15, 0, var34, 1);
                           Statics.field8847.method7510(var32, var15, var29 + var32, var15 + var31);
                           var22.method2388(var32, var15, 0, var34, 1);
                        } else {
                           var21.method5221(var32, var15);
                           Statics.field8847.method7510(var32, var15, var29 + var32, var15 + var31);
                           var22.method5221(var32, var15);
                        }

                        Statics.field8847.method7716(arg0, arg1, arg0 + arg2, arg1 + arg3);
                        var15 -= 2;
                        var16 = true;
                     }
                  }
               }
            }

            if (!var16) {
               var15 -= Statics.field5740.field7281 + 2;
            }

            if (!var12.field59) {
               if (var10 == null) {
                  class211 var35 = (class211)var12;
                  if (var35.field1389 != -1) {
                     class383 var36 = Statics.field6678[var35.field1389];
                     var15 -= var36.method5218();
                     var36.method5221((int)(field2573[0] + (float)arg0 - 12.0F), var15);
                     var15 -= 2;
                  }

                  if (var35.field1388 != -1) {
                     class383 var37 = Statics.field7096[var35.field1388];
                     var15 -= var37.method5218();
                     var37.method5221((int)(field2573[0] + (float)arg0 - 12.0F), var15);
                     var15 -= 2;
                  }
               } else if (var10.field9300 >= 0 && var10.field9300 < Statics.field7096.length) {
                  class383 var38 = Statics.field7096[var10.field9300];
                  var15 -= var38.method5218();
                  var38.method5221((int)(field2573[0] + (float)arg0 - (float)(var38.method5216() >> 1)), var15);
                  var15 -= 2;
               }
            }

            int var10000;
            if (var12 instanceof class211) {
               if (var9 >= 0) {
                  int var39 = 0;
                  class164[] var40 = field2423;

                  for(int var41 = 0; var41 < var40.length; ++var41) {
                     class164 var42 = var40[var41];
                     if (var42 != null && var42.field1156 == 10 && var42.field1150 == var7[var9]) {
                        class383 var43 = Statics.field3102[var42.field1153];
                        if (var43.method5218() > var39) {
                           var39 = var43.method5218();
                        }

                        var43.method5221((int)(field2573[0] + (float)arg0 - 12.0F), var15 - var43.method5218());
                     }
                  }

                  if (var39 > 0) {
                     var10000 = var15 - (var39 + 2);
                  }
               }
            } else {
               int var45 = 0;
               class164[] var46 = field2423;

               for(int var47 = 0; var47 < var46.length; ++var47) {
                  class164 var48 = var46[var47];
                  if (var48 != null && var48.field1156 == 1 && var48.field1150 == field2456[var9 - var6]) {
                     class383 var49 = Statics.field3102[var48.field1153];
                     if (var49.method5218() > var45) {
                        var45 = var49.method5218();
                     }

                     boolean var50;
                     if (var48.field1149 == 0) {
                        var50 = true;
                     } else {
                        int var51 = class671.method6226() * 1000 / var48.field1149 / 2;
                        var50 = field2418 % (var51 * 2) < var51;
                     }

                     if (var50) {
                        var49.method5221((int)(field2573[0] + (float)arg0 - 12.0F), var15 - var49.method5218());
                     }
                  }
               }

               if (var45 > 0) {
                  var10000 = var15 - (var45 + 2);
               }
            }

            for(int var53 = 0; var53 < Statics.field5740.field7273; ++var53) {
               int var54 = var12.field28[var53];
               int var55 = var12.field26[var53];
               class730 var56 = null;
               int var57 = 0;
               if (var55 >= 0) {
                  if (var54 <= field2418) {
                     continue;
                  }

                  var56 = Statics.field5741.method10934(var12.field26[var53]);
                  var57 = var56.field6704;
               } else if (var54 < 0) {
                  continue;
               }

               int var58 = var12.field29[var53];
               class730 var59 = null;
               if (var58 >= 0) {
                  var59 = Statics.field5741.method10934(var58);
               }

               if (var54 - var57 <= field2418) {
                  if (var56 == null) {
                     var12.field28[var53] = -1;
                  } else {
                     int var60 = var12.method162() / 2;
                     method17071(var12, var60);
                     if (field2573[0] > -1.0F) {
                        field2573[0] += (float)Statics.field5740.field7277[var53];
                        field2573[1] += (float)Statics.field5740.field7275[var53];
                        Object var61 = null;
                        Object var62 = null;
                        Object var63 = null;
                        Object var64 = null;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        class383 var73 = null;
                        class383 var74 = null;
                        class383 var75 = null;
                        class383 var76 = null;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        int var84 = 0;
                        int var85 = 0;
                        class383 var86 = var56.method10766(Statics.field8847);
                        if (var86 != null) {
                           var65 = var86.method5216();
                           int var87 = var86.method5218();
                           if (var87 > var85) {
                              var85 = var87;
                           }

                           var86.method5215(field2723);
                           var69 = field2723[0];
                        }

                        class383 var88 = var56.method10767(Statics.field8847);
                        if (var88 != null) {
                           var66 = var88.method5216();
                           int var89 = var88.method5218();
                           if (var89 > var85) {
                              var85 = var89;
                           }

                           var88.method5215(field2723);
                           var70 = field2723[0];
                        }

                        class383 var90 = var56.method10768(Statics.field8847);
                        if (var90 != null) {
                           var67 = var90.method5216();
                           int var91 = var90.method5218();
                           if (var91 > var85) {
                              var85 = var91;
                           }

                           var90.method5215(field2723);
                           var71 = field2723[0];
                        }

                        class383 var92 = var56.method10776(Statics.field8847);
                        if (var92 != null) {
                           var68 = var92.method5216();
                           int var93 = var92.method5218();
                           if (var93 > var85) {
                              var85 = var93;
                           }

                           var92.method5215(field2723);
                           var72 = field2723[0];
                        }

                        if (var59 != null) {
                           var73 = var59.method10766(Statics.field8847);
                           if (var73 != null) {
                              var77 = var73.method5216();
                              int var94 = var73.method5218();
                              if (var94 > var85) {
                                 var85 = var94;
                              }

                              var73.method5215(field2723);
                              var81 = field2723[0];
                           }

                           var74 = var59.method10767(Statics.field8847);
                           if (var74 != null) {
                              var78 = var74.method5216();
                              int var95 = var74.method5218();
                              if (var95 > var85) {
                                 var85 = var95;
                              }

                              var74.method5215(field2723);
                              var82 = field2723[0];
                           }

                           var75 = var59.method10768(Statics.field8847);
                           if (var75 != null) {
                              var79 = var75.method5216();
                              int var96 = var75.method5218();
                              if (var96 > var85) {
                                 var85 = var96;
                              }

                              var75.method5215(field2723);
                              var83 = field2723[0];
                           }

                           var76 = var59.method10776(Statics.field8847);
                           if (var76 != null) {
                              var80 = var76.method5216();
                              int var97 = var76.method5218();
                              if (var97 > var85) {
                                 var85 = var97;
                              }

                              var76.method5215(field2723);
                              var84 = field2723[0];
                           }
                        }

                        class609 var98 = Statics.field5483;
                        class609 var99 = Statics.field5483;
                        class883 var100 = Statics.field7093;
                        class883 var101 = Statics.field7093;
                        int var102 = var56.field6702;
                        if (var102 >= 0) {
                           class609 var103 = (class609)Statics.field10616.method7870(field2430, var102, true, var56.field6701);
                           class883 var104 = Statics.field10616.method7871(field2430, var102);
                           if (var103 != null && var104 != null) {
                              var98 = var103;
                              var100 = var104;
                           }
                        }

                        if (var59 != null) {
                           int var105 = var59.field6702;
                           if (var105 >= 0) {
                              class609 var106 = (class609)Statics.field10616.method7870(field2430, var105, true, var59.field6701);
                              class883 var107 = Statics.field10616.method7871(field2430, var105);
                              if (var106 != null && var107 != null) {
                                 var99 = var106;
                                 var101 = var107;
                              }
                           }
                        }

                        Object var108 = null;
                        String var109 = null;
                        boolean var110 = false;
                        int var111 = 0;
                        String var112 = var56.method10765(var12.field36[var53]);
                        int var113 = var100.method15384(var112);
                        if (var59 != null) {
                           var109 = var59.method10765(var12.field30[var53]);
                           var111 = var101.method15384(var109);
                        }

                        int var114 = 0;
                        int var115 = 0;
                        if (var66 > 0) {
                           var114 = var113 / var66 + 1;
                        }

                        if (var59 != null && var78 > 0) {
                           var115 = var111 / var78 + 1;
                        }

                        int var116 = 0;
                        int var117 = var116;
                        if (var65 > 0) {
                           var116 += var65;
                        }

                        var116 += 2;
                        int var118 = var116;
                        if (var67 > 0) {
                           var116 += var67;
                        }

                        int var119 = var116;
                        int var120 = var116;
                        int var122;
                        if (var66 > 0) {
                           int var121 = var66 * var114;
                           var122 = var116 + var121;
                           var120 = (var121 - var113) / 2 + var116;
                        } else {
                           var122 = var113 + var116;
                        }

                        int var123 = var122;
                        if (var68 > 0) {
                           var122 += var68;
                        }

                        int var124 = 0;
                        int var125 = 0;
                        int var126 = 0;
                        int var127 = 0;
                        int var128 = 0;
                        if (var59 != null) {
                           var122 += 2;
                           var124 = var122;
                           if (var77 > 0) {
                              var122 += var77;
                           }

                           var122 += 2;
                           var125 = var122;
                           if (var79 > 0) {
                              var122 += var79;
                           }

                           var126 = var122;
                           var128 = var122;
                           if (var78 > 0) {
                              int var129 = var78 * var115;
                              var122 += var129;
                              var128 += (var129 - var111) / 2;
                           } else {
                              var122 += var111;
                           }

                           var127 = var122;
                           if (var80 > 0) {
                              var122 += var80;
                           }
                        }

                        int var130 = var12.field28[var53] - field2418;
                        int var131 = var56.field6709 - var56.field6709 * var130 / var56.field6704;
                        int var132 = var56.field6714 * var130 / var56.field6704 + -var56.field6714;
                        int var133 = (int)(field2573[0] + (float)arg0 - (float)(var122 >> 1) + (float)var131);
                        int var134 = (int)(field2573[1] + (float)arg1 - 12.0F + (float)var132);
                        int var135 = var134;
                        int var136 = var85 + var134;
                        int var137 = var56.field6703 + var134 + 15;
                        int var138 = var137 - var100.field9061;
                        int var139 = var100.field9062 + var137;
                        if (var138 < var134) {
                           var135 = var138;
                        }

                        if (var139 > var136) {
                           var136 = var139;
                        }

                        int var140 = 0;
                        if (var59 != null) {
                           var140 = var59.field6703 + var134 + 15;
                           int var141 = var140 - var101.field9061;
                           int var142 = var101.field9062 + var140;
                           if (var141 < var135) {
                              ;
                           }

                           if (var142 > var136) {
                              ;
                           }
                        }

                        int var145 = 255;
                        if (var56.field6711 >= 0) {
                           var145 = (var130 << 8) / (var56.field6704 - var56.field6711);
                        }

                        if (var145 >= 0 && var145 < 255) {
                           int var146 = var145 << 24;
                           int var147 = var146 | 16777215;
                           if (var86 != null) {
                              var86.method2388(var117 + var133 - var69, var134, 0, var147, 1);
                           }

                           if (var90 != null) {
                              var90.method2388(var118 + var133 - var71, var134, 0, var147, 1);
                           }

                           if (var88 != null) {
                              for(int var148 = 0; var148 < var114; ++var148) {
                                 var88.method2388(var66 * var148 + (var119 + var133 - var70), var134, 0, var147, 1);
                              }
                           }

                           if (var92 != null) {
                              var92.method2388(var123 + var133 - var72, var134, 0, var147, 1);
                           }

                           var98.method8709(var112, var120 + var133, var137, var56.field6698 | var146, 0);
                           if (var59 != null) {
                              if (var73 != null) {
                                 var73.method2388(var124 + var133 - var81, var134, 0, var147, 1);
                              }

                              if (var75 != null) {
                                 var75.method2388(var125 + var133 - var83, var134, 0, var147, 1);
                              }

                              if (var74 != null) {
                                 for(int var149 = 0; var149 < var115; ++var149) {
                                    var74.method2388(var78 * var149 + (var126 + var133 - var82), var134, 0, var147, 1);
                                 }
                              }

                              if (var76 != null) {
                                 var76.method2388(var127 + var133 - var84, var134, 0, var147, 1);
                              }

                              var99.method8709(var109, var128 + var133, var140, var59.field6698 | var146, 0);
                           }
                        } else {
                           if (var86 != null) {
                              var86.method5221(var117 + var133 - var69, var134);
                           }

                           if (var90 != null) {
                              var90.method5221(var118 + var133 - var71, var134);
                           }

                           if (var88 != null) {
                              for(int var150 = 0; var150 < var114; ++var150) {
                                 var88.method5221(var66 * var150 + (var119 + var133 - var70), var134);
                              }
                           }

                           if (var92 != null) {
                              var92.method5221(var123 + var133 - var72, var134);
                           }

                           var98.method8709(var112, var120 + var133, var137, var56.field6698 | -16777216, 0);
                           if (var59 != null) {
                              if (var73 != null) {
                                 var73.method5221(var124 + var133 - var81, var134);
                              }

                              if (var75 != null) {
                                 var75.method5221(var125 + var133 - var83, var134);
                              }

                              if (var74 != null) {
                                 for(int var151 = 0; var151 < var115; ++var151) {
                                    var74.method5221(var78 * var151 + (var126 + var133 - var82), var134);
                                 }
                              }

                              if (var76 != null) {
                                 var76.method5221(var127 + var133 - var84, var134);
                              }

                              var99.method8709(var109, var128 + var133, var140, var59.field6698 | -16777216, 0);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      for(int var152 = 0; var152 < field2671; ++var152) {
         int var153 = field2461[var152];
         class4 var154;
         if (var153 < 2048) {
            var154 = field2408[var153];
         } else {
            var154 = (class4)((class106)field2615.method15322((long)(var153 - 2048))).field807;
         }

         int var155 = field2491[var152];
         class4 var156;
         if (var155 < 2048) {
            var156 = field2408[var155];
         } else {
            var156 = (class4)((class106)field2615.method15322((long)(var155 - 2048))).field807;
         }

         method7939(var154, var156, --var154.field17, arg0, arg1, arg2, arg3, arg4, arg5);
      }

      int var157 = Statics.field1855.field9062 + Statics.field1855.field9061 + 2;

      for(int var158 = 0; var158 < field2658; ++var158) {
         int var159 = field2440[var158];
         int var160 = field2661[var158];
         int var161 = field2662[var158];
         boolean var162 = true;

         while(var162) {
            var162 = false;

            for(int var163 = 0; var163 < var158; ++var163) {
               if (var160 + 2 > field2661[var163] - var157 && var160 - var157 < field2661[var163] + 2 && var159 - var161 < field2662[var163] + field2440[var163] && var159 + var161 > field2440[var163] - field2662[var163] && field2661[var163] - var157 < var160) {
                  var160 = field2661[var163] - var157;
                  var162 = true;
               }
            }
         }

         field2661[var158] = var160;
         String var164 = field2392[var158].method5164();
         if (field2691 == 0) {
            int var165 = 16776960;
            int var166 = field2392[var158].method5161();
            if (var166 < 6) {
               var165 = field2532[var166];
            }

            if (var166 == 6) {
               var165 = field2530 % 20 < 10 ? 16711680 : 16776960;
            }

            if (var166 == 7) {
               var165 = field2530 % 20 < 10 ? 255 : 65535;
            }

            if (var166 == 8) {
               var165 = field2530 % 20 < 10 ? 45056 : 8454016;
            }

            if (var166 == 9) {
               int var167 = 150 - field2392[var158].method5160() * 150 / field2392[var158].method5163();
               if (var167 < 50) {
                  var165 = var167 * 1280 + 16711680;
               } else if (var167 < 100) {
                  var165 = 16776960 - (var167 - 50) * 327680;
               } else if (var167 < 150) {
                  var165 = (var167 - 100) * 5 + 65280;
               }
            }

            if (var166 == 10) {
               int var168 = 150 - field2392[var158].method5160() * 150 / field2392[var158].method5163();
               if (var168 < 50) {
                  var165 = var168 * 5 + 16711680;
               } else if (var168 < 100) {
                  var165 = 16711935 - (var168 - 50) * 327680;
               } else if (var168 < 150) {
                  var165 = (var168 - 100) * 327680 + 255 - (var168 - 100) * 5;
               }
            }

            if (var166 == 11) {
               int var169 = 150 - field2392[var158].method5160() * 150 / field2392[var158].method5163();
               if (var169 < 50) {
                  var165 = 16777215 - var169 * 327685;
               } else if (var169 < 100) {
                  var165 = (var169 - 50) * 327685 + 65280;
               } else if (var169 < 150) {
                  var165 = 16777215 - (var169 - 100) * 327680;
               }
            }

            int var170 = var165 | -16777216;
            int var171 = field2392[var158].method5162();
            if (var171 == 0) {
               Statics.field7095.method8691(var164, arg0 + var159, arg1 + var160, var170, -16777216);
            }

            if (var171 == 1) {
               Statics.field7095.method8694(var164, arg0 + var159, arg1 + var160, var170, -16777216, field2530);
            }

            if (var171 == 2) {
               Statics.field7095.method8695(var164, arg0 + var159, arg1 + var160, var170, -16777216, field2530);
            }

            if (var171 == 3) {
               int var172 = 150 - field2392[var158].method5160() * 150 / field2392[var158].method5163();
               Statics.field7095.method8690(var164, arg0 + var159, arg1 + var160, var170, -16777216, field2530, var172);
            }

            if (var171 == 4) {
               int var173 = 150 - field2392[var158].method5160() * 150 / field2392[var158].method5163();
               int var174 = var173 * (Statics.field1855.method15384(var164) + 100) / 150;
               Statics.field8847.method7510(arg0 + var159 - 50, arg1, arg0 + var159 + 50, arg1 + arg3);
               Statics.field7095.method8709(var164, arg0 + var159 + 50 - var174, arg1 + var160, var170, -16777216);
               Statics.field8847.method7716(arg0, arg1, arg0 + arg2, arg1 + arg3);
            }

            if (var171 == 5) {
               int var175 = 150 - field2392[var158].method5160() * 150 / field2392[var158].method5163();
               int var176 = 0;
               if (var175 < 25) {
                  var176 = var175 - 25;
               } else if (var175 > 125) {
                  var176 = var175 - 125;
               }

               int var177 = Statics.field1855.field9062 + Statics.field1855.field9061;
               Statics.field8847.method7510(arg0, arg1 + var160 - var177 - 1, arg0 + arg2, arg1 + var160 + 5);
               Statics.field7095.method8691(var164, arg0 + var159, arg1 + var160 + var176, var170, -16777216);
               Statics.field8847.method7716(arg0, arg1, arg0 + arg2, arg1 + arg3);
            }
         } else {
            Statics.field7095.method8691(var164, arg0 + var159, arg1 + var160, -256, -16777216);
         }
      }

   }

   @deob.ObfuscatedName("jg.hi(Laab;Laab;IIIIIIII)V")
   private static final void method7939(class4 arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var9 = arg1.method103();
      if (var9 != -1) {
         Object var10 = null;
         class383 var11 = (class383)field2516.method10909((long)var9);
         if (var11 == null) {
            class407[] var12 = class375.method5064(Statics.field6723, var9, 0);
            if (var12 == null) {
               return;
            }

            var11 = Statics.field8847.method7529(var12[0], true);
            field2516.method10880(var11, (long)var9);
         }

         class584 var13 = arg0.method11602().field5446;
         method14154(arg0.field1032, (int)var13.field5328, (int)var13.field5331, arg0.method96() * 256, 0, false);
         int var14 = (int)(field2573[0] + (float)arg3 - 18.0F);
         int var15 = (int)(field2573[1] + (float)arg4 - 16.0F - 54.0F);
         int var16 = arg2 / 4 * 18 + var14;
         int var17 = arg2 % 4 * 18 + var15;
         var11.method5221(var16, var17);
         if (arg0 == arg1) {
            Statics.field8847.method11505(var16 - 1, var17 - 1, 18, 18, -256);
         }

         class57 var18 = class57.method16089();
         var18.field420 = arg1;
         var18.field421 = var16;
         var18.field422 = var17;
         var18.field423 = var16 + 16;
         var18.field424 = var17 + 16;
         field2534.method14795(var18);
      }
   }

   @deob.ObfuscatedName("gz.hx(IIIIIIIB)V")
   private static final void method6904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (field2476 == 2) {
         int var7 = class324.field2053;
         int[] var8 = class324.field2057;

         for(int var9 = 0; var9 < var7; ++var9) {
            class211 var10 = field2408[var8[var9]];
            if (var10 != null) {
               var10.method113(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
            }
         }

         for(int var11 = 0; var11 < field2455; ++var11) {
            int var12 = field2456[var11];
            class106 var13 = (class106)field2615.method15322((long)var12);
            if (var13 != null) {
               ((class4)var13.field807).method113(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
            }
         }

      }
   }

   @deob.ObfuscatedName("na.ip(Laex;II)V")
   public static final void method9713(class134 arg0, int arg1) {
      method11049(arg0, arg1, true);
   }

   @deob.ObfuscatedName("zj.ib(Laex;II)V")
   private static final void method17071(class134 arg0, int arg1) {
      method11049(arg0, arg1, false);
   }

   @deob.ObfuscatedName("qb.it(Laex;IZI)V")
   private static final void method11049(class134 arg0, int arg1, boolean arg2) {
      int var6;
      int var7;
      if (arg0 instanceof class290 && arg0 instanceof class376) {
         class290 var3 = (class290)arg0;
         int var4 = var3.field1873 - var3.field1875 + 1 << 9;
         int var5 = var3.field1876 - var3.field1874 + 1 << 9;
         var6 = (var3.field1875 << 9) + var4 / 2;
         var7 = (var3.field1874 << 9) + var5 / 2;
      } else {
         class584 var8 = arg0.method11602().field5446;
         var6 = (int)var8.field5328;
         var7 = (int)var8.field5331;
      }

      method14154(arg0.field1032, var6, var7, 0, arg1, arg2);
   }

   @deob.ObfuscatedName("pd.ii(IIIIB)V")
   private static final void method10701(int arg0, int arg1, int arg2, int arg3) {
      method14154(arg0, arg1, arg2, 0, arg3, false);
   }

   @deob.ObfuscatedName("rs.in(IIIIIZB)V")
   private static final void method14154(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (arg5 || arg1 >= 512 && arg2 >= 512 && arg1 <= (field2468.method9648() - 2) * 512 && arg2 <= (field2468.method9604() - 2) * 512) {
         int var7 = method5777(arg1, arg2, arg0) - arg4;
         field2672.method8089(Statics.field8847.method7544());
         field2672.method8072((float)arg3, 0.0F, 0.0F);
         Statics.field8847.method7778(field2672);
         if (arg5) {
            Statics.field8847.method7736((float)arg1, (float)var7, (float)arg2, field2573);
         } else {
            Statics.field8847.method7525((float)arg1, (float)var7, (float)arg2, field2573);
         }

         field2672.method8072((float)(-arg3), 0.0F, 0.0F);
         Statics.field8847.method7778(field2672);
         field2573[0] -= (float)field2689;
         field2573[1] -= (float)field2690;
      } else {
         float[] var6 = field2573;
         field2573[1] = -1.0F;
         var6[0] = -1.0F;
      }
   }

   @deob.ObfuscatedName("eh.io(IIII)I")
   public static final int method5777(int arg0, int arg1, int arg2) {
      if (field2468.method9639() == null) {
         return 0;
      } else {
         int var3 = arg0 >> 9;
         int var4 = arg1 >> 9;
         if (var3 >= 0 && var4 >= 0 && var3 <= field2468.method9648() - 1 && var4 <= field2468.method9604() - 1) {
            int var5 = arg2;
            if (arg2 < 3 && (field2468.method9592().field5520[1][var3][var4] & 2) != 0) {
               var5 = arg2 + 1;
            }

            return field2468.method9639().field6580[var5].method15965(arg0, arg1);
         } else {
            return 0;
         }
      }
   }

   @deob.ObfuscatedName("ade.id(IIIIII)I")
   public static final int method1242(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (field2468.method9639() == null) {
         return 0;
      } else {
         if (arg4 < 3) {
            class611 var5 = field2468.method9592();
            int var6 = arg0 >> 9;
            int var7 = arg1 >> 9;
            if (arg2 < 0 || arg3 < 0 || arg2 > field2468.method9648() - 1 || arg3 > field2468.method9604() - 1) {
               return 0;
            }

            if (var6 < 1 || var7 < 1 || var6 > field2468.method9648() - 1 || var7 > field2468.method9604() - 1) {
               return 0;
            }

            boolean var8 = (var5.field5520[1][arg0 >> 9][arg1 >> 9] & 2) != 0;
            if ((arg0 & 511) == 0) {
               boolean var9 = (var5.field5520[1][var6 - 1][arg1 >> 9] & 2) != 0;
               boolean var10 = (var5.field5520[1][var6][arg1 >> 9] & 2) != 0;
               if (var9 != var10) {
                  var8 = (var5.field5520[1][arg2][arg3] & 2) != 0;
               }
            }

            if ((arg1 & 511) == 0) {
               boolean var11 = (var5.field5520[1][arg0 >> 9][var7 - 1] & 2) != 0;
               boolean var12 = (var5.field5520[1][arg0 >> 9][var7] & 2) != 0;
               if (var11 != var12) {
                  var8 = (var5.field5520[1][arg2][arg3] & 2) != 0;
               }
            }

            if (var8) {
               ++arg4;
            }
         }

         return field2468.method9639().field6580[arg4].method15965(arg0, arg1);
      }
   }

   @deob.ObfuscatedName("tf.iv(IIIIIIII)V")
   private static final void method14658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var7 = arg6 - 334;
      if (var7 < 0) {
         var7 = 0;
      } else if (var7 > 100) {
         var7 = 100;
      }

      int var8 = (field2627 - field2683) * var7 / 100 + field2683;
      int var9 = (int)((long)arg5 * var8 * cameraZoom / 25600000L);
      int var10 = 16384 - arg3 & 16383;
      int var11 = 16384 - arg4 & 16383;
      int var12 = 0;
      int var13 = 0;
      int var14 = var9;
      if (var10 != 0) {
         var13 = class603.field5469[var10] * -var9 >> 14;
         var14 = class603.field5471[var10] * var9 >> 14;
      }

      if (var11 != 0) {
         var12 = class603.field5469[var11] * var14 >> 14;
         var14 = class603.field5471[var11] * var14 >> 14;
      }

      Statics.field337 = arg0 - var12;
      Statics.field6719 = arg1 - var13;
      Statics.field3115 = arg2 - var14;
      Statics.field4218 = arg3;
      Statics.field7098 = arg4;
      Statics.field6938 = 0;
   }

   @deob.ObfuscatedName("jl.iy(IIJ)V")
   public static final void method7970(int arg0, int arg1, long arg2) {
      int var4 = (int)arg2 >> 14 & 31;
      int var5 = (int)arg2 >> 20 & 3;
      int var6 = (int)(arg2 >>> 32) & Integer.MAX_VALUE;
      class850 var7 = (class850)class814.method4102(class850.method10283(), var4);
      class724 var8;
      if (class850.field8733 != var7 && class850.field8734 != var7 && class850.field8730 != var7) {
         if (class850.method1519(var7.field8736)) {
            var8 = class720.method4042(arg0, arg1, 0, 0, var7, var5);
         } else {
            var8 = class720.method15366(arg0, arg1, 0, 0, var7, var5);
         }
      } else {
         class843 var9 = field2468.method9636().method14651(var6);
         int var10;
         int var11;
         if (var5 != 0 && var5 != 2) {
            var10 = var9.field8570;
            var11 = var9.field8585;
         } else {
            var10 = var9.field8585;
            var11 = var9.field8570;
         }

         if (var5 != 0) {
         }

         var8 = class720.method4042(arg0, arg1, var10, var11, class850.field8735, 0);
      }

      method11583(arg0, arg1, true, var8);
   }

   @deob.ObfuscatedName("ud.if(IIB)V")
   public static final void method15092(int arg0, int arg1) {
      if (field2584 != class801.field7298) {
         if (method11583(arg0, arg1, false, class720.method11086(arg0, arg1, 1, 1))) {
            return;
         }

         method11583(arg0, arg1, false, class720.method5346(arg0, arg1, 1, 1, 0));
      } else {
         if (method11583(arg0, arg1, false, class720.method5346(arg0, arg1, 1, 1, 0))) {
            return;
         }

         method11583(arg0, arg1, false, class720.method11086(arg0, arg1, 1, 1));
      }

   }

   @deob.ObfuscatedName("ra.ik(IIZLpg;I)Z")
   public static final boolean method11583(int arg0, int arg1, boolean arg2, class724 arg3) {
      int var4 = Statics.field5701.field16[0];
      int var5 = Statics.field5701.field62[0];
      if (var4 >= 0 && var4 < field2468.method9648() && var5 >= 0 && var5 < field2468.method9604()) {
         if (arg0 >= 0 && arg0 < field2468.method9648() && arg1 >= 0 && arg1 < field2468.method9604()) {
            int var6 = Statics.method16263(var4, var5, Statics.field5701.method96(), arg3, field2468.method9521(Statics.field5701.field1032), arg2, field2489, field2660);
            if (var6 < 1) {
               return false;
            } else {
               class299.field1890 = field2489[var6 - 1];
               class299.field1895 = field2660[var6 - 1];
               class299.field1892 = false;
               class231.method11314();
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("kg.ix(Laht;IIBI)V")
   public static final void method8290(class211 arg0, int arg1, int arg2, byte arg3) {
      int var4 = arg0.field16[0];
      int var5 = arg0.field62[0];
      if (var4 >= 0 && var4 < field2468.method9648() && var5 >= 0 && var5 < field2468.method9604()) {
         if (arg1 >= 0 && arg1 < field2468.method9648() && arg2 >= 0 && arg2 < field2468.method9604()) {
            int var6 = Statics.method16263(var4, var5, arg0.method96(), class720.method15739(arg1, arg2), field2468.method9521(arg0.field1032), true, field2489, field2660);
            if (var6 >= 1) {
               if (var6 <= 3) {
                  for(int var7 = 0; var7 < var6 - 1; ++var7) {
                     arg0.method2866(field2489[var7], field2660[var7], arg3);
                  }

               }
            }
         }
      }
   }

   @deob.ObfuscatedName("vb.ir(Lae;B)Z")
   private static final boolean method15380(class110 arg0) {
      try {
         return method9460(arg0);
      } catch (IOException var6) {
         if (field2410 == 11) {
            arg0.method1431();
            return false;
         } else {
            method248();
            return true;
         }
      } catch (Exception var7) {
         class723 var3 = field2468.method9649();
         String var4 = (arg0.field826 != null ? arg0.field826.getOpcode() : -1) + class582.field5306 + (arg0.field838 != null ? arg0.field838.getOpcode() : -1) + class582.field5306 + (arg0.field839 != null ? arg0.field839.getOpcode() : -1) + " " + arg0.field829 + class582.field5306 + (var3.field6676 + Statics.field5701.field16[0]) + class582.field5306 + (var3.field6677 + Statics.field5701.field62[0]) + " ";

         for(int var5 = 0; var5 < arg0.field829 && var5 < 50; ++var5) {
            var4 = var4 + arg0.field835.field931[var5] + class582.field5306;
         }

         class285.method15864(var4, var7);
         method5519(false);
         return true;
      }
   }

   @deob.ObfuscatedName("ms.ia(Lae;B)Z")
   private static final boolean method9460(class110 arg0) throws IOException {
      class711 var1 = arg0.method1413();
      class251 var2 = arg0.field835;
      if (var1 == null) {
         return false;
      } else {
         if (arg0.field826 == null) {
            if (arg0.field830) {
               if (!var1.method1527(1)) {
                  return false;
               }

               var1.method1541(arg0.field835.field931, 0, 1);
               ++arg0.field834;
               arg0.field831 = 0;
               arg0.field830 = false;
            }

            var2.field935 = 0;
            if (var2.method3402()) {
               if (!var1.method1527(1)) {
                  return false;
               }

               var1.method1541(arg0.field835.field931, 1, 1);
               ++arg0.field834;
               arg0.field831 = 0;
            }

            arg0.field830 = true;
            ServerProt[] var3 = ServerProt.values();
            int var4 = var2.method3403();
            if (var4 < 0 || var4 >= var3.length) {
               throw new IOException(var4 + " " + var2.field935);
            }

            arg0.field826 = var3[var4];
            arg0.field829 = arg0.field826.size;
         }

         if (arg0.field829 == -1) {
            if (!var1.method1527(1)) {
               return false;
            }

            var1.method1541(var2.field931, 0, 1);
            arg0.field829 = var2.field931[0] & 255;
            ++arg0.field834;
            arg0.field831 = 0;
         }

         if (arg0.field829 == -2) {
            if (!var1.method1527(2)) {
               return false;
            }

            var1.method1541(var2.field931, 0, 2);
            var2.field935 = 0;
            arg0.field829 = var2.method1587();
            arg0.field834 += 2;
            arg0.field831 = 0;
         }

         if (arg0.field829 > 0) {
            if (!var1.method1527(arg0.field829)) {
               return false;
            }

            var2.field935 = 0;
            var1.method1541(var2.field931, 0, arg0.field829);
            arg0.field834 += arg0.field829;
            arg0.field831 = 0;
         }

         if (ClientConfig.PACKET_LOGGING) {
            System.out.println("[Incoming] Packet " + arg0.field826.getName() + " ID " + arg0.field826.getOpcode() + " (size " + arg0.field829 + " bytes)");
         }

         arg0.field839 = arg0.field838;
         arg0.field838 = arg0.field837;
         arg0.field837 = arg0.field826;
         if (ServerProt.IF_SETMODEL == arg0.field826) {
            int var5 = var2.method1611();
            int var6 = var2.method1611();
            method6863();
            class231.method15040(var6, 1, var5, -1);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.DO_CHEAT == arg0.field826) {
            String var7 = var2.method1599();
            class319.method8552(var7, false, false);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MIDI_SONG_LOCATION == arg0.field826) {
            int var8 = var2.method1619();
            int var9 = var2.method1639();
            int var10 = var2.method1778();
            int var11 = var2.method1579();
            int var12 = var2.method1639();
            int var13 = var9 >> 28;
            int var14 = var9 >> 14 & 16383;
            int var15 = var9 & 16383;
            class677.method2952(var13, var14, var15, var8, var11, var12, var10);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCSTR_LARGE == arg0.field826) {
            int var16 = var2.method1628();
            String var17 = var2.method1599();
            method6863();
            class231.method9268(var16, var17);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CAM_LOOKAT == arg0.field826) {
            int var18 = var2.method1628() << 2;
            int var19 = var2.method1688();
            int var20 = var2.method1579();
            int var21 = var2.method1619();
            int var22 = var2.method1778();
            method6863();
            method14327(var19, var22, var18, var21, var20);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_UID192 == arg0.field826) {
            var2.field935 += 28;
            if (var2.method1615()) {
               class671.method7972(var2, var2.field935 - 28);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETTEXT == arg0.field826) {
            int var23 = var2.method1591();
            String var24 = var2.method1599();
            method6863();
            class231.method3314(var23, var24);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CREATE_CHECK_NAME == arg0.field826) {
            field2703 = var2.method1594();
            if (field2703 == 0 || field2703 == 1) {
               field2567 = true;
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_FRIENDCHAT == arg0.field826) {
            boolean var25 = var2.method1688() == 1;
            String var26 = var2.method1599();
            String var27 = var26;
            if (var25) {
               var27 = var2.method1599();
            }

            long var28 = var2.method1621();
            long var30 = (long)var2.method1587();
            long var32 = (long)var2.method1589();
            int var34 = var2.method1688();
            long var35 = (var30 << 32) + var32;
            boolean var37 = false;
            int var38 = 0;

            while(true) {
               if (var38 >= 100) {
                  if (var34 <= 1) {
                     if ((!field2635 || field2680) && !field2569) {
                        if (method14784(var27)) {
                           var37 = true;
                        }
                     } else {
                        var37 = true;
                     }
                  }
                  break;
               }

               if (field2499[var38] == var35) {
                  var37 = true;
                  break;
               }

               ++var38;
            }

            if (!var37) {
               field2499[field2669] = var35;
               field2669 = (field2669 + 1) % 100;
               String var39 = Statics.method9135(class450.method14241(var2));
               if (var34 != 2 && var34 != 3) {
                  if (var34 == 1) {
                     class419.method10662(9, 0, class582.method5969(0) + var26, class582.method5969(0) + var27, var26, var39, class808.method5515(var28), -1);
                  } else {
                     class419.method10662(9, 0, var26, var27, var26, var39, class808.method5515(var28), -1);
                  }
               } else {
                  class419.method10662(9, 0, class582.method5969(1) + var26, class582.method5969(1) + var27, var26, var39, class808.method5515(var28), -1);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETPLAYERMODEL == arg0.field826) {
            int var40 = var2.method1611();
            method6863();
            class231.method15040(var40, 5, field2452, 0);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CHAT_FILTER_SETTINGS_PRIVATECHAT == arg0.field826) {
            Statics.field8784 = class868.method16038(var2.method1688());
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VORBIS_SOUND == arg0.field826) {
            int var41 = var2.method1587();
            if (var41 == 65535) {
               var41 = -1;
            }

            int var42 = var2.method1688();
            int var43 = var2.method1587();
            int var44 = var2.method1688();
            int var45 = var2.method1587();
            class677.method6230(var41, var42, var43, var44, false, var45);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CAM_SHAKE == arg0.field826) {
            int var46 = var2.method1619();
            int var47 = var2.method1579();
            int var48 = var2.method1579();
            int var49 = var2.method1629();
            int var50 = var2.method1579();
            method6863();
            field2531[var50] = true;
            field2677[var50] = var46;
            field2678[var50] = var47;
            field2679[var50] = var48;
            field2510[var50] = var49;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MAP_PROJANIM_HALFSQ == arg0.field826) {
            method14681(class530.field4178);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CLANCHANNEL_FULL == arg0.field826) {
            field2639 = field2447;
            boolean var51 = var2.method1688() == 1;
            if (arg0.field829 == 1) {
               if (var51) {
                  Statics.field4336 = null;
               } else {
                  Statics.field3822 = null;
               }

               arg0.field826 = null;
               return true;
            } else {
               if (var51) {
                  Statics.field4336 = new class84(var2);
               } else {
                  Statics.field3822 = new class84(var2);
               }

               arg0.field826 = null;
               return true;
            }
         } else if (ServerProt.IF_OPENSUB_ACTIVE_OBJ == arg0.field826) {
            int var52 = var2.method1587();
            class723 var53 = new class723(var2.method1640());
            int var54 = var2.method1639();
            int var55 = var2.method1778();
            int var56 = var2.method1611();
            int var57 = var2.method1611();
            int var58 = var2.method1639();
            int var59 = var2.method1591();
            int var60 = var2.method1780();
            method6863();
            method14630(var59, new class262(var52, var55, new class773(var53, var60)), new int[]{var54, var57, var56, var58}, false);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOGOUT_FULL == arg0.field826) {
            method5519(false);
            arg0.field826 = null;
            return false;
         } else if (ServerProt.EXECUTE_CLIENT_CHEAT == arg0.field826) {
            int var61 = var2.method1587();
            class319.method11576(var61);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_RUN_ENERGY == arg0.field826) {
            field2597 = var2.method1688();
            field2641 = field2447;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_PUBLIC == arg0.field826) {
            int var62 = var2.method1587();
            class211 var63;
            if (field2452 == var62) {
               var63 = Statics.field5701;
            } else {
               var63 = field2408[var62];
            }

            if (var63 == null) {
               arg0.field826 = null;
               return true;
            } else {
               int var64 = var2.method1587();
               int var65 = var2.method1688();
               boolean var66 = (var64 & 32768) != 0;
               if (var63.field1381 != null && var63.field1386 != null) {
                  boolean var67 = false;
                  if (var65 <= 1) {
                     if (!var66 && (field2635 && !field2680 || field2569)) {
                        var67 = true;
                     } else if (method14784(var63.field1381)) {
                        var67 = true;
                     }
                  }

                  if (!var67) {
                     int var68 = -1;
                     String var70;
                     if (var66) {
                        var64 &= 32767;
                        class528 var69 = class528.method1495(var2);
                        var68 = var69.field4168;
                        var70 = var69.field4167.method3581(var2);
                     } else {
                        var70 = Statics.method9135(class450.method14241(var2));
                     }

                     var63.method2869(var70.trim(), var64 >> 8, var64 & 255);
                     int var71;
                     if (var65 != 1 && var65 != 2) {
                        var71 = var66 ? 17 : 2;
                     } else {
                        var71 = var66 ? 17 : 1;
                     }

                     if (var65 == 2) {
                        class419.method10662(var71, 0, class582.method5969(1) + var63.method2862(true), class582.method5969(1) + var63.method2863(false), var63.field1391, var70, (String)null, var68);
                     } else if (var65 == 1) {
                        class419.method10662(var71, 0, class582.method5969(0) + var63.method2862(true), class582.method5969(0) + var63.method2863(false), var63.field1391, var70, (String)null, var68);
                     } else {
                        class419.method10662(var71, 0, var63.method2862(true), var63.method2863(false), var63.field1391, var70, (String)null, var68);
                     }
                  }
               }

               arg0.field826 = null;
               return true;
            }
         } else if (ServerProt.IF_SETANIM == arg0.field826) {
            int var72 = var2.method1611();
            int var73 = var2.method1591();
            method6863();
            class231.method7354(var72, var73);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCLAN_SMALL == arg0.field826) {
            int var74 = var2.method1587();
            byte var75 = var2.method1623();
            if (Statics.field3804 == null) {
               Statics.field3804 = new Object[Statics.field6159.field9424];
            }

            Statics.field3804[var74] = new Integer(var75);
            field2633[++field2634 - 1 & 31] = var74;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARP_BIT_LARGE == arg0.field826) {
            int var76 = var2.method1591();
            int var77 = var2.method1780();
            Statics.field10637.method6146(var77, var76);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CUTSCENE == arg0.field826) {
            int var78 = var2.method1587();
            field2630 = -1;
            field2475 = var78;
            field2476 = 4;
            Statics.field160.method8790(field2475);
            class987.method11730();
            class987.method5514();
            int var79 = var2.method1587();
            Statics.field2786 = new int[var79][4];

            for(int var80 = 0; var80 < var79; ++var80) {
               for(int var81 = 0; var81 < 4; ++var81) {
                  Statics.field2786[var80][var81] = var2.method1591();
               }
            }

            int var82 = var2.method1688();
            Statics.field3803 = new class124(var82);
            Statics.field3803.method1753(var2.field931, var2.field935, var82);
            var2.field935 += var82;
            arg0.field826 = null;
            return false;
         } else if (ServerProt.NPC_INFO_LARGE == arg0.field826) {
            method5211(true);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETGRAPHIC == arg0.field826) {
            int var83 = var2.method1639();
            int var84 = var2.method1591();
            method6863();
            class231.method10920(var84, var83);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SET_PLAYER_OP == arg0.field826) {
            int var85 = var2.method1628();
            if (var85 == 65535) {
               var85 = -1;
            }

            int var86 = var2.method1688();
            int var87 = var2.method1778();
            String var88 = var2.method1599();
            if (var87 >= 1 && var87 <= 8) {
               if (var88.equalsIgnoreCase("null")) {
                  var88 = null;
               }

               field2712[var87 - 1] = var88;
               field2574[var87 - 1] = var85;
               field2428[var87 - 1] = var86 == 0;
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETTEXTFONT == arg0.field826) {
            int var89 = var2.method1611();
            int var90 = var2.method1639();
            method6863();
            class231.method14504(var90, var89);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CLANCHANNEL_DELTA == arg0.field826) {
            field2639 = field2447;
            boolean var91 = var2.method1688() == 1;
            class490 var92 = new class490(var2);
            class84 var93;
            if (var91) {
               var93 = Statics.field4336;
            } else {
               var93 = Statics.field3822;
            }

            var92.method6893(var93);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CAM_FORCEANGLE == arg0.field826) {
            int var94 = var2.method1629();
            int var95 = var2.method1587();
            method6863();
            method8975(var94, var95, 0);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETCLICKMASK == arg0.field826) {
            boolean var96 = var2.method1778() == 1;
            int var97 = var2.method1639();
            method6863();
            class231.method15144(var97, var96);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_OPENSUB == arg0.field826) {
            int var98 = var2.method1591();
            int var99 = var2.method1640();
            int var100 = var2.method1639();
            int var101 = var2.method1778();
            int var102 = var2.method1587();
            int var103 = var2.method1591();
            int var104 = var2.method1611();
            method6863();
            method14630(var100, new class118(var102, var101), new int[]{var98, var99, var104, var103}, false);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_OPENTOP == arg0.field826) {
            int var105 = var2.method1688();
            int var106 = var2.method1611();
            int var107 = var2.method1628();
            int var108 = var2.method1591();
            int var109 = var2.method1611();
            int var110 = var2.method1639();
            method6863();
            if (var105 == 2) {
               method6555();
            }

            int[] var111 = new int[]{var106, var110, var108, var109};
            field2593 = var107;
            method5513(var107, var111);
            Statics.method10286(false);
            class783.method10196(field2593, var111);

            for(int var112 = 0; var112 < 103; ++var112) {
               field2558[var112] = true;
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.SETDRAWORDER == arg0.field826) {
            int var113 = var2.method1579();
            method6863();
            field2535 = var113;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.OBJ_COUNT == arg0.field826) {
            method14681(class530.field4185);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.HINT_TRAIL == arg0.field826) {
            int var114 = var2.method1688();
            int var115 = var2.method1608();
            if (field2424[var114] != null) {
               field2424[var114].method10023(field2468.method9639());
               field2424[var114] = null;
            }

            if (var115 != -1) {
               field2424[var114] = new class684(Statics.field8847, var2, var115);
               field2424[var114].method10012(field2468.method9639());
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.NPC_ANIM_SPECIFIC == arg0.field826) {
            int[] var116 = new int[class647.method15598().length];

            for(int var117 = 0; var117 < class647.method15598().length; ++var117) {
               var116[var117] = var2.method1639();
            }

            int var118 = var2.method1579();
            int var119 = var2.method1587();
            class106 var120 = (class106)field2615.method15322((long)var119);
            if (var120 != null) {
               method2051((class4)var120.field807, var116, var118, true);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.CLANSETTINGS_FULL == arg0.field826) {
            field2638 = field2447;
            boolean var121 = var2.method1688() == 1;
            if (arg0.field829 == 1) {
               if (var121) {
                  Statics.field9397 = null;
               } else {
                  Statics.field10534 = null;
               }

               arg0.field826 = null;
               return true;
            } else {
               if (var121) {
                  Statics.field9397 = new class483(var2);
               } else {
                  Statics.field10534 = new class483(var2);
               }

               arg0.field826 = null;
               return true;
            }
         } else if (ServerProt.LOC_DEL == arg0.field826) {
            method14681(class530.field4172);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETPLAYERMODEL_OTHER == arg0.field826) {
            int var122 = var2.method1611();
            int var123 = var2.method1587();
            int var124 = var2.method1611();
            method6863();
            class231.method15040(var124, 5, var123, var122);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOGOUT_TRANSFER == arg0.field826) {
            int var125 = var2.method1587();
            String var126 = var2.method1599();
            boolean var127 = var2.method1688() == 1;
            Statics.field8794 = Statics.field8789;
            Statics.field9083 = var127;
            class861.method9127(var125, var126);
            Object var128 = null;
            method14844(0);
            arg0.field826 = null;
            return false;
         } else if (ServerProt.CHAT_FILTER_SETTINGS == arg0.field826) {
            field2411 = var2.method1579();
            field2582 = var2.method1579();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCLAN_STR == arg0.field826) {
            int var129 = var2.method1587();
            String var130 = var2.method1599();
            if (Statics.field3804 == null) {
               Statics.field3804 = new Object[Statics.field6159.field9424];
            }

            Statics.field3804[var129] = var130;
            field2633[++field2634 - 1 & 31] = var129;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_STAT == arg0.field826) {
            int var131 = var2.method1619();
            int var132 = var2.method1579();
            int var133 = var2.method1639();
            field2490[var131] = var133;
            field2580[var131] = var132;
            field2663[var131] = 1;
            int var134 = class777.field7143[var131] - 1;

            for(int var135 = 0; var135 < var134; ++var135) {
               if (var133 >= class777.field7144[var135]) {
                  field2663[var131] = var135 + 2;
               }
            }

            field2449[++field2628 - 1 & 31] = var131;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.JCOINS_UPDATE == arg0.field826) {
            int var136 = var2.method1639();
            if (Statics.field4780 != var136) {
               Statics.field4780 = var136;
               class783.method14203(class932.field9447, -1, -1);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.SOCIAL_NETWORK_LOGOUT == arg0.field826) {
            if (class854.field8745 && Statics.field688 != null) {
               method10176(Statics.field9361.field967.method2066(), -1, -1, false);
            }

            byte[] var137 = new byte[arg0.field829];
            var2.method3388(var137, 0, arg0.field829);
            String var138 = Statics.method5675(var137, 0, arg0.field829);
            String var139 = "opensn";
            if (!field2390 || !class689.method7945(var138, 1, var139)) {
               class689.method8031(var138, true, Statics.field9361.field974.method2236() == 5, var139, field2643, field2403);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCLAN_LARGE == arg0.field826) {
            int var140 = var2.method1587();
            int var141 = var2.method1591();
            if (Statics.field3804 == null) {
               Statics.field3804 = new Object[Statics.field6159.field9424];
            }

            Statics.field3804[var140] = new Integer(var141);
            field2633[++field2634 - 1 & 31] = var140;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_INV_FULL == arg0.field826) {
            int var142 = var2.method1587();
            int var143 = var2.method1688();
            boolean var144 = (var143 & 1) == 1;
            class72.method11654(var142, var144);
            int var145 = var2.method1587();

            for(int var146 = 0; var146 < var145; ++var146) {
               int var147 = var2.method1688();
               if (var147 == 255) {
                  var147 = var2.method1591();
               }

               int var148 = var2.method1780();
               class72.method1937(var142, var146, var148 - 1, var147, var144);
            }

            field2625[++field2560 - 1 & 31] = var142;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.FRIENDLIST_LOADED == arg0.field826) {
            field2695 = 1;
            field2524 = field2447;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.RUN_CLIENT_SCRIPT == arg0.field826) {
            String var149 = var2.method1599();
            Object[] var150 = new Object[var149.length() + 1];

            for(int var151 = var149.length() - 1; var151 >= 0; --var151) {
               if (var149.charAt(var151) == 's') {
                  var150[var151 + 1] = var2.method1599();
               } else {
                  var150[var151 + 1] = new Integer(var2.method1591());
               }
            }

            var150[0] = new Integer(var2.method1591());
            method6863();
            class90 var152 = new class90();
            var152.field683 = var150;
            class783.method15429(var152);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_MOVESUB == arg0.field826) {
            int var153 = var2.method1611();
            int var154 = var2.method1611();
            method6863();
            class118 var155 = (class118)field2594.method15322((long)var153);
            class118 var156 = (class118)field2594.method15322((long)var154);
            if (var156 != null) {
               Statics.method689(var156, var155 == null || var155.field911 != var156.field911, false);
            }

            if (var155 != null) {
               var155.method9864();
               field2594.method15311(var155, (long)var154);
            }

            class425 var157 = class425.method11190(var153);
            if (var157 != null) {
               method7309(var157);
            }

            class425 var158 = class425.method11190(var154);
            if (var158 != null) {
               method7309(var158);
               method8010(Statics.field844[var158.field3465 >>> 16], var158, true);
            }

            if (field2593 != -1) {
               method10317(field2593, 1);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.SET_MOVEACTION == arg0.field826) {
            Statics.field5177 = arg0.field829 > 2 ? var2.method1599() : class881.field9013.method15374(Statics.field243);
            field2575 = arg0.field829 > 0 ? var2.method1587() : -1;
            if (field2575 == 65535) {
               field2575 = -1;
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_QUICKCHAT_CLANCHANNEL == arg0.field826) {
            boolean var159 = var2.method1688() == 1;
            String var160 = var2.method1599();
            long var161 = (long)var2.method1587();
            long var163 = (long)var2.method1589();
            int var165 = var2.method1688();
            int var166 = var2.method1587();
            long var167 = (var161 << 32) + var163;
            boolean var169 = false;
            Object var170 = null;
            class84 var171 = var159 ? Statics.field4336 : Statics.field3822;
            if (var171 == null) {
               var169 = true;
            } else {
               int var172 = 0;

               while(true) {
                  if (var172 >= 100) {
                     if (var165 <= 1 && method14784(var160)) {
                        var169 = true;
                     }
                     break;
                  }

                  if (field2499[var172] == var167) {
                     var169 = true;
                     break;
                  }

                  ++var172;
               }
            }

            if (!var169) {
               field2499[field2669] = var167;
               field2669 = (field2669 + 1) % 100;
               String var173 = Statics.field8477.method15712(var166).method3581(var2);
               int var174 = var159 ? 42 : 45;
               if (var165 != 2 && var165 != 3) {
                  if (var165 == 1) {
                     class419.method10662(var174, 0, class582.method5969(0) + var160, class582.method5969(0) + var160, var160, var173, var171.field620, var166);
                  } else {
                     class419.method10662(var174, 0, var160, var160, var160, var173, var171.field620, var166);
                  }
               } else {
                  class419.method10662(var174, 0, class582.method5969(1) + var160, class582.method5969(1) + var160, var160, var173, var171.field620, var166);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.MIDI_JINGLE == arg0.field826) {
            int var175 = var2.method1579();
            int var176 = var2.method1780();
            if (var176 == 65535) {
               var176 = -1;
            }

            int var177 = var2.method1589();
            class677.method5390(var176, var177, var175);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_80 == arg0.field826) {
            boolean var178 = var2.method1688() == 1;
            String var179 = var2.method1599();
            String var180 = var179;
            if (var178) {
               var180 = var2.method1599();
            }

            int var181 = var2.method1688();
            boolean var182 = false;
            if (var181 <= 1) {
               if ((!field2635 || field2680) && !field2569) {
                  if (var181 <= 1 && method14784(var180)) {
                     var182 = true;
                  }
               } else {
                  var182 = true;
               }
            }

            if (!var182) {
               String var183 = Statics.method9135(class450.method14241(var2));
               if (var181 == 2) {
                  class419.method10662(24, 0, class582.method5969(1) + var179, class582.method5969(1) + var180, var179, var183, (String)null, -1);
               } else if (var181 == 1) {
                  class419.method10662(24, 0, class582.method5969(0) + var179, class582.method5969(0) + var180, var179, var183, (String)null, -1);
               } else {
                  class419.method10662(24, 0, var179, var180, var179, var183, (String)null, -1);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_IGNORE_LIST == arg0.field826) {
            while(var2.field935 < arg0.field829) {
               int var184 = var2.method1688();
               boolean var185 = (var184 & 1) == 1;
               String var186 = var2.method1599();
               String var187 = var2.method1599();

               for(int var188 = 0; var188 < field2699; ++var188) {
                  class906 var189 = field2701[var188];
                  if (var185) {
                     if (var187.equals(var189.field9244)) {
                        var189.field9244 = var186;
                        var189.field9245 = var187;
                        var186 = null;
                        break;
                     }
                  } else if (var186.equals(var189.field9244)) {
                     var189.field9244 = var186;
                     var189.field9245 = var187;
                     var186 = null;
                     break;
                  }
               }

               if (var186 != null && field2699 < 100) {
                  class906 var190 = new class906();
                  field2701[field2699] = var190;
                  var190.field9244 = var186;
                  var190.field9245 = var187;
                  var190.field9243 = (var184 & 2) == 2;
                  ++field2699;
               }
            }

            field2524 = field2447;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VIDEO_MUTE == arg0.field826) {
            int var191 = var2.method1629();
            method6863();
            class817.method5482(var191);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.TEXT_COORD == arg0.field826) {
            method14681(class530.field4182);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETOBJECT == arg0.field826) {
            int var192 = var2.method1591();
            int var193 = var2.method1628();
            if (var193 == 65535) {
               var193 = -1;
            }

            int var194 = var2.method1640();
            method6863();
            class231.method6883(var194, var193, var192);
            class899 var195 = Statics.field4196.method15540(var193);
            class231.method10474(var194, var195.field9129, var195.field9124, var195.field9137);
            class231.method14522(var194, var195.field9131, var195.field9150, var195.field9140);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_139 == arg0.field826) {
            boolean var196 = var2.method1688() == 1;
            String var197 = var2.method1599();
            String var198 = var197;
            if (var196) {
               var198 = var2.method1599();
            }

            int var199 = var2.method1688();
            int var200 = var2.method1587();
            boolean var201 = false;
            if (var199 <= 1 && method14784(var198)) {
               var201 = true;
            }

            if (!var201) {
               String var202 = Statics.field8477.method15712(var200).method3581(var2);
               if (var199 == 2) {
                  class419.method10662(25, 0, class582.method5969(1) + var197, class582.method5969(1) + var198, var197, var202, (String)null, var200);
               } else if (var199 == 1) {
                  class419.method10662(25, 0, class582.method5969(0) + var197, class582.method5969(0) + var198, var197, var202, (String)null, var200);
               } else {
                  class419.method10662(25, 0, var197, var198, var197, var202, (String)null, var200);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOGOUT == arg0.field826) {
            method5519(class385.field2835);
            arg0.field826 = null;
            return false;
         } else if (ServerProt.IF_SETRECOL == arg0.field826) {
            int var203 = var2.method1628();
            int var204 = var2.method1591();
            int var205 = var2.method1688();
            int var206 = var2.method1587();
            method6863();
            class231.method1133(var204, var205, var206, var203);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SET_TARGET == arg0.field826) {
            field2406 = var2.method1723();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_OPENSUB_ACTIVE_NPC == arg0.field826) {
            int var207 = var2.method1640();
            int var208 = var2.method1628();
            int var209 = var2.method1611();
            int var210 = var2.method1628();
            int var211 = var2.method1579();
            int var212 = var2.method1611();
            int var213 = var2.method1640();
            int var214 = var2.method1639();
            method6863();
            method14630(var207, new class253(var210, var211, var208), new int[]{var209, var213, var212, var214}, false);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SOUND_AREA == arg0.field826) {
            method14681(class530.field4179);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARP_SMALL == arg0.field826) {
            byte var215 = var2.method1622();
            int var216 = var2.method1628();
            Statics.field10637.method6145(var216, var215);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETSCROLLPOS == arg0.field826) {
            int var217 = var2.method1629();
            int var218 = var2.method1640();
            method6863();
            class231.method14523(var218, var217);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MAP_PROJANIM == arg0.field826) {
            method14681(class530.field4176);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MAP_ANIM == arg0.field826) {
            method14681(class530.field4183);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SYNTH_SOUND == arg0.field826) {
            int var219 = var2.method1587();
            if (var219 == 65535) {
               var219 = -1;
            }

            int var220 = var2.method1688();
            int var221 = var2.method1587();
            int var222 = var2.method1688();
            int var223 = var2.method1587();
            class677.method1342(var219, var220, var221, var222, var223);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCLAN_LONG == arg0.field826) {
            int var224 = var2.method1587();
            long var225 = var2.method1621();
            if (Statics.field3804 == null) {
               Statics.field3804 = new Object[Statics.field6159.field9424];
            }

            Statics.field3804[var224] = new Long(var225);
            field2633[++field2634 - 1 & 31] = var224;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CAM_RESET == arg0.field826) {
            method6863();
            method6770();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER == arg0.field826) {
            String var227 = var2.method1599();
            boolean var228 = var2.method1688() == 1;
            String var229;
            if (var228) {
               var229 = var2.method1599();
            } else {
               var229 = var227;
            }

            int var230 = var2.method1587();
            byte var231 = var2.method1623();
            boolean var232 = false;
            if (var231 == -128) {
               var232 = true;
            }

            if (var232) {
               if (Statics.field6939 == 0) {
                  arg0.field826 = null;
                  return true;
               }

               boolean var233 = false;

               int var234;
               for(var234 = 0; var234 < Statics.field6939 && (!Statics.field3105[var234].field1802.equals(var229) || Statics.field3105[var234].field1800 != var230); ++var234) {
               }

               if (var234 < Statics.field6939) {
                  while(var234 < Statics.field6939 - 1) {
                     Statics.field3105[var234] = Statics.field3105[var234 + 1];
                     ++var234;
                  }

                  --Statics.field6939;
                  Statics.field3105[Statics.field6939] = null;
               }
            } else {
               String var235 = var2.method1599();
               class272 var236 = new class272();
               var236.field1799 = var227;
               var236.field1802 = var229;
               var236.field1801 = class930.method8532(var236.field1802);
               var236.field1800 = var230;
               var236.field1804 = var231;
               var236.field1803 = var235;

               int var237;
               for(var237 = Statics.field6939 - 1; var237 >= 0; --var237) {
                  int var238 = Statics.field3105[var237].field1801.compareTo(var236.field1801);
                  if (var238 == 0) {
                     Statics.field3105[var237].field1800 = var230;
                     Statics.field3105[var237].field1804 = var231;
                     Statics.field3105[var237].field1803 = var235;
                     if (var229.equals(Statics.field5701.field1381)) {
                        Statics.field8884 = var231;
                     }

                     field2481 = field2447;
                     arg0.field826 = null;
                     return true;
                  }

                  if (var238 < 0) {
                     break;
                  }
               }

               if (Statics.field6939 >= Statics.field3105.length) {
                  arg0.field826 = null;
                  return true;
               }

               for(int var239 = Statics.field6939 - 1; var239 > var237; --var239) {
                  Statics.field3105[var239 + 1] = Statics.field3105[var239];
               }

               if (Statics.field6939 == 0) {
                  Statics.field3105 = new class272[100];
               }

               Statics.field3105[var237 + 1] = var236;
               ++Statics.field6939;
               if (var229.equals(Statics.field5701.field1381)) {
                  Statics.field8884 = var231;
               }
            }

            field2481 = field2447;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CAM_REMOVEROOF == arg0.field826) {
            int var240 = var2.method1639();
            method6863();
            if (var240 == -1) {
               Statics.field5929 = -1;
               Statics.field6637 = -1;
            } else {
               class723 var241 = field2468.method9649();
               int var242 = var240 >> 14 & 16383;
               int var243 = var240 & 16383;
               int var244 = var242 - var241.field6676;
               if (var244 < 0) {
                  var244 = 0;
               } else if (var244 >= field2468.method9648()) {
                  var244 = field2468.method9648();
               }

               int var245 = var243 - var241.field6677;
               if (var245 < 0) {
                  var245 = 0;
               } else if (var245 >= field2468.method9604()) {
                  var245 = field2468.method9604();
               }

               Statics.field5929 = (var244 << 9) + 256;
               Statics.field6637 = (var245 << 9) + 256;
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_SITESETTINGS_COOKIE == arg0.field826) {
            method15430(var2.method1599());
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_102 == arg0.field826) {
            Statics.field6495 = var2.method1590();
            field2635 = var2.method1688() == 1;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETVIDEO == arg0.field826) {
            int var246 = var2.method1611();
            int var247 = var2.method1587();
            method6863();
            class231.method14237(var246, var247);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_111 == arg0.field826) {
            field2682 = var2.method1619() == 1;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CAM2_ENABLE == arg0.field826) {
            boolean var248 = var2.method1688() == 1;
            if (var248) {
               Statics.field5998 = 2;
            } else {
               method6770();
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.REBUILD_REGION == arg0.field826) {
            class251 var249 = new class251(arg0.field829);
            System.arraycopy(arg0.field835.field931, arg0.field835.field935, var249.field931, 0, arg0.field829);
            method6227();
            if (Statics.field9361.field983.method2195() == 1) {
               Statics.field4892.method8954(new class650(class657.field5991, var249));
            } else {
               field2468.method9537(new class650(class657.field5991, var249));
            }

            arg0.field826 = null;
            return false;
         } else if (ServerProt.CAM_SMOOTHRESET == arg0.field826) {
            method6863();
            Statics.method9678();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.REBUILD_NORMAL == arg0.field826) {
            class251 var250 = new class251(arg0.field829);
            System.arraycopy(arg0.field835.field931, arg0.field835.field935, var250.field931, 0, arg0.field829);
            method6227();
            if (Statics.field9361.field983.method2195() == 1) {
               Statics.field4892.method8954(new class650(class657.field5990, var250));
            } else {
               field2468.method9537(new class650(class657.field5990, var250));
            }

            arg0.field826 = null;
            return false;
         } else if (ServerProt.VIDEO_STOP == arg0.field826) {
            int var251 = var2.method1629();
            method6863();
            class817.method8682(var251);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOC_PREFETCH == arg0.field826) {
            method14681(class530.field4180);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETNPCHEAD == arg0.field826) {
            int var252 = var2.method1591();
            int var253 = var2.method1639();
            method6863();
            class231.method15040(var253, 2, var252, -1);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MINIMAP_TOGGLE == arg0.field826) {
            class299.field1882 = var2.method1688();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_QUICKCHAT_PRIVATE_ECHO == arg0.field826) {
            String var254 = var2.method1599();
            int var255 = var2.method1587();
            String var256 = Statics.field8477.method15712(var255).method3581(var2);
            class419.method10662(19, 0, var254, var254, var254, var256, (String)null, var255);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCLAN_ENABLE == arg0.field826) {
            Statics.field3804 = new Object[Statics.field6159.field9424];
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SONG_PRELOAD == arg0.field826) {
            int var257 = var2.method1587();
            if (var257 == 65535) {
               var257 = -1;
            }

            class677.method5942(var257);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_115 == arg0.field826) {
            int var258 = var2.method1611();
            int var259 = var2.method1629();
            int var260 = var2.method1628();
            int var261 = var2.method1629();
            method6863();
            class231.method15040(var258, 7, var261 << 16 | var259, var260);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_RUN_WEIGHT == arg0.field826) {
            field2598 = var2.method1723();
            field2641 = field2447;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETHIDE == arg0.field826) {
            int var262 = var2.method1619();
            int var263 = var2.method1639();
            method6863();
            class231.method8534(var263, var262);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SPOT_ANIM_SPECIFIC == arg0.field826) {
            int var264 = var2.method1591();
            int var265 = var2.method1587();
            if (var265 == 65535) {
               var265 = -1;
            }

            int var266 = var2.method1579();
            int var267 = var2.method1579();
            int var268 = var2.method1587();
            int var269 = var2.method1629();
            int var270 = var267 & 7;
            int var271 = var267 >> 3 & 15;
            if (var271 == 15) {
               var271 = -1;
            }

            boolean var272 = (var267 >> 7 & 1) == 1;
            if (var264 >> 30 != 0) {
               class723 var273 = field2468.method9649();
               int var274 = var264 >> 28 & 3;
               int var275 = (var264 >> 14 & 16383) - var273.field6676;
               int var276 = (var264 & 16383) - var273.field6677;
               if (var275 >= 0 && var276 >= 0 && var275 < field2468.method9648() && var276 < field2468.method9604()) {
                  if (var265 == -1) {
                     class244 var277 = (class244)field2494.method15322((long)(var275 << 16 | var276));
                     if (var277 != null) {
                        var277.field1624.method3885();
                        var277.method9864();
                     }
                  } else {
                     int var278 = var275 * 512 + 256;
                     int var279 = var276 * 512 + 256;
                     int var280 = var274;
                     if (var274 < 3 && field2468.method9592().method8746(var275, var276)) {
                        var280 = var274 + 1;
                     }

                     class301 var281 = new class301(field2468.method9639(), var265, var269, var274, var280, var278, method5777(var278, var279, var274) - var268, var279, var275, var275, var276, var276, var270, var272, 0);
                     field2494.method15311(new class244(var281), (long)(var275 << 16 | var276));
                  }
               }
            } else if (var264 >> 29 != 0) {
               int var282 = var264 & 65535;
               class106 var283 = (class106)field2615.method15322((long)var282);
               if (var283 != null) {
                  class200 var284 = (class200)var283.field807;
                  class382 var285 = var284.field37[var266];
                  if (var265 == 65535) {
                     var265 = -1;
                  }

                  boolean var286 = true;
                  int var287 = var285.field2770;
                  if (var265 != -1 && var287 != -1) {
                     if (var265 == var287) {
                        class815 var288 = Statics.field3758.method14209(var265);
                        if (var288.field8418 && var288.field8406 != -1) {
                           class806 var289 = Statics.field2046.method14475(var288.field8406);
                           int var290 = var289.field8370;
                           if (var290 != 0 && var290 != 2) {
                              if (var290 == 1) {
                                 var286 = true;
                              }
                           } else {
                              var286 = false;
                           }
                        }
                     } else {
                        class815 var291 = Statics.field3758.method14209(var265);
                        class815 var292 = Statics.field3758.method14209(var287);
                        if (var291.field8406 != -1 && var292.field8406 != -1) {
                           class806 var293 = Statics.field2046.method14475(var291.field8406);
                           class806 var294 = Statics.field2046.method14475(var292.field8406);
                           if (var293.field8365 < var294.field8365) {
                              var286 = false;
                           }
                        }
                     }
                  }

                  if (var286) {
                     var285.field2770 = var265;
                     var285.field2771 = var268;
                     var285.field2772 = var271;
                     if (var265 != -1) {
                        class815 var295 = Statics.field3758.method14209(var265);
                        int var296 = var295.field8418 ? 0 : 2;
                        if (var272) {
                           var296 = 1;
                        }

                        var285.field2774.method14690(var295.field8406, var269, var296, false);
                     } else {
                        var285.field2774.method14694(-1);
                     }
                  }
               }
            } else if (var264 >> 28 != 0) {
               int var297 = var264 & 65535;
               class211 var298;
               if (field2452 == var297) {
                  var298 = Statics.field5701;
               } else {
                  var298 = field2408[var297];
               }

               if (var298 != null) {
                  class382 var299 = var298.field37[var266];
                  if (var265 == 65535) {
                     var265 = -1;
                  }

                  boolean var300 = true;
                  int var301 = var299.field2770;
                  if (var265 != -1 && var301 != -1) {
                     if (var265 == var301) {
                        class815 var302 = Statics.field3758.method14209(var265);
                        if (var302.field8418 && var302.field8406 != -1) {
                           class806 var303 = Statics.field2046.method14475(var302.field8406);
                           int var304 = var303.field8370;
                           if (var304 != 0 && var304 != 2) {
                              if (var304 == 1) {
                                 var300 = true;
                              }
                           } else {
                              var300 = false;
                           }
                        }
                     } else {
                        class815 var305 = Statics.field3758.method14209(var265);
                        class815 var306 = Statics.field3758.method14209(var301);
                        if (var305.field8406 != -1 && var306.field8406 != -1) {
                           class806 var307 = Statics.field2046.method14475(var305.field8406);
                           class806 var308 = Statics.field2046.method14475(var306.field8406);
                           if (var307.field8365 < var308.field8365) {
                              var300 = false;
                           }
                        }
                     }
                  }

                  if (var300) {
                     var299.field2770 = var265;
                     var299.field2771 = var268;
                     var299.field2772 = var271;
                     var299.field2773 = var270;
                     if (var265 != -1) {
                        class815 var309 = Statics.field3758.method14209(var265);
                        int var310 = var309.field8418 ? 0 : 2;
                        if (var272) {
                           var310 = 1;
                        }

                        var299.field2774.method14690(var309.field8406, var269, var310, false);
                     } else {
                        var299.field2774.method14694(-1);
                     }
                  }
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.LAST_LOGIN_INFO == arg0.field826) {
            int var311 = var2.method1591();
            Statics.field2285 = new class358(var311);
            Thread var312 = new Thread(Statics.field2285);
            var312.setPriority(1);
            var312.start();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_GAME == arg0.field826) {
            int var313 = var2.method1604();
            int var314 = var2.method1591();
            int var315 = var2.method1688();
            String var316 = "";
            String var317 = var316;
            if ((var315 & 1) != 0) {
               var316 = var2.method1599();
               if ((var315 & 2) != 0) {
                  var317 = var2.method1599();
               } else {
                  var317 = var316;
               }
            }

            String var318 = var2.method1599();
            if (var313 == 99) {
               class319.method10037(var318);
            } else if (var313 == 98) {
               class319.method6571(var318);
            } else {
               if (!var317.equals("") && method14784(var317)) {
                  arg0.field826 = null;
                  return true;
               }

               class419.method3849(var313, var314, var316, var317, var316, var318);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.CREATE_ACCOUNT_REPLY == arg0.field826) {
            int var319 = var2.method1688();
            class834 var320 = (class834)class814.method4102(class834.method9853(), var319);
            if (var320 == null) {
               var320 = class834.field8506;
            }

            class825.method10749(var320);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOGOUT_LOBBY == arg0.field826) {
            arg0.field826 = null;
            return false;
         } else if (ServerProt.UPDATE_REBOOT_TIMER == arg0.field826) {
            if (method7373(field2410)) {
               field2479 = (int)((float)var2.method1587() * 2.5F);
            } else {
               field2479 = var2.method1587() * 30;
            }

            field2641 = field2447;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETPOSITION == arg0.field826) {
            int var321 = var2.method1591();
            int var322 = var2.method1632();
            int var323 = var2.method1754();
            method6863();
            class231.method2068(var321, var323, var322);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_CLOSESUB == arg0.field826) {
            int var324 = var2.method1639();
            method6863();
            class118 var325 = (class118)field2594.method15322((long)var324);
            if (var325 != null) {
               Statics.method689(var325, true, false);
            }

            if (field2596 != null) {
               method7309(field2596);
               field2596 = null;
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETRETEX == arg0.field826) {
            int var326 = var2.method1587();
            int var327 = var2.method1778();
            int var328 = var2.method1780();
            int var329 = var2.method1639();
            method6863();
            class231.method1313(var329, var327, var326, var328);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_FRIENDLIST == arg0.field826) {
            while(var2.field935 < arg0.field829) {
               boolean var330 = var2.method1688() == 1;
               String var331 = var2.method1599();
               String var332 = var2.method1599();
               int var333 = var2.method1587();
               int var334 = var2.method1688();
               boolean var335 = var2.method1688() == 1;
               String var336 = "";
               int var337 = -1;
               int var338 = 0;
               if (var333 > 0) {
                  var336 = var2.method1599();
                  var337 = var2.method1688();
                  var338 = var2.method1591();
               }

               for(int var339 = 0; var339 < field2694; ++var339) {
                  class960 var340 = field2697[var339];
                  if (!var330) {
                     if (var331.equals(var340.field9601)) {
                        if (var340.field9605 != var333) {
                           boolean var341 = true;

                           for(class61 var342 = (class61)field2670.method14798(); var342 != null; var342 = (class61)field2670.method14793()) {
                              if (var342.field440.equals(var331)) {
                                 if (var333 != 0 && var342.field441 == 0) {
                                    var342.method9960();
                                    var341 = false;
                                 } else if (var333 == 0 && var342.field441 != 0) {
                                    var342.method9960();
                                    var341 = false;
                                 }
                              }
                           }

                           if (var341) {
                              field2670.method14795(new class61(var331, var333));
                           }

                           var340.field9605 = var333;
                        }

                        var340.field9599 = var332;
                        var340.field9600 = var336;
                        var340.field9598 = var334;
                        var340.field9603 = var337;
                        var340.field9602 = var335;
                        var340.field9604 = var338;
                        var331 = null;
                        break;
                     }
                  } else if (var332.equals(var340.field9601)) {
                     var340.field9601 = var331;
                     var340.field9599 = var332;
                     var331 = null;
                     break;
                  }
               }

               if (var331 != null && field2694 < 200) {
                  class960 var343 = new class960();
                  field2697[field2694] = var343;
                  var343.field9601 = var331;
                  var343.field9599 = var332;
                  var343.field9605 = var333;
                  var343.field9600 = var336;
                  var343.field9598 = var334;
                  var343.field9603 = var337;
                  var343.field9602 = var335;
                  var343.field9604 = var338;
                  ++field2694;
               }
            }

            field2695 = 2;
            field2524 = field2447;
            boolean var344 = false;
            int var345 = field2694;

            while(var345 > 0) {
               boolean var346 = true;
               --var345;

               for(int var347 = 0; var347 < var345; ++var347) {
                  boolean var348 = false;
                  class960 var349 = field2697[var347];
                  class960 var350 = field2697[var347 + 1];
                  if (Statics.field8789.field8851 != var349.field9605 && Statics.field8789.field8851 == var350.field9605) {
                     var348 = true;
                  }

                  if (!var348 && var349.field9605 == 0 && var350.field9605 != 0) {
                     var348 = true;
                  }

                  if (!var348 && !var349.field9602 && var350.field9602) {
                     var348 = true;
                  }

                  if (var348) {
                     class960 var351 = field2697[var347];
                     field2697[var347] = field2697[var347 + 1];
                     field2697[var347 + 1] = var351;
                     var346 = false;
                  }
               }

               if (var346) {
                  break;
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_CLANCHANNEL == arg0.field826) {
            boolean var352 = var2.method1688() == 1;
            String var353 = var2.method1599();
            long var354 = (long)var2.method1587();
            long var356 = (long)var2.method1589();
            int var358 = var2.method1688();
            long var359 = (var354 << 32) + var356;
            boolean var361 = false;
            Object var362 = null;
            class84 var363 = var352 ? Statics.field4336 : Statics.field3822;
            if (var363 == null) {
               var361 = true;
            } else {
               int var364 = 0;

               while(true) {
                  if (var364 >= 100) {
                     if (var358 <= 1) {
                        if ((!field2635 || field2680) && !field2569) {
                           if (method14784(var353)) {
                              var361 = true;
                           }
                        } else {
                           var361 = true;
                        }
                     }
                     break;
                  }

                  if (field2499[var364] == var359) {
                     var361 = true;
                     break;
                  }

                  ++var364;
               }
            }

            if (!var361) {
               field2499[field2669] = var359;
               field2669 = (field2669 + 1) % 100;
               String var365 = Statics.method9135(class450.method14241(var2));
               int var366 = var352 ? 41 : 44;
               if (var358 != 2 && var358 != 3) {
                  if (var358 == 1) {
                     class419.method10662(var366, 0, class582.method5969(0) + var353, class582.method5969(0) + var353, var353, var365, var363.field620, -1);
                  } else {
                     class419.method10662(var366, 0, var353, var353, var353, var365, var363.field620, -1);
                  }
               } else {
                  class419.method10662(var366, 0, class582.method5969(1) + var353, class582.method5969(1) + var353, var353, var365, var363.field620, -1);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.HINT_ARROW == arg0.field826) {
            int var367 = var2.method1688();
            int var368 = var367 >> 5;
            int var369 = var367 & 31;
            if (var369 == 0) {
               field2423[var368] = null;
               arg0.field826 = null;
               return true;
            } else {
               class164 var370 = new class164();
               var370.field1156 = var369;
               var370.field1153 = var2.method1688();
               if (var370.field1153 >= 0 && var370.field1153 < Statics.field3102.length) {
                  if (var370.field1156 != 1 && var370.field1156 != 10) {
                     if (var370.field1156 >= 2 && var370.field1156 <= 6) {
                        if (var370.field1156 == 2) {
                           var370.field1152 = 256;
                           var370.field1155 = 256;
                        }

                        if (var370.field1156 == 3) {
                           var370.field1152 = 0;
                           var370.field1155 = 256;
                        }

                        if (var370.field1156 == 4) {
                           var370.field1152 = 512;
                           var370.field1155 = 256;
                        }

                        if (var370.field1156 == 5) {
                           var370.field1152 = 256;
                           var370.field1155 = 0;
                        }

                        if (var370.field1156 == 6) {
                           var370.field1152 = 256;
                           var370.field1155 = 512;
                        }

                        var370.field1156 = 2;
                        var370.field1157 = var2.method1688();
                        class723 var371 = field2468.method9649();
                        var370.field1152 += var2.method1587() - var371.field6676 << 9;
                        var370.field1155 += var2.method1587() - var371.field6677 << 9;
                        var370.field1154 = var2.method1688() << 2;
                        var370.field1148 = var2.method1587();
                     }
                  } else {
                     var370.field1150 = var2.method1587();
                     var370.field1149 = var2.method1587();
                     var2.field935 += 4;
                  }

                  var370.field1151 = var2.method1591();
                  field2423[var368] = var370;
               }

               arg0.field826 = null;
               return true;
            }
         } else if (ServerProt.RESET_CLIENT_VAR_CACHE == arg0.field826) {
            Statics.field10637.method6141();
            field2624 += 32;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CREATE_CHECK_NAME_REPLY == arg0.field826) {
            int var372 = var2.method1688();
            class842 var373 = (class842)class814.method4102(class842.method7394(), var372);
            if (var373 == null) {
               var373 = class842.field8562;
            }

            class825.method10026(var373);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETTARGETPARAM == arg0.field826) {
            int var374 = var2.method1628();
            int var375 = var2.method1629();
            if (var375 == 65535) {
               var375 = -1;
            }

            int var376 = var2.method1629();
            if (var376 == 65535) {
               var376 = -1;
            }

            int var377 = var2.method1640();
            method6863();

            for(int var378 = var375; var378 <= var376; ++var378) {
               long var379 = ((long)var377 << 32) + (long)var378;
               class58 var381 = (class58)field2649.method15322(var379);
               class58 var382;
               if (var381 == null) {
                  if (var378 == -1) {
                     var382 = new class58(class425.method11190(var377).field3477.field432, var374);
                  } else {
                     var382 = new class58(0, var374);
                  }
               } else {
                  var382 = new class58(var381.field432, var374);
                  var381.method9864();
               }

               field2649.method15311(var382, var379);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.JS5_RELOAD == arg0.field826) {
            class590.method15507();
            arg0.field826 = null;
            return false;
         } else if (ServerProt.UNKNOWN_154 == arg0.field826) {
            boolean var383 = var2.method1688() == 1;
            method6863();
            Statics.field9387 = var383;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.OBJ_REVEAL == arg0.field826) {
            method14681(class530.field4174);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARC_LARGE == arg0.field826) {
            int var384 = var2.method1591();
            int var385 = var2.method1629();
            method6863();
            class231.method3136(var385, var384);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_48 == arg0.field826) {
            if (field2593 != -1) {
               method10317(field2593, 0);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_INV_PARTIAL == arg0.field826) {
            int var386 = var2.method1587();
            int var387 = var2.method1688();
            boolean var388 = (var387 & 1) == 1;

            while(var2.field935 < arg0.field829) {
               int var389 = var2.method1604();
               int var390 = var2.method1587();
               int var391 = 0;
               if (var390 != 0) {
                  var391 = var2.method1688();
                  if (var391 == 255) {
                     var391 = var2.method1591();
                  }
               }

               class72.method1937(var386, var389, var390 - 1, var391, var388);
            }

            field2625[++field2560 - 1 & 31] = var386;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOC_ANIM == arg0.field826) {
            method14681(class530.field4175);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.PLAYER_INFO == arg0.field826) {
            class324.method5205(var2, arg0.field829);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETANGLE == arg0.field826) {
            int var392 = var2.method1780();
            int var393 = var2.method1591();
            int var394 = var2.method1587();
            int var395 = var2.method1780();
            method6863();
            class231.method10474(var393, var394, var395, var392);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_ZONE_FULL_FOLLOWS == arg0.field826) {
            Statics.field6081 = var2.method1622() << 3;
            Statics.field9623 = var2.method1778();
            Statics.field1371 = var2.method1730() << 3;
            class723 var396 = field2468.method9649();

            for(class79 var397 = (class79)field2576.method15313(); var397 != null; var397 = (class79)field2576.method15314()) {
               int var398 = (int)(var397.field6137 >> 28 & 3L);
               int var399 = (int)(var397.field6137 & 16383L);
               int var400 = var399 - var396.field6676;
               int var401 = (int)(var397.field6137 >> 14 & 16383L);
               int var402 = var401 - var396.field6677;
               if (Statics.field9623 == var398 && var400 >= Statics.field6081 && var400 < Statics.field6081 + 8 && var402 >= Statics.field1371 && var402 < Statics.field1371 + 8) {
                  var397.method9864();
                  if (var400 >= 0 && var402 >= 0 && var400 < field2468.method9648() && var402 < field2468.method9604()) {
                     method10932(Statics.field9623, var400, var402);
                  }
               }
            }

            for(class75 var403 = (class75)class75.field556.method14964(); var403 != null; var403 = (class75)class75.field556.method15006()) {
               if (var403.field545 >= Statics.field6081 && var403.field545 < Statics.field6081 + 8 && var403.field546 >= Statics.field1371 && var403.field546 < Statics.field1371 + 8 && Statics.field9623 == var403.field558) {
                  var403.field555 = true;
               }
            }

            for(class75 var404 = (class75)class75.field544.method14964(); var404 != null; var404 = (class75)class75.field544.method15006()) {
               if (var404.field545 >= Statics.field6081 && var404.field545 < Statics.field6081 + 8 && var404.field546 >= Statics.field1371 && var404.field546 < Statics.field1371 + 8 && Statics.field9623 == var404.field558) {
                  var404.field555 = true;
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_INV_STOP_TRANSMIT == arg0.field826) {
            int var405 = var2.method1778();
            int var406 = var2.method1587();
            boolean var407 = (var405 & 1) == 1;
            class72.method10473(var406, var407);
            field2625[++field2560 - 1 & 31] = var406;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETPLAYERHEAD_OTHER == arg0.field826) {
            int var408 = var2.method1640();
            int var409 = var2.method1611();
            int var410 = var2.method1629();
            method6863();
            class231.method15040(var409, 3, var410, var408);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.WORLDLIST_FETCH_REPLY == arg0.field826) {
            boolean var411 = var2.method1688() == 1;
            byte[] var412 = new byte[arg0.field829 - 1];
            var2.method1602(var412, 0, arg0.field829 - 1);
            Statics.method17066(var411, var412);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARP_LARGE == arg0.field826) {
            int var413 = var2.method1611();
            int var414 = var2.method1629();
            Statics.field10637.method6145(var414, var413);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VIDEO_START == arg0.field826) {
            int var415 = var2.method1628();
            int var416 = var2.method1579();
            method6863();
            class817.method486(var415, var416, true);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MIDI_SONG == arg0.field826) {
            int var417 = var2.method1587();
            if (var417 == 65535) {
               var417 = -1;
            }

            int var418 = var2.method1579();
            int var419 = var2.method1688();
            class677.method5269(var417, var418, var419);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.RESET_ALL_ANIMATIONS == arg0.field826) {
            for(int var420 = 0; var420 < field2408.length; ++var420) {
               if (field2408[var420] != null) {
                  field2408[var420].field41 = null;
                  field2408[var420].field38.method14694(-1);
               }
            }

            for(int var421 = 0; var421 < field2492; ++var421) {
               ((class4)field2453[var421].field807).field41 = null;
               ((class4)field2453[var421].field807).field38.method14694(-1);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETPLAYERHEAD == arg0.field826) {
            int var422 = var2.method1591();
            method6863();
            class231.method15040(var422, 3, field2452, 0);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SET_MAP_FLAG == arg0.field826) {
            int var423 = var2.method1619();
            int var424 = var2.method1688();
            if (var424 == 255) {
               var424 = -1;
               var423 = -1;
            }

            class231.method8899(var424, var423);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VORBIS_SPEECH_STOP == arg0.field826) {
            Statics.method10030();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_QUICKCHAT_PRIVATE == arg0.field826) {
            boolean var425 = var2.method1688() == 1;
            String var426 = var2.method1599();
            String var427 = var426;
            if (var425) {
               var427 = var2.method1599();
            }

            long var428 = (long)var2.method1587();
            long var430 = (long)var2.method1589();
            int var432 = var2.method1688();
            int var433 = var2.method1587();
            long var434 = (var428 << 32) + var430;
            boolean var436 = false;
            int var437 = 0;

            while(true) {
               if (var437 >= 100) {
                  if (var432 <= 1 && method14784(var427)) {
                     var436 = true;
                  }
                  break;
               }

               if (field2499[var437] == var434) {
                  var436 = true;
                  break;
               }

               ++var437;
            }

            if (!var436) {
               field2499[field2669] = var434;
               field2669 = (field2669 + 1) % 100;
               String var438 = Statics.field8477.method15712(var433).method3581(var2);
               if (var432 == 2) {
                  class419.method10662(18, 0, class582.method5969(1) + var426, class582.method5969(1) + var427, var426, var438, (String)null, var433);
               } else if (var432 == 1) {
                  class419.method10662(18, 0, class582.method5969(0) + var426, class582.method5969(0) + var427, var426, var438, (String)null, var433);
               } else {
                  class419.method10662(18, 0, var426, var427, var426, var438, (String)null, var433);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.SERVER_REPLY == arg0.field826) {
            byte[] var439 = new byte[arg0.field829];
            var2.method3388(var439, 0, arg0.field829);
            String var440 = Statics.method5675(var439, 0, arg0.field829);
            if (field2390) {
               try {
                  class573.field5178.method7989(new Object[]{var440});
               } catch (Throwable var600) {
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_121 == arg0.field826) {
            int var442 = var2.method1587();
            int var443 = var2.method1587();
            int var444 = var2.method1587();
            method6863();
            if (Statics.field844[var442] != null) {
               for(int var445 = var443; var445 < var444; ++var445) {
                  int var446 = var2.method1589();
                  if (var445 < Statics.field844[var442].field3569.length && Statics.field844[var442].field3569[var445] != null) {
                     Statics.field844[var442].field3569[var445].field3399 = var446;
                  }
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UNKNOWN_13 == arg0.field826) {
            int var447 = var2.method1780();
            int var448 = var2.method1611();
            int var449 = var2.method1628();
            method6863();
            class231.method5387(var448, (var447 << 16) + var449);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_PRIVATE == arg0.field826) {
            boolean var450 = var2.method1688() == 1;
            String var451 = var2.method1599();
            String var452 = var451;
            if (var450) {
               var452 = var2.method1599();
            }

            long var453 = (long)var2.method1587();
            long var455 = (long)var2.method1589();
            int var457 = var2.method1688();
            long var458 = (var453 << 32) + var455;
            boolean var460 = false;
            int var461 = 0;

            while(true) {
               if (var461 >= 100) {
                  if (var457 <= 1) {
                     if ((!field2635 || field2680) && !field2569) {
                        if (method14784(var452)) {
                           var460 = true;
                        }
                     } else {
                        var460 = true;
                     }
                  }
                  break;
               }

               if (field2499[var461] == var458) {
                  var460 = true;
                  break;
               }

               ++var461;
            }

            if (!var460) {
               field2499[field2669] = var458;
               field2669 = (field2669 + 1) % 100;
               String var462 = Statics.method9135(class450.method14241(var2));
               if (var457 == 2) {
                  class419.method10662(7, 0, class582.method5969(1) + var451, class582.method5969(1) + var452, var451, var462, (String)null, -1);
               } else if (var457 == 1) {
                  class419.method10662(7, 0, class582.method5969(0) + var451, class582.method5969(0) + var452, var451, var462, (String)null, -1);
               } else {
                  class419.method10662(3, 0, var451, var452, var451, var462, (String)null, -1);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_ZONE_PARTIAL_ENCLOSED == arg0.field826) {
            Statics.field9623 = var2.method1688();
            Statics.field6081 = var2.method1622() << 3;
            Statics.field1371 = var2.method1594() << 3;

            while(var2.field935 < arg0.field829) {
               class530 var463 = class530.method6251()[var2.method1688()];
               method14681(var463);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOC_ANIM_SPECIFIC == arg0.field826) {
            int var464 = var2.method1619();
            int var465 = var464 >> 2;
            int var466 = var464 & 3;
            int var467 = field2474[var465];
            int var468 = var2.method1591();
            int var469 = var468 >> 28 & 3;
            int var470 = var468 >> 14 & 16383;
            int var471 = var468 & 16383;
            int var472 = var2.method1640();
            class723 var473 = field2468.method9649();
            int var474 = var470 - var473.field6676;
            int var475 = var471 - var473.field6677;
            method8761(var469, var474, var475, var467, var465, var466, var472);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_OPENSUB_ACTIVE_LOC == arg0.field826) {
            int var476 = var2.method1639();
            int var477 = var2.method1639();
            int var478 = var2.method1619();
            int var479 = var478 >> 2;
            int var480 = var478 & 3;
            int var481 = var2.method1587();
            int var482 = var2.method1591();
            class723 var483 = new class723(var2.method1639());
            int var484 = var2.method1591();
            int var485 = var2.method1591();
            int var486 = var2.method1778();
            int var487 = var2.method1640();
            method6863();
            method14630(var482, new class269(var481, var486, new class779(var483, var479, var480, var484)), new int[]{var485, var476, var487, var477}, false);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOC_ADD_CHANGE == arg0.field826) {
            method14681(class530.field4177);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETEVENTS == arg0.field826) {
            int var488 = var2.method1780();
            if (var488 == 65535) {
               var488 = -1;
            }

            int var489 = var2.method1628();
            if (var489 == 65535) {
               var489 = -1;
            }

            int var490 = var2.method1591();
            int var491 = var2.method1591();
            method6863();

            for(int var492 = var488; var492 <= var489; ++var492) {
               long var493 = ((long)var490 << 32) + (long)var492;
               class58 var495 = (class58)field2649.method15322(var493);
               class58 var496;
               if (var495 == null) {
                  if (var492 == -1) {
                     var496 = new class58(var491, class425.method11190(var490).field3477.field434);
                  } else {
                     var496 = new class58(var491, -1);
                  }
               } else {
                  var496 = new class58(var491, var495.field434);
                  var495.method9864();
               }

               field2649.method15311(var496, var493);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.OBJ_DEL == arg0.field826) {
            method14681(class530.field4181);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOC_MERGE == arg0.field826) {
            method14681(class530.field4184);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.CAMERA_UPDATE == arg0.field826) {
            Statics.field6895.method244(var2, arg0.field829);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_OPENSUB_ACTIVE_PLAYER == arg0.field826) {
            int var497 = var2.method1639();
            int var498 = var2.method1629();
            int var499 = var2.method1619();
            int var500 = var2.method1640();
            int var501 = var2.method1639();
            int var502 = var2.method1611();
            int var503 = var2.method1628();
            int var504 = var2.method1640();
            method6863();
            method14630(var500, new class250(var503, var499, var498), new int[]{var501, var504, var502, var497}, false);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.LOYALTY_UPDATE == arg0.field826) {
            boolean var505 = var2.method1579() == 1;
            int var506 = var2.method1611();
            if (Statics.field7164 != var505 || Statics.field8650 != var506) {
               Statics.field7164 = var505;
               Statics.field8650 = var506;
               class783.method14203(class932.field9449, -1, -1);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.OBJ_ADD == arg0.field826) {
            method14681(class530.field4173);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCSTR_SMALL == arg0.field826) {
            int var507 = var2.method1587();
            String var508 = var2.method1599();
            method6863();
            class231.method9268(var507, var508);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_GE_SLOT == arg0.field826) {
            int var509 = var2.method1688();
            if (var2.method1688() == 0) {
               field2681[var509] = new class634();
            } else {
               --var2.field935;
               field2681[var509] = new class634(var2);
            }

            field2611 = field2447;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_PRIVATE_ECHO == arg0.field826) {
            String var510 = var2.method1599();
            String var511 = Statics.method9135(class450.method14241(var2));
            class419.method3849(6, 0, var510, var510, var510, var511);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARC_SMALL == arg0.field826) {
            byte var512 = var2.method1594();
            int var513 = var2.method1780();
            method6863();
            class231.method3136(var513, var512);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SEND_PING == arg0.field826) {
            int var514 = var2.method1591();
            int var515 = var2.method1591();
            class109 var516 = class109.method15110(ClientProt.SEND_PING_REPLY, arg0.field832);
            var516.field814.method1772(field6099);
            var516.field814.method1572(var514);
            var516.field814.method1635(var515);
            arg0.method1408(var516);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.MESSAGE_QUICKCHAT_FRIENDCHAT == arg0.field826) {
            boolean var517 = var2.method1688() == 1;
            String var518 = var2.method1599();
            String var519 = var518;
            if (var517) {
               var519 = var2.method1599();
            }

            long var520 = var2.method1621();
            long var522 = (long)var2.method1587();
            long var524 = (long)var2.method1589();
            int var526 = var2.method1688();
            int var527 = var2.method1587();
            long var528 = (var522 << 32) + var524;
            boolean var530 = false;
            int var531 = 0;

            while(true) {
               if (var531 >= 100) {
                  if (var526 <= 1 && method14784(var519)) {
                     var530 = true;
                  }
                  break;
               }

               if (field2499[var531] == var528) {
                  var530 = true;
                  break;
               }

               ++var531;
            }

            if (!var530) {
               field2499[field2669] = var528;
               field2669 = (field2669 + 1) % 100;
               String var532 = Statics.field8477.method15712(var527).method3581(var2);
               if (var526 == 2) {
                  class419.method10662(20, 0, class582.method5969(1) + var518, class582.method5969(1) + var519, var518, var532, class808.method5515(var520), var527);
               } else if (var526 == 1) {
                  class419.method10662(20, 0, class582.method5969(0) + var518, class582.method5969(0) + var519, var518, var532, class808.method5515(var520), var527);
               } else {
                  class419.method10662(20, 0, var518, var519, var518, var532, class808.method5515(var520), var527);
               }
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.IF_SETCOLOUR == arg0.field826) {
            int var533 = var2.method1629();
            int var534 = var2.method1639();
            method6863();
            class231.method5487(var534, var533);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.SET_SONG_VOLUME == arg0.field826) {
            byte var535 = var2.method1623();
            int var536 = var2.method1619();
            method6863();
            class677.method6642(var535, var536);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.PROJ_ANIM_SPECIFIC == arg0.field826) {
            int var537 = var2.method1629();
            int var538 = var2.method1628();
            int var539 = var2.method1579() * 4;
            int var540 = var2.method1587();
            int var541 = var2.method1629();
            int var542 = var2.method1579();
            int var543 = var2.method1754();
            byte var544 = var2.method1623();
            int var545 = var2.method1628();
            int var546 = var2.method1754();
            int var547 = var2.method1579();
            int var548 = var2.method1619();
            if (var548 == 255) {
               var548 = -1;
            }

            byte var549 = var2.method1622();
            int var550 = var2.method1629();
            boolean var551 = (var542 & 1) != 0;
            boolean var552 = (var542 & 2) != 0;
            int var553 = var552 ? var542 >> 2 : -1;
            int var554;
            if (var552) {
               var554 = (byte)var547;
            } else {
               var554 = var547 * 4;
            }

            class723 var555 = field2468.method9649();
            int var556 = var545 - var555.field6676 * 2;
            int var557 = var537 - var555.field6677 * 2;
            int var558 = var544 + var556;
            int var559 = var549 + var557;
            if (var556 >= 0 && var557 >= 0 && var556 < field2468.method9648() * 2 && var557 < field2468.method9648() * 2 && var558 >= 0 && var559 >= 0 && var558 < field2468.method9604() * 2 && var559 < field2468.method9604() * 2 && var541 != 65535) {
               int var560 = var556 * 256;
               int var561 = var557 * 256;
               int var562 = var558 * 256;
               int var563 = var559 * 256;
               int var564 = var554 << 2;
               int var565 = var539 << 2;
               int var566 = var538 << 2;
               method15707(var541, var543, var546, var553, var564, var565, var560, var561, var562, var563, var540, var550, var548, var566, var551, 0);
            }

            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_FRIENDCHAT_CHANNEL_FULL == arg0.field826) {
            field2481 = field2447;
            if (arg0.field829 == 0) {
               field2578 = null;
               field2427 = null;
               Statics.field6939 = 0;
               Statics.field3105 = null;
               arg0.field826 = null;
               return true;
            } else {
               field2427 = var2.method1599();
               boolean var567 = var2.method1688() == 1;
               if (var567) {
                  var2.method1599();
               }

               long var568 = var2.method1621();
               field2578 = class808.method6544(var568);
               Statics.field2757 = var2.method1623();
               int var570 = var2.method1688();
               if (var570 == 255) {
                  arg0.field826 = null;
                  return true;
               } else {
                  Statics.field6939 = var570;
                  class272[] var571 = new class272[100];

                  for(int var572 = 0; var572 < Statics.field6939; ++var572) {
                     var571[var572] = new class272();
                     var571[var572].field1799 = var2.method1599();
                     boolean var573 = var2.method1688() == 1;
                     if (var573) {
                        var571[var572].field1802 = var2.method1599();
                     } else {
                        var571[var572].field1802 = var571[var572].field1799;
                     }

                     var571[var572].field1801 = class930.method8532(var571[var572].field1802);
                     var571[var572].field1800 = var2.method1587();
                     var571[var572].field1804 = var2.method1623();
                     var571[var572].field1803 = var2.method1599();
                     if (var571[var572].field1802.equals(Statics.field5701.field1381)) {
                        Statics.field8884 = var571[var572].field1804;
                     }
                  }

                  boolean var574 = false;
                  int var575 = Statics.field6939;

                  while(var575 > 0) {
                     boolean var576 = true;
                     --var575;

                     for(int var577 = 0; var577 < var575; ++var577) {
                        if (var571[var577].field1801.compareTo(var571[var577 + 1].field1801) > 0) {
                           class272 var578 = var571[var577];
                           var571[var577] = var571[var577 + 1];
                           var571[var577 + 1] = var578;
                           var576 = false;
                        }
                     }

                     if (var576) {
                        break;
                     }
                  }

                  Statics.field3105 = var571;
                  arg0.field826 = null;
                  return true;
               }
            }
         } else if (ServerProt.VORBIS_SPEECH_SOUND == arg0.field826) {
            int var579 = var2.method1587();
            if (var579 == 65535) {
               var579 = -1;
            }

            int var580 = var2.method1688();
            int var581 = var2.method1587();
            int var582 = var2.method1688();
            class677.method6230(var579, var580, var581, var582, true, 256);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.REFLECTION_CHECKER == arg0.field826) {
            class896.method2289(var2, arg0.field829);
            arg0.field826 = null;
            return true;
         } else if (ServerProt.VARCLAN_DISABLE == arg0.field826) {
            Statics.field3804 = null;
            arg0.field826 = null;
            return true;
         } else if (ServerProt.UPDATE_ZONE_PARTIAL_FOLLOWS == arg0.field826) {
            Statics.field1371 = var2.method1622() << 3;
            Statics.field6081 = var2.method1622() << 3;
            Statics.field9623 = var2.method1688();
            arg0.field826 = null;
            return true;
         } else if (ServerProt.URL_OPEN != arg0.field826) {
            if (ServerProt.CLANSETTINGS_DELTA == arg0.field826) {
               field2638 = field2447;
               boolean var588 = var2.method1688() == 1;
               class471 var589 = new class471(var2);
               class483 var590;
               if (var588) {
                  var590 = Statics.field9397;
               } else {
                  var590 = Statics.field10534;
               }

               var589.method6616(var590);
               arg0.field826 = null;
               return true;
            } else if (ServerProt.CAM_MOVETO == arg0.field826) {
               int var591 = var2.method1579();
               int var592 = var2.method1778();
               int var593 = var2.method1628() << 2;
               int var594 = var2.method1688();
               int var595 = var2.method1778();
               method6863();
               method9870(var591, var592, var593, var594, var595, true);
               arg0.field826 = null;
               return true;
            } else if (ServerProt.NPC_INFO == arg0.field826) {
               method5211(false);
               arg0.field826 = null;
               return true;
            } else if (ServerProt.IF_SETTEXT_ANTIMACRO == arg0.field826) {
               boolean var596 = var2.method1778() == 1;
               int var597 = var2.method1639();
               method6863();
               class231.method11349(var597, var596);
               arg0.field826 = null;
               return true;
            } else if (ServerProt.VARP_BIT_SMALL == arg0.field826) {
               int var598 = var2.method1780();
               int var599 = var2.method1579();
               Statics.field10637.method6146(var598, var599);
               arg0.field826 = null;
               return true;
            } else {
               class285.method15864((arg0.field826 != null ? arg0.field826.getOpcode() : -1) + class582.field5306 + (arg0.field838 != null ? arg0.field838.getOpcode() : -1) + class582.field5306 + (arg0.field839 != null ? arg0.field839.getOpcode() : -1) + " " + arg0.field829, new RuntimeException());
               method5519(false);
               return true;
            }
         } else {
            if (class854.field8745 && Statics.field688 != null) {
               method10176(Statics.field9361.field967.method2066(), -1, -1, false);
            }

            byte[] var583 = new byte[arg0.field829 - 1];
            boolean var584 = var2.method1688() == 1;
            var2.method3388(var583, 0, arg0.field829 - 1);
            class124 var585 = new class124(var583);
            String var586 = var585.method1599();
            if (var584) {
               String var587 = var585.method1599();
               if (var587.length() == 0) {
                  var587 = var586;
               }

               if (!field2390 || Statics.field6120.startsWith("mac") || !class689.method7945(var586, 1, class573.field5188.method7988())) {
                  class689.method690(var587, true, Statics.field9361.field974.method2236() == 5, field2643, field2403);
               }
            } else {
               class689.method690(var586, true, Statics.field9361.field974.method2236() == 5, field2643, field2403);
            }

            arg0.field826 = null;
            return true;
         }
      }
   }

   @deob.ObfuscatedName("ti.iw(Lij;I)V")
   private static final void method14681(class530 arg0) {
      class251 var1 = field2463.field835;
      if (class530.field4173 == arg0) {
         int var2 = var1.method1628();
         int var3 = var1.method1628();
         int var4 = var1.method1579();
         class723 var5 = field2468.method9649();
         int var6 = (var4 & 7) + Statics.field1371;
         int var7 = var5.field6677 + var6;
         int var8 = (var4 >> 4 & 7) + Statics.field6081;
         int var9 = var5.field6676 + var8;
         boolean var10 = var8 >= 0 && var6 >= 0 && var8 < field2468.method9648() && var6 < field2468.method9604();
         if (var10 || field2468.method9626().method9496()) {
            method10177(Statics.field9623, var9, var7, new class62(var3, var2));
            if (var10) {
               method10932(Statics.field9623, var8, var6);
            }
         }

      } else if (class530.field4177 == arg0) {
         int var11 = var1.method1640();
         int var12 = var1.method1778();
         int var13 = (var12 >> 4 & 7) + Statics.field6081;
         int var14 = (var12 & 7) + Statics.field1371;
         int var15 = var1.method1619();
         int var16 = var15 >> 2;
         int var17 = var15 & 3;
         int var18 = field2474[var16];
         if (field2468.method9626().method9496() || var13 >= 0 && var14 >= 0 && var13 < field2468.method9648() && var14 < field2468.method9604()) {
            class75.method14184(Statics.field9623, var13, var14, var18, var11, var16, var17);
         }

      } else if (class530.field4171 == arg0) {
         int var19 = var1.method1688();
         int var20 = (var19 >> 4 & 7) + Statics.field6081;
         int var21 = (var19 & 7) + Statics.field1371;
         int var22 = var1.method1587();
         if (var22 == 65535) {
            var22 = -1;
         }

         int var23 = var1.method1688();
         int var24 = var23 >> 4 & 15;
         int var25 = var23 & 7;
         int var26 = var1.method1688();
         int var27 = var1.method1688();
         int var28 = var1.method1587();
         boolean var29 = var1.method1688() == 1;
         if (field2468.method9626() != class657.field5993) {
            if (var20 >= 0 && var21 >= 0 && var20 < field2468.method9648() && var21 < field2468.method9604()) {
               int var30 = var24 + 1;
               if (Statics.field5701.field16[0] >= var20 - var30 && Statics.field5701.field16[0] <= var20 + var30 && Statics.field5701.field62[0] >= var21 - var30 && Statics.field5701.field62[0] <= var21 + var30) {
                  class677.method8892(var22, var25, var26, var27, (var21 << 8) + (Statics.field9623 << 24) + (var20 << 16) + var24, var29, var28);
               }
            }

         }
      } else if (class530.field4183 == arg0) {
         int var31 = var1.method1688();
         int var32 = (var31 >> 4 & 7) + Statics.field6081;
         int var33 = (var31 & 7) + Statics.field1371;
         int var34 = var1.method1587();
         if (var34 == 65535) {
            var34 = -1;
         }

         int var35 = var1.method1587();
         int var36 = var1.method1587();
         int var37 = var1.method1688();
         int var38 = var1.method1723();
         if (field2468.method9626() != class657.field5993) {
            if (var32 >= 0 && var33 >= 0 && var32 < field2468.method9648() && var33 < field2468.method9604()) {
               if (var34 == -1) {
                  class244 var39 = (class244)field2494.method15322((long)(var32 << 16 | var33));
                  if (var39 != null) {
                     var39.field1624.method3885();
                     var39.method9864();
                  }
               } else {
                  int var40 = var32 * 512 + 256;
                  int var41 = var33 * 512 + 256;
                  int var42 = Statics.field9623;
                  if (var42 < 3 && field2468.method9592().method8746(var32, var33)) {
                     ++var42;
                  }

                  class301 var43 = new class301(field2468.method9639(), var34, var36, Statics.field9623, var42, var40, method5777(var40, var41, Statics.field9623) - var35, var41, var32, var32, var33, var33, var37, false, var38);
                  field2494.method15311(new class244(var43), (long)(var32 << 16 | var33));
               }
            }

         }
      } else if (class530.field4181 == arg0) {
         int var44 = var1.method1628();
         int var45 = var1.method1778();
         class723 var46 = field2468.method9649();
         int var47 = (var45 & 7) + Statics.field1371;
         int var48 = var46.field6677 + var47;
         int var49 = (var45 >> 4 & 7) + Statics.field6081;
         int var50 = var46.field6676 + var49;
         class79 var51 = (class79)field2576.method15322((long)(Statics.field9623 << 28 | var48 << 14 | var50));
         if (var51 != null) {
            for(class62 var52 = (class62)var51.field569.method14964(); var52 != null; var52 = (class62)var51.field569.method15006()) {
               if ((var44 & 32767) == var52.field442) {
                  var52.method9864();
                  break;
               }
            }

            if (var51.field569.method15024()) {
               var51.method9864();
            }

            if (var49 >= 0 && var47 >= 0 && var49 < field2468.method9648() && var47 < field2468.method9604()) {
               method10932(Statics.field9623, var49, var47);
            }
         }

      } else if (class530.field4182 == arg0) {
         var1.method1688();
         int var53 = var1.method1688();
         int var54 = (var53 >> 4 & 7) + Statics.field6081;
         int var55 = (var53 & 7) + Statics.field1371;
         int var56 = var1.method1587();
         int var57 = var1.method1688();
         int var58 = var1.method1589();
         String var59 = var1.method1599();
         if (field2468.method9626() != class657.field5993) {
            method9707(Statics.field9623, var54, var55, var57, var56, var58, var59);
         }
      } else if (class530.field4176 == arg0) {
         int var60 = var1.method1688();
         boolean var61 = (var60 & 128) != 0;
         int var62 = (var60 >> 3 & 7) + Statics.field6081;
         int var63 = (var60 & 7) + Statics.field1371;
         int var64 = var62 + var1.method1623();
         int var65 = var63 + var1.method1623();
         int var66 = var1.method1723();
         int var67 = var1.method1587();
         int var68 = var1.method1688() * 4;
         int var69 = var1.method1688() * 4;
         int var70 = var1.method1587();
         int var71 = var1.method1587();
         int var72 = var1.method1688();
         int var73 = var1.method1587();
         int var74 = var1.method1723();
         if (var72 == 255) {
            var72 = -1;
         }

         if (field2468.method9626() != class657.field5993) {
            if (var62 >= 0 && var63 >= 0 && var62 < field2468.method9648() && var63 < field2468.method9604() && var64 >= 0 && var65 >= 0 && var64 < field2468.method9648() && var65 < field2468.method9604() && var67 != 65535) {
               int var75 = var62 * 512 + 256;
               int var76 = var63 * 512 + 256;
               int var77 = var64 * 512 + 256;
               int var78 = var65 * 512 + 256;
               int var79 = var68 << 2;
               int var80 = var69 << 2;
               int var81 = var73 << 2;
               class312 var82 = new class312(field2468.method9639(), var67, Statics.field9623, Statics.field9623, var75, var76, var79, field2418 + var70, field2418 + var71, var72, var81, 0, var66, var80, var61, -1, var74);
               var82.method3914(var77, var78, method5777(var77, var78, Statics.field9623) - var80, field2418 + var70);
               field2577.method14959(new class246(var82));
            }

         }
      } else if (class530.field4175 == arg0) {
         int var83 = var1.method1639();
         int var84 = var1.method1778();
         int var85 = var84 >> 2;
         int var86 = var84 & 3;
         int var87 = field2474[var85];
         int var88 = var1.method1688();
         int var89 = (var88 >> 4 & 7) + Statics.field6081;
         int var90 = (var88 & 7) + Statics.field1371;
         if (field2468.method9626() != class657.field5993) {
            method8761(Statics.field9623, var89, var90, var87, var85, var86, var83);
         }
      } else if (class530.field4174 == arg0) {
         int var91 = var1.method1628();
         int var92 = var1.method1619();
         class723 var93 = field2468.method9649();
         int var94 = (var92 & 7) + Statics.field1371;
         int var95 = var93.field6677 + var94;
         int var96 = (var92 >> 4 & 7) + Statics.field6081;
         int var97 = var93.field6676 + var96;
         int var98 = var1.method1628();
         int var99 = var1.method1587();
         if (field2452 != var98) {
            boolean var100 = var96 >= 0 && var94 >= 0 && var96 < field2468.method9648() && var94 < field2468.method9604();
            if (var100 || field2468.method9626().method9496()) {
               method10177(Statics.field9623, var97, var95, new class62(var99, var91));
               if (var100) {
                  method10932(Statics.field9623, var96, var94);
               }
            }
         }

      } else if (class530.field4179 == arg0) {
         int var101 = var1.method1688();
         int var102 = (var101 >> 4 & 7) + Statics.field6081;
         int var103 = (var101 & 7) + Statics.field1371;
         int var104 = var1.method1587();
         if (var104 == 65535) {
            var104 = -1;
         }

         int var105 = var1.method1688();
         int var106 = var105 >> 4 & 15;
         int var107 = var105 & 7;
         int var108 = var1.method1688();
         int var109 = var1.method1688();
         int var110 = var1.method1587();
         if (field2468.method9626() != class657.field5993) {
            if (var102 >= 0 && var103 >= 0 && var102 < field2468.method9648() && var103 < field2468.method9604()) {
               int var111 = var106 + 1;
               if (Statics.field5701.field16[0] >= var102 - var111 && Statics.field5701.field16[0] <= var102 + var111 && Statics.field5701.field62[0] >= var103 - var111 && Statics.field5701.field62[0] <= var103 + var111) {
                  class677.method11674(var104, var107, var108, var109, (var103 << 8) + (Statics.field9623 << 24) + (var102 << 16) + var106, var110);
               }
            }

         }
      } else if (class530.field4172 == arg0) {
         int var112 = var1.method1579();
         int var113 = (var112 >> 4 & 7) + Statics.field6081;
         int var114 = (var112 & 7) + Statics.field1371;
         int var115 = var1.method1619();
         int var116 = var115 >> 2;
         int var117 = var115 & 3;
         int var118 = field2474[var116];
         if (field2468.method9626().method9496() || var113 >= 0 && var114 >= 0 && var113 < field2468.method9648() && var114 < field2468.method9604()) {
            class75.method14184(Statics.field9623, var113, var114, var118, -1, var116, var117);
         }

      } else if (class530.field4178 == arg0) {
         int var119 = var1.method1688();
         int var120 = (var119 >> 4 & 15) + Statics.field6081 * 2;
         int var121 = (var119 & 15) + Statics.field1371 * 2;
         int var122 = var1.method1688();
         boolean var123 = (var122 & 1) != 0;
         boolean var124 = (var122 & 2) != 0;
         int var125 = var124 ? var122 >> 2 : -1;
         int var126 = var120 + var1.method1623();
         int var127 = var121 + var1.method1623();
         int var128 = var1.method1723();
         int var129 = var1.method1723();
         int var130 = var1.method1587();
         int var131 = var1.method1688();
         int var132;
         if (var124) {
            var132 = (byte)var131;
         } else {
            var132 = var131 * 4;
         }

         int var133 = var1.method1688() * 4;
         int var134 = var1.method1587();
         int var135 = var1.method1587();
         int var136 = var1.method1688();
         int var137 = var1.method1587();
         if (var136 == 255) {
            var136 = -1;
         }

         int var138 = var1.method1723();
         if (field2468.method9626() != class657.field5993) {
            if (var120 >= 0 && var121 >= 0 && var120 < field2468.method9648() * 2 && var121 < field2468.method9648() * 2 && var126 >= 0 && var127 >= 0 && var126 < field2468.method9604() * 2 && var127 < field2468.method9604() * 2 && var130 != 65535) {
               int var139 = var120 * 256;
               int var140 = var121 * 256;
               int var141 = var126 * 256;
               int var142 = var127 * 256;
               int var143 = var132 << 2;
               int var144 = var133 << 2;
               int var145 = var137 << 2;
               method15707(var130, var128, var129, var125, var143, var144, var139, var140, var141, var142, var134, var135, var136, var145, var123, var138);
            }

         }
      } else if (class530.field4185 == arg0) {
         int var146 = var1.method1688();
         class723 var147 = field2468.method9649();
         int var148 = (var146 & 7) + Statics.field1371;
         int var149 = var147.field6677 + var148;
         int var150 = (var146 >> 4 & 7) + Statics.field6081;
         int var151 = var147.field6676 + var150;
         int var152 = var1.method1587();
         int var153 = var1.method1587();
         int var154 = var1.method1587();
         if (field2576 != null) {
            class79 var155 = (class79)field2576.method15322((long)(Statics.field9623 << 28 | var149 << 14 | var151));
            if (var155 != null) {
               for(class62 var156 = (class62)var155.field569.method14964(); var156 != null; var156 = (class62)var155.field569.method15006()) {
                  if ((var152 & 32767) == var156.field442 && var156.field443 == var153) {
                     var156.method9864();
                     var156.field443 = var154;
                     method10177(Statics.field9623, var151, var149, var156);
                     break;
                  }
               }

               if (var150 >= 0 && var148 >= 0 && var150 < field2468.method9648() && var148 < field2468.method9604()) {
                  method10932(Statics.field9623, var150, var148);
               }
            }
         }

      } else if (class530.field4184 == arg0) {
         int var157 = var1.method1778();
         int var158 = var157 >> 2;
         int var159 = field2474[var158];
         int var160 = var1.method1778();
         int var161 = var1.method1640();
         class843 var162 = field2468.method9636().method14651(var161);
         int var163 = var1.method1778();
         int var164 = (var163 >> 4 & 7) + Statics.field6081;
         int var165 = (var163 & 7) + Statics.field1371;
         if (class850.field8734.field8736 == var158) {
            var158 = class850.field8733.field8736;
         }

         int var166 = 0;
         if (var162.field8571 != null) {
            int var167 = -1;

            for(int var168 = 0; var168 < var162.field8571.length; ++var168) {
               if (var162.field8571[var168] == var158) {
                  var167 = var168;
                  break;
               }
            }

            var166 = var162.field8628[var167].length;
         }

         int var169 = 0;
         if (var162.field8575 != null) {
            var169 = var162.field8575.length;
         }

         int var170 = 0;
         if (var162.field8604 != null) {
            var170 = var162.field8604.length;
         }

         if ((var160 & 1) == 1) {
            class75.method15758(Statics.field9623, var164, var165, var159, var161, var158, (class832)null);
         } else {
            int[] var171 = null;
            if ((var160 & 2) == 2) {
               var171 = new int[var166];

               for(int var172 = 0; var172 < var166; ++var172) {
                  var171[var172] = var1.method1591();
               }
            }

            short[] var173 = null;
            if ((var160 & 4) == 4) {
               var173 = new short[var169];

               for(int var174 = 0; var174 < var169; ++var174) {
                  var173[var174] = (short)var1.method1587();
               }
            }

            short[] var175 = null;
            if ((var160 & 8) == 8) {
               var175 = new short[var170];

               for(int var176 = 0; var176 < var170; ++var176) {
                  var175[var176] = (short)var1.method1587();
               }
            }

            class75.method15758(Statics.field9623, var164, var165, var159, var161, var158, new class832(class75.field549, var171, var173, var175));
            ++class75.field549;
         }

      } else if (class530.field4180 == arg0) {
         int var177 = var1.method1591();
         int var178 = var1.method1688();
         field2468.method9636().method14651(var177).method14848(var178);
      } else {
         class285.method15864("" + arg0, new RuntimeException());
         method5519(false);
      }
   }

   @deob.ObfuscatedName("oe.ic(IIILacf;I)V")
   private static void method10177(int arg0, int arg1, int arg2, class62 arg3) {
      long var4 = (long)(arg0 << 28 | arg2 << 14 | arg1);
      class79 var6 = (class79)field2576.method15322(var4);
      if (var6 == null) {
         class79 var7 = new class79();
         field2576.method15311(var7, var4);
         var7.field569.method14959(arg3);
      } else {
         class899 var8 = Statics.field4196.method15540(arg3.field442);
         int var9 = var8.field9176;
         if (var8.field9164 == 1) {
            var9 = (arg3.field443 + 1) * var9;
         }

         for(class62 var10 = (class62)var6.field569.method14964(); var10 != null; var10 = (class62)var6.field569.method15006()) {
            class899 var11 = Statics.field4196.method15540(var10.field442);
            int var12 = var11.field9176;
            if (var11.field9164 == 1) {
               var12 = (var10.field443 + 1) * var12;
            }

            if (var9 > var12) {
               class849.method10638(arg3, var10);
               return;
            }
         }

         var6.field569.method14959(arg3);
      }
   }

   @deob.ObfuscatedName("pv.ig(IIII)V")
   public static void method10932(int arg0, int arg1, int arg2) {
      class723 var3 = field2468.method9649();
      int var4 = var3.field6676 + arg1;
      int var5 = var3.field6677 + arg2;
      if (field2468.method9639() != null && field2468.method9626() != class657.field5993 && arg1 >= 0 && arg2 >= 0 && arg1 < field2468.method9648() && arg2 < field2468.method9604()) {
         long var6 = (long)(arg0 << 28 | var5 << 14 | var4);
         class79 var8 = (class79)field2576.method15322(var6);
         if (var8 == null) {
            field2468.method9639().method10506(arg0, arg1, arg2);
         } else {
            class62 var9 = (class62)var8.field569.method14964();
            if (var9 == null) {
               field2468.method9639().method10506(arg0, arg1, arg2);
            } else {
               class309 var10 = (class309)field2468.method9639().method10506(arg0, arg1, arg2);
               if (var10 == null) {
                  var10 = new class309(field2468.method9639(), arg1 << 265, field2468.method9639().field6580[arg0].method15966(arg1, arg2), arg2 << 265, arg0, arg0);
               } else {
                  var10.field1932 = -1;
                  var10.field1933 = -1;
                  var10.field1033 = field2468.method9639();
               }

               var10.field1929 = var9.field442;
               var10.field1931 = var9.field443;

               label53:
               while(true) {
                  class62 var12 = (class62)var8.field569.method15006();
                  if (var12 == null) {
                     break;
                  }

                  if (var10.field1929 != var12.field442) {
                     var10.field1933 = var12.field442;
                     var10.field1928 = var12.field443;

                     while(true) {
                        class62 var13 = (class62)var8.field569.method15006();
                        if (var13 == null) {
                           break label53;
                        }

                        if (var10.field1929 != var13.field442 && var10.field1933 != var13.field442) {
                           var10.field1932 = var13.field442;
                           var10.field1930 = var13.field443;
                        }
                     }
                  }
               }

               int var14 = method5777((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
               var10.method11608((float)(arg1 << 265), (float)var14, (float)(arg2 << 265));
               var10.field1927 = 0;
               var10.field1032 = (byte)arg0;
               var10.field1034 = (byte)arg0;
               if (field2468.method9592().method8746(arg1, arg2)) {
                  ++var10.field1034;
               }

               field2468.method9639().method10518(arg0, arg1, arg2, var14, var10);
            }
         }
      }
   }

   @deob.ObfuscatedName("cx.ih(ZB)V")
   private static final void method5211(boolean arg0) {
      field2540 = 0;
      field2457 = 0;
      ++field2459;
      method4109();
      method9266(arg0);
      method15505();
      boolean var1 = false;

      for(int var2 = 0; var2 < field2540; ++var2) {
         int var3 = field2568[var2];
         class106 var4 = (class106)field2615.method15322((long)var3);
         class200 var5 = (class200)var4.field807;
         if (field2459 != var5.field42) {
            if (class987.field10492 && class987.method11208(var3)) {
               class987.method11730();
            }

            if (var5.field1312.method15780()) {
               class98.method3956(var5);
            }

            var5.method2811((class915)null);
            var4.method9864();
            var1 = true;
         }
      }

      if (var1) {
         int var6 = field2492;
         field2492 = field2615.method15321();
         int var7 = 0;
         Iterator var8 = field2615.iterator();

         while(var8.hasNext()) {
            class106 var9 = (class106)var8.next();
            field2453[var7++] = var9;
         }

         for(int var10 = field2492; var10 < var6; ++var10) {
            field2453[var10] = null;
         }
      }

      if (field2463.field829 != field2463.field835.field935) {
         throw new RuntimeException(field2463.field835.field935 + " " + field2463.field829);
      } else {
         for(int var11 = 0; var11 < field2455; ++var11) {
            if (field2615.method15322((long)field2456[var11]) == null) {
               throw new RuntimeException(var11 + " " + field2455);
            }
         }

         if (field2492 - field2455 != 0) {
            throw new RuntimeException("" + (field2492 - field2455));
         } else {
            for(int var12 = 0; var12 < field2492; ++var12) {
               if (field2459 != ((class4)field2453[var12].field807).field42) {
                  throw new RuntimeException("" + ((class4)field2453[var12].field807).field12);
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("b.iz(I)V")
   private static final void method4109() {
      class251 var0 = field2463.field835;
      var0.method3389();
      int var1 = var0.method3394(8);
      if (var1 < field2455) {
         for(int var2 = var1; var2 < field2455; ++var2) {
            field2568[++field2540 - 1] = field2456[var2];
         }
      }

      if (var1 > field2455) {
         throw new RuntimeException();
      } else {
         field2455 = 0;

         for(int var3 = 0; var3 < var1; ++var3) {
            int var4 = field2456[var3];
            class200 var5 = (class200)((class106)field2615.method15322((long)var4)).field807;
            int var6 = var0.method3394(1);
            if (var6 == 0) {
               field2456[++field2455 - 1] = var4;
               var5.field42 = field2459;
            } else {
               int var7 = var0.method3394(2);
               if (var7 == 0) {
                  field2456[++field2455 - 1] = var4;
                  var5.field42 = field2459;
                  field2612[++field2457 - 1] = var4;
               } else if (var7 == 1) {
                  field2456[++field2455 - 1] = var4;
                  var5.field42 = field2459;
                  class661 var8 = (class661)class814.method4102(class661.method7335(), var0.method3394(3));
                  var5.method2803(var8, class647.field5875.field5871);
                  int var9 = var0.method3394(1);
                  if (var9 == 1) {
                     field2612[++field2457 - 1] = var4;
                  }
               } else if (var7 == 2) {
                  field2456[++field2455 - 1] = var4;
                  var5.field42 = field2459;
                  if (var0.method3394(1) == 1) {
                     class661 var10 = (class661)class814.method4102(class661.method7335(), var0.method3394(3));
                     var5.method2803(var10, class647.field5874.field5871);
                     class661 var11 = (class661)class814.method4102(class661.method7335(), var0.method3394(3));
                     var5.method2803(var11, class647.field5874.field5871);
                  } else {
                     class661 var12 = (class661)class814.method4102(class661.method7335(), var0.method3394(3));
                     var5.method2803(var12, class647.field5872.field5871);
                  }

                  int var13 = var0.method3394(1);
                  if (var13 == 1) {
                     field2612[++field2457 - 1] = var4;
                  }
               } else if (var7 == 3) {
                  field2568[++field2540 - 1] = var4;
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("mf.il(ZI)V")
   private static final void method9266(boolean arg0) {
      class251 var1 = field2463.field835;

      while(var1.method3390(field2463.field829) >= 15) {
         int var2 = var1.method3394(15);
         if (var2 == 32767) {
            break;
         }

         boolean var3 = false;
         class106 var4 = (class106)field2615.method15322((long)var2);
         if (var4 == null) {
            class200 var5 = new class200(field2468.method9639());
            var5.field12 = var2;
            var4 = new class106(var5);
            field2615.method15311(var4, (long)var2);
            field2453[++field2492 - 1] = var4;
            var3 = true;
         }

         class200 var6 = (class200)var4.field807;
         field2456[++field2455 - 1] = var2;
         var6.field42 = field2459;
         if (var6.field1312 != null && var6.field1312.method15780()) {
            class98.method3956(var6);
         }

         int var7 = var1.method3394(1);
         int var8 = var1.method3394(2);
         int var9 = var1.method3394(1);
         if (var9 == 1) {
            field2612[++field2457 - 1] = var2;
         }

         int var10 = var1.method3394(3) + 4 << 11 & 16383;
         int var11;
         if (arg0) {
            var11 = var1.method3394(8);
            if (var11 > 127) {
               var11 -= 256;
            }
         } else {
            var11 = var1.method3394(5);
            if (var11 > 15) {
               var11 -= 32;
            }
         }

         int var12;
         if (arg0) {
            var12 = var1.method3394(8);
            if (var12 > 127) {
               var12 -= 256;
            }
         } else {
            var12 = var1.method3394(5);
            if (var12 > 15) {
               var12 -= 32;
            }
         }

         var6.method2811(Statics.field93.method15857(var1.method3394(15)));
         var6.method95(var6.field1312.field9328);
         var6.field67 = var6.field1312.field9306 << 3;
         if (var3) {
            var6.method117(var10, true);
         }

         var6.method2805(var8, Statics.field5701.field16[0] + var11, Statics.field5701.field62[0] + var12, var7 == 1, var6.method96());
         if (var6.field1312.method15780()) {
            class98.method7934(var6.field1032, var6.field16[0], var6.field62[0], 0, (class843)null, var6, (class211)null);
         }
      }

      var1.method3391();
   }

   @deob.ObfuscatedName("vk.is(I)V")
   private static final void method15505() {
      class251 var0 = field2463.field835;

      for(int var1 = 0; var1 < field2457; ++var1) {
         int var2 = field2612[var1];
         class200 var3 = (class200)((class106)field2615.method15322((long)var2)).field807;
         int var4 = var0.method1688();
         if ((var4 & 4) != 0) {
            var4 += var0.method1688() << 8;
         }

         if ((var4 & 1024) != 0) {
            var4 += var0.method1688() << 16;
         }

         if ((var4 & 131072) != 0) {
            var4 += var0.method1688() << 24;
         }

         if ((var4 & 64) != 0) {
            int var5 = var0.method1780();
            int var6 = var0.method1640();
            if (var5 == 65535) {
               var5 = -1;
            }

            int var7 = var0.method1619();
            int var8 = var7 & 7;
            int var9 = var7 >> 3 & 15;
            if (var9 == 15) {
               var9 = -1;
            }

            boolean var10 = (var7 >> 7 & 1) == 1;
            var3.method89(var5, var6, var8, var9, var10, 0);
         }

         if ((var4 & 32768) != 0) {
            var3.field69 = var0.method1730();
            var3.field73 = var0.method1730();
            var3.field39 = var0.method1623();
            var3.field10 = var0.method1622();
            var3.field40 = var0.method1628() + field2418;
            var3.field43 = var0.method1587() + field2418;
            var3.field44 = var0.method1780();
            var3.field69 += var3.field16[0];
            var3.field73 += var3.field62[0];
            var3.field39 += var3.field16[0];
            var3.field10 += var3.field62[0];
            var3.field60 = 1;
            var3.field65 = 0;
         }

         if ((var4 & 16384) != 0) {
            int var11 = var0.method1619();
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];

            for(int var14 = 0; var14 < var11; ++var14) {
               int var15 = var0.method1629();
               if ((var15 & 49152) == 49152) {
                  int var16 = var0.method1780();
                  var12[var14] = var15 << 16 | var16;
               } else {
                  var12[var14] = var15;
               }

               var13[var14] = var0.method1628();
            }

            var3.method177(var12, var13);
         }

         if ((var4 & 512) != 0) {
            int var17 = var0.method1587();
            int var18 = var0.method1639();
            if (var17 == 65535) {
               var17 = -1;
            }

            int var19 = var0.method1579();
            int var20 = var19 & 7;
            int var21 = var19 >> 3 & 15;
            if (var21 == 15) {
               var21 = -1;
            }

            boolean var22 = (var19 >> 7 & 1) == 1;
            var3.method89(var17, var18, var20, var21, var22, 1);
         }

         if ((var4 & 16) != 0) {
            var3.method2795(var0.method1599(), 0, 0);
         }

         if ((var4 & 8192) != 0) {
            int var23 = var3.field1312.field9324.length;
            int var24 = 0;
            if (var3.field1312.field9289 != null) {
               var24 = var3.field1312.field9289.length;
            }

            int var25 = 0;
            if (var3.field1312.field9292 != null) {
               var25 = var3.field1312.field9292.length;
            }

            int var26 = var0.method1778();
            if ((var26 & 1) == 1) {
               var3.field1300 = null;
            } else {
               int[] var27 = null;
               if ((var26 & 2) == 2) {
                  var27 = new int[var23];

                  for(int var28 = 0; var28 < var23; ++var28) {
                     var27[var28] = var0.method1608();
                  }
               }

               short[] var29 = null;
               if ((var26 & 4) == 4) {
                  var29 = new short[var24];

                  for(int var30 = 0; var30 < var24; ++var30) {
                     var29[var30] = (short)var0.method1587();
                  }
               }

               short[] var31 = null;
               if ((var26 & 8) == 8) {
                  var31 = new short[var25];

                  for(int var32 = 0; var32 < var25; ++var32) {
                     var31[var32] = (short)var0.method1629();
                  }
               }

               long var33 = (long)(++class200.field1301 - 1);
               var3.field1300 = new class921(var33, var27, var29, var31);
            }
         }

         if ((var4 & 1) != 0) {
            int[] var35 = new int[class647.method15598().length];

            for(int var36 = 0; var36 < class647.method15598().length; ++var36) {
               var35[var36] = var0.method1608();
            }

            int var37 = var0.method1688();
            method2051(var3, var35, var37, true);
         }

         if ((var4 & 33554432) != 0) {
            int var38 = var0.method1629();
            int var39 = var0.method1591();
            if (var38 == 65535) {
               var38 = -1;
            }

            int var40 = var0.method1778();
            int var41 = var40 & 7;
            int var42 = var40 >> 3 & 15;
            if (var42 == 15) {
               var42 = -1;
            }

            boolean var43 = (var40 >> 7 & 1) == 1;
            var3.method89(var38, var39, var41, var42, var43, 2);
         }

         if ((var4 & 524288) != 0) {
            var3.field47 = var0.method1730();
            var3.field48 = var0.method1730();
            var3.field22 = var0.method1622();
            var3.field50 = (byte)var0.method1619();
            var3.field45 = field2418 + var0.method1587();
            var3.field46 = field2418 + var0.method1587();
         }

         if ((var4 & 8) != 0) {
            int var44 = var0.method1778();
            if (var44 > 0) {
               for(int var45 = 0; var45 < var44; ++var45) {
                  int var46 = -1;
                  boolean var47 = true;
                  int var48 = -1;
                  int var49 = var0.method1604();
                  int var50;
                  if (var49 == 32767) {
                     var49 = var0.method1604();
                     var50 = var0.method1604();
                     var46 = var0.method1604();
                     var48 = var0.method1604();
                  } else if (var49 != 32766) {
                     var50 = var0.method1604();
                  } else {
                     var49 = -1;
                     var50 = var0.method1688();
                  }

                  int var51 = var0.method1604();
                  var3.method91(var49, var50, var46, var48, field2418, var51);
               }
            }

            int var52 = var0.method1579();
            if (var52 > 0) {
               for(int var53 = 0; var53 < var52; ++var53) {
                  int var54 = var0.method1604();
                  int var55 = var0.method1604();
                  if (var55 != 32767) {
                     int var56 = var0.method1604();
                     int var57 = var0.method1619();
                     int var58 = var55 > 0 ? var0.method1579() : var57;
                     var3.method83(var54, field2418, var55, var56, var57, var58);
                  } else {
                     var3.method93(var54);
                  }
               }
            }
         }

         if ((var4 & 1048576) != 0) {
            int var59 = var0.field931[++var0.field935 - 1] & 255;

            for(int var60 = 0; var60 < var59; ++var60) {
               int var61 = var0.method1780();
               int var62 = var0.method1611();
               var3.field1306.method4446(var61, var62);
            }
         }

         if ((var4 & 4096) != 0) {
            int var63 = var0.method1619();
            int[] var64 = new int[var63];
            int[] var65 = new int[var63];
            int[] var66 = new int[var63];

            for(int var67 = 0; var67 < var63; ++var67) {
               int var68 = var0.method1608();
               var64[var67] = var68;
               var65[var67] = var0.method1688();
               var66[var67] = var0.method1628();
            }

            method11048(var3, var64, var65, var66);
         }

         if ((var4 & 2) != 0) {
            var3.field1305 = var0.method1628();
            var3.field1299 = var0.method1629();
         }

         if ((var4 & 65536) != 0) {
            int var69 = var3.field1312.field9298.length;
            int var70 = 0;
            if (var3.field1312.field9289 != null) {
               var70 = var3.field1312.field9289.length;
            }

            byte var71 = 0;
            if (var3.field1312.field9292 != null) {
               var70 = var3.field1312.field9292.length;
            }

            int var72 = var0.method1778();
            if ((var72 & 1) != 1) {
               int[] var73 = null;
               if ((var72 & 2) == 2) {
                  var73 = new int[var69];

                  for(int var74 = 0; var74 < var69; ++var74) {
                     var73[var74] = var0.method1608();
                  }
               }

               short[] var75 = null;
               if ((var72 & 4) == 4) {
                  var75 = new short[var70];

                  for(int var76 = 0; var76 < var70; ++var76) {
                     var75[var76] = (short)var0.method1629();
                  }
               }

               short[] var77 = null;
               if ((var72 & 8) == 8) {
                  var77 = new short[var71];

                  for(int var78 = 0; var78 < var71; ++var78) {
                     var77[var78] = (short)var0.method1587();
                  }
               }

               long var79 = (long)(++class200.field1297 - 1);
               new class921(var79, var73, var75, var77);
            }
         }

         if ((var4 & 256) != 0) {
            var3.field1298 = var0.method1628();
            if (var3.field1298 == 65535) {
               var3.field1298 = -1;
            }
         }

         if ((var4 & 2097152) != 0) {
            int var81 = var0.field931[++var0.field935 - 1] & 255;

            for(int var82 = 0; var82 < var81; ++var82) {
               int var83 = var0.method1778();
               int var84 = var0.method1591();
               int var85 = var0.method1634();
               var3.method2790(var83, var84, var85);
            }
         }

         if ((var4 & 16777216) != 0) {
            int var86 = var0.method1628();
            int var87 = var0.method1640();
            if (var86 == 65535) {
               var86 = -1;
            }

            int var88 = var0.method1688();
            int var89 = var88 & 7;
            int var90 = var88 >> 3 & 15;
            if (var90 == 15) {
               var90 = -1;
            }

            boolean var91 = (var88 >> 7 & 1) == 1;
            var3.method89(var86, var87, var89, var90, var91, 3);
         }

         if ((var4 & 128) != 0) {
            if (var3.field1312.method15780()) {
               class98.method3956(var3);
            }

            var3.method2811(Statics.field93.method15857(var0.method1608()));
            var3.method95(var3.field1312.field9328);
            var3.field67 = var3.field1312.field9306 << 3;
            if (var3.field1312.method15780()) {
               class98.method7934(var3.field1032, var3.field16[0], var3.field62[0], 0, (class843)null, var3, (class211)null);
            }
         }

         if ((var4 & 8388608) != 0) {
            var3.field1304 = var0.method1587();
            if (var3.field1304 == 65535) {
               var3.field1304 = var3.field1312.field9303;
            }
         }

         if ((var4 & 4194304) != 0) {
            var3.field1306.method4445();
            int var92 = var0.field931[++var0.field935 - 1] & 255;

            for(int var93 = 0; var93 < var92; ++var93) {
               int var94 = var0.method1629();
               int var95 = var0.method1611();
               var3.field1306.method4446(var94, var95);
            }
         }

         if ((var4 & 32) != 0) {
            var3.field34 = var0.method1587();
            if (var3.field34 == 65535) {
               var3.field34 = -1;
            }
         }

         if ((var4 & 262144) != 0) {
            var3.field1302 = var0.method1599();
            if ("".equals(var3.field1302) || var3.field1302.equals(var3.field1312.field9282)) {
               var3.field1302 = var3.field1312.field9282;
            }
         }
      }

   }

   @deob.ObfuscatedName("af.iq(Laab;[IIZI)V")
   public static void method2051(class4 arg0, int[] arg1, int arg2, boolean arg3) {
      if (arg0.field41 != null) {
         boolean var4 = true;

         for(int var5 = 0; var5 < arg0.field41.length; ++var5) {
            if (arg0.field41[var5] != arg1[var5]) {
               var4 = false;
               break;
            }
         }

         class836 var6 = arg0.field38;
         if (var4 && var6.method14691()) {
            class806 var7 = arg0.field38.method14698();
            int var8 = var7.field8370;
            if (var8 == 1) {
               var6.method14710(arg2);
            }

            if (var8 == 2) {
               var6.method14737();
            }
         }
      }

      boolean var9 = true;

      for(int var10 = 0; var10 < arg1.length; ++var10) {
         if (arg1[var10] != -1) {
            var9 = false;
         }

         if (arg0.field41 == null || arg0.field41[var10] == -1 || Statics.field2046.method14475(arg1[var10]).field8365 >= Statics.field2046.method14475(arg0.field41[var10]).field8365) {
            arg0.field41 = arg1;
            arg0.field38.method14702(arg2);
            if (arg3) {
               arg0.field65 = arg0.field60;
            }
         }
      }

      if (var9) {
         arg0.field41 = arg1;
         arg0.field38.method14702(arg2);
         if (arg3) {
            arg0.field65 = arg0.field60;
         }
      }

   }

   @deob.ObfuscatedName("lb.iu(IIIIIIIB)V")
   public static void method8761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (arg1 >= 0 && arg2 >= 0 && arg1 < field2468.method9648() - 1 && arg2 < field2468.method9604() - 1) {
         if (field2468.method9639() == null) {
            return;
         }

         if (arg3 == 0) {
            class376 var7 = (class376)field2468.method9639().method10510(arg0, arg1, arg2);
            class376 var8 = (class376)field2468.method9639().method10491(arg0, arg1, arg2);
            if (var7 != null && arg4 != 2) {
               if (var7 instanceof class965) {
                  ((class965)var7).field9636.method4485(arg6);
               } else {
                  class75.method11661(arg0, arg3, arg1, arg2, var7.method5093(), arg5, arg4, arg6);
               }
            }

            if (var8 != null) {
               if (var8 instanceof class965) {
                  ((class965)var8).field9636.method4485(arg6);
               } else {
                  class75.method11661(arg0, arg3, arg1, arg2, var8.method5093(), arg5, arg4, arg6);
               }
            }
         } else if (arg3 == 1) {
            class376 var9 = (class376)field2468.method9639().method10577(arg0, arg1, arg2);
            if (var9 != null) {
               if (var9 instanceof class968) {
                  ((class968)var9).field9661.method4485(arg6);
               } else {
                  int var10 = var9.method5093();
                  if (arg4 != 4 && arg4 != 5) {
                     if (arg4 == 6) {
                        class75.method11661(arg0, arg3, arg1, arg2, var10, arg5 + 4, 4, arg6);
                     } else if (arg4 == 7) {
                        class75.method11661(arg0, arg3, arg1, arg2, var10, (arg5 + 2 & 3) + 4, 4, arg6);
                     } else if (arg4 == 8) {
                        class75.method11661(arg0, arg3, arg1, arg2, var10, arg5 + 4, 4, arg6);
                        class75.method11661(arg0, arg3, arg1, arg2, var10, (arg5 + 2 & 3) + 4, 4, arg6);
                     }
                  } else {
                     class75.method11661(arg0, arg3, arg1, arg2, var10, arg5, 4, arg6);
                  }
               }
            }
         } else if (arg3 == 2) {
            class376 var11 = (class376)field2468.method9639().method10514(arg0, arg1, arg2, field2704);
            if (var11 != null) {
               if (arg4 == 11) {
                  arg4 = 10;
               }

               if (var11 instanceof class941) {
                  ((class941)var11).field9500.method4485(arg6);
               } else {
                  class75.method11661(arg0, arg3, arg1, arg2, var11.method5093(), arg5, arg4, arg6);
               }
            }
         } else if (arg3 == 3) {
            class376 var12 = (class376)field2468.method9639().method10516(arg0, arg1, arg2);
            if (var12 != null) {
               if (var12 instanceof class956) {
                  ((class956)var12).field9572.method4485(arg6);
               } else {
                  class75.method11661(arg0, arg3, arg1, arg2, var12.method5093(), arg5, arg4, arg6);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("pj.ie(IIIIB)V")
   public static final void method10741(int arg0, int arg1, int arg2, int arg3) {
      for(int var4 = 0; var4 < field2651; ++var4) {
         Rectangle var5 = field2655[var4];
         if (var5.x + var5.width > arg0 && var5.x < arg0 + arg2 && var5.y + var5.height > arg1 && var5.y < arg1 + arg3) {
            field2558[var4] = true;
         }
      }

   }

   @deob.ObfuscatedName("ri.im(ILjava/lang/String;B)V")
   public static void method11701(int arg0, String arg1) {
      int var2 = class324.field2053;
      int[] var3 = class324.field2057;
      boolean var4 = false;

      for(int var5 = 0; var5 < var2; ++var5) {
         class211 var6 = field2408[var3[var5]];
         if (var6 != null && Statics.field5701 != var6 && var6.field1381 != null && var6.field1381.equalsIgnoreCase(arg1)) {
            ClientPacket var7 = null;
            if (arg0 == 1) {
               var7 = ClientProt.OPPLAYER1;
            } else if (arg0 == 4) {
               var7 = ClientProt.OPPLAYER4;
            } else if (arg0 == 5) {
               var7 = ClientProt.OPPLAYER5;
            } else if (arg0 == 6) {
               var7 = ClientProt.OPPLAYER6;
            } else if (arg0 == 7) {
               var7 = ClientProt.OPPLAYER7;
            } else if (arg0 == 9) {
               var7 = ClientProt.OPPLAYER9;
            }

            if (var7 != null) {
               class109 var8 = class109.method15110(var7, field2463.field832);
               var8.field814.method1568(0);
               var8.field814.method1718(var3[var5]);
               field2463.method1408(var8);
            }

            var4 = true;
            break;
         }
      }

      if (!var4) {
         class419.method10919(4, class881.field9007.method15374(Statics.field243) + arg1);
      }

   }

   @deob.ObfuscatedName("gj.ij(Ljava/lang/String;I)V")
   public static void method6643(String arg0) {
      if (field2588 && (Statics.field9110 & 24) != 0) {
         boolean var1 = false;
         int var2 = class324.field2053;
         int[] var3 = class324.field2057;

         for(int var4 = 0; var4 < var2; ++var4) {
            class211 var5 = field2408[var3[var4]];
            if (var5.field1381 != null && var5.field1381.equalsIgnoreCase(arg0) && (Statics.field5701 == var5 && (Statics.field9110 & 16) != 0 || (Statics.field9110 & 8) != 0)) {
               class109 var6 = class109.method15110(ClientProt.OPPLAYERT, field2463.field832);
               var6.field814.method1718(field2622);
               var6.field814.method1738(0);
               var6.field814.method1627(var3[var4]);
               var6.field814.method1636(Statics.field4335);
               var6.field814.method1718(field2589);
               field2463.method1408(var6);
               int var7 = var5.method96();
               method11583(var5.field16[0], var5.field62[0], true, class720.method5346(var5.field16[0], var5.field62[0], var7, var7, 0));
               var1 = true;
               break;
            }
         }

         if (!var1) {
            class419.method10919(4, class881.field9007.method15374(Statics.field243) + arg0);
         }

         if (field2588) {
            method14495();
         }

      }
   }

   @deob.ObfuscatedName("eo.jt(Lem;III)V")
   public static void method5929(class425 arg0, int arg1, int arg2) {
      if (arg0 != null) {
         if (arg0.field3508 != null) {
            class90 var3 = new class90();
            var3.field679 = arg0;
            var3.field683 = arg0.field3508;
            class783.method15429(var3);
         }

         field2588 = true;
         Statics.field4335 = arg0.field3465;
         field2589 = arg0.field3401;
         Statics.field9110 = arg1;
         Statics.field3131 = arg2;
         field2622 = arg0.field3539;
         Statics.field6160 = arg0.field3420;
         field2451 = arg0.field3421;
         method7309(arg0);
      }
   }

   @deob.ObfuscatedName("su.jc(B)V")
   public static void method14495() {
      if (field2588) {
         class425 var0 = Statics.method886(Statics.field4335, field2589);
         if (var0 != null && var0.field3509 != null) {
            class90 var1 = new class90();
            var1.field679 = var0;
            var1.field683 = var0.field3509;
            class783.method15429(var1);
         }

         field2451 = -1;
         field2622 = -1;
         field2588 = false;
         if (var0 != null) {
            method7309(var0);
         }

      }
   }

   @deob.ObfuscatedName("du.ju(IIB)V")
   public static void method5536(int arg0, int arg1) {
      class109 var2 = class109.method15110(ClientProt.RESUME_PAUSEBUTTON, field2463.field832);
      var2.field814.method1636(arg0);
      var2.field814.method1627(arg1);
      field2463.method1408(var2);
   }

   @deob.ObfuscatedName("nm.ja(Lem;Lem;I)V")
   private static void method9886(class425 arg0, class425 arg1) {
      class109 var2 = class109.method15110(ClientProt.IF_BUTTOND, field2463.field832);
      var2.field814.method1635(arg1.field3465);
      var2.field814.method1750(arg0.field3539);
      var2.field814.method1572(arg0.field3465);
      var2.field814.method1718(arg1.field3401);
      var2.field814.method1750(arg0.field3401);
      var2.field814.method1627(arg1.field3539);
      field2463.method1408(var2);
   }

   @deob.ObfuscatedName("np.jw(Lem;I)V")
   public static void method9967(class425 arg0) {
      if (field2588) {
         if (arg0.field3403 != null) {
            class425 var1 = Statics.method886(Statics.field4335, field2589);
            if (var1 != null) {
               class90 var2 = new class90();
               var2.field679 = arg0;
               var2.field685 = var1;
               var2.field683 = arg0.field3403;
               class783.method15429(var2);
            }
         }

         class109 var3 = class109.method15110(ClientProt.IF_BUTTONT, field2463.field832);
         var3.field814.method1635(Statics.field4335);
         var3.field814.method1718(arg0.field3401);
         var3.field814.method1635(arg0.field3465);
         var3.field814.method1627(arg0.field3539);
         var3.field814.method1627(field2589);
         var3.field814.method1569(field2622);
         field2463.method1408(var3);
      }
   }

   @deob.ObfuscatedName("rv.jl(IIILjava/lang/String;B)V")
   public static void method14178(int arg0, int arg1, int arg2, String arg3) {
      class425 var4 = Statics.method886(arg1, arg2);
      if (var4 != null) {
         if (var4.field3523 != null) {
            class90 var5 = new class90();
            var5.field679 = var4;
            var5.field682 = arg0;
            var5.field678 = arg3;
            var5.field683 = var4.field3523;
            class783.method15429(var5);
         }

         if (method4871(var4).method899(arg0 - 1)) {
            class110 var6 = Statics.method8951();
            if (field2410 == 15 || field2410 == 1) {
               if (arg0 == 1) {
                  class109 var7 = class109.method15110(ClientProt.IF_BUTTON1, var6.field832);
                  method14917(var7, arg1, arg2, var4.field3539);
                  var6.method1408(var7);
               }

               if (arg0 == 2) {
                  class109 var8 = class109.method15110(ClientProt.IF_BUTTON2, var6.field832);
                  method14917(var8, arg1, arg2, var4.field3539);
                  var6.method1408(var8);
               }

               if (arg0 == 3) {
                  class109 var9 = class109.method15110(ClientProt.IF_BUTTON3, var6.field832);
                  method14917(var9, arg1, arg2, var4.field3539);
                  var6.method1408(var9);
               }

               if (arg0 == 4) {
                  class109 var10 = class109.method15110(ClientProt.IF_BUTTON4, var6.field832);
                  method14917(var10, arg1, arg2, var4.field3539);
                  var6.method1408(var10);
               }

               if (arg0 == 5) {
                  class109 var11 = class109.method15110(ClientProt.IF_BUTTON5, var6.field832);
                  method14917(var11, arg1, arg2, var4.field3539);
                  var6.method1408(var11);
               }

               if (arg0 == 6) {
                  class109 var12 = class109.method15110(ClientProt.IF_BUTTON6, var6.field832);
                  method14917(var12, arg1, arg2, var4.field3539);
                  var6.method1408(var12);
               }

               if (arg0 == 7) {
                  class109 var13 = class109.method15110(ClientProt.IF_BUTTON7, var6.field832);
                  method14917(var13, arg1, arg2, var4.field3539);
                  var6.method1408(var13);
               }

               if (arg0 == 8) {
                  class109 var14 = class109.method15110(ClientProt.IF_BUTTON8, var6.field832);
                  method14917(var14, arg1, arg2, var4.field3539);
                  var6.method1408(var14);
               }

               if (arg0 == 9) {
                  class109 var15 = class109.method15110(ClientProt.IF_BUTTON9, var6.field832);
                  method14917(var15, arg1, arg2, var4.field3539);
                  var6.method1408(var15);
               }

               if (arg0 == 10) {
                  class109 var16 = class109.method15110(ClientProt.IF_BUTTON10, var6.field832);
                  method14917(var16, arg1, arg2, var4.field3539);
                  var6.method1408(var16);
               }

            }
         }
      }
   }

   @deob.ObfuscatedName("ts.jr(Ladz;IIII)V")
   private static void method14917(class109 arg0, int arg1, int arg2, int arg3) {
      arg0.field814.method1569(arg3);
      arg0.field814.method1627(arg2);
      arg0.field814.method1636(arg1);
   }

   @deob.ObfuscatedName("w.jg(I)V")
   private static final void method15734() {
      Statics.field8493 = null;
      method9503(field2593, 0, 0, Statics.field6104, Statics.field6354, 0, 0, -1);
      if (Statics.field8493 != null) {
         method9490(Statics.field8493, -1412584499, 0, 0, Statics.field6104, Statics.field6354, Statics.field9635, Statics.field5945, field2604 == Statics.field5928 ? -1 : field2604.field3562, true);
         Statics.field8493 = null;
      }

   }

   @deob.ObfuscatedName("mu.js(IIIIIIIII)V")
   private static final void method9503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (class425.method4009(arg0, (int[])null)) {
         method9490(Statics.field844[arg0].method5916(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0);
      } else {
         if (arg7 != -1) {
            field2558[arg7] = true;
         } else {
            for(int var8 = 0; var8 < 103; ++var8) {
               field2558[var8] = true;
            }
         }

      }
   }

   @deob.ObfuscatedName("mt.jm([Lem;IIIIIIIIZB)V")
   public static final void method9490(class425[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
      Statics.field8847.method7716(arg2, arg3, arg4, arg5);

      for(int var10 = 0; var10 < arg0.length; ++var10) {
         class425 var11 = arg0[var10];
         if (var11 != null && (var11.field3462 == arg1 || arg1 == -1412584499 && field2501 == var11)) {
            int var12;
            if (arg8 == -1) {
               field2655[field2651].setBounds(var11.field3398 + arg6, var11.field3487 + arg7, var11.field3405, var11.field3557);
               var12 = ++field2651 - 1;
            } else {
               var12 = arg8;
            }

            var11.field3562 = var12;
            var11.field3497 = field2418;
            if (!method4968(var11)) {
               if (var11.field3544 != 0) {
                  method4056(var11);
               }

               int var13 = var11.field3398 + arg6;
               int var14 = var11.field3487 + arg7;
               int var15 = var11.field3430;
               if (field2599 && (method4871(var11).field432 != 0 || var11.field3402 == 0) && var15 > 127) {
                  var15 = 127;
               }

               if (field2501 == var11) {
                  if (arg1 != -1412584499 && (class425.field3377 == var11.field3495 || class425.field3418 == var11.field3495 || method4871(var11).method903())) {
                     Statics.field8493 = arg0;
                     Statics.field9635 = arg6;
                     Statics.field5945 = arg7;
                     continue;
                  }

                  if (field2616 && field2512) {
                     int var16 = Statics.field336.method1896();
                     int var17 = Statics.field336.method1897();
                     int var18 = var16 - field2605;
                     int var19 = var17 - field2606;
                     if (var18 < field2570) {
                        var18 = field2570;
                     }

                     if (var11.field3405 + var18 > field2572 + field2570) {
                        var18 = field2572 + field2570 - var11.field3405;
                     }

                     if (var19 < field2610) {
                        var19 = field2610;
                     }

                     if (var11.field3557 + var19 > field2610 + field2609) {
                        var19 = field2610 + field2609 - var11.field3557;
                     }

                     if (method4871(var11).method903()) {
                        method10741(var18, var19, var11.field3405, var11.field3557);
                     }

                     var13 = var18;
                     var14 = var19;
                  }

                  if (class425.field3418 == var11.field3495) {
                     var15 = 128;
                  }
               }

               int var20;
               int var21;
               int var22;
               int var23;
               if (var11.field3402 == 2) {
                  var20 = arg2;
                  var21 = arg3;
                  var22 = arg4;
                  var23 = arg5;
               } else {
                  int var24 = var11.field3405 + var13;
                  int var25 = var11.field3557 + var14;
                  if (var11.field3402 == 9) {
                     ++var24;
                     ++var25;
                  }

                  var20 = var13 > arg2 ? var13 : arg2;
                  var21 = var14 > arg3 ? var14 : arg3;
                  var22 = var24 < arg4 ? var24 : arg4;
                  var23 = var25 < arg5 ? var25 : arg5;
               }

               if (var20 < var22 && var21 < var23) {
                  if (var11.field3544 != 0) {
                     if (class425.field3379 == var11.field3544 || class425.field3380 == var11.field3544) {
                        Statics.field8847.method11515();
                        method9842(var13, var14, var11.field3405, var11.field3557, class425.field3380 == var11.field3544);
                        method6904(var12, var20, var21, var22, var23, var13, var14);
                        Statics.field8847.method7503();
                        Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                        field2558[var12] = true;
                        continue;
                     }

                     if (class425.field3381 == var11.field3544 && field2476 == 2) {
                        if (var11.method5824(Statics.field8847) != null) {
                           class677.method9259();
                           class299.method11290(Statics.field8847, var11, var13, var14);
                           Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                        }
                        continue;
                     }

                     if (class425.field3404 == var11.field3544) {
                        class412.method2045(Statics.field8847, var13, var14, var11);
                        continue;
                     }

                     if (class425.field3389 == var11.field3544) {
                        class412.method5673(Statics.field8847, var13, var14, var11, var11.field3448 % 64);
                        continue;
                     }

                     if (class425.field3382 == var11.field3544) {
                        if (var11.method5824(Statics.field8847) != null) {
                           Statics.field8847.method11515();
                           method11279(var11, var13, var14);
                           Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                        }
                        continue;
                     }

                     if (class425.field3383 == var11.field3544) {
                        class131.method14035(Statics.field8847, Statics.field6508, var13, var14, var11.field3405, var11.field3557);
                        field2558[var12] = true;
                        Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                        continue;
                     }

                     if (class425.field3384 == var11.field3544) {
                        class131.method17092(Statics.field8847, var13, var14, var11.field3405, var11.field3557);
                        field2558[var12] = true;
                        Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                        continue;
                     }

                     if (class425.field3385 == var11.field3544) {
                        if (field2665 || field2503) {
                           method4044(var13, var14, var11);
                           field2558[var12] = true;
                        }
                        continue;
                     }
                  }

                  if (var11.field3402 == 0) {
                     if (class425.field3428 == var11.field3544 && Statics.field8847.method7574()) {
                        Statics.field8847.method7556(0, 0, Statics.field6104, Statics.field6354);
                     }

                     method9490(arg0, var11.field3465, var20, var21, var22, var23, var13 - var11.field3400, var14 - var11.field3425, var12, arg9);
                     if (var11.field3552 != null) {
                        method9490(var11.field3552, var11.field3465, var20, var21, var22, var23, var13 - var11.field3400, var14 - var11.field3425, var12, arg9);
                     }

                     class118 var26 = (class118)field2594.method15322((long)var11.field3465);
                     if (var26 != null) {
                        method9503(var26.field911, var20, var21, var22, var23, var13, var14, var12);
                     }

                     if (class425.field3428 == var11.field3544) {
                        if (Statics.field8847.method7574()) {
                           Statics.field8847.method7557();
                        }

                        if (field2476 == 0) {
                           int var27 = field2482;
                           int var28 = field2483;
                           int var29 = field2484;
                           int var30 = field2389;
                           if (field2418 < field2460) {
                              float var31 = (float)(field2418 - field2480) * 1.0F / (float)(field2460 - field2480);
                              var27 = (int)((1.0F - var31) * (float)Statics.field3374 + (float)field2482 * var31);
                              var28 = (int)((1.0F - var31) * (float)Statics.field3113 + (float)field2483 * var31);
                              var29 = (int)((1.0F - var31) * (float)Statics.field6636 + (float)field2484 * var31);
                              var30 = (int)((1.0F - var31) * (float)Statics.field3667 + (float)field2389 * var31);
                           }

                           if (var27 > 0) {
                              Statics.field8847.method11524(var20, var21, var22 - var20, var23 - var21, var27 << 24 | var28 << 16 | var29 << 8 | var30);
                           }
                        }
                     }

                     Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                  }

                  if (field2654[var12] || field2656 > 1) {
                     if (var11.field3402 == 3) {
                        if (var15 == 0) {
                           if (var11.field3429) {
                              Statics.field8847.method7513(var13, var14, var11.field3405, var11.field3557, -16777216 | var11.field3448, 0);
                           } else {
                              Statics.field8847.method7751(var13, var14, var11.field3405, var11.field3557, -16777216 | var11.field3448, 0);
                           }
                        } else if (var11.field3429) {
                           Statics.field8847.method7513(var13, var14, var11.field3405, var11.field3557, 255 - (var15 & 255) << 24 | var11.field3448 & 16777215, 1);
                        } else {
                           Statics.field8847.method7751(var13, var14, var11.field3405, var11.field3557, 255 - (var15 & 255) << 24 | var11.field3448 & 16777215, 1);
                        }
                     } else if (var11.field3402 == 4) {
                        int var32 = 255 - (var15 & 255);
                        if (var32 != 0) {
                           class609 var33 = var11.method5816(Statics.field10616, field2430);
                           if (var33 == null) {
                              if (class425.field3397) {
                                 method7309(var11);
                              }
                           } else {
                              int var34 = var11.field3448;
                              String var35 = var11.field3470;
                              if (var11.field3539 != -1) {
                                 class899 var36 = Statics.field4196.method15540(var11.field3539);
                                 var35 = var36.field9158;
                                 if (var35 == null) {
                                    var35 = "null";
                                 }

                                 if ((var36.field9164 == 1 || var11.field3540 != 1) && var11.field3540 != -1) {
                                    var35 = class582.method7399(16748608) + var35 + class582.field5310 + " x" + method11292(var11.field3540);
                                 }
                              }

                              if (var11.field3480 != -1) {
                                 var35 = class817.method8681(var11.field3480);
                                 if (var35 == null) {
                                    var35 = "";
                                 }
                              }

                              if (field2596 == var11) {
                                 var35 = class881.field9030.method15374(Statics.field243);
                                 var34 = var11.field3448;
                              }

                              if (field2602) {
                                 Statics.field8847.method7510(var13, var14, var11.field3405 + var13, var11.field3557 + var14);
                              }

                              int var37 = var32 << 24;
                              if (var11.field3478) {
                                 var33.method8698(var35, var13, var14, var11.field3405, var11.field3557, var37 | var34, var11.field3474 ? var37 : -1, var11.field3472, var11.field3473, field2485, Statics.field9346, field2676, Statics.field6914, (int[])null);
                              } else {
                                 var33.method8720(var35, var13, var14, var11.field3405, var11.field3557, var37 | var34, var11.field3474 ? var37 : -1, var11.field3472, var11.field3473, var11.field3471, var11.field3475, Statics.field6914, (int[])null, (class826)null, 0, 0);
                              }

                              if (field2602) {
                                 Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                              }
                           }
                        }
                     } else if (var11.field3402 == 5) {
                        if (var11.field3542 >= 0) {
                           var11.method5866(Statics.field7125, Statics.field6768).method9471(Statics.field8847, 0, var13, var14, var11.field3405, var11.field3557, var11.field3543 << 3, var11.field3521 << 3, 0, 0);
                        } else {
                           class383 var39;
                           if (var11.field3539 != -1) {
                              class747 var38 = var11.field3541 ? Statics.field5701.field1386 : null;
                              var39 = Statics.field4196.method15523(Statics.field8847, var11.field3539, var11.field3540, var11.field3436, -16777216 | var11.field3376, var11.field3459, var38);
                           } else if (var11.field3480 != -1) {
                              var39 = class817.method10957(Statics.field8847, var11.field3480);
                           } else {
                              var39 = var11.method5815(Statics.field8847);
                           }

                           if (var39 != null) {
                              int var40 = var39.method5259();
                              int var41 = var39.method5213();
                              int var42 = 255 - (var15 & 255);
                              if (var42 != 0) {
                                 int var43;
                                 if (var11.field3448 == -1) {
                                    var43 = 16777215;
                                 } else {
                                    var43 = var11.field3448 & 16777215;
                                    if (var43 == 0) {
                                       var43 = 16777215;
                                    }
                                 }

                                 int var44 = var43 | var42 << 24;
                                 boolean var45 = var44 != -1;
                                 if (!var11.field3547) {
                                    if (var45) {
                                       if (var11.field3534 != 0) {
                                          var39.method5260((float)var11.field3405 / 2.0F + (float)var13, (float)var11.field3557 / 2.0F + (float)var14, var11.field3405 * 4096 / var40, var11.field3534, 0, var44, 1);
                                       } else if (var11.field3405 == var40 && var11.field3557 == var41) {
                                          var39.method2388(var13, var14, 0, var44, 1);
                                       } else {
                                          var39.method5263(var13, var14, var11.field3405, var11.field3557, 0, var44, 1);
                                       }
                                    } else if (var11.field3534 != 0) {
                                       var39.method5223((float)var11.field3405 / 2.0F + (float)var13, (float)var11.field3557 / 2.0F + (float)var14, var11.field3405 * 4096 / var40, var11.field3534);
                                    } else if (var11.field3405 == var40 && var11.field3557 == var41) {
                                       var39.method5221(var13, var14);
                                    } else {
                                       var39.method5222(var13, var14, var11.field3405, var11.field3557);
                                    }
                                 } else {
                                    Statics.field8847.method7510(var13, var14, var11.field3405 + var13, var11.field3557 + var14);
                                    if (var11.field3534 != 0) {
                                       int var46 = (var11.field3405 + (var40 - 1)) / var40;
                                       int var47 = (var11.field3557 + (var41 - 1)) / var41;

                                       for(int var48 = 0; var48 < var46; ++var48) {
                                          for(int var49 = 0; var49 < var47; ++var49) {
                                             if (var45) {
                                                var39.method5260((float)var40 / 2.0F + (float)(var40 * var48 + var13), (float)var41 / 2.0F + (float)(var41 * var49 + var14), 4096, var11.field3534, 0, var44, 1);
                                             } else {
                                                var39.method5223((float)var40 / 2.0F + (float)(var40 * var48 + var13), (float)var41 / 2.0F + (float)(var41 * var49 + var14), 4096, var11.field3534);
                                             }
                                          }
                                       }
                                    } else if (var45) {
                                       var39.method5219(var13, var14, var11.field3405, var11.field3557, 0, var44, 1);
                                    } else {
                                       var39.method5235(var13, var14, var11.field3405, var11.field3557);
                                    }

                                    Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                                 }
                              }
                           } else if (class425.field3397) {
                              method7309(var11);
                           }
                        }
                     } else if (var11.field3402 == 6) {
                        Statics.field8847.method11515();
                        field2468.method9512().method11132();
                        class745 var50 = null;
                        int var51 = 2048;
                        if (var11.field3467 != 0) {
                           var51 |= 524288;
                        }

                        int var52 = 0;
                        if (var11.field3539 != -1) {
                           class899 var53 = Statics.field4196.method15540(var11.field3539);
                           if (var53 != null) {
                              class899 var54 = var53.method15610(var11.field3540);
                              var50 = var54.method15609(Statics.field8847, var51, 1, var11.field3541 ? Statics.field5701.field1386 : null, var11.field3550, 0, 0, 0, 0);
                              if (var50 != null) {
                                 var52 = -var50.method6941() >> 1;
                              } else {
                                 method7309(var11);
                              }
                           }
                        } else if (var11.field3442 == 3) {
                           int var55 = var11.field3498;
                           if (var55 >= 0 && var55 < 2048) {
                              class211 var56 = field2408[var55];
                              if (var56 != null && (field2452 == var55 || class816.method9839(var56.field1381) == var11.field3444)) {
                                 var50 = var11.method5818(Statics.field8847, var51, Statics.field8402, Statics.field9434, Statics.field93, Statics.field4196, Statics.field2046, Statics.field10637, var11.field3550, var56.field1386);
                                 if (var50 == null && class425.field3397) {
                                    method7309(var11);
                                 }
                              }
                           }
                        } else if (var11.field3442 == 5) {
                           int var57 = var11.field3498;
                           if (var57 >= 0 && var57 < 2048) {
                              class211 var58 = field2408[var57];
                              if (var58 != null && (field2452 == var57 || class816.method9839(var58.field1381) == var11.field3444)) {
                                 var50 = var58.field1386.method11060(Statics.field8847, var51, Statics.field8402, Statics.field9434, Statics.field93, Statics.field4196, Statics.field2046, Statics.field10637, var11.field3550, (class836)null, (class836[])null, (int[])null, 0, true, Statics.field3828);
                              }
                           }
                        } else if (var11.field3442 != 8 && var11.field3442 != 9) {
                           if (var11.field3550 != null && var11.field3550.method14691()) {
                              var50 = var11.method5818(Statics.field8847, var51, Statics.field8402, Statics.field9434, Statics.field93, Statics.field4196, Statics.field2046, Statics.field10637, var11.field3550, Statics.field5701.field1386);
                              if (var50 == null && class425.field3397) {
                                 method7309(var11);
                              }
                           } else {
                              var50 = var11.method5818(Statics.field8847, var51, Statics.field8402, Statics.field9434, Statics.field93, Statics.field4196, Statics.field2046, Statics.field10637, (class836)null, Statics.field5701.field1386);
                              if (var50 == null && class425.field3397) {
                                 method7309(var11);
                              }
                           }
                        } else {
                           class72 var59 = class72.method9227(var11.field3498, false);
                           if (var59 != null) {
                              var50 = var59.method1035(Statics.field8847, var51, var11.field3550, var11.field3444, var11.field3442 == 9, var11.field3541 ? Statics.field5701.field1386 : null);
                           }
                        }

                        if (var50 != null) {
                           if (var11.field3467 != 0) {
                              var50.method6953(var11.field3449, var11.field3434, var11.field3466, var11.field3467);
                           }

                           int var60;
                           if (var11.field3455 > 0) {
                              var60 = (var11.field3405 << 9) / var11.field3455;
                           } else {
                              var60 = 512;
                           }

                           int var61;
                           if (var11.field3456 > 0) {
                              var61 = (var11.field3557 << 9) / var11.field3456;
                           } else {
                              var61 = 512;
                           }

                           int var62 = var11.field3405 / 2 + var13;
                           int var63 = var11.field3557 / 2 + var14;
                           if (!var11.field3445) {
                              var62 += var11.field3451 * var60 >> 9;
                              var63 += var11.field3452 * var61 >> 9;
                           }

                           field2672.method8059();
                           Statics.field8847.method7778(field2672);
                           class597 var64 = Statics.field8847.method7509();
                           int var65 = field2468.method9516();
                           int var66 = field2468.method9517();
                           int var67 = var11.field3454 + var66;
                           if (var11.field3457) {
                              if (Statics.field5998 == 2) {
                                 if (var11.field3445) {
                                    var64.method8424((float)var62, (float)var63, (float)var60, (float)var61, Statics.field6895.method6311(), Statics.field6895.method6334(), (float)Statics.field6104, (float)Statics.field6354, (float)var11.field3454);
                                 } else {
                                    var64.method8424((float)var62, (float)var63, (float)var60, (float)var61, Statics.field6895.method6311(), Statics.field6895.method6334(), (float)Statics.field6104, (float)Statics.field6354, (float)(var11.field3454 << 2));
                                 }
                              } else if (var11.field3445) {
                                 var64.method8424((float)var62, (float)var63, (float)var60, (float)var61, (float)var65, (float)var67, (float)Statics.field6104, (float)Statics.field6354, (float)var11.field3454);
                              } else {
                                 var64.method8424((float)var62, (float)var63, (float)var60, (float)var61, (float)var65, (float)var67, (float)Statics.field6104, (float)Statics.field6354, (float)(var11.field3454 << 2));
                              }
                           } else if (Statics.field5998 == 2) {
                              var64.method8411((float)var62, (float)var63, (float)var60, (float)var61, Statics.field6895.method6311(), Statics.field6895.method6334(), (float)Statics.field6104, (float)Statics.field6354);
                           } else {
                              var64.method8411((float)var62, (float)var63, (float)var60, (float)var61, (float)var65, (float)var67, (float)Statics.field6104, (float)Statics.field6354);
                           }

                           Statics.field8847.method7545(var64);
                           Statics.field8847.method2522(2, 0);
                           if (var11.field3519) {
                              Statics.field8847.method7551(false);
                           }

                           if (var11.field3445) {
                              field2413.method8128(1.0F, 0.0F, 0.0F, class603.method8577(var11.field3394));
                              field2413.method8126(0.0F, 1.0F, 0.0F, class603.method8577(var11.field3415));
                              field2413.method8126(0.0F, 0.0F, 1.0F, class603.method8577(var11.field3440));
                              field2413.method8072((float)var11.field3451, (float)var11.field3452, (float)var11.field3530);
                           } else {
                              int var68 = (var11.field3454 << 2) * class603.field5469[var11.field3394 << 3] >> 14;
                              int var69 = (var11.field3454 << 2) * class603.field5471[var11.field3394 << 3] >> 14;
                              field2413.method8128(0.0F, 0.0F, 1.0F, class603.method8577(-var11.field3440 << 3));
                              field2413.method8126(0.0F, 1.0F, 0.0F, class603.method8577(var11.field3415 << 3));
                              field2413.method8072((float)(var11.field3375 << 2), (float)((var11.field3447 << 2) + var68 + var52), (float)((var11.field3447 << 2) + var69));
                              field2413.method8126(1.0F, 0.0F, 0.0F, class603.method8577(var11.field3394 << 3));
                           }

                           var11.method5819(Statics.field8847, var50, field2413, field2418);
                           Statics.field8847.method11504(true);
                           Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                           if (field2602) {
                              Statics.field8847.method7510(var13, var14, var11.field3405 + var13, var11.field3557 + var14);
                           }

                           var50.method7001(field2413, (class394)null, 1);
                           if (!var11.field3457 && var11.field3453 != null) {
                              Statics.field8847.method7542(var11.field3453.method11220());
                           }

                           if (field2602) {
                              Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                           }

                           Statics.field8847.method11504(false);
                           Statics.field8847.method7508();
                           Statics.field8847.method7716(arg2, arg3, arg4, arg5);
                           if (var11.field3519) {
                              Statics.field8847.method7551(true);
                           }
                        }
                     } else if (var11.field3402 == 9) {
                        int var70;
                        int var71;
                        int var72;
                        int var73;
                        if (var11.field3432) {
                           var70 = var13;
                           var71 = var11.field3557 + var14;
                           var72 = var11.field3405 + var13;
                           var73 = var14;
                        } else {
                           var70 = var13;
                           var71 = var14;
                           var72 = var11.field3405 + var13;
                           var73 = var11.field3557 + var14;
                        }

                        if (var11.field3431 == 1) {
                           Statics.field8847.method7517(var70, var71, var72, var73, -16777216 | var11.field3448, 0);
                        } else {
                           Statics.field8847.method7727(var70, var71, var72, var73, -16777216 | var11.field3448, var11.field3431, 0);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("at.jh(IILem;I)V")
   private static void method4044(int arg0, int arg1, class425 arg2) {
      int var3 = arg2.field3405 + arg0;
      int var4 = arg1 + 15;
      if (field2665) {
         int var5 = -256;
         if (field6099 < 20) {
            var5 = -65536;
         }

         Statics.field6177.method8711("Fps:" + field6099, var3, var4, var5, -1);
         var4 += 15;
         Runtime var6 = Runtime.getRuntime();
         long var7 = var6.totalMemory() / 1024L;
         long var9 = var7 - var6.freeMemory() / 1024L;
         int var11 = -256;
         if (var9 > 262144L) {
            var11 = -65536;
         }

         Statics.field6177.method8711("Mem:" + var9 + "/" + var7 + "k", var3, var4, var11, -1);
         var4 += 15;
         long var12 = field2463.field841.method9692();
         String var14 = "N/A";
         if (var12 != -1L) {
            var14 = var12 + "ms";
            if (var12 > 500L) {
               var14 = class582.method7399(16711680) + var14 + class582.method7399(16776960);
            }
         }

         Statics.field6177.method8711("Game: In:" + field2463.field836 + "B/s " + "Out:" + field2463.field824 + "B/s " + "Ping:" + var14, var3, var4, -256, -1);
         var4 += 15;
         long var15 = field2462.field841.method9692();
         String var17 = "N/A";
         if (var15 != -1L) {
            var17 = var15 + "ms";
            if (var15 > 500L) {
               var17 = class582.method7399(16711680) + var17 + class582.method7399(16776960);
            }
         }

         Statics.field6177.method8711("Lobby: In:" + field2462.field836 + "B/s " + "Out:" + field2462.field824 + "B/s " + "Ping:" + var17, var3, var4, -256, -1);
         var4 += 15;
         int var18 = Statics.field8847.method7488() / 1024;
         Statics.field6177.method8711("Offheap:" + var18 + "k", var3, var4, var18 > 65536 ? -65536 : -256, -1);
         var4 += 15;
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;

         for(int var22 = 0; var22 < Statics.field8846.length; ++var22) {
            if (Statics.field8846[var22] != null) {
               var19 += Statics.field8846[var22].method625();
               var20 += Statics.field8846[var22].method626();
               var21 += Statics.field8846[var22].method627();
            }
         }

         int var23 = var21 * 100 / var19;
         int var24 = var20 * 10000 / var19;
         String var25 = "Cache:" + class804.method6440((long)var24, 2, true, class823.field8446) + "% (" + var23 + "%)";
         Statics.field5483.method8711(var25, var3, var4, -256, -1);
         var4 += 12;
      }

   }

   @deob.ObfuscatedName("qq.jq(IS)Ljava/lang/String;")
   private static final String method11292(int arg0) {
      String var1 = Integer.toString(arg0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + class582.field5306 + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + class582.method7399(65408) + var1.substring(0, var1.length() - 8) + class881.field9021.method15374(Statics.field243) + " (" + var1 + ")" + class582.field5310;
      } else {
         return var1.length() > 6 ? " " + class582.method7399(16777215) + var1.substring(0, var1.length() - 4) + class881.field9023.method15374(Statics.field243) + " (" + var1 + ")" + class582.field5310 : " " + class582.method7399(16776960) + var1 + class582.field5310;
      }
   }

   @deob.ObfuscatedName("zu.jz(Leo;Lem;I)Lem;")
   public static final class425 method17098(class427 arg0, class425 arg1) {
      if (arg1.field3462 != -1) {
         return arg0.method5917(arg1.field3462);
      } else {
         if (!arg0.field3570) {
            int var2 = arg1.field3465 >>> 16;
            class874 var3 = new class874(field2594);

            for(class118 var4 = (class118)var3.method15293(); var4 != null; var4 = (class118)var3.next()) {
               if (var4.field911 == var2) {
                  return class425.method11190((int)var4.field6137);
               }
            }
         }

         return null;
      }
   }

   @deob.ObfuscatedName("ge.jb(Leo;Lem;B)V")
   public static void method6621(class427 arg0, class425 arg1) {
      class425 var2 = method17098(arg0, arg1);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = Statics.field6104;
         var4 = Statics.field6354;
      } else {
         var3 = var2.field3405;
         var4 = var2.field3557;
      }

      method14344(arg1, var3, var4, false);
      method5904(arg1, var3, var4);
   }

   @deob.ObfuscatedName("js.jf(Leo;Lem;ZI)V")
   public static void method8010(class427 arg0, class425 arg1, boolean arg2) {
      method8550(arg0.field3569, arg1, arg2);
   }

   @deob.ObfuscatedName("ks.jd([Lem;Lem;ZI)V")
   private static void method8550(class425[] arg0, class425 arg1, boolean arg2) {
      int var3 = arg1.field3426 != 0 ? arg1.field3426 : arg1.field3405;
      int var4 = arg1.field3461 != 0 ? arg1.field3461 : arg1.field3557;
      method10950(arg0, arg1.field3465, var3, var4, arg2);
      if (arg1.field3552 != null) {
         method10950(arg1.field3552, arg1.field3465, var3, var4, arg2);
      }

      class118 var5 = (class118)field2594.method15322((long)arg1.field3465);
      if (var5 != null) {
         method11293(var5.field911, var3, var4, arg2);
      }

      if (field2601 == arg1) {
         int var6 = class324.field2053;
         int[] var7 = class324.field2057;

         for(int var8 = 0; var8 < var6; ++var8) {
            class211 var9 = field2408[var7[var8]];
            if (var9 != null) {
               var9.method114(var3, var4, arg2);
            }
         }

         for(int var10 = 0; var10 < field2455; ++var10) {
            int var11 = field2456[var10];
            class106 var12 = (class106)field2615.method15322((long)var11);
            if (var12 != null) {
               ((class4)var12.field807).method114(var3, var4, arg2);
            }
         }
      }

   }

   @deob.ObfuscatedName("qq.ji(IIIZI)V")
   public static final void method11293(int arg0, int arg1, int arg2, boolean arg3) {
      if (class425.method4009(arg0, (int[])null)) {
         method10950(Statics.field844[arg0].field3569, -1, arg1, arg2, arg3);
      }
   }

   @deob.ObfuscatedName("px.jv([Lem;IIIZI)V")
   public static void method10950(class425[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
      for(int var5 = 0; var5 < arg0.length; ++var5) {
         class425 var6 = arg0[var5];
         if (var6 != null && var6.field3462 == arg1) {
            method14344(var6, arg2, arg3, arg4);
            method5904(var6, arg2, arg3);
            if (var6.field3400 > var6.field3426 - var6.field3405) {
               var6.field3400 = var6.field3426 - var6.field3405;
            }

            if (var6.field3400 < 0) {
               var6.field3400 = 0;
            }

            if (var6.field3425 > var6.field3461 - var6.field3557) {
               var6.field3425 = var6.field3461 - var6.field3557;
            }

            if (var6.field3425 < 0) {
               var6.field3425 = 0;
            }

            if (var6.field3402 == 0) {
               method8550(arg0, var6, arg4);
            }
         }
      }

   }

   @deob.ObfuscatedName("sj.jx(Lem;IIZB)V")
   private static void method14344(class425 arg0, int arg1, int arg2, boolean arg3) {
      int var4 = arg0.field3405;
      int var5 = arg0.field3557;
      if (arg0.field3406 == 0) {
         arg0.field3405 = arg0.field3450;
      } else if (arg0.field3406 == 1) {
         arg0.field3405 = arg1 - arg0.field3450;
      } else if (arg0.field3406 == 2) {
         arg0.field3405 = arg0.field3450 * arg1 >> 14;
      }

      if (arg0.field3422 == 0) {
         arg0.field3557 = arg0.field3411;
      } else if (arg0.field3422 == 1) {
         arg0.field3557 = arg2 - arg0.field3411;
      } else if (arg0.field3422 == 2) {
         arg0.field3557 = arg0.field3411 * arg2 >> 14;
      }

      if (arg0.field3406 == 4) {
         arg0.field3405 = arg0.field3557 * arg0.field3396 / arg0.field3417;
      }

      if (arg0.field3422 == 4) {
         arg0.field3557 = arg0.field3417 * arg0.field3405 / arg0.field3396;
      }

      if (field2599 && (method4871(arg0).field432 != 0 || arg0.field3402 == 0)) {
         if (arg0.field3557 < 5 && arg0.field3405 < 5) {
            arg0.field3557 = 5;
            arg0.field3405 = 5;
         } else {
            if (arg0.field3557 <= 0) {
               arg0.field3557 = 5;
            }

            if (arg0.field3405 <= 0) {
               arg0.field3405 = 5;
            }
         }
      }

      if (class425.field3379 == arg0.field3544) {
         field2601 = arg0;
      }

      if (arg3 && arg0.field3537 != null && (arg0.field3405 != var4 || arg0.field3557 != var5)) {
         class90 var6 = new class90();
         var6.field679 = arg0;
         var6.field683 = arg0.field3537;
         field2646.method14959(var6);
      }

   }

   @deob.ObfuscatedName("em.jn(Lem;IIB)V")
   private static void method5904(class425 arg0, int arg1, int arg2) {
      if (arg0.field3531 == 0) {
         arg0.field3398 = arg0.field3408;
      } else if (arg0.field3531 == 1) {
         arg0.field3398 = (arg1 - arg0.field3405) / 2 + arg0.field3408;
      } else if (arg0.field3531 == 2) {
         arg0.field3398 = arg1 - arg0.field3405 - arg0.field3408;
      } else if (arg0.field3531 == 3) {
         arg0.field3398 = arg0.field3408 * arg1 >> 14;
      } else if (arg0.field3531 == 4) {
         arg0.field3398 = (arg0.field3408 * arg1 >> 14) + (arg1 - arg0.field3405) / 2;
      } else {
         arg0.field3398 = arg1 - arg0.field3405 - (arg0.field3408 * arg1 >> 14);
      }

      if (arg0.field3500 == 0) {
         arg0.field3487 = arg0.field3553;
      } else if (arg0.field3500 == 1) {
         arg0.field3487 = (arg2 - arg0.field3557) / 2 + arg0.field3553;
      } else if (arg0.field3500 == 2) {
         arg0.field3487 = arg2 - arg0.field3557 - arg0.field3553;
      } else if (arg0.field3500 == 3) {
         arg0.field3487 = arg0.field3553 * arg2 >> 14;
      } else if (arg0.field3500 == 4) {
         arg0.field3487 = (arg0.field3553 * arg2 >> 14) + (arg2 - arg0.field3557) / 2;
      } else {
         arg0.field3487 = arg2 - arg0.field3557 - (arg0.field3553 * arg2 >> 14);
      }

      if (field2599 && (method4871(arg0).field432 != 0 || arg0.field3402 == 0)) {
         if (arg0.field3398 < 0) {
            arg0.field3398 = 0;
         } else if (arg0.field3405 + arg0.field3398 > arg1) {
            arg0.field3398 = arg1 - arg0.field3405;
         }

         if (arg0.field3487 < 0) {
            arg0.field3487 = 0;
         } else if (arg0.field3557 + arg0.field3487 > arg2) {
            arg0.field3487 = arg2 - arg0.field3557;
         }
      }

   }

   @deob.ObfuscatedName("wd.jp(I)V")
   public static void method15750() {
      field2468.method9613();
      class299.method8733();
      method14300(true);
      class817.method9459();
      System.gc();
      Statics.field8847.method2522(2, 0);
   }

   @deob.ObfuscatedName("fz.jo(I)V")
   public static void method6555() {
      method14844(16);
      class131.method4057();
      System.gc();
   }

   @deob.ObfuscatedName("te.jj(I)V")
   private static final void method14629() {
      if (field2593 != -1) {
         int var0 = Statics.field336.method1896();
         int var1 = Statics.field336.method1897();
         class102 var2 = (class102)field2434.method14964();
         if (var2 != null) {
            var0 = var2.method1375();
            var1 = var2.method1367();
         }

         if (field2501 != null && field2604 == Statics.field5928) {
            field2512 = true;
            field2570 = 0;
            field2610 = 0;
            field2572 = Statics.field6104;
            field2609 = Statics.field6354;
         }

         method8977((class118)null, field2593, 0, 0, Statics.field6104, Statics.field6354, 0, 0, var0, var1);
         if (Statics.field818 != null) {
            class131.method10010(var0, var1);
         }

      }
   }

   @deob.ObfuscatedName("ln.je(Laeh;IIIIIIIIII)V")
   private static final void method8977(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (class425.method4009(arg1, (int[])null)) {
         if (arg0 != null && !arg0.method1522()) {
            Statics.method689(arg0, true, false);
         } else {
            class427 var10 = Statics.field844[arg1];
            method4567(var10, var10.method5916(), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
         }
      }
   }

   @deob.ObfuscatedName("client.jk(Leo;[Lem;IIIIIIIII)V")
   public static final void method4567(class427 arg0, class425[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      label998:
      for(int var11 = 0; var11 < arg1.length; ++var11) {
         class425 var12 = arg1[var11];
         if (var12 != null && var12.field3462 == arg2) {
            int var13 = var12.field3398 + arg7;
            int var14 = var12.field3487 + arg8;
            int var15;
            int var16;
            int var17;
            int var18;
            if (var12.field3402 == 2) {
               var15 = arg3;
               var16 = arg4;
               var17 = arg5;
               var18 = arg6;
            } else {
               int var19 = var12.field3405 + var13;
               int var20 = var12.field3557 + var14;
               if (var12.field3402 == 9) {
                  ++var19;
                  ++var20;
               }

               var15 = var13 > arg3 ? var13 : arg3;
               var16 = var14 > arg4 ? var14 : arg4;
               var17 = var19 < arg5 ? var19 : arg5;
               var18 = var20 < arg6 ? var20 : arg6;
            }

            if (var12.field3402 != 0 && !var12.field3463 && method4871(var12).field432 == 0 && field2604 != var12 && class425.field3381 != var12.field3544 && class425.field3386 != var12.field3544 && class425.field3379 != var12.field3544 && class425.field3380 != var12.field3544) {
               if (var15 < var17 && var16 < var18) {
                  Statics.method389(var12);
               }
            } else if (!method4968(var12)) {
               if (field2501 == var12 && method15218(field2501)) {
                  field2613 = true;
                  field2614 = var13;
                  field2621 = var14;
               }

               if (var12.field3524 || var15 < var17 && var16 < var18) {
                  if (var12.field3423 && arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
                     for(class90 var21 = (class90)field2646.method14964(); var21 != null; var21 = (class90)field2646.method15006()) {
                        if (var21.field686) {
                           var21.method9864();
                           var21.field679.field3535 = false;
                        }
                     }

                     if (Statics.field3877 == 0) {
                        field2501 = null;
                        field2604 = null;
                     }

                     field2617 = 0;
                     class131.field1018 = false;
                     field2685 = false;
                     if (!class987.field10492) {
                        class987.method5514();
                     }
                  }

                  boolean var22 = var12.field3441 && var12.field3402 == 5 && var12.field3430 == 0 && var12.field3542 < 0 && var12.field3539 == -1 && var12.field3480 == -1 && !var12.field3547 && var12.field3534 == 0;
                  boolean var23 = false;
                  if (arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
                     if (var22) {
                        class436 var24 = var12.method5824(Statics.field8847);
                        if (var24 != null && var12.field3405 == var24.field3629 && var12.field3557 == var24.field3625) {
                           int var25 = arg9 - var13;
                           int var26 = arg10 - var14;
                           if (var26 >= 0 && var26 < var24.field3627.length) {
                              int var27 = var24.field3627[var26];
                              if (var25 >= var27 && var25 <= var24.field3626[var26] + var27) {
                                 var23 = true;
                              }
                           }
                        } else {
                           var23 = true;
                        }
                     } else {
                        var23 = true;
                     }
                  }

                  if (!field2588 && var23) {
                     if (var12.field3433 >= 0) {
                        field2451 = var12.field3433;
                     } else if (var12.field3423) {
                        field2451 = -1;
                     }
                  }

                  if (!class987.field10492 && var23 && !arg0.field3570) {
                     class987.method11291(var12, arg9 - var13, arg10 - var14);
                  }

                  boolean var28 = false;
                  if (Statics.field336.method1893() && var23) {
                     var28 = true;
                  }

                  boolean var29 = false;
                  class102 var30 = (class102)field2434.method14964();
                  if (var30 != null && var30.method1365() == 0 && var30.method1375() >= var15 && var30.method1367() >= var16 && var30.method1375() < var17 && var30.method1367() < var18) {
                     if (var22) {
                        class436 var31 = var12.method5824(Statics.field8847);
                        if (var31 != null && var12.field3405 == var31.field3629 && var12.field3557 == var31.field3625) {
                           int var32 = var30.method1375() - var13;
                           int var33 = var30.method1367() - var14;
                           if (var33 >= 0 && var33 < var31.field3627.length) {
                              int var34 = var31.field3627[var33];
                              if (var32 >= var34 && var32 <= var31.field3626[var33] + var34) {
                                 var29 = true;
                              }
                           }
                        } else {
                           var29 = true;
                        }
                     } else {
                        var29 = true;
                     }
                  }

                  if (var12.field3524 && !class319.method9100()) {
                     for(int var35 = 0; var35 < var12.field3479.length; ++var35) {
                        boolean var36 = false;
                        boolean var37 = false;
                        if (var12.field3482[var35] > 0) {
                           for(int var38 = 0; var38 < field2437; ++var38) {
                              if (var12.field3482[var35] == field2438[var38].method1296()) {
                                 var36 = true;
                                 if (var12.field3565 == null || var12.field3565[var35] <= field2418) {
                                    var37 = true;
                                 }
                                 break;
                              }
                           }
                        }

                        if (!var36 && var12.field3479[var35] != null) {
                           for(int var39 = 0; var39 < var12.field3479[var35].length; ++var39) {
                              if (Statics.field2111.method1803(var12.field3479[var35][var39])) {
                                 var36 = true;
                                 if (var12.field3565 != null && var12.field3565[var35] > field2418) {
                                    break;
                                 }

                                 byte var40 = var12.field3435[var35][var39];
                                 if (var40 == 0 || ((var40 & 8) == 0 || !Statics.field2111.method1803(86) && !Statics.field2111.method1803(82) && !Statics.field2111.method1803(81)) && ((var40 & 2) == 0 || Statics.field2111.method1803(86)) && ((var40 & 1) == 0 || Statics.field2111.method1803(82)) && ((var40 & 4) == 0 || Statics.field2111.method1803(81))) {
                                    var37 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var37) {
                           if (var35 < 10) {
                              method14178(var35 + 1, var12.field3465, var12.field3401, "");
                           } else if (var35 == 10) {
                              method14495();
                              class58 var41 = method4871(var12);
                              method5929(var12, var41.method911(), var41.field434);
                              field2591 = method9706(var12);
                              if (field2591 == null) {
                                 field2591 = "Null";
                              }

                              field2592 = var12.field3548 + class582.method7399(16777215);
                           }

                           int var42 = var12.field3481[var35];
                           if (var12.field3565 == null) {
                              var12.field3565 = new int[var12.field3479.length];
                           }

                           if (var42 != 0) {
                              var12.field3565[var35] = field2418 + var42;
                           } else {
                              var12.field3565[var35] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var36 && var12.field3565 != null) {
                           var12.field3565[var35] = 0;
                        }
                     }
                  }

                  if (var29) {
                     method9461(var12, var30.method1375() - var13, var30.method1367() - var14);
                  }

                  if (field2501 != null && field2501 != var12 && var23 && method4871(var12).method902()) {
                     field2607 = var12;
                  }

                  if (field2604 == var12) {
                     field2512 = true;
                     field2570 = var13;
                     field2610 = var14;
                     field2572 = field2604.field3405;
                     field2609 = field2604.field3557;
                  }

                  if (var12.field3463 || var12.field3544 != 0) {
                     if (var23 && field2718 != 0 && var12.field3525 != null) {
                        class90 var43 = new class90();
                        var43.field686 = true;
                        var43.field679 = var12;
                        var43.field681 = field2718;
                        var43.field683 = var12.field3525;
                        field2646.method14959(var43);
                     }

                     if (field2501 != null) {
                        var29 = false;
                        var28 = false;
                     } else if (class987.field10492 || class425.field3383 != var12.field3544 && field2617 > 0) {
                        var29 = false;
                        var28 = false;
                        var23 = false;
                     }

                     if (var12.field3544 != 0) {
                        if (class425.field3379 == var12.field3544 || class425.field3380 == var12.field3544) {
                           field2601 = var12;
                           class769 var66 = field2468.method9512().method11124();
                           if (var66.method11439() != null && !Statics.field4892.method8955()) {
                              var66.method11439().method9469(Statics.field8847, var12.field3557, Statics.field9361.field970.method2189());
                           }

                           if (class425.field3379 == var12.field3544 && !class987.field10492 && arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
                              class987.method11584(Statics.field8847, arg9, arg10);

                              for(class57 var67 = (class57)field2534.method14798(); var67 != null; var67 = (class57)field2534.method14793()) {
                                 if (arg9 >= var67.field421 && arg9 < var67.field423 && arg10 >= var67.field422 && arg10 < var67.field424) {
                                    class987.method5514();
                                    class987.method7971(var67.field420);
                                 }
                              }
                           }

                           int var68 = class324.field2053;
                           int[] var69 = class324.field2057;

                           for(int var70 = 0; var70 < var68; ++var70) {
                              class211 var71 = field2408[var69[var70]];
                              if (var71 != null) {
                                 class783.method5726(class932.field9451, -1, -1, var71, var69[var70]);
                                 var71.method112(var15, var16, var17, var18, var13 - var12.field3400, var14 - var12.field3425, arg9, arg10);
                              }
                           }

                           int var72 = 0;

                           while(true) {
                              if (var72 >= field2455) {
                                 continue label998;
                              }

                              int var73 = field2456[var72];
                              class106 var74 = (class106)field2615.method15322((long)var73);
                              if (var74 != null) {
                                 class783.method5726(class932.field9450, ((class200)var74.field807).field1312.field9281, -1, (class4)var74.field807, var73);
                                 ((class4)var74.field807).method112(var15, var16, var17, var18, var13 - var12.field3400, var14 - var12.field3425, arg9, arg10);
                              }

                              ++var72;
                           }
                        }

                        if (class425.field3381 == var12.field3544) {
                           class436 var44 = var12.method5824(Statics.field8847);
                           if (var44 == null || class299.field1882 != 0 && class299.field1882 != 3 || class987.field10492 || arg9 < var15 || arg10 < var16 || arg9 >= var17 || arg10 >= var18) {
                              continue;
                           }

                           int var45 = arg9 - var13;
                           int var46 = arg10 - var14;
                           int var47 = var44.field3627[var46];
                           if (var45 < var47 || var45 > var44.field3626[var46] + var47) {
                              continue;
                           }

                           int var48 = var45 - var12.field3405 / 2;
                           int var49 = var46 - var12.field3557 / 2;
                           int var50;
                           if (Statics.field5998 == 5) {
                              var50 = (int)field2502 & 16383;
                           } else if (Statics.field5998 == 2) {
                              var50 = (int)((double)Statics.field6895.method6425() * 2607.5945876176133D);
                           } else {
                              var50 = field2519 + (int)field2502 & 16383;
                           }

                           int var51 = class603.field5469[var50];
                           int var52 = class603.field5471[var50];
                           if (Statics.field5998 != 5) {
                              var51 = (field2619 + 256) * var51 >> 8;
                              var52 = (field2619 + 256) * var52 >> 8;
                           }

                           int var53 = var48 * var52 + var49 * var51 >> 14;
                           int var54 = var49 * var52 - var48 * var51 >> 14;
                           int var55;
                           int var56;
                           if (Statics.field5998 == 5) {
                              var55 = (field2506 >> 9) + (var53 >> 2);
                              var56 = (field2507 >> 9) - (var54 >> 2);
                           } else {
                              int var57 = (Statics.field5701.method96() - 1) * 256;
                              class584 var58 = Statics.field5701.method11602().field5446;
                              var55 = ((int)var58.field5328 - var57 >> 9) + (var53 >> 2);
                              var56 = ((int)var58.field5331 - var57 >> 9) - (var54 >> 2);
                           }

                           if (field2588 && (Statics.field9110 & 64) != 0) {
                              class425 var59 = Statics.method886(Statics.field4335, field2589);
                              if (var59 != null) {
                                 class987.method15520(field2591, " " + class582.field5309, Statics.field6160, 59, var12.field3539, 1L, var55, var56, true, false, (long)(var12.field3401 << 32 | var12.field3465), true);
                              } else {
                                 method14495();
                              }
                              continue;
                           }

                           if (field2584 == class801.field7298) {
                              class987.method15520(class881.field9014.method15374(Statics.field243), "", -1, 60, -1, 1L, var55, var56, true, false, 0L, true);
                           }

                           class987.method15520(Statics.field5177, "", field2575, 23, -1, 1L, var55, var56, true, false, 0L, true);
                           continue;
                        }

                        if (class425.field3383 == var12.field3544) {
                           Statics.field818 = var12;
                           if (var23) {
                              class131.field1018 = true;
                           }

                           if (var29) {
                              int var60 = (int)((double)(var30.method1375() - var13 - var12.field3405 / 2) * 2.0D / (double)Statics.field6398);
                              int var61 = (int)(-((double)(var30.method1367() - var14 - var12.field3557 / 2) * 2.0D / (double)Statics.field6398));
                              int var62 = Statics.field7271 + var60 + Statics.field6402;
                              int var63 = Statics.field9883 + var61 + Statics.field6418;
                              class252 var64 = class131.method5345();
                              if (var64 == null) {
                                 continue;
                              }

                              int[] var65 = new int[3];
                              var64.method3410(var62, var63, var65);
                              if (var65 != null) {
                                 if (Statics.field2111.method1803(82) && field2562 > 0) {
                                    method15056(var65[0], var65[1], var65[2]);
                                    continue;
                                 }

                                 field2685 = true;
                                 Statics.field9242 = var65[0];
                                 Statics.field5611 = var65[1];
                                 Statics.field3085 = var65[2];
                              }

                              field2617 = 1;
                              field2529 = false;
                              field2605 = Statics.field336.method1896();
                              field2606 = Statics.field336.method1897();
                              continue;
                           }

                           if (var28 && field2617 > 0) {
                              if (field2617 == 1 && (field2605 != Statics.field336.method1896() || field2606 != Statics.field336.method1897())) {
                                 Statics.field491 = Statics.field7271;
                                 Statics.field8381 = Statics.field9883;
                                 field2617 = 2;
                              }

                              if (field2617 == 2) {
                                 field2529 = true;
                                 class131.method11459(Statics.field491 + (int)((double)(field2605 - Statics.field336.method1896()) * 2.0D / (double)Statics.field6419));
                                 class131.method10650(Statics.field8381 - (int)((double)(field2606 - Statics.field336.method1897()) * 2.0D / (double)Statics.field6419));
                              }
                              continue;
                           }

                           if (field2617 > 0 && !field2529) {
                              if ((field2583 == 1 || class987.method896()) && class987.field10501 > 2) {
                                 class987.method5483(field2605, field2606);
                              } else if (class987.method7372()) {
                                 class987.method5483(field2605, field2606);
                              }
                           }

                           field2617 = 0;
                           continue;
                        }

                        if (class425.field3384 == var12.field3544) {
                           if (var28) {
                              class131.method15953(Statics.field336.method1896() - var13, Statics.field336.method1897() - var14, var12.field3405, var12.field3557);
                           }
                           continue;
                        }

                        if (class425.field3386 == var12.field3544) {
                           Statics.method14170(var12, var13, var14);
                           continue;
                        }
                     }

                     if (!var12.field3554 && var29) {
                        var12.field3554 = true;
                        if (var12.field3499 != null) {
                           class90 var75 = new class90();
                           var75.field686 = true;
                           var75.field679 = var12;
                           var75.field680 = var30.method1375() - var13;
                           var75.field681 = var30.method1367() - var14;
                           var75.field683 = var12.field3499;
                           field2646.method14959(var75);
                        }
                     }

                     if (var12.field3554 && var28 && var12.field3532 != null) {
                        class90 var76 = new class90();
                        var76.field686 = true;
                        var76.field679 = var12;
                        var76.field680 = Statics.field336.method1896() - var13;
                        var76.field681 = Statics.field336.method1897() - var14;
                        var76.field683 = var12.field3532;
                        field2646.method14959(var76);
                     }

                     if (var12.field3554 && !var28) {
                        var12.field3554 = false;
                        if (var12.field3458 != null) {
                           class90 var77 = new class90();
                           var77.field686 = true;
                           var77.field679 = var12;
                           var77.field680 = Statics.field336.method1896() - var13;
                           var77.field681 = Statics.field336.method1897() - var14;
                           var77.field683 = var12.field3458;
                           field2648.method14959(var77);
                        }
                     }

                     if (var28 && var12.field3469 != null) {
                        class90 var78 = new class90();
                        var78.field686 = true;
                        var78.field679 = var12;
                        var78.field680 = Statics.field336.method1896() - var13;
                        var78.field681 = Statics.field336.method1897() - var14;
                        var78.field683 = var12.field3469;
                        field2646.method14959(var78);
                     }

                     if (!var12.field3535 && var23) {
                        var12.field3535 = true;
                        if (var12.field3503 != null) {
                           class90 var79 = new class90();
                           var79.field686 = true;
                           var79.field679 = var12;
                           var79.field680 = Statics.field336.method1896() - var13;
                           var79.field681 = Statics.field336.method1897() - var14;
                           var79.field683 = var12.field3503;
                           field2646.method14959(var79);
                        }
                     }

                     if (var12.field3535 && var23 && var12.field3504 != null) {
                        class90 var80 = new class90();
                        var80.field686 = true;
                        var80.field679 = var12;
                        var80.field680 = Statics.field336.method1896() - var13;
                        var80.field681 = Statics.field336.method1897() - var14;
                        var80.field683 = var12.field3504;
                        field2646.method14959(var80);
                     }

                     if (var12.field3535 && !var23) {
                        var12.field3535 = false;
                        if (var12.field3505 != null) {
                           class90 var81 = new class90();
                           var81.field686 = true;
                           var81.field679 = var12;
                           var81.field680 = Statics.field336.method1896() - var13;
                           var81.field681 = Statics.field336.method1897() - var14;
                           var81.field683 = var12.field3505;
                           field2648.method14959(var81);
                        }
                     }

                     if (var12.field3563 != null) {
                        class90 var82 = new class90();
                        var82.field679 = var12;
                        var82.field683 = var12.field3563;
                        field2653.method14959(var82);
                     }

                     if (var12.field3516 != null && field2488 > var12.field3559) {
                        if (var12.field3517 != null && field2488 - var12.field3559 <= 32) {
                           label835:
                           for(int var83 = var12.field3559; var83 < field2488; ++var83) {
                              int var84 = field2666[var83 & 31];

                              for(int var85 = 0; var85 < var12.field3517.length; ++var85) {
                                 if (var12.field3517[var85] == var84) {
                                    class90 var86 = new class90();
                                    var86.field679 = var12;
                                    var86.field683 = var12.field3516;
                                    field2646.method14959(var86);
                                    break label835;
                                 }
                              }
                           }
                        } else {
                           class90 var87 = new class90();
                           var87.field679 = var12;
                           var87.field683 = var12.field3516;
                           field2646.method14959(var87);
                        }

                        var12.field3559 = field2488;
                     }

                     if (var12.field3518 != null && field2632 > var12.field3560) {
                        if (var12.field3409 != null && field2632 - var12.field3560 <= 32) {
                           label811:
                           for(int var88 = var12.field3560; var88 < field2632; ++var88) {
                              int var89 = field2631[var88 & 31];

                              for(int var90 = 0; var90 < var12.field3409.length; ++var90) {
                                 if (var12.field3409[var90] == var89) {
                                    class90 var91 = new class90();
                                    var91.field679 = var12;
                                    var91.field683 = var12.field3518;
                                    field2646.method14959(var91);
                                    break label811;
                                 }
                              }
                           }
                        } else {
                           class90 var92 = new class90();
                           var92.field679 = var12;
                           var92.field683 = var12.field3518;
                           field2646.method14959(var92);
                        }

                        var12.field3560 = field2632;
                     }

                     if (var12.field3510 != null && field2624 > var12.field3443) {
                        if (var12.field3511 != null && field2624 - var12.field3443 <= 32) {
                           label787:
                           for(int var93 = var12.field3443; var93 < field2624; ++var93) {
                              int var94 = field2623[var93 & 31];

                              for(int var95 = 0; var95 < var12.field3511.length; ++var95) {
                                 if (var12.field3511[var95] == var94) {
                                    class90 var96 = new class90();
                                    var96.field679 = var12;
                                    var96.field683 = var12.field3510;
                                    field2646.method14959(var96);
                                    break label787;
                                 }
                              }
                           }
                        } else {
                           class90 var97 = new class90();
                           var97.field679 = var12;
                           var97.field683 = var12.field3510;
                           field2646.method14959(var97);
                        }

                        var12.field3443 = field2624;
                     }

                     if (var12.field3413 != null && field2560 > var12.field3412) {
                        if (var12.field3513 != null && field2560 - var12.field3412 <= 32) {
                           label763:
                           for(int var98 = var12.field3412; var98 < field2560; ++var98) {
                              int var99 = field2625[var98 & 31];

                              for(int var100 = 0; var100 < var12.field3513.length; ++var100) {
                                 if (var12.field3513[var100] == var99) {
                                    class90 var101 = new class90();
                                    var101.field679 = var12;
                                    var101.field683 = var12.field3413;
                                    field2646.method14959(var101);
                                    break label763;
                                 }
                              }
                           }
                        } else {
                           class90 var102 = new class90();
                           var102.field679 = var12;
                           var102.field683 = var12.field3413;
                           field2646.method14959(var102);
                        }

                        var12.field3412 = field2560;
                     }

                     if (var12.field3514 != null && field2628 > var12.field3558) {
                        if (var12.field3515 != null && field2628 - var12.field3558 <= 32) {
                           label739:
                           for(int var103 = var12.field3558; var103 < field2628; ++var103) {
                              int var104 = field2449[var103 & 31];

                              for(int var105 = 0; var105 < var12.field3515.length; ++var105) {
                                 if (var12.field3515[var105] == var104) {
                                    class90 var106 = new class90();
                                    var106.field679 = var12;
                                    var106.field683 = var12.field3514;
                                    field2646.method14959(var106);
                                    break label739;
                                 }
                              }
                           }
                        } else {
                           class90 var107 = new class90();
                           var107.field679 = var12;
                           var107.field683 = var12.field3514;
                           field2646.method14959(var107);
                        }

                        var12.field3558 = field2628;
                     }

                     if (var12.field3520 != null && field2634 > var12.field3561) {
                        if (var12.field3512 != null && field2634 - var12.field3561 <= 32) {
                           label715:
                           for(int var108 = var12.field3561; var108 < field2634; ++var108) {
                              int var109 = field2633[var108 & 31];

                              for(int var110 = 0; var110 < var12.field3512.length; ++var110) {
                                 if (var12.field3512[var110] == var109) {
                                    class90 var111 = new class90();
                                    var111.field679 = var12;
                                    var111.field683 = var12.field3520;
                                    field2646.method14959(var111);
                                    break label715;
                                 }
                              }
                           }
                        } else {
                           class90 var112 = new class90();
                           var112.field679 = var12;
                           var112.field683 = var12.field3520;
                           field2646.method14959(var112);
                        }

                        var12.field3561 = field2634;
                     }

                     if (field2548 > var12.field3555 && var12.field3526 != null) {
                        class90 var113 = new class90();
                        var113.field679 = var12;
                        var113.field683 = var12.field3526;
                        field2646.method14959(var113);
                     }

                     if (field2524 > var12.field3555 && var12.field3528 != null) {
                        class90 var114 = new class90();
                        var114.field679 = var12;
                        var114.field683 = var12.field3528;
                        field2646.method14959(var114);
                     }

                     if (field2481 > var12.field3555 && var12.field3529 != null) {
                        class90 var115 = new class90();
                        var115.field679 = var12;
                        var115.field683 = var12.field3529;
                        field2646.method14959(var115);
                     }

                     if (field2638 > var12.field3555 && var12.field3496 != null) {
                        class90 var116 = new class90();
                        var116.field679 = var12;
                        var116.field683 = var12.field3496;
                        field2646.method14959(var116);
                     }

                     if (field2639 > var12.field3555 && var12.field3387 != null) {
                        class90 var117 = new class90();
                        var117.field679 = var12;
                        var117.field683 = var12.field3387;
                        field2646.method14959(var117);
                     }

                     if (field2611 > var12.field3555 && var12.field3533 != null) {
                        class90 var118 = new class90();
                        var118.field679 = var12;
                        var118.field683 = var12.field3533;
                        field2646.method14959(var118);
                     }

                     if (field2641 > var12.field3555 && var12.field3414 != null) {
                        class90 var119 = new class90();
                        var119.field679 = var12;
                        var119.field683 = var12.field3414;
                        field2646.method14959(var119);
                     }

                     var12.field3555 = field2447;
                     if (var12.field3527 != null) {
                        for(int var120 = 0; var120 < field2437; ++var120) {
                           class90 var121 = new class90();
                           var121.field679 = var12;
                           var121.field684 = field2438[var120].method1297();
                           var121.field677 = field2438[var120].method1296();
                           var121.field683 = var12.field3527;
                           field2646.method14959(var121);
                        }
                     }

                     if (field2528 && var12.field3536 != null) {
                        class90 var122 = new class90();
                        var122.field679 = var12;
                        var122.field683 = var12.field3536;
                        field2646.method14959(var122);
                     }
                  }

                  if (var12.field3402 == 5 && var12.field3542 != -1) {
                     var12.method5866(Statics.field7125, Statics.field6768).method9469(Statics.field8847, var12.field3557, Statics.field9361.field970.method2189());
                  }

                  Statics.method389(var12);
                  if (var12.field3402 == 0) {
                     method4567(arg0, arg1, var12.field3465, var15, var16, var17, var18, var13 - var12.field3400, var14 - var12.field3425, arg9, arg10);
                     if (var12.field3552 != null) {
                        method4567(arg0, var12.field3552, var12.field3465, var15, var16, var17, var18, var13 - var12.field3400, var14 - var12.field3425, arg9, arg10);
                     }

                     class118 var123 = (class118)field2594.method15322((long)var12.field3465);
                     if (var123 != null) {
                        if (field2584 == class801.field7297 && var123.field910 == 0 && !class987.field10492 && var23 && !field2599) {
                           class987.method5514();
                        }

                        method8977(var123, var123.field911, var15, var16, var17, var18, var13, var14, arg9, arg10);
                     }
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ok.kp(III)V")
   public static final void method10317(int arg0, int arg1) {
      if (class425.method4009(arg0, (int[])null)) {
         method7976(Statics.field844[arg0].field3569, arg1);
      }
   }

   @deob.ObfuscatedName("jm.ki([Lem;II)V")
   private static final void method7976(class425[] arg0, int arg1) {
      for(int var2 = 0; var2 < arg0.length; ++var2) {
         class425 var3 = arg0[var2];
         if (var3 != null) {
            if (var3.field3402 == 0) {
               if (var3.field3552 != null) {
                  method7976(var3.field3552, arg1);
               }

               class118 var4 = (class118)field2594.method15322((long)var3.field3465);
               if (var4 != null) {
                  method10317(var4.field911, arg1);
               }
            }

            if (arg1 == 0 && var3.field3416 != null) {
               class90 var5 = new class90();
               var5.field679 = var3;
               var5.field683 = var3.field3416;
               class783.method15429(var5);
            }

            if (arg1 == 1 && var3.field3464 != null) {
               if (var3.field3401 >= 0) {
                  class425 var6 = class425.method11190(var3.field3465);
                  if (var6 == null || var6.field3551 == null || var3.field3401 >= var6.field3551.length || var6.field3551[var3.field3401] != var3) {
                     continue;
                  }
               }

               class90 var7 = new class90();
               var7.field679 = var3;
               var7.field683 = var3.field3464;
               class783.method15429(var7);
            }
         }
      }

   }

   @deob.ObfuscatedName("ms.kf(Lem;III)V")
   public static final void method9461(class425 arg0, int arg1, int arg2) {
      if (field2501 == null && !class987.field10492) {
         if (arg0 != null && method15218(arg0)) {
            field2501 = arg0;
            field2604 = method6240(arg0);
            field2605 = arg1;
            field2606 = arg2;
            Statics.field3877 = 0;
            field2616 = false;
         }
      }
   }

   @deob.ObfuscatedName("ny.kc(I)V")
   private static final void method10102() {
      method7309(field2501);
      ++Statics.field3877;
      if (field2613 && field2512) {
         int var0 = Statics.field336.method1896();
         int var1 = Statics.field336.method1897();
         int var2 = var0 - field2605;
         int var3 = var1 - field2606;
         if (var2 < field2570) {
            var2 = field2570;
         }

         if (field2501.field3405 + var2 > field2572 + field2570) {
            var2 = field2572 + field2570 - field2501.field3405;
         }

         if (var3 < field2610) {
            var3 = field2610;
         }

         if (field2501.field3557 + var3 > field2610 + field2609) {
            var3 = field2610 + field2609 - field2501.field3557;
         }

         int var4;
         int var5;
         if (field2604 == Statics.field5928) {
            var4 = var2;
            var5 = var3;
         } else {
            var4 = field2604.field3400 + (var2 - field2570);
            var5 = field2604.field3425 + (var3 - field2610);
         }

         if (!Statics.field336.method10364()) {
            if (field2616) {
               method14495();
               if (field2501.field3502 != null) {
                  class90 var6 = new class90();
                  var6.field679 = field2501;
                  var6.field680 = var4;
                  var6.field681 = var5;
                  var6.field685 = field2607;
                  var6.field683 = field2501.field3502;
                  class783.method15429(var6);
               }

               if (field2607 != null && method4569(field2501) != null) {
                  method9886(field2501, field2607);
               }
            } else if ((field2583 == 1 || class987.method896()) && class987.field10501 > 2) {
               class987.method5483(field2614 + field2605, field2621 + field2606);
            } else if (class987.method7372()) {
               class987.method5483(field2614 + field2605, field2621 + field2606);
            }

            field2501 = null;
            field2604 = null;
         } else {
            if (Statics.field3877 > field2501.field3556) {
               int var7 = var2 - field2614;
               int var8 = var3 - field2621;
               if (var7 > field2501.field3493 || var7 < -field2501.field3493 || var8 > field2501.field3493 || var8 < -field2501.field3493) {
                  field2616 = true;
               }
            }

            if (field2501.field3506 != null && field2616) {
               class90 var9 = new class90();
               var9.field679 = field2501;
               var9.field680 = var4;
               var9.field681 = var5;
               var9.field683 = field2501.field3506;
               class783.method15429(var9);
            }
         }

      } else {
         if (Statics.field3877 > 1) {
            field2501 = null;
            field2604 = null;
         }

      }
   }

   @deob.ObfuscatedName("ic.kh(Lem;I)V")
   public static void method7309(class425 arg0) {
      if (field2652 == arg0.field3497) {
         field2558[arg0.field3562] = true;
      }

   }

   @deob.ObfuscatedName("aac.kj(B)V")
   public static void method208() {
      for(int var0 = 0; var0 < 103; ++var0) {
         field2558[var0] = true;
      }

   }

   @deob.ObfuscatedName("fe.km(Lem;I)Lem;")
   private static class425 method6240(class425 arg0) {
      class425 var1 = method4569(arg0);
      if (var1 == null) {
         var1 = arg0.field3492;
      }

      return var1;
   }

   @deob.ObfuscatedName("uo.ku(Lem;I)Z")
   private static boolean method15218(class425 arg0) {
      class58 var1 = method4871(arg0);
      if (var1.method901() > 0) {
         return true;
      } else if (var1.method903()) {
         return true;
      } else {
         return arg0.field3492 != null;
      }
   }

   @deob.ObfuscatedName("ty.kd([Ljava/lang/String;I)[Ljava/lang/String;")
   public static final String[] method15055(String[] arg0) {
      String[] var1 = new String[5];

      for(int var2 = 0; var2 < 5; ++var2) {
         var1[var2] = var2 + " ";
         if (arg0 != null && arg0[var2] != null) {
            var1[var2] = var1[var2] + arg0[var2];
         }
      }

      return var1;
   }

   @deob.ObfuscatedName("dq.ka(I[IS)V")
   private static final void method5513(int arg0, int[] arg1) {
      if (class425.method4009(arg0, arg1)) {
         class425[] var2 = Statics.field844[arg0].field3569;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class425 var4 = var2[var3];
            if (var4 != null && var4.field3550 != null) {
               var4.field3550.method14761();
            }
         }

      }
   }

   @deob.ObfuscatedName("wt.kr(II)V")
   private static final void method15914(int arg0) {
      if (class425.method4009(arg0, (int[])null)) {
         method6857(Statics.field844[arg0].field3569, -1);
      }
   }

   @deob.ObfuscatedName("gq.kx([Lem;IB)V")
   private static final void method6857(class425[] arg0, int arg1) {
      for(int var2 = 0; var2 < arg0.length; ++var2) {
         class425 var3 = arg0[var2];
         if (var3 != null && var3.field3462 == arg1 && !method4968(var3)) {
            if (var3.field3402 == 0) {
               method6857(arg0, var3.field3465);
               if (var3.field3552 != null) {
                  method6857(var3.field3552, var3.field3465);
               }

               class118 var4 = (class118)field2594.method15322((long)var3.field3465);
               if (var4 != null) {
                  method15914(var4.field911);
               }
            }

            if (var3.field3402 == 6 && var3.field3549 != -1) {
               if (var3.field3550 == null) {
                  var3.field3550 = new class169();
                  var3.field3550.method14694(var3.field3549);
               }

               if (var3.field3550.method14711(field2505) && var3.field3550.method14707()) {
                  var3.field3550.method14761();
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("pg.kb(II)V")
   private static final void method10717(int arg0) {
      Statics.method15952();
      int var1 = Statics.field8710.method7908(arg0).field4903;
      if (var1 != 0) {
         int var2 = Statics.field10637.field3651[arg0];
         if (var1 == 5) {
            field2583 = var2;
         }

         if (var1 == 6) {
            field2691 = var2;
         }

      }
   }

   @deob.ObfuscatedName("av.kn(Lem;S)V")
   private static final void method4056(class425 arg0) {
      if (class425.field3378 == arg0.field3544) {
         if (Statics.field5701.field1381 == null) {
            arg0.field3498 = 0;
            arg0.field3444 = 0;
            return;
         }

         arg0.field3394 = 150;
         arg0.field3415 = (int)(Math.sin((double)field2418 / 40.0D) * 256.0D) & 2047;
         arg0.field3442 = 5;
         arg0.field3498 = field2452;
         arg0.field3444 = class816.method9839(Statics.field5701.field1381);
         class183 var1 = Statics.field5701.field35;
         if (var1 != null) {
            if (arg0.field3550 == null) {
               arg0.field3550 = new class169();
            }

            arg0.field3549 = var1.method14716();
            arg0.field3550.method14757(var1);
         } else {
            arg0.field3550 = null;
         }
      }

   }

   @deob.ObfuscatedName("mt.kw(ZI)V")
   public static final void method9491(boolean arg0) {
      class109 var1 = class109.method15110(ClientProt.CLOSE_MODAL, field2463.field832);
      field2463.method1408(var1);

      for(class118 var2 = (class118)field2594.method15313(); var2 != null; var2 = (class118)field2594.method15314()) {
         if (!var2.method9863()) {
            var2 = (class118)field2594.method15313();
            if (var2 == null) {
               break;
            }
         }

         if (var2.field910 == 0) {
            Statics.method689(var2, true, arg0);
         }
      }

      if (field2596 != null) {
         method7309(field2596);
         field2596 = null;
      }

   }

   @deob.ObfuscatedName("te.ko(ILaeh;[IZI)Laeh;")
   public static final class118 method14630(int arg0, class118 arg1, int[] arg2, boolean arg3) {
      class118 var4 = (class118)field2594.method15322((long)arg0);
      if (var4 != null) {
         Statics.method689(var4, arg1.field911 != var4.field911, arg3);
      }

      field2594.method15311(arg1, (long)arg0);
      method5513(arg1.field911, arg2);
      class425 var5 = class425.method11190(arg0);
      if (var5 != null) {
         method7309(var5);
      }

      if (field2596 != null) {
         method7309(field2596);
         field2596 = null;
      }

      class987.method4005();
      if (var5 != null) {
         method8010(Statics.field844[var5.field3465 >>> 16], var5, !arg3);
      }

      if (!arg3) {
         class783.method10196(arg1.field911, arg2);
      }

      if (!arg3 && field2593 != -1) {
         method10317(field2593, 1);
      }

      return arg1;
   }

   @deob.ObfuscatedName("qo.kv(Lem;III)V")
   private static void method11279(class425 arg0, int arg1, int arg2) {
      class436 var3 = arg0.method5824(Statics.field8847);
      if (var3 != null) {
         Statics.field8847.method7716(arg1, arg2, arg0.field3405 + arg1, arg0.field3557 + arg2);
         if (class299.field1882 < 3) {
            int var4;
            if (Statics.field5998 == 2) {
               var4 = (int)((double)Statics.field6895.method6425() * 2607.5945876176133D);
            } else {
               var4 = (int)(-field2502);
            }

            int var5 = field2519 * 2 + var4 & 16383;
            int var6 = var5 << 2;
            Statics.field340.method5255((float)arg0.field3405 / 2.0F + (float)arg1, (float)arg0.field3557 / 2.0F + (float)arg2, 4161, var6, var3.field3624, arg1, arg2);
         } else {
            Statics.field8847.method7593(-16777216, var3.field3624, arg1, arg2);
         }

      }
   }

   @deob.ObfuscatedName("af.kg(Ljava/lang/String;B)I")
   public static final int method2052(String arg0) {
      if (arg0 == null) {
         return -1;
      } else {
         for(int var1 = 0; var1 < field2694; ++var1) {
            if (arg0.equalsIgnoreCase(field2697[var1].field9601)) {
               return var1;
            }
         }

         return -1;
      }
   }

   @deob.ObfuscatedName("vn.ky(Ljava/lang/String;I)I")
   public static final int method15557(String arg0) {
      if (arg0 != null && arg0.length() != 0) {
         for(int var1 = 0; var1 < field2699; ++var1) {
            if (arg0.equalsIgnoreCase(field2701[var1].field9244)) {
               return var1;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @deob.ObfuscatedName("ev.ke(Ljava/lang/String;B)Z")
   public static boolean method6111(String arg0) {
      if (arg0 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < field2694; ++var1) {
            if (arg0.equalsIgnoreCase(field2697[var1].field9601)) {
               return true;
            }
         }

         if (arg0.equalsIgnoreCase(Statics.field5701.field1381)) {
            return true;
         } else {
            return false;
         }
      }
   }

   @deob.ObfuscatedName("tk.ks(Ljava/lang/String;I)Z")
   public static boolean method14784(String arg0) {
      if (arg0 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < field2699; ++var1) {
            class906 var2 = field2701[var1];
            if (arg0.equalsIgnoreCase(var2.field9244)) {
               return true;
            }

            if (arg0.equalsIgnoreCase(var2.field9245)) {
               return true;
            }
         }

         return false;
      }
   }

   @deob.ObfuscatedName("rx.kl(Ljava/lang/String;II)V")
   public static final void method14202(String arg0, int arg1) {
      class110 var2 = Statics.method8951();
      class109 var3 = class109.method15110(ClientProt.FRIEND_SETRANK, var2.field832);
      var3.field814.method1568(1 + class124.method1229(arg0));
      var3.field814.method1577(arg0);
      var3.field814.method1616(arg1);
      var2.method1408(var3);
   }

   @deob.ObfuscatedName("de.le(B)V")
   public static final void method5382() {
      class110 var0 = Statics.method8951();
      class109 var1 = class109.method15110(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var0.field832);
      var1.field814.method1568(0);
      var0.method1408(var1);
   }

   @deob.ObfuscatedName("ti.lo(ZIB)V")
   public static final void method14682(boolean arg0, int arg1) {
      class84 var2 = arg0 ? Statics.field4336 : Statics.field3822;
      if (var2 != null && arg1 >= 0 && arg1 < var2.field622) {
         class472 var3 = var2.field621[arg1];
         if (var3.field3852 == -1) {
            String var4 = var3.field3851;
            class110 var5 = Statics.method8951();
            class109 var6 = class109.method15110(ClientProt.CLANCHANNEL_KICK_USER, var5.field832);
            var6.field814.method1568(3 + class124.method1229(var4));
            var6.field814.method1568(arg0 ? 1 : 0);
            var6.field814.method1569(arg1);
            var6.field814.method1577(var4);
            var5.method1408(var6);
         }
      }
   }

   @deob.ObfuscatedName("ye.lg(II)V")
   public static final void method16090(int arg0) {
      if (Statics.field4336 != null) {
         if (arg0 >= 0 && arg0 < Statics.field4336.field622) {
            class472 var1 = Statics.field4336.field621[arg0];
            if (var1.field3852 == -1) {
               class110 var2 = Statics.method8951();
               class109 var3 = class109.method15110(ClientProt.AFFINED_CLANSETTINGS_ADD_BANNED_FROM_CHANNEL, var2.field832);
               var3.field814.method1568(2 + class124.method1229(var1.field3851));
               var3.field814.method1569(arg0);
               var3.field814.method1577(var1.field3851);
               var2.method1408(var3);
            }
         }
      }
   }

   @deob.ObfuscatedName("ly.lw(Ljava/lang/String;I)V")
   public static final void method9176(String arg0) {
      if (arg0 != null) {
         if ((field2694 < 200 || field2722) && field2694 < 200) {
            String var1 = class930.method8532(arg0);
            if (var1 != null) {
               for(int var2 = 0; var2 < field2694; ++var2) {
                  class960 var3 = field2697[var2];
                  String var4 = class930.method8532(var3.field9601);
                  if (var4 != null && var4.equals(var1)) {
                     class419.method10919(4, arg0 + class881.field9027.method15374(Statics.field243));
                     return;
                  }

                  if (var3.field9599 != null) {
                     String var5 = class930.method8532(var3.field9599);
                     if (var5 != null && var5.equals(var1)) {
                        class419.method10919(4, arg0 + class881.field9027.method15374(Statics.field243));
                        return;
                     }
                  }
               }

               for(int var6 = 0; var6 < field2699; ++var6) {
                  class906 var7 = field2701[var6];
                  String var8 = class930.method8532(var7.field9244);
                  if (var8 != null && var8.equals(var1)) {
                     class419.method10919(4, class881.field9028.method15374(Statics.field243) + arg0 + class881.field9034.method15374(Statics.field243));
                     return;
                  }

                  if (var7.field9245 != null) {
                     String var9 = class930.method8532(var7.field9245);
                     if (var9 != null && var9.equals(var1)) {
                        class419.method10919(4, class881.field9028.method15374(Statics.field243) + arg0 + class881.field9034.method15374(Statics.field243));
                        return;
                     }
                  }
               }

               if (class930.method8532(Statics.field5701.field1381).equals(var1)) {
                  class419.method10919(4, class881.field8902.method15374(Statics.field243));
               } else {
                  class110 var10 = Statics.method8951();
                  class109 var11 = class109.method15110(ClientProt.FRIENDLIST_ADD, var10.field832);
                  var11.field814.method1568(class124.method1229(arg0));
                  var11.field814.method1577(arg0);
                  var10.method1408(var11);
               }
            }
         } else {
            class419.method10919(4, class881.field8918.method15374(Statics.field243));
         }
      }
   }

   @deob.ObfuscatedName("wi.lk(Ljava/lang/String;B)V")
   public static final void method15815(String arg0) {
      if (arg0 != null) {
         String var1 = class930.method8532(arg0);
         if (var1 != null) {
            for(int var2 = 0; var2 < field2694; ++var2) {
               class960 var3 = field2697[var2];
               String var4 = var3.field9601;
               String var5 = class930.method8532(var4);
               if (class435.method5506(arg0, var1, var4, var5)) {
                  --field2694;

                  for(int var6 = var2; var6 < field2694; ++var6) {
                     field2697[var6] = field2697[var6 + 1];
                  }

                  field2524 = field2447;
                  class110 var7 = Statics.method8951();
                  class109 var8 = class109.method15110(ClientProt.FRIENDLIST_DEL, var7.field832);
                  var8.field814.method1568(class124.method1229(arg0));
                  var8.field814.method1577(arg0);
                  var7.method1408(var8);
                  break;
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("r.li(Ljava/lang/String;B)V")
   public static final void method11492(String arg0) {
      if (arg0 != null) {
         String var1 = class930.method8532(arg0);
         if (var1 != null) {
            for(int var2 = 0; var2 < field2699; ++var2) {
               class906 var3 = field2701[var2];
               String var4 = var3.field9244;
               String var5 = class930.method8532(var4);
               if (class435.method5506(arg0, var1, var4, var5)) {
                  --field2699;

                  for(int var6 = var2; var6 < field2699; ++var6) {
                     field2701[var6] = field2701[var6 + 1];
                  }

                  field2524 = field2447;
                  class110 var7 = Statics.method8951();
                  class109 var8 = class109.method15110(ClientProt.IGNORELIST_DEL, var7.field832);
                  var8.field814.method1568(class124.method1229(arg0));
                  var8.field814.method1577(arg0);
                  var7.method1408(var8);
                  break;
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("oj.lu(II)V")
   public static void method10309(int arg0) {
      for(class674 var1 = field2649.method15313(); var1 != null; var1 = field2649.method15314()) {
         if ((long)arg0 == (var1.field6137 >> 48 & 65535L)) {
            var1.method9864();
         }
      }

   }

   @deob.ObfuscatedName("client.lb(Lem;)Lacb;")
   public static class58 method4871(class425 arg0) {
      class58 var1 = (class58)field2649.method15322(((long)arg0.field3465 << 32) + (long)arg0.field3401);
      return var1 != null ? var1 : arg0.field3477;
   }

   @deob.ObfuscatedName("client.lq(Lem;)Lem;")
   private static class425 method4569(class425 arg0) {
      class58 var1 = method4871(arg0);
      if (var1.method903()) {
         return Statics.field5928;
      } else {
         int var2 = var1.method901();
         if (var2 == 0) {
            return null;
         } else {
            for(int var3 = 0; var3 < var2; ++var3) {
               arg0 = method17098(Statics.method3348(arg0.field3465), arg0);
               if (arg0 == null) {
                  return Statics.field5928;
               }
            }

            return arg0;
         }
      }
   }

   @deob.ObfuscatedName("client.lp(Lem;)Z")
   private static boolean method4968(class425 arg0) {
      if (field2599) {
         if (method4871(arg0).field432 != 0) {
            return false;
         }

         if (arg0.field3402 == 0) {
            return false;
         }
      }

      return arg0.field3419;
   }

   @deob.ObfuscatedName("tp.lh(Lem;II)I")
   public static int method14837(class425 arg0, int arg1) {
      if (!method4871(arg0).method899(arg1) && arg0.field3523 == null) {
         return -1;
      } else {
         return arg0.field3446 != null && arg0.field3446.length > arg1 ? arg0.field3446[arg1] : -1;
      }
   }

   @deob.ObfuscatedName("n.ls(Lem;I)Ljava/lang/String;")
   public static String method9706(class425 arg0) {
      if (method4871(arg0).method911() == 0) {
         return null;
      } else if (arg0.field3490 != null && arg0.field3490.trim().length() != 0) {
         return arg0.field3490;
      } else {
         return field2599 ? "Hidden-use" : null;
      }
   }

   @deob.ObfuscatedName("gs.lr(I)Z")
   private static boolean method6863() {
      ++field2465;
      field2533 = true;
      return true;
   }

   @deob.ObfuscatedName("wk.lx(I)V")
   private static void method15827() {
      class109 var0 = class109.method15110(ClientProt.TRANSMITVAR_VERIFYID, field2463.field832);
      var0.field814.method1572(field2465);
      field2463.method1408(var0);
   }

   @deob.ObfuscatedName("ks.lz(Ljava/lang/String;ZB)V")
   public static void method8551(String arg0, boolean arg1) {
      Statics.method3115(arg0, arg1, -1, -1);
   }

   @deob.ObfuscatedName("ab.lm(Ljava/lang/String;ZI)V")
   public static void method484(String arg0, boolean arg1) {
      String var2 = arg0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;
      int var5 = arg1 ? 32768 : 0;
      int var6 = (arg1 ? Statics.field8477.field9231 : Statics.field8477.field9230) + var5;

      for(int var7 = var5; var7 < var6; ++var7) {
         class270 var8 = Statics.field8477.method15712(var7);
         if (var8.field1791 && var8.method3579().toLowerCase().indexOf(var2) != -1) {
            if (var4 >= 50) {
               Statics.field6134 = -1;
               Statics.field3776 = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var9 = new short[var3.length * 2];

               for(int var10 = 0; var10 < var4; ++var10) {
                  var9[var10] = var3[var10];
               }

               var3 = var9;
            }

            var3[var4++] = (short)var7;
         }
      }

      Statics.field3776 = var3;
      Statics.field5278 = 0;
      Statics.field6134 = var4;
      String[] var11 = new String[Statics.field6134];

      for(int var12 = 0; var12 < Statics.field6134; ++var12) {
         var11[var12] = Statics.field8477.method15712(var3[var12]).method3579();
      }

      class781.method6468(var11, Statics.field3776);
   }

   @deob.ObfuscatedName("sj.ld(J)Ljava/lang/String;")
   private static String method14345(long arg0) {
      return class418.method5730(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
   }

   @deob.ObfuscatedName("vd.lt(Ljava/lang/String;I)V")
   private static void method15430(String arg0) {
      field2626 = arg0;
      if (class671.method11178() != class686.field6209) {
         try {
            String var1 = Statics.field6978.getParameter(class563.field4928.field4944);
            String var2 = Statics.field6978.getParameter(class563.field4929.field4944);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
               var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               var4 = var3 + "; Expires=" + method14345(class431.method2169() + 94608000000L) + "; Max-Age=" + 94608000L;
            }

            class855.method15071(Statics.field6978, "document.cookie=\"" + var4 + "\"");
         } catch (Throwable var6) {
         }

      }
   }

   @deob.ObfuscatedName("aal.lv(I)Ljava/lang/String;")
   public static String method366() {
      String var0 = "www";
      if (class819.field8434 == Statics.field4896) {
         var0 = "www-wtrc";
      } else if (class819.field8431 == Statics.field4896) {
         var0 = "www-wtqa";
      } else if (class819.field8432 == Statics.field4896) {
         var0 = "www-wtwip";
      } else if (class819.field8429 == Statics.field4896) {
         var0 = "www-wti";
      }

      String var1 = "";
      if (field2626 != null) {
         var1 = "/p=" + field2626;
      }

      String var2 = field2584.field7302 + ".com";
      return "http://" + var0 + "." + var2 + "/l=" + Statics.field243 + "/a=" + field2393 + var1 + "/";
   }

   @deob.ObfuscatedName("n.ln(IIIIIILjava/lang/String;I)V")
   public static void method9707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
      class74 var7 = new class74();
      var7.field541 = arg0;
      var7.field537 = arg1;
      var7.field542 = arg2;
      var7.field540 = field2418 + arg4;
      var7.field539 = arg3;
      var7.field536 = arg6;
      var7.field538 = arg5;
      field2590.method14795(var7);
   }

   @deob.ObfuscatedName("vw.ll(IIIIIIIIIIIIIIZII)V")
   private static void method15707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15) {
      if (arg1 != 0 && arg3 != -1) {
         class4 var16 = null;
         if (arg1 < 0) {
            int var17 = -arg1 - 1;
            if (field2452 == var17) {
               var16 = Statics.field5701;
            } else {
               var16 = field2408[var17];
            }
         } else {
            int var18 = arg1 - 1;
            class106 var19 = (class106)field2615.method15322((long)var18);
            if (var19 != null) {
               var16 = (class4)var19.field807;
            }
         }

         if (var16 != null) {
            class743 var20 = var16.method101();
            if (var20.field6839 != null && var20.field6839[arg3] != null) {
               arg4 -= var20.field6839[arg3][1];
            }

            if (var20.field6840 != null && var20.field6840[arg3] != null) {
               arg4 -= var20.field6840[arg3][1];
            }
         }
      }

      class312 var21 = new class312(field2468.method9639(), arg0, Statics.field9623, Statics.field9623, arg6, arg7, arg4, field2418 + arg10, field2418 + arg11, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
      var21.method3914(arg8, arg9, method5777(arg8, arg9, Statics.field9623) - arg5, field2418 + arg10);
      field2577.method14959(new class246(var21));
   }
}

