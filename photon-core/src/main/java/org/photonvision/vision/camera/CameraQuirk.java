/*
 * Copyright (C) Photon Vision.
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

package org.photonvision.vision.camera;

public enum CameraQuirk {
    /** Camera settable for controllable image gain */
    Gain,
    /** Only certain discrete exposure settings work */
    LifeCamControls,
    /** Auto-Exposure property uses 1/0, rather than 3/1 */
    PsEyeControls,
    /** Cap at 100FPS for high-bandwidth cameras */
    FPSCap100,
    /** Separate red/blue gain controls available */
    AWBGain,
    /** Will not work with photonvision - Logitec C270 at least */
    CompletelyBroken,
    /** Has adjustable focus and autofocus switch */
    AdjustableFocus,
    /** Changing FPS repeatedly with small delay does not work correctly */
    StickyFPS,
    /** Camera is an arducam. This means it shares VID/PID with other arducams (ew) */
    ArduCamCamera,
    /**
     * Camera is an arducam USB ov9281 which has a funky exposure issue where it is defined in v4l as
     * 1-5000 instead of 1-75
     */
    ArduOV9281Controls,
    /** Dummy quirk to tell OV2311 from OV9281 */
    ArduOV2311Controls,
    ArduOV9782Controls,
    /**
     * Camera is innomaker USB OV9281 which also has incorrect v4l exposure times Real range is more
     * like 0-500
     */
    InnoOV9281Controls,
}
