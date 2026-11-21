package com.example.hitboxmod.mixin;

import com.example.hitboxmod.HitboxModClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityMixin {
    @Inject(method = "getTargetingMargin", at = @At("RETURN"), cancellable = true)
    private void expandPlayerHitbox(CallbackInfoReturnable<Float> cir) {
        if (!HitboxModClient.enabled) return;
        Entity self = (Entity) (Object) this;
        if (self instanceof PlayerEntity && self != MinecraftClient.getInstance().player) {
            cir.setReturnValue(cir.getReturnValueF() + HitboxModClient.margin);
        }
    }
}
