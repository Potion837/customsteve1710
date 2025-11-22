/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 */
import java.util.ArrayList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;

public class PmdFileInfo {
    public String menus$;
    public String column$;
    public ArrayList belongs$ = new ArrayList();
    public ArrayList blocked$ = new ArrayList();
    public ArrayList pointer$ = new ArrayList();
    public ArrayList february$ = new ArrayList();
    public ArrayList linda$ = new ArrayList();
    public ArrayList dressing$;
    public ArrayList adopt$;
    public ArrayList highs$;
    public ArrayList favorite$;
    public pmxMorph runner$;
    public pmxMorph briefs$;
    public pmxMorph clicking$;
    public pmxMorph toyota$;
    public Bone phantom$;
    public Bone hydrogen$;
    public Bone honest$;
    public Bone produce$;
    public Bone bottles$;
    public Bone feeling$;
    public Bone visited$;
    public Bone discrete$;
    public Bone suffered$;
    public Bone markets$;
    public Bone hawaii$;
    public CS_Bullet fully$;
    public EntityLivingBase thursday$;
    public int pieces$ = 0;
    public int mutual$ = 0;
    public boolean steel$ = true;
    public int transmit$ = 75;
    public int advanced$ = -25;
    public int jewelry$;
    public int tragedy$;
    public int geology$ = 0;
    public int rarely$ = 0;
    public int occupied$;
    public int measure$;
    public float waste$;
    public float cadillac$;
    public float suspect$;
    public float bookings$;
    public Quaternion address$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public Quaternion affected$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public Quaternion tourist$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public Quaternion diffs$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public Quaternion services$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public Quaternion imagine$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public Quaternion animal$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public Quaternion doubt$ = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);

    public void _brunei() {
        this.address$._looks();
        this.affected$._looks();
        this.tourist$._looks();
        this.services$._looks();
        this.imagine$._looks();
    }

    public void _chart(boolean sb) {
        if (this.steel$ != sb) {
            this.steel$ = sb;
            this.tourist$._looks();
            this.services$._looks();
            this.imagine$._looks();
            this.animal$._looks();
            this.doubt$._looks();
        }
    }

    public WeaponFileInfo _input(Item item, String pmdFileName, String textureFolderName) {
        int i;
        WeaponFileInfo newpfi = new WeaponFileInfo(item, pmdFileName, textureFolderName);
        newpfi.a = this.menus$;
        newpfi.b = this.column$;
        newpfi.a = this.belongs$;
        newpfi.b = this.blocked$;
        newpfi.c = new ArrayList();
        for (i = 0; i < this.pointer$.size(); ++i) {
            Bone b2 = (Bone)this.pointer$.get(i);
            newpfi.c.add(new Bone(b2));
        }
        newpfi.e = new ArrayList();
        for (i = 0; i < this.linda$.size(); ++i) {
            IK ik = (IK)this.linda$.get(i);
            ArrayList childs = new ArrayList();
            for (int j = 0; j < ik.cancer$.size(); ++j) {
                childs.add(newpfi.c.get((Integer)ik.cancer$.get(j)));
            }
            newpfi.e.add(new IK(ik, (Bone)newpfi.c.get(ik.dealtime$), (Bone)newpfi.c.get(ik.platform$), childs));
        }
        newpfi.h = this.highs$;
        newpfi.f = this.dressing$;
        newpfi.g = this.adopt$;
        newpfi.i = this.favorite$;
        return newpfi;
    }

    public void _observed() {
        if (this.belongs$ != null && this.belongs$.size() > 0) {
            ArrayList mats = ((Geometry)this.belongs$.get((int)0)).found$;
            for (int i = 0; i < mats.size(); ++i) {
                ((Material)mats.get(i))._blogger();
            }
        }
    }

    public IK _magical(Bone b2) {
        for (int i = 0; i < this.linda$.size(); ++i) {
            for (int j = 0; j < ((IK)this.linda$.get((int)i)).locked$.size(); ++j) {
                if (!((Bone)((IK)this.linda$.get((int)i)).locked$.get((int)j)).heavy$.equals(b2.heavy$)) continue;
                return (IK)this.linda$.get(i);
            }
        }
        return null;
    }

    public boolean _planners(Bone b2) {
        for (int i = 0; i < this.linda$.size(); ++i) {
            for (int j = 0; j < ((IK)this.linda$.get((int)i)).locked$.size(); ++j) {
                if (!((IK)this.linda$.get((int)i)).salary$.heavy$.equals(b2.heavy$)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean _stadium(Bone b2) {
        for (int i = 0; i < this.linda$.size(); ++i) {
            for (int j = 0; j < ((IK)this.linda$.get((int)i)).locked$.size(); ++j) {
                if (!((Bone)((IK)this.linda$.get((int)i)).locked$.get((int)j)).heavy$.equals(b2.heavy$) && !((IK)this.linda$.get((int)i)).firmware$.heavy$.equals(b2.heavy$)) continue;
                return true;
            }
        }
        return false;
    }
}

