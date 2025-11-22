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
package customsteve.asm;

import customsteve.LoadingPlugin;
import customsteve.asm.ASMPointer;
import customsteve.asm.d;
import customsteve.asm.e;
import customsteve.b_0;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

class m
implements d {
    m() {
    }

    @Override
    public byte[] a(boolean isConfusion, String arg0, e names, byte[] bytes) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept((ClassVisitor)classNode, 0);
        for (MethodNode methodNode : classNode.methods) {
            if (!methodNode.name.equals("loadShaderPack")) continue;
            LoadingPlugin.a = true;
            AbstractInsnNode ain2 = null;
            for (AbstractInsnNode ain2 : methodNode.instructions) {
                if (ain2.getOpcode() != 184 || !(ain2 instanceof MethodInsnNode) || !((MethodInsnNode)ain2).name.equals("loadShaderPackResources")) continue;
                b_0.B = true;
                break;
            }
            methodNode.instructions.insertBefore(ain2, (AbstractInsnNode)new MethodInsnNode(184, "shadersmod/client/Shaders", "getShaderPackName", "()Ljava/lang/String;", false));
            methodNode.instructions.insertBefore(ain2, (AbstractInsnNode)new MethodInsnNode(184, ASMPointer.class.getName().replace('.', '/'), "d", "(Ljava/lang/String;)V", false));
            break;
        }
        ClassWriter writer = new ClassWriter(2);
        classNode.accept((ClassVisitor)writer);
        return writer.toByteArray();
    }
}

