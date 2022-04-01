class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        String[] data = s.split(":");
        Character stc = data[0].substring(0,1).charAt(0);
        int g1 = Integer.parseInt(data[0].substring(data[0].length()-1));
        int g = Integer.parseInt(data[1].substring(data[1].length()-1));
        Character etc = data[1].substring(0,1).charAt(0);
        for(Character c = stc;c<=etc;c++){
            for(int h=g1;h<=g;h++){
                System.out.println(c + "" + h);
                res.add(c+""+h);
            }
        }
        return res;
    }
}