import spock.lang.Specification
import spock.lang.Unroll

class OddSpec extends Specification {

    @Unroll
    def "#array #expectedResult"(Integer[] array, Integer expectedResult) {
        given:
        def odd = new Odd(array)
        when:
        def result = odd.invoke()
        then:
        result == expectedResult
        where:
        array    | expectedResult
        []       | null
        [1]      | 1
        [1, 2, 2] | 1
        [1, 2, 1] | 2
        [1, 2, 3, 4, 1, 3, 4] | 2
        //[1, 2, 3, 4] | exception
    }

}
