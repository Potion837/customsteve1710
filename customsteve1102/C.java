/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface C {
    public static final int a = 0;

    public boolean a() default false;
}

