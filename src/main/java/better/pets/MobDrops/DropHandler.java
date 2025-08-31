package better.pets.MobDrops;


import better.pets.CustomItems.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.item.Items;




public class DropHandler {

    private static final Identifier ZOMBIE_ID =
        new Identifier("minecraft", "entities/zombie");

    private static final Identifier SKELETON_ID =
        new Identifier("minecraft", "entities/skeleton");

    private static final Identifier WITHER_SKELETON_ID = 
        new Identifier("minecraft", "entities/wither_skeleton");

    private static final Identifier CREEPER_ID = 
        new Identifier("minecraft", "entities/creeper");

    private static final Identifier SPIDER_ID = 
        new Identifier("minecraft", "entities/spider");

    private static final Identifier ENDERMITE_ID = 
        new Identifier("minecraft", "entities/endermite");


    public static void modidfyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(ZOMBIE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1f))
                    .with(ItemEntry.builder(ModItems.ZOMBIE_BRAIN))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(63.0f, 64.0f)).build());
                
                tableBuilder.pool(poolBuilder.build());
            }

            if(SKELETON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1f))
                    .with(ItemEntry.builder(Items.DIAMOND))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(63.0f, 64.0f)).build());
                
                tableBuilder.pool(poolBuilder.build());
            }

            if(WITHER_SKELETON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1f))
                    .with(ItemEntry.builder(Items.DIAMOND))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(63.0f, 64.0f)).build());
                
                tableBuilder.pool(poolBuilder.build());
            }

            if(CREEPER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1f))
                    .with(ItemEntry.builder(Items.DIAMOND))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(63.0f, 64.0f)).build());
                
                tableBuilder.pool(poolBuilder.build());
            }

            if(SPIDER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1f))
                    .with(ItemEntry.builder(Items.DIAMOND))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(63.0f, 64.0f)).build());
                
                tableBuilder.pool(poolBuilder.build());
            }

            if(ENDERMITE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1f))
                    .with(ItemEntry.builder(Items.DIAMOND))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(63.0f, 64.0f)).build());
                
                tableBuilder.pool(poolBuilder.build());
            }

        });
    }
}
