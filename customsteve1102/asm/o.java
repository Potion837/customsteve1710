/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.FieldInsnNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
package customsteve.asm;

import customsteve.a_0;
import customsteve.asm.d;
import customsteve.asm.e;
import java.util.Iterator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class o
implements d {
    String a;

    @Override
    public byte[] a(boolean isConfusion, String arg0, e names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        Iterator methods = classNode.methods.iterator();
        this.a = names.a(isConfusion, "SoundManager");
        while (methods.hasNext()) {
            MethodNode m2 = (MethodNode)methods.next();
            if (!names.a(isConfusion, "SoundManager.stopAllSounds").equals(m2.name) || !m2.desc.equals("()V")) continue;
            InsnList inject = new InsnList();
            inject.add((AbstractInsnNode)new FieldInsnNode(178, a_0.class.getName().replace('.', '/'), "instance", "L" + a_0.class.getName().replace('.', '/') + ";"));
            inject.add((AbstractInsnNode)new VarInsnNode(25, 0));
            inject.add((AbstractInsnNode)new FieldInsnNode(180, this.a, names.a(isConfusion, "SoundManager.sndSystem"), "L" + names.a(isConfusion, "SoundManager.SoundSystemStarterThread") + ";"));
            inject.add((AbstractInsnNode)new FieldInsnNode(179, a_0.class.getName().replace('.', '/'), "sndSystem", "Lpaulscode/sound/SoundSystem;"));
            inject.add((AbstractInsnNode)new LabelNode(new Label()));
            m2.instructions.insert(m2.instructions.get(m2.instructions.size() - 3), inject);
            break;
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

