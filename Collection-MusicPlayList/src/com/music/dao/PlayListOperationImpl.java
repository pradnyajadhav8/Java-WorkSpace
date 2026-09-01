package com.music.dao;

import java.util.ArrayList;
import com.music.model.Song;

public class PlayListOperationImpl implements PlayListOoeration {

	ArrayList<Song> musicList = new ArrayList<>();

	@Override
	public void addSong(Song song) {
		musicList.add(song);
	}

	@Override
	public boolean checkSong(Song song) {
		return musicList.contains(song);
	}

	@Override
	public void removeSong(Song song) {
		musicList.remove(song);
	}

	@Override
	public void printPlayList() {
		System.out.printf("%-5d	%-25s	%-25s	%-5s%n	%-5f", "srNo", "name", "singer", "isLiked", "duration");
		for (Song song : musicList) {
			System.out.println(song);
		}
	}

}
