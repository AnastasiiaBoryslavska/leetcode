/**
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
*/

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> startPoints = new HashSet<>();
        for (List<String> each: paths)
            startPoints.add(each.get(0));

        for (List<String> each: paths) {
            var destination = each.get(1);
            if (!startPoints.contains(destination)) return destination;
        }

        return null;
    }
}
