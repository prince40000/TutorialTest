package com.prince.tutorial.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("tutorial:firstblock")
    public static FirstBlock FIRSTBLOCK;

    @ObjectHolder("tutorial:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
}
