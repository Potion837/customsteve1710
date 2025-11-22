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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import paulscode.sound.SoundSystem;

public class CSmanager {
    public AnimationPlayer keith$ = new AnimationPlayer(Config.filter$ == 0 ? 30 : 60);
    public int positive$ = 0;
    private int seminars$ = 0;
    public CSplayer trucks$ = null;
    public String soccer$ = "";
    public ArrayList roland$ = new ArrayList();
    public ArrayList browsing$ = new ArrayList();
    public static SoundSystem picked$ = null;
    public String updating$ = null;
    public CSmanager6 optimal$ = null;
    private Timer offering$ = null;
    private Timer zoning$ = null;
    private Timer former$ = null;
    private Timer flight$ = null;
    private CSmanager4 quarters$ = null;
    private CSmanager3 steady$ = null;
    public final ConcurrentHashMap beings$ = new ConcurrentHashMap();
    public static CSmanager cellular$;
    private HashMap laughing$ = new HashMap();
    private HashMap packard$ = new HashMap();
    public CS_Bullet december$;
    public boolean followed$ = false;
    public boolean finals$ = false;
    public boolean singles$ = false;
    public ArrayList laden$ = new ArrayList();
    public ArrayList works$ = new ArrayList();
    public VmdFileInfo glossary$ = null;
    public static ResourceLocation[] checks$;
    public LinkedList choose$ = new LinkedList();
    private static final String elected$ = "CustomSteve is Copyright 2014 by ici2cc(also ici2cc.com owner\u3002 email:fengxingssdua@yeah.net)";
    public static float alias$;
    public static float laugh$;
    public static QuickMotionSetting cities$;

    public CSmanager() {
        this.works$.add(new String[]{"holdBow_UP.vmd", "useBow_UP.vmd"});
        this.works$.add(new String[]{"holdStick_UP.vmd", "wavingStick_UP.vmd"});
        this.works$.add(new String[]{"holdBlock_UP.vmd", "wavingItem_UP.vmd"});
        this.works$.add(new String[]{"barehanded_UP.vmd", "punchLeft_UP.vmd"});
        this.works$.add(new String[]{"barehanded_UP.vmd", "punchRight_UP.vmd"});
        this.works$.add(new String[]{"barehanded_UP.vmd", "punchUp_UP.vmd"});
        this.works$.add(new String[]{"punchRight_UP.vmd", "punchLeft_UP.vmd"});
        this.works$.add(new String[]{"punchLeft_UP.vmd", "punchUp_UP.vmd"});
        this.works$.add(new String[]{"punchRight_UP.vmd", "punchUp_UP.vmd"});
        this.works$.add(new String[]{"M134_running_UP.vmd", "M134_auto_UP.vmd"});
        this.works$.add(new String[]{"M134_auto_UP.vmd", "M134_running_UP.vmd"});
        this.works$.add(new String[]{"M134_hold_UP.vmd", "M134_running_UP.vmd"});
        this.works$.add(new String[]{"M134_running_UP.vmd", "M134_hold_UP.vmd"});
        this.works$.add(new String[]{"M134_auto_UP.vmd", "M134_hold_UP.vmd"});
        this.works$.add(new String[]{"M134_hold_UP.vmd", "M134_auto_UP.vmdd"});
        this.works$.add(new String[]{"waveSword.vmd", "waveSword_c1.vmd"});
        this.works$.add(new String[]{"holdFullSword.vmd", "drawSword.vmd"});
        this.works$.add(new String[]{"holdSword.vmd", "resetSword.vmd"});
        cellular$ = this;
        if (!Config.maybe$ && ShaderProgram.wonder$ == null) {
            ShaderProgram.wonder$ = new ShaderProgram();
        }
        int i = 0;
        while (true) {
            if (i >= checks$.length) break;
            CSmanager.checks$[i] = i == 0 ? new ResourceLocation("/CustomSteve/toon/toon0.bmp") : (i < 10 ? new ResourceLocation("/CustomSteve/toon/toon0" + i + ".bmp") : new ResourceLocation("/CustomSteve/toon/toon" + i + ".bmp"));
            this._assessed(checks$[i]);
            ++i;
        }
        this.keith$._rolls();
        this._slowly();
    }

