package main2021;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		Scanner in = new Scanner("162\r\n" + 
				"164\r\n" + 
				"165\r\n" + 
				"166\r\n" + 
				"175\r\n" + 
				"185\r\n" + 
				"182\r\n" + 
				"191\r\n" + 
				"205\r\n" + 
				"204\r\n" + 
				"198\r\n" + 
				"196\r\n" + 
				"197\r\n" + 
				"213\r\n" + 
				"216\r\n" + 
				"217\r\n" + 
				"218\r\n" + 
				"219\r\n" + 
				"213\r\n" + 
				"219\r\n" + 
				"221\r\n" + 
				"222\r\n" + 
				"227\r\n" + 
				"231\r\n" + 
				"221\r\n" + 
				"211\r\n" + 
				"230\r\n" + 
				"232\r\n" + 
				"241\r\n" + 
				"243\r\n" + 
				"256\r\n" + 
				"272\r\n" + 
				"274\r\n" + 
				"273\r\n" + 
				"279\r\n" + 
				"287\r\n" + 
				"288\r\n" + 
				"287\r\n" + 
				"286\r\n" + 
				"288\r\n" + 
				"289\r\n" + 
				"291\r\n" + 
				"292\r\n" + 
				"294\r\n" + 
				"292\r\n" + 
				"296\r\n" + 
				"307\r\n" + 
				"314\r\n" + 
				"326\r\n" + 
				"332\r\n" + 
				"337\r\n" + 
				"347\r\n" + 
				"330\r\n" + 
				"333\r\n" + 
				"346\r\n" + 
				"344\r\n" + 
				"357\r\n" + 
				"362\r\n" + 
				"365\r\n" + 
				"366\r\n" + 
				"328\r\n" + 
				"323\r\n" + 
				"350\r\n" + 
				"362\r\n" + 
				"336\r\n" + 
				"346\r\n" + 
				"348\r\n" + 
				"325\r\n" + 
				"329\r\n" + 
				"330\r\n" + 
				"329\r\n" + 
				"333\r\n" + 
				"365\r\n" + 
				"363\r\n" + 
				"376\r\n" + 
				"377\r\n" + 
				"369\r\n" + 
				"343\r\n" + 
				"365\r\n" + 
				"360\r\n" + 
				"362\r\n" + 
				"377\r\n" + 
				"376\r\n" + 
				"379\r\n" + 
				"374\r\n" + 
				"376\r\n" + 
				"377\r\n" + 
				"369\r\n" + 
				"371\r\n" + 
				"374\r\n" + 
				"375\r\n" + 
				"377\r\n" + 
				"384\r\n" + 
				"401\r\n" + 
				"372\r\n" + 
				"374\r\n" + 
				"363\r\n" + 
				"372\r\n" + 
				"363\r\n" + 
				"377\r\n" + 
				"342\r\n" + 
				"340\r\n" + 
				"342\r\n" + 
				"344\r\n" + 
				"345\r\n" + 
				"351\r\n" + 
				"352\r\n" + 
				"353\r\n" + 
				"354\r\n" + 
				"330\r\n" + 
				"332\r\n" + 
				"324\r\n" + 
				"326\r\n" + 
				"335\r\n" + 
				"327\r\n" + 
				"324\r\n" + 
				"316\r\n" + 
				"324\r\n" + 
				"308\r\n" + 
				"311\r\n" + 
				"302\r\n" + 
				"314\r\n" + 
				"328\r\n" + 
				"340\r\n" + 
				"341\r\n" + 
				"338\r\n" + 
				"336\r\n" + 
				"337\r\n" + 
				"335\r\n" + 
				"323\r\n" + 
				"327\r\n" + 
				"321\r\n" + 
				"322\r\n" + 
				"302\r\n" + 
				"315\r\n" + 
				"289\r\n" + 
				"288\r\n" + 
				"287\r\n" + 
				"300\r\n" + 
				"294\r\n" + 
				"298\r\n" + 
				"297\r\n" + 
				"288\r\n" + 
				"289\r\n" + 
				"290\r\n" + 
				"288\r\n" + 
				"287\r\n" + 
				"283\r\n" + 
				"292\r\n" + 
				"306\r\n" + 
				"304\r\n" + 
				"306\r\n" + 
				"326\r\n" + 
				"336\r\n" + 
				"337\r\n" + 
				"340\r\n" + 
				"343\r\n" + 
				"352\r\n" + 
				"374\r\n" + 
				"373\r\n" + 
				"377\r\n" + 
				"357\r\n" + 
				"352\r\n" + 
				"357\r\n" + 
				"360\r\n" + 
				"373\r\n" + 
				"375\r\n" + 
				"377\r\n" + 
				"380\r\n" + 
				"384\r\n" + 
				"407\r\n" + 
				"409\r\n" + 
				"402\r\n" + 
				"405\r\n" + 
				"403\r\n" + 
				"426\r\n" + 
				"429\r\n" + 
				"428\r\n" + 
				"431\r\n" + 
				"399\r\n" + 
				"393\r\n" + 
				"399\r\n" + 
				"401\r\n" + 
				"418\r\n" + 
				"420\r\n" + 
				"421\r\n" + 
				"440\r\n" + 
				"446\r\n" + 
				"447\r\n" + 
				"450\r\n" + 
				"448\r\n" + 
				"463\r\n" + 
				"456\r\n" + 
				"458\r\n" + 
				"421\r\n" + 
				"409\r\n" + 
				"407\r\n" + 
				"394\r\n" + 
				"414\r\n" + 
				"412\r\n" + 
				"417\r\n" + 
				"418\r\n" + 
				"413\r\n" + 
				"414\r\n" + 
				"417\r\n" + 
				"418\r\n" + 
				"427\r\n" + 
				"426\r\n" + 
				"425\r\n" + 
				"426\r\n" + 
				"424\r\n" + 
				"431\r\n" + 
				"450\r\n" + 
				"448\r\n" + 
				"470\r\n" + 
				"484\r\n" + 
				"489\r\n" + 
				"466\r\n" + 
				"477\r\n" + 
				"479\r\n" + 
				"488\r\n" + 
				"489\r\n" + 
				"494\r\n" + 
				"501\r\n" + 
				"502\r\n" + 
				"505\r\n" + 
				"509\r\n" + 
				"514\r\n" + 
				"516\r\n" + 
				"522\r\n" + 
				"533\r\n" + 
				"537\r\n" + 
				"536\r\n" + 
				"546\r\n" + 
				"549\r\n" + 
				"539\r\n" + 
				"522\r\n" + 
				"523\r\n" + 
				"537\r\n" + 
				"536\r\n" + 
				"555\r\n" + 
				"556\r\n" + 
				"554\r\n" + 
				"541\r\n" + 
				"555\r\n" + 
				"557\r\n" + 
				"558\r\n" + 
				"573\r\n" + 
				"574\r\n" + 
				"571\r\n" + 
				"572\r\n" + 
				"573\r\n" + 
				"581\r\n" + 
				"580\r\n" + 
				"572\r\n" + 
				"586\r\n" + 
				"579\r\n" + 
				"581\r\n" + 
				"589\r\n" + 
				"597\r\n" + 
				"593\r\n" + 
				"598\r\n" + 
				"599\r\n" + 
				"600\r\n" + 
				"614\r\n" + 
				"622\r\n" + 
				"623\r\n" + 
				"646\r\n" + 
				"642\r\n" + 
				"652\r\n" + 
				"653\r\n" + 
				"655\r\n" + 
				"657\r\n" + 
				"663\r\n" + 
				"665\r\n" + 
				"667\r\n" + 
				"669\r\n" + 
				"655\r\n" + 
				"642\r\n" + 
				"643\r\n" + 
				"645\r\n" + 
				"660\r\n" + 
				"661\r\n" + 
				"658\r\n" + 
				"656\r\n" + 
				"661\r\n" + 
				"673\r\n" + 
				"672\r\n" + 
				"673\r\n" + 
				"680\r\n" + 
				"690\r\n" + 
				"691\r\n" + 
				"699\r\n" + 
				"698\r\n" + 
				"702\r\n" + 
				"716\r\n" + 
				"757\r\n" + 
				"758\r\n" + 
				"759\r\n" + 
				"778\r\n" + 
				"792\r\n" + 
				"789\r\n" + 
				"790\r\n" + 
				"791\r\n" + 
				"797\r\n" + 
				"806\r\n" + 
				"809\r\n" + 
				"801\r\n" + 
				"800\r\n" + 
				"802\r\n" + 
				"805\r\n" + 
				"814\r\n" + 
				"811\r\n" + 
				"836\r\n" + 
				"827\r\n" + 
				"836\r\n" + 
				"848\r\n" + 
				"855\r\n" + 
				"856\r\n" + 
				"857\r\n" + 
				"859\r\n" + 
				"855\r\n" + 
				"858\r\n" + 
				"864\r\n" + 
				"866\r\n" + 
				"875\r\n" + 
				"877\r\n" + 
				"865\r\n" + 
				"871\r\n" + 
				"879\r\n" + 
				"862\r\n" + 
				"869\r\n" + 
				"872\r\n" + 
				"879\r\n" + 
				"881\r\n" + 
				"883\r\n" + 
				"872\r\n" + 
				"861\r\n" + 
				"869\r\n" + 
				"867\r\n" + 
				"871\r\n" + 
				"888\r\n" + 
				"889\r\n" + 
				"893\r\n" + 
				"894\r\n" + 
				"897\r\n" + 
				"885\r\n" + 
				"891\r\n" + 
				"890\r\n" + 
				"910\r\n" + 
				"907\r\n" + 
				"909\r\n" + 
				"915\r\n" + 
				"940\r\n" + 
				"941\r\n" + 
				"944\r\n" + 
				"947\r\n" + 
				"938\r\n" + 
				"935\r\n" + 
				"927\r\n" + 
				"922\r\n" + 
				"932\r\n" + 
				"933\r\n" + 
				"895\r\n" + 
				"896\r\n" + 
				"897\r\n" + 
				"922\r\n" + 
				"931\r\n" + 
				"927\r\n" + 
				"936\r\n" + 
				"938\r\n" + 
				"962\r\n" + 
				"972\r\n" + 
				"973\r\n" + 
				"1010\r\n" + 
				"1003\r\n" + 
				"1004\r\n" + 
				"1003\r\n" + 
				"1004\r\n" + 
				"1007\r\n" + 
				"1000\r\n" + 
				"1015\r\n" + 
				"1017\r\n" + 
				"1006\r\n" + 
				"1008\r\n" + 
				"1021\r\n" + 
				"1019\r\n" + 
				"1018\r\n" + 
				"1003\r\n" + 
				"1010\r\n" + 
				"1011\r\n" + 
				"1016\r\n" + 
				"1017\r\n" + 
				"1025\r\n" + 
				"1008\r\n" + 
				"1001\r\n" + 
				"1007\r\n" + 
				"1015\r\n" + 
				"1001\r\n" + 
				"1004\r\n" + 
				"1010\r\n" + 
				"993\r\n" + 
				"994\r\n" + 
				"992\r\n" + 
				"994\r\n" + 
				"997\r\n" + 
				"990\r\n" + 
				"991\r\n" + 
				"1018\r\n" + 
				"1033\r\n" + 
				"1047\r\n" + 
				"1038\r\n" + 
				"1037\r\n" + 
				"1043\r\n" + 
				"1047\r\n" + 
				"1056\r\n" + 
				"1042\r\n" + 
				"1048\r\n" + 
				"1059\r\n" + 
				"1063\r\n" + 
				"1045\r\n" + 
				"1053\r\n" + 
				"1051\r\n" + 
				"1071\r\n" + 
				"1060\r\n" + 
				"1069\r\n" + 
				"1074\r\n" + 
				"1076\r\n" + 
				"1082\r\n" + 
				"1085\r\n" + 
				"1081\r\n" + 
				"1084\r\n" + 
				"1089\r\n" + 
				"1091\r\n" + 
				"1079\r\n" + 
				"1101\r\n" + 
				"1100\r\n" + 
				"1109\r\n" + 
				"1108\r\n" + 
				"1109\r\n" + 
				"1100\r\n" + 
				"1098\r\n" + 
				"1100\r\n" + 
				"1098\r\n" + 
				"1099\r\n" + 
				"1095\r\n" + 
				"1097\r\n" + 
				"1119\r\n" + 
				"1115\r\n" + 
				"1116\r\n" + 
				"1117\r\n" + 
				"1121\r\n" + 
				"1126\r\n" + 
				"1167\r\n" + 
				"1168\r\n" + 
				"1178\r\n" + 
				"1180\r\n" + 
				"1169\r\n" + 
				"1170\r\n" + 
				"1168\r\n" + 
				"1169\r\n" + 
				"1176\r\n" + 
				"1178\r\n" + 
				"1167\r\n" + 
				"1169\r\n" + 
				"1163\r\n" + 
				"1184\r\n" + 
				"1174\r\n" + 
				"1175\r\n" + 
				"1202\r\n" + 
				"1206\r\n" + 
				"1212\r\n" + 
				"1213\r\n" + 
				"1222\r\n" + 
				"1233\r\n" + 
				"1234\r\n" + 
				"1216\r\n" + 
				"1218\r\n" + 
				"1219\r\n" + 
				"1223\r\n" + 
				"1222\r\n" + 
				"1205\r\n" + 
				"1208\r\n" + 
				"1206\r\n" + 
				"1207\r\n" + 
				"1208\r\n" + 
				"1209\r\n" + 
				"1222\r\n" + 
				"1223\r\n" + 
				"1219\r\n" + 
				"1220\r\n" + 
				"1223\r\n" + 
				"1228\r\n" + 
				"1260\r\n" + 
				"1275\r\n" + 
				"1278\r\n" + 
				"1263\r\n" + 
				"1281\r\n" + 
				"1293\r\n" + 
				"1292\r\n" + 
				"1307\r\n" + 
				"1299\r\n" + 
				"1297\r\n" + 
				"1298\r\n" + 
				"1295\r\n" + 
				"1297\r\n" + 
				"1299\r\n" + 
				"1300\r\n" + 
				"1301\r\n" + 
				"1299\r\n" + 
				"1313\r\n" + 
				"1314\r\n" + 
				"1319\r\n" + 
				"1316\r\n" + 
				"1294\r\n" + 
				"1299\r\n" + 
				"1315\r\n" + 
				"1316\r\n" + 
				"1327\r\n" + 
				"1331\r\n" + 
				"1332\r\n" + 
				"1333\r\n" + 
				"1342\r\n" + 
				"1340\r\n" + 
				"1327\r\n" + 
				"1332\r\n" + 
				"1335\r\n" + 
				"1333\r\n" + 
				"1353\r\n" + 
				"1357\r\n" + 
				"1347\r\n" + 
				"1350\r\n" + 
				"1351\r\n" + 
				"1352\r\n" + 
				"1353\r\n" + 
				"1360\r\n" + 
				"1361\r\n" + 
				"1372\r\n" + 
				"1373\r\n" + 
				"1389\r\n" + 
				"1404\r\n" + 
				"1409\r\n" + 
				"1403\r\n" + 
				"1407\r\n" + 
				"1412\r\n" + 
				"1409\r\n" + 
				"1413\r\n" + 
				"1414\r\n" + 
				"1416\r\n" + 
				"1422\r\n" + 
				"1426\r\n" + 
				"1418\r\n" + 
				"1436\r\n" + 
				"1441\r\n" + 
				"1437\r\n" + 
				"1431\r\n" + 
				"1407\r\n" + 
				"1437\r\n" + 
				"1430\r\n" + 
				"1447\r\n" + 
				"1453\r\n" + 
				"1456\r\n" + 
				"1475\r\n" + 
				"1484\r\n" + 
				"1486\r\n" + 
				"1507\r\n" + 
				"1498\r\n" + 
				"1500\r\n" + 
				"1496\r\n" + 
				"1513\r\n" + 
				"1499\r\n" + 
				"1505\r\n" + 
				"1506\r\n" + 
				"1500\r\n" + 
				"1502\r\n" + 
				"1504\r\n" + 
				"1506\r\n" + 
				"1513\r\n" + 
				"1514\r\n" + 
				"1516\r\n" + 
				"1508\r\n" + 
				"1514\r\n" + 
				"1518\r\n" + 
				"1514\r\n" + 
				"1510\r\n" + 
				"1501\r\n" + 
				"1495\r\n" + 
				"1512\r\n" + 
				"1513\r\n" + 
				"1510\r\n" + 
				"1513\r\n" + 
				"1521\r\n" + 
				"1520\r\n" + 
				"1527\r\n" + 
				"1536\r\n" + 
				"1525\r\n" + 
				"1534\r\n" + 
				"1535\r\n" + 
				"1512\r\n" + 
				"1514\r\n" + 
				"1520\r\n" + 
				"1521\r\n" + 
				"1525\r\n" + 
				"1526\r\n" + 
				"1527\r\n" + 
				"1546\r\n" + 
				"1550\r\n" + 
				"1560\r\n" + 
				"1564\r\n" + 
				"1572\r\n" + 
				"1570\r\n" + 
				"1576\r\n" + 
				"1584\r\n" + 
				"1586\r\n" + 
				"1588\r\n" + 
				"1592\r\n" + 
				"1588\r\n" + 
				"1602\r\n" + 
				"1592\r\n" + 
				"1615\r\n" + 
				"1589\r\n" + 
				"1592\r\n" + 
				"1594\r\n" + 
				"1591\r\n" + 
				"1595\r\n" + 
				"1601\r\n" + 
				"1613\r\n" + 
				"1618\r\n" + 
				"1623\r\n" + 
				"1630\r\n" + 
				"1631\r\n" + 
				"1645\r\n" + 
				"1602\r\n" + 
				"1606\r\n" + 
				"1608\r\n" + 
				"1609\r\n" + 
				"1610\r\n" + 
				"1604\r\n" + 
				"1606\r\n" + 
				"1605\r\n" + 
				"1621\r\n" + 
				"1630\r\n" + 
				"1635\r\n" + 
				"1646\r\n" + 
				"1648\r\n" + 
				"1646\r\n" + 
				"1648\r\n" + 
				"1657\r\n" + 
				"1687\r\n" + 
				"1676\r\n" + 
				"1679\r\n" + 
				"1680\r\n" + 
				"1683\r\n" + 
				"1681\r\n" + 
				"1682\r\n" + 
				"1681\r\n" + 
				"1682\r\n" + 
				"1680\r\n" + 
				"1679\r\n" + 
				"1680\r\n" + 
				"1682\r\n" + 
				"1695\r\n" + 
				"1704\r\n" + 
				"1711\r\n" + 
				"1714\r\n" + 
				"1720\r\n" + 
				"1746\r\n" + 
				"1750\r\n" + 
				"1748\r\n" + 
				"1753\r\n" + 
				"1754\r\n" + 
				"1763\r\n" + 
				"1765\r\n" + 
				"1783\r\n" + 
				"1792\r\n" + 
				"1793\r\n" + 
				"1798\r\n" + 
				"1801\r\n" + 
				"1800\r\n" + 
				"1803\r\n" + 
				"1784\r\n" + 
				"1785\r\n" + 
				"1784\r\n" + 
				"1787\r\n" + 
				"1790\r\n" + 
				"1784\r\n" + 
				"1788\r\n" + 
				"1783\r\n" + 
				"1785\r\n" + 
				"1787\r\n" + 
				"1794\r\n" + 
				"1795\r\n" + 
				"1798\r\n" + 
				"1799\r\n" + 
				"1803\r\n" + 
				"1805\r\n" + 
				"1806\r\n" + 
				"1786\r\n" + 
				"1787\r\n" + 
				"1816\r\n" + 
				"1812\r\n" + 
				"1813\r\n" + 
				"1816\r\n" + 
				"1818\r\n" + 
				"1812\r\n" + 
				"1838\r\n" + 
				"1837\r\n" + 
				"1839\r\n" + 
				"1832\r\n" + 
				"1834\r\n" + 
				"1838\r\n" + 
				"1840\r\n" + 
				"1855\r\n" + 
				"1856\r\n" + 
				"1842\r\n" + 
				"1841\r\n" + 
				"1850\r\n" + 
				"1852\r\n" + 
				"1851\r\n" + 
				"1853\r\n" + 
				"1859\r\n" + 
				"1853\r\n" + 
				"1881\r\n" + 
				"1882\r\n" + 
				"1886\r\n" + 
				"1899\r\n" + 
				"1897\r\n" + 
				"1910\r\n" + 
				"1906\r\n" + 
				"1907\r\n" + 
				"1906\r\n" + 
				"1901\r\n" + 
				"1896\r\n" + 
				"1897\r\n" + 
				"1883\r\n" + 
				"1889\r\n" + 
				"1890\r\n" + 
				"1896\r\n" + 
				"1877\r\n" + 
				"1888\r\n" + 
				"1889\r\n" + 
				"1895\r\n" + 
				"1896\r\n" + 
				"1893\r\n" + 
				"1858\r\n" + 
				"1855\r\n" + 
				"1863\r\n" + 
				"1871\r\n" + 
				"1878\r\n" + 
				"1879\r\n" + 
				"1877\r\n" + 
				"1878\r\n" + 
				"1874\r\n" + 
				"1906\r\n" + 
				"1921\r\n" + 
				"1927\r\n" + 
				"1924\r\n" + 
				"1925\r\n" + 
				"1929\r\n" + 
				"1928\r\n" + 
				"1933\r\n" + 
				"1923\r\n" + 
				"1926\r\n" + 
				"1904\r\n" + 
				"1892\r\n" + 
				"1889\r\n" + 
				"1906\r\n" + 
				"1908\r\n" + 
				"1909\r\n" + 
				"1924\r\n" + 
				"1926\r\n" + 
				"1948\r\n" + 
				"1949\r\n" + 
				"1951\r\n" + 
				"1991\r\n" + 
				"1990\r\n" + 
				"1996\r\n" + 
				"1997\r\n" + 
				"2009\r\n" + 
				"2007\r\n" + 
				"2006\r\n" + 
				"2012\r\n" + 
				"2029\r\n" + 
				"2036\r\n" + 
				"2039\r\n" + 
				"2040\r\n" + 
				"2049\r\n" + 
				"2051\r\n" + 
				"2052\r\n" + 
				"2065\r\n" + 
				"2063\r\n" + 
				"2065\r\n" + 
				"2064\r\n" + 
				"2065\r\n" + 
				"2067\r\n" + 
				"2072\r\n" + 
				"2069\r\n" + 
				"2051\r\n" + 
				"2049\r\n" + 
				"2046\r\n" + 
				"2045\r\n" + 
				"2047\r\n" + 
				"2039\r\n" + 
				"2037\r\n" + 
				"2041\r\n" + 
				"2044\r\n" + 
				"2043\r\n" + 
				"2033\r\n" + 
				"2034\r\n" + 
				"2024\r\n" + 
				"2026\r\n" + 
				"2023\r\n" + 
				"2013\r\n" + 
				"2014\r\n" + 
				"2015\r\n" + 
				"2017\r\n" + 
				"2019\r\n" + 
				"2018\r\n" + 
				"2019\r\n" + 
				"2018\r\n" + 
				"2020\r\n" + 
				"2021\r\n" + 
				"2024\r\n" + 
				"2029\r\n" + 
				"2017\r\n" + 
				"2048\r\n" + 
				"2049\r\n" + 
				"2027\r\n" + 
				"2028\r\n" + 
				"2023\r\n" + 
				"2040\r\n" + 
				"2033\r\n" + 
				"2037\r\n" + 
				"2056\r\n" + 
				"2096\r\n" + 
				"2097\r\n" + 
				"2093\r\n" + 
				"2110\r\n" + 
				"2111\r\n" + 
				"2110\r\n" + 
				"2120\r\n" + 
				"2122\r\n" + 
				"2106\r\n" + 
				"2122\r\n" + 
				"2124\r\n" + 
				"2118\r\n" + 
				"2120\r\n" + 
				"2128\r\n" + 
				"2127\r\n" + 
				"2134\r\n" + 
				"2135\r\n" + 
				"2149\r\n" + 
				"2151\r\n" + 
				"2178\r\n" + 
				"2179\r\n" + 
				"2180\r\n" + 
				"2179\r\n" + 
				"2188\r\n" + 
				"2198\r\n" + 
				"2196\r\n" + 
				"2204\r\n" + 
				"2214\r\n" + 
				"2222\r\n" + 
				"2223\r\n" + 
				"2222\r\n" + 
				"2221\r\n" + 
				"2247\r\n" + 
				"2249\r\n" + 
				"2257\r\n" + 
				"2267\r\n" + 
				"2266\r\n" + 
				"2265\r\n" + 
				"2268\r\n" + 
				"2261\r\n" + 
				"2266\r\n" + 
				"2268\r\n" + 
				"2269\r\n" + 
				"2275\r\n" + 
				"2274\r\n" + 
				"2275\r\n" + 
				"2289\r\n" + 
				"2283\r\n" + 
				"2284\r\n" + 
				"2276\r\n" + 
				"2278\r\n" + 
				"2274\r\n" + 
				"2275\r\n" + 
				"2279\r\n" + 
				"2280\r\n" + 
				"2264\r\n" + 
				"2260\r\n" + 
				"2270\r\n" + 
				"2274\r\n" + 
				"2282\r\n" + 
				"2273\r\n" + 
				"2274\r\n" + 
				"2270\r\n" + 
				"2269\r\n" + 
				"2268\r\n" + 
				"2274\r\n" + 
				"2280\r\n" + 
				"2300\r\n" + 
				"2301\r\n" + 
				"2303\r\n" + 
				"2301\r\n" + 
				"2306\r\n" + 
				"2316\r\n" + 
				"2337\r\n" + 
				"2349\r\n" + 
				"2363\r\n" + 
				"2373\r\n" + 
				"2377\r\n" + 
				"2381\r\n" + 
				"2380\r\n" + 
				"2402\r\n" + 
				"2408\r\n" + 
				"2407\r\n" + 
				"2406\r\n" + 
				"2404\r\n" + 
				"2405\r\n" + 
				"2409\r\n" + 
				"2411\r\n" + 
				"2421\r\n" + 
				"2420\r\n" + 
				"2419\r\n" + 
				"2422\r\n" + 
				"2415\r\n" + 
				"2418\r\n" + 
				"2426\r\n" + 
				"2396\r\n" + 
				"2399\r\n" + 
				"2398\r\n" + 
				"2411\r\n" + 
				"2413\r\n" + 
				"2414\r\n" + 
				"2393\r\n" + 
				"2400\r\n" + 
				"2393\r\n" + 
				"2389\r\n" + 
				"2400\r\n" + 
				"2404\r\n" + 
				"2405\r\n" + 
				"2408\r\n" + 
				"2405\r\n" + 
				"2409\r\n" + 
				"2411\r\n" + 
				"2423\r\n" + 
				"2427\r\n" + 
				"2428\r\n" + 
				"2429\r\n" + 
				"2418\r\n" + 
				"2419\r\n" + 
				"2426\r\n" + 
				"2428\r\n" + 
				"2443\r\n" + 
				"2451\r\n" + 
				"2464\r\n" + 
				"2465\r\n" + 
				"2483\r\n" + 
				"2476\r\n" + 
				"2479\r\n" + 
				"2480\r\n" + 
				"2481\r\n" + 
				"2482\r\n" + 
				"2476\r\n" + 
				"2464\r\n" + 
				"2506\r\n" + 
				"2499\r\n" + 
				"2500\r\n" + 
				"2490\r\n" + 
				"2486\r\n" + 
				"2480\r\n" + 
				"2481\r\n" + 
				"2482\r\n" + 
				"2507\r\n" + 
				"2515\r\n" + 
				"2519\r\n" + 
				"2526\r\n" + 
				"2516\r\n" + 
				"2523\r\n" + 
				"2530\r\n" + 
				"2536\r\n" + 
				"2537\r\n" + 
				"2538\r\n" + 
				"2555\r\n" + 
				"2564\r\n" + 
				"2553\r\n" + 
				"2565\r\n" + 
				"2548\r\n" + 
				"2537\r\n" + 
				"2538\r\n" + 
				"2533\r\n" + 
				"2537\r\n" + 
				"2550\r\n" + 
				"2553\r\n" + 
				"2541\r\n" + 
				"2543\r\n" + 
				"2546\r\n" + 
				"2550\r\n" + 
				"2554\r\n" + 
				"2555\r\n" + 
				"2573\r\n" + 
				"2578\r\n" + 
				"2575\r\n" + 
				"2595\r\n" + 
				"2601\r\n" + 
				"2600\r\n" + 
				"2582\r\n" + 
				"2583\r\n" + 
				"2585\r\n" + 
				"2579\r\n" + 
				"2581\r\n" + 
				"2582\r\n" + 
				"2590\r\n" + 
				"2588\r\n" + 
				"2589\r\n" + 
				"2595\r\n" + 
				"2584\r\n" + 
				"2585\r\n" + 
				"2584\r\n" + 
				"2592\r\n" + 
				"2602\r\n" + 
				"2607\r\n" + 
				"2611\r\n" + 
				"2627\r\n" + 
				"2636\r\n" + 
				"2646\r\n" + 
				"2643\r\n" + 
				"2648\r\n" + 
				"2654\r\n" + 
				"2648\r\n" + 
				"2649\r\n" + 
				"2654\r\n" + 
				"2652\r\n" + 
				"2653\r\n" + 
				"2656\r\n" + 
				"2657\r\n" + 
				"2658\r\n" + 
				"2687\r\n" + 
				"2699\r\n" + 
				"2702\r\n" + 
				"2679\r\n" + 
				"2681\r\n" + 
				"2684\r\n" + 
				"2683\r\n" + 
				"2681\r\n" + 
				"2683\r\n" + 
				"2684\r\n" + 
				"2701\r\n" + 
				"2709\r\n" + 
				"2711\r\n" + 
				"2715\r\n" + 
				"2716\r\n" + 
				"2725\r\n" + 
				"2715\r\n" + 
				"2719\r\n" + 
				"2720\r\n" + 
				"2716\r\n" + 
				"2717\r\n" + 
				"2704\r\n" + 
				"2707\r\n" + 
				"2705\r\n" + 
				"2695\r\n" + 
				"2697\r\n" + 
				"2696\r\n" + 
				"2699\r\n" + 
				"2697\r\n" + 
				"2698\r\n" + 
				"2718\r\n" + 
				"2722\r\n" + 
				"2726\r\n" + 
				"2727\r\n" + 
				"2728\r\n" + 
				"2724\r\n" + 
				"2722\r\n" + 
				"2731\r\n" + 
				"2732\r\n" + 
				"2728\r\n" + 
				"2725\r\n" + 
				"2722\r\n" + 
				"2728\r\n" + 
				"2735\r\n" + 
				"2729\r\n" + 
				"2731\r\n" + 
				"2733\r\n" + 
				"2739\r\n" + 
				"2734\r\n" + 
				"2757\r\n" + 
				"2763\r\n" + 
				"2765\r\n" + 
				"2772\r\n" + 
				"2771\r\n" + 
				"2772\r\n" + 
				"2768\r\n" + 
				"2765\r\n" + 
				"2759\r\n" + 
				"2772\r\n" + 
				"2775\r\n" + 
				"2767\r\n" + 
				"2771\r\n" + 
				"2774\r\n" + 
				"2770\r\n" + 
				"2758\r\n" + 
				"2772\r\n" + 
				"2775\r\n" + 
				"2789\r\n" + 
				"2791\r\n" + 
				"2793\r\n" + 
				"2800\r\n" + 
				"2780\r\n" + 
				"2791\r\n" + 
				"2777\r\n" + 
				"2778\r\n" + 
				"2774\r\n" + 
				"2779\r\n" + 
				"2780\r\n" + 
				"2779\r\n" + 
				"2780\r\n" + 
				"2781\r\n" + 
				"2783\r\n" + 
				"2788\r\n" + 
				"2796\r\n" + 
				"2800\r\n" + 
				"2799\r\n" + 
				"2807\r\n" + 
				"2811\r\n" + 
				"2825\r\n" + 
				"2826\r\n" + 
				"2831\r\n" + 
				"2842\r\n" + 
				"2843\r\n" + 
				"2852\r\n" + 
				"2854\r\n" + 
				"2858\r\n" + 
				"2841\r\n" + 
				"2842\r\n" + 
				"2837\r\n" + 
				"2838\r\n" + 
				"2839\r\n" + 
				"2843\r\n" + 
				"2861\r\n" + 
				"2888\r\n" + 
				"2892\r\n" + 
				"2886\r\n" + 
				"2885\r\n" + 
				"2904\r\n" + 
				"2905\r\n" + 
				"2927\r\n" + 
				"2928\r\n" + 
				"2929\r\n" + 
				"2915\r\n" + 
				"2917\r\n" + 
				"2895\r\n" + 
				"2901\r\n" + 
				"2923\r\n" + 
				"2932\r\n" + 
				"2934\r\n" + 
				"2936\r\n" + 
				"2938\r\n" + 
				"2944\r\n" + 
				"2947\r\n" + 
				"2951\r\n" + 
				"2959\r\n" + 
				"2958\r\n" + 
				"2956\r\n" + 
				"2944\r\n" + 
				"2942\r\n" + 
				"2941\r\n" + 
				"2942\r\n" + 
				"2929\r\n" + 
				"2946\r\n" + 
				"2954\r\n" + 
				"2948\r\n" + 
				"2949\r\n" + 
				"2973\r\n" + 
				"2980\r\n" + 
				"2981\r\n" + 
				"2994\r\n" + 
				"2997\r\n" + 
				"3021\r\n" + 
				"3038\r\n" + 
				"3047\r\n" + 
				"3060\r\n" + 
				"3058\r\n" + 
				"3061\r\n" + 
				"3057\r\n" + 
				"3073\r\n" + 
				"3074\r\n" + 
				"3094\r\n" + 
				"3126\r\n" + 
				"3125\r\n" + 
				"3126\r\n" + 
				"3122\r\n" + 
				"3123\r\n" + 
				"3122\r\n" + 
				"3120\r\n" + 
				"3115\r\n" + 
				"3114\r\n" + 
				"3113\r\n" + 
				"3117\r\n" + 
				"3122\r\n" + 
				"3121\r\n" + 
				"3123\r\n" + 
				"3133\r\n" + 
				"3134\r\n" + 
				"3138\r\n" + 
				"3152\r\n" + 
				"3153\r\n" + 
				"3155\r\n" + 
				"3154\r\n" + 
				"3159\r\n" + 
				"3156\r\n" + 
				"3153\r\n" + 
				"3159\r\n" + 
				"3160\r\n" + 
				"3161\r\n" + 
				"3157\r\n" + 
				"3158\r\n" + 
				"3160\r\n" + 
				"3161\r\n" + 
				"3170\r\n" + 
				"3202\r\n" + 
				"3204\r\n" + 
				"3225\r\n" + 
				"3211\r\n" + 
				"3207\r\n" + 
				"3209\r\n" + 
				"3211\r\n" + 
				"3206\r\n" + 
				"3207\r\n" + 
				"3214\r\n" + 
				"3213\r\n" + 
				"3206\r\n" + 
				"3199\r\n" + 
				"3198\r\n" + 
				"3208\r\n" + 
				"3225\r\n" + 
				"3226\r\n" + 
				"3227\r\n" + 
				"3238\r\n" + 
				"3208\r\n" + 
				"3209\r\n" + 
				"3210\r\n" + 
				"3211\r\n" + 
				"3214\r\n" + 
				"3209\r\n" + 
				"3210\r\n" + 
				"3233\r\n" + 
				"3232\r\n" + 
				"3233\r\n" + 
				"3234\r\n" + 
				"3237\r\n" + 
				"3240\r\n" + 
				"3246\r\n" + 
				"3252\r\n" + 
				"3239\r\n" + 
				"3246\r\n" + 
				"3248\r\n" + 
				"3246\r\n" + 
				"3248\r\n" + 
				"3250\r\n" + 
				"3258\r\n" + 
				"3259\r\n" + 
				"3260\r\n" + 
				"3271\r\n" + 
				"3272\r\n" + 
				"3280\r\n" + 
				"3288\r\n" + 
				"3279\r\n" + 
				"3272\r\n" + 
				"3274\r\n" + 
				"3280\r\n" + 
				"3288\r\n" + 
				"3292\r\n" + 
				"3313\r\n" + 
				"3307\r\n" + 
				"3302\r\n" + 
				"3303\r\n" + 
				"3304\r\n" + 
				"3302\r\n" + 
				"3304\r\n" + 
				"3307\r\n" + 
				"3320\r\n" + 
				"3306\r\n" + 
				"3303\r\n" + 
				"3304\r\n" + 
				"3303\r\n" + 
				"3292\r\n" + 
				"3293\r\n" + 
				"3282\r\n" + 
				"3285\r\n" + 
				"3286\r\n" + 
				"3281\r\n" + 
				"3276\r\n" + 
				"3283\r\n" + 
				"3246\r\n" + 
				"3247\r\n" + 
				"3254\r\n" + 
				"3268\r\n" + 
				"3267\r\n" + 
				"3274\r\n" + 
				"3276\r\n" + 
				"3288\r\n" + 
				"3289\r\n" + 
				"3288\r\n" + 
				"3275\r\n" + 
				"3274\r\n" + 
				"3276\r\n" + 
				"3271\r\n" + 
				"3273\r\n" + 
				"3271\r\n" + 
				"3270\r\n" + 
				"3265\r\n" + 
				"3271\r\n" + 
				"3266\r\n" + 
				"3258\r\n" + 
				"3259\r\n" + 
				"3256\r\n" + 
				"3255\r\n" + 
				"3250\r\n" + 
				"3261\r\n" + 
				"3265\r\n" + 
				"3263\r\n" + 
				"3264\r\n" + 
				"3265\r\n" + 
				"3279\r\n" + 
				"3280\r\n" + 
				"3285\r\n" + 
				"3301\r\n" + 
				"3304\r\n" + 
				"3291\r\n" + 
				"3283\r\n" + 
				"3300\r\n" + 
				"3301\r\n" + 
				"3295\r\n" + 
				"3298\r\n" + 
				"3297\r\n" + 
				"3296\r\n" + 
				"3291\r\n" + 
				"3294\r\n" + 
				"3297\r\n" + 
				"3301\r\n" + 
				"3298\r\n" + 
				"3299\r\n" + 
				"3265\r\n" + 
				"3266\r\n" + 
				"3270\r\n" + 
				"3265\r\n" + 
				"3282\r\n" + 
				"3289\r\n" + 
				"3288\r\n" + 
				"3290\r\n" + 
				"3289\r\n" + 
				"3291\r\n" + 
				"3293\r\n" + 
				"3295\r\n" + 
				"3296\r\n" + 
				"3297\r\n" + 
				"3269\r\n" + 
				"3280\r\n" + 
				"3281\r\n" + 
				"3282\r\n" + 
				"3291\r\n" + 
				"3306\r\n" + 
				"3304\r\n" + 
				"3305\r\n" + 
				"3306\r\n" + 
				"3329\r\n" + 
				"3327\r\n" + 
				"3331\r\n" + 
				"3332\r\n" + 
				"3334\r\n" + 
				"3338\r\n" + 
				"3318\r\n" + 
				"3315\r\n" + 
				"3323\r\n" + 
				"3324\r\n" + 
				"3325\r\n" + 
				"3327\r\n" + 
				"3328\r\n" + 
				"3326\r\n" + 
				"3329\r\n" + 
				"3342\r\n" + 
				"3343\r\n" + 
				"3344\r\n" + 
				"3345\r\n" + 
				"3346\r\n" + 
				"3345\r\n" + 
				"3321\r\n" + 
				"3320\r\n" + 
				"3318\r\n" + 
				"3315\r\n" + 
				"3318\r\n" + 
				"3344\r\n" + 
				"3349\r\n" + 
				"3354\r\n" + 
				"3353\r\n" + 
				"3351\r\n" + 
				"3362\r\n" + 
				"3379\r\n" + 
				"3395\r\n" + 
				"3421\r\n" + 
				"3423\r\n" + 
				"3411\r\n" + 
				"3406\r\n" + 
				"3403\r\n" + 
				"3407\r\n" + 
				"3408\r\n" + 
				"3406\r\n" + 
				"3408\r\n" + 
				"3413\r\n" + 
				"3407\r\n" + 
				"3423\r\n" + 
				"3435\r\n" + 
				"3437\r\n" + 
				"3438\r\n" + 
				"3441\r\n" + 
				"3452\r\n" + 
				"3453\r\n" + 
				"3452\r\n" + 
				"3453\r\n" + 
				"3457\r\n" + 
				"3463\r\n" + 
				"3456\r\n" + 
				"3439\r\n" + 
				"3437\r\n" + 
				"3441\r\n" + 
				"3439\r\n" + 
				"3442\r\n" + 
				"3443\r\n" + 
				"3445\r\n" + 
				"3452\r\n" + 
				"3459\r\n" + 
				"3474\r\n" + 
				"3466\r\n" + 
				"3456\r\n" + 
				"3480\r\n" + 
				"3479\r\n" + 
				"3481\r\n" + 
				"3497\r\n" + 
				"3500\r\n" + 
				"3494\r\n" + 
				"3496\r\n" + 
				"3502\r\n" + 
				"3486\r\n" + 
				"3489\r\n" + 
				"3496\r\n" + 
				"3505\r\n" + 
				"3526\r\n" + 
				"3543\r\n" + 
				"3549\r\n" + 
				"3550\r\n" + 
				"3552\r\n" + 
				"3555\r\n" + 
				"3559\r\n" + 
				"3558\r\n" + 
				"3566\r\n" + 
				"3568\r\n" + 
				"3567\r\n" + 
				"3568\r\n" + 
				"3569\r\n" + 
				"3555\r\n" + 
				"3576\r\n" + 
				"3567\r\n" + 
				"3566\r\n" + 
				"3563\r\n" + 
				"3590\r\n" + 
				"3597\r\n" + 
				"3622\r\n" + 
				"3623\r\n" + 
				"3610\r\n" + 
				"3611\r\n" + 
				"3615\r\n" + 
				"3616\r\n" + 
				"3620\r\n" + 
				"3653\r\n" + 
				"3662\r\n" + 
				"3649\r\n" + 
				"3661\r\n" + 
				"3664\r\n" + 
				"3656\r\n" + 
				"3672\r\n" + 
				"3680\r\n" + 
				"3681\r\n" + 
				"3687\r\n" + 
				"3693\r\n" + 
				"3692\r\n" + 
				"3706\r\n" + 
				"3686\r\n" + 
				"3685\r\n" + 
				"3675\r\n" + 
				"3669\r\n" + 
				"3672\r\n" + 
				"3673\r\n" + 
				"3667\r\n" + 
				"3674\r\n" + 
				"3677\r\n" + 
				"3663\r\n" + 
				"3685\r\n" + 
				"3681\r\n" + 
				"3682\r\n" + 
				"3695\r\n" + 
				"3688\r\n" + 
				"3702\r\n" + 
				"3708\r\n" + 
				"3709\r\n" + 
				"3708\r\n" + 
				"3711\r\n" + 
				"3707\r\n" + 
				"3729\r\n" + 
				"3730\r\n" + 
				"3748\r\n" + 
				"3775\r\n" + 
				"3779\r\n" + 
				"3780\r\n" + 
				"3784\r\n" + 
				"3797\r\n" + 
				"3803\r\n" + 
				"3822\r\n" + 
				"3843\r\n" + 
				"3860\r\n" + 
				"3888\r\n" + 
				"3875\r\n" + 
				"3866\r\n" + 
				"3869\r\n" + 
				"3878\r\n" + 
				"3877\r\n" + 
				"3886\r\n" + 
				"3888\r\n" + 
				"3889\r\n" + 
				"3894\r\n" + 
				"3905\r\n" + 
				"3919\r\n" + 
				"3921\r\n" + 
				"3922\r\n" + 
				"3964\r\n" + 
				"3965\r\n" + 
				"3967\r\n" + 
				"3960\r\n" + 
				"3978\r\n" + 
				"3977\r\n" + 
				"3983\r\n" + 
				"3989\r\n" + 
				"3997\r\n" + 
				"3999\r\n" + 
				"4010\r\n" + 
				"3998\r\n" + 
				"3999\r\n" + 
				"4013\r\n" + 
				"4025\r\n" + 
				"4033\r\n" + 
				"4050\r\n" + 
				"4051\r\n" + 
				"4053\r\n" + 
				"4052\r\n" + 
				"4050\r\n" + 
				"4051\r\n" + 
				"4052\r\n" + 
				"4053\r\n" + 
				"4069\r\n" + 
				"4071\r\n" + 
				"4079\r\n" + 
				"4082\r\n" + 
				"4083\r\n" + 
				"4085\r\n" + 
				"4081\r\n" + 
				"4076\r\n" + 
				"4090\r\n" + 
				"4091\r\n" + 
				"4098\r\n" + 
				"4105\r\n" + 
				"4121\r\n" + 
				"4119\r\n" + 
				"4124\r\n" + 
				"4130\r\n" + 
				"4132\r\n" + 
				"4131\r\n" + 
				"4130\r\n" + 
				"4094\r\n" + 
				"4106\r\n" + 
				"4105\r\n" + 
				"4100\r\n" + 
				"4098\r\n" + 
				"4092\r\n" + 
				"4091\r\n" + 
				"4093\r\n" + 
				"4091\r\n" + 
				"4101\r\n" + 
				"4102\r\n" + 
				"4104\r\n" + 
				"4105\r\n" + 
				"4100\r\n" + 
				"4111\r\n" + 
				"4133\r\n" + 
				"4134\r\n" + 
				"4140\r\n" + 
				"4136\r\n" + 
				"4121\r\n" + 
				"4120\r\n" + 
				"4139\r\n" + 
				"4140\r\n" + 
				"4141\r\n" + 
				"4140\r\n" + 
				"4144\r\n" + 
				"4152\r\n" + 
				"4133\r\n" + 
				"4136\r\n" + 
				"4148\r\n" + 
				"4149\r\n" + 
				"4148\r\n" + 
				"4166\r\n" + 
				"4171\r\n" + 
				"4162\r\n" + 
				"4179\r\n" + 
				"4175\r\n" + 
				"4185\r\n" + 
				"4186\r\n" + 
				"4201\r\n" + 
				"4218\r\n" + 
				"4226\r\n" + 
				"4224\r\n" + 
				"4214\r\n" + 
				"4212\r\n" + 
				"4187\r\n" + 
				"4191\r\n" + 
				"4194\r\n" + 
				"4193\r\n" + 
				"4196\r\n" + 
				"4199\r\n" + 
				"4195\r\n" + 
				"4196\r\n" + 
				"4178\r\n" + 
				"4177\r\n" + 
				"4180\r\n" + 
				"4172\r\n" + 
				"4173\r\n" + 
				"4166\r\n" + 
				"4172\r\n" + 
				"4175\r\n" + 
				"4180\r\n" + 
				"4185\r\n" + 
				"4186\r\n" + 
				"4189\r\n" + 
				"4190\r\n" + 
				"4191\r\n" + 
				"4193\r\n" + 
				"4195\r\n" + 
				"4209\r\n" + 
				"4218\r\n" + 
				"4221\r\n" + 
				"4223\r\n" + 
				"4215\r\n" + 
				"4182\r\n" + 
				"4181\r\n" + 
				"4194\r\n" + 
				"4202\r\n" + 
				"4203\r\n" + 
				"4204\r\n" + 
				"4208\r\n" + 
				"4210\r\n" + 
				"4218\r\n" + 
				"4217\r\n" + 
				"4216\r\n" + 
				"4224\r\n" + 
				"4238\r\n" + 
				"4239\r\n" + 
				"4246\r\n" + 
				"4249\r\n" + 
				"4250\r\n" + 
				"4222\r\n" + 
				"4219\r\n" + 
				"4246\r\n" + 
				"4261\r\n" + 
				"4263\r\n" + 
				"4272\r\n" + 
				"4277\r\n" + 
				"4276\r\n" + 
				"4277\r\n" + 
				"4279\r\n" + 
				"4292\r\n" + 
				"4281\r\n" + 
				"4282\r\n" + 
				"4261\r\n" + 
				"4268\r\n" + 
				"4264\r\n" + 
				"4265\r\n" + 
				"4272\r\n" + 
				"4277\r\n" + 
				"4278\r\n" + 
				"4281\r\n" + 
				"4282\r\n" + 
				"4304\r\n" + 
				"4296\r\n" + 
				"4288\r\n" + 
				"4305\r\n" + 
				"4306\r\n" + 
				"4304\r\n" + 
				"4306\r\n" + 
				"4307\r\n" + 
				"4310\r\n" + 
				"4290\r\n" + 
				"4280\r\n" + 
				"4281\r\n" + 
				"4282\r\n" + 
				"4283\r\n" + 
				"4299\r\n" + 
				"4298\r\n" + 
				"4299\r\n" + 
				"4300\r\n" + 
				"4284\r\n" + 
				"4292\r\n" + 
				"4303\r\n" + 
				"4306\r\n" + 
				"4304\r\n" + 
				"4288\r\n" + 
				"4291\r\n" + 
				"4288\r\n" + 
				"4285\r\n" + 
				"4297\r\n" + 
				"4296\r\n" + 
				"4297\r\n" + 
				"4298\r\n" + 
				"4291\r\n" + 
				"4275\r\n" + 
				"4269\r\n" + 
				"4270\r\n" + 
				"4269\r\n" + 
				"4268\r\n" + 
				"4285\r\n" + 
				"4287\r\n" + 
				"4288\r\n" + 
				"4287\r\n" + 
				"4288\r\n" + 
				"4289\r\n" + 
				"4280\r\n" + 
				"4279\r\n" + 
				"4286\r\n" + 
				"4289\r\n" + 
				"4285\r\n" + 
				"4286\r\n" + 
				"4287\r\n" + 
				"4297\r\n" + 
				"4294\r\n" + 
				"4319\r\n" + 
				"4306\r\n" + 
				"4333\r\n" + 
				"4338\r\n" + 
				"4339\r\n" + 
				"4332\r\n" + 
				"4337\r\n" + 
				"4338\r\n" + 
				"4325\r\n" + 
				"4320\r\n" + 
				"4318\r\n" + 
				"4308\r\n" + 
				"4317\r\n" + 
				"4337\r\n" + 
				"4336\r\n" + 
				"4338\r\n" + 
				"4340\r\n" + 
				"4343\r\n" + 
				"4324\r\n" + 
				"4325\r\n" + 
				"4326\r\n" + 
				"4323\r\n" + 
				"4322\r\n" + 
				"4327\r\n" + 
				"4329\r\n" + 
				"4333\r\n" + 
				"4341\r\n" + 
				"4347\r\n" + 
				"4372\r\n" + 
				"4375\r\n" + 
				"4378\r\n" + 
				"4371\r\n" + 
				"4374\r\n" + 
				"4373\r\n" + 
				"4369\r\n" + 
				"4371\r\n" + 
				"4389\r\n" + 
				"4392\r\n" + 
				"4372\r\n" + 
				"4382\r\n" + 
				"4383\r\n" + 
				"4384\r\n" + 
				"4381\r\n" + 
				"4390\r\n" + 
				"4391\r\n" + 
				"4394\r\n" + 
				"4416\r\n" + 
				"4430\r\n" + 
				"4398\r\n" + 
				"4403\r\n" + 
				"4394\r\n" + 
				"4383\r\n" + 
				"4399\r\n" + 
				"4387\r\n" + 
				"4418\r\n" + 
				"4431\r\n" + 
				"4434\r\n" + 
				"4417\r\n" + 
				"4418\r\n" + 
				"4417\r\n" + 
				"4420\r\n" + 
				"4430\r\n" + 
				"4426\r\n" + 
				"4429\r\n" + 
				"4430\r\n" + 
				"4429\r\n" + 
				"4430\r\n" + 
				"4440\r\n" + 
				"4449\r\n" + 
				"4450\r\n" + 
				"4434\r\n" + 
				"4452\r\n" + 
				"4444\r\n" + 
				"4446\r\n" + 
				"4439\r\n" + 
				"4440\r\n" + 
				"4414\r\n" + 
				"4407\r\n" + 
				"4408\r\n" + 
				"4410\r\n" + 
				"4411\r\n" + 
				"4420\r\n" + 
				"4445\r\n" + 
				"4454\r\n" + 
				"4455\r\n" + 
				"4451\r\n" + 
				"4456\r\n" + 
				"4455\r\n" + 
				"4449\r\n" + 
				"4470\r\n" + 
				"4469\r\n" + 
				"4473\r\n" + 
				"4470\r\n" + 
				"4488\r\n" + 
				"4470\r\n" + 
				"4466\r\n" + 
				"4463\r\n" + 
				"4477\r\n" + 
				"4481\r\n" + 
				"4494\r\n" + 
				"4493\r\n" + 
				"4491\r\n" + 
				"4486\r\n" + 
				"4475\r\n" + 
				"4479\r\n" + 
				"4484\r\n" + 
				"4485\r\n" + 
				"4497\r\n" + 
				"4472\r\n" + 
				"4473\r\n" + 
				"4490\r\n" + 
				"4499\r\n" + 
				"4507\r\n" + 
				"4515\r\n" + 
				"4521\r\n" + 
				"4554\r\n" + 
				"4555\r\n" + 
				"4538\r\n" + 
				"4526\r\n" + 
				"4539\r\n" + 
				"4543\r\n" + 
				"4537\r\n" + 
				"4541\r\n" + 
				"4543\r\n" + 
				"4527\r\n" + 
				"4538\r\n" + 
				"4537\r\n" + 
				"4536\r\n" + 
				"4550\r\n" + 
				"4554\r\n" + 
				"4567\r\n" + 
				"4585\r\n" + 
				"4603\r\n" + 
				"4623\r\n" + 
				"4624\r\n" + 
				"4626\r\n" + 
				"4629\r\n" + 
				"4627\r\n" + 
				"4629\r\n" + 
				"4628\r\n" + 
				"4636\r\n" + 
				"4640\r\n" + 
				"4647\r\n" + 
				"4649\r\n" + 
				"4651\r\n" + 
				"4655\r\n" + 
				"4626\r\n" + 
				"4631\r\n" + 
				"4632\r\n" + 
				"4630\r\n" + 
				"4622\r\n" + 
				"4625\r\n" + 
				"4632\r\n" + 
				"4652\r\n" + 
				"4657\r\n" + 
				"4661\r\n" + 
				"4650\r\n" + 
				"4654\r\n" + 
				"4656\r\n" + 
				"4658\r\n" + 
				"4659\r\n" + 
				"4676\r\n" + 
				"4675\r\n" + 
				"4681\r\n" + 
				"4694\r\n" + 
				"4714\r\n" + 
				"4723\r\n" + 
				"4706\r\n" + 
				"4707\r\n" + 
				"4741\r\n" + 
				"4743\r\n" + 
				"4718\r\n" + 
				"4714\r\n" + 
				"4715\r\n" + 
				"4697\r\n" + 
				"4699\r\n" + 
				"4698\r\n" + 
				"4696\r\n" + 
				"4703\r\n" + 
				"4702\r\n" + 
				"4704\r\n" + 
				"4709\r\n" + 
				"4726\r\n" + 
				"4725\r\n" + 
				"4743\r\n" + 
				"4747\r\n" + 
				"4765\r\n" + 
				"4766\r\n" + 
				"4768\r\n" + 
				"4764\r\n" + 
				"4768\r\n" + 
				"4770\r\n" + 
				"4777\r\n" + 
				"4778\r\n" + 
				"4779\r\n" + 
				"4786\r\n" + 
				"4804\r\n" + 
				"4806\r\n" + 
				"4790\r\n" + 
				"4797\r\n" + 
				"4808\r\n" + 
				"4809\r\n" + 
				"4806\r\n" + 
				"4808\r\n" + 
				"4818\r\n" + 
				"4822\r\n" + 
				"4823\r\n" + 
				"4854\r\n" + 
				"4855\r\n" + 
				"4885\r\n" + 
				"4902\r\n" + 
				"4903\r\n" + 
				"4905\r\n" + 
				"4906\r\n" + 
				"4908\r\n" + 
				"4907\r\n" + 
				"4909\r\n" + 
				"4915\r\n" + 
				"4916\r\n" + 
				"4906\r\n" + 
				"4935\r\n" + 
				"4949\r\n" + 
				"4948\r\n" + 
				"4952\r\n" + 
				"4964\r\n" + 
				"4960\r\n" + 
				"4962\r\n" + 
				"4975\r\n" + 
				"4976\r\n" + 
				"4987\r\n" + 
				"4996\r\n" + 
				"4994\r\n" + 
				"4996\r\n" + 
				"4997\r\n" + 
				"5000\r\n" + 
				"5001\r\n" + 
				"4986\r\n" + 
				"4988\r\n" + 
				"4999\r\n" + 
				"4997\r\n" + 
				"4998\r\n" + 
				"4997\r\n" + 
				"5004\r\n" + 
				"5005\r\n" + 
				"5006\r\n" + 
				"5004\r\n" + 
				"5005\r\n" + 
				"5018\r\n" + 
				"5019\r\n" + 
				"5021\r\n" + 
				"5022\r\n" + 
				"5028\r\n" + 
				"5057\r\n" + 
				"5058\r\n" + 
				"5063\r\n" + 
				"5067\r\n" + 
				"5068");
		int[] x = new int[3];
		for(int i = 0; i < 3; i++) { x[i] = Integer.parseInt(in.nextLine()); }
		int res = 0;
		while(in.hasNextLine()) {
			int t = Integer.parseInt(in.nextLine());
			if(t+x[2]+x[1]>x[0]+x[1]+x[2]) { res++; }
			x[0]=x[1];
			x[1]=x[2];
			x[2]=t;
		}
		System.out.println(res);
		in.close();
	}
}
