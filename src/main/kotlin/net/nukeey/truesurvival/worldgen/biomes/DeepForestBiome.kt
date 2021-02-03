package net.nukeey.truesurvival.worldgen.biomes

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes
import net.fabricmc.fabric.api.biome.v1.OverworldClimate
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.BuiltinRegistries
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.BiomeEffects
import net.minecraft.world.biome.GenerationSettings
import net.minecraft.world.biome.SpawnSettings
import net.minecraft.world.biome.SpawnSettings.SpawnEntry
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.ConfiguredFeatures
import net.minecraft.world.gen.feature.DefaultBiomeFeatures.*
import net.nukeey.truesurvival.MOD_ID
import net.nukeey.truesurvival.worldgen.biomes.core.FOREST_SURFACE_BUILDER

object DeepForestBiome {

    val biome: Biome = build()

    val name = "deep_forest"

    val identifier = Identifier(MOD_ID, name)

    val key = RegistryKey.of(Registry.BIOME_KEY, identifier)

    fun build(): Biome {
        val spawnSettings = SpawnSettings.Builder()
        val generationSettings = GenerationSettings.Builder()

        // Configure spawnSettings object
        spawnSettings.apply {
            addFarmAnimals(this)
            addMonsters(this, 150, 30, 140)
            addBats(this)
            spawn(SpawnGroup.CREATURE, SpawnEntry(EntityType.RABBIT, 10, 2, 3))
        }

        // Configure generationSettings object
        generationSettings.apply {
            surfaceBuilder(FOREST_SURFACE_BUILDER)
            addDefaultUndergroundStructures(this)
            addDungeons(this)
            addLandCarvers(this)
            addDefaultLakes(this)
            addMineables(this)
            addDefaultOres(this)
            addForestGrass(this)
            addDefaultDisks(this)
            addSprings(this)
            addDefaultVegetation(this)
            addFrozenTopLayer(this)
            addClay(this)

            feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.TREES_GIANT)
        }

        return Biome.Builder().apply {
            precipitation(Biome.Precipitation.RAIN)
            category(Biome.Category.NONE)
            depth(0.125f)
            scale(0.05f)
            temperature(0.2f)
            downfall(0.4f)
            effects(
                BiomeEffects.Builder().apply {
                    waterColor(0x326cc9)
                    waterFogColor(0x93a1b8)
                    skyColor(0xaac7f2)
                    fogColor(0x93a1b8)
                    foliageColor(0x06400a)
                }
                    .build()
            )
            spawnSettings(spawnSettings.build())
            generationSettings(generationSettings.build())
        }
            .build()
    }


    fun initialize() {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, identifier, FOREST_SURFACE_BUILDER)
        Registry.register(BuiltinRegistries.BIOME, key.value, biome)

        OverworldBiomes.addContinentalBiome(key, OverworldClimate.TEMPERATE, 2.0)
        OverworldBiomes.addContinentalBiome(key, OverworldClimate.COOL, 2.0)
    }
}
