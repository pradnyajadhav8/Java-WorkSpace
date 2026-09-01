package com.music.dao;

import com.music.model.Song;

public interface PlayListOoeration {

	void addSong(Song song);

	boolean checkSong(Song song);

	void removeSong(Song song);

	void printPlayList();
}
