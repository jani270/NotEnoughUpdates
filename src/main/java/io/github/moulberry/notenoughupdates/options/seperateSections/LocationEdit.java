/*
 * Copyright (C) 2022 NotEnoughUpdates contributors
 *
 * This file is part of NotEnoughUpdates.
 *
 * NotEnoughUpdates is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * NotEnoughUpdates is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with NotEnoughUpdates. If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.options.seperateSections;

import io.github.moulberry.notenoughupdates.core.config.Position;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigAccordionId;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigEditorAccordion;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigEditorButton;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigOption;

public class LocationEdit {

	@ConfigOption(
		name = "Edit GUI locations",
		desc = "Change the position of NEU's overlays"
	)
	@ConfigEditorButton(
		runnableId = 4,
		buttonText = "Edit"
	)
	public Position positions = new Position(-1, -1);

	@ConfigOption(
		name = "Edit Dungeon Map",
		desc = "The NEU dungeon map has it's own editor (/neumap).\n" +
			"Click the button on the left to open it"
	)
	@ConfigEditorButton(
		runnableId = 0,
		buttonText = "Edit"
	)
	public int editDungeonMap = 0;

	@ConfigOption(
		name = "Inventory",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean inventoryAccordion = false;

	@ConfigOption(
		name = "Edit Toolbar Positions",
		desc = "Change the position of the QuickCommands / Search Bar"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorButton(runnableId = 6, buttonText = "Edit")
	public boolean positionButton = true;

	@ConfigOption(
		name = "Open Button Editor",
		desc = "Open button editor GUI (/neubuttons)"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorButton(runnableId = 7, buttonText = "Open")
	public boolean openEditorButton = true;
}
