package com.example.examplemod;

import cpw.mods.fml.common.Loader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import coloredlightscore.src.api.CLApi;

public class ExampleColoredLightBlock extends Block {
    protected ExampleColoredLightBlock() {
        super(Material.glass);

        if (Loader.isModLoaded("coloredlightscore")) {
            CLApi.setBlockColorRGB(this, 0, 6, 6);
        } else {
            setLightLevel(6F/15F);
        }

        setCreativeTab(CreativeTabs.tabDecorations);        
    }
}
