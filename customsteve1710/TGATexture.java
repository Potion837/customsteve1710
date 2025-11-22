/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataInputStream
 *  javax.activation.UnsupportedDataTypeException
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  net.minecraft.util.ResourceLocation
 */
import com.google.common.io.LittleEndianDataInputStream;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.activation.UnsupportedDataTypeException;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TGATexture
extends SimpleTexture {
    public TGATexture(ResourceLocation par1ResourceLocation) {
        super(par1ResourceLocation);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() throws IOException {
        InputStream inputstream = null;
        try {
            File file = new File(ModContainer.outreach$ + "/" + this.a.func_110623_a());
            inputstream = new FileInputStream(file);
            BufferedImage bufferedimage = TGATexture.a(inputstream);
            boolean flag = false;
            boolean flag1 = false;
            TextureUtil.func_110989_a((int)this.a(), (BufferedImage)bufferedimage, (boolean)flag, (boolean)flag1);
        }
        finally {
            if (inputstream != null) {
                inputstream.close();
            }
        }
    }

    public static BufferedImage a(InputStream inputStream) throws IOException {
        LittleEndianDataInputStream stream = null;
        BufferedImage bufferedImage = null;
        try {
            int x;
            int y;
            stream = new LittleEndianDataInputStream((InputStream)new BufferedInputStream(inputStream));
            int idLength = stream.readUnsignedByte();
            boolean hasColorMap = stream.readUnsignedByte() == 1;
            int imageType = stream.readUnsignedByte();
            int cmFirstEntryIndex = stream.readUnsignedShort();
            int cmLength = stream.readUnsignedShort();
            int cmEntrySize = stream.readUnsignedByte();
            if (hasColorMap && cmEntrySize != 24 && cmEntrySize != 32) {
                throw new UnsupportedDataTypeException("Unsupported TGA color map entry size:" + cmEntrySize + "(Must be 24 or 32)");
            }
            int originX = stream.readUnsignedShort();
            int originY = stream.readUnsignedShort();
            if (originX != 0 || originY != 0) {
                throw new UnsupportedDataTypeException("Unsupported TGA origin. (Must be (0,0))");
            }
            int width = stream.readUnsignedShort();
            int height = stream.readUnsignedShort();
            int pixelDepth = stream.readUnsignedByte();
            if (pixelDepth != 32 && pixelDepth != 24 && pixelDepth != 16) {
                throw new UnsupportedDataTypeException("Unsupported TGA pixel depth:" + pixelDepth + "(Must be 16, 24 or 32)");
            }
            byte descriptor = stream.readByte();
            boolean ltr = (descriptor & 0x10) == 0;
            boolean btt = (descriptor & 0x20) == 0;
            stream.skipBytes(idLength);
            Object colorMap = null;
            int length = width * height;
            ByteBuffer byteBuffer = ByteBuffer.allocate(length * 4);
            if (imageType == 0) {
                for (int i = 0; i < length; ++i) {
                    byteBuffer.put((byte)0);
                    byteBuffer.put((byte)0);
                    byteBuffer.put((byte)0);
                    byteBuffer.put((byte)0);
                }
            } else if (imageType == 2) {
                byte[] bytes = new byte[length * 4];
                if (ltr && btt) {
                    for (y = height - 1; y >= 0; --y) {
                        for (x = 0; x < width; ++x) {
                            TGATexture.a(bytes, (y * width + x) * 4, pixelDepth, stream);
                        }
                    }
                } else if (!ltr && btt) {
                    for (y = height - 1; y >= 0; --y) {
                        for (x = width - 1; x >= 0; --x) {
                            TGATexture.a(bytes, (y * width + x) * 4, pixelDepth, stream);
                        }
                    }
                } else if (ltr && !btt) {
                    for (y = 0; y < height; ++y) {
                        for (x = 0; x < width; ++x) {
                            TGATexture.a(bytes, (y * width + x) * 4, pixelDepth, stream);
                        }
                    }
                } else {
                    for (y = 0; y < height; ++y) {
                        for (x = width - 1; x >= 0; --x) {
                            TGATexture.a(bytes, (y * width + x) * 4, pixelDepth, stream);
                        }
                    }
                }
                byteBuffer.put(bytes);
            } else if (imageType == 3) {
                byte[] bytes = new byte[length * 4];
                if (ltr && btt) {
                    for (y = height - 1; y >= 0; --y) {
                        for (x = 0; x < width; ++x) {
                            TGATexture.a(bytes, (y * width + x) * 4, stream);
                        }
                    }
                } else if (!ltr && btt) {
                    for (y = height - 1; y >= 0; --y) {
                        for (x = width - 1; x >= 0; --x) {
                            TGATexture.a(bytes, (y * width + x) * 4, stream);
                        }
                    }
                } else if (ltr && !btt) {
                    for (y = 0; y < height; ++y) {
                        for (x = 0; x < width; ++x) {
                            TGATexture.a(bytes, (y * width + x) * 4, stream);
                        }
                    }
                } else {
                    for (y = 0; y < height; ++y) {
                        for (x = width - 1; x >= 0; --x) {
                            TGATexture.a(bytes, (y * width + x) * 4, stream);
                        }
                    }
                }
                byteBuffer.put(bytes);
            } else if (imageType == 10) {
                int[] result;
                int i;
                int x2;
                int y2;
                byte[] bytes = new byte[length * 4];
                int skip = 0;
                boolean onRLE = false;
                byte cR = 0;
                byte cG = 0;
                byte cB = 0;
                byte cA = 0;
                if (ltr && btt) {
                    for (y2 = height - 1; y2 >= 0; --y2) {
                        for (x2 = 0; x2 < width; ++x2) {
                            if (skip > 0) {
                                if (onRLE) {
                                    i = (y2 * width + x2) * 4;
                                    bytes[i] = cR;
                                    bytes[i + 1] = cG;
                                    bytes[i + 2] = cB;
                                    bytes[i + 3] = cA;
                                    --skip;
                                    continue;
                                }
                                TGATexture.a(bytes, (y2 * width + x2) * 4, pixelDepth, stream);
                                --skip;
                                continue;
                            }
                            i = (y2 * width + x2) * 4;
                            result = TGATexture.a(bytes, i, pixelDepth, stream);
                            onRLE = result[0] == 1;
                            skip = result[1];
                            TGATexture.a(bytes, i, pixelDepth, stream);
                            --skip;
                            cR = bytes[i];
                            cG = bytes[i + 1];
                            cB = bytes[i + 2];
                            cA = bytes[i + 3];
                        }
                    }
                } else if (!ltr && btt) {
                    for (y2 = height - 1; y2 >= 0; --y2) {
                        for (x2 = width - 1; x2 >= 0; --x2) {
                            if (skip > 0) {
                                if (onRLE) {
                                    i = (y2 * width + x2) * 4;
                                    bytes[i] = cR;
                                    bytes[i + 1] = cG;
                                    bytes[i + 2] = cB;
                                    bytes[i + 3] = cA;
                                    --skip;
                                    continue;
                                }
                                TGATexture.a(bytes, (y2 * width + x2) * 4, pixelDepth, stream);
                                --skip;
                                continue;
                            }
                            i = (y2 * width + x2) * 4;
                            result = TGATexture.a(bytes, i, pixelDepth, stream);
                            onRLE = result[0] == 1;
                            skip = result[1];
                            TGATexture.a(bytes, i, pixelDepth, stream);
                            --skip;
                            cR = bytes[i];
                            cG = bytes[i + 1];
                            cB = bytes[i + 2];
                            cA = bytes[i + 3];
                        }
                    }
                } else if (ltr && !btt) {
                    for (y2 = 0; y2 < height; ++y2) {
                        for (x2 = 0; x2 < width; ++x2) {
                            if (skip > 0) {
                                if (onRLE) {
                                    i = (y2 * width + x2) * 4;
                                    bytes[i] = cR;
                                    bytes[i + 1] = cG;
                                    bytes[i + 2] = cB;
                                    bytes[i + 3] = cA;
                                    --skip;
                                    continue;
                                }
                                TGATexture.a(bytes, (y2 * width + x2) * 4, pixelDepth, stream);
                                --skip;
                                continue;
                            }
                            i = (y2 * width + x2) * 4;
                            result = TGATexture.a(bytes, i, pixelDepth, stream);
                            onRLE = result[0] == 1;
                            skip = result[1];
                            TGATexture.a(bytes, i, pixelDepth, stream);
                            --skip;
                            cR = bytes[i];
                            cG = bytes[i + 1];
                            cB = bytes[i + 2];
                            cA = bytes[i + 3];
                        }
                    }
                } else {
                    for (y2 = 0; y2 < height; ++y2) {
                        for (x2 = width - 1; x2 >= 0; --x2) {
                            if (skip > 0) {
                                if (onRLE) {
                                    i = (y2 * width + x2) * 4;
                                    bytes[i] = cR;
                                    bytes[i + 1] = cG;
                                    bytes[i + 2] = cB;
                                    bytes[i + 3] = cA;
                                    --skip;
                                    continue;
                                }
                                TGATexture.a(bytes, (y2 * width + x2) * 4, pixelDepth, stream);
                                --skip;
                                continue;
                            }
                            i = (y2 * width + x2) * 4;
                            result = TGATexture.a(bytes, i, pixelDepth, stream);
                            onRLE = result[0] == 1;
                            skip = result[1];
                            TGATexture.a(bytes, i, pixelDepth, stream);
                            --skip;
                            cR = bytes[i];
                            cG = bytes[i + 1];
                            cB = bytes[i + 2];
                            cA = bytes[i + 3];
                        }
                    }
                }
                byteBuffer.put(bytes);
            }
            byteBuffer.flip();
            bufferedImage = new BufferedImage(width, height, 2);
            for (int y3 = 0; y3 < height; ++y3) {
                for (int x3 = 0; x3 < width; ++x3) {
                    bufferedImage.setRGB(x3, y3, byteBuffer.getInt());
                }
            }
            stream.close();
            BufferedImage bufferedImage2 = bufferedImage;
            return bufferedImage2;
        }
        catch (IOException e2) {
            throw e2;
        }
        finally {
            if (stream != null) {
                stream.close();
            }
        }
    }

    private static final int[] a(byte[] bytes, int offset, int depth, LittleEndianDataInputStream stream) throws IOException {
        int head = stream.readUnsignedByte();
        int count = (head & 0x7F) + 1;
        int rle = head >> 7 == 1 ? 1 : 0;
        return new int[]{rle, count};
    }

    private static final void a(byte[] bytes, int offset, LittleEndianDataInputStream stream) throws IOException {
        int grey = stream.readUnsignedByte();
        grey = 255 - grey;
        bytes[offset] = (byte)grey;
        bytes[offset + 1] = (byte)grey;
        bytes[offset + 2] = (byte)grey;
        bytes[offset + 3] = -1;
    }

    private static final void a(byte[] bytes, int offset, int depth, LittleEndianDataInputStream stream) throws IOException {
        switch (depth) {
            case 32: {
                bytes[offset + 3] = stream.readByte();
                bytes[offset + 2] = stream.readByte();
                bytes[offset + 1] = stream.readByte();
                bytes[offset] = stream.readByte();
                break;
            }
            case 24: {
                bytes[offset + 3] = stream.readByte();
                bytes[offset + 2] = stream.readByte();
                bytes[offset + 1] = stream.readByte();
                bytes[offset] = -1;
                break;
            }
            case 16: {
                short color = stream.readShort();
                bytes[offset + 1] = (byte)((color & 0x7C00) >>> 10);
                bytes[offset + 2] = (byte)((color & 0x3E0) >>> 5);
                bytes[offset + 3] = (byte)(color & 0x1F);
                bytes[offset] = (color & 0x8000) == 0 ? 127 : -1;
            }
        }
    }

    private static final void a(byte[] bytes, int offset, int[] colorMap, int first, LittleEndianDataInputStream stream) throws IOException {
        int index = stream.readUnsignedShort();
        int color = colorMap[first + index];
        bytes[offset] = (byte)(color >>> 24 & 0xFF);
        bytes[offset + 1] = (byte)(color >>> 16 & 0xFF);
        bytes[offset + 2] = (byte)(color >>> 8 & 0xFF);
        bytes[offset + 3] = (byte)(color & 0xFF);
    }
}

