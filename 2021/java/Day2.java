package main2021;

import java.util.Scanner;

public class Day2 {
	public static void main(String[] args) {
		Scanner in = new Scanner("forward 8\r\n" + 
				"forward 1\r\n" + 
				"down 9\r\n" + 
				"down 8\r\n" + 
				"down 5\r\n" + 
				"forward 4\r\n" + 
				"up 9\r\n" + 
				"forward 7\r\n" + 
				"forward 2\r\n" + 
				"down 6\r\n" + 
				"forward 7\r\n" + 
				"forward 5\r\n" + 
				"forward 8\r\n" + 
				"down 7\r\n" + 
				"up 8\r\n" + 
				"forward 1\r\n" + 
				"forward 6\r\n" + 
				"down 8\r\n" + 
				"up 3\r\n" + 
				"forward 3\r\n" + 
				"down 3\r\n" + 
				"down 7\r\n" + 
				"forward 5\r\n" + 
				"down 1\r\n" + 
				"down 9\r\n" + 
				"forward 4\r\n" + 
				"up 7\r\n" + 
				"forward 9\r\n" + 
				"forward 1\r\n" + 
				"down 6\r\n" + 
				"down 5\r\n" + 
				"down 4\r\n" + 
				"forward 9\r\n" + 
				"forward 1\r\n" + 
				"forward 4\r\n" + 
				"up 3\r\n" + 
				"up 6\r\n" + 
				"forward 1\r\n" + 
				"forward 9\r\n" + 
				"forward 4\r\n" + 
				"down 1\r\n" + 
				"down 9\r\n" + 
				"forward 7\r\n" + 
				"forward 8\r\n" + 
				"down 8\r\n" + 
				"down 8\r\n" + 
				"down 4\r\n" + 
				"down 5\r\n" + 
				"up 3\r\n" + 
				"forward 4\r\n" + 
				"down 1\r\n" + 
				"forward 2\r\n" + 
				"forward 1\r\n" + 
				"forward 8\r\n" + 
				"up 2\r\n" + 
				"forward 5\r\n" + 
				"forward 4\r\n" + 
				"forward 5\r\n" + 
				"forward 8\r\n" + 
				"down 4\r\n" + 
				"down 5\r\n" + 
				"down 8\r\n" + 
				"down 7\r\n" + 
				"down 6\r\n" + 
				"forward 4\r\n" + 
				"up 8\r\n" + 
				"forward 6\r\n" + 
				"down 2\r\n" + 
				"down 7\r\n" + 
				"up 7\r\n" + 
				"down 2\r\n" + 
				"down 6\r\n" + 
				"forward 5\r\n" + 
				"forward 2\r\n" + 
				"forward 8\r\n" + 
				"down 5\r\n" + 
				"down 6\r\n" + 
				"down 6\r\n" + 
				"up 7\r\n" + 
				"down 7\r\n" + 
				"forward 8\r\n" + 
				"down 7\r\n" + 
				"down 7\r\n" + 
				"down 2\r\n" + 
				"down 2\r\n" + 
				"forward 3\r\n" + 
				"up 5\r\n" + 
				"down 3\r\n" + 
				"up 3\r\n" + 
				"down 4\r\n" + 
				"up 9\r\n" + 
				"down 1\r\n" + 
				"up 1\r\n" + 
				"forward 3\r\n" + 
				"up 3\r\n" + 
				"forward 9\r\n" + 
				"up 6\r\n" + 
				"down 3\r\n" + 
				"down 6\r\n" + 
				"forward 4\r\n" + 
				"forward 5\r\n" + 
				"forward 8\r\n" + 
				"down 6\r\n" + 
				"down 9\r\n" + 
				"down 4\r\n" + 
				"down 5\r\n" + 
				"forward 7\r\n" + 
				"down 3\r\n" + 
				"forward 8\r\n" + 
				"forward 3\r\n" + 
				"up 9\r\n" + 
				"forward 5\r\n" + 
				"forward 8\r\n" + 
				"forward 1\r\n" + 
				"down 4\r\n" + 
				"up 2\r\n" + 
				"forward 1\r\n" + 
				"down 1\r\n" + 
				"forward 5\r\n" + 
				"down 8\r\n" + 
				"down 2\r\n" + 
				"forward 3\r\n" + 
				"forward 2\r\n" + 
				"forward 1\r\n" + 
				"down 7\r\n" + 
				"forward 1\r\n" + 
				"down 4\r\n" + 
				"forward 7\r\n" + 
				"forward 5\r\n" + 
				"down 8\r\n" + 
				"down 2\r\n" + 
				"up 4\r\n" + 
				"up 8\r\n" + 
				"forward 6\r\n" + 
				"up 2\r\n" + 
				"down 8\r\n" + 
				"up 9\r\n" + 
				"forward 3\r\n" + 
				"up 5\r\n" + 
				"down 3\r\n" + 
				"down 5\r\n" + 
				"up 6\r\n" + 
				"forward 3\r\n" + 
				"up 9\r\n" + 
				"down 4\r\n" + 
				"forward 8\r\n" + 
				"up 3\r\n" + 
				"forward 6\r\n" + 
				"forward 7\r\n" + 
				"forward 8\r\n" + 
				"forward 6\r\n" + 
				"down 9\r\n" + 
				"forward 4\r\n" + 
				"up 8\r\n" + 
				"forward 3\r\n" + 
				"forward 3\r\n" + 
				"forward 6\r\n" + 
				"down 3\r\n" + 
				"forward 5\r\n" + 
				"down 4\r\n" + 
				"down 4\r\n" + 
				"up 4\r\n" + 
				"down 8\r\n" + 
				"down 4\r\n" + 
				"down 1\r\n" + 
				"down 7\r\n" + 
				"down 7\r\n" + 
				"up 9\r\n" + 
				"down 7\r\n" + 
				"forward 2\r\n" + 
				"down 1\r\n" + 
				"down 8\r\n" + 
				"forward 8\r\n" + 
				"forward 4\r\n" + 
				"forward 6\r\n" + 
				"forward 8\r\n" + 
				"forward 6\r\n" + 
				"forward 8\r\n" + 
				"forward 7\r\n" + 
				"forward 6\r\n" + 
				"up 7\r\n" + 
				"down 6\r\n" + 
				"down 9\r\n" + 
				"down 2\r\n" + 
				"down 8\r\n" + 
				"down 4\r\n" + 
				"up 6\r\n" + 
				"up 8\r\n" + 
				"forward 3\r\n" + 
				"down 7\r\n" + 
				"down 3\r\n" + 
				"forward 3\r\n" + 
				"forward 3\r\n" + 
				"down 4\r\n" + 
				"down 1\r\n" + 
				"up 3\r\n" + 
				"forward 3\r\n" + 
				"down 5\r\n" + 
				"up 6\r\n" + 
				"down 6\r\n" + 
				"forward 1\r\n" + 
				"down 3\r\n" + 
				"down 6\r\n" + 
				"down 9\r\n" + 
				"down 3\r\n" + 
				"forward 8\r\n" + 
				"down 1\r\n" + 
				"forward 7\r\n" + 
				"forward 1\r\n" + 
				"forward 3\r\n" + 
				"up 3\r\n" + 
				"down 8\r\n" + 
				"forward 4\r\n" + 
				"down 4\r\n" + 
				"down 4\r\n" + 
				"down 8\r\n" + 
				"down 5\r\n" + 
				"down 8\r\n" + 
				"forward 6\r\n" + 
				"forward 7\r\n" + 
				"down 9\r\n" + 
				"forward 2\r\n" + 
				"up 9\r\n" + 
				"down 5\r\n" + 
				"forward 2\r\n" + 
				"down 5\r\n" + 
				"down 8\r\n" + 
				"forward 1\r\n" + 
				"forward 6\r\n" + 
				"forward 2\r\n" + 
				"forward 6\r\n" + 
				"down 7\r\n" + 
				"up 7\r\n" + 
				"down 7\r\n" + 
				"forward 7\r\n" + 
				"up 8\r\n" + 
				"forward 9\r\n" + 
				"down 5\r\n" + 
				"up 6\r\n" + 
				"up 6\r\n" + 
				"forward 3\r\n" + 
				"down 5\r\n" + 
				"forward 1\r\n" + 
				"down 4\r\n" + 
				"down 4\r\n" + 
				"down 1\r\n" + 
				"up 6\r\n" + 
				"down 8\r\n" + 
				"down 9\r\n" + 
				"down 2\r\n" + 
				"up 2\r\n" + 
				"up 7\r\n" + 
				"forward 5\r\n" + 
				"down 5\r\n" + 
				"up 2\r\n" + 
				"forward 2\r\n" + 
				"up 1\r\n" + 
				"forward 2\r\n" + 
				"up 4\r\n" + 
				"up 7\r\n" + 
				"forward 2\r\n" + 
				"down 4\r\n" + 
				"down 1\r\n" + 
				"forward 4\r\n" + 
				"up 6\r\n" + 
				"forward 1\r\n" + 
				"up 7\r\n" + 
				"down 8\r\n" + 
				"down 5\r\n" + 
				"down 1\r\n" + 
				"up 7\r\n" + 
				"down 5\r\n" + 
				"forward 4\r\n" + 
				"forward 2\r\n" + 
				"down 2\r\n" + 
				"down 6\r\n" + 
				"forward 1\r\n" + 
				"forward 2\r\n" + 
				"up 6\r\n" + 
				"down 1\r\n" + 
				"forward 2\r\n" + 
				"down 5\r\n" + 
				"down 9\r\n" + 
				"down 6\r\n" + 
				"up 8\r\n" + 
				"forward 3\r\n" + 
				"down 6\r\n" + 
				"up 3\r\n" + 
				"down 8\r\n" + 
				"down 8\r\n" + 
				"forward 2\r\n" + 
				"forward 1\r\n" + 
				"forward 7\r\n" + 
				"forward 8\r\n" + 
				"forward 2\r\n" + 
				"forward 5\r\n" + 
				"down 6\r\n" + 
				"down 3\r\n" + 
				"forward 5\r\n" + 
				"up 8\r\n" + 
				"forward 6\r\n" + 
				"up 9\r\n" + 
				"forward 7\r\n" + 
				"up 3\r\n" + 
				"down 7\r\n" + 
				"down 3\r\n" + 
				"up 8\r\n" + 
				"down 5\r\n" + 
				"forward 3\r\n" + 
				"down 1\r\n" + 
				"forward 1\r\n" + 
				"forward 2\r\n" + 
				"down 7\r\n" + 
				"down 6\r\n" + 
				"down 9\r\n" + 
				"forward 3\r\n" + 
				"down 7\r\n" + 
				"down 7\r\n" + 
				"down 5\r\n" + 
				"forward 4\r\n" + 
				"down 4\r\n" + 
				"forward 5\r\n" + 
				"forward 1\r\n" + 
				"forward 4\r\n" + 
				"down 8\r\n" + 
				"up 4\r\n" + 
				"down 6\r\n" + 
				"down 8\r\n" + 
				"up 1\r\n" + 
				"forward 7\r\n" + 
				"up 3\r\n" + 
				"forward 6\r\n" + 
				"forward 8\r\n" + 
				"forward 9\r\n" + 
				"forward 2\r\n" + 
				"up 6\r\n" + 
				"forward 7\r\n" + 
				"forward 3\r\n" + 
				"up 3\r\n" + 
				"up 6\r\n" + 
				"down 8\r\n" + 
				"up 4\r\n" + 
				"forward 9\r\n" + 
				"down 9\r\n" + 
				"up 3\r\n" + 
				"up 3\r\n" + 
				"down 4\r\n" + 
				"up 3\r\n" + 
				"down 2\r\n" + 
				"down 4\r\n" + 
				"up 9\r\n" + 
				"down 1\r\n" + 
				"forward 6\r\n" + 
				"forward 3\r\n" + 
				"down 3\r\n" + 
				"forward 4\r\n" + 
				"forward 3\r\n" + 
				"forward 8\r\n" + 
				"forward 1\r\n" + 
				"down 1\r\n" + 
				"up 4\r\n" + 
				"up 9\r\n" + 
				"down 8\r\n" + 
				"forward 3\r\n" + 
				"forward 2\r\n" + 
				"down 4\r\n" + 
				"down 1\r\n" + 
				"forward 8\r\n" + 
				"down 8\r\n" + 
				"up 8\r\n" + 
				"up 7\r\n" + 
				"down 4\r\n" + 
				"forward 6\r\n" + 
				"up 5\r\n" + 
				"down 1\r\n" + 
				"down 3\r\n" + 
				"down 9\r\n" + 
				"forward 3\r\n" + 
				"forward 9\r\n" + 
				"down 1\r\n" + 
				"down 6\r\n" + 
				"forward 8\r\n" + 
				"up 1\r\n" + 
				"down 9\r\n" + 
				"down 3\r\n" + 
				"forward 5\r\n" + 
				"forward 9\r\n" + 
				"forward 8\r\n" + 
				"up 7\r\n" + 
				"down 2\r\n" + 
				"down 5\r\n" + 
				"forward 6\r\n" + 
				"down 9\r\n" + 
				"down 4\r\n" + 
				"down 7\r\n" + 
				"down 4\r\n" + 
				"forward 7\r\n" + 
				"down 8\r\n" + 
				"up 8\r\n" + 
				"forward 2\r\n" + 
				"up 3\r\n" + 
				"down 4\r\n" + 
				"forward 2\r\n" + 
				"forward 4\r\n" + 
				"up 4\r\n" + 
				"forward 4\r\n" + 
				"forward 9\r\n" + 
				"down 9\r\n" + 
				"up 1\r\n" + 
				"forward 1\r\n" + 
				"down 8\r\n" + 
				"up 7\r\n" + 
				"up 9\r\n" + 
				"down 8\r\n" + 
				"down 7\r\n" + 
				"forward 9\r\n" + 
				"forward 1\r\n" + 
				"up 3\r\n" + 
				"forward 8\r\n" + 
				"forward 6\r\n" + 
				"forward 5\r\n" + 
				"up 2\r\n" + 
				"forward 8\r\n" + 
				"up 7\r\n" + 
				"down 8\r\n" + 
				"down 2\r\n" + 
				"up 9\r\n" + 
				"down 7\r\n" + 
				"forward 5\r\n" + 
				"forward 4\r\n" + 
				"down 9\r\n" + 
				"forward 4\r\n" + 
				"forward 5\r\n" + 
				"up 1\r\n" + 
				"down 8\r\n" + 
				"down 8\r\n" + 
				"down 4\r\n" + 
				"forward 3\r\n" + 
				"down 1\r\n" + 
				"up 7\r\n" + 
				"down 8\r\n" + 
				"forward 4\r\n" + 
				"down 5\r\n" + 
				"forward 1\r\n" + 
				"down 9\r\n" + 
				"forward 9\r\n" + 
				"up 7\r\n" + 
				"up 1\r\n" + 
				"down 3\r\n" + 
				"forward 3\r\n" + 
				"down 8\r\n" + 
				"forward 9\r\n" + 
				"down 3\r\n" + 
				"up 7\r\n" + 
				"forward 1\r\n" + 
				"up 8\r\n" + 
				"up 2\r\n" + 
				"up 1\r\n" + 
				"forward 8\r\n" + 
				"down 3\r\n" + 
				"forward 5\r\n" + 
				"up 3\r\n" + 
				"forward 6\r\n" + 
				"forward 9\r\n" + 
				"forward 2\r\n" + 
				"forward 6\r\n" + 
				"down 5\r\n" + 
				"forward 2\r\n" + 
				"down 7\r\n" + 
				"up 6\r\n" + 
				"forward 8\r\n" + 
				"forward 6\r\n" + 
				"down 3\r\n" + 
				"forward 8\r\n" + 
				"down 1\r\n" + 
				"forward 2\r\n" + 
				"down 9\r\n" + 
				"up 5\r\n" + 
				"down 6\r\n" + 
				"up 4\r\n" + 
				"forward 6\r\n" + 
				"forward 5\r\n" + 
				"forward 2\r\n" + 
				"forward 9\r\n" + 
				"forward 8\r\n" + 
				"up 4\r\n" + 
				"forward 4\r\n" + 
				"forward 9\r\n" + 
				"forward 4\r\n" + 
				"forward 7\r\n" + 
				"up 6\r\n" + 
				"down 5\r\n" + 
				"forward 8\r\n" + 
				"down 8\r\n" + 
				"up 3\r\n" + 
				"down 4\r\n" + 
				"up 8\r\n" + 
				"up 5\r\n" + 
				"forward 3\r\n" + 
				"down 8\r\n" + 
				"down 9\r\n" + 
				"down 1\r\n" + 
				"forward 7\r\n" + 
				"down 8\r\n" + 
				"up 4\r\n" + 
				"down 8\r\n" + 
				"up 4\r\n" + 
				"down 5\r\n" + 
				"forward 1\r\n" + 
				"forward 3\r\n" + 
				"down 6\r\n" + 
				"down 5\r\n" + 
				"forward 4\r\n" + 
				"up 2\r\n" + 
				"down 7\r\n" + 
				"down 3\r\n" + 
				"up 9\r\n" + 
				"forward 5\r\n" + 
				"forward 3\r\n" + 
				"forward 2\r\n" + 
				"up 2\r\n" + 
				"down 9\r\n" + 
				"up 1\r\n" + 
				"down 2\r\n" + 
				"forward 3\r\n" + 
				"forward 8\r\n" + 
				"forward 5\r\n" + 
				"down 2\r\n" + 
				"down 2\r\n" + 
				"up 3\r\n" + 
				"down 8\r\n" + 
				"forward 4\r\n" + 
				"forward 6\r\n" + 
				"forward 5\r\n" + 
				"up 9\r\n" + 
				"down 7\r\n" + 
				"up 7\r\n" + 
				"up 2\r\n" + 
				"down 2\r\n" + 
				"up 4\r\n" + 
				"forward 2\r\n" + 
				"forward 2\r\n" + 
				"down 7\r\n" + 
				"forward 5\r\n" + 
				"down 2\r\n" + 
				"up 7\r\n" + 
				"forward 6\r\n" + 
				"forward 5\r\n" + 
				"down 1\r\n" + 
				"forward 8\r\n" + 
				"forward 3\r\n" + 
				"forward 2\r\n" + 
				"up 3\r\n" + 
				"down 1\r\n" + 
				"forward 6\r\n" + 
				"forward 5\r\n" + 
				"forward 9\r\n" + 
				"down 5\r\n" + 
				"up 3\r\n" + 
				"down 1\r\n" + 
				"down 5\r\n" + 
				"forward 1\r\n" + 
				"down 1\r\n" + 
				"down 1\r\n" + 
				"forward 6\r\n" + 
				"up 8\r\n" + 
				"forward 9\r\n" + 
				"up 5\r\n" + 
				"up 5\r\n" + 
				"forward 9\r\n" + 
				"forward 3\r\n" + 
				"forward 4\r\n" + 
				"down 8\r\n" + 
				"forward 9\r\n" + 
				"forward 9\r\n" + 
				"up 2\r\n" + 
				"down 6\r\n" + 
				"down 2\r\n" + 
				"forward 1\r\n" + 
				"down 7\r\n" + 
				"up 4\r\n" + 
				"forward 3\r\n" + 
				"down 6\r\n" + 
				"forward 5\r\n" + 
				"down 6\r\n" + 
				"up 5\r\n" + 
				"forward 6\r\n" + 
				"up 6\r\n" + 
				"forward 7\r\n" + 
				"forward 5\r\n" + 
				"forward 1\r\n" + 
				"down 9\r\n" + 
				"forward 7\r\n" + 
				"forward 4\r\n" + 
				"forward 1\r\n" + 
				"forward 6\r\n" + 
				"up 7\r\n" + 
				"forward 6\r\n" + 
				"down 3\r\n" + 
				"forward 4\r\n" + 
				"down 1\r\n" + 
				"down 9\r\n" + 
				"down 8\r\n" + 
				"forward 7\r\n" + 
				"down 7\r\n" + 
				"up 5\r\n" + 
				"forward 1\r\n" + 
				"forward 4\r\n" + 
				"forward 8\r\n" + 
				"forward 6\r\n" + 
				"forward 2\r\n" + 
				"forward 4\r\n" + 
				"forward 2\r\n" + 
				"forward 6\r\n" + 
				"forward 5\r\n" + 
				"down 4\r\n" + 
				"down 3\r\n" + 
				"forward 6\r\n" + 
				"forward 3\r\n" + 
				"up 6\r\n" + 
				"down 3\r\n" + 
				"down 2\r\n" + 
				"forward 1\r\n" + 
				"down 9\r\n" + 
				"up 1\r\n" + 
				"forward 8\r\n" + 
				"forward 1\r\n" + 
				"forward 1\r\n" + 
				"forward 4\r\n" + 
				"down 5\r\n" + 
				"forward 7\r\n" + 
				"forward 5\r\n" + 
				"up 5\r\n" + 
				"up 7\r\n" + 
				"forward 7\r\n" + 
				"forward 5\r\n" + 
				"down 3\r\n" + 
				"down 2\r\n" + 
				"down 7\r\n" + 
				"forward 7\r\n" + 
				"forward 4\r\n" + 
				"down 9\r\n" + 
				"forward 2\r\n" + 
				"down 6\r\n" + 
				"forward 3\r\n" + 
				"up 6\r\n" + 
				"down 8\r\n" + 
				"down 7\r\n" + 
				"down 6\r\n" + 
				"down 7\r\n" + 
				"up 5\r\n" + 
				"up 9\r\n" + 
				"down 4\r\n" + 
				"up 6\r\n" + 
				"forward 1\r\n" + 
				"forward 2\r\n" + 
				"forward 4\r\n" + 
				"up 5\r\n" + 
				"down 2\r\n" + 
				"down 3\r\n" + 
				"forward 9\r\n" + 
				"down 9\r\n" + 
				"down 3\r\n" + 
				"forward 5\r\n" + 
				"forward 3\r\n" + 
				"down 1\r\n" + 
				"up 7\r\n" + 
				"forward 7\r\n" + 
				"forward 5\r\n" + 
				"down 8\r\n" + 
				"up 6\r\n" + 
				"down 7\r\n" + 
				"forward 5\r\n" + 
				"up 7\r\n" + 
				"up 6\r\n" + 
				"forward 2\r\n" + 
				"forward 6\r\n" + 
				"down 1\r\n" + 
				"up 8\r\n" + 
				"down 9\r\n" + 
				"down 1\r\n" + 
				"forward 9\r\n" + 
				"up 9\r\n" + 
				"down 2\r\n" + 
				"forward 6\r\n" + 
				"up 3\r\n" + 
				"down 1\r\n" + 
				"up 9\r\n" + 
				"down 6\r\n" + 
				"up 2\r\n" + 
				"up 6\r\n" + 
				"forward 9\r\n" + 
				"forward 8\r\n" + 
				"up 7\r\n" + 
				"forward 6\r\n" + 
				"up 3\r\n" + 
				"up 4\r\n" + 
				"down 6\r\n" + 
				"forward 1\r\n" + 
				"forward 9\r\n" + 
				"down 9\r\n" + 
				"down 6\r\n" + 
				"forward 1\r\n" + 
				"forward 2\r\n" + 
				"up 3\r\n" + 
				"down 4\r\n" + 
				"down 9\r\n" + 
				"down 3\r\n" + 
				"down 2\r\n" + 
				"forward 7\r\n" + 
				"down 9\r\n" + 
				"forward 9\r\n" + 
				"forward 5\r\n" + 
				"down 9\r\n" + 
				"forward 1\r\n" + 
				"forward 6\r\n" + 
				"down 6\r\n" + 
				"up 8\r\n" + 
				"up 8\r\n" + 
				"up 3\r\n" + 
				"forward 7\r\n" + 
				"forward 7\r\n" + 
				"forward 8\r\n" + 
				"down 5\r\n" + 
				"forward 3\r\n" + 
				"down 4\r\n" + 
				"down 6\r\n" + 
				"forward 1\r\n" + 
				"down 1\r\n" + 
				"forward 7\r\n" + 
				"forward 2\r\n" + 
				"down 7\r\n" + 
				"down 1\r\n" + 
				"up 6\r\n" + 
				"forward 3\r\n" + 
				"down 6\r\n" + 
				"forward 2\r\n" + 
				"down 6\r\n" + 
				"forward 8\r\n" + 
				"down 4\r\n" + 
				"up 8\r\n" + 
				"forward 9\r\n" + 
				"up 5\r\n" + 
				"forward 3\r\n" + 
				"down 6\r\n" + 
				"forward 4\r\n" + 
				"forward 4\r\n" + 
				"down 8\r\n" + 
				"up 5\r\n" + 
				"up 9\r\n" + 
				"down 8\r\n" + 
				"forward 1\r\n" + 
				"down 6\r\n" + 
				"down 3\r\n" + 
				"forward 1\r\n" + 
				"down 4\r\n" + 
				"up 6\r\n" + 
				"down 6\r\n" + 
				"down 6\r\n" + 
				"down 5\r\n" + 
				"forward 5\r\n" + 
				"forward 6\r\n" + 
				"down 1\r\n" + 
				"down 9\r\n" + 
				"down 4\r\n" + 
				"up 7\r\n" + 
				"down 2\r\n" + 
				"forward 5\r\n" + 
				"down 8\r\n" + 
				"down 8\r\n" + 
				"down 6\r\n" + 
				"down 1\r\n" + 
				"up 8\r\n" + 
				"down 1\r\n" + 
				"down 4\r\n" + 
				"forward 6\r\n" + 
				"down 3\r\n" + 
				"down 6\r\n" + 
				"up 4\r\n" + 
				"down 6\r\n" + 
				"up 7\r\n" + 
				"down 3\r\n" + 
				"forward 2\r\n" + 
				"up 3\r\n" + 
				"forward 7\r\n" + 
				"up 7\r\n" + 
				"up 4\r\n" + 
				"forward 5\r\n" + 
				"down 9\r\n" + 
				"down 2\r\n" + 
				"down 9\r\n" + 
				"up 6\r\n" + 
				"forward 9\r\n" + 
				"forward 3\r\n" + 
				"down 1\r\n" + 
				"forward 7\r\n" + 
				"forward 2\r\n" + 
				"down 5\r\n" + 
				"forward 3\r\n" + 
				"forward 7\r\n" + 
				"forward 4\r\n" + 
				"forward 7\r\n" + 
				"forward 6\r\n" + 
				"forward 3\r\n" + 
				"down 6\r\n" + 
				"forward 3\r\n" + 
				"down 1\r\n" + 
				"up 6\r\n" + 
				"up 9\r\n" + 
				"down 1\r\n" + 
				"forward 1\r\n" + 
				"down 1\r\n" + 
				"up 7\r\n" + 
				"forward 8\r\n" + 
				"forward 4\r\n" + 
				"up 4\r\n" + 
				"forward 7\r\n" + 
				"down 3\r\n" + 
				"up 8\r\n" + 
				"up 1\r\n" + 
				"down 6\r\n" + 
				"forward 8\r\n" + 
				"forward 7\r\n" + 
				"up 7\r\n" + 
				"down 4\r\n" + 
				"down 4\r\n" + 
				"down 8\r\n" + 
				"up 3\r\n" + 
				"forward 5\r\n" + 
				"down 4\r\n" + 
				"forward 9\r\n" + 
				"forward 6\r\n" + 
				"forward 6\r\n" + 
				"forward 7\r\n" + 
				"down 6\r\n" + 
				"down 3\r\n" + 
				"forward 2\r\n" + 
				"up 8\r\n" + 
				"forward 1\r\n" + 
				"down 9\r\n" + 
				"up 7\r\n" + 
				"down 3\r\n" + 
				"down 3\r\n" + 
				"up 5\r\n" + 
				"up 4\r\n" + 
				"up 8\r\n" + 
				"forward 2\r\n" + 
				"down 5\r\n" + 
				"forward 7\r\n" + 
				"up 8\r\n" + 
				"up 6\r\n" + 
				"forward 5\r\n" + 
				"down 5\r\n" + 
				"forward 2\r\n" + 
				"down 6\r\n" + 
				"forward 7\r\n" + 
				"down 6\r\n" + 
				"forward 5\r\n" + 
				"forward 3\r\n" + 
				"forward 9\r\n" + 
				"down 7\r\n" + 
				"forward 7\r\n" + 
				"forward 7\r\n" + 
				"forward 7\r\n" + 
				"forward 1\r\n" + 
				"forward 2\r\n" + 
				"forward 2\r\n" + 
				"down 6\r\n" + 
				"down 8\r\n" + 
				"forward 3\r\n" + 
				"down 9\r\n" + 
				"down 5\r\n" + 
				"up 5\r\n" + 
				"forward 3\r\n" + 
				"forward 9\r\n" + 
				"down 7\r\n" + 
				"down 9\r\n" + 
				"down 9\r\n" + 
				"down 9\r\n" + 
				"forward 6\r\n" + 
				"down 1\r\n" + 
				"forward 6\r\n" + 
				"forward 8\r\n" + 
				"forward 8\r\n" + 
				"down 4\r\n" + 
				"forward 8\r\n" + 
				"down 9\r\n" + 
				"forward 6\r\n" + 
				"down 2\r\n" + 
				"down 1\r\n" + 
				"down 5\r\n" + 
				"forward 5\r\n" + 
				"forward 8\r\n" + 
				"forward 7\r\n" + 
				"forward 7\r\n" + 
				"forward 8\r\n" + 
				"down 5\r\n" + 
				"forward 3\r\n" + 
				"up 5\r\n" + 
				"forward 5\r\n" + 
				"down 9\r\n" + 
				"up 8\r\n" + 
				"down 2\r\n" + 
				"forward 8\r\n" + 
				"forward 5\r\n" + 
				"up 5\r\n" + 
				"forward 4\r\n" + 
				"down 3\r\n" + 
				"forward 4\r\n" + 
				"up 3\r\n" + 
				"forward 1\r\n" + 
				"forward 8\r\n" + 
				"forward 3\r\n" + 
				"down 2\r\n" + 
				"up 8\r\n" + 
				"forward 2\r\n" + 
				"down 8\r\n" + 
				"forward 3\r\n" + 
				"up 2\r\n" + 
				"up 1\r\n" + 
				"down 9\r\n" + 
				"down 8\r\n" + 
				"forward 1\r\n" + 
				"forward 1\r\n" + 
				"down 8\r\n" + 
				"forward 9\r\n" + 
				"up 2\r\n" + 
				"forward 4\r\n" + 
				"forward 2\r\n" + 
				"up 2\r\n" + 
				"down 8\r\n" + 
				"down 1\r\n" + 
				"forward 1\r\n" + 
				"forward 3\r\n" + 
				"forward 6\r\n" + 
				"up 6\r\n" + 
				"down 2\r\n" + 
				"up 1\r\n" + 
				"down 3\r\n" + 
				"forward 3\r\n" + 
				"up 5\r\n" + 
				"down 9\r\n" + 
				"down 7\r\n" + 
				"forward 8\r\n" + 
				"up 5\r\n" + 
				"up 4\r\n" + 
				"forward 8\r\n" + 
				"forward 5\r\n" + 
				"down 8\r\n" + 
				"up 8\r\n" + 
				"forward 7\r\n" + 
				"up 8\r\n" + 
				"down 6\r\n" + 
				"down 2\r\n" + 
				"down 3\r\n" + 
				"forward 9\r\n" + 
				"down 4\r\n" + 
				"down 2\r\n" + 
				"down 1\r\n" + 
				"up 2\r\n" + 
				"up 4\r\n" + 
				"forward 3\r\n" + 
				"forward 1\r\n" + 
				"forward 9\r\n" + 
				"forward 1\r\n" + 
				"down 7\r\n" + 
				"up 7\r\n" + 
				"forward 5\r\n" + 
				"down 3\r\n" + 
				"forward 3\r\n" + 
				"down 4\r\n" + 
				"down 1\r\n" + 
				"up 5\r\n" + 
				"down 8\r\n" + 
				"down 2\r\n" + 
				"forward 4\r\n" + 
				"up 9\r\n" + 
				"down 3\r\n" + 
				"down 3\r\n" + 
				"down 2\r\n" + 
				"forward 7\r\n" + 
				"down 2\r\n" + 
				"forward 6\r\n" + 
				"up 8\r\n" + 
				"forward 5\r\n" + 
				"forward 5\r\n" + 
				"up 9\r\n" + 
				"forward 8\r\n" + 
				"forward 9\r\n" + 
				"down 5\r\n" + 
				"forward 5\r\n" + 
				"down 3\r\n" + 
				"forward 5\r\n" + 
				"down 1\r\n" + 
				"forward 6\r\n" + 
				"forward 6\r\n" + 
				"forward 1\r\n" + 
				"forward 2\r\n" + 
				"up 5\r\n" + 
				"forward 9");
		int x = 0, y = 0, aim = 0;
		while(in.hasNextLine()) {
			String temp = in.nextLine();
			String[] yeet = temp.split(" ");
			switch(yeet[0]) {
			case "forward":
				x+=Integer.parseInt(yeet[1]);
				y+=aim*Integer.parseInt(yeet[1]);
				break;
			case "down":
				aim+=Integer.parseInt(yeet[1]);
				break;
			case "up":
				aim-=Integer.parseInt(yeet[1]);
				break;
			}
		}
		System.out.println(x*y);
		in.close();
	}
}
