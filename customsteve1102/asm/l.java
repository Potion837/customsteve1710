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
 *  org.objectweb.asm.tree.FrameNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.InsnNode
 *  org.objectweb.asm.tree.JumpInsnNode
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
package customsteve.asm;

import customsteve.asm.ASMPointer;
import customsteve.asm.d;
import customsteve.asm.e;
import java.util.Iterator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class l
implements d {
    String a;

    @Override
    public byte[] a(boolean isConfusion, String arg0, e names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        Iterator methods = classNode.methods.iterator();
        this.a = names.a(isConfusion, "AbstractClientPlayer");
        while (methods.hasNext()) {
            MethodNode m2 = (MethodNode)methods.next();
            if (!names.a("RenderPlayer.doRender").a(m2.name) || !m2.desc.equals("(L" + this.a + ";DDDFF)V")) continue;
            InsnList inject = new InsnList();
            inject.add((AbstractInsnNode)new VarInsnNode(25, 1));
            inject.add((AbstractInsnNode)new VarInsnNode(24, 2));
            inject.add((AbstractInsnNode)new VarInsnNode(24, 4));
            inject.add((AbstractInsnNode)new VarInsnNode(24, 6));
            inject.add((AbstractInsnNode)new VarInsnNode(23, 8));
            inject.add((AbstractInsnNode)new VarInsnNode(23, 9));
            inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "c", "(L" + this.a + ";DDDFF)Z"));
            LabelNode l1 = new LabelNode(new Label());
            inject.add((AbstractInsnNode)new JumpInsnNode(153, l1));
            inject.add((AbstractInsnNode)new LabelNode(new Label()));
            inject.add((AbstractInsnNode)new InsnNode(177));
            inject.add((AbstractInsnNode)l1);
            inject.add((AbstractInsnNode)new FrameNode(3, 0, null, 0, null));
            m2.instructions.insert(inject);
            break;
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

