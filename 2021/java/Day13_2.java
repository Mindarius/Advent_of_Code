package main2021;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Day13_2 {
	static Set<Point> map = new HashSet<>();
	static List<String> instructions = new ArrayList<>();
	public static void main(String[] args) {
		Scanner in = new Scanner(input);
		while(in.hasNextLine()) {
			String temp = in.nextLine();
			if(temp.length()==0) { break; }
			map.add(new Point(Integer.parseInt(temp.substring(0, temp.indexOf(','))), Integer.parseInt(temp.substring(temp.indexOf(',')+1))));
		}
		while(in.hasNextLine()) { instructions.add(in.nextLine()); }
		in.close();
		for(String todo : instructions) {
			String task = todo.split(" ")[2];
			int axis = Integer.parseInt(task.substring(task.indexOf('=')+1));
			int xx = 0, yx = 0;
			if(task.charAt(0)=='x') {
				Set<Point> temp = new HashSet<>();
				for(Point p : map) { temp.add(new Point(p.x<=axis?2*axis-p.x:p.x, p.y)); }
				map.clear();
				axis+=1;
				for(Point p : temp) { map.add(new Point(p.x-axis, p.y)); if(p.x-axis>xx) { xx=p.x-axis; } if(p.y>yx) { yx=p.y; } }
			} else {
				Set<Point> temp = new HashSet<>();
				for(Point p : map) { temp.add(new Point(p.x, p.y<=axis?2*axis-p.y:p.y)); }
				map.clear();
				axis+=1;
				for(Point p : temp) { map.add(new Point(p.x, p.y-axis)); if(p.x>xx) { xx=p.x; } if(p.y-axis>yx) { yx=p.y-axis; } }	
			}
			for(int y = yx; y >= 0; y--) {
				StringBuilder s = new StringBuilder();
				for(int x = xx; x >= 0; x--) { s.append(map.contains(new Point(x, y))?"#":"."); }
				System.out.println(s);
			}
			System.out.println("");
			for(int i = 0; i < xx; i++) { System.out.print("-"); }
			System.out.println("");
			System.out.println("");
		}
	}
	static final String test = "6,10\r\n" + 
			"0,14\r\n" + 
			"9,10\r\n" + 
			"0,3\r\n" + 
			"10,4\r\n" + 
			"4,11\r\n" + 
			"6,0\r\n" + 
			"6,12\r\n" + 
			"4,1\r\n" + 
			"0,13\r\n" + 
			"10,12\r\n" + 
			"3,4\r\n" + 
			"3,0\r\n" + 
			"8,4\r\n" + 
			"1,10\r\n" + 
			"2,14\r\n" + 
			"8,10\r\n" + 
			"9,0\r\n" + 
			"\r\n" + 
			"fold along y=7\r\n" + 
			"fold along x=5";
	static final String input = "43,593\r\n" + 
			"1139,385\r\n" + 
			"1178,51\r\n" + 
			"216,679\r\n" + 
			"743,185\r\n" + 
			"1241,250\r\n" + 
			"197,60\r\n" + 
			"479,700\r\n" + 
			"565,845\r\n" + 
			"1022,330\r\n" + 
			"744,714\r\n" + 
			"440,535\r\n" + 
			"137,81\r\n" + 
			"35,766\r\n" + 
			"482,249\r\n" + 
			"1120,280\r\n" + 
			"484,98\r\n" + 
			"301,823\r\n" + 
			"928,616\r\n" + 
			"601,7\r\n" + 
			"60,835\r\n" + 
			"1092,371\r\n" + 
			"1033,584\r\n" + 
			"1079,833\r\n" + 
			"44,665\r\n" + 
			"469,777\r\n" + 
			"915,526\r\n" + 
			"759,290\r\n" + 
			"843,891\r\n" + 
			"1225,464\r\n" + 
			"326,831\r\n" + 
			"723,333\r\n" + 
			"1099,362\r\n" + 
			"962,285\r\n" + 
			"1069,474\r\n" + 
			"315,731\r\n" + 
			"716,506\r\n" + 
			"741,430\r\n" + 
			"1228,320\r\n" + 
			"1099,878\r\n" + 
			"485,522\r\n" + 
			"328,333\r\n" + 
			"1289,432\r\n" + 
			"1173,506\r\n" + 
			"395,526\r\n" + 
			"47,625\r\n" + 
			"1155,273\r\n" + 
			"114,856\r\n" + 
			"914,826\r\n" + 
			"1263,849\r\n" + 
			"1294,693\r\n" + 
			"607,289\r\n" + 
			"1225,138\r\n" + 
			"25,519\r\n" + 
			"1051,564\r\n" + 
			"738,747\r\n" + 
			"67,493\r\n" + 
			"1178,619\r\n" + 
			"984,828\r\n" + 
			"21,100\r\n" + 
			"1086,241\r\n" + 
			"644,563\r\n" + 
			"164,287\r\n" + 
			"738,131\r\n" + 
			"1116,312\r\n" + 
			"21,796\r\n" + 
			"423,66\r\n" + 
			"395,816\r\n" + 
			"846,614\r\n" + 
			"823,63\r\n" + 
			"249,542\r\n" + 
			"858,162\r\n" + 
			"1273,448\r\n" + 
			"684,623\r\n" + 
			"139,443\r\n" + 
			"184,388\r\n" + 
			"977,71\r\n" + 
			"499,621\r\n" + 
			"810,133\r\n" + 
			"1169,346\r\n" + 
			"249,791\r\n" + 
			"47,772\r\n" + 
			"1170,128\r\n" + 
			"530,162\r\n" + 
			"594,387\r\n" + 
			"972,752\r\n" + 
			"1309,752\r\n" + 
			"26,707\r\n" + 
			"211,362\r\n" + 
			"821,640\r\n" + 
			"502,722\r\n" + 
			"872,63\r\n" + 
			"93,82\r\n" + 
			"895,709\r\n" + 
			"1113,445\r\n" + 
			"567,338\r\n" + 
			"592,448\r\n" + 
			"567,556\r\n" + 
			"552,277\r\n" + 
			"815,735\r\n" + 
			"10,470\r\n" + 
			"400,120\r\n" + 
			"807,835\r\n" + 
			"1289,602\r\n" + 
			"470,442\r\n" + 
			"167,562\r\n" + 
			"1094,735\r\n" + 
			"848,467\r\n" + 
			"1275,568\r\n" + 
			"1009,868\r\n" + 
			"264,829\r\n" + 
			"907,95\r\n" + 
			"894,714\r\n" + 
			"807,59\r\n" + 
			"768,199\r\n" + 
			"470,218\r\n" + 
			"141,346\r\n" + 
			"644,22\r\n" + 
			"85,430\r\n" + 
			"693,670\r\n" + 
			"489,640\r\n" + 
			"748,555\r\n" + 
			"535,560\r\n" + 
			"1056,597\r\n" + 
			"617,266\r\n" + 
			"445,149\r\n" + 
			"751,269\r\n" + 
			"535,782\r\n" + 
			"1046,494\r\n" + 
			"372,677\r\n" + 
			"62,848\r\n" + 
			"1111,291\r\n" + 
			"1048,313\r\n" + 
			"1069,868\r\n" + 
			"480,387\r\n" + 
			"487,640\r\n" + 
			"1151,463\r\n" + 
			"725,194\r\n" + 
			"1031,528\r\n" + 
			"139,675\r\n" + 
			"994,304\r\n" + 
			"223,604\r\n" + 
			"823,679\r\n" + 
			"383,793\r\n" + 
			"313,189\r\n" + 
			"463,357\r\n" + 
			"952,275\r\n" + 
			"38,477\r\n" + 
			"127,155\r\n" + 
			"1156,245\r\n" + 
			"1277,371\r\n" + 
			"572,315\r\n" + 
			"279,810\r\n" + 
			"908,322\r\n" + 
			"436,397\r\n" + 
			"594,835\r\n" + 
			"1031,93\r\n" + 
			"1173,813\r\n" + 
			"733,327\r\n" + 
			"982,828\r\n" + 
			"495,640\r\n" + 
			"703,737\r\n" + 
			"1017,299\r\n" + 
			"390,0\r\n" + 
			"99,327\r\n" + 
			"1084,458\r\n" + 
			"202,732\r\n" + 
			"551,604\r\n" + 
			"259,816\r\n" + 
			"85,464\r\n" + 
			"1083,525\r\n" + 
			"301,26\r\n" + 
			"822,352\r\n" + 
			"703,157\r\n" + 
			"539,434\r\n" + 
			"550,194\r\n" + 
			"868,710\r\n" + 
			"197,893\r\n" + 
			"758,586\r\n" + 
			"736,176\r\n" + 
			"633,889\r\n" + 
			"115,460\r\n" + 
			"256,80\r\n" + 
			"651,672\r\n" + 
			"1064,409\r\n" + 
			"872,7\r\n" + 
			"669,745\r\n" + 
			"231,604\r\n" + 
			"88,628\r\n" + 
			"759,604\r\n" + 
			"1287,694\r\n" + 
			"171,826\r\n" + 
			"1222,852\r\n" + 
			"1250,836\r\n" + 
			"1092,54\r\n" + 
			"85,196\r\n" + 
			"388,205\r\n" + 
			"907,543\r\n" + 
			"326,561\r\n" + 
			"264,381\r\n" + 
			"775,560\r\n" + 
			"1069,71\r\n" + 
			"60,836\r\n" + 
			"277,584\r\n" + 
			"375,801\r\n" + 
			"117,813\r\n" + 
			"1181,673\r\n" + 
			"1150,128\r\n" + 
			"54,278\r\n" + 
			"718,446\r\n" + 
			"577,327\r\n" + 
			"1004,733\r\n" + 
			"1084,794\r\n" + 
			"909,497\r\n" + 
			"975,807\r\n" + 
			"561,171\r\n" + 
			"244,819\r\n" + 
			"505,441\r\n" + 
			"393,64\r\n" + 
			"502,172\r\n" + 
			"517,872\r\n" + 
			"268,28\r\n" + 
			"1113,210\r\n" + 
			"141,490\r\n" + 
			"185,826\r\n" + 
			"301,250\r\n" + 
			"354,654\r\n" + 
			"234,471\r\n" + 
			"403,95\r\n" + 
			"438,887\r\n" + 
			"693,166\r\n" + 
			"189,709\r\n" + 
			"1243,493\r\n" + 
			"87,543\r\n" + 
			"1086,777\r\n" + 
			"338,752\r\n" + 
			"49,584\r\n" + 
			"574,148\r\n" + 
			"1039,607\r\n" + 
			"1051,116\r\n" + 
			"569,375\r\n" + 
			"254,326\r\n" + 
			"554,212\r\n" + 
			"1255,271\r\n" + 
			"1042,866\r\n" + 
			"30,119\r\n" + 
			"218,632\r\n" + 
			"674,372\r\n" + 
			"10,582\r\n" + 
			"596,194\r\n" + 
			"194,582\r\n" + 
			"880,450\r\n" + 
			"587,828\r\n" + 
			"723,666\r\n" + 
			"109,290\r\n" + 
			"85,711\r\n" + 
			"915,116\r\n" + 
			"259,564\r\n" + 
			"259,609\r\n" + 
			"189,721\r\n" + 
			"383,607\r\n" + 
			"666,22\r\n" + 
			"326,828\r\n" + 
			"164,152\r\n" + 
			"709,362\r\n" + 
			"755,145\r\n" + 
			"108,483\r\n" + 
			"657,640\r\n" + 
			"716,507\r\n" + 
			"1,752\r\n" + 
			"1272,788\r\n" + 
			"664,46\r\n" + 
			"316,470\r\n" + 
			"882,458\r\n" + 
			"693,266\r\n" + 
			"1089,326\r\n" + 
			"1121,519\r\n" + 
			"1120,483\r\n" + 
			"499,68\r\n" + 
			"547,719\r\n" + 
			"1066,355\r\n" + 
			"1014,757\r\n" + 
			"971,163\r\n" + 
			"868,856\r\n" + 
			"161,702\r\n" + 
			"75,2\r\n" + 
			"566,516\r\n" + 
			"1178,760\r\n" + 
			"266,651\r\n" + 
			"1099,464\r\n" + 
			"863,201\r\n" + 
			"224,53\r\n" + 
			"1113,1\r\n" + 
			"811,273\r\n" + 
			"177,453\r\n" + 
			"775,245\r\n" + 
			"1297,694\r\n" + 
			"764,408\r\n" + 
			"137,813\r\n" + 
			"716,429\r\n" + 
			"908,469\r\n" + 
			"1225,127\r\n" + 
			"1031,794\r\n" + 
			"428,458\r\n" + 
			"925,305\r\n" + 
			"581,721\r\n" + 
			"306,733\r\n" + 
			"1258,854\r\n" + 
			"241,138\r\n" + 
			"1181,834\r\n" + 
			"987,3\r\n" + 
			"796,94\r\n" + 
			"218,497\r\n" + 
			"100,682\r\n" + 
			"1180,122\r\n" + 
			"184,218\r\n" + 
			"1218,23\r\n" + 
			"569,16\r\n" + 
			"1250,725\r\n" + 
			"1202,49\r\n" + 
			"736,829\r\n" + 
			"1059,674\r\n" + 
			"684,735\r\n" + 
			"428,346\r\n" + 
			"1195,434\r\n" + 
			"1064,485\r\n" + 
			"430,450\r\n" + 
			"224,761\r\n" + 
			"749,364\r\n" + 
			"711,549\r\n" + 
			"276,7\r\n" + 
			"403,367\r\n" + 
			"855,291\r\n" + 
			"375,541\r\n" + 
			"85,586\r\n" + 
			"353,644\r\n" + 
			"467,667\r\n" + 
			"50,617\r\n" + 
			"1225,308\r\n" + 
			"751,161\r\n" + 
			"751,340\r\n" + 
			"703,289\r\n" + 
			"422,457\r\n" + 
			"442,710\r\n" + 
			"85,127\r\n" + 
			"1307,670\r\n" + 
			"1079,526\r\n" + 
			"639,820\r\n" + 
			"1217,171\r\n" + 
			"378,613\r\n" + 
			"952,585\r\n" + 
			"731,450\r\n" + 
			"402,693\r\n" + 
			"847,357\r\n" + 
			"195,696\r\n" + 
			"25,362\r\n" + 
			"1274,460\r\n" + 
			"160,766\r\n" + 
			"231,302\r\n" + 
			"1084,548\r\n" + 
			"927,773\r\n" + 
			"1280,438\r\n" + 
			"487,679\r\n" + 
			"261,88\r\n" + 
			"1054,80\r\n" + 
			"129,221\r\n" + 
			"1171,107\r\n" + 
			"1195,12\r\n" + 
			"920,0\r\n" + 
			"851,248\r\n" + 
			"828,649\r\n" + 
			"1307,137\r\n" + 
			"710,168\r\n" + 
			"50,56\r\n" + 
			"555,749\r\n" + 
			"345,712\r\n" + 
			"266,329\r\n" + 
			"830,611\r\n" + 
			"296,760\r\n" + 
			"633,432\r\n" + 
			"232,457\r\n" + 
			"184,429\r\n" + 
			"611,749\r\n" + 
			"37,224\r\n" + 
			"402,469\r\n" + 
			"666,779\r\n" + 
			"1217,364\r\n" + 
			"423,340\r\n" + 
			"296,7\r\n" + 
			"443,878\r\n" + 
			"378,10\r\n" + 
			"1139,509\r\n" + 
			"1228,635\r\n" + 
			"629,698\r\n" + 
			"539,205\r\n" + 
			"910,297\r\n" + 
			"500,133\r\n" + 
			"684,271\r\n" + 
			"703,605\r\n" + 
			"21,453\r\n" + 
			"1110,476\r\n" + 
			"841,68\r\n" + 
			"351,648\r\n" + 
			"1252,780\r\n" + 
			"234,646\r\n" + 
			"780,641\r\n" + 
			"308,715\r\n" + 
			"416,180\r\n" + 
			"957,250\r\n" + 
			"935,532\r\n" + 
			"761,863\r\n" + 
			"401,397\r\n" + 
			"1252,642\r\n" + 
			"827,826\r\n" + 
			"874,262\r\n" + 
			"244,406\r\n" + 
			"572,579\r\n" + 
			"338,53\r\n" + 
			"58,642\r\n" + 
			"1307,56\r\n" + 
			"771,84\r\n" + 
			"465,501\r\n" + 
			"1151,675\r\n" + 
			"1151,735\r\n" + 
			"981,752\r\n" + 
			"1222,714\r\n" + 
			"218,845\r\n" + 
			"1088,707\r\n" + 
			"249,775\r\n" + 
			"54,341\r\n" + 
			"423,246\r\n" + 
			"1161,246\r\n" + 
			"1181,508\r\n" + 
			"644,116\r\n" + 
			"58,114\r\n" + 
			"160,128\r\n" + 
			"843,667\r\n" + 
			"872,831\r\n" + 
			"202,477\r\n" + 
			"909,397\r\n" + 
			"1292,522\r\n" + 
			"33,371\r\n" + 
			"669,200\r\n" + 
			"1265,409\r\n" + 
			"529,672\r\n" + 
			"395,337\r\n" + 
			"512,282\r\n" + 
			"331,786\r\n" + 
			"1048,581\r\n" + 
			"1161,453\r\n" + 
			"261,64\r\n" + 
			"587,333\r\n" + 
			"443,654\r\n" + 
			"703,177\r\n" + 
			"1156,645\r\n" + 
			"1289,100\r\n" + 
			"692,434\r\n" + 
			"141,565\r\n" + 
			"517,282\r\n" + 
			"436,840\r\n" + 
			"679,648\r\n" + 
			"825,372\r\n" + 
			"174,75\r\n" + 
			"249,352\r\n" + 
			"438,7\r\n" + 
			"3,670\r\n" + 
			"169,522\r\n" + 
			"331,108\r\n" + 
			"766,231\r\n" + 
			"1014,585\r\n" + 
			"1133,453\r\n" + 
			"965,40\r\n" + 
			"887,246\r\n" + 
			"1289,292\r\n" + 
			"716,835\r\n" + 
			"421,619\r\n" + 
			"1263,772\r\n" + 
			"226,794\r\n" + 
			"500,649\r\n" + 
			"962,609\r\n" + 
			"1079,66\r\n" + 
			"731,255\r\n" + 
			"1156,494\r\n" + 
			"677,100\r\n" + 
			"175,700\r\n" + 
			"423,648\r\n" + 
			"10,115\r\n" + 
			"1014,887\r\n" + 
			"577,343\r\n" + 
			"218,859\r\n" + 
			"60,59\r\n" + 
			"760,114\r\n" + 
			"93,364\r\n" + 
			"607,177\r\n" + 
			"224,241\r\n" + 
			"800,746\r\n" + 
			"1126,218\r\n" + 
			"617,670\r\n" + 
			"1210,100\r\n" + 
			"358,119\r\n" + 
			"159,159\r\n" + 
			"932,247\r\n" + 
			"1201,290\r\n" + 
			"115,834\r\n" + 
			"10,779\r\n" + 
			"1274,12\r\n" + 
			"1250,506\r\n" + 
			"259,285\r\n" + 
			"428,436\r\n" + 
			"565,497\r\n" + 
			"333,708\r\n" + 
			"979,672\r\n" + 
			"587,66\r\n" + 
			"1221,815\r\n" + 
			"289,448\r\n" + 
			"1290,733\r\n" + 
			"130,772\r\n" + 
			"503,835\r\n" + 
			"1300,331\r\n" + 
			"792,56\r\n" + 
			"604,455\r\n" + 
			"259,330\r\n" + 
			"749,723\r\n" + 
			"191,761\r\n" + 
			"1094,511\r\n" + 
			"189,185\r\n" + 
			"1043,154\r\n" + 
			"474,469\r\n" + 
			"793,612\r\n" + 
			"246,298\r\n" + 
			"383,569\r\n" + 
			"276,199\r\n" + 
			"537,37\r\n" + 
			"467,227\r\n" + 
			"795,219\r\n" + 
			"1273,180\r\n" + 
			"1091,793\r\n" + 
			"907,479\r\n" + 
			"1280,775\r\n" + 
			"917,830\r\n" + 
			"495,431\r\n" + 
			"868,184\r\n" + 
			"1235,450\r\n" + 
			"1309,142\r\n" + 
			"157,820\r\n" + 
			"402,322\r\n" + 
			"3,137\r\n" + 
			"470,429\r\n" + 
			"167,780\r\n" + 
			"1195,882\r\n" + 
			"1069,250\r\n" + 
			"775,782\r\n" + 
			"1256,616\r\n" + 
			"428,100\r\n" + 
			"333,71\r\n" + 
			"663,845\r\n" + 
			"797,100\r\n" + 
			"604,838\r\n" + 
			"390,381\r\n" + 
			"738,579\r\n" + 
			"174,584\r\n" + 
			"88,42\r\n" + 
			"768,23\r\n" + 
			"1222,266\r\n" + 
			"1169,789\r\n" + 
			"887,648\r\n" + 
			"681,196\r\n" + 
			"325,388\r\n" + 
			"238,378\r\n" + 
			"316,106\r\n" + 
			"43,693\r\n" + 
			"551,154\r\n" + 
			"984,63\r\n" + 
			"1260,617\r\n" + 
			"430,138\r\n" + 
			"671,820\r\n" + 
			"918,357\r\n" + 
			"1094,383\r\n" + 
			"1069,756\r\n" + 
			"75,639\r\n" + 
			"599,246\r\n" + 
			"856,476\r\n" + 
			"117,81\r\n" + 
			"546,75\r\n" + 
			"1292,346\r\n" + 
			"1059,220\r\n" + 
			"8,400\r\n" + 
			"1225,644\r\n" + 
			"279,93\r\n" + 
			"979,338\r\n" + 
			"626,719\r\n" + 
			"1203,623\r\n" + 
			"594,220\r\n" + 
			"1248,848\r\n" + 
			"325,864\r\n" + 
			"995,163\r\n" + 
			"874,840\r\n" + 
			"1049,88\r\n" + 
			"954,175\r\n" + 
			"282,217\r\n" + 
			"132,51\r\n" + 
			"269,358\r\n" + 
			"1180,72\r\n" + 
			"10,563\r\n" + 
			"821,254\r\n" + 
			"872,511\r\n" + 
			"137,282\r\n" + 
			"820,717\r\n" + 
			"296,134\r\n" + 
			"1078,457\r\n" + 
			"634,733\r\n" + 
			"21,546\r\n" + 
			"1121,424\r\n" + 
			"26,614\r\n" + 
			"599,648\r\n" + 
			"1133,441\r\n" + 
			"110,131\r\n" + 
			"604,199\r\n" + 
			"1094,215\r\n" + 
			"565,602\r\n" + 
			"490,717\r\n" + 
			"748,198\r\n" + 
			"132,843\r\n" + 
			"279,528\r\n" + 
			"874,54\r\n" + 
			"257,17\r\n" + 
			"254,597\r\n" + 
			"666,312\r\n" + 
			"552,418\r\n" + 
			"518,56\r\n" + 
			"1223,351\r\n" + 
			"273,532\r\n" + 
			"1302,400\r\n" + 
			"858,865\r\n" + 
			"1001,854\r\n" + 
			"483,826\r\n" + 
			"82,717\r\n" + 
			"1181,221\r\n" + 
			"792,35\r\n" + 
			"592,446\r\n" + 
			"1130,469\r\n" + 
			"741,308\r\n" + 
			"649,260\r\n" + 
			"552,308\r\n" + 
			"100,100\r\n" + 
			"706,838\r\n" + 
			"211,464\r\n" + 
			"1051,816\r\n" + 
			"60,58\r\n" + 
			"234,198\r\n" + 
			"880,756\r\n" + 
			"927,325\r\n" + 
			"115,434\r\n" + 
			"487,791\r\n" + 
			"971,507\r\n" + 
			"1136,584\r\n" + 
			"736,746\r\n" + 
			"341,109\r\n" + 
			"845,424\r\n" + 
			"1069,519\r\n" + 
			"985,416\r\n" + 
			"599,394\r\n" + 
			"845,173\r\n" + 
			"708,406\r\n" + 
			"915,330\r\n" + 
			"1151,159\r\n" + 
			"393,382\r\n" + 
			"1052,826\r\n" + 
			"279,308\r\n" + 
			"633,348\r\n" + 
			"1042,28\r\n" + 
			"952,619\r\n" + 
			"36,882\r\n" + 
			"306,218\r\n" + 
			"565,815\r\n" + 
			"308,179\r\n" + 
			"1235,703\r\n" + 
			"241,519\r\n" + 
			"624,887\r\n" + 
			"306,161\r\n" + 
			"1248,46\r\n" + 
			"907,220\r\n" + 
			"47,810\r\n" + 
			"917,64\r\n" + 
			"895,556\r\n" + 
			"489,254\r\n" + 
			"132,275\r\n" + 
			"530,641\r\n" + 
			"887,340\r\n" + 
			"1149,192\r\n" + 
			"100,222\r\n" + 
			"656,635\r\n" + 
			"515,443\r\n" + 
			"47,177\r\n" + 
			"216,831\r\n" + 
			"910,597\r\n" + 
			"594,28\r\n" + 
			"1004,161\r\n" + 
			"691,128\r\n" + 
			"555,567\r\n" + 
			"815,667\r\n" + 
			"947,570\r\n" + 
			"50,166\r\n" + 
			"703,625\r\n" + 
			"882,100\r\n" + 
			"1066,406\r\n" + 
			"629,196\r\n" + 
			"1307,222\r\n" + 
			"542,23\r\n" + 
			"1284,614\r\n" + 
			"681,532\r\n" + 
			"744,516\r\n" + 
			"1178,582\r\n" + 
			"729,721\r\n" + 
			"979,891\r\n" + 
			"987,168\r\n" + 
			"1123,3\r\n" + 
			"438,35\r\n" + 
			"1143,562\r\n" + 
			"1136,620\r\n" + 
			"518,635\r\n" + 
			"867,878\r\n" + 
			"1056,326\r\n" + 
			"1222,42\r\n" + 
			"1223,543\r\n" + 
			"684,719\r\n" + 
			"301,644\r\n" + 
			"1141,522\r\n" + 
			"975,87\r\n" + 
			"288,564\r\n" + 
			"231,66\r\n" + 
			"517,43\r\n" + 
			"1146,152\r\n" + 
			"1034,393\r\n" + 
			"117,37\r\n" + 
			"585,250\r\n" + 
			"218,840\r\n" + 
			"751,609\r\n" + 
			"706,473\r\n" + 
			"686,327\r\n" + 
			"99,637\r\n" + 
			"1310,738\r\n" + 
			"361,660\r\n" + 
			"853,834\r\n" + 
			"1146,287\r\n" + 
			"1031,756\r\n" + 
			"189,173\r\n" + 
			"760,259\r\n" + 
			"470,836\r\n" + 
			"495,735\r\n" + 
			"995,387\r\n" + 
			"53,7\r\n" + 
			"897,644\r\n" + 
			"1169,565\r\n" + 
			"915,609\r\n" + 
			"241,71\r\n" + 
			"922,243\r\n" + 
			"3,56\r\n" + 
			"644,115\r\n" + 
			"756,212\r\n" + 
			"841,117\r\n" + 
			"1071,108\r\n" + 
			"927,121\r\n" + 
			"758,418\r\n" + 
			"1061,119\r\n" + 
			"577,256\r\n" + 
			"607,756\r\n" + 
			"913,877\r\n" + 
			"413,263\r\n" + 
			"1284,240\r\n" + 
			"440,507\r\n" + 
			"378,647\r\n" + 
			"331,215\r\n" + 
			"743,338\r\n" + 
			"132,619\r\n" + 
			"887,514\r\n" + 
			"18,148\r\n" + 
			"353,810\r\n" + 
			"805,246\r\n" + 
			"1077,619\r\n" + 
			"1284,707\r\n" + 
			"773,81\r\n" + 
			"279,756\r\n" + 
			"1051,778\r\n" + 
			"1086,620\r\n" + 
			"36,12\r\n" + 
			"452,865\r\n" + 
			"512,612\r\n" + 
			"87,351\r\n" + 
			"865,633\r\n" + 
			"761,568\r\n" + 
			"600,553\r\n" + 
			"1161,694\r\n" + 
			"433,886\r\n" + 
			"810,693\r\n" + 
			"1072,516\r\n" + 
			"971,731\r\n" + 
			"915,816\r\n" + 
			"82,635\r\n" + 
			"1158,143\r\n" + 
			"438,63\r\n" + 
			"1235,655\r\n" + 
			"1300,470\r\n" + 
			"1228,574\r\n" + 
			"390,894\r\n" + 
			"331,891\r\n" + 
			"1051,557\r\n" + 
			"1126,465\r\n" + 
			"136,56\r\n" + 
			"677,5\r\n" + 
			"62,46\r\n" + 
			"189,823\r\n" + 
			"189,424\r\n" + 
			"502,303\r\n" + 
			"216,859\r\n" + 
			"1014,134\r\n" + 
			"607,737\r\n" + 
			"69,17\r\n" + 
			"915,557\r\n" + 
			"107,719\r\n" + 
			"1171,675\r\n" + 
			"569,308\r\n" + 
			"304,707\r\n" + 
			"539,834\r\n" + 
			"510,298\r\n" + 
			"405,352\r\n" + 
			"1125,826\r\n" + 
			"544,231\r\n" + 
			"1019,772\r\n" + 
			"574,381\r\n" + 
			"88,714\r\n" + 
			"1169,548\r\n" + 
			"830,283\r\n" + 
			"231,609\r\n" + 
			"249,750\r\n" + 
			"874,397\r\n" + 
			"601,362\r\n" + 
			"599,500\r\n" + 
			"154,245\r\n" + 
			"\r\n" + 
			"fold along x=655\r\n" + 
			"fold along y=447\r\n" + 
			"fold along x=327\r\n" + 
			"fold along y=223\r\n" + 
			"fold along x=163\r\n" + 
			"fold along y=111\r\n" + 
			"fold along x=81\r\n" + 
			"fold along y=55\r\n" + 
			"fold along x=40\r\n" + 
			"fold along y=27\r\n" + 
			"fold along y=13\r\n" + 
			"fold along y=6";
}
