/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 */
import java.util.ListIterator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

class Shaders
implements IClassTransformer {
    Shaders() {
    }

    public byte[] a(boolean isConfusion, String arg0, Names names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        for (MethodNode methodNode : classNode.methods) {
            if (!methodNode.name.equals("loadShaderPack")) continue;
            LoadingPlugin.agencies$ = true;
            AbstractInsnNode ain = null;
            ListIterator iterable = methodNode.instructions.iterator();
            while (!(!iterable.hasNext() || (ain = (AbstractInsnNode)iterable.next()).getOpcode() == 184 && ain instanceof MethodInsnNode && ((MethodInsnNode)ain).name.equals("loadShaderPackResources"))) {
            }
            methodNode.instructions.insertBefore(ain, (AbstractInsnNode)new MethodInsnNode(184, "shadersmod/client/Shaders", "getShaderPackName", "()Ljava/lang/String;", false));
            methodNode.instructions.insertBefore(ain, (AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace('.', '/'), "d", "(Ljava/lang/String;)V", false));
            break;
        }
        ClassWriter writer = new ClassWriter(1);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

