package com.prince.tutorial.items;

import com.prince.tutorial.Tutorial;
import net.minecraft.item.Item;

public class FirstItem extends Item {

    public FirstItem(){
        super(new Item.Properties()
                .maxStackSize(1)
                .group(Tutorial.setup.itemGroup));
                setRegistryName("firstitem");

    }
}
