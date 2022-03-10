/**
Return a list of input elements, where odd numbers are multiplied by 3 and even
numbers by 2. Example:
Task02.mulEvenOdd([4,5,6]) == [8,15,12]
*/

package groovylab

class Task02 {
    public static List mulEvenOdd(List l) {
        def new_l = []
        l.each {
            if (it%2 == 0)
                new_l.add(it*2)
            else
                new_l.add(it*3)
        }
        return new_l
    }
}