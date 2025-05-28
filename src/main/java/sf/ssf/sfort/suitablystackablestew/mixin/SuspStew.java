package sf.ssf.sfort.suitablystackablestew.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Deprecated
public class SuspStew extends Item {
    public SuspStew(Settings settings) {
        super(settings);
    }

    private void use(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack> info) {
//		info.setReturnValue(new ItemStack(Items.BOWL));
//		if (!stack.isEmpty() && user instanceof PlayerEntity) {
//			if (!((PlayerEntity) user).getAbilities().creativeMode) {
//				((PlayerEntity) user).getInventory().insertStack(new ItemStack(Items.BOWL));
//			}
////			info.setReturnValue(stack);
//		}
//		info.cancel();
    }
}
