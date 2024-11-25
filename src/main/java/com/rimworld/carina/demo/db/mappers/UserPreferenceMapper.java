package com.rimworld.carina.demo.db.mappers;

import com.rimworld.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);
}
