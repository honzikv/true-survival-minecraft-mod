package net.nukeey.truesurvival.worldgen.biomes.core

import net.minecraft.world.biome.Biome

/**
 * This interface
 */
interface BiomeBuilder {

    /**
     * Build function to create the biome
     */
    fun build()

    /**
     * Getter function to return the biome
     */
    fun get(): Biome
}
