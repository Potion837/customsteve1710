/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class PhysicsInfoExport {
    PmdFileInfo auckland$;
    private BufferedOutputStream theory$;
    private BufferedWriter society$;

    public PhysicsInfoExport(PmdFileInfo pfi) {
        this.auckland$ = pfi;
    }

    public void _billing(File tar) throws Exception {
        int i;
        if (!tar.exists()) {
            tar.createNewFile();
        } else {
            tar.delete();
            tar.createNewFile();
        }
        this.theory$ = new BufferedOutputStream(new FileOutputStream(tar.getAbsolutePath()));
        this.society$ = new BufferedWriter(new OutputStreamWriter(this.theory$));
        ArrayList rbs = this.auckland$.adopt$;
        ArrayList css = this.auckland$.dressing$;
        this._eagles(rbs.size());
        for (i = 0; i < rbs.size(); ++i) {
            RigidBody rb = (RigidBody)rbs.get(i);
            this._rocky(rb.lucia$);
            this._cocktail(rb.naples$);
            this._cocktail(rb.filing$);
            this._cocktail(rb.sorts$);
            Bone b2 = null;
            try {
                b2 = (Bone)this.auckland$.pointer$.get(rb.frequent$);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (b2 != null) {
                this._cocktail(b2.pencil$._strongly((float)rb.nothing$, (float)rb.pleasure$, (float)rb.matching$).serves$);
                this._cocktail(b2.pencil$._strongly((float)rb.nothing$, (float)rb.pleasure$, (float)rb.matching$).genius$);
                this._cocktail(b2.pencil$._strongly((float)rb.nothing$, (float)rb.pleasure$, (float)rb.matching$).superb$);
            } else {
                this._cocktail(rb.nothing$);
                this._cocktail(rb.pleasure$);
                this._cocktail(rb.matching$);
            }
            Quaternion q = new Quaternion();
            q._between(-rb.heating$, rb.brands$, -rb.refuse$);
            q._equal();
            Quaternion cq = new Quaternion(q._strain(), q._median(), q._magnet(), q._their());
            float[] angles = cq._always(null);
            this._cocktail(rb.refuse$);
            this._cocktail(rb.heating$);
            this._cocktail(rb.brands$);
            this._cocktail(rb.waters$);
            this._cocktail(rb.travel$);
            this._cocktail(rb.formerly$);
            this._cocktail(rb.scary$);
            this._cocktail(rb.arabic$);
            this._rocky(rb.studio$);
            int test = -1;
            this._terry(rb.beaver$);
            this._rocky(rb.hotel$);
        }
        this._eagles(css.size());
        for (i = 0; i < css.size(); ++i) {
            Constraint cs = (Constraint)css.get(i);
            this._rocky((int)cs.butter$);
            this._rocky((int)cs.zealand$);
            this._cocktail(cs.sunset$);
            this._cocktail(cs.gallery$);
            this._cocktail(cs.serve$);
            this._cocktail(cs.military$);
            this._cocktail(cs.claimed$);
            this._cocktail(cs.viewers$);
            this._cocktail(cs.crimes$);
            this._cocktail(cs.wishes$);
            this._cocktail(cs.visit$);
            this._cocktail(cs.forth$);
            this._cocktail(cs.animated$);
            this._cocktail(cs.except$);
            this._cocktail(cs.avatar$);
            this._cocktail(cs.lamps$);
            this._cocktail(cs.mobile$);
            this._cocktail(cs.retain$);
            this._cocktail(cs.lifetime$);
            this._cocktail(cs.compiled$);
            this._cocktail(cs.spirits$);
            this._cocktail(cs.vegas$);
            this._cocktail(cs.clients$);
            this._cocktail(cs.klein$);
            this._cocktail(cs.porter$);
            this._cocktail(cs.student$);
        }
        this.theory$.flush();
        this.theory$.close();
    }

    private void _cocktail(float f2) throws IOException {
        byte[] result = new byte[4];
        int i = Float.floatToIntBits(f2);
        result[0] = (byte)(i >> 24 & 0xFF);
        result[1] = (byte)(i >> 16 & 0xFF);
        result[2] = (byte)(i >> 8 & 0xFF);
        result[3] = (byte)(i & 0xFF);
        this.theory$.write(result);
    }

    private void _rocky(int i) throws IOException {
        byte[] result = new byte[]{(byte)(i >> 24 & 0xFF), (byte)(i >> 16 & 0xFF), (byte)(i >> 8 & 0xFF), (byte)(i & 0xFF)};
        this.theory$.write(result);
    }

    private void _trout(short s) throws IOException {
        byte[] result = new byte[2];
        result[1] = (byte)(s >> 8 & 0xFF);
        result[0] = (byte)(s & 0xFF);
        this.theory$.write(result);
    }

    private void _terry(byte b2) throws IOException {
        this.theory$.write(b2);
    }

    private void _eagles(long l) throws IOException {
        int i = (int)l;
        byte[] result = new byte[]{(byte)(i >> 24 & 0xFF), (byte)(i >> 16 & 0xFF), (byte)(i >> 8 & 0xFF), (byte)(i & 0xFF)};
        this.theory$.write(result);
    }
}

