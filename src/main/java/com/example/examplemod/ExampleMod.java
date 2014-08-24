package com.example.examplemod;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplecoloredlightmod";
    public static final String VERSION = "1.0";
    public static Block CLExampleBlock;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        CLExampleBlock = new ExampleColoredLightBlock().setBlockName("clExampleBlock");
        GameRegistry.registerBlock(CLExampleBlock,  MODID + "clexampleblock");
    }
}
