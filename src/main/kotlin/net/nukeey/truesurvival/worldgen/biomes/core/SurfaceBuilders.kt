package net.nukeey.truesurvival.worldgen.biomes.core

import net.minecraft.block.Blocks
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig

// This file contains surface builders for biomes

val FOREST_SURFACE_BUILDER = SurfaceBuilder.DEFAULT.withConfig(
    TernarySurfaceConfig(
        Blocks.GRASS_BLOCK.defaultState,
        Blocks.DIRT.defaultState,
        Blocks.DIRT.defaultState
    )
)
