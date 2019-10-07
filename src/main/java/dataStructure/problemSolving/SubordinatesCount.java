package dataStructure.problemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SubordinatesCount {

    static HashMap<Character, String> managerAndTeamMember = new HashMap<>();
    static Map<Character, Integer> result = new HashMap<>();
    static int count = 0;

    public static void main(String[] args) {
        Map<Character, Character> hashMap = new HashMap<>();
        //Here key reports to Value
        hashMap.put('C', 'A');
        hashMap.put('B', 'A');
        hashMap.put('D', 'B');
        hashMap.put('E', 'B');
        hashMap.put('F', 'C');
        hashMap.put('G', 'F');
        findtheReporting(hashMap);
    }

    private static void findtheReporting(Map<Character, Character> hashMap) {

        Set<Character> sub = hashMap.keySet();

        for (Character c : sub) {
            Character manager = hashMap.get(c);
            if (managerAndTeamMember.containsKey(manager)) {
                String value = managerAndTeamMember.get(manager);
                value = value + c;
                managerAndTeamMember.put(manager, value);
            } else {
                managerAndTeamMember.put(manager, c.toString());
            }

        }

        Set<Character> managers = managerAndTeamMember.keySet();

        for (Character c : managers) {
            Count count = new Count();
            count.value = 0;
            String teamMembers = managerAndTeamMember.get(c);
            countTeamMembers(teamMembers, count);

            if (result.containsKey(c))
                continue;

            result.put(c, count.value);
        }
        System.out.println(result);
    }

    private static void countTeamMembers(String teammembers, Count count) {
        char[] members = teammembers.toCharArray();

        for (int i = 0; i < members.length; i++) {

            if (result.containsKey(members[i]))
                continue;

            count.value += 1;
            int currentCount = count.value;
            String mbrs = managerAndTeamMember.get(members[i]);
            if (mbrs != null) {
                countTeamMembers(mbrs, count);
            }
            currentCount = count.value - currentCount;
            result.put(members[i], currentCount);
        }

    }

    static class Count {
        int value;
    }

}
