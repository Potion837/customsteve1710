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
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
import java.util.Iterator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class EntityPlayer
implements IClassTransformer {
    String manage$;

    public byte[] a(boolean isConfusion, String arg0, Names names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        Iterator methods = classNode.methods.iterator();
        this.manage$ = names._caution(isConfusion, "EntityPlayer");
        while (methods.hasNext()) {
            MethodNode m = (MethodNode)methods.next();
            if (!names._religion("EntityPlayer.addMovementStat")._founded(m.name) || !m.desc.equals("(DDD)V")) continue;
            InsnList inject = new InsnList();
            inject.add((AbstractInsnNode)new VarInsnNode(25, 0));
            inject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace(".", "/"), "f", "(L" + this.manage$ + ";)V"));
            inject.add((AbstractInsnNode)new LabelNode(new Label()));
            m.instructions.insert(inject);
            break;
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

