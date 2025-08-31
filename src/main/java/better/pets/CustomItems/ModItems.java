package better.pets.CustomItems;

import better.pets.BetterPets;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item ZOMBIE_BRAIN = registerItem("zombie_brain", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ZOMBIE_BRAIN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterPets.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterPets.LOGGER.info("Registering Mod Items for " + BetterPets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((ModItems::addItemsToIngredientItemGroup));

    }
    
}
