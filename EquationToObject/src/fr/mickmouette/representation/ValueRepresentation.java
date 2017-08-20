package fr.mickmouette.representation;

import fr.mickmouette.core.elements.exception.DontHaveAValueException;
import fr.mickmouette.core.elements.representation.ValueOperatorRepresentation;

/**
 *  This project is a library developed for java object developers. It provide a way to easily manipulate infix mathematical equations.
 *  Copyright (C) 2017  Mickael Alvarez
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Contact : mickael.alvarez.93@gmail.com
 * 
 * @author Mickael Alvarez
 *
 * @param <V>
 */
public abstract class ValueRepresentation<V> extends ValueOperatorRepresentation<V> {

	public ValueRepresentation(V value) {
		super(value);
	}

	@Override
	public V getValue() throws DontHaveAValueException {
		return value;
	}

}
