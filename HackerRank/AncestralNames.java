// import java.util.ArrayList;
// import java.util.HashMap;

// public class AncestralNames {

// public static void main(String[] args) {
// ArrayList<String> list = new ArrayList<>();

// list.add("Louis IX");
// list.add("Louis VIII");

// HashMap<String, ArrayList<String>> map = new HashMap<>();
// for (int i = 0; i < list.size(); i++) {
// String[] arrOfStr = list.get(i).split(" ");
// if (map.containsKey(arrOfStr[0])) {
// ArrayList<String> temp = map.get(arrOfStr[0]);
// temp.add(arrOfStr[1]);
// map.put(arrOfStr[0], temp);
// } else {
// ArrayList<String> temp = new ArrayList<>();
// temp.add(arrOfStr[1]);
// map.put(arrOfStr[0], temp);
// }
// }
// System.out.println(map.toString());

// HashMap<String, Integer> romanToInt = new HashMap<>();
// romanToInt.put("I", 1);
// romanToInt.put("V", 5);
// romanToInt.put("X", 10);
// romanToInt.put("L", 50);
// romanToInt.put("C", 100);
// romanToInt.put("D", 500);
// romanToInt.put("M", 1000);
// HashMap<String, ArrayList<Integer>> afterConvertingToInt = new HashMap<>();
// for (String s : map.keySet()) {
// ArrayList<String> names = map.get(s);

// for (int i = 0; i < names.size(); i++) {
// int r = 0;
// int prev = 0;
// String name = names.get(i);
// for (char c : name.toCharArray()) {
// // calculate
// int v = romanToInt.get(c);
// if (v > prev) {
// r -= prev;
// r += v - prev;
// } else {
// r += v;
// }
// prev = v;
// }
// }

// if (afterConvertingToInt.containsKey(s)) {
// ArrayList<Integer> temp = afterConvertingToInt.get(s);
// temp.add(r);
// afterConvertingToInt.put(s, temp);
// } else {
// ArrayList<Integer> temp = new ArrayList<>();
// temp.add(r);
// afterConvertingToInt.put(s, temp);
// }
// }
// System.out.println(afterConvertingToInt.toString());
// }
// }
