/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  org.apache.logging.log4j.Level
 *  org.apache.logging.log4j.LogManager
 *  paulscode.sound.SoundSystem
 */
package customsteve;

import customsteve.E;
import customsteve.ModContainer;
import customsteve.aS;
import customsteve.aZ;
import customsteve.a_0;
import customsteve.ac;
import customsteve.ad_0;
import customsteve.ae;
import customsteve.ae_0;
import customsteve.af;
import customsteve.ap_0;
import customsteve.aw;
import customsteve.b_0;
import customsteve.bc;
import customsteve.e_0;
import customsteve.jni.CS_Bullet;
import customsteve.k;
import customsteve.l;
import customsteve.n_0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import paulscode.sound.SoundSystem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.a
 */
public class a_0 {
    public e_0 a;
    public int a;
    private int c;
    public k a;
    public String a;
    public ArrayList<l> a;
    public ArrayList<l> b;
    public static SoundSystem sndSystem = null;
    public String b;
    public b a;
    private Timer a;
    private Timer b;
    private Timer c;
    private Timer d;
    public final ConcurrentHashMap a;
    public static a_0 instance;
    private HashMap<String, k> a;
    private HashMap<String, ae> b;
    public CS_Bullet a;
    public boolean a;
    public boolean b;
    public boolean c;
    public ArrayList<aS> c = false;
    public ArrayList<String[]> d;
    public ae a;
    public static ResourceLocation[] a;
    public LinkedList<String> a;
    private static final String c = "CustomSteve is Copyright 2014 by ici2cc(also ici2cc.com owner\u3002 email:fengxingssdua@yeah.net)";
    public static n_0 a;
    public int b = false;
    public long a;
    private int d = 0;
    private d a = null;

    public a_0() {
        this.b = new ArrayList();
        this.a = new ConcurrentHashMap();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = (int)new ArrayList();
        this.d = new ArrayList();
        this.a = new LinkedList();
        this.b = b_0.j == 0 ? 30 : 60;
        this.a = (long)(Double.valueOf(1000.0) / Double.valueOf(this.b) * 1000000.0);
        ((ArrayList)((Object)this.d)).add(new String[]{"holdBow_UP.vmd", "useBow_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"holdStick_UP.vmd", "wavingStick_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"holdBlock_UP.vmd", "wavingItem_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"barehanded_UP.vmd", "punchLeft_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"barehanded_UP.vmd", "punchRight_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"barehanded_UP.vmd", "punchUp_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"punchRight_UP.vmd", "punchLeft_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"punchLeft_UP.vmd", "punchUp_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"punchRight_UP.vmd", "punchUp_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"M134_running_UP.vmd", "M134_auto_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"M134_auto_UP.vmd", "M134_running_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"M134_hold_UP.vmd", "M134_running_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"M134_running_UP.vmd", "M134_hold_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"M134_auto_UP.vmd", "M134_hold_UP.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"M134_hold_UP.vmd", "M134_auto_UP.vmdd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"waveSword.vmd", "waveSword_c1.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"holdFullSword.vmd", "drawSword.vmd"});
        ((ArrayList)((Object)this.d)).add(new String[]{"holdSword.vmd", "resetSword.vmd"});
        instance = this;
        if (!b_0.f && E.a == null) {
            E.a = new E();
        }
        int i2 = 0;
        while (true) {
            if (i2 >= a.length) break;
            a_0.a[i2] = i2 == 0 ? new ResourceLocation("/CustomSteve/toon/toon0.bmp") : (i2 < 10 ? new ResourceLocation("/CustomSteve/toon/toon0" + i2 + ".bmp") : new ResourceLocation("/CustomSteve/toon/toon" + i2 + ".bmp"));
            this.a(a[i2]);
            ++i2;
        }
        this.a.d();
        this.i();
    }

