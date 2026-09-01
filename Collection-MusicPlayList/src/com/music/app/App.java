package com.music.app;

import java.util.Scanner;
import com.music.dao.*;
import com.music.model.*;

public class App {

	private static Scanner scanner = new Scanner(System.in);
	private static PlayListOoeration playList = new PlayListOperationImpl();

	private static void putSongToPlayList() {
		System.out.println("Enter Sr No : ");
		int srNo = scanner.nextInt();
		System.out.println("Enter Song Name ");
		String name = scanner.nextLine();
		System.out.println("Enter Singer Name ");
		String singerName = scanner.nextLine();
		System.out.println("Enter LIKED or DISLIKED");
		boolean isLiked = scanner.nextBoolean();
		System.out.println("Time Duration");
		double duration = scanner.nextDouble();
	}
	
	private static void deleteSongFromPlayList() {
		
	}

	private static void showMenu() {
		System.out.println("*********** WELCOME **********");
		System.out.println(" CREATE PLAYLIST ");
		System.out.println(" 1 : ADD SONG ");
		System.out.println(" 2 : DELETE SONG ");
		System.out.println(" 3 : CHEAK SONG ");
		System.out.println(" 4 : SHOW PLAYLIST ");
		System.out.println(" 5 : EXIT ");
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) {

		showMenu();
		int option;
		System.out.println("Enter Option ");
		option = scanner.nextInt();

		switch (option) {
		case 1: 
			putSongToPlayList();
		case 2:
			deleteSongFromPlayList();
		case 3:
			
		}
	}

	

	
}
