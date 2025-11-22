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
 *  org.objectweb.asm.tree.FrameNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.InsnNode
 *  org.objectweb.asm.tree.JumpInsnNode
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class EntityRenderer
implements IClassTransformer {
    String reporter$;

    public byte[] a(boolean isConfusion, String arg0, Names names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        this.reporter$ = names._caution(isConfusion, "EntityRenderer");
        block0: for (MethodNode m : classNode.methods) {
            InsnList inject;
            LabelNode end;
            MethodInsnNode min;
            AbstractInsnNode ain;
            int i;
            if (m.name.equals(names._caution(isConfusion, "EntityRenderer.orientCamera")) && m.desc.equals("(F)V")) {
                for (i = 0; i < m.instructions.size(); ++i) {
                    FieldInsnNode fin;
                    VarInsnNode vin;
                    ain = m.instructions.get(i);
                    if (!(ain instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 25 || vin.var != 2 || !((ain = m.instructions.get(i + 1)) instanceof FieldInsnNode) || (fin = (FieldInsnNode)ain).getOpcode() != 180 || !((ain = m.instructions.get(i + 2)) instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 56 || vin.var != 13 || !((ain = m.instructions.get(i + 5)) instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 25 || vin.var != 2 || !((ain = m.instructions.get(i + 6)) instanceof FieldInsnNode) || (fin = (FieldInsnNode)ain).getOpcode() != 180 || !((ain = m.instructions.get(i + 7)) instanceof VarInsnNode) || (vin = (VarInsnNode)ain).getOpcode() != 56 || vin.var != 12) continue;
                    InsnList inject2 = new InsnList();
                    inject2.add((AbstractInsnNode)new VarInsnNode(23, 13));
                    inject2.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "a", "()F"));
                    inject2.add((AbstractInsnNode)new InsnNode(98));
                    inject2.add((AbstractInsnNode)new VarInsnNode(56, 13));
                    inject2.add((AbstractInsnNode)new VarInsnNode(24, 10));
                    inject2.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "b", "()F"));
                    inject2.add((AbstractInsnNode)new InsnNode(141));
                    inject2.add((AbstractInsnNode)new InsnNode(107));
                    inject2.add((AbstractInsnNode)new VarInsnNode(57, 10));
                    inject2.add((AbstractInsnNode)new LabelNode(new Label()));
                    m.instructions.insertBefore(m.instructions.get(i + 8), inject2);
                }
                continue;
            }
            if (!m.name.equals(names._caution(isConfusion, "EntityRenderer.renderWorld")) || !m.desc.equals("(FJ)V")) continue;
            for (i = 0; i < m.instructions.size(); ++i) {
                ain = m.instructions.get(i);
                if (!(ain instanceof MethodInsnNode)) continue;
                min = (MethodInsnNode)ain;
                if (!min.name.equals(names._caution(isConfusion, "EntityRenderer.renderHand")) || !min.desc.equals("(FI)V")) continue;
                int p = i - 3;
                if (!(min.getNext() instanceof LabelNode)) continue;
                end = (LabelNode)min.getNext();
                inject = new InsnList();
                inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "g", "()Z"));
                inject.add((AbstractInsnNode)new JumpInsnNode(153, end));
                inject.add((AbstractInsnNode)new LabelNode(new Label()));
                m.instructions.insertBefore(m.instructions.get(p), inject);
                break;
            }
            for (i = 0; i < m.instructions.size(); ++i) {
                ain = m.instructions.get(i);
                if (!(ain instanceof MethodInsnNode)) continue;
                min = (MethodInsnNode)ain;
                Config._lightbox(min.name + "  " + min.desc);
                if (!min.name.equals(names._caution(isConfusion, "EntityRenderer.setupCameraTransform")) || !min.desc.equals("(FI)V")) continue;
                Config._lightbox("find C!");
                int p = i - 4;
                if (!(min.getNext() instanceof LabelNode)) continue;
                end = (LabelNode)min.getNext();
                inject = new InsnList();
                LabelNode l2 = new LabelNode(new Label());
                inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "h", "()Z", false));
                inject.add((AbstractInsnNode)new JumpInsnNode(154, l2));
                inject.add((AbstractInsnNode)new LabelNode(new Label()));
                m.instructions.insert(m.instructions.get(p), inject);
                p = p + 4 + 3;
                m.instructions.remove(m.instructions.get(p + 1));
                m.instructions.insert(m.instructions.get(p), (AbstractInsnNode)l2);
                m.instructions.insert(m.instructions.get(p + 1), (AbstractInsnNode)new FrameNode(3, 0, null, 0, null));
                break block0;
            }
            break;
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

