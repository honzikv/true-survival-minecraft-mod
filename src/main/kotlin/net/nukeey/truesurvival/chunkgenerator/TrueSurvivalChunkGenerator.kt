package net.nukeey.truesurvival.chunkgenerator

import com.mojang.serialization.Codec
import net.minecraft.world.BlockView
import net.minecraft.world.ChunkRegion
import net.minecraft.world.Heightmap
import net.minecraft.world.WorldAccess
import net.minecraft.world.biome.source.BiomeSource
import net.minecraft.world.chunk.Chunk
import net.minecraft.world.gen.StructureAccessor
import net.minecraft.world.gen.chunk.ChunkGenerator
import net.minecraft.world.gen.chunk.StructuresConfig

class TrueSurvivalChunkGenerator(biomeSource: BiomeSource, seed: Long) : ChunkGenerator(
    biomeSource,
    StructuresConfig(true)
) {

    override fun getCodec(): Codec<out ChunkGenerator> {
        TODO("Not yet implemented")
    }

    override fun withSeed(seed: Long): ChunkGenerator {
        TODO("Not yet implemented")
    }

    override fun buildSurface(region: ChunkRegion?, chunk: Chunk?) {
        TODO("Not yet implemented")
    }

    override fun populateNoise(world: WorldAccess?, accessor: StructureAccessor?, chunk: Chunk?) {
        TODO("Not yet implemented")
    }

    override fun getHeight(x: Int, z: Int, heightmapType: Heightmap.Type?): Int {
        TODO("Not yet implemented")
    }

    override fun getColumnSample(x: Int, z: Int): BlockView {
        TODO("Not yet implemented")
    }

}
