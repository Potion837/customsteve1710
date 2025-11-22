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
 *  org.objectweb.asm.tree.JumpInsnNode
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 */
package customsteve.asm;

import customsteve.asm.ASMPointer;
import customsteve.asm.d;
import customsteve.asm.e;
import java.util.ListIterator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class n
implements d {
    @Override
    public byte[] a(boolean isConfusion, String arg0, e names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        LabelNode l2 = new LabelNode(new Label());
        for (MethodNode methodNode : classNode.methods) {
            MethodInsnNode min;
            int i2;
            if (!methodNode.name.equals("renderHand0")) continue;
            AbstractInsnNode ain = null;
            ListIterator iterable = methodNode.instructions.iterator();
            for (i2 = 0; i2 < methodNode.instructions.size(); ++i2) {
                ain = methodNode.instructions.get(i2);
                if (!(ain instanceof MethodInsnNode) || (min = (MethodInsnNode)ain).getOpcode() != 184 || !min.name.equals("beginHand") || !min.desc.equals("()V")) continue;
                InsnList inject = new InsnList();
                methodNode.instructions.insert(methodNode.instructions.get(i2), (AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace('.', '/'), "e", "()Z", false));
                methodNode.instructions.insert(methodNode.instructions.get(i2 + 1), (AbstractInsnNode)new JumpInsnNode(154, l2));
                LabelNode l3 = new LabelNode(new Label());
                methodNode.instructions.insert(methodNode.instructions.get(i2 + 2), (AbstractInsnNode)l3);
            }
            for (i2 = 0; i2 < methodNode.instructions.size(); ++i2) {
                ain = methodNode.instructions.get(i2);
                if (!(ain instanceof MethodInsnNode) || (min = (MethodInsnNode)ain).getOpcode() != 184 || !min.name.equals("endHand") || !min.desc.equals("()V")) continue;
                methodNode.instructions.remove(methodNode.instructions.get(i2 - 1));
                methodNode.instructions.insert(methodNode.instructions.get(i2 - 1), (AbstractInsnNode)l2);
                methodNode.instructions.insert(methodNode.instructions.get(i2 - 2), (AbstractInsnNode)new FrameNode(3, 0, null, 0, null));
            }
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

