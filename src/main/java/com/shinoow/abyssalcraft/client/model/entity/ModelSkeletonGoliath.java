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
package com.shinoow.abyssalcraft.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSkeletonGoliath extends ModelBase
{

	public ModelRenderer base1;
	public ModelRenderer base2;
	public ModelRenderer base3;
	public ModelRenderer base4;
	public ModelRenderer spike1;
	public ModelRenderer spike2;
	public ModelRenderer spike3;
	public ModelRenderer spike4;
	public ModelRenderer spike5;
	public ModelRenderer spike6;
	public ModelRenderer spike7;
	public ModelRenderer spike8;
	public ModelRenderer spike9;
	public ModelRenderer spike10;
	public ModelRenderer spike11;
	public ModelRenderer thing1;
	public ModelRenderer thing2;
	public ModelRenderer head;
	public ModelRenderer leftjaw;
	public ModelRenderer rightjaw;
	public ModelRenderer jaw1;
	public ModelRenderer jaw2;
	public ModelRenderer jaw3;
	public ModelRenderer tooth1;
	public ModelRenderer tooth2;
	public ModelRenderer tooth3;
	public ModelRenderer tooth4;
	public ModelRenderer tooth5;
	public ModelRenderer shoulders;
	public ModelRenderer spine;
	public ModelRenderer leftarm;
	public ModelRenderer rightarm;
	public ModelRenderer leftrib1;
	public ModelRenderer leftrib12;
	public ModelRenderer leftrib13;
	public ModelRenderer leftrib2;
	public ModelRenderer leftrib22;
	public ModelRenderer leftrib23;
	public ModelRenderer leftrib3;
	public ModelRenderer leftrib32;
	public ModelRenderer leftrib33;
	public ModelRenderer leftrib4;
	public ModelRenderer leftrib42;
	public ModelRenderer leftrib43;
	public ModelRenderer leftrib5;
	public ModelRenderer leftrib52;
	public ModelRenderer leftrib53;
	public ModelRenderer leftrib6;
	public ModelRenderer leftrib62;
	public ModelRenderer leftrib63;
	public ModelRenderer rightrib1;
	public ModelRenderer rightrib12;
	public ModelRenderer rightrib13;
	public ModelRenderer rightrib2;
	public ModelRenderer rightrib22;
	public ModelRenderer rightrib23;
	public ModelRenderer rightrib3;
	public ModelRenderer rightrib32;
	public ModelRenderer rightrib33;
	public ModelRenderer rightrib4;
	public ModelRenderer rightrib42;
	public ModelRenderer rightrib43;
	public ModelRenderer rightrib5;
	public ModelRenderer rightrib52;
	public ModelRenderer rightrib53;
	public ModelRenderer rightrib6;
	public ModelRenderer rightrib62;
	public ModelRenderer rightrib63;
	public ModelRenderer sternum;
	public ModelRenderer pelvis;
	public ModelRenderer leftleg;
	public ModelRenderer rightleg;

	public ModelSkeletonGoliath(boolean renderCudgel)
	{
		textureWidth = 128;
		textureHeight = 64;

		base1 = new ModelRenderer(this, 0, 0);
		base1.addBox(-1F, -1F, -7F, 2, 2, 10);
		base1.setRotationPoint(-1.5F, 13F, 0F);
		base1.setTextureSize(128, 64);
		base1.mirror = true;
		setRotation(base1, 0F, 0F, 0F);
		base2 = new ModelRenderer(this, 24, 2);
		base2.addBox(0F, 0F, 0F, 3, 3, 3);
		base2.setRotationPoint(-1.5F, -2.5F, -8F);
		base2.setTextureSize(128, 64);
		base2.mirror = true;
		setRotation(base2, -0.4089647F, 0F, 0F);
		base3 = new ModelRenderer(this, 24, 8);
		base3.addBox(0F, 0F, 0F, 4, 4, 6);
		base3.setRotationPoint(-0.5F, -5F, -13F);
		base3.setTextureSize(128, 64);
		base3.mirror = true;
		setRotation(base3, -0.3717861F, 0F, 0.2602503F);
		base4 = new ModelRenderer(this, 0, 12);
		base4.addBox(0F, 0F, 0F, 5, 5, 7);
		base4.setRotationPoint(-1F, -9F, -15F);
		base4.setTextureSize(128, 64);
		base4.mirror = true;
		setRotation(base4, -0.8551081F, 0.0743572F, 0F);
		spike1 = new ModelRenderer(this, 27, 0);
		spike1.addBox(0F, 0F, 0F, 3, 1, 1);
		spike1.setRotationPoint(1F, -1F, -8F);
		spike1.setTextureSize(128, 64);
		spike1.mirror = true;
		setRotation(spike1, 0F, 0F, 0F);
		spike2 = new ModelRenderer(this, 27, 0);
		spike2.addBox(0F, 0F, 0F, 3, 1, 1);
		spike2.setRotationPoint(-4F, -1F, -8F);
		spike2.setTextureSize(128, 64);
		spike2.mirror = true;
		setRotation(spike2, 0F, 0F, 0F);
		spike3 = new ModelRenderer(this, 48, 0);
		spike3.addBox(0F, 0F, 0F, 1, 3, 1);
		spike3.setRotationPoint(-0.5F, -5F, -7F);
		spike3.setTextureSize(128, 64);
		spike3.mirror = true;
		setRotation(spike3, -0.3346075F, 0F, 0F);
		spike4 = new ModelRenderer(this, 48, 0);
		spike4.addBox(0F, 0F, 0F, 1, 3, 1);
		spike4.setRotationPoint(-0.5F, 0F, -9F);
		spike4.setTextureSize(128, 64);
		spike4.mirror = true;
		setRotation(spike4, 0F, 0F, 0F);
		spike5 = new ModelRenderer(this, 48, 0);
		spike5.addBox(0F, 0F, 0F, 1, 4, 1);
		spike5.setRotationPoint(1F, -9F, -11F);
		spike5.setTextureSize(128, 64);
		spike5.mirror = true;
		setRotation(spike5, -0.8179294F, 0F, 0F);
		spike6 = new ModelRenderer(this, 26, 0);
		spike6.addBox(0F, 0F, 0F, 4, 1, 1);
		spike6.setRotationPoint(-4F, -5F, -13F);
		spike6.setTextureSize(128, 64);
		spike6.mirror = true;
		setRotation(spike6, -0.3717861F, 0.2602503F, 0F);
		spike7 = new ModelRenderer(this, 26, 0);
		spike7.addBox(0F, 0F, 0F, 4, 1, 1);
		spike7.setRotationPoint(-4F, -9F, -14F);
		spike7.setTextureSize(128, 64);
		spike7.mirror = true;
		setRotation(spike7, -0.4461433F, 0.4089647F, 0.5576792F);
		spike8 = new ModelRenderer(this, 26, 0);
		spike8.addBox(0F, 0F, 0F, 4, 1, 1);
		spike8.setRotationPoint(4F, -3F, -15F);
		spike8.setTextureSize(128, 64);
		spike8.mirror = true;
		setRotation(spike8, -0.0371786F, -0.7807508F, -0.4461433F);
		spike9 = new ModelRenderer(this, 48, 0);
		spike9.addBox(0F, 0F, 0F, 1, 5, 1);
		spike9.setRotationPoint(0F, -4F, -15F);
		spike9.setTextureSize(128, 64);
		spike9.mirror = true;
		setRotation(spike9, -0.9294653F, -0.6320364F, 0.8551081F);
		spike10 = new ModelRenderer(this, 36, 0);
		spike10.addBox(0F, 0F, 0F, 1, 1, 5);
		spike10.setRotationPoint(3F, -9F, -20F);
		spike10.setTextureSize(128, 64);
		spike10.mirror = true;
		setRotation(spike10, -0.3717861F, 0F, 0.7435722F);
		spike11 = new ModelRenderer(this, 24, 0);
		spike11.addBox(0F, 0F, 0F, 5, 1, 1);
		spike11.setRotationPoint(3F, -4F, -16F);
		spike11.setTextureSize(128, 64);
		spike11.mirror = true;
		setRotation(spike11, 0F, 0F, -0.5205006F);
		thing1 = new ModelRenderer(this, 24, 18);
		thing1.addBox(0F, 0F, 0F, 4, 4, 1);
		thing1.setRotationPoint(-2F, -2F, -6F);
		thing1.setTextureSize(128, 64);
		thing1.mirror = true;
		setRotation(thing1, 0F, 0F, 0F);
		thing2 = new ModelRenderer(this, 34, 18);
		thing2.addBox(0F, 0F, 0F, 6, 6, 1);
		thing2.setRotationPoint(-1.5F, -5F, -10F);
		thing2.setTextureSize(128, 64);
		thing2.mirror = true;
		setRotation(thing2, -0.2602503F, 0F, 0.260246F);

		head = new ModelRenderer(this, 53, 0);
		head.addBox(-4F, -9F, -4F, 9, 9, 9);
		head.setRotationPoint(0F, -15F, 0F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		leftjaw = new ModelRenderer(this, 49, 16);
		leftjaw.addBox(0F, 0F, 0F, 1, 3, 1);
		leftjaw.setRotationPoint(4F, 0F, 4F);
		leftjaw.setTextureSize(128, 64);
		leftjaw.mirror = true;
		setRotation(leftjaw, 0F, 0F, 0F);
		rightjaw = new ModelRenderer(this, 49, 16);
		rightjaw.addBox(0F, 0F, 0F, 1, 3, 1);
		rightjaw.setRotationPoint(-4F, 0F, 4F);
		rightjaw.setTextureSize(128, 64);
		rightjaw.mirror = true;
		setRotation(rightjaw, 0F, 0F, 0F);
		jaw1 = new ModelRenderer(this, 53, 18);
		jaw1.addBox(-4F, 0F, -1F, 9, 1, 1);
		jaw1.setRotationPoint(0F, 2F, -3F);
		jaw1.setTextureSize(128, 64);
		jaw1.mirror = true;
		setRotation(jaw1, 0F, 0F, 0F);
		jaw2 = new ModelRenderer(this, 73, 18);
		jaw2.addBox(0F, 0F, 0F, 1, 1, 8);
		jaw2.setRotationPoint(4F, 2F, -4F);
		jaw2.setTextureSize(128, 64);
		jaw2.mirror = true;
		setRotation(jaw2, 0F, 0F, 0F);
		jaw3 = new ModelRenderer(this, 73, 18);
		jaw3.addBox(0F, 0F, 0F, 1, 1, 8);
		jaw3.setRotationPoint(-4F, 2F, -4F);
		jaw3.setTextureSize(128, 64);
		jaw3.mirror = true;
		setRotation(jaw3, 0F, 0F, 0F);
		tooth1 = new ModelRenderer(this, 49, 20);
		tooth1.addBox(0F, 0F, 0F, 1, 1, 1);
		tooth1.setRotationPoint(4F, 1F, -4F);
		tooth1.setTextureSize(128, 64);
		tooth1.mirror = true;
		setRotation(tooth1, 0F, 0F, 0F);
		tooth2 = new ModelRenderer(this, 49, 20);
		tooth2.addBox(0F, 0F, 0F, 1, 1, 1);
		tooth2.setRotationPoint(2F, 1F, -4F);
		tooth2.setTextureSize(128, 64);
		tooth2.mirror = true;
		setRotation(tooth2, 0F, 0F, 0F);
		tooth3 = new ModelRenderer(this, 49, 20);
		tooth3.addBox(0F, 0F, 0F, 1, 1, 1);
		tooth3.setRotationPoint(0F, 1F, -4F);
		tooth3.setTextureSize(128, 64);
		tooth3.mirror = true;
		setRotation(tooth3, 0F, 0F, 0F);
		tooth4 = new ModelRenderer(this, 49, 20);
		tooth4.addBox(0F, 0F, 0F, 1, 1, 1);
		tooth4.setRotationPoint(-2F, 1F, -4F);
		tooth4.setTextureSize(128, 64);
		tooth4.mirror = true;
		setRotation(tooth4, 0F, 0F, 0F);
		tooth5 = new ModelRenderer(this, 49, 20);
		tooth5.addBox(0F, 0F, 0F, 1, 1, 1);
		tooth5.setRotationPoint(-4F, 1F, -4F);
		tooth5.setTextureSize(128, 64);
		tooth5.mirror = true;
		setRotation(tooth5, 0F, 0F, 0F);
		shoulders = new ModelRenderer(this, 68, 27);
		shoulders.addBox(-6F, 0F, 0F, 13, 3, 3);
		shoulders.setRotationPoint(0F, -11F, -1F);
		shoulders.setTextureSize(128, 64);
		shoulders.mirror = true;
		setRotation(shoulders, 0F, 0F, 0F);
		spine = new ModelRenderer(this, 89, 0);
		spine.addBox(-2F, 0F, -2F, 3, 20, 3);
		spine.setRotationPoint(1F, -15F, 1F);
		spine.setTextureSize(128, 64);
		spine.mirror = true;
		setRotation(spine, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 101, 0);
		leftarm.addBox(0F, -1F, -1.5F, 3, 16, 3);
		leftarm.setRotationPoint(7F, -10F, 0.5F);
		leftarm.setTextureSize(128, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 101, 0);
		rightarm.addBox(-3F, -1F, -1.5F, 3, 16, 3);
		rightarm.setRotationPoint(-6F, -10F, 0.5F);
		rightarm.setTextureSize(128, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftrib1 = new ModelRenderer(this, 60, 20);
		leftrib1.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib1.setRotationPoint(2F, -7F, 0F);
		leftrib1.setTextureSize(128, 64);
		leftrib1.mirror = true;
		setRotation(leftrib1, 0F, 0F, 0F);
		leftrib12 = new ModelRenderer(this, 60, 20);
		leftrib12.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib12.setRotationPoint(4F, -7F, 0F);
		leftrib12.setTextureSize(128, 64);
		leftrib12.mirror = true;
		setRotation(leftrib12, 0F, 1.570796F, 0F);
		leftrib13 = new ModelRenderer(this, 60, 20);
		leftrib13.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib13.setRotationPoint(2F, -7F, -3F);
		leftrib13.setTextureSize(128, 64);
		leftrib13.mirror = true;
		setRotation(leftrib13, 0F, 0F, 0F);
		leftrib2 = new ModelRenderer(this, 60, 20);
		leftrib2.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib2.setRotationPoint(2F, -5F, 0F);
		leftrib2.setTextureSize(128, 64);
		leftrib2.mirror = true;
		setRotation(leftrib2, 0F, 0F, 0F);
		leftrib22 = new ModelRenderer(this, 60, 20);
		leftrib22.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib22.setRotationPoint(4F, -5F, 0F);
		leftrib22.setTextureSize(128, 64);
		leftrib22.mirror = true;
		setRotation(leftrib22, 0F, 1.570796F, 0F);
		leftrib23 = new ModelRenderer(this, 60, 20);
		leftrib23.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib23.setRotationPoint(2F, -5F, -3F);
		leftrib23.setTextureSize(128, 64);
		leftrib23.mirror = true;
		setRotation(leftrib23, 0F, 0F, 0F);
		leftrib3 = new ModelRenderer(this, 60, 20);
		leftrib3.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib3.setRotationPoint(2F, -3F, 0F);
		leftrib3.setTextureSize(128, 64);
		leftrib3.mirror = true;
		setRotation(leftrib3, 0F, 0F, 0F);
		leftrib32 = new ModelRenderer(this, 60, 20);
		leftrib32.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib32.setRotationPoint(4F, -3F, 0F);
		leftrib32.setTextureSize(128, 64);
		leftrib32.mirror = true;
		setRotation(leftrib32, 0F, 1.570796F, 0F);
		leftrib33 = new ModelRenderer(this, 60, 20);
		leftrib33.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib33.setRotationPoint(2F, -3F, -3F);
		leftrib33.setTextureSize(128, 64);
		leftrib33.mirror = true;
		setRotation(leftrib33, 0F, 0F, 0F);
		leftrib4 = new ModelRenderer(this, 60, 20);
		leftrib4.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib4.setRotationPoint(2F, -1F, 0F);
		leftrib4.setTextureSize(128, 64);
		leftrib4.mirror = true;
		setRotation(leftrib4, 0F, 0F, 0F);
		leftrib42 = new ModelRenderer(this, 60, 20);
		leftrib42.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib42.setRotationPoint(4F, -1F, 0F);
		leftrib42.setTextureSize(128, 64);
		leftrib42.mirror = true;
		setRotation(leftrib42, 0F, 1.570796F, 0F);
		leftrib43 = new ModelRenderer(this, 60, 20);
		leftrib43.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib43.setRotationPoint(2F, -1F, -3F);
		leftrib43.setTextureSize(128, 64);
		leftrib43.mirror = true;
		setRotation(leftrib43, 0F, 0F, 0F);
		leftrib5 = new ModelRenderer(this, 60, 20);
		leftrib5.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib5.setRotationPoint(2F, 1F, 0F);
		leftrib5.setTextureSize(128, 64);
		leftrib5.mirror = true;
		setRotation(leftrib5, 0F, 0F, 0F);
		leftrib52 = new ModelRenderer(this, 60, 20);
		leftrib52.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib52.setRotationPoint(4F, 1F, 0F);
		leftrib52.setTextureSize(128, 64);
		leftrib52.mirror = true;
		setRotation(leftrib52, 0F, 1.570796F, 0F);
		leftrib53 = new ModelRenderer(this, 60, 20);
		leftrib53.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib53.setRotationPoint(3F, 1F, -3F);
		leftrib53.setTextureSize(128, 64);
		leftrib53.mirror = true;
		setRotation(leftrib53, 0F, 0F, 0F);
		leftrib6 = new ModelRenderer(this, 60, 20);
		leftrib6.addBox(0F, 0F, 0F, 3, 1, 1);
		leftrib6.setRotationPoint(2F, 3F, 0F);
		leftrib6.setTextureSize(128, 64);
		leftrib6.mirror = true;
		setRotation(leftrib6, 0F, 0F, 0F);
		leftrib62 = new ModelRenderer(this, 60, 20);
		leftrib62.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib62.setRotationPoint(4F, 3F, 0F);
		leftrib62.setTextureSize(128, 64);
		leftrib62.mirror = true;
		setRotation(leftrib62, 0F, 1.570796F, 0F);
		leftrib63 = new ModelRenderer(this, 60, 20);
		leftrib63.addBox(0F, 0F, 0F, 2, 1, 1);
		leftrib63.setRotationPoint(3F, 3F, -3F);
		leftrib63.setTextureSize(128, 64);
		leftrib63.mirror = true;
		setRotation(leftrib63, 0F, 0F, 0F);
		rightrib1 = new ModelRenderer(this, 60, 20);
		rightrib1.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib1.setRotationPoint(-4F, -7F, 0F);
		rightrib1.setTextureSize(128, 64);
		rightrib1.mirror = true;
		setRotation(rightrib1, 0F, 0F, 0F);
		rightrib12 = new ModelRenderer(this, 60, 20);
		rightrib12.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib12.setRotationPoint(-4F, -7F, 0F);
		rightrib12.setTextureSize(128, 64);
		rightrib12.mirror = true;
		setRotation(rightrib12, 0F, 1.570796F, 0F);
		rightrib13 = new ModelRenderer(this, 60, 20);
		rightrib13.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib13.setRotationPoint(-4F, -7F, -3F);
		rightrib13.setTextureSize(128, 64);
		rightrib13.mirror = true;
		setRotation(rightrib13, 0F, 0F, 0F);
		rightrib2 = new ModelRenderer(this, 60, 20);
		rightrib2.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib2.setRotationPoint(-4F, -5F, 0F);
		rightrib2.setTextureSize(128, 64);
		rightrib2.mirror = true;
		setRotation(rightrib2, 0F, 0F, 0F);
		rightrib22 = new ModelRenderer(this, 60, 20);
		rightrib22.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib22.setRotationPoint(-4F, -5F, 0F);
		rightrib22.setTextureSize(128, 64);
		rightrib22.mirror = true;
		setRotation(rightrib22, 0F, 1.570796F, 0F);
		rightrib23 = new ModelRenderer(this, 60, 20);
		rightrib23.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib23.setRotationPoint(-4F, -5F, -3F);
		rightrib23.setTextureSize(128, 64);
		rightrib23.mirror = true;
		setRotation(rightrib23, 0F, 0F, 0F);
		rightrib3 = new ModelRenderer(this, 60, 20);
		rightrib3.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib3.setRotationPoint(-4F, -3F, 0F);
		rightrib3.setTextureSize(128, 64);
		rightrib3.mirror = true;
		setRotation(rightrib3, 0F, 0F, 0F);
		rightrib32 = new ModelRenderer(this, 60, 20);
		rightrib32.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib32.setRotationPoint(-4F, -3F, 0F);
		rightrib32.setTextureSize(128, 64);
		rightrib32.mirror = true;
		setRotation(rightrib32, 0F, 1.570796F, 0F);
		rightrib33 = new ModelRenderer(this, 60, 20);
		rightrib33.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib33.setRotationPoint(-4F, -3F, -3F);
		rightrib33.setTextureSize(128, 64);
		rightrib33.mirror = true;
		setRotation(rightrib33, 0F, 0F, 0F);
		rightrib4 = new ModelRenderer(this, 60, 20);
		rightrib4.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib4.setRotationPoint(-4F, -1F, 0F);
		rightrib4.setTextureSize(128, 64);
		rightrib4.mirror = true;
		setRotation(rightrib4, 0F, 0F, 0F);
		rightrib42 = new ModelRenderer(this, 60, 20);
		rightrib42.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib42.setRotationPoint(-4F, -1F, 0F);
		rightrib42.setTextureSize(128, 64);
		rightrib42.mirror = true;
		setRotation(rightrib42, 0F, 1.570796F, 0F);
		rightrib43 = new ModelRenderer(this, 60, 20);
		rightrib43.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib43.setRotationPoint(-4F, -1F, -3F);
		rightrib43.setTextureSize(128, 64);
		rightrib43.mirror = true;
		setRotation(rightrib43, 0F, 0F, 0F);
		rightrib5 = new ModelRenderer(this, 60, 20);
		rightrib5.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib5.setRotationPoint(-4F, 1F, 0F);
		rightrib5.setTextureSize(128, 64);
		rightrib5.mirror = true;
		setRotation(rightrib5, 0F, 0F, 0F);
		rightrib52 = new ModelRenderer(this, 60, 20);
		rightrib52.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib52.setRotationPoint(-4F, 1F, 0F);
		rightrib52.setTextureSize(128, 64);
		rightrib52.mirror = true;
		setRotation(rightrib52, 0F, 1.570796F, 0F);
		rightrib53 = new ModelRenderer(this, 60, 20);
		rightrib53.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib53.setRotationPoint(-4F, 1F, -3F);
		rightrib53.setTextureSize(128, 64);
		rightrib53.mirror = true;
		setRotation(rightrib53, 0F, 0F, 0F);
		rightrib6 = new ModelRenderer(this, 60, 20);
		rightrib6.addBox(0F, 0F, 0F, 3, 1, 1);
		rightrib6.setRotationPoint(-4F, 3F, 0F);
		rightrib6.setTextureSize(128, 64);
		rightrib6.mirror = true;
		setRotation(rightrib6, 0F, 0F, 0F);
		rightrib62 = new ModelRenderer(this, 60, 20);
		rightrib62.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib62.setRotationPoint(-4F, 3F, 0F);
		rightrib62.setTextureSize(128, 64);
		rightrib62.mirror = true;
		setRotation(rightrib62, 0F, 1.570796F, 0F);
		rightrib63 = new ModelRenderer(this, 60, 20);
		rightrib63.addBox(0F, 0F, 0F, 2, 1, 1);
		rightrib63.setRotationPoint(-4F, 3F, -3F);
		rightrib63.setTextureSize(128, 64);
		rightrib63.mirror = true;
		setRotation(rightrib63, 0F, 0F, 0F);
		sternum = new ModelRenderer(this, 113, 11);
		sternum.addBox(0F, 0F, 0F, 3, 7, 1);
		sternum.setRotationPoint(-1F, -7F, -3F);
		sternum.setTextureSize(128, 64);
		sternum.mirror = true;
		setRotation(sternum, 0F, 0F, 0F);
		pelvis = new ModelRenderer(this, 99, 21);
		pelvis.addBox(0F, 0F, 0F, 9, 3, 3);
		pelvis.setRotationPoint(-4F, 5F, -1F);
		pelvis.setTextureSize(128, 64);
		pelvis.mirror = true;
		setRotation(pelvis, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 54, 22);
		leftleg.addBox(-1.5F, 0F, -1.5F, 3, 16, 3);
		leftleg.setRotationPoint(3.5F, 8F, 0.5F);
		leftleg.setTextureSize(128, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 54, 22);
		rightleg.addBox(-1.5F, 0F, -1.5F, 3, 16, 3);
		rightleg.setRotationPoint(-2.5F, 8F, 0.5F);
		rightleg.setTextureSize(128, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);

		head.addChild(leftjaw);
		head.addChild(rightjaw);
		head.addChild(jaw1);
		head.addChild(jaw1);
		head.addChild(jaw2);
		head.addChild(jaw3);
		head.addChild(tooth1);
		head.addChild(tooth2);
		head.addChild(tooth3);
		head.addChild(tooth4);
		head.addChild(tooth5);

		if(renderCudgel)
			rightarm.addChild(base1);
		base1.addChild(base2);
		base1.addChild(base3);
		base1.addChild(base4);
		base1.addChild(spike1);
		base1.addChild(spike2);
		base1.addChild(spike3);
		base1.addChild(spike4);
		base1.addChild(spike5);
		base1.addChild(spike6);
		base1.addChild(spike7);
		base1.addChild(spike8);
		base1.addChild(spike9);
		base1.addChild(spike10);
		base1.addChild(spike11);
		base1.addChild(thing1);
		base1.addChild(thing2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		shoulders.render(f5);
		spine.render(f5);
		leftarm.render(f5);
		rightarm.render(f5);
		leftrib1.render(f5);
		leftrib12.render(f5);
		leftrib13.render(f5);
		leftrib2.render(f5);
		leftrib22.render(f5);
		leftrib23.render(f5);
		leftrib3.render(f5);
		leftrib32.render(f5);
		leftrib33.render(f5);
		leftrib4.render(f5);
		leftrib42.render(f5);
		leftrib43.render(f5);
		leftrib5.render(f5);
		leftrib52.render(f5);
		leftrib53.render(f5);
		leftrib6.render(f5);
		leftrib62.render(f5);
		leftrib63.render(f5);
		rightrib1.render(f5);
		rightrib12.render(f5);
		rightrib13.render(f5);
		rightrib2.render(f5);
		rightrib22.render(f5);
		rightrib23.render(f5);
		rightrib3.render(f5);
		rightrib32.render(f5);
		rightrib33.render(f5);
		rightrib4.render(f5);
		rightrib42.render(f5);
		rightrib43.render(f5);
		rightrib5.render(f5);
		rightrib52.render(f5);
		rightrib53.render(f5);
		rightrib6.render(f5);
		rightrib62.render(f5);
		rightrib63.render(f5);
		sternum.render(f5);
		pelvis.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		head.rotateAngleY = par4 / (180F / (float)Math.PI);
		head.rotateAngleX = par5 / (180F / (float)Math.PI);

		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;

		rightarm.rotateAngleZ = 0.0F;
		leftarm.rotateAngleZ = 0.0F;

		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		rightleg.rotateAngleY = 0.0F;

		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		leftleg.rotateAngleY = 0.0F;

		if (isRiding)
		{
			rightarm.rotateAngleX += -((float)Math.PI / 5F);
			leftarm.rotateAngleX += -((float)Math.PI / 5F);

			rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
			leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);

			rightleg.rotateAngleY = (float)Math.PI / 10F;
			leftleg.rotateAngleY = -((float)Math.PI / 10F);
		}

		rightarm.rotateAngleY = 0.0F;
		leftarm.rotateAngleY = 0.0F;
		float f6;
		float f7;

		if (onGround > -9990.0F)
		{
			f6 = onGround;
			shoulders.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			spine.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib1.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib12.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib13.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib2.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib22.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib23.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib3.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib32.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib33.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib4.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib42.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib43.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib5.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib52.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib53.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib6.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib62.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			leftrib63.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib1.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib12.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib13.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib2.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib22.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib23.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib3.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib32.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib33.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib4.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib42.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib43.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib5.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib52.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib53.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib6.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib62.rotateAngleX = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightrib63.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			sternum.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
			rightarm.rotateAngleY += spine.rotateAngleY;
			leftarm.rotateAngleY += spine.rotateAngleY;
			leftarm.rotateAngleX += spine.rotateAngleY;
			f6 = 1.0F - onGround;
			f6 *= f6;
			f6 *= f6;
			f6 = 1.0F - f6;
			f7 = MathHelper.sin(f6 * (float)Math.PI);
			float f8 = MathHelper.sin(onGround * (float)Math.PI) * -(head.rotateAngleX - 0.7F) * 0.75F;
			rightarm.rotateAngleX = (float)(rightarm.rotateAngleX - (f7 * 1.2D + f8));
			rightarm.rotateAngleY += spine.rotateAngleY * 2.0F;
			rightarm.rotateAngleZ = MathHelper.sin(onGround * (float)Math.PI) * -0.4F;
		}
	}
}