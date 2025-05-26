package sf.ssf.sfort.suitablystackablestew;

public class SuitablyStackableStew {
    @Override
    public void onInitialize() {
        DefaultItemCom.MODIFY.register(context -> {
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
