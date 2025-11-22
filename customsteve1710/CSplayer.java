/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  cpw.mods.fml.common.eventhandler.Event
 *  custombuki.aa
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.common.MinecraftForge
 */
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import cpw.mods.fml.common.eventhandler.Event;
import custombuki.aa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CSplayer
extends RenderObject {
    public Vector3f owners$ = new Vector3f(0.0f, 0.0f, 0.0f);
    public String reminder$;
    public String things$;
    public String tourism$;
    public String mounts$ = null;
    public CSRender smaller$ = null;
    public String loans$;
    public boolean voice$ = false;
    public VmdFileInfo outputs$;
    public VmdFileInfo remind$;
    public boolean chess$ = false;
    public EntityPlayer trial$ = null;
    public boolean contest$ = false;
    public boolean austin$ = false;
    public int rebecca$ = 0;
    public boolean routines$ = false;
    public boolean sunday$ = false;
    public boolean listings$ = false;
    public boolean counted$ = false;
    public boolean monaco$ = false;
    public String philips$ = null;
    public String inquire$ = null;
    public VmdFileInfo devel$ = null;
    public VmdFileInfo define$ = null;
    public float deeper$ = 0.0f;
    public float frame$ = 0.0f;
    private boolean voltage$ = false;
    public int begun$ = -1;
    public boolean pacific$ = true;
    public boolean medline$ = false;
    public boolean surveys$ = false;
    public boolean freeze$ = true;
    public boolean murray$ = false;
    public boolean efforts$ = false;
    public boolean minerals$ = false;
    public ReadWriteLock brussels$ = new ReentrantReadWriteLock();
    public double adjusted$;
    public double farmers$;
    public double regarded$;
    public double winds$;
    public double medal$;
    public double greek$;
    public double springer$;
    public double vsnet$;
    public double weeks$;
    public double learn$;
    public double malawi$;
    public float forces$ = 0.0f;
    private int finnish$ = 0;
    private int thermal$ = 0;
    private int housing$ = 0;
    private int finds$ = 0;
    private int projects$ = 0;
    private int officer$ = 0;
    private EntityPlayer pharmacy$;
    public int eugene$ = -1;
    public boolean democrat$ = false;
    public Item endorsed$ = null;
    public CSplayer2 turned$ = CSplayer2.digest$;
    public CSplayer4 graduate$ = CSplayer4.alumni$;
    public int world$ = -1;
    public boolean[] prophet$ = new boolean[3];
    public int[] pizza$ = new int[3];
    public long[] hoped$ = new long[3];
    public int fought$ = 0;
    public int wildlife$ = 0;
    public int template$ = 0;
    public int cubic$ = 0;
    public int starts$ = 0;
    public int quote$ = 5;
    public ReadWriteLock[] father$ = new ReadWriteLock[3];
    public QuickMotionSetting[] expected$ = new QuickMotionSetting[10];

    public CSplayer(String par2Str, String pmdFileName) {
        this.loans$ = par2Str;
        Minecraft mc = Minecraft.func_71410_x();
        if (mc.field_71439_g != null && mc.field_71439_g.func_70005_c_().equals(this.loans$)) {
            this.voice$ = true;
        }
        this.a = this;
        this.reminder$ = pmdFileName;
        try {
            this.e();
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(EntityPlayer ep) {
        if (this.medline$) {
            ++this.officer$;
        }
        if (this.trial$ == null) {
            this.trial$ = ep;
        }
        if (ep != null) {
            this.brussels$.writeLock().lock();
            this.adjusted$ = ep.field_70126_B;
            this.farmers$ = ep.field_70177_z;
            this.regarded$ = ep.field_70142_S;
            this.winds$ = ep.field_70137_T;
            this.medal$ = ep.field_70136_U;
            this.weeks$ = ep.field_70165_t;
            this.learn$ = ep.field_70163_u;
            this.malawi$ = ep.field_70161_v;
            this.greek$ = ep.field_70159_w;
            this.springer$ = ep.field_70181_x;
            this.vsnet$ = ep.field_70179_y;
            if (ep.func_70115_ae() && ep.field_70154_o != null) {
                this.greek$ = ep.field_70154_o.field_70159_w;
                this.springer$ = ep.field_70154_o.field_70181_x;
                this.vsnet$ = ep.field_70154_o.field_70179_y;
            }
            this.forces$ = 0.0f;
            this.brussels$.writeLock().unlock();
        }
        if (this.a.remove$) {
            // empty if block
        }
        if (!this.murray$ && !this.a.warriors$) {
            this.b(ep);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String path, EntityPlayer var1) {
        ItemStack equippedItem = var1.func_71045_bC();
        ItemStack itemInUse = var1.func_71011_bu();
        if (!this.medline$) {
            if (Config.price$ == 0) return true;
            if (!Config.wagner$ || !(var1.field_70733_aJ > 0.0f) && itemInUse == null) return true;
            this.a();
        } else if (Config.price$ == 1 && Config.wagner$ && this.officer$ > Config.opera$) {
            this.a();
            return true;
        }
        if (var1.field_70733_aJ > 0.0f || itemInUse != null) {
            this.d();
        }
        this.a.steel$ = false;
        this.sunday$ = true;
        float zoom = 0.15f;
        float rot = -35.0f;
        if (var1.field_70733_aJ > 0.0f) {
            this.pacific$ = false;
            this.routines$ = true;
            if (var1.func_71045_bC() != null) {
                if (equippedItem.func_77973_b().func_77662_d()) {
                    this.c(path + "wavingStick_UP.vmd", true);
                    return true;
                } else {
                    this.c(path + "wavingItem_UP.vmd", true);
                }
                return true;
            } else if (this.cubic$ == 0) {
                this.routines$ = true;
                this.c(path + "punchRight_UP.vmd", true);
                return true;
            } else {
                this.routines$ = true;
                this.c(path + "punchLeft_UP.vmd", true);
            }
            return true;
        }
        if (itemInUse != null && equippedItem.func_77975_n() == EnumAction.block) {
            this.pacific$ = false;
            if (this.routines$) return true;
            this.c(path + "blockStick_UP.vmd", true);
            return true;
        }
        if (equippedItem != null) {
            this.pacific$ = false;
            if (Item.func_150891_b((Item)equippedItem.func_77973_b()) == 261) {
                if (itemInUse != null && Item.func_150891_b((Item)equippedItem.func_77973_b()) == 261) {
                    this.c(path + "useBow_UP.vmd", true);
                    return false;
                }
                if (this.routines$) return true;
                this.c(path + "holdBow_UP.vmd", true);
                return true;
            } else if (equippedItem.func_77973_b().func_77662_d()) {
                if (this.routines$) return true;
                this.c(path + "holdStick_UP.vmd", true);
                return true;
            } else {
                if (itemInUse != null) {
                    if (itemInUse.func_77975_n() == EnumAction.drink) {
                        this.c(path + "drink.vmd", true);
                        return false;
                    }
                    if (itemInUse.func_77975_n() == EnumAction.eat) {
                        this.c(path + "eat.vmd", true);
                        return false;
                    }
                }
                if (this.routines$) return true;
                this.c(path + "holdBlock_UP.vmd", true);
            }
            return true;
        } else if (var1.field_70153_n != null) {
            this.c(path + "riddenByEntity_UP.vmd", true);
            return true;
        } else {
            if (this.routines$) return true;
            this.c(path + "barehanded_UP.vmd", true);
        }
        return true;
    }

    public void b(EntityPlayer var1) {
        ItemStack equippedItem = var1.func_71045_bC();
        ItemStack itemInUse = var1.func_71011_bu();
        String lowerAnimation = null;
        float yStaticValue = 0.075f;
        if (this.graduate$ != CSplayer4.alumni$) {
            this.template$ = 0;
        }
        if (this.a == null) {
            return;
        }
        String path = "CustomSteve/Animations/" + this.tourism$ + "/";
        if (this.routines$ && (this.define$ == null || (long)this.b() >= this.define$.bible$)) {
            ++this.projects$;
            this.routines$ = false;
            int n = this.cubic$ = this.cubic$ == 0 ? 1 : 0;
            if (this.projects$ > 12) {
                this.sunday$ = false;
                this.projects$ = 0;
            }
        }
        double x = var1.field_70165_t - var1.field_70142_S;
        double y = var1.field_70163_u - var1.field_70137_T;
        double z = var1.field_70161_v - var1.field_70136_U;
        if (this.finnish$ > 100) {
            this.finnish$ = 100;
        }
        if (Math.abs(x) < (double)0.05f && Math.abs(y) < (double)yStaticValue && Math.abs(z) < (double)0.05f) {
            ++this.finnish$;
        } else {
            this.finnish$ = 0;
            if (x != 0.0 || z != 0.0) {
                ++this.finds$;
            }
            boolean shake = false;
            if (y == 0.005208333333328596 || y == -0.005208333333328596 || y == 0.005208333333342807 || y == -0.005208333333342807) {
                shake = true;
            }
            if (y > 0.0 && var1.field_70181_x > -0.078 && !shake) {
                ++this.housing$;
            }
        }
        if (var1.field_70122_E) {
            this.housing$ = 0;
            this.thermal$ = 4;
            this.monaco$ = false;
        }
        if (var1.func_70115_ae()) {
            this.turned$ = CSplayer2.mighty$;
            this.graduate$ = CSplayer4.alumni$;
            this.pacific$ = true;
            lowerAnimation = var1.field_70154_o instanceof EntityHorse ? "horseRiding.vmd" : "riding.vmd";
        } else if (var1.func_70608_bn()) {
            if (this.medline$) {
                this.a();
            }
            this.turned$ = CSplayer2.bryant$;
            this.graduate$ = CSplayer4.alumni$;
            this.pacific$ = true;
            this.a.quizzes$ = true;
            this.begun$ = 0;
            lowerAnimation = "sleep.vmd";
        } else if (var1.field_71075_bZ.field_75100_b) {
            this.turned$ = CSplayer2.immune$;
            this.monaco$ = true;
            this.voltage$ = false;
            if (this.finnish$ > 2) {
                this.pacific$ = true;
                this.finds$ = 0;
                this.finnish$ = 3;
                lowerAnimation = var1.func_71045_bC() != null ? "fly.vmd" : "fly.vmd";
                this.graduate$ = CSplayer4.alumni$;
            } else {
                this.pacific$ = true;
                lowerAnimation = "flying.vmd";
                this.graduate$ = CSplayer4.mental$;
            }
        } else if (var1.func_70090_H()) {
            this.turned$ = CSplayer2.fitted$;
            this.graduate$ = CSplayer4.trash$;
            this.pacific$ = true;
            lowerAnimation = "swim.vmd";
        } else if (var1.func_70093_af()) {
            this.turned$ = CSplayer2.beast$;
            if (this.finnish$ > 2) {
                this.graduate$ = CSplayer4.alumni$;
                lowerAnimation = "squat_LO.vmd";
            } else if (this.finds$ > 2) {
                this.graduate$ = CSplayer4.mental$;
                this.pacific$ = true;
                this.routines$ = false;
                this.finds$ = 3;
                lowerAnimation = "sneaking_LO.vmd";
            }
        } else {
            if (var1.func_70617_f_()) {
                this.turned$ = CSplayer2.fitted$;
                this.graduate$ = CSplayer4.exist$;
                this.pacific$ = true;
                this.routines$ = false;
                if (var1.field_70181_x >= (double)0.05f) {
                    lowerAnimation = "ladderUp.vmd";
                    if (this.medline$) {
                        this.a();
                    }
                } else if (var1.field_70181_x <= (double)-0.15f) {
                    lowerAnimation = "ladderDown.vmd";
                    if (this.medline$) {
                        this.a();
                    }
                } else {
                    lowerAnimation = "ladder.vmd";
                }
            } else if ((this.monaco$ || var1.field_70143_R > 4.0f) && !var1.field_70122_E) {
                this.turned$ = CSplayer2.fitted$;
                this.graduate$ = CSplayer4.average$;
                this.pacific$ = true;
                this.routines$ = false;
                lowerAnimation = "fall.vmd";
            } else if (this.housing$ >= 2) {
                this.turned$ = CSplayer2.fitted$;
                this.graduate$ = CSplayer4.sisters$;
                this.housing$ = 0;
                this.thermal$ = 0;
                lowerAnimation = "jump.vmd";
            } else if (this.finnish$ <= 2 && (this.thermal$ >= 2 || var1.field_70122_E) && this.finds$ >= 1) {
                this.turned$ = CSplayer2.digest$;
                this.finds$ = 3;
                this.thermal$ = 3;
                if (var1.func_70051_ag()) {
                    this.graduate$ = CSplayer4.tried$;
                    lowerAnimation = "run.vmd";
                } else {
                    this.graduate$ = CSplayer4.mental$;
                    lowerAnimation = "walk.vmd";
                }
                if (this.medline$) {
                    this.pacific$ = false;
                }
            } else if (this.finnish$ > 2 || var1.field_70122_E) {
                this.turned$ = CSplayer2.digest$;
                this.finds$ = 0;
                this.finnish$ = 3;
                if (this.medline$) {
                    this.graduate$ = CSplayer4.alumni$;
                    if (this.eugene$ > -1) {
                        this.turned$ = CSplayer2.digest$;
                        this.graduate$ = CSplayer4.chips$;
                        this.begun$ = 3;
                        lowerAnimation = "kick.vmd";
                    } else {
                        lowerAnimation = "stand_LO.vmd";
                    }
                } else if (this.eugene$ > -1) {
                    this.turned$ = CSplayer2.digest$;
                    this.graduate$ = CSplayer4.chips$;
                    this.begun$ = 3;
                    lowerAnimation = "kick.vmd";
                } else if (this.template$ > Config.pipes$ && this.graduate$ == CSplayer4.alumni$) {
                    if (!this.voice$ || Minecraft.func_71410_x().field_71474_y.field_74320_O != 0) {
                        this.graduate$ = CSplayer4.nobody$;
                        this.begun$ = 0;
                        if (this.starts$ > 2) {
                            this.starts$ = 0;
                        }
                        switch (this.starts$) {
                            case 0: {
                                lowerAnimation = "stand_Idle_1.vmd";
                                break;
                            }
                            case 1: {
                                lowerAnimation = "stand_Idle_2.vmd";
                                break;
                            }
                            case 2: {
                                lowerAnimation = "stand_Idle_3.vmd";
                            }
                        }
                        this.graduate$ = CSplayer4.nobody$;
                        ++this.starts$;
                    }
                } else if (this.graduate$ != CSplayer4.nobody$) {
                    this.graduate$ = CSplayer4.alumni$;
                    ++this.template$;
                    lowerAnimation = "stand.vmd";
                }
            }
            if (this.eugene$ < 0) {
                CSmanager.cellular$.trucks$.world$ = -1;
            }
        }
        if (Math.abs(y) < (double)yStaticValue) {
            ++this.thermal$;
        }
        if (lowerAnimation != null) {
            this.c(path + lowerAnimation, false);
        }
        boolean hasBuki = false;
        if (Config.permit$ && equippedItem != null && equippedItem.func_77973_b() instanceof aa) {
            hasBuki = true;
        }
        if (Config.permit$ && !this.a.bringing$) {
            if (equippedItem != null) {
                if (equippedItem.func_77973_b() instanceof aa) {
                    Item buki = equippedItem.func_77973_b();
                    if (this.endorsed$ != null) {
                        if (this.endorsed$ != buki) {
                            ((aa)this.endorsed$).b(this.a);
                            this.endorsed$ = buki;
                            this.begun$ = 0;
                            if (((aa)buki).b) {
                                Config.candles$ = 0.0f;
                                ((aa)buki).a(this.a);
                            }
                        }
                    } else {
                        this.endorsed$ = buki;
                        if (((aa)buki).b) {
                            Config.candles$ = 0.0f;
                            ((aa)buki).a(this.a);
                        }
                    }
                    if (this.medline$) {
                        this.a.steel$ = false;
                        this.pacific$ = false;
                    }
                    ((aa)buki).c(this.a);
                } else if (this.endorsed$ != null) {
                    Config.candles$ = 0.0f;
                    ((aa)this.endorsed$).b(this.a);
                    this.endorsed$ = null;
                    this.freeze$ = true;
                }
            } else if (this.endorsed$ != null) {
                ((aa)this.endorsed$).b(this.a);
                this.endorsed$ = null;
                this.freeze$ = true;
            }
        }
        if (!hasBuki) {
            this.a(path, var1);
        }
    }

    public float a(float par1, float par2, float par3) {
        float f3;
        for (f3 = par2 - par1; f3 < -180.0f; f3 += 360.0f) {
        }
        while (f3 >= 180.0f) {
            f3 -= 360.0f;
        }
        return par1 + par3 * f3;
    }

    public void a(String path, boolean isUpperBody) {
        this.c(path, isUpperBody);
        this.a(isUpperBody);
        this.listings$ = true;
    }

    public void b(String path, boolean isUpperBody) {
        if (this.listings$ || this.a.warriors$) {
            return;
        }
        try {
            this.c(path, isUpperBody);
            this.a(isUpperBody);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean a(boolean isUpper, MotionEvent2 type, CSplayer csp, EntityPlayer ep) {
        return MinecraftForge.EVENT_BUS.post((Event)new MotionEvent(isUpper, type, csp, ep));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(boolean isUpperBody) {
        block27: {
            if (this.a.bringing$ || this.inquire$ == null || this.listings$ || this.a.warriors$) {
                return;
            }
            try {
                VmdFileInfo vfi;
                CSplayer csp = this;
                VmdFileInfo vfi_Source = vfi = CSmanager.cellular$._handle(this.inquire$);
                VmdFileInfo lastAnimation = null;
                lastAnimation = isUpperBody ? csp.remind$ : csp.outputs$;
                if (lastAnimation != null && lastAnimation.facing$ != null && lastAnimation.facing$.equals(vfi.facing$)) {
                    if (isUpperBody) {
                        if ((long)csp.b() >= csp.define$.bible$) {
                            csp.d((int)csp.define$.earned$);
                        }
                    } else if ((long)csp.a() >= csp.devel$.bible$) {
                        if (this.graduate$ == CSplayer4.chips$) {
                            this.eugene$ = -1;
                            this.begun$ = this.quote$;
                        } else {
                            csp.c((int)csp.devel$.earned$);
                        }
                        this.j();
                    }
                    break block27;
                }
                if (!isUpperBody) {
                    if (this.graduate$ == CSplayer4.chips$) {
                        this.eugene$ = this.eugene$ == 0 ? 1 : -1;
                        this.democrat$ = true;
                    }
                }
                VmdFileInfo vfi_mixed = this.a(vfi_Source, isUpperBody);
                if (vfi_mixed != null) {
                    vfi = vfi_mixed;
                }
                if (isUpperBody) {
                    this.define$ = vfi;
                } else {
                    this.devel$ = vfi;
                }
                if (this.voltage$) {
                    if ((long)csp.a() >= csp.devel$.bible$) {
                        lastAnimation = vfi_mixed != null ? vfi : vfi_Source;
                        if (isUpperBody) {
                            csp.remind$ = lastAnimation;
                            csp.d(0);
                        } else {
                            csp.outputs$ = lastAnimation;
                            csp.c(0);
                        }
                        new FrameStackHelper()._reduced(csp, vfi, isUpperBody);
                        this.voltage$ = false;
                        if (isUpperBody) {
                            csp.a.visible$ = true;
                        } else {
                            csp.a.register$ = true;
                        }
                    }
                    break block27;
                }
                lastAnimation = vfi_mixed != null ? vfi : vfi_Source;
                if (isUpperBody) {
                    csp.remind$ = lastAnimation;
                } else {
                    csp.outputs$ = lastAnimation;
                }
                if (!isUpperBody) {
                    csp.c(0);
                }
                new FrameStackHelper()._reduced(csp, vfi, isUpperBody);
                if (isUpperBody) {
                    csp.a.visible$ = true;
                    break block27;
                }
                csp.a.register$ = true;
                csp.c(0);
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void c(String path, boolean isUpperBody) {
        this.inquire$ = path;
        this.a(isUpperBody);
    }

    public void a(Vector3f loc) {
        String filePath = this.reminder$;
        new Timer().schedule((TimerTask)new CSplayer3(this, this, loc, filePath), 0L, 100L);
    }

    private int a(String path, PmdFileInfo pfi) throws Exception {
        String name = path.toLowerCase();
        if (name.endsWith(".pmd")) {
            return new PmdLoader()._magic(new File(path), pfi);
        }
        if (name.endsWith(".pmx")) {
            return new PmxLoader()._marking(new File(path), pfi);
        }
        throw new FormatException("Can't load " + path);
    }

    public void a() {
        boolean bl2 = this.medline$ = !this.medline$;
        if (!this.medline$) {
            this.a.clear();
            this.endorsed$ = null;
            this.a.steel$ = true;
            this.surveys$ = true;
        } else {
            if (this.a.a.single$) {
                this.a.a.single$ = false;
                this.a.a.meetings$ = false;
            }
            this.a(true);
        }
        this.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public VmdFileInfo a(VmdFileInfo vfi, boolean isUpperBody) {
        int interFrame = 3;
        if (this.begun$ > -1) {
            interFrame = this.begun$;
            this.begun$ = -1;
            if (interFrame == 0) {
                return null;
            }
        }
        if (Config.filter$ == 2) {
            interFrame *= 2;
        }
        if (vfi.intimate$ == null || isUpperBody && this.remind$ == null) {
            return null;
        }
        if (isUpperBody) {
            if (this.remind$.facing$ == null) return null;
            for (String[] str : CSmanager.cellular$.works$) {
                if (!(this.remind$.facing$.equals(str[1]) ? str[0].equals("*") || vfi.facing$.equals(str[0]) : this.remind$.facing$.equals(str[0]) && (str[1].equals("*") || vfi.facing$.equals(str[1])))) continue;
                return null;
            }
            return new FrameStackHelper()._control(this, vfi, interFrame, isUpperBody);
        } else {
            if (this.outputs$ == null || this.outputs$.facing$ == null) return null;
            for (String[] str : CSmanager.cellular$.works$) {
                if (this.outputs$ == null) {
                    return null;
                }
                if (!(this.outputs$.facing$.equals(str[1]) ? str[0].equals("*") || vfi.facing$.equals(str[0]) : this.outputs$.facing$.equals(str[0]) && (str[1].equals("*") || vfi.facing$.equals(str[1])))) continue;
                return null;
            }
        }
        return new FrameStackHelper()._control(this, vfi, interFrame, isUpperBody);
    }

    public void b() {
        this.minerals$ = true;
    }

    public void c() {
        if (this.a != null) {
            this.a._observed();
        }
        this.a.clear();
        this.a = null;
        this.a = null;
        this.i();
    }

    public String a() {
        return this.things$;
    }

    public String b() {
        return this.tourism$;
    }

    public void d() {
        this.officer$ = 0;
    }

    public void e() throws Exception {
        File conf = new File(ModContainer.outreach$ + "/CustomSteve/models/" + this.reminder$.substring(0, this.reminder$.length() - 4) + ".json");
        if (!conf.exists()) {
            conf.createNewFile();
            this.f();
            return;
        }
        InputStreamReader read = new InputStreamReader((InputStream)new FileInputStream(conf), "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(read);
        StringBuilder sb = new StringBuilder();
        String lineTxt = null;
        while ((lineTxt = bufferedReader.readLine()) != null) {
            sb.append(lineTxt);
        }
        JsonObject json = (JsonObject)new Gson().fromJson(sb.toString(), JsonObject.class);
        JsonArray quickMotion = json.get("QuickMotion").getAsJsonArray();
        for (int i = 0; i < 10; ++i) {
            this.expected$[i] = new QuickMotionSetting();
            this.expected$[i]._enormous(quickMotion.get(i).getAsJsonObject());
        }
        read.close();
    }

    public void f() throws Exception {
        this.g();
    }

    public void g() throws Exception {
        File conf = new File(ModContainer.outreach$ + "/CustomSteve/models/" + this.reminder$.substring(0, this.reminder$.length() - 4) + ".json");
        OutputStreamWriter writer = new OutputStreamWriter((OutputStream)new FileOutputStream(conf), "UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        JsonObject json = new JsonObject();
        JsonArray quickMotion = new JsonArray();
        for (int i = 0; i < this.expected$.length; ++i) {
            QuickMotionSetting qms = this.expected$[i];
            if (qms == null) {
                qms = new QuickMotionSetting();
            }
            this.expected$[i] = qms;
            qms._fridge(quickMotion);
        }
        json.add("QuickMotion", (JsonElement)quickMotion);
        bufferedWriter.write(json.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
        writer.close();
    }

    static /* synthetic */ int a(CSplayer x0, String x1, PmdFileInfo x2) throws Exception {
        return x0.a(x1, x2);
    }
}

