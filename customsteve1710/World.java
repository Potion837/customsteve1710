/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
import java.util.ListIterator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class World
implements IClassTransformer {
    String plain$ = "(IIILnet/minecraft/world/EnumSkyBlock;)I";
    String payable$ = "(IIILahn;)I";

    public byte[] a(boolean isConfusion, String arg0, Names names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        for (MethodNode m : classNode.methods) {
            if (!m.name.equals(names._caution(isConfusion, "Block.computeLightValue")) || !m.desc.equals(isConfusion ? this.payable$ : this.plain$)) continue;
            System.out.println("In target method! Patching!");
            AbstractInsnNode targetNode = null;
            ListIterator iter = m.instructions.iterator();
            boolean deleting = false;
            boolean replacing = false;
            while (iter.hasNext()) {
                targetNode = (AbstractInsnNode)iter.next();
                if (targetNode instanceof VarInsnNode) {
                    VarInsnNode vNode = (VarInsnNode)targetNode;
                    if (vNode.var == 6) {
                        if (vNode.getOpcode() == 58) {
                            System.out.println("Bytecode ASTORE 6 case!");
                            deleting = true;
                            continue;
                        }
                        if (vNode.getOpcode() == 54) {
                            System.out.println("Bytecode ISTORE 6 case!");
                            replacing = true;
                            targetNode = (AbstractInsnNode)iter.next();
                            break;
                        }
                    }
                    if (vNode.var == 7 && deleting) break;
                }
                if (!deleting) continue;
                System.out.println("Removing " + targetNode);
                iter.remove();
            }
            InsnList toInject = new InsnList();
            toInject.add((AbstractInsnNode)new VarInsnNode(25, 0));
            toInject.add((AbstractInsnNode)new VarInsnNode(25, 5));
            toInject.add((AbstractInsnNode)new VarInsnNode(21, 1));
            toInject.add((AbstractInsnNode)new VarInsnNode(21, 2));
            toInject.add((AbstractInsnNode)new VarInsnNode(21, 3));
            toInject.add((AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace('.', '/'), "j", "(L" + names._caution(isConfusion, "IBlockAccess") + ";L" + names._caution(isConfusion, "Block") + ";III)I", false));
            if (replacing) {
                toInject.add((AbstractInsnNode)new VarInsnNode(54, 6));
            }
            m.instructions.insertBefore(targetNode, toInject);
            System.out.println("Patching Complete!");
            break;
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

