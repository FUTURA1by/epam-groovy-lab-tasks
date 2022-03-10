/**
Parse input json, find all entries, and return another json with values where
sum of digits in value field equal to 9.
Example:
Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}") == "{\"Kate\":18,\"Osvald\":27}"`
*/

package groovylab
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class Task08 {
    public static String parseAndFilterJson(String input) {
        def slurper = new JsonSlurper()
        def input_ls = slurper.parseText(input)
        return JsonOutput.toJson(input_ls.findAll {it.value % 9 == 0})
    }
}