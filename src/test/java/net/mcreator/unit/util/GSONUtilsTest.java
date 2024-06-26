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

package net.mcreator.unit.util;

import net.mcreator.util.diff.GSONCompare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GSONUtilsTest {

	@Test public void testGSONCompare() {
		TestObject objA = new TestObject("test", 1);
		TestObject objB = new TestObject("test", 1);
		TestObject objC = new TestObject("ees", 1);

		Assertions.assertTrue(GSONCompare.deepEquals(objA, objA));
		assertTrue(GSONCompare.deepEquals(objA, objB));
		assertFalse(GSONCompare.deepEquals(objA, objC));
		assertFalse(GSONCompare.deepEquals(objB, objC));
	}

	private record TestObject(String fieldA, int fieldB) {

	}

}