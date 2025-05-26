package sf.ssf.sfort.suitablystackablestew;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Items;

public class SuitablyStackableStew implements ModInitializer {
    @Override
    public void onInitialize() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(
                    item -> item == Items.MUSHROOM_STEW
                            || item == Items.RABBIT_STEW
                            || item == Items.BEETROOT_SOUP
                            || item == Items.SUSPICIOUS_STEW,
                    (builder, item) -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16)
            );
        });
    }
}
