package com.projectkorra.rpg.worldevent;

import java.util.List;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.rpg.worldevent.util.Time;

public interface IWorldEvent {

	/**
	 * The name of the WorldEvent
	 * 
	 * @return name of the WorldEvent
	 */
	public String getName();

	/**
	 * The description of the WorldEvent
	 * 
	 * @return description of the WorldEvent
	 */
	public String getDescription();

	/**
	 * A list of aliases for the WorldEvent that can be used in commands
	 * 
	 * @return list of aliases
	 */
	public List<String> getAliases();

	/**
	 * A list of attributes to be modified while the WorldEvent is active
	 * 
	 * @return list of attributes
	 */
	public List<String> getAttributes();

	/**
	 * Which element the WorldEvent should affect. This will work with custom
	 * elements, but be sure the custom element does exist!
	 * 
	 * @return element the WorldEvent affects
	 */
	public Element getElement();

	/**
	 * Denotes when the WorldEvent should occur
	 * 
	 * @return time when WorldEvent occurs
	 * @see {@link Time}
	 */
	public Time getTime();

	/**
	 * The frequency at which the WorldEvent occurs
	 * 
	 * @return frequency of WorldEvent
	 */
	public int getFrequency();

	/**
	 * A modifier for how the event affects the bending of it's element. <br>
	 * Scale: x = modifier <br>
	 * -- [0 < x < 1]: bending will be nerfed or cancelled entirely <br>
	 * -- [x > 1]: bending is empowered making most bending abilities stronger
	 * <br>
	 * <b>The modifier should not be below 0 or insanely high, doing either may
	 * have unintended consequences!
	 * 
	 * @return numerical modifier for bending abilities of the WorldEvent's
	 *         element
	 */
	public double getModifier();

	/**
	 * The message to be displayed when the event starts
	 * 
	 * @return starting message
	 */
	public String getStartMessage();

	/**
	 * The message to be displayed when the event ends
	 * 
	 * @return ending message
	 */
	public String getEndMessage();

	/**
	 * Whether the WorldEvent will darken the sky
	 * 
	 * @return true if the WorldEvent will darken the sky
	 */
	public boolean getDarkenSky();

	/**
	 * Whether the WorldEvent will create fog in the world
	 * 
	 * @return true if the WorldEvent will create fog in the world
	 */
	public boolean getCreateFog();
}