/**
Find all adults in the input map and return them as map. Example:
Task06.adults([Kate: 24, Alan:16, Osvald: 18]) == [Kate: 24, Osvald: 18]
*/

package groovylab

class Task06 {
    public static Map adults(Map people) {
        def inp_map = [:]
        people.each { key, value ->
            if (value >= 18)
                inp_map.put(key, value)
        }
        return inp_map
    }
}