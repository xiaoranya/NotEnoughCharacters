package net.vfyjxf.nechar.core;

import java.util.Map;

import net.vfyjxf.nechar.transform.TransformerRegistry;

import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class NechCorePlugin implements IFMLLoadingPlugin, IFMLCallHook {

    public static boolean INITIALIZED = false;

    @Override
    public String[] getASMTransformerClass() {
        return new String[] { "net.vfyjxf.nechar.core.NechClassTransformer" };
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return "net.vfyjxf.nechar.core.NechCorePlugin";
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

    @Override
    public Void call() throws Exception {
        TransformerRegistry.getTransformer("some.class");
        NechCorePlugin.INITIALIZED = true;
        return null;
    }
}
