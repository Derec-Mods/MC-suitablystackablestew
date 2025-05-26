package sf.ssf.sfort.suitablystackablestew.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public abstract class MushStew {
    @Inject(method = "finishUsing", at = @At("HEAD"), cancellable = true)
    private void use(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack> info) {
        if (stack.getItem() == Items.MUSHROOM_STEW) {
            info.setReturnValue(new ItemStack(Items.BOWL));

            if (!stack.isEmpty() && user instanceof PlayerEntity) {
                if (!((PlayerEntity) user).getAbilities().creativeMode) {
                    ((PlayerEntity) user).getInventory().insertStack(new ItemStack(Items.BOWL));
                }
                info.setReturnValue(stack);
            }

            info.cancel();
        }
    }
}
