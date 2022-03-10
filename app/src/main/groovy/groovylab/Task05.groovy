/**
Define, whether input string have a Ip format. Example:
Task05.isSublist("10.0.152.164") == true
*/

package groovylab

package groovylab

class Task05 {
    public static boolean isIp(String ip) {
        if (ip ==~ "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)")
            return true
        else
            return false
    }
}