    public void a() {
        ArrayList rmList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            ad_0 o2 = (ad_0)entry.getValue();
            if (o2 == null || !o2.b) continue;
            if (o2.b > 5) {
                o2.b();
                rmList.add(entry.getKey());
                continue;
            }
            ++o2.b;
        }
        for (ad_0 o2 : rmList) {
            this.a.remove(o2);
        }
        rmList.clear();
    }

    public void b() {
        if (!b_0.c) {
            return;
        }
        try {
            k csp;
            ap_0 loc = new ap_0(0.0f, 0.0f, 0.0f);
            boolean jump = true;
            for (Map.Entry e2 : ((HashMap)((Object)this.a)).entrySet()) {
                jump = false;
                csp = (k)e2.getValue();
                if (csp.c || ((bc.a)((Object)csp.a)).f || csp.a == null || csp.l != -1) continue;
                a_0.instance.a.b((ac)((Object)csp.a), csp.a);
            }
            if (!jump) {
                a_0.instance.a.b();
                for (Map.Entry e2 : ((HashMap)((Object)this.a)).entrySet()) {
                    csp = (k)e2.getValue();
                    if (csp.c || ((bc.a)((Object)csp.a)).f || csp.a == null || csp.l != -1) continue;
                    a_0.instance.a.c((ac)((Object)csp.a), csp.a);
                }
            }
        }
        catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public synchronized void a(String info) {
        if (((LinkedList)((Object)this.a)).contains(info)) {
            return;
        }
        if (((LinkedList)((Object)this.a)).size() > 50) {
            ((LinkedList)((Object)this.a)).removeLast();
        }
        ((LinkedList)((Object)this.a)).addFirst(info);
    }

    public HashMap<String, k> a() {
        return this.a;
    }

    public void c() {
        for (Map.Entry e2 : ((HashMap)((Object)this.a)).entrySet()) {
            a_0.instance.a.a((ac)((Object)((k)e2.getValue()).a));
        }
    }

    public ae a(String path) {
        if (path == null || path.isEmpty()) {
            return null;
        }
        ae ani = this.b(path);
        if (ani == null) {
            ae rvfi = null;
            try {
                rvfi = this.c(path);
            }
            catch (Exception e2) {
                e2.printStackTrace();
                rvfi = ae.a;
            }
            this.a(path, rvfi);
            return rvfi;
        }
        return ani;
    }

    public ArrayList<String[]> a(String basePath, String suffix, int limit, String prefix) {
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        File dir = new File(ModContainer.b + "/" + basePath);
        if (!dir.exists() || !dir.isDirectory()) {
            return arrayList;
        }
        for (File file : dir.listFiles()) {
            if (!file.getName().toLowerCase().endsWith(suffix)) continue;
            arrayList.add(new String[]{prefix + file.getName(), basePath + file.getName()});
        }
        return arrayList;
    }

    public ArrayList<String[]> a(String basePath, String ... suffix) {
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        File dir = new File(basePath);
        if (!dir.exists() || !dir.isDirectory()) {
            return arrayList;
        }
        block0: for (File file : dir.listFiles()) {
            String name = file.getName().toLowerCase();
            for (String s : suffix) {
                if (!name.endsWith(s)) continue;
                arrayList.add(new String[]{file.getName(), basePath});
                continue block0;
            }
        }
        return arrayList;
    }

    public void a(String path, ae vfi) {
        ((HashMap)((Object)this.b)).put(path, vfi);
    }

    public void d() {
        ((HashMap)((Object)this.b)).clear();
    }

    public int a() {
        return ((HashMap)((Object)this.b)).size();
    }

    public k a(ap_0 loc, String username, boolean block) {
        if (username == null || username.isEmpty()) {
            return null;
        }
        k rcsp = null;
        if (rcsp == null) {
            rcsp = this.a(username);
            if (rcsp != null) {
                return rcsp;
            }
            if (!username.equals(ModContainer.a.c)) {
                l cspMP = null;
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    l c2 = this.b.get(i2);
                    if (!c2.a.equals(username)) continue;
                    cspMP = c2;
                    break;
                }
                if (cspMP != null) {
                    if (!cspMP.b) {
                        return null;
                    }
                    k rcscp = new k(username, cspMP.c);
                    rcscp.b = "";
                    try {
                        rcscp.b = cspMP.c.substring(0, cspMP.c.length() - 4) + "/";
                    }
                    catch (StringIndexOutOfBoundsException e2) {
                        e2.printStackTrace();
                    }
                    rcscp.c = rcscp.b;
                    if (!block) {
                        rcscp.a(loc);
                        instance.a((bc)rcscp);
                        ++this.c;
                        rcscp.c = true;
                    }
                    this.a(rcscp);
                    return rcscp;
                }
            } else {
                k rcscp;
                this.a = rcscp = new k(username, ModContainer.a.b);
                rcscp.b = ModContainer.a.a;
                rcscp.c = "";
                try {
                    rcscp.c = rcscp.a.substring(0, rcscp.a.length() - 4) + "/";
                }
                catch (StringIndexOutOfBoundsException e3) {
                    e3.printStackTrace();
                }
                if (!block) {
                    rcscp.a(loc);
                    instance.a((bc)rcscp);
                    ++this.c;
                    rcscp.c = true;
                }
                this.a(rcscp);
                return rcscp;
            }
        }
        return null;
    }

    public int b() {
        return ((HashMap)((Object)this.a)).size();
    }

    public boolean a(k oldcsp, k csplayer, boolean lazyLoad) {
        boolean p2 = false;
        ap_0 loc = new ap_0(oldcsp.a);
        if (b_0.c) {
            b_0.c = false;
            p2 = true;
        }
        csplayer.a(loc);
        if (lazyLoad) {
            // empty if block
        }
        this.a.b(oldcsp);
        this.a.a(csplayer);
        b_0.c = p2;
        this.a(csplayer);
        if (oldcsp.l == -1) {
            oldcsp.b();
        }
        return true;
    }

    public k a(String username, boolean block) {
        return this.a(new ap_0(this.c * 10, this.c * 10, this.c * 10), username, block);
    }

    public k a(EntityLivingBase elb, String username, boolean block) {
        return this.a(new ap_0(this.c * 10, this.c * 10, this.c * 10), username, block);
    }

    public void a(k p2) {
        ((HashMap)((Object)this.a)).put(p2.e, p2);
    }

    public boolean a(k p2) {
        this.a.b(p2);
        this.b(p2);
        if (!b_0.f && p2.a != null && aZ.a() != null && p2.a != null) {
            aZ.a().a(p2.a);
        }
        return true;
    }

    private boolean b(k p2) {
        ((HashMap)((Object)this.a)).remove(p2.e);
        return true;
    }

    public boolean a(String name) {
        k csplayer = (k)((HashMap)((Object)this.a)).get(name);
        if (csplayer == null) {
            return false;
        }
        return this.b(csplayer);
    }

    private ae b(String path) {
        for (Map.Entry e2 : ((HashMap)((Object)this.b)).entrySet()) {
            if (!((String)e2.getKey()).equals(path)) continue;
            return (ae)e2.getValue();
        }
        return null;
    }

    public k a() {
        return this.a(((HashMap)((Object)this.a)).size() - 1);
    }

    public k a(int index) {
        int i2 = 0;
        for (Map.Entry e2 : ((HashMap)((Object)this.a)).entrySet()) {
            if (i2 == index) {
                return (k)e2.getValue();
            }
            ++i2;
        }
        return null;
    }

    public k a(String name) {
        for (Map.Entry e2 : ((HashMap)((Object)this.a)).entrySet()) {
            if (!((String)e2.getKey()).equals(name)) continue;
            return (k)e2.getValue();
        }
        return null;
    }

    public l a(String name) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (!this.b.get((int)i2).a.equals(name)) continue;
            return this.b.get(i2);
        }
        return null;
    }

    public void b(String name) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (!this.b.get((int)i2).a.equals(name)) continue;
            this.b.remove(i2);
            break;
        }
    }

    public String a(String path) {
        return null;
    }

    private ae c(String path) throws Exception {
        ae vfi = new af().a(new File(ModContainer.b + "/" + path));
        return vfi;
    }

    public void c(String aniPath) {
        for (int i2 = 0; i2 < ((ArrayList)((Object)this.a)).size(); ++i2) {
            l cspMP = (l)((ArrayList)((Object)this.a)).get(i2);
            k csp = this.a(cspMP.a);
            if (csp == null && (csp = this.a(cspMP.a, true)) == null) continue;
            this.a = 0;
            csp.i = true;
            ((bc.a)((Object)csp.a)).e = true;
            aniPath = aniPath.replace("CustomSteve/Animations/", "");
            String path = "";
            path = aniPath.contains("/") ? "CustomSteve/Animations/" + csp.b() + "/" + aniPath.split("/")[1] : "CustomSteve/Animations/" + aniPath;
            if (csp.e.equals(a_0.instance.a)) {
                a_0.instance.a = instance.a(path.replace(".vmd", "") + "_Camera.vmd");
                if (!new aw().a((ac)((Object)csp.a), a_0.instance.a)) {
                    a_0.instance.a = null;
                }
            }
            csp.a(path, 0);
            this.f();
        }
    }

    public void a(bc ro) {
        this.a.a(ro);
    }

    public void b(bc ro) {
        this.a.b(ro);
    }

    public int c() {
        return this.c;
    }

    public boolean b(String name) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (!this.b.get((int)i2).a.equals(name)) continue;
            return true;
        }
        return false;
    }

    public void e() {
        if (this.d == null) {
            return;
        }
        this.d.cancel();
        this.d.purge();
        this.d = null;
    }

    public void f() {
        if (this.a == null) {
            this.a = new Timer();
            c obj = new c(this, null);
            Thread t = new Thread(obj);
            t.start();
        }
    }

    public void g() {
        if (this.a == null) {
            return;
        }
        this.a.cancel();
        this.a.purge();
        if (this.b == null) {
            return;
        }
        this.b.cancel();
        this.b.purge();
        this.a = null;
        this.b = null;
    }

    public void a(int value, boolean isSub) {
        this.h();
        if (this.a == null) {
            this.a = new b(this, value, true);
        }
        if (this.c == null) {
            this.c = new Timer();
        }
        this.c.schedule((TimerTask)this.a, 0L, 1000L);
    }

    public void h() {
        if (this.c == null) {
            return;
        }
        this.c.cancel();
        this.c.purge();
        this.c = null;
        this.a = null;
    }

    public void a(ResourceLocation par1ResourceLocation) {
        a_0 csm = instance;
        ad_0 texture = (ad_0)csm.a.get(par1ResourceLocation);
        if (texture == null) {
            String fileType = par1ResourceLocation.getPath().toLowerCase();
            texture = fileType.endsWith(".tga") ? new ae_0(par1ResourceLocation) : new ad_0(par1ResourceLocation);
            this.a(par1ResourceLocation, texture);
        }
    }

    public boolean a(ResourceLocation par1ResourceLocation, ad_0 par2TextureObject) {
        boolean flag = true;
        try {
            par2TextureObject.c();
        }
        catch (IOException ioexception) {
            LogManager.getLogger().log(Level.WARN, "[IOException]Failed to load texture: " + par1ResourceLocation, (Throwable)ioexception);
            flag = false;
        }
        catch (Throwable throwable) {
            System.out.println("Failed to load texture: " + par1ResourceLocation);
            throwable.printStackTrace();
            return false;
        }
        a_0.instance.a.put(par1ResourceLocation, par2TextureObject);
        return flag;
    }

    public void i() {
        if (this.a == null) {
            this.a = new Timer();
            a obj = new a(this, null);
            Thread t = new Thread(obj);
            t.start();
            if (this.b == null) {
                this.b = new Timer();
            }
            this.a = new d(this);
            this.b.schedule((TimerTask)this.a, 0L, 1000L);
        }
    }

    public void j() {
        if (this.a == null) {
            return;
        }
        this.a.cancel();
        this.a.purge();
        if (this.b == null) {
            return;
        }
        this.b.cancel();
        this.b.purge();
    }

    static /* synthetic */ int a(a_0 x0) {
        return x0.d++;
    }

    static /* synthetic */ HashMap a(a_0 x0) {
        return x0.a;
    }

    static /* synthetic */ int b(a_0 x0) {
        return x0.d;
    }

    static /* synthetic */ int a(a_0 x0, int x1) {
        x0.d = x1;
        return x0.d;
    }

    static {
        a = new ResourceLocation[11];
        a = null;
    }
}

