package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import coloredlightscore.src.api.CLApi;

public class ExampleColoredLightBlock extends Block {
    protected ExampleColoredLightBlock() {
        super(Material.glass);
        
        CLApi.setBlockColorRGB(this, 0, 6, 6);
        setCreativeTab(CreativeTabs.tabDecorations);        
    }
}
