/*
 * JCOP Emulation driver for javax.smartcardio framework.
 *
 * Copyright (C) 2008  Martijn Oostdijk
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * $Id: $
 */

package net.sourceforge.scuba.smartcards;

import java.security.Provider;

/**
 * A provider for JCOP Emulator.
 *
 * @author Martijn Oostdijk (martijn.oostdijk@gmail.com)
 * @version $Revision: $
 */
public class JCOPTerminalProvider extends Provider
{

    private static final long serialVersionUID = -959161628374948639L;

    /**
     * Constructs the provider.
     */
    public JCOPTerminalProvider() {
        super("JCOPTerminalProvider", 0.1d, "JCOP Emulation Provider");
        put("TerminalFactory.JCOP", "net.sourceforge.scuba.smartcards.JCOPEmulatorTerminalFactorySpi");
    }
}
