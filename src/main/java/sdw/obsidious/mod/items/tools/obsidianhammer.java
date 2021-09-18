package sdw.obsidious.mod.items.tools;




import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import sdw.obsidious.mod.obsidiousmod;



public class obsidianhammer extends PickaxeItem {


 
    




    public obsidianhammer(ToolMaterial OBSIDIANTOOL) {
        super(OBSIDIANTOOL, (int) 15.0, -3.8F, new Item.Settings().group(obsidiousmod.MODTAB));
    }



    @Override
    public TypedActionResult<ItemStack> use(World p_77659_1_, PlayerEntity targetEntity, Hand p_77659_3_) {

   // Vec3d playerRotation = targetEntity.getRotationVector();
    LightningEntity lightning1 = new LightningEntity(EntityType.LIGHTNING_BOLT, p_77659_1_);
    lightning1.setPos(targetEntity.getX()+2, targetEntity.getY(), targetEntity.getZ());
    p_77659_1_.spawnEntity(lightning1);

    LightningEntity lightning2 = new LightningEntity(EntityType.LIGHTNING_BOLT, p_77659_1_);
    lightning2.setPos(targetEntity.getX()-2, targetEntity.getY(), targetEntity.getZ());
    p_77659_1_.spawnEntity(lightning2);

    LightningEntity lightning3 = new LightningEntity(EntityType.LIGHTNING_BOLT, p_77659_1_);
    lightning3.setPos(targetEntity.getX(), targetEntity.getY(), targetEntity.getZ()+2);
    p_77659_1_.spawnEntity(lightning3);

    LightningEntity lightning4 = new LightningEntity(EntityType.LIGHTNING_BOLT, p_77659_1_);
    lightning4.setPos(targetEntity.getX(), targetEntity.getY(), targetEntity.getZ()-2);
    p_77659_1_.spawnEntity(lightning4);


    return super.use(p_77659_1_, targetEntity, p_77659_3_);
    }
    



}


    



