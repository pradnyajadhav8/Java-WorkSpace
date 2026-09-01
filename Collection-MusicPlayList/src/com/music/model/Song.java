package com.music.model;

import java.util.Objects;

public class Song {
	private int srNo;
	private String name;
	private String singer;
	private boolean isLiked;
	private double duration;

	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(int srNo, String name, String singer, boolean isLiked, double duration) {
		super();
		this.srNo = srNo;
		this.name = name;
		this.singer = singer;
		this.isLiked = isLiked;
		this.duration = duration;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public boolean isLiked() {
		return isLiked;
	}

	public void setLiked(boolean isLiked) {
		this.isLiked = isLiked;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	// return "Song [srNo=" + srNo + ", name=" + name + ", singer=" + singer + ",
	// isLiked=" + isLiked + ", duration="+ duration + "]";

	@Override
	public String toString() {
		return String.format("%-5d	%-25s	%-25s	%-5s%n	%-5f", srNo, name, singer, isLiked, duration);

	}

	@Override
	public int hashCode() {
		return Objects.hash(Double.valueOf(duration), Boolean.valueOf(isLiked), name, singer, Integer.valueOf(srNo));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Double.doubleToLongBits(duration) == Double.doubleToLongBits(other.duration) && isLiked == other.isLiked
				&& Objects.equals(name, other.name) && Objects.equals(singer, other.singer) && srNo == other.srNo;
	}

}
