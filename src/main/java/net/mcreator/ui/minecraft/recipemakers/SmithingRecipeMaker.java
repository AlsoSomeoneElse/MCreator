/*
 * MCreator (https://mcreator.net/)
 * Copyright (C) 2020 Pylo and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.mcreator.ui.minecraft.recipemakers;

import net.mcreator.minecraft.MCItem;
import net.mcreator.ui.MCreator;
import net.mcreator.ui.init.UIRES;
import net.mcreator.ui.minecraft.MCItemHolder;

import java.awt.*;
import java.util.List;

public class SmithingRecipeMaker extends AbstractRecipeMaker {

	public final MCItemHolder cb4;
	public final MCItemHolder cb1;
	public final MCItemHolder cb2;
	public final MCItemHolder cb3;

	public SmithingRecipeMaker(MCreator mcreator, MCItem.ListProvider itemsWithTags, MCItem.ListProvider items) {
		super(UIRES.get("recipe.smithing").getImage());

		cb4 = new MCItemHolder(mcreator, itemsWithTags, true).disableRightClick();
		cb1 = new MCItemHolder(mcreator, itemsWithTags, true).disableRightClick();
		cb2 = new MCItemHolder(mcreator, itemsWithTags, true).disableRightClick();
		cb3 = new MCItemHolder(mcreator, items);

		cb4.setBounds(18, 60, 28, 28);
		cb1.setBounds(85, 60, 28, 28);
		cb2.setBounds(152, 60, 28, 28);
		cb3.setBounds(246, 60, 28, 28);

		imagePanel.add(cb4);
		imagePanel.add(cb1);
		imagePanel.add(cb2);
		imagePanel.add(cb3);

		setPreferredSize(new Dimension(306, 145));
	}

	@Override public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		cb4.setEnabled(enabled);
		cb1.setEnabled(enabled);
		cb2.setEnabled(enabled);
		cb3.setEnabled(enabled);
	}

	@Override protected void setupImageExport(boolean exportedYet) {
		cb1.setValidationShownFlag(exportedYet);
		cb2.setValidationShownFlag(exportedYet);
		cb3.setValidationShownFlag(exportedYet);
		cb4.setValidationShownFlag(exportedYet);
	}

	@Override public List<MCItemHolder> getIngredientSlots() {
		return List.of(cb4, cb1, cb2);
	}
}
