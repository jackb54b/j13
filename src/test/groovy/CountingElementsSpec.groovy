import spock.lang.Specification
import spock.lang.Unroll

class CountingElementsSpec extends Specification {

    @Unroll
    def "#array #expectedResult"(int[] array, int value, int expectedResult) {
        given:
        def countingElements = new CountingElements(array, value)
        when:
        def result = countingElements.invoke()
        then:
        result == expectedResult
        where:
        array  | value  | expectedResult
        []     | 0      | -1
        [1]    | 1      | 0
        [1, 2, 2] | 2   | 1
        [1, 2, 1] | 2   | 1
        [1, 2, 3, 2, 1, 3, 4] |4| 6
        [4, 4, 3, 2, 1, 3, 4,5,88,333] |2| 4
    }
}
