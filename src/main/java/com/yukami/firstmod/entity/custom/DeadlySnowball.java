package com.yukami.firstmod.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.FireChargeItem;
import net.minecraft.world.level.Explosion;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class DeadlySnowball extends Snowball {


    public DeadlySnowball(Level p_37399_, LivingEntity p_37400_) {
        super(p_37399_, p_37400_);
        this.setNoGravity(true);
    }



    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        Entity entity = pResult.getEntity();
        Entity owner = this.getOwner();
        Vec3 entpos = pResult.getLocation();
        this.level.explode(null, entpos.x, entpos.y, entpos.z, 5f, Explosion.BlockInteraction.NONE);
        System.out.println("Boom!");
    }
}
