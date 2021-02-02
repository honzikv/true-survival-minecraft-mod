package net.nukeey.truesurvival

import net.nukeey.truesurvival.worldgen.biomes.DeepForestBiome

val MOD_ID = "true_survival"

/**
 * Entrypoint function
 */
@Suppress("unused")
fun init() {
    DeepForestBiome.initialize()
}
