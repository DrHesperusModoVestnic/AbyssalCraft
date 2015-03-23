/**
 * AbyssalCraft
 * Copyright 2012-2015 Shinoow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shinoow.abyssalcraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.shinoow.abyssalcraft.AbyssalCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDSGlow extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	private static IIcon iconDSGlowSideOverlay;

	public BlockDSGlow() {
		super(Material.rock);
		setCreativeTab(AbyssalCraft.tabBlock);
		setHarvestLevel("pickaxe", 3);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		return par1 == 1 ? icons[1] : par1 == 0 ? icons[1] : icons[0];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[2];
		icons[0] = par1IconRegister.registerIcon("abyssalCraft:DSGlow");
		icons[1] = par1IconRegister.registerIcon("abyssalcraft:DSB");
		BlockDSGlow.iconDSGlowSideOverlay = par1IconRegister.registerIcon("abyssalcraft:DSGlow");
	}

	@SideOnly(Side.CLIENT)
	public static IIcon getIconSideOverlay()
	{
		return iconDSGlowSideOverlay;
	}
}