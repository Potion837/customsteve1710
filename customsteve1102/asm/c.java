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
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class c
implements d {
    String a;

    @Override
    public byte[] a(boolean isConfusion, String arg0, e names, byte[] bytes) {
        AbstractInsnNode ain;
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        this.a = names.a(isConfusion, "EntityRenderer");
        block0: for (MethodNode m2 : classNode.methods) {
            if (!m2.name.equals(names.a(isConfusion, "EntityRenderer.setupCameraTransform")) || !m2.desc.equals("(FI)V")) continue;
            AbstractInsnNode currentNode2 = null;
            for (AbstractInsnNode currentNode2 : m2.instructions) {
                if (!(currentNode2 instanceof InsnNode) || ((InsnNode)currentNode2).getOpcode() != 177) continue;
                m2.instructions.insertBefore(currentNode2, (AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "h", "()Z", false));
                break block0;
            }
        }
        for (MethodNode m2 : classNode.methods) {
            if (!m2.name.equals(names.a(isConfusion, "EntityRenderer.orientCamera")) || !m2.desc.equals("(F)V")) continue;
            for (int i2 = 0; i2 < m2.instructions.size(); ++i2) {
                FieldInsnNode fin;
                VarInsnNode vin;
                ain = m2.instructions.get(i2);
                if (!(ain instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 25 || vin.var != 2 || !((ain = m2.instructions.get(i2 + 1)) instanceof FieldInsnNode) || (fin = (FieldInsnNode)ain).getOpcode() != 180 || !((ain = m2.instructions.get(i2 + 2)) instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 56 || vin.var != 12 || !((ain = m2.instructions.get(i2 + 5)) instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 25 || vin.var != 2 || !((ain = m2.instructions.get(i2 + 6)) instanceof FieldInsnNode) || (fin = (FieldInsnNode)ain).getOpcode() != 180 || !((ain = m2.instructions.get(i2 + 7)) instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 56 || vin.var != 13) continue;
                InsnList inject = new InsnList();
                inject.add((AbstractInsnNode)new VarInsnNode(23, 12));
                inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "a", "()F"));
                inject.add((AbstractInsnNode)new InsnNode(98));
                inject.add((AbstractInsnNode)new VarInsnNode(56, 12));
                inject.add((AbstractInsnNode)new VarInsnNode(24, 10));
                inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "b", "()F"));
                inject.add((AbstractInsnNode)new InsnNode(141));
                inject.add((AbstractInsnNode)new InsnNode(107));
                inject.add((AbstractInsnNode)new VarInsnNode(57, 10));
                inject.add((AbstractInsnNode)new LabelNode(new Label()));
                m2.instructions.insertBefore(m2.instructions.get(i2 + 8), inject);
            }
        }
        for (MethodNode m2 : classNode.methods) {
            int i3;
            if (!m2.name.equals(names.a(isConfusion, "EntityRenderer.renderWorldPass")) || !m2.desc.equals("(IFJ)V")) continue;
            for (i3 = 0; i3 < m2.instructions.size(); ++i3) {
                ain = m2.instructions.get(i3);
                if (!(ain instanceof MethodInsnNode)) continue;
                MethodInsnNode min = (MethodInsnNode)ain;
                if (!min.name.equals(names.a(isConfusion, "EntityRenderer.renderHand")) || !min.desc.equals("(FI)V")) continue;
                int p2 = i3 - 3;
                if (!(min.getNext() instanceof LabelNode)) continue;
                LabelNode end = (LabelNode)min.getNext();
                InsnList inject = new InsnList();
                inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "g", "()Z"));
                inject.add((AbstractInsnNode)new JumpInsnNode(153, end));
                inject.add((AbstractInsnNode)new LabelNode(new Label()));
                m2.instructions.insertBefore(m2.instructions.get(p2), inject);
                break;
            }
            for (i3 = 0; i3 < m2.instructions.size(); ++i3) {
                ain = m2.instructions.get(i3);
                if (!(ain instanceof MethodInsnNode)) continue;
            }
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