    public void _pubmed() {
        ArrayList rmList = new ArrayList();
        for (Map.Entry entry : this.beings$.entrySet()) {
            SimpleTexture o = (SimpleTexture)entry.getValue();
            if (o == null || !o.david$) continue;
            if (o.bowling$ > 5) {
                o._ongoing();
                rmList.add(entry.getKey());
                continue;
            }
            ++o.bowling$;
        }
        for (SimpleTexture o : rmList) {
            this.beings$.remove(o);
        }
        rmList.clear();
    }

    public void _tiger() {
        if (!Config.point$) {
            return;
        }
        try {
            CSplayer csp;
            Vector3f loc = new Vector3f(0.0f, 0.0f, 0.0f);
            boolean jump = true;
            for (Map.Entry e2 : this.laughing$.entrySet()) {
                jump = false;
                csp = (CSplayer)e2.getValue();
                boolean updatePos = true;
                csp.brussels$.writeLock().lock();
                csp.forces$ += 0.33333334f;
                float f2 = Hooks._surfaces((float)csp.adjusted$, (float)csp.farmers$, csp.forces$);
                Quaternion qua4 = new Quaternion()._between(0.0f, f2 / 180.0f * (float)Math.PI, 0.0f);
                Vector3f vec = new Vector3f((float)(csp.medal$ + (csp.malawi$ - csp.medal$) * (double)csp.forces$), (float)(csp.winds$ + (csp.learn$ - csp.winds$) * (double)csp.forces$), (float)(csp.regarded$ + (csp.weeks$ - csp.regarded$) * (double)csp.forces$));
                vec._alleged((float)(-csp.greek$), (float)csp.springer$, (float)(-csp.vsnet$));
                if (csp.trial$ != null && csp.trial$.func_70115_ae()) {
                    vec._licence(0.5f);
                }
                vec = qua4._align(vec);
                csp.brussels$.writeLock().unlock();
                if (csp.trial$ != null && updatePos) {
                    if (alias$ <= 0.0f) {
                        laugh$ = new Random().nextFloat() * 0.4f;
                        alias$ += 0.05f * new Random().nextFloat();
                    } else if (laugh$ != 0.0f) {
                        if ((alias$ += 0.02f * new Random().nextFloat()) >= laugh$) {
                            laugh$ = 0.0f;
                        }
                    } else {
                        alias$ -= 0.01f * new Random().nextFloat();
                    }
                    if (Config.assigned$ == 1) {
                        csp.owners$._shoot(csp.owners$._strongly(-0.5f + alias$, 0.0f, 0.0f)._approval(vec));
                    } else if (Config.assigned$ == -1) {
                        csp.owners$._shoot(csp.owners$._strongly(0.5f + -alias$, 0.0f, 0.0f)._approval(vec));
                    } else {
                        csp.owners$._kinda(vec);
                    }
                }
                if (csp.contest$ || csp.a.bringing$ || csp.a == null || csp.n != -1) continue;
                CSmanager.cellular$.december$._obtained(csp.a, csp.owners$);
            }
            if (!jump) {
                CSmanager.cellular$.december$._treated();
                for (Map.Entry e2 : this.laughing$.entrySet()) {
                    csp = (CSplayer)e2.getValue();
                    if (csp.contest$ || csp.a.bringing$ || csp.a == null || csp.n != -1) continue;
                    CSmanager.cellular$.december$._train(csp.a, csp.owners$);
                }
            }
        }
        catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public synchronized void _errors(String info) {
        if (this.choose$.contains(info)) {
            return;
        }
        if (this.choose$.size() > 50) {
            this.choose$.removeLast();
        }
        this.choose$.addFirst(info);
    }

    public HashMap _meter() {
        return this.laughing$;
    }

    public void _navigate() {
        for (Map.Entry e2 : this.laughing$.entrySet()) {
            CSmanager.cellular$.december$._hewlett(((CSplayer)e2.getValue()).a);
        }
    }

    public VmdFileInfo _handle(String path) {
        if (path == null || path.isEmpty()) {
            return null;
        }
        VmdFileInfo ani = this._million(path);
        if (ani == null) {
            VmdFileInfo rvfi = null;
            try {
                rvfi = this._budgets(path);
            }
            catch (Exception e2) {
                e2.printStackTrace();
                rvfi = VmdFileInfo.adelaide$;
            }
            this._lower(path, rvfi);
            return rvfi;
        }
        return ani;
    }

    public ArrayList _syracuse(String basePath, String suffix, int limit, String prefix) {
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        File dir = new File(ModContainer.outreach$ + "/" + basePath);
        if (!dir.exists() || !dir.isDirectory()) {
            return arrayList;
        }
        for (File file : dir.listFiles()) {
            if (!file.getName().toLowerCase().endsWith(suffix)) continue;
            arrayList.add(new String[]{prefix + file.getName(), basePath + file.getName()});
        }
        return arrayList;
    }

    public ArrayList _offered(String basePath, String ... suffix) {
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

    public void _lower(String path, VmdFileInfo vfi) {
        this.packard$.put(path, vfi);
    }

    public void _school() {
        this.packard$.clear();
    }

    public int _flags() {
        return this.packard$.size();
    }

    public CSplayer _accessed(Vector3f loc, String username, boolean block) {
        if (username == null || username.isEmpty()) {
            return null;
        }
        CSplayer rcsp = null;
        if (rcsp == null) {
            rcsp = this._stanley(username);
            if (rcsp != null) {
                return rcsp;
            }
            if (!username.equals(ModContainer.dealing$.highways$)) {
                CSplayerMP cspMP = null;
                for (int i = 0; i < this.browsing$.size(); ++i) {
                    CSplayerMP c2 = (CSplayerMP)this.browsing$.get(i);
                    if (!c2.lucas$.equals(username)) continue;
                    cspMP = c2;
                    break;
                }
                if (cspMP != null) {
                    if (!cspMP.backing$) {
                        return null;
                    }
                    CSplayer rcscp = new CSplayer(username, cspMP.trinidad$);
                    rcscp.things$ = "";
                    try {
                        rcscp.things$ = cspMP.trinidad$.substring(0, cspMP.trinidad$.length() - 4) + "/";
                    }
                    catch (StringIndexOutOfBoundsException e2) {
                        e2.printStackTrace();
                    }
                    rcscp.tourism$ = rcscp.things$;
                    if (!block) {
                        rcscp.a(loc);
                        cellular$._pleased(rcscp);
                        ++this.seminars$;
                        rcscp.contest$ = true;
                    }
                    this._dealt(rcscp);
                    return rcscp;
                }
            } else {
                CSplayer rcscp;
                this.trucks$ = rcscp = new CSplayer(username, ModContainer.dealing$.talking$);
                rcscp.things$ = ModContainer.dealing$.method$;
                rcscp.tourism$ = "";
                try {
                    rcscp.tourism$ = rcscp.reminder$.substring(0, rcscp.reminder$.length() - 4) + "/";
                }
                catch (StringIndexOutOfBoundsException e3) {
                    e3.printStackTrace();
                }
                if (!block) {
                    rcscp.a(loc);
                    cellular$._pleased(rcscp);
                    ++this.seminars$;
                    rcscp.contest$ = true;
                }
                this._dealt(rcscp);
                return rcscp;
            }
        }
        return null;
    }

    public int _sponsor() {
        return this.laughing$.size();
    }

    public boolean _tunes(CSplayer oldcsp, CSplayer csplayer, boolean lazyLoad) {
        boolean p = false;
        Vector3f loc = new Vector3f(oldcsp.owners$);
        if (Config.point$) {
            Config.point$ = false;
            p = true;
        }
        csplayer.a(loc);
        if (lazyLoad) {
            // empty if block
        }
        this.keith$._discs(oldcsp);
        this.keith$._decimal(csplayer);
        Config.point$ = p;
        this._dealt(csplayer);
        if (oldcsp.n == -1) {
            oldcsp.b();
        }
        return true;
    }

    public CSplayer _reload(String username, boolean block) {
        return this._accessed(new Vector3f(this.seminars$ * 10, this.seminars$ * 10, this.seminars$ * 10), username, block);
    }

    public CSplayer _events(EntityLivingBase elb, String username, boolean block) {
        return this._accessed(new Vector3f(this.seminars$ * 10, this.seminars$ * 10, this.seminars$ * 10), username, block);
    }

    public void _dealt(CSplayer p) {
        this.laughing$.put(p.loans$, p);
    }

    public boolean _audience(CSplayer p) {
        this.keith$._discs(p);
        this._optional(p);
        if (!Config.maybe$ && p.a != null && CSRender2._outline() != null && p.smaller$ != null) {
            CSRender2._outline()._higher(p.smaller$);
        }
        return true;
    }

    private boolean _optional(CSplayer p) {
        this.laughing$.remove(p.loans$);
        return true;
    }

    public boolean _adequate(String name) {
        CSplayer csplayer = (CSplayer)this.laughing$.get(name);
        if (csplayer == null) {
            return false;
        }
        return this._optional(csplayer);
    }

    private VmdFileInfo _million(String path) {
        for (Map.Entry e2 : this.packard$.entrySet()) {
            if (!((String)e2.getKey()).equals(path)) continue;
            return (VmdFileInfo)e2.getValue();
        }
        return null;
    }

    public CSplayer _families() {
        return this._chronic(this.laughing$.size() - 1);
    }

    public CSplayer _chronic(int index) {
        int i = 0;
        for (Map.Entry e2 : this.laughing$.entrySet()) {
            if (i == index) {
                return (CSplayer)e2.getValue();
            }
            ++i;
        }
        return null;
    }

    public CSplayer _stanley(String name) {
        for (Map.Entry e2 : this.laughing$.entrySet()) {
            if (!((String)e2.getKey()).equals(name)) continue;
            return (CSplayer)e2.getValue();
        }
        return null;
    }

    public CSplayerMP _index(String name) {
        for (int i = 0; i < this.browsing$.size(); ++i) {
            if (!((CSplayerMP)this.browsing$.get((int)i)).lucas$.equals(name)) continue;
            return (CSplayerMP)this.browsing$.get(i);
        }
        return null;
    }

    public void _allows(String name) {
        for (int i = 0; i < this.browsing$.size(); ++i) {
            if (!((CSplayerMP)this.browsing$.get((int)i)).lucas$.equals(name)) continue;
            this.browsing$.remove(i);
            break;
        }
    }

    public String _mixed(String path) {
        return null;
    }

    private VmdFileInfo _budgets(String path) throws Exception {
        VmdFileInfo vfi = new VmdLoader4()._senior(new File(ModContainer.outreach$ + "/" + path));
        return vfi;
    }

    public void _puppy(String aniPath) {
        for (int i = 0; i < this.roland$.size(); ++i) {
            CSplayerMP cspMP = (CSplayerMP)this.roland$.get(i);
            CSplayer csp = this._stanley(cspMP.lucas$);
            if (csp == null && (csp = this._reload(cspMP.lucas$, true)) == null) continue;
            this.positive$ = 0;
            csp.pacific$ = true;
            csp.a.wales$ = true;
            aniPath = aniPath.replace("CustomSteve/Animations/", "");
            String path = "";
            path = aniPath.contains("/") ? "CustomSteve/Animations/" + csp.b() + "/" + aniPath.split("/")[1] : "CustomSteve/Animations/" + aniPath;
            if (csp.loans$.equals(CSmanager.cellular$.soccer$)) {
                CSmanager.cellular$.glossary$ = cellular$._handle(path.replace(".vmd", "") + "_Camera.vmd");
                if (!new FrameStackHelper()._reaches(csp.a, CSmanager.cellular$.glossary$)) {
                    CSmanager.cellular$.glossary$ = null;
                }
            }
            csp.a(path, false);
            this._company();
        }
    }

    public void _pleased(RenderObject ro) {
        this.keith$._decimal(ro);
    }

    public void _split(RenderObject ro) {
        this.keith$._discs(ro);
    }

    public int _parker() {
        return this.seminars$;
    }

    public boolean _expenses(String name) {
        for (int i = 0; i < this.browsing$.size(); ++i) {
            if (!((CSplayerMP)this.browsing$.get((int)i)).lucas$.equals(name)) continue;
            return true;
        }
        return false;
    }

    public void _slowly() {
        if (this.flight$ == null) {
            CSmanager5 obj = new CSmanager5(this, null);
            Thread t = new Thread(obj);
            t.start();
            this.flight$ = new Timer();
            this.steady$ = new CSmanager3(this, obj, t);
            this.flight$.schedule((TimerTask)this.steady$, 0L, 1000L);
        }
    }

    public void _blade() {
        if (this.flight$ == null) {
            return;
        }
        this.flight$.cancel();
        this.flight$.purge();
        this.flight$ = null;
    }

    public void _company() {
        if (this.offering$ == null) {
            this.offering$ = new Timer();
            CSmanager2 obj = new CSmanager2(this, null);
            Thread t = new Thread(obj);
            t.start();
            if (this.zoning$ == null) {
                this.zoning$ = new Timer();
            }
            this.quarters$ = new CSmanager4(this, obj, t);
            this.zoning$.schedule((TimerTask)this.quarters$, 0L, 100L);
        }
    }

    public void _small() {
        if (this.offering$ == null) {
            return;
        }
        this.offering$.cancel();
        this.offering$.purge();
        if (this.zoning$ == null) {
            return;
        }
        this.quarters$._prior();
        this.zoning$.cancel();
        this.zoning$.purge();
        this.offering$ = null;
        this.zoning$ = null;
    }

    public void _internal(int value, boolean isSub) {
        this._slight();
        if (this.optimal$ == null) {
            this.optimal$ = new CSmanager6(this, value, true);
        }
        if (this.former$ == null) {
            this.former$ = new Timer();
        }
        this.former$.schedule((TimerTask)this.optimal$, 0L, 1000L);
    }

    public void _slight() {
        if (this.former$ == null) {
            return;
        }
        this.former$.cancel();
        this.former$.purge();
        this.former$ = null;
        this.optimal$ = null;
    }

    public void _assessed(ResourceLocation par1ResourceLocation) {
        CSmanager csm = cellular$;
        SimpleTexture texture = (SimpleTexture)csm.beings$.get(par1ResourceLocation);
        if (texture == null) {
            String fileType = par1ResourceLocation.func_110623_a().toLowerCase();
            texture = fileType.endsWith(".tga") ? new TGATexture(par1ResourceLocation) : new SimpleTexture(par1ResourceLocation);
            this._raymond(par1ResourceLocation, texture);
        }
    }

    public boolean _raymond(ResourceLocation par1ResourceLocation, SimpleTexture par2TextureObject) {
        boolean flag = true;
        try {
            par2TextureObject._chairman();
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
        CSmanager.cellular$.beings$.put(par1ResourceLocation, par2TextureObject);
        return flag;
    }

    static {
        checks$ = new ResourceLocation[11];
        cities$ = null;
    }
}

