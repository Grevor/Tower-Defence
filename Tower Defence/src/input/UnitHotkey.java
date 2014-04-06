package input;

import viking.input.KeyboardState;
import viking.input.hotkeys.ConditionalHotkey;
import viking.input.hotkeys.actions.HotkeyAction;
import viking.input.hotkeys.conditions.ConsumedCondition;
import viking.input.hotkeys.conditions.KeyPressedSinceLastSampleCondition;
import viking.input.hotkeys.conditions.StateCondition;

public class UnitHotkey extends ConditionalHotkey {

	public UnitHotkey(int modifierMasks, int characterKey, String name, HotkeyAction action) {
		super(name);
		KeyboardState hotkey = new KeyboardState(modifierMasks, characterKey);
		
		addPressCondition(new StateCondition(true, hotkey));
		addPressCondition(new KeyPressedSinceLastSampleCondition(characterKey));
		addPressCondition(new ConsumedCondition(false));
		
		addStillPressedCondition(new StateCondition(false, hotkey));
		
		
		addHotkeyAction(action);
	}

}
