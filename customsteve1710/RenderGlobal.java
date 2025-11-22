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
 *  org.objectweb.asm.tree.InsnList
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
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class RenderGlobal
implements IClassTransformer {
    String florence$;

    public byte[] a(boolean isConfusion, String arg0, Names names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        this.florence$ = names._caution(isConfusion, "RenderGlobal");
        block0: for (MethodNode m : classNode.methods) {
            if (!m.name.equals(names._caution(isConfusion, "RenderGlobal.renderEntities")) || !m.desc.equals("(L" + names._caution(isConfusion, "EntityLivingBase") + ";L" + names._caution(isConfusion, "ICamera") + ";F)V")) continue;
            for (int i = 0; i < m.instructions.size(); ++i) {
                AbstractInsnNode ain = m.instructions.get(i);
                if (!(ain instanceof JumpInsnNode) || ((JumpInsnNode)ain).getOpcode() != 153 || !((ain = m.instructions.get(i + 5)) instanceof JumpInsnNode) || ((JumpInsnNode)ain).getOpcode() != 166 || !((ain = m.instructions.get(i + 5 + 5)) instanceof JumpInsnNode) || ((JumpInsnNode)ain).getOpcode() != 154 || !((ain = m.instructions.get(i + 5 + 5 + 5)) instanceof JumpInsnNode) || ((JumpInsnNode)ain).getOpcode() != 153 || !((ain = m.instructions.get(i + 5 + 5 + 5 + 13)) instanceof JumpInsnNode) || ((JumpInsnNode)ain).getOpcode() != 153) continue;
                int p = i - 1;
                InsnList inject = new InsnList();
                inject.add((AbstractInsnNode)new VarInsnNode(25, 20));
                inject.add((AbstractInsnNode)new VarInsnNode(23, 3));
                inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "i", "(L" + names._caution(isConfusion, "Entity") + ";F)V"));
                inject.add((AbstractInsnNode)new LabelNode(new Label()));
                m.instructions.insertBefore(m.instructions.get(p), inject);
                continue block0;
            }
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

