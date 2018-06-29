package au.com.spilledbread.LearningMod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabLearning extends CreativeTabs {

    public CreativeTabLearning(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.ELYTRA;
    }
}


