package com.ltts.hlm.pms.entity;

import java.util.List;

public class NotificationJSONObject {
	public List<DefaultNotificationPreference> defaultData;
	public List<NotificationPreference> previouslySelected;

	public List<DefaultNotificationPreference> getDEFAULTDATA() {
		return defaultData;
	}

	public void setDEFAULTDATA(List<DefaultNotificationPreference> defaultData) {
		this.defaultData = defaultData;
	}

	public List<NotificationPreference> getPREVIOUSLYSELECTED() {
		return previouslySelected;
	}

	public void setPREVIOUSLYSELECTED(List<NotificationPreference> previouslySelected) {
		this.previouslySelected = previouslySelected;
	}

}
