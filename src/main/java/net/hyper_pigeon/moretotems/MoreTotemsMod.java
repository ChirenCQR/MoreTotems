package net.hyper_pigeon.moretotems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreTotemsMod implements ModInitializer {

	/*an instance of our new item, the explosive totem of undying, with a max stack size of 1*/
	public static final ExplosiveTotemOfUndying EXPLOSIVE_TOTEM_OF_UNDYING  =
			new ExplosiveTotemOfUndying(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

	public static final StingingTotemOfUndying STINGING_TOTEM_OF_UNDYING  =
			new StingingTotemOfUndying(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

	public static final TeleportingTotemOfUndying TELEPORTING_TOTEM_OF_UNDYING =
			new TeleportingTotemOfUndying(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

	public static final GhastlyTotemOfUndying GHASTLY_TOTEM_OF_UNDYING = new GhastlyTotemOfUndying
			(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

	public static final SkeletalTotemOfUndying SKELETAL_TOTEM_OF_UNDYING =
			new SkeletalTotemOfUndying (new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

	public static final EntityType<SummonedBeeEntity> SUMMONED_BEE_ENTITY =
			Registry.register(
					Registry.ENTITY_TYPE,
					new Identifier("summonedbee", "summoned_bee"),
					FabricEntityTypeBuilder.create(EntityCategory.CREATURE, SummonedBeeEntity::new).size(EntityDimensions.fixed(1, 2)).build()

			);

	public static final Sniper SNIPER = Registry.register(Registry.STATUS_EFFECT, new Identifier("moretotems", "sniper"), new Sniper(StatusEffectType.BENEFICIAL, 13420603));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		// an instance of our new item
		Registry.register(Registry.ITEM, new Identifier("moretotems", "explosive_totem_of_undying"), EXPLOSIVE_TOTEM_OF_UNDYING);
		Registry.register(Registry.ITEM, new Identifier("moretotems", "stinging_totem_of_undying"), STINGING_TOTEM_OF_UNDYING);
		Registry.register(Registry.ITEM, new Identifier("moretotems", "teleporting_totem_of_undying"), TELEPORTING_TOTEM_OF_UNDYING);
		Registry.register(Registry.ITEM, new Identifier("moretotems", "ghastly_totem_of_undying"), GHASTLY_TOTEM_OF_UNDYING);
		Registry.register(Registry.ITEM, new Identifier("moretotems", "skeletal_totem_of_undying"), SKELETAL_TOTEM_OF_UNDYING);

		System.out.println("Hello Fabric world!");
	}
}