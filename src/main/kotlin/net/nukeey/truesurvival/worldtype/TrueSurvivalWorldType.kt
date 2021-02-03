package net.nukeey.truesurvival.worldtype

import net.minecraft.client.world.GeneratorType
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.chunk.ChunkGenerator
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings
import net.nukeey.truesurvival.chunkgenerator.TrueSurvivalChunkGenerator

class TrueSurvivalWorldType : GeneratorType("truesurvival") {
    init {
        GeneratorType.VALUES.add(this)
    }

    override fun getChunkGenerator(
        biomeRegistry: Registry<Biome>?,
        chunkGeneratorSettingsRegistry: Registry<ChunkGeneratorSettings>?,
        seed: Long
    ) = TrueSurvivalChunkGenerator()

}